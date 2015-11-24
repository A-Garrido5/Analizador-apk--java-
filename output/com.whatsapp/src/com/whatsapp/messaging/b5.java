// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.util.Map;
import java.util.LinkedHashMap;

final class b5 extends LinkedHashMap
{
    private static final long serialVersionUID = 1L;
    
    private b5() {
    }
    
    b5(final ad ad) {
        this();
    }
    
    public static boolean a(final Long n) {
        return n == null || 86400000L + n < System.currentTimeMillis();
    }
    
    public static boolean a(final Map.Entry entry) {
        return 86400000L + entry.getValue() < System.currentTimeMillis();
    }
    
    @Override
    protected boolean removeEldestEntry(final Map.Entry entry) {
        return a(entry);
    }
}
