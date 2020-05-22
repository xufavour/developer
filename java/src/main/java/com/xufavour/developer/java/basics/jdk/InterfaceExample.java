package com.xufavour.developer.java.basics.jdk;

/**
 * @author xufavour
 * @date 2020/05/22
 **/
public interface InterfaceExample {
    /**
     * 一个抽象类型,java抽象方法的集合, 对行为或功能的抽象.
     * 特点:
     * 1. 不能实例化,无构造方法.
     * 2. 成员变量只能是 public static final, 除默认方法外其他的都是 public abstract 的抽象方法.
     * 3. 一个类可以同时实现多个接口.
     */

    // 接口中变量默认也只能是 public static final 类型, 可不写.
    public static final String interfaceVar = "varValue";

    // 普通抽象方法,默认也只能是public abstract修饰的,可不写.
    public abstract void methodA();

    // jdk1.8后 接口中可以中静态方法,静态方法则必须实现。
    public static void staticMethod(){
        System.out.println("interfaceExample 接口的 staticMethod 方法！");
    }

    /**
     * jdk1.8 新增的功能,接口中可以通过 default 添加可实现的方法.
     */
    default String defaultMethod(){
        return "default value";
    }

//    接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）。
//    接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（并且只能是 public，用 private 修饰会报编译错误）。
//    接口中的方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法。

// 子类实现多个接口时，对于接口默认方法定义可能会出现多个默认方法，并且接口默认方法可能会出现同名情况, 3个原则
//    1.类中的方法优先级最高
//    2.如果第一条无法进行判断,那么子接口的优先级更高:函数签名相同时,优先选择拥有最具体实现的默认方法的接口,即如果B继承了A,那么B就比A更加具体
//    3.如果还是无法判断,继承了多个接口的类必须通过显示覆盖和调用期望的方法,显示地选择使用哪一个默认方法的实现

}

class InterfaceTest implements InterfaceExample{

    @Override
    public void methodA() {

    }

    public static void main(String[] args) {
        InterfaceTest instance = new InterfaceTest();
//        interfaceVar = "3"; 不能修改
        System.out.println(interfaceVar);
        System.out.println(instance.defaultMethod());
        InterfaceExample.staticMethod(); // 调用静态方法
    }
}
