// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

public class bz
{
    private String a;
    private int b;
    
    public bz(final String a) {
        this.a = a;
        this.b = 0;
    }
    
    public boolean a() {
        return this.b != -1;
    }
    
    public String b() {
        if (this.b == -1) {
            return null;
        }
        final int index = this.a.indexOf(46, this.b);
        if (index == -1) {
            final String substring = this.a.substring(this.b);
            this.b = -1;
            return substring;
        }
        final String substring2 = this.a.substring(this.b, index);
        this.b = index + 1;
        return substring2;
    }
}
