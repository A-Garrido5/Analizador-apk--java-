// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import java.util.Iterator;
import java.util.Collections;
import java.util.List;

public class e
{
    private final String a;
    private final List b;
    private final TwitterPlace c;
    private final String d;
    private final List e;
    
    public e(final String a, final List list, final String d, final List e) {
        this.a = a;
        if (list == null) {
            this.b = Collections.emptyList();
        }
        else {
            this.b = Collections.unmodifiableList((List<?>)list);
        }
        while (true) {
            for (final TwitterPlace c : this.b) {
                if (c.placeId.equals(this.a)) {
                    this.c = c;
                    this.d = d;
                    this.e = e;
                    return;
                }
            }
            TwitterPlace c = null;
            continue;
        }
    }
    
    public List a() {
        return this.b;
    }
    
    public TwitterPlace b() {
        return this.c;
    }
    
    public String c() {
        return this.d;
    }
    
    public List d() {
        return this.e;
    }
}
