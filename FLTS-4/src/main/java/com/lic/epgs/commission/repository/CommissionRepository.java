package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.model.Commission;

public interface CommissionRepository extends JpaRepository<Commission, Long> {

    public Commission findByCommissionId(Long commissionId);

    public void save(Commission commission);

    public void update(Commission commission);

    public void addCommissionDetails(Commission commission);

    public void addCommissionNotesAndQuestions(Commission commission);

    public String getTransactionMessage();

    public String getTransactionStatus();
}