// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

abstract class aD extends aZ
{
    aD(final hN hn) {
        super(hn);
    }
    
    @Override
    public String c() {
        if (this.b().b() != 60) {
            throw fv.a();
        }
        final StringBuilder sb = new StringBuilder();
        this.a(sb, 5);
        this.b(sb, 45, 15);
        return sb.toString();
    }
}
