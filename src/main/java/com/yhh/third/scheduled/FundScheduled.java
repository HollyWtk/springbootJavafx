package com.yhh.third.scheduled;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yhh.controller.FundController;
import com.yhh.entity.Fund;
import com.yhh.service.IFundService;
import com.yhh.third.serivce.FundDataService;

/**  
 * <p>Description: </p>  
 * @author yhh  
 * @date 2020年6月28日  
 */
@Configuration
@EnableScheduling 
public class FundScheduled {

    @Autowired
    private IFundService fundService;
    
    @Autowired
    private FundController fundController;
    
    @Scheduled(cron = "0 0/1 * * * ? ")
    void getData() {
        List<String> fundCodes = fundService.list().stream().map(Fund ::getFundcode).collect(Collectors.toList());
        fundCodes.forEach(k ->{
            Fund fund = FundDataService.getData(k);
            fundService.update(fund, new QueryWrapper<Fund>().eq("fundcode", fund.getFundcode()));
        });
        fundController.initialize();
    }
}
