package com.xufavour.developer.java.basics.exceptions;

/**
 * @Author: xyy
 * @Date: 2020/10/16
 */
public class RememberException {

    /**
     * 通常来说NullPointerException表示程序代码有逻辑错误，是需要程序员来进行代码逻辑修改，从而进行修复的。
     *
     * 比如说加上一个null check。
     *
     * 不捕获NullPointerException的原因有三个。
     *
     * 使用null check的开销要远远小于异常捕获的开销。
     * 如果在try block中有多个可能抛出NullPointerException的语句，我们很难定位到具体的错误语句。
     * 最后，如果发生了NullPointerException，程序基本上不可能正常运行或者恢复，所以我们需要提前进行null check的判断。
     * 同样的，程序也不要对NullPointerException的父类RuntimeException, Exception, or Throwable进行捕捉。
     */
}
