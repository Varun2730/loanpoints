package com.nexa.loanpoints.service;


import com.nexa.loanpoints.dto.LoanPointRequest;
import com.nexa.loanpoints.dto.LoanPointResponse;
import com.nexa.loanpoints.entity.LoanPoint;
import com.nexa.loanpoints.exception.ResourceNotFoundException;
import com.nexa.loanpoints.repository.LoanPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LoanPointService {

    @Autowired
    private LoanPointRepository repository;

    public List<LoanPointResponse> getAllLoanPoints() {
        return repository.findAll().stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public LoanPointResponse getLoanPointById(UUID id) {
        LoanPoint loanPoint = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Loan Point not found with id: " + id));
        return mapToResponse(loanPoint);
    }

    public LoanPointResponse createLoanPoint(LoanPointRequest request) {
        LoanPoint loanPoint = new LoanPoint();
        loanPoint.setLoanTypeId(request.getLoanTypeId());
        loanPoint.setMaxLoanAmount(request.getMaxLoanAmount());
        loanPoint.setPercentageOnLoanApproval(request.getPercentageOnLoanApproval());
        loanPoint.setMinCreditScore(request.getMinCreditScore());
        loanPoint.setMaxCreditScore(request.getMaxCreditScore());

        LoanPoint saved = repository.save(loanPoint);
        return mapToResponse(saved);
    }

    public LoanPointResponse updateLoanPoint(UUID id, LoanPointRequest request) {
        LoanPoint loanPoint = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Loan Point not found with id: " + id));

        loanPoint.setMaxLoanAmount(request.getMaxLoanAmount());
        loanPoint.setPercentageOnLoanApproval(request.getPercentageOnLoanApproval());
        loanPoint.setMinCreditScore(request.getMinCreditScore());
        loanPoint.setMaxCreditScore(request.getMaxCreditScore());

        LoanPoint updated = repository.save(loanPoint);
        return mapToResponse(updated);
    }

    public void deleteLoanPoint(UUID id) {
        LoanPoint loanPoint = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Loan Point not found with id: " + id));
        repository.delete(loanPoint);
    }

    private LoanPointResponse mapToResponse(LoanPoint entity) {
        LoanPointResponse resp = new LoanPointResponse();
        resp.setLoanPointId(entity.getLoanPointId());
        resp.setLoanTypeId(entity.getLoanTypeId());
        resp.setMaxLoanAmount(entity.getMaxLoanAmount());
        resp.setPercentageOnLoanApproval(entity.getPercentageOnLoanApproval());
        resp.setMinCreditScore(entity.getMinCreditScore());
        resp.setMaxCreditScore(entity.getMaxCreditScore());
        return resp;
    }
}
