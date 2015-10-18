// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.regex.Pattern;

public class c6
{
    private aw a;
    
    public c6(final int n) {
        this.a = new aw(n);
    }
    
    public Pattern a(final String s) {
        Pattern compile = (Pattern)this.a.a(s);
        if (compile == null) {
            compile = Pattern.compile(s);
            this.a.a(s, compile);
        }
        return compile;
    }
}
