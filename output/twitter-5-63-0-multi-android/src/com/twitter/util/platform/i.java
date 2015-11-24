// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import com.twitter.util.m;

public class i extends m
{
    private static final i a;
    private TwRadioType b;
    
    static {
        a = new i();
    }
    
    public i() {
        this.b = TwRadioType.b;
    }
    
    public static i a() {
        return i.a;
    }
    
    public void a(final l l) {
        this.b = l.a();
        super.a(l);
    }
}
