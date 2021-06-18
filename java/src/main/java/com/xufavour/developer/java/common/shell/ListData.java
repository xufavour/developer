package com.xufavour.developer.java.common.shell;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: xyy
 */
@NoArgsConstructor
@Data
public class ListData {

    @JsonProperty("code")
    private String code;
    @JsonProperty("data")
    private DataDTO data;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("traceId")
    private String traceId;

    @NoArgsConstructor
    @Data
    public static class DataDTO {
        @JsonProperty("currentIndex")
        private Integer currentIndex;
        @JsonProperty("items")
        private List<ItemsDTO> items;
        @JsonProperty("nextIndex")
        private Integer nextIndex;
        @JsonProperty("pageSize")
        private Integer pageSize;
        @JsonProperty("preIndex")
        private Integer preIndex;
        @JsonProperty("totalNumber")
        private Integer totalNumber;
        @JsonProperty("totalPage")
        private Integer totalPage;

        @NoArgsConstructor
        @Data
        public static class ItemsDTO {
            @JsonProperty("baseFinancialProductVO")
            private BaseFinancialProductVODTO baseFinancialProductVO;
            @JsonProperty("basePrice")
            private Integer basePrice;
            @JsonProperty("categoryId")
            private Integer categoryId;
            @JsonProperty("categoryName")
            private String categoryName;
            @JsonProperty("contractSaleSubjectCode")
            private String contractSaleSubjectCode;
            @JsonProperty("contractSaleSubjectName")
            private String contractSaleSubjectName;
            @JsonProperty("costTypeVO")
            private CostTypeVODTO costTypeVO;
            @JsonProperty("equalsPurchaseSubject")
            private Boolean equalsPurchaseSubject;
            @JsonProperty("exhibitionCity")
            private String exhibitionCity;
            @JsonProperty("gmtCreate")
            private String gmtCreate;
            @JsonProperty("gmtUpdate")
            private String gmtUpdate;
            @JsonProperty("guidePrice")
            private Integer guidePrice;
            @JsonProperty("id")
            private Integer id;
            @JsonProperty("modelCode")
            private String modelCode;
            @JsonProperty("pricingId")
            private String pricingId;
            @JsonProperty("pricingSubject")
            private Integer pricingSubject;
            @JsonProperty("pricingSubjectName")
            private String pricingSubjectName;
            @JsonProperty("pricingTemplateId")
            private Integer pricingTemplateId;
            @JsonProperty("pricingTemplateName")
            private String pricingTemplateName;
            @JsonProperty("serviceFee")
            private Integer serviceFee;
            @JsonProperty("showTmallId")
            private Boolean showTmallId;
            @JsonProperty("spuId")
            private Long spuId;
            @JsonProperty("spuName")
            private String spuName;
            @JsonProperty("status")
            private Integer status;
            @JsonProperty("statusName")
            private String statusName;

            @NoArgsConstructor
            @Data
            public static class BaseFinancialProductVODTO {
                @JsonProperty("ruleVO")
                private RuleVODTO ruleVO;

                @NoArgsConstructor
                @Data
                public static class RuleVODTO {
                    @JsonProperty("cityRisk")
                    private Integer cityRisk;
                    @JsonProperty("cityRiskMsg")
                    private String cityRiskMsg;
                    @JsonProperty("customerType")
                    private Integer customerType;
                    @JsonProperty("firstAdvanceSettle")
                    private Integer firstAdvanceSettle;
                    @JsonProperty("firstBusinessType")
                    private Integer firstBusinessType;
                    @JsonProperty("firstFundType")
                    private Integer firstFundType;
                    @JsonProperty("firstGuestRate")
                    private String firstGuestRate;
                    @JsonProperty("firstGuestRateMsg")
                    private String firstGuestRateMsg;
                    @JsonProperty("firstLicenceOwner")
                    private Integer firstLicenceOwner;
                    @JsonProperty("firstPeriods")
                    private Integer firstPeriods;
                    @JsonProperty("firstRentScheme")
                    private String firstRentScheme;
                    @JsonProperty("firstTransfer")
                    private Integer firstTransfer;
                    @JsonProperty("flat")
                    private Integer flat;
                    @JsonProperty("highLimitOfDownPaymentPercent")
                    private Integer highLimitOfDownPaymentPercent;
                    @JsonProperty("lowLimitOfDownPaymentPercent")
                    private Integer lowLimitOfDownPaymentPercent;
                    @JsonProperty("paragraph")
                    private Integer paragraph;
                    @JsonProperty("ruleId")
                    private Integer ruleId;
                    @JsonProperty("ruleName")
                    private String ruleName;
                    @JsonProperty("secondAdvanceSettle")
                    private Integer secondAdvanceSettle;
                    @JsonProperty("secondBusinessType")
                    private Integer secondBusinessType;
                    @JsonProperty("secondGuestRate")
                    private String secondGuestRate;
                    @JsonProperty("secondGuestRateMsg")
                    private String secondGuestRateMsg;
                    @JsonProperty("secondLicenceOwner")
                    private Integer secondLicenceOwner;
                    @JsonProperty("secondPeriods")
                    private Integer secondPeriods;
                    @JsonProperty("step")
                    private Integer step;
                    @JsonProperty("totalPeriods")
                    private Integer totalPeriods;
                    @JsonProperty("userRisk")
                    private Integer userRisk;
                    @JsonProperty("userRiskMsg")
                    private String userRiskMsg;
                }
            }

            @NoArgsConstructor
            @Data
            public static class CostTypeVODTO {
                @JsonProperty("commercialInsurance")
                private Double commercialInsurance;
                @JsonProperty("compulsoryInsurance")
                private Integer compulsoryInsurance;
                @JsonProperty("gpsCost")
                private Integer gpsCost;
                @JsonProperty("purchaseTax")
                private Integer purchaseTax;
                @JsonProperty("storageAndLogisticsCost")
                private Integer storageAndLogisticsCost;
                @JsonProperty("vehicleAndVesselTax")
                private Integer vehicleAndVesselTax;
            }
        }
    }
}
