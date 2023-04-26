package com.lic.epgs.commission.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.service.CommissionService;

@RestController
public class CommissionController {

	@Autowired
	private CommissionService commissionService;
	
	@GetMapping(value = "/commission/find")
	public Optional<CommissionEntity> findByCommissionId(@RequestParam Long commissionId) {
		return commissionService.findByCommissionId(commissionId);
	}
	
	@PostMapping(value = "/commission/updateStatus")
	public void updateCommissionStatus(@RequestParam Long commissionId, @RequestParam String status) {
		commissionService.updateCommissionStatus(commissionId, status);
	}
	
	@PostMapping(value = "/commission/addNotes")
	public void addCommissionNotes(@RequestParam Long commissionId, @RequestParam String notes) {
		commissionService.addCommissionNotes(commissionId, notes);
	}
	
	@PostMapping(value = "/commission/addQuestionDetails")
	public void addCommissionQuestionDetails(@RequestParam Long commissionId, @RequestParam String details) {
		commissionService.addCommissionQuestionDetails(commissionId, details);
	}
	
	@PostMapping(value = "/commission/handleConstraintViolation")
	public void handleConstraintViolation(@RequestParam Long commissionId) {
		commissionService.handleConstraintViolation(commissionId);
	}
	
	@PostMapping(value = "/commission/handlePersistenceException")
	public void handlePersistenceException(@RequestParam Long commissionId) {
		commissionService.handlePersistenceException(commissionId);
	}
}