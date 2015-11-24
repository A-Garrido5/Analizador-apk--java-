// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class ev extends e_
{
    public void a(final c3 c3, final Character c4) {
        String value;
        if (c4 == null) {
            value = null;
        }
        else {
            value = String.valueOf(c4);
        }
        c3.a(value);
    }
    
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (Character)o);
    }
}
