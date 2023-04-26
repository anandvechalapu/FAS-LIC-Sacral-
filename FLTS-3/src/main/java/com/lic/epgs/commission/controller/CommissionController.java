package com.lic.epgs.commission.controller;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionNotesEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.entity.temp.CommissionNotesTempEntity;
import com.lic.epgs.commission.entity.temp.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.entity.temp.CommissionTempEntity;
import com.lic.epgs.commission.repository.CommissionNotesRepository;
import com.lic.epgs.commission.repository.CommissionNotesTempRepository;
import com.lic.epgs.commission.repository.CommissionQuestionDetailsRepository;
import com.lic.epgs.commission.repository.CommissionQuestionDetailsTempRepository;
import com.lic.epgs.commission.repository.CommissionRepository;
import com.lic.epgs.commission.repository.CommissionTempRepository;
import com.lic.epgs.commission.service.CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @PostMapping("/saveCommission")
    public CommissionEntity saveCommission(@RequestBody CommissionEntity commissionEntity) {
        return commissionService.saveCommission(commissionEntity);
    }

    @GetMapping("/findByCommissionId/{commissionId}")
    public CommissionEntity findByCommissionId(@PathVariable("commissionId") Long commissionId) {
        return commissionService.findByCommissionId(commissionId);
    }

    @PostMapping("/saveAllQuestionDetails")
    public List<CommissionQuestionDetailsEntity> saveAllQuestionDetails(@RequestBody List<CommissionQuestionDetailsEntity> commissionQuestionDetailsEntities) {
        return commissionService.saveAllQuestionDetails(commissionQuestionDetailsEntities);
    }

    @GetMapping("/findAllQuestionDetailsByCommissionIdAndIsActive/{commissionId}/{isActive}")
    public List<CommissionQuestionDetailsEntity> findAllQuestionDetailsByCommissionIdAndIsActive(@PathVariable("commissionId") Long commissionId,
                                                                                                @PathVariable("isActive") boolean isActive) {
        return commissionService.findAllQuestionDetailsByCommissionIdAndIsActive(commissionId, isActive);
    }

    @PostMapping("/saveAllNotes")
    public List<CommissionNotesEntity> saveAllNotes(@RequestBody List<CommissionNotesEntity> commissionNotesEntities) {
        return commissionService.saveAllNotes(commissionNotesEntities);
    }

    @GetMapping("/findAllNotesByCommissionIdAndIsActive/{commissionId}/{isActive}")
    public List<CommissionNotesEntity> findAllNotesByCommissionIdAndIsActive(@PathVariable("commissionId") Long commissionId,
                                                                            @PathVariable("isActive") boolean isActive) {
        return commissionService.findAllNotesByCommissionIdAndIsActive(commissionId, isActive);
    }

    @GetMapping("/findTempCommissionByCommissionIdAndIsActive/{commissionId}/{isActive}")
    public CommissionTempEntity findTempCommissionByCommissionIdAndIsActive(@PathVariable("commissionId") Long commissionId,
                                                                           @PathVariable("isActive") boolean isActive) {
        return commissionService.findTempCommissionByCommissionIdAndIsActive(commissionId, isActive);
    }

    @GetMapping("/findAllTempCommissionsByCommissionIdAndIsActive/{commissionId}/{isActive}")
    public List<CommissionTempEntity> findAllTempCommissionsByCommissionIdAndIsActive(@PathVariable("commissionId") Long commissionId,
                                                                                     @PathVariable("isActive") boolean isActive) {
        return commissionService.findAllTempCommissionsByCommissionIdAndIsActive(commissionId, isActive);
    }

    @Put