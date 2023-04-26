package com.lic.epgs.commission.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.service.CommissionService;

@RestController
public class CommissionController {

    private static Logger logger = LoggerFactory.getLogger(CommissionController.class);

    @Autowired
    private CommissionService commissionService;

    @GetMapping("/getCommissionDetails")
    public CommonCommissionDto getCommissionDetails() {
        return commissionService.loadCommissionDetails();
    }
}