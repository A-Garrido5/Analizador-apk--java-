// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class f
{
    private final List a;
    private final String b;
    private final List c;
    
    public f(final List list, final String b, final List c) {
        this.a = new ArrayList(list);
        this.b = b;
        this.c = c;
    }
    
    public String a() {
        return this.b;
    }
    
    public List b() {
        return Collections.unmodifiableList((List<?>)this.c);
    }
    
    public List c() {
        return Collections.unmodifiableList((List<?>)this.a);
    }
}
