LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := Java2C

LOCAL_SRC_FILES := Java2C.cpp
LOCAL_LDLIBS := -lm -llog
include $(BUILD_SHARED_LIBRARY)
