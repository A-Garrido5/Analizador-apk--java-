// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import java.util.List;
import com.twitter.library.api.moments.Moment;

public class b
{
    private Moment a;
    private List b;
    private int c;
    
    public Capsule a() {
        return new Capsule(this.a, this.b, this.c, null);
    }
    
    public b a(final int c) {
        this.c = c;
        return this;
    }
    
    public b a(final Moment a) {
        this.a = a;
        return this;
    }
    
    public b a(final List b) {
        this.b = b;
        return this;
    }
}
