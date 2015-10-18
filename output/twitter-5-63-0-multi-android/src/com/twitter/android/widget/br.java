// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.HashMap;
import java.util.Map;

public class br
{
    private static Map a;
    
    static {
        (br.a = new HashMap(2)).put("NFL", 2130968941);
        br.a.put("WC", 2130968763);
    }
    
    public static bt a(final int n, final boolean b) {
        if (b) {
            return new bu();
        }
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                return new bv();
            }
        }
    }
}
