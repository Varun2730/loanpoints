package com.nexa.loanpoints.controller;

//package com.nexa.loanpoints.controller;

import com.nexa.loanpoints.dto.LoanPointRequest;
import com.nexa.loanpoints.dto.LoanPointResponse;
import com.nexa.loanpoints.service.LoanPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/loanpoints")
public class LoanPointController {

    @Autowired
    private LoanPointService service;

    @GetMapping
    public ResponseEntity<List<LoanPointResponse>> getAllLoanPoints() {
        return ResponseEntity.ok(service.getAllLoanPoints());
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoanPointResponse> getLoanPointById(@PathVariable UUID id) {
        return ResponseEntity.ok(service.getLoanPointById(id));
    }

    @PostMapping
    public ResponseEntity<LoanPointResponse> createLoanPoint(@RequestBody LoanPointRequest request) {
        return ResponseEntity.ok(service.createLoanPoint(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<LoanPointResponse> updateLoanPoint(@PathVariable UUID id,
                                                             @RequestBody LoanPointRequest request) {
        return ResponseEntity.ok(service.updateLoanPoint(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLoanPoint(@PathVariable UUID id) {
        service.deleteLoanPoint(id);
        return ResponseEntity.noContent().build();
    }
}
