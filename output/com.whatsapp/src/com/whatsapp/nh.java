// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.backport.util.Base64;

public class nh
{
    public String a;
    public String b;
    public byte[] c;
    public String d;
    public String e;
    
    public nh(final String d, final String e, final String b) {
        this.d = d;
        this.b = b;
        this.e = e;
        final byte[] c = new byte[64];
        l7.B().nextBytes(c);
        this.a = Base64.encodeToString(c, 2);
        this.c = c;
    }
}
