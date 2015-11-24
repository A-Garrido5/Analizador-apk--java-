// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.featureswitch.d;
import java.util.Collections;
import java.util.List;

public class h
{
    private final List a;
    private final String b;
    
    h(final String b, final List list) {
        this.a = Collections.unmodifiableList((List<?>)list);
        this.b = b;
    }
    
    public static boolean d() {
        return d.f("ad_formats_carousel_enabled");
    }
    
    public boolean a() {
        return !this.a.isEmpty();
    }
    
    public List b() {
        return this.a;
    }
    
    public String c() {
        return this.b;
    }
}
