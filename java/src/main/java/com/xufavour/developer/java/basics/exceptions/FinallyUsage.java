package com.xufavour.developer.java.basics.exceptions;

/**
 * @author xyy
 */
public class FinallyUsage {

    public boolean wrongFinally(){
        try{
            int a = 1/0;
            throw new IllegalStateException("my exception!");
        }finally {
            System.out.println("Code comes to here!");
            return true;
        }
    }

    public boolean rightFinally(){
        try{
            throw new IllegalStateException("my exception!");
        }finally {
            System.out.println("Code comes to here!");
        }
    }

    public static void main(String[] args) {
        FinallyUsage finallyUsage=new FinallyUsage();
        finallyUsage.wrongFinally(); //异常被隐藏。
        finallyUsage.rightFinally();
    }
}