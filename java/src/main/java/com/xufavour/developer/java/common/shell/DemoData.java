package com.xufavour.developer.java.common.shell;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class DemoData {
    @ExcelProperty("车型")
    private String modelName;
    @ExcelProperty("车型code")
    private String modelCode;
    @ExcelProperty("指导价")
    private Double guidePrice;

    @ExcelProperty("首付比例10%")
    private String downPaymentPercentMsg;

    @ExcelProperty("首付10%")
    private Double downPayment;
    @ExcelProperty("月租10%")
    private Integer monthlyRent;


    @ExcelProperty("首付比例15%")
    private String downPaymentPercentMsg15;

    @ExcelProperty("首付15%")
    private Double downPayment15;
    @ExcelProperty("月租15%")
    private Integer monthlyRent15;

    @ExcelProperty("首付比例20%")
    private String downPaymentPercentMsg20;

    @ExcelProperty("首付20%")
    private Double downPayment20;
    @ExcelProperty("月租20%")
    private Integer monthlyRent20;

    /**
     * 忽略这个字段
     */
    @ExcelIgnore
    private String ignore;
}
