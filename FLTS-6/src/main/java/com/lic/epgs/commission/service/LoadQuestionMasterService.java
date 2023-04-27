package com.lic.epgs.commission.service;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.repository.LoadQuestionMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadQuestionMasterService {

    @Autowired
    private LoadQuestionMasterRepository loadQuestionMasterRepository;

    public List<CommonCommissionDto> getLoadQuestionMaster(){
        return loadQuestionMasterRepository.loadQuestionMaster();
    }
}