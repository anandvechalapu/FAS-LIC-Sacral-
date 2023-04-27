package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionNotesEntity;
import com.lic.epgs.commission.entity.CommissionNotesTempEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsEntity;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;

@Repository
public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {

    //method to retrieve CommissionTempEntity from repository for the given commissionId
    public CommissionTempEntity findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);

    //method to update the CommissionTempEntity status to reject and set the modifiedBy and modifiedOn fields accordingly
    public CommissionTempEntity saveAndFlush(CommissionTempEntity commissionTempEntity);

    //method to retrieve the CommissionQuestionDetailsTempEntity list from the repository for the given commissionId
    public List<CommissionQuestionDetailsTempEntity> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);

    //method to save the updated CommissionQuestionDetailsTempEntity list in the repository
    public List<CommissionQuestionDetailsTempEntity> saveAll(List<CommissionQuestionDetailsTempEntity> commissionQuestionDetailsTempEntityList);

    //method to retrieve the CommissionNotesTempEntity list from the repository for the given commissionId
    public List<CommissionNotesTempEntity> findByCommissionIdAndIsActive(Long commissionId, Boolean isActive);

    //method to save the updated CommissionNotesTempEntity list in the repository
    public List<CommissionNotesTempEntity> saveAll(List<CommissionNotesTempEntity> commissionNotesTempEntityList);

}