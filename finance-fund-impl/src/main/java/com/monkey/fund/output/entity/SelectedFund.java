package com.monkey.fund.output.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class SelectedFund {

    // 规则：连读四跌，和五跌，跌合超过10% 的精选基金
    // 爬取时间：交易日每日14:00

    @ExcelProperty(value = {"序号"})
    private Long id;
    // 基金名字
    @ExcelProperty(value = {"基金"})
    private String name;
    // 基金编码
    @ExcelProperty(value = {"编码"})
    private String code;
    // 基金当日净值跌幅
    @ExcelProperty(value = {"当日"})
    private String currentDay;
    // 基金前一日净值跌幅
    @ExcelProperty(value = {"前一日"})
    private String lastOneDay;
    // 基金前二日净值跌幅
    @ExcelProperty(value = {"前二日"})
    private String lastTwoDay;
    // 基金前三日净值跌幅
    @ExcelProperty(value = {"前三日"})
    private String lastTreeDay;
    // 基金前四日净值跌幅
    @ExcelProperty(value = {"前四日"})
    private String lastFourDay;
    // 基金前五日净值跌幅
    @ExcelProperty(value = {"前五日"})
    private String lastFiveDay;
    @ExcelProperty(value = {"总跌幅"})
    private String total;
    @ExcelProperty(value = {"板块"})
    private String plate;
    @ExcelProperty(value = {"行业"})
    private String industry;
    @ExcelProperty(value = {"概念"})
    private String concept;
    // 基金经理，持仓，规模，等等，暂不展示
}
