/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Anon
 */
public class LoanApproval {

    private int loanID;
    private int userID;
    private String loanType;
    private double loanAmount;
    private double interestRate;
    private int loanTerm;
    private int loanStatus;

    public LoanApproval(int loanID, int userID, String loanType, double loanAmount, double interestRate, int loanTerm, int loanStatus) {
        this.loanID = loanID;
        this.userID = userID;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.loanStatus = loanStatus;
    }

    public LoanApproval(String loanType, double loanAmount, double interestRate, int loanTerm, int loanStatus) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.loanStatus = loanStatus;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    
    

    public int getLoanID() {
        return loanID;
    }

    public int getUserID() {
        return userID;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public int getLoanStatus() {
        return loanStatus;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public void setLoanStatus(int loanStatus) {
        this.loanStatus = loanStatus;
    }
    

}
