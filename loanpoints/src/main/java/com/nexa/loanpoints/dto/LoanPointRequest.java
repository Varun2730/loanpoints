package com.nexa.loanpoints.dto;




import java.util.UUID;


public class LoanPointRequest {
    public UUID getLoanTypeId() {
        return loanTypeId;
    }

    public void setLoanTypeId(UUID loanTypeId) {
        this.loanTypeId = loanTypeId;
    }

    public Double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    public void setMaxLoanAmount(Double maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    public Double getPercentageOnLoanApproval() {
        return percentageOnLoanApproval;
    }

    public void setPercentageOnLoanApproval(Double percentageOnLoanApproval) {
        this.percentageOnLoanApproval = percentageOnLoanApproval;
    }

    public Integer getMinCreditScore() {
        return minCreditScore;
    }

    public void setMinCreditScore(Integer minCreditScore) {
        this.minCreditScore = minCreditScore;
    }

    public Integer getMaxCreditScore() {
        return maxCreditScore;
    }

    public void setMaxCreditScore(Integer maxCreditScore) {
        this.maxCreditScore = maxCreditScore;
    }

    private UUID loanTypeId;
    private Double maxLoanAmount;
    private Double percentageOnLoanApproval;
    private Integer minCreditScore;
    private Integer maxCreditScore;
}
