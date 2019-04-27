//
// Created by LEO on 2019/4/24.
//
#include "com_leo_ndkdemo_JniTestUtil.h"

JNIEXPORT jstring JNICALL Java_com_leo_ndkdemo_JniTestUtil_getHelloStr(JNIEnv *env, jclass instance) {
    return env->NewStringUTF("I am from JNI.");
}

JNIEXPORT jstring JNICALL Java_com_leo_ndkdemo_JniTestUtil_getHelloStr2(JNIEnv *jniEnv, jclass instance) {
    return jniEnv->NewStringUTF("I am from JNI2.");
}

