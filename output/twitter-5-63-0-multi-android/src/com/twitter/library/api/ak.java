// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public class ak
{
    public boolean a;
    public boolean b;
    public String c;
    
    public boolean a() {
        return !this.b && this.a;
    }
    
    public boolean b() {
        return this.b && this.a;
    }
    
    public boolean c() {
        return this.a;
    }
}
