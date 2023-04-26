package com.lic.epgs.commission.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionDetailsDto;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public CommonCommissionDto loadCommissionDetails() {
        return commissionRepository.loadCommissionDetails();
    }

}