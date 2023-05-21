

import java.time.LocalDate;

public class LoanApplication {
    
    private int loanID;
    private int userID;
    private String loanType;
    private double interestRate;
    private LocalDate paymentDueDate;
    private double paymentAmount;
    private int loanApproval;
    
    public LoanApplication(int loanID, int userID, String loanType, double interestRate, LocalDate paymentDueDate, double paymentAmount, int loanApproval) {
        this.loanID = loanID;
        this.userID = userID;
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.paymentDueDate = paymentDueDate;
        this.paymentAmount = paymentAmount;
        this.loanApproval = loanApproval;
    }

    public LoanApplication(String loanType, double interestRate, LocalDate paymentDueDate, double paymentAmount, int loanApproval) {
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.paymentDueDate = paymentDueDate;
        this.paymentAmount = paymentAmount;
        this.loanApproval = loanApproval;
    }

    public LoanApplication(int loanID, String loanType, double interestRate, LocalDate paymentDueDate, double paymentAmount, int loanApproval) {
        this.loanID = loanID;
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.paymentDueDate = paymentDueDate;
        this.paymentAmount = paymentAmount;
        this.loanApproval = loanApproval;
    }
    
    

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanType() {
        return loanType;
    }

    public int getLoanID() {
        return loanID;
    }

    public int getUserID() {
        return userID;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public LocalDate getPaymentDueDate() {
        return paymentDueDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public int getLoanApproval() {
        return loanApproval;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setPaymentDueDate(LocalDate paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setLoanApproval(int loanApproval) {
        this.loanApproval = loanApproval;
    }
    
  
    

}
