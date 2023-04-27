package com.lic.epgs.commission.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commission")
public class Commission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commission_id")
    private Long commissionId;

    @Column(name = "commission_details")
    private List<String> commissionDetails;

    @Column(name = "commission_notes")
    private List<String> commissionNotes;

    @Column(name = "commission_questions")
    private List<String> commissionQuestions;

    @Column(name = "transaction_message")
    private String transactionMessage;

    @Column(name = "transaction_status")
    private String transactionStatus;

    public Long getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Long commissionId) {
        this.commissionId = commissionId;
    }

    public List<String> getCommissionDetails() {
        return commissionDetails;
    }

    public void setCommissionDetails(List<String> commissionDetails) {
        this.commissionDetails = commissionDetails;
    }

    public List<String> getCommissionNotes() {
        return commissionNotes;
    }

    public void setCommissionNotes(List<String> commissionNotes) {
        this.commissionNotes = commissionNotes;
    }

    public List<String> getCommissionQuestions() {
        return commissionQuestions;
    }

    public void setCommissionQuestions(List<String> commissionQuestions) {
        this.commissionQuestions = commissionQuestions;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

}