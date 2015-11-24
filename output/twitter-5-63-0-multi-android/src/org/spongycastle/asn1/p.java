// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.OutputStream;

class p extends o
{
    final /* synthetic */ o a;
    private boolean b;
    
    public p(final o a, final OutputStream outputStream) {
        this.a = a;
        super(outputStream);
        this.b = true;
    }
    
    public void b(final int n) {
        if (this.b) {
            this.b = false;
            return;
        }
        super.b(n);
    }
}
