// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import java.util.Set;
import java.util.Map;
import java.util.Collections;
import java.util.List;

public class k
{
    public static Object a(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        return o2;
    }
    
    public static String a(final String s) {
        if (s != null) {
            return s;
        }
        return "";
    }
    
    public static List a(final List list) {
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
    
    public static Map a(final Map map) {
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }
    
    public static Set a(final Set set) {
        if (set != null) {
            return set;
        }
        return Collections.emptySet();
    }
}
