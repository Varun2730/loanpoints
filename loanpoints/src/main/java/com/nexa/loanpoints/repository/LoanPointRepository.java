package com.nexa.loanpoints.repository;



import com.nexa.loanpoints.entity.LoanPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LoanPointRepository extends JpaRepository<LoanPoint, UUID> {
}
