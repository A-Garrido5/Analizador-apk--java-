// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.Map;
import java.util.LinkedHashMap;

public class u extends LinkedHashMap
{
    private static final float b = 0.75f;
    private int a;
    
    public u(final int a) {
        super(1 + (int)Math.ceil(a / 0.75f), 0.75f, true);
        this.a = a;
    }
    
    @Override
    protected boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() > this.a;
    }
}
