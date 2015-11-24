// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Map;
import java.util.LinkedHashMap;

final class oz extends LinkedHashMap
{
    @Override
    protected boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() > 100;
    }
}
