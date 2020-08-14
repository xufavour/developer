package com.xufavour.developer.java.groovy;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.codehaus.groovy.runtime.InvokerHelper;

/**
 * @Author: xuyangyang
 * @Date: 2020/6/29
 */
public class ScriptExample {
    public static void main(String[] args) {
        String scriptStr1 = "try{Double.valueOf(new BigDecimal(0.04*Double.valueOf(lastFinalPay))" +
                ".setScale(0, BigDecimal.ROUND_HALF_UP))}catch(Exception e){return null}";
        String test = "try{Double.valueOf(new BigDecimal(FinanceLib.pmt(Double.valueOf(actualInterestRate)/10000/12/Math.pow(10,5), Long.valueOf(leaseTerms), -Double.valueOf(dealPrice), 0, false)).setScale(0, BigDecimal.ROUND_HALF_UP))}catch(Exception e){return null}";

        Script script = new GroovyShell().parse(test);
        Binding bindings = new Binding();
        bindings.setProperty("actualInterestRate", 1488);
        bindings.setProperty("leaseTerms", 36);
        bindings.setProperty("dealPrice", 8000000L);
        Object run = InvokerHelper.createScript(script.getClass(), bindings).run();
        System.out.println(run);
//        Script script1 = new GroovyShell().parse(scriptStr1);
//        Binding bindings = new Binding();
//        bindings.setProperty("lastFinalPay", "5720000");
//        Object result = InvokerHelper.createScript(script1.getClass(), bindings).run();
//        long provisionAgainstRisksTotal = Math.round((double) result);
//        String scriptStr2 = "try{Double.valueOf(new BigDecimal(Double.valueOf(provisionAgainstRisksTotal)/Double.valueOf(leaseTerms)).setScale(-3, BigDecimal.ROUND_HALF_UP))}catch(Exception e){return null}";
//        Script script2 = new GroovyShell().parse(scriptStr2);
//        bindings.setProperty("provisionAgainstRisksTotal", provisionAgainstRisksTotal);
//        bindings.setProperty("leaseTerms", 36);
//        Object result2 = InvokerHelper.createScript(script2.getClass(), bindings).run();
//        System.out.println(result2);
    }
}
