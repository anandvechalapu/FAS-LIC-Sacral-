package com.lic.epgs.commission.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.model.Commission;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public Commission findByCommissionId(Long commissionId) {
        return commissionRepository.findByCommissionId(commissionId);
    }

    public void save(Commission commission) {
        commissionRepository.save(commission);
    }

    public void update(Commission commission) {
        commissionRepository.update(commission);
    }

    public void addCommissionDetails(Commission commission) {
        commissionRepository.addCommissionDetails(commission);
    }

    public void addCommissionNotesAndQuestions(Commission commission) {
        commissionRepository.addCommissionNotesAndQuestions(commission);
    }

    public String getTransactionMessage() {
        return commissionRepository.getTransactionMessage();
    }

    public String getTransactionStatus() {
        return commissionRepository.getTransactionStatus();
    }

    public List<Commission> getAllCommissions() {
        return commissionRepository.findAll();
    }
}