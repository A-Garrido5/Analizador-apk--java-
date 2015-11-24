// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import java.util.HashSet;
import java.util.HashMap;

public class aw
{
    private final HashMap a;
    
    public aw() {
        this.a = new HashMap();
    }
    
    public boolean a(final String s, final String s2) {
        final HashSet<String> set = this.a.get(s);
        if (set != null) {
            return set.add(s2);
        }
        final HashSet<String> set2 = new HashSet<String>();
        set2.add(s2);
        this.a.put(s, set2);
        return true;
    }
}
