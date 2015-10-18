// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import com.google.android.gms.internal.c;

class bh
{
    private static aj a(final aj aj) {
        try {
            return new aj(bf.c(a(bf.a((c)aj.a()))), aj.b());
        }
        catch (UnsupportedEncodingException ex) {
            z.a("Escape URI: unsupported encoding", ex);
            return aj;
        }
    }
    
    private static aj a(final aj aj, final int n) {
        if (!a((c)aj.a())) {
            z.a("Escaping can only be applied to strings.");
            return aj;
        }
        switch (n) {
            default: {
                z.a("Unsupported Value Escaping: " + n);
                return aj;
            }
            case 12: {
                return a(aj);
            }
        }
    }
    
    static aj a(aj a, final int... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            a = a(a, array[i]);
        }
        return a;
    }
    
    static String a(final String s) {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }
    
    private static boolean a(final c c) {
        return bf.c(c) instanceof String;
    }
}
