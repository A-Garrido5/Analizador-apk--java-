// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.util.regex.Pattern;

public class f
{
    private g a;
    
    public f(final int n) {
        this.a = new g(n);
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
