package com.lic.epgs.commission.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMMISSION_DETAILS")
public class CommissionDetailsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMMISSION_ID")
    private Long commissionId;

    @Column(name = "COMMISSION_NAME")
    private String commissionName;

    @Column(name = "COMMISSION_AMOUNT")
    private int commissionAmount;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    public Long getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }

    public String getCommissionName() {
        return commissionName;
    }

    public void setCommissionName(String commissionName) {
        this.commissionName = commissionName;
    }

    public int getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(int commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}