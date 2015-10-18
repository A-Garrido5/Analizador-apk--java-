// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class l extends ba
{
    public l(final String s) {
        super(s);
    }
    
    l(final byte[] array) {
        super(array);
    }
    
    public l b(final String s) {
        return new l(this.c() + "." + s);
    }
}
