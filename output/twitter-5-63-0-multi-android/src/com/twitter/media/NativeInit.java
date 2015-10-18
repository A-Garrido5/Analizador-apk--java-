// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media;

import android.os.Build;

public class NativeInit
{
    static boolean a;
    static boolean b;
    
    public static void a() {
        // monitorenter(NativeInit.class)
        try {
            if (NativeInit.b) {
                return;
            }
            try {
                if (c()) {
                    System.loadLibrary("twittermedia");
                    if (nativeInit()) {
                        NativeInit.a = true;
                    }
                }
                NativeInit.b = true;
            }
            catch (Exception ex) {
                NativeInit.b = true;
            }
            catch (LinkageError linkageError) {
                NativeInit.b = true;
            }
            finally {
                NativeInit.b = true;
            }
        }
        finally {}
    }
    
    public static boolean b() {
        a();
        return NativeInit.a;
    }
    
    private static boolean c() {
        return Build.CPU_ABI.equalsIgnoreCase("armeabi") || Build.CPU_ABI.equalsIgnoreCase("armeabi-v7a") || Build.CPU_ABI.equalsIgnoreCase("x86");
    }
    
    private static native boolean nativeInit();
}
