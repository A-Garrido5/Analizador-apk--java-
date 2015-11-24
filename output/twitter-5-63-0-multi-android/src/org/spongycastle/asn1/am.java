// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class am extends q
{
    private final boolean a;
    private final int b;
    private final byte[] c;
    
    public am(final int b, final e e) {
        this.b = b;
        this.a = true;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != e.a()) {
            try {
                byteArrayOutputStream.write(((k)e.a(i)).a("DER"));
                ++i;
                continue;
            }
            catch (IOException ex) {
                throw new ASN1ParsingException("malformed object: " + ex, ex);
            }
            break;
        }
        this.c = byteArrayOutputStream.toByteArray();
    }
    
    am(final boolean a, final int b, final byte[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    void a(final o o) {
        int n = 64;
        if (this.a) {
            n = 96;
        }
        o.a(n, this.b, this.c);
    }
    
    @Override
    boolean a(final q q) {
        if (q instanceof am) {
            final am am = (am)q;
            if (this.a == am.a && this.b == am.b && aag.a(this.c, am.c)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        boolean b;
        if (this.a) {
            b = true;
        }
        else {
            b = false;
        }
        return (b ? 1 : 0) ^ this.b ^ aag.a(this.c);
    }
    
    @Override
    int i() {
        return ca.b(this.b) + ca.a(this.c.length) + this.c.length;
    }
}
