package com.lic.epgs.commission.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {
	
	private CommissionRepository commissionRepository;
	
	public CommissionService(CommissionRepository commissionRepository) {
		this.commissionRepository = commissionRepository;
	}
	
	public Optional<CommissionEntity> findByCommissionId(Long commissionId) {
		return commissionRepository.findByCommissionId(commissionId);
	}
	
	public void updateCommissionStatus(Long commissionId, String status) {
		commissionRepository.updateCommissionStatus(commissionId, status);
	}
	
	public void addCommissionNotes(Long commissionId, String notes) {
		commissionRepository.addCommissionNotes(commissionId, notes);
	}
	
	public void addCommissionQuestionDetails(Long commissionId, String details) {
		commissionRepository.addCommissionQuestionDetails(commissionId, details);
	}
	
	public void handleConstraintViolation(Long commissionId) {
		commissionRepository.handleConstraintViolation(commissionId);
	}
	
	public void handlePersistenceException(Long commissionId) {
		commissionRepository.handlePersistenceException(commissionId);
	}
}