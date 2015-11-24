// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class wh
{
    public boolean a;
    public boolean b;
    public String c;
    public int d;
    public boolean e;
    
    public wh(final String c, final boolean b, final boolean e, final boolean a) {
        this.c = c;
        this.b = b;
        this.e = e;
        this.a = a;
    }
    
    public boolean a() {
        return App.S.f(this.c);
    }
    
    @Override
    public String toString() {
        return this.c + ' ' + this.b + ' ' + this.e + ' ' + this.a;
    }
}
