// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.util.zip.Inflater;

class q extends Inflater
{
    final /* synthetic */ o a;
    
    q(final o a) {
        this.a = a;
    }
    
    @Override
    public int inflate(final byte[] array, final int n, final int n2) {
        int n3 = super.inflate(array, n, n2);
        if (n3 == 0 && this.needsDictionary()) {
            this.setDictionary(v.a);
            n3 = super.inflate(array, n, n2);
        }
        return n3;
    }
}
