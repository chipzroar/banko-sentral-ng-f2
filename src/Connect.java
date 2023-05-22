

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connect {

    Connection conn = null;

    public Connect() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbonlinebankingsystem", "root", "");
            //JOptionPane.showMessageDialog(null, "Connected");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User getUserDetails(int userID) {
    User user = null;
    try {
        String sql = "SELECT firstname, middlename, lastname, email, phone, address FROM user WHERE userID='" + userID + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {
            String fullName = rs.getString("firstname") + " " + rs.getString("middlename") + " " + rs.getString("lastname");
            String email = rs.getString("email");
            String phoneNumber = rs.getString("phone");
            String address = rs.getString("address");
            user = new User(fullName, email, phoneNumber, address);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
    return user;
}

    

   public boolean loanApply(LoanApplication loan, int userID) {
    try {
        String sql = "SELECT COUNT(*) FROM loanapplication WHERE userID='" + userID + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next() && rs.getInt(1) < 2) {
            sql = "INSERT INTO loanapplication (userID, loanType, interestRate, paymentDueDate, paymentAmount, loanApproval) VALUES ('" +
            userID + "', '" +
            loan.getLoanType() + "', '" +
            loan.getInterestRate() + "', '" +
            loan.getPaymentDueDate() + "', '" +
            loan.getPaymentAmount() + "', '" +
            loan.getLoanApproval() + "')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Loan application submitted");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "You have already applied for two loans");
            return false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error submitting loan application");
        return false;
    }
   }
    
    public boolean loanApproval(LoanApproval la, int userID, String loanType) {
    try {
        String sql = "SELECT * FROM loanapplication WHERE userID='" + userID + "'" + "AND loanType = '" + loanType + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        int loanID = rs.getInt("loanID");
        sql = "SELECT COUNT(*) FROM loanapproval WHERE userID='" + userID + "'";
        
        rs = stmt.executeQuery(sql);
        if (rs.next() && rs.getInt(1) < 2) {
            sql = "INSERT INTO loanapproval (loanID, userID, loanType, loanAmount, interestRate, loanTerm, loanStatus) VALUES (" +
            loanID + ", '" +
            userID + "', '" +
            la.getLoanType() + "', " +
            la.getLoanAmount() + ", " +
            la.getInterestRate() + ", " +
            la.getLoanTerm() + ", '" +
            la.getLoanStatus() + "')";

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Loan approval process started");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "You have already applied for two loan approvals");
            return false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Error starting loan approval process");
        return false;
    }
}
    
    public ArrayList<LoanApproval> displayLoans(){
    ArrayList<LoanApproval> loans = new ArrayList<>();
    String sql = "SELECT * FROM loanapproval";
    Statement stmt;
    ResultSet rs;
    
    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while(rs.next()){
                String loanType = rs.getString("loanType");
    System.out.println("Loan Type: " + loanType); // Debug line
            LoanApproval la = new LoanApproval(
                rs.getInt("loanID"),
                rs.getInt("userID"),
                rs.getString("loanType"),
                rs.getDouble("loanAmount"),
                rs.getDouble("interestRate"),
                rs.getInt("loanTerm"),
                rs.getInt("loanStatus")
            );
            loans.add(la);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return loans;
}

    public boolean changeLoanStatus(int loanID, int newStatus) {
    Statement stmt = null;
    try {
        stmt = conn.createStatement();
        String sql = "UPDATE loanapplication SET loanApproval = " + newStatus + " WHERE loanID = " + loanID;
        stmt.executeUpdate(sql);

        // Remove from loanapproval table
        sql = "DELETE FROM loanapproval WHERE loanID = " + loanID;
        stmt.executeUpdate(sql);
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}

    public ArrayList<LoanApplication> displayLoansApply(int userID){
    ArrayList<LoanApplication> applications = new ArrayList<>();
    String sql = "SELECT * FROM loanapplication WHERE userID=" + userID;
    Statement stmt;
    ResultSet rs;

    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        while(rs.next()){
            LoanApplication la = new LoanApplication(
                rs.getInt("loanID"),
                rs.getString("loanType"),
                rs.getDouble("interestRate"),
                rs.getDate("paymentDueDate").toLocalDate(),
                rs.getDouble("paymentAmount"),
                rs.getInt("loanApproval")
            );
            applications.add(la);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return applications;
}


}



