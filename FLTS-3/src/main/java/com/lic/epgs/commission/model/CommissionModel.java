package com.lic.epgs.commission.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CommissionModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private Long commissionId;
    
    @Column
    private Boolean isActive;
    
    @OneToMany(mappedBy = "commissionModel")
    private List<CommissionQuestionDetailsEntity> commissionQuestionDetails;
    
    @OneToMany(mappedBy = "commissionModel")
    private List<CommissionNotesEntity> commissionNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public List<CommissionQuestionDetailsEntity> getCommissionQuestionDetails() {
        return commissionQuestionDetails;
    }

    public void setCommissionQuestionDetails(List<CommissionQuestionDetailsEntity> commissionQuestionDetails) {
        this.commissionQuestionDetails = commissionQuestionDetails;
    }

    public List<CommissionNotesEntity> getCommissionNotes() {
        return commissionNotes;
    }

    public void setCommissionNotes(List<CommissionNotesEntity> commissionNotes) {
        this.commissionNotes = commissionNotes;
    } 
}