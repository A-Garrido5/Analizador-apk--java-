// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;
import com.twitter.library.api.bd;
import java.util.ArrayList;

public class be
{
    public static bd a(final ArrayList list) {
        return a(list, "email");
    }
    
    private static bd a(final ArrayList list, final String s) {
        if (list != null) {
            for (final bd bd : list) {
                if (s.equalsIgnoreCase(bd.d)) {
                    return bd;
                }
            }
        }
        return null;
    }
    
    public static boolean a(final ArrayList list, final int n) {
        final Iterator<bd> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a == n) {
                return true;
            }
        }
        return false;
    }
    
    public static bd b(final ArrayList list) {
        return a(list, "screen_name");
    }
    
    public static boolean c(final ArrayList list) {
        for (final bd bd : list) {
            if (bd.a == 60 || bd.a == 62 || bd.a == 238 || bd.a == 114) {
                return true;
            }
        }
        return false;
    }
}
