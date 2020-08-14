package com.xufavour.developer.java.groovy;


import java.util.Collections;

/**
 * @Author: xuyangyang
 * @Date: 2020/5/28
 */
public class Test {

    public static void main(String[] args) {
//        String scriptStr1 = "try{Double.valueOf(new BigDecimal(0.04*Double.valueOf(lastFinalPay)).setScale(0, BigDecimal.ROUND_HALF_UP))}catch(Exception e){return null}";
//        Script script1 =  new GroovyShell().parse(scriptStr1);
//        Binding bindings = new Binding();
//        bindings.setProperty("lastFinalPay","5720000");
//        Object result = InvokerHelper.createScript(script1.getClass(), bindings).run();
//        long provisionAgainstRisksTotal = Math.round((double) result);
//        String scriptStr2 = "try{Double.valueOf(new BigDecimal(Double.valueOf(provisionAgainstRisksTotal)/Double.valueOf(leaseTerms)).setScale(-3, BigDecimal.ROUND_HALF_UP))}catch(Exception e){return null}";
//        Script script2 =  new GroovyShell().parse(scriptStr2);
//        bindings.setProperty("provisionAgainstRisksTotal",provisionAgainstRisksTotal);
//        bindings.setProperty("leaseTerms",36);
//        Object result2 = InvokerHelper.createScript(script2.getClass(), bindings).run();
//        System.out.println(result2);
        Object o = "Object";
        int method = new Test().method(o);
        System.out.println(method);
        Collections.sort(null);
    }


    public int method(String var){
        return 1;
    }

    public int method(Object var){
        return 2;
    }
}
