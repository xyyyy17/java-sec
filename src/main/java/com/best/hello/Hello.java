package com.best.hello;

public class Hello {
    public static void main(String[] args) {
        sayHello();
        sayHello("xiaoyuan");
        eat();
        System.out.println("Hello World!");
    }

    public static void sayHello(){
        System.out.println("我是say方法");
    }

    public static void sayHello(String name){
        System.out.println("我是say方法，参数是："+name);
    }

    public static void eat(){
        System.out.println("我是eat方法");
    }
}
