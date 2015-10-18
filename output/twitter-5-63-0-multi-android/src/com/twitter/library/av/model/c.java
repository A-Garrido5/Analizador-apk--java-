// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

public class c
{
    public static a a(final b b) {
        if (b != null && b.c() > 1) {
            final a a = b.a(0);
            if (a != null && "ad".equals(a.b())) {
                return a;
            }
        }
        return null;
    }
    
    public static boolean a(final a a) {
        return "ad".equals(a.b());
    }
}
