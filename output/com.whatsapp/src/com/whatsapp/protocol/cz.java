// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class cz extends Exception
{
    private static final long serialVersionUID = 1L;
    String a;
    
    public cz() {
    }
    
    public cz(final String s) {
        super(s);
    }
    
    public cz(final String s, final String a) {
        super(s);
        this.a = a;
    }
    
    public String a() {
        return this.a;
    }
}
