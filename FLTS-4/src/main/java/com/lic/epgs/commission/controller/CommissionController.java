package com.lic.epgs.commission.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.model.Commission;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @GetMapping("/{commissionId}")
    public ResponseEntity<Commission> findByCommissionId(@PathVariable Long commissionId) {
        Commission commission = commissionService.findByCommissionId(commissionId);
        return new ResponseEntity<>(commission, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Commission> save(@RequestBody Commission commission) {
        commissionService.save(commission);
        return new ResponseEntity<>(commission, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Commission> update(@RequestBody Commission commission) {
        commissionService.update(commission);
        return new ResponseEntity<>(commission, HttpStatus.OK);
    }

    @PostMapping("/details")
    public ResponseEntity<Commission> addCommissionDetails(@RequestBody Commission commission) {
        commissionService.addCommissionDetails(commission);
        return new ResponseEntity<>(commission, HttpStatus.OK);
    }

    @PostMapping("/notes")
    public ResponseEntity<Commission> addCommissionNotesAndQuestions(@RequestBody Commission commission) {
        commissionService.addCommissionNotesAndQuestions(commission);
        return new ResponseEntity<>(commission, HttpStatus.OK);
    }

    @GetMapping("/message")
    public ResponseEntity<String> getTransactionMessage() {
        String message = commissionService.getTransactionMessage();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/status")
    public ResponseEntity<String> getTransactionStatus() {
        String status = commissionService.getTransactionStatus();
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Commission>> getAllCommissions() {
        List<Commission> commissions = commissionService.getAllCommissions();
        return new ResponseEntity<>(commissions, HttpStatus.OK);
    }
}