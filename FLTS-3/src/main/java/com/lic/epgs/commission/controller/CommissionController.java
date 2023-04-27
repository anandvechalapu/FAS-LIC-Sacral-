package com.lic.epgs.commission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionNotesEntity;
import com.lic.epgs.commission.entity.CommissionNotesTempEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {
	
	@Autowired
	private CommissionService commissionService;

	@GetMapping("/getCommissionTemp")
	public ResponseEntity<CommissionTempEntity> getCommissionTemp(@RequestParam Long commissionId, @RequestParam Boolean isActive) {
		return ResponseEntity.ok(commissionService.getCommissionTemp(commissionId, isActive));
	}
	
	@PutMapping("/updateCommissionTemp")
	public ResponseEntity<CommissionTempEntity> updateCommissionTemp(@RequestBody CommissionTempEntity commissionTempEntity) {
		return ResponseEntity.ok(commissionService.updateCommissionTemp(commissionTempEntity));
	}
	
	@GetMapping("/getCommissionQuestionDetailsTemp")
	public ResponseEntity<List<CommissionQuestionDetailsTempEntity>> getCommissionQuestionDetailsTemp(@RequestParam Long commissionId, @RequestParam Boolean isActive) {
		return ResponseEntity.ok(commissionService.getCommissionQuestionDetailsTemp(commissionId, isActive));
	}
	
	@PutMapping("/saveCommissionQuestionDetailsTemp")
	public ResponseEntity<List<CommissionQuestionDetailsTempEntity>> saveCommissionQuestionDetailsTemp(@RequestBody List<CommissionQuestionDetailsTempEntity> commissionQuestionDetailsTempEntityList) {
		return ResponseEntity.ok(commissionService.saveCommissionQuestionDetailsTemp(commissionQuestionDetailsTempEntityList));
	}
	
	@GetMapping("/getCommissionNotesTemp")
	public ResponseEntity<List<CommissionNotesTempEntity>> getCommissionNotesTemp(@RequestParam Long commissionId, @RequestParam Boolean isActive) {
		return ResponseEntity.ok(commissionService.getCommissionNotesTemp(commissionId, isActive));
	}
	
	@PutMapping("/saveCommissionNotesTemp")
	public ResponseEntity<List<CommissionNotesTempEntity>> saveCommissionNotesTemp(@RequestBody List<CommissionNotesTempEntity> commissionNotesTempEntityList) {
		return ResponseEntity.ok(commissionService.saveCommissionNotesTemp(commissionNotesTempEntityList));
	}
	

}