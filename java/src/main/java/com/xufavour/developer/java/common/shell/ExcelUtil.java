package com.xufavour.developer.java.common.shell;

import cn.hutool.http.HttpUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @Author: xyy
 */
public class ExcelUtil {

    public static void main(String[] args) {
        List<DemoData> list = new ArrayList<DemoData>();
        String listUrl = "https://mandala.prepub.souche-inc.com//pricing/financialLeaseApi/listFinancialLeasePricing.json?pricingSubject=1&categoryId=&vin=&status=&spuName=&pageSize=500&pageNo=1&sort=&pricingId=&ruleName=&token=91623033550649307";
        String result = HttpUtil.get(listUrl);
        ListData listData = JSON.parseObject(result, ListData.class);
        for (ListData.DataDTO.ItemsDTO itemsDTO: listData.getData().getItems()) {
            String detailUrl = "https://mandala.prepub.souche-inc.com//pricing/pricingApi/getPricingProjectByPricingId.json?status=1&token=91623033550649307";
            detailUrl = detailUrl + "&pricingId=" + itemsDTO.getPricingId();
            System.out.println(detailUrl);
            String s = HttpUtil.get(detailUrl);
            Detail detail = JSON.parseObject(s, Detail.class);
            Detail.DataDTO data = detail.getData();
            if(Objects.isNull(data)){
                continue;
            }
            DemoData demoData = new DemoData();
            demoData.setModelName(data.getCarSkuInfoVOList().get(0).getModelName());
            demoData.setModelCode(data.getCarSkuInfoVOList().get(0).getModelCode());
            demoData.setGuidePrice(data.getCarSkuInfoVOList().get(0).getGuidePrice());
            List<Detail.DataDTO.FinanicalLeasePricingProjectDetailVODTO.BaseFinancialProductVODTO.BaseFinancialProductInfoVOListDTO> baseFinancialProductInfoVOList = data.getFinanicalLeasePricingProjectDetailVO().getBaseFinancialProductVO().getBaseFinancialProductInfoVOList();
            for(Detail.DataDTO.FinanicalLeasePricingProjectDetailVODTO.BaseFinancialProductVODTO.BaseFinancialProductInfoVOListDTO item :
                    baseFinancialProductInfoVOList){
                System.out.println(item.getDownPayment());
                if(item.getDownPaymentPercentMsg().equals("10%")){
                    demoData.setDownPayment(item.getDownPayment());
                    demoData.setDownPaymentPercentMsg("10%");
                    demoData.setMonthlyRent(item.getMonthlyRent());
                }else if(item.getDownPaymentPercentMsg().equals("15%")){
                    demoData.setDownPayment15(item.getDownPayment());
                    demoData.setDownPaymentPercentMsg15("15%");
                    demoData.setMonthlyRent15(item.getMonthlyRent());
                }else if(item.getDownPaymentPercentMsg().equals("20%")){
                    demoData.setDownPayment20(item.getDownPayment());
                    demoData.setDownPaymentPercentMsg20("20%");
                    demoData.setMonthlyRent20(item.getMonthlyRent());
                }
            }
            list.add(demoData);
        }
        String fileName = "/Users/xyy/Desktop/" + "simpleWrite" + System.currentTimeMillis() + ".xlsx";

        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(list);
    }



}

