package com.monkey.fund.output.controller;

import com.monkey.fund.output.entity.SelectedFund;
import com.monkey.fund.output.service.SelectedFundService;
import com.monkey.fund.output.vo.SelectedFundVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("")
public class SelectedFundController {

    @Autowired
    private SelectedFundService selectedFundService;

//    @GetMapping("/get")
//    public List<SelectedFundVo> getSelectedFund(){
//        return selectedFundService.getSelectedFund();
//    }

    @GetMapping("")
    public void excelDownload(HttpServletResponse response){
        selectedFundService.excelDownload(response);
    }
}
