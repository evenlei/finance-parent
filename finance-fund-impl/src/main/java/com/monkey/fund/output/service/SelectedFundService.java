package com.monkey.fund.output.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.monkey.fund.output.entity.SelectedFund;
import com.monkey.fund.output.vo.SelectedFundVo;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface SelectedFundService extends IService<SelectedFund> {
    List<SelectedFundVo> getSelectedFund();

    void excelDownload(HttpServletResponse response);

}
