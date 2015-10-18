// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.regex.Pattern;

class kf
{
    public final String a;
    public final Pattern b;
    
    public kf(final String a, final String s) {
        this.a = a;
        this.b = Pattern.compile(s);
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
