// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

public abstract class n
{
    final String a;
    private final p b;
    
    public n(final p b, final String a) {
        this.a = a;
        this.b = b;
    }
    
    abstract k a(final String p0);
    
    public void a() {
        new o(this).execute(new Object[0]);
    }
}
