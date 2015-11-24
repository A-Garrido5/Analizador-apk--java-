// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264;

import java.nio.ShortBuffer;

public class Debug
{
    public static final boolean debug;
    
    public static void print(final int n) {
    }
    
    public static void print(final String s) {
    }
    
    public static void print(final short[] array) {
        int n = 0;
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                System.out.printf("%3d, ", array[n]);
                ++n;
            }
            System.out.println();
        }
    }
    
    public static final void print8x8(final ShortBuffer shortBuffer) {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                System.out.printf("%3d, ", shortBuffer.get());
            }
            System.out.println();
        }
    }
    
    public static final void print8x8(final int[] array) {
        int n = 0;
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                System.out.printf("%3d, ", array[n]);
                ++n;
            }
            System.out.println();
        }
    }
    
    public static final void print8x8(final short[] array) {
        int n = 0;
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                System.out.printf("%3d, ", array[n]);
                ++n;
            }
            System.out.println();
        }
    }
    
    public static void println(final String s) {
    }
    
    public static void trace(final String s, final Object... array) {
    }
}
