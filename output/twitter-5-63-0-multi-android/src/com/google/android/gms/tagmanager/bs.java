// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.Arrays;

class bs
{
    final String a;
    final byte[] b;
    
    bs(final String a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString() {
        return "KeyAndSerialized: key = " + this.a + " serialized hash = " + Arrays.hashCode(this.b);
    }
}
