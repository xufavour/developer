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
public class Detail {

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
        @JsonProperty("carSkuInfoVOList")
        private List<CarSkuInfoVOListDTO> carSkuInfoVOList;
        @JsonProperty("contractSaleSubjectCode")
        private String contractSaleSubjectCode;
        @JsonProperty("contractSaleSubjectName")
        private String contractSaleSubjectName;
        @JsonProperty("equalsPurchaseSubject")
        private Boolean equalsPurchaseSubject;
        @JsonProperty("exhibitionCity")
        private String exhibitionCity;
        @JsonProperty("finanicalLeasePricingProjectDetailVO")
        private FinanicalLeasePricingProjectDetailVODTO finanicalLeasePricingProjectDetailVO;
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("pricingId")
        private String pricingId;
        @JsonProperty("pricingSubject")
        private Integer pricingSubject;
        @JsonProperty("pricingSubjectName")
        private String pricingSubjectName;
        @JsonProperty("pricingTemplateId")
        private Integer pricingTemplateId;
        @JsonProperty("pricingTemplateIdName")
        private String pricingTemplateIdName;

        @NoArgsConstructor
        @Data
        public static class FinanicalLeasePricingProjectDetailVODTO {
            @JsonProperty("baseFinancialProductVO")
            private BaseFinancialProductVODTO baseFinancialProductVO;
            @JsonProperty("basePrice")
            private Double basePrice;
            @JsonProperty("costTypeVO")
            private CostTypeVODTO costTypeVO;
            @JsonProperty("ruIds")
            private List<Integer> ruIds;
            @JsonProperty("serviceFee")
            private Integer serviceFee;

            @NoArgsConstructor
            @Data
            public static class BaseFinancialProductVODTO {
                @JsonProperty("baseFinancialProductInfoVOList")
                private List<BaseFinancialProductInfoVOListDTO> baseFinancialProductInfoVOList;
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
                    @JsonProperty("customerTypeMsg")
                    private String customerTypeMsg;
                    @JsonProperty("firstAdvanceSettle")
                    private Integer firstAdvanceSettle;
                    @JsonProperty("firstAdvanceSettleMsg")
                    private String firstAdvanceSettleMsg;
                    @JsonProperty("firstBusinessType")
                    private Integer firstBusinessType;
                    @JsonProperty("firstBusinessTypeMsg")
                    private String firstBusinessTypeMsg;
                    @JsonProperty("firstFundType")
                    private Integer firstFundType;
                    @JsonProperty("firstFundTypeMsg")
                    private String firstFundTypeMsg;
                    @JsonProperty("firstGuestRate")
                    private String firstGuestRate;
                    @JsonProperty("firstGuestRateMsg")
                    private String firstGuestRateMsg;
                    @JsonProperty("firstLicenceOwner")
                    private Integer firstLicenceOwner;
                    @JsonProperty("firstLicenceOwnerMsg")
                    private String firstLicenceOwnerMsg;
                    @JsonProperty("firstPeriods")
                    private Integer firstPeriods;
                    @JsonProperty("firstRentScheme")
                    private String firstRentScheme;
                    @JsonProperty("firstTransfer")
                    private Integer firstTransfer;
                    @JsonProperty("firstTransferMsg")
                    private String firstTransferMsg;
                    @JsonProperty("flat")
                    private Integer flat;
                    @JsonProperty("flatMsg")
                    private String flatMsg;
                    @JsonProperty("highLimitOfDownPaymentPercent")
                    private Integer highLimitOfDownPaymentPercent;
                    @JsonProperty("highLimitOfDownPaymentPercentMsg")
                    private String highLimitOfDownPaymentPercentMsg;
                    @JsonProperty("lowLimitOfDownPaymentPercent")
                    private Integer lowLimitOfDownPaymentPercent;
                    @JsonProperty("lowLimitOfDownPaymentPercentMsg")
                    private String lowLimitOfDownPaymentPercentMsg;
                    @JsonProperty("paragraph")
                    private Integer paragraph;
                    @JsonProperty("paragraphMsg")
                    private String paragraphMsg;
                    @JsonProperty("ruleId")
                    private Integer ruleId;
                    @JsonProperty("ruleName")
                    private String ruleName;
                    @JsonProperty("secondAdvanceSettle")
                    private Integer secondAdvanceSettle;
                    @JsonProperty("secondAdvanceSettleMsg")
                    private String secondAdvanceSettleMsg;
                    @JsonProperty("secondBusinessType")
                    private Integer secondBusinessType;
                    @JsonProperty("secondBusinessTypeMsg")
                    private String secondBusinessTypeMsg;
                    @JsonProperty("secondGuestRate")
                    private String secondGuestRate;
                    @JsonProperty("secondGuestRateMsg")
                    private String secondGuestRateMsg;
                    @JsonProperty("secondLicenceOwner")
                    private Integer secondLicenceOwner;
                    @JsonProperty("secondLicenceOwnerMsg")
                    private String secondLicenceOwnerMsg;
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

                @NoArgsConstructor
                @Data
                public static class BaseFinancialProductInfoVOListDTO {
                    @JsonProperty("baseProductId")
                    private Integer baseProductId;
                    @JsonProperty("baseProductVersion")
                    private Integer baseProductVersion;
                    @JsonProperty("downPayment")
                    private Double downPayment;
                    @JsonProperty("downPaymentPercent")
                    private String downPaymentPercent;
                    @JsonProperty("downPaymentPercentMsg")
                    private String downPaymentPercentMsg;
                    @JsonProperty("firstInverseRate")
                    private String firstInverseRate;
                    @JsonProperty("firstInverseRateMsg")
                    private String firstInverseRateMsg;
                    @JsonProperty("firstLoanPrincipal")
                    private Double firstLoanPrincipal;
                    @JsonProperty("monthlyPayment")
                    private Integer monthlyPayment;
                    @JsonProperty("monthlyRent")
                    private Integer monthlyRent;
                    @JsonProperty("secondInverseRate")
                    private String secondInverseRate;
                    @JsonProperty("secondInverseRateMsg")
                    private String secondInverseRateMsg;
                    @JsonProperty("secondLoanPrincipal")
                    private Double secondLoanPrincipal;
                    @JsonProperty("totalPrice")
                    private Double totalPrice;
                    @JsonProperty("type")
                    private Integer type;
                }
            }

            @NoArgsConstructor
            @Data
            public static class CostTypeVODTO {
                @JsonProperty("commercialInsurance")
                private Integer commercialInsurance;
                @JsonProperty("compulsoryInsurance")
                private Integer compulsoryInsurance;
                @JsonProperty("firstInsurance")
                private Integer firstInsurance;
                @JsonProperty("firstMaintain")
                private Integer firstMaintain;
                @JsonProperty("gpsCost")
                private Integer gpsCost;
                @JsonProperty("licenseAndTransfer")
                private Integer licenseAndTransfer;
                @JsonProperty("purchaseTax")
                private Integer purchaseTax;
                @JsonProperty("purchaseTaxService")
                private Integer purchaseTaxService;
                @JsonProperty("storageAndLogisticsCost")
                private Integer storageAndLogisticsCost;
                @JsonProperty("vehicleAndVesselTax")
                private Integer vehicleAndVesselTax;
                @JsonProperty("volume")
                private String volume;
            }
        }

        @NoArgsConstructor
        @Data
        public static class CarSkuInfoVOListDTO {
            @JsonProperty("brandCode")
            private String brandCode;
            @JsonProperty("brandName")
            private String brandName;
            @JsonProperty("categoryId")
            private Integer categoryId;
            @JsonProperty("categoryName")
            private String categoryName;
            @JsonProperty("exteriorColor")
            private String exteriorColor;
            @JsonProperty("exteriorColorName")
            private String exteriorColorName;
            @JsonProperty("guidePrice")
            private Double guidePrice;
            @JsonProperty("interiorColor")
            private String interiorColor;
            @JsonProperty("interiorColorName")
            private String interiorColorName;
            @JsonProperty("modelCode")
            private String modelCode;
            @JsonProperty("modelName")
            private String modelName;
            @JsonProperty("plateType")
            private Integer plateType;
            @JsonProperty("seriesCode")
            private String seriesCode;
            @JsonProperty("seriesName")
            private String seriesName;
            @JsonProperty("skuId")
            private Long skuId;
            @JsonProperty("skuName")
            private String skuName;
            @JsonProperty("spuId")
            private Long spuId;
            @JsonProperty("spuName")
            private String spuName;
        }
    }
}
