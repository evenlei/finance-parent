package com.monkey.fund.input.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SelectedFundDailyTask {


    // 每日14点执行
    @Scheduled(cron = "0 0 14 * * ? ")
    public void selectedFund(){

    }
}
