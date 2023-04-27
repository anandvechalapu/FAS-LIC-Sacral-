package com.lic.epgs.commission.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionNotesEntity;
import com.lic.epgs.commission.entity.CommissionNotesTempEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public CommissionTempEntity getCommissionTemp(Long commissionId, Boolean isActive){
        return commissionRepository.findByCommissionIdAndIsActive(commissionId, isActive);
    }

    public CommissionTempEntity updateCommissionTemp(CommissionTempEntity commissionTempEntity){
        return commissionRepository.saveAndFlush(commissionTempEntity);
    }

    public List<CommissionQuestionDetailsTempEntity> getCommissionQuestionDetailsTemp(Long commissionId, Boolean isActive){
        return commissionRepository.findByCommissionIdAndIsActive(commissionId, isActive);
    }

    public List<CommissionQuestionDetailsTempEntity> saveCommissionQuestionDetailsTemp(List<CommissionQuestionDetailsTempEntity> commissionQuestionDetailsTempEntityList){
        return commissionRepository.saveAll(commissionQuestionDetailsTempEntityList);
    }

    public List<CommissionNotesTempEntity> getCommissionNotesTemp(Long commissionId, Boolean isActive){
        return commissionRepository.findByCommissionIdAndIsActive(commissionId, isActive);
    }

    public List<CommissionNotesTempEntity> saveCommissionNotesTemp(List<CommissionNotesTempEntity> commissionNotesTempEntityList){
        return commissionRepository.saveAll(commissionNotesTempEntityList);
    }

}