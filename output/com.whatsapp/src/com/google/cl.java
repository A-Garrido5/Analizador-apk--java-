// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class cl
{
    private static String a(final by by, final bl bl, String string) {
        if (bl != null) {
            string = bl.a() + '.' + string;
        }
        else if (by.d().length() > 0) {
            return by.d() + '.' + string;
        }
        return string;
    }
    
    static String b(final by by, final bl bl, final String s) {
        return a(by, bl, s);
    }
}
