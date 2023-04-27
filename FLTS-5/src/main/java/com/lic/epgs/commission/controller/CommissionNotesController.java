package com.lic.epgs.commission.controller;

import java.util.List;
import java.util.Optional;

import com.lic.epgs.commission.model.CommissionNotes;
import com.lic.epgs.commission.service.CommissionNotesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commission-notes")
public class CommissionNotesController {

    @Autowired
    private CommissionNotesService commissionNotesService;

    @GetMapping("/commission/{commissionId}")
    public List<CommissionNotes> findByCommissionId(@PathVariable int commissionId) {
        return commissionNotesService.findByCommissionId(commissionId);
    }

    @GetMapping("/commission/all/{commissionId}")
    public List<CommissionNotes> findAllByCommissionId(@PathVariable int commissionId) {
        return commissionNotesService.findAllByCommissionId(commissionId);
    }

    @GetMapping("/commission/exists/{commissionId}")
    public boolean existsByCommissionId(@PathVariable int commissionId) {
        return commissionNotesService.existsByCommissionId(commissionId);
    }

    @GetMapping("/commission/{id}/{commissionId}")
    public Optional<CommissionNotes> findByIdAndCommissionId(@PathVariable int id, @PathVariable int commissionId) {
        return commissionNotesService.findByIdAndCommissionId(id, commissionId);
    }

    @DeleteMapping("/commission/{id}/{commissionId}")
    public void deleteByIdAndCommissionId(@PathVariable int id, @PathVariable int commissionId) {
        commissionNotesService.deleteByIdAndCommissionId(id, commissionId);
    }

    @DeleteMapping("/commission/all/{commissionId}")
    public void deleteAllByCommissionId(@PathVariable int commissionId) {
        commissionNotesService.deleteAllByCommissionId(commissionId);
    }

}