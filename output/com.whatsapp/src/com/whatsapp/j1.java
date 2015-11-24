// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public abstract class j1
{
    String a;
    
    public void a(final String a) {
        this.a = a;
    }
    
    public boolean a() {
        return this.a != null && this.a.equals(l7.c);
    }
    
    public abstract String b();
    
    public abstract void c();
    
    @Override
    public String toString() {
        return this.b();
    }
}
