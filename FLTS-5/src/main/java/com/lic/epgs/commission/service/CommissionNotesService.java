package com.lic.epgs.commission.service;

import java.util.List;
import java.util.Optional;

import com.lic.epgs.commission.model.CommissionNotes;
import com.lic.epgs.commission.repository.CommissionNotesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommissionNotesService {

    @Autowired
    private CommissionNotesRepository commissionNotesRepository;

    public List<CommissionNotes> findByCommissionId(int commissionId) {
        return commissionNotesRepository.findByCommissionId(commissionId);
    }

    public List<CommissionNotes> findAllByCommissionId(int commissionId) {
        return commissionNotesRepository.findAllByCommissionId(commissionId);
    }

    public boolean existsByCommissionId(int commissionId) {
        return commissionNotesRepository.existsByCommissionId(commissionId);
    }

    public Optional<CommissionNotes> findByIdAndCommissionId(int id, int commissionId) {
        return commissionNotesRepository.findByIdAndCommissionId(id, commissionId);
    }

    public void deleteByIdAndCommissionId(int id, int commissionId) {
        commissionNotesRepository.deleteByIdAndCommissionId(id, commissionId);
    }

    public void deleteAllByCommissionId(int commissionId) {
        commissionNotesRepository.deleteAllByCommissionId(commissionId);
    }

}