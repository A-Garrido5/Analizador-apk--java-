// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class d6 implements aM
{
    final int a;
    final fm b;
    
    d6(final fm b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public hg a() {
        return this.b.getDescriptorForType().b().get(this.a);
    }
}
