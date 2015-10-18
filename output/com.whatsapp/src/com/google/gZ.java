// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class gZ
{
    private final int a;
    private final int b;
    
    gZ(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    int a() {
        return this.a;
    }
    
    cs b() {
        return new cs(this.a(), this.c());
    }
    
    int c() {
        return this.b;
    }
    
    @Override
    public String toString() {
        final boolean e = i.e;
        final String string = "<" + this.a + ' ' + this.b + '>';
        if (fN.a != 0) {
            i.e = !e;
        }
        return string;
    }
}
