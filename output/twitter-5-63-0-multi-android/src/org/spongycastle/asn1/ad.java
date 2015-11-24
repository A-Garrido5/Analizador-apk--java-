// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.util.Vector;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.util.Enumeration;

class ad implements Enumeration
{
    int a;
    final /* synthetic */ ac b;
    
    ad(final ac b) {
        this.b = b;
        this.a = 0;
    }
    
    @Override
    public boolean hasMoreElements() {
        return this.a < this.b.b.length;
    }
    
    @Override
    public Object nextElement() {
        return this.b.b[this.a++];
    }
}
