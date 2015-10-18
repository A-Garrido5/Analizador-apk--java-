// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

class bw implements Enumeration
{
    private h a;
    private Object b;
    
    public bw(final byte[] array) {
        this.a = new h(array, true);
        this.b = this.a();
    }
    
    private Object a() {
        try {
            return this.a.d();
        }
        catch (IOException ex) {
            throw new ASN1ParsingException("malformed DER construction: " + ex, ex);
        }
    }
    
    @Override
    public boolean hasMoreElements() {
        return this.b != null;
    }
    
    @Override
    public Object nextElement() {
        final Object b = this.b;
        this.b = this.a();
        return b;
    }
}
