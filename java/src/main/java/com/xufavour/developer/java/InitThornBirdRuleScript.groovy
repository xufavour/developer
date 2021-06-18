package com.xufavour.developer.java


import org.apache.poi.ss.formula.functions.FinanceLib

import java.math.RoundingMode

/**
 * @author xyy
 */
class InitThornBirdRuleScript {

    /**
     * 计算器待确认问题：
     * 1. 裸车价&融资本金 是否必须为整型
     *
     * 2. 贷款比例 & 购置税 & 首付比例 & 月供 保留位数
     *
     */


    /**
     * 期数
     */
    Integer terms = 36

    /**
     * 资方对客利率 10.0%
     */
    String fundsGuestRate = "10.0"

    String riskControlRate = "10.0"


    /**
     * 融资本金 单位 分
     */
    Integer loanPrincipal = 7300000

    /**
     *
     * @return 月供 单位 分
     */
    def "月供 计算公式: round（pmt（对客利率/12，总期数，-车辆融资金额，0），0）"() {
        given:

        when:
        1 * 1
        then:
        try {
            def val = new BigDecimal(
                        FinanceLib.pmt(
                            new BigDecimal(fundsGuestRate).divide(new BigDecimal("1200"), 10, RoundingMode.HALF_DOWN).doubleValue(),
                            new BigDecimal(terms).doubleValue(), new BigDecimal(loanPrincipal).negate().doubleValue(),0, false)
                        ).setScale(0, RoundingMode.HALF_UP).toPlainString()
            println val
        } catch (Exception e) {
            return null
        }
    }

    Integer carPrice = 10000000;

    def "购置税 计算公式: 裸车价/1.13*10%" (){
        given:

        when:
        1 * 1
        then:
        try {
            def val = new BigDecimal(carPrice).divide(new BigDecimal("1.13"),0,BigDecimal.ROUND_HALF_UP)
                    .multiply(new BigDecimal("0.1")).toPlainString()
            println val
        } catch (Exception e) {
            return null
        }
    }



    def "裸车价汇总的融资款 计算公式: min(融资本金，（1-max(资方最低首付比例，风控最低首付比例))*裸车价）" (){
        given:

        when:
        1 * 1
        then:
        try {
            def val = Math.min(loanPrincipal,
                    (100 - Math.max(Double.valueOf(fundsGuestRate),Double.valueOf(riskControlRate)))
                            * new BigDecimal(carPrice)
                    .divide(new BigDecimal(100),0,BigDecimal.ROUND_HALF_UP))
            println val
        } catch (Exception e) {
            return null
        }
    }


    Integer firstDownPayment = 2700000;

    def "首付比例 计算公式: 首付金额（裸车价中的）/ 裸车价" (){
        given:

        when:
        1 * 1
        then:
        try {
            def val = new BigDecimal(firstDownPayment).divide(new BigDecimal(carPrice),4,BigDecimal.ROUND_HALF_UP)
            println val
        } catch (Exception e) {
            return null
        }
    }

    /**
     * 裸车价中的融资款
     */
    Integer carLoanPrincipal = 7300000
    Double purchaseTax = 8849.6

    def "超融款 计算公式： min(融资本金-裸车价中的融资款，购置税）" (){
        given:

        when:
        1 * 1
        then:
        try {
            def val = BigDecimal.valueOf(purchaseTax).min(new BigDecimal(loanPrincipal - carLoanPrincipal))
            println val
        } catch (Exception e) {
            e.printStackTrace()
            return null
        }
    }


    def "首付金额（裸车价中的） 计算公式： 裸车价-裸车价中的融资款" (){
        given:

        when:
        1 * 1
        then:
        try {
            def val = carPrice - carLoanPrincipal;
            println val
        } catch (Exception e) {
            e.printStackTrace()
            return null
        }
    }

    def "贷款比例 计算公式： 融资本金/裸车价" (){
        given:

        when:
        1 * 1
        then:
        try {
            def val = new BigDecimal(loanPrincipal).divide(carPrice,2,BigDecimal.ROUND_HALF_UP)
            println val
        } catch (Exception e) {
            e.printStackTrace()
            return null
        }
    }



}
