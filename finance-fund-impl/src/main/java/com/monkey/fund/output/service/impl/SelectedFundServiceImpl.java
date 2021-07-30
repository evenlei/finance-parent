package com.monkey.fund.output.service.impl;

import com.alibaba.excel.EasyExcelFactory;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monkey.fund.output.entity.SelectedFund;
import com.monkey.fund.output.mapper.SelectedFundMapper;
import com.monkey.fund.output.service.SelectedFundService;
import com.monkey.fund.output.vo.SelectedFundVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Slf4j
public class SelectedFundServiceImpl extends ServiceImpl<SelectedFundMapper, SelectedFund> implements SelectedFundService {

    @Override
    public List<SelectedFundVo> getSelectedFund() {
        List<SelectedFund> list = this.list();
        if (CollectionUtils.isEmpty(list)) return Collections.emptyList();

        List<SelectedFundVo> result = new ArrayList<>();
        list.forEach(it -> {
            SelectedFundVo vo = new SelectedFundVo();
            BeanUtils.copyProperties(it, vo);
            result.add(vo);
        });

        return result;
    }

    @Override
    public void excelDownload(HttpServletResponse response) {
        List<SelectedFund> list = this.list();

        if (CollectionUtils.isNotEmpty(list)) writeExcel(list, response);
    }

    private void writeExcel(List<SelectedFund> list, HttpServletResponse response) {
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");

            String fileName = URLEncoder.encode("猴子优选基金_" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()), "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");

            EasyExcelFactory.write(response.getOutputStream(), SelectedFund.class).sheet("猴子优选基金").doWrite(list);

        } catch (Exception e) {
            log.error("猴子优选基金导出失败：{}", e.getMessage());
            e.printStackTrace();
        }
    }
}
