package com.nexa.loanpoints.dto;



//import lombok.Data;
import java.util.UUID;

//@Data
public class LoanPointResponse {
    private UUID loanPointId;
    private UUID loanTypeId;
    private Double maxLoanAmount;
    private Double percentageOnLoanApproval;

    public UUID getLoanPointId() {
        return loanPointId;
    }

    public void setLoanPointId(UUID loanPointId) {
        this.loanPointId = loanPointId;
    }

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

    private Integer minCreditScore;
    private Integer maxCreditScore;
}
