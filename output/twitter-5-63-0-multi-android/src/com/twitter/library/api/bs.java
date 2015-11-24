// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.ArrayList;

public class bs
{
    public final ArrayList a;
    public final String b;
    public final String c;
    public final String d;
    private bt e;
    
    public bs(final ArrayList a, final String b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public long a() {
        if (!CollectionUtils.a((Collection)this.a)) {
            return this.a.get(0).d;
        }
        return -1L;
    }
    
    public void a(final bt e) {
        this.e = e;
    }
    
    public bt b() {
        return this.e;
    }
}
