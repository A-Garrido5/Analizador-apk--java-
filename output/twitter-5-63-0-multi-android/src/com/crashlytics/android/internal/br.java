// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

final class br
{
    static final br a;
    final int b;
    final int c;
    
    static {
        a = new br(0, 0);
    }
    
    br(final int b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + "[position = " + this.b + ", length = " + this.c + "]";
    }
}
