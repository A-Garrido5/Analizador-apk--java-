// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

final class bQ
{
    private final Map a;
    
    bQ() {
        this.a = new HashMap();
    }
    
    void a(final int n) {
        Integer value = this.a.get(n);
        if (value == null) {
            value = 0;
        }
        this.a.put(n, 1 + value);
    }
    
    int[] a() {
        final boolean b = fG.b;
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Map.Entry<K, Integer>> iterator = this.a.entrySet().iterator();
        int intValue = -1;
        while (iterator.hasNext()) {
            final Map.Entry<K, Integer> entry = iterator.next();
            Label_0139: {
                if (entry.getValue() > intValue) {
                    intValue = entry.getValue();
                    list.clear();
                    list.add(entry.getKey());
                    if (!b) {
                        break Label_0139;
                    }
                }
                if (entry.getValue() == intValue) {
                    list.add(entry.getKey());
                }
            }
            final int n = intValue;
            if (b) {
                break;
            }
            intValue = n;
        }
        return ex.a(list);
    }
}
