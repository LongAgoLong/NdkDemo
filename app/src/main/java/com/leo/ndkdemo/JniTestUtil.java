package com.leo.ndkdemo;

public class JniTestUtil {
    static {
        System.loadLibrary("Java2C");
    }
    public static native String getHelloStr();
    public static native String getHelloStr2();
}
