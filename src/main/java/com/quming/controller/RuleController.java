package com.quming.controller;

import com.quming.entity.CreditCardApplyInfo;
import com.quming.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creditCradApply")
public class RuleController {
    @Autowired
    private RuleService ruleService;

    @RequestMapping("/test")
    public CreditCardApplyInfo creditCardApply(){
        CreditCardApplyInfo creditCardApplyInfo = new CreditCardApplyInfo();
        creditCardApplyInfo.setEducation("专科以下");
        creditCardApplyInfo.setHasHouse(false);
        creditCardApplyInfo.setHasCar(false);
        creditCardApplyInfo.setMonthlyIncome(3500);
        CreditCardApplyInfo creditCardApplyResult = ruleService.creditCardApply(creditCardApplyInfo);
        return creditCardApplyResult;
    }
}
