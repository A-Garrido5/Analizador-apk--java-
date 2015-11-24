// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

public class b
{
    private Long a;
    private Short b;
    
    public ClientHeader a() {
        if (this.a == null) {
            throw new IllegalArgumentException("Required field 'timestampMs' was not present! Struct: " + this.toString());
        }
        return new ClientHeader(this.a, this.b);
    }
    
    public b a(final ClientHeader$_Fields clientHeader$_Fields, final Object o) {
        switch (com.twitter.common_header.thriftandroid.a.a[clientHeader$_Fields.ordinal()]) {
            case 1: {
                if (o != null) {
                    this.a = (Long)o;
                    return this;
                }
                break;
            }
            case 2: {
                if (o != null) {
                    this.b = (Short)o;
                    return this;
                }
                break;
            }
        }
        return this;
    }
}
