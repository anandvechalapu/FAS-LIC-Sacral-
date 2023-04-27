package com.lic.epgs.commission.controller;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.service.LoadQuestionMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commission/question")
public class LoadQuestionMasterController {

    @Autowired
    private LoadQuestionMasterService loadQuestionMasterService;

    @GetMapping("/load")
    public List<CommonCommissionDto> getLoadQuestionMaster(){
        return loadQuestionMasterService.getLoadQuestionMaster();
    }
}