// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.featureswitch.d;

public class ae implements e
{
    private final String a;
    private final String b;
    private final boolean c;
    
    public ae(final String a, final String b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean a() {
        return d.f(this.a);
    }
    
    @Override
    public boolean b() {
        return d.f(this.b);
    }
    
    @Override
    public boolean c() {
        return this.c;
    }
}
