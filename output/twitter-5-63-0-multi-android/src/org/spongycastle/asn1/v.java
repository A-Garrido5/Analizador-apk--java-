// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

public class v
{
    private final InputStream a;
    private final int b;
    private final byte[][] c;
    
    public v(final InputStream inputStream) {
        this(inputStream, ca.a(inputStream));
    }
    
    public v(final InputStream a, final int b) {
        this.a = a;
        this.b = b;
        this.c = new byte[11][];
    }
    
    private void a(final boolean b) {
        if (this.a instanceof bv) {
            ((bv)this.a).a(b);
        }
    }
    
    public d a() {
        final int read = this.a.read();
        if (read == -1) {
            return null;
        }
        this.a(false);
        final int a = h.a(this.a, read);
        final int n = read & 0x20;
        boolean b = false;
        if (n != 0) {
            b = true;
        }
        final int b2 = h.b(this.a, this.b);
        if (b2 < 0) {
            if (!b) {
                throw new IOException("indefinite length primitive encoding encountered");
            }
            final v v = new v(new bv(this.a, this.b), this.b);
            if ((read & 0x40) != 0x0) {
                return new aa(a, v);
            }
            if ((read & 0x80) != 0x0) {
                return new ak(true, a, v);
            }
            return v.a(a);
        }
        else {
            final bt bt = new bt(this.a, b2);
            if ((read & 0x40) != 0x0) {
                return new am(b, a, bt.b());
            }
            if ((read & 0x80) != 0x0) {
                return new ak(b, a, new v(bt));
            }
            if (b) {
                switch (a) {
                    default: {
                        throw new IOException("unknown tag " + a + " encountered");
                    }
                    case 4: {
                        return new ae(new v(bt));
                    }
                    case 16: {
                        return new bg(new v(bt));
                    }
                    case 17: {
                        return new bi(new v(bt));
                    }
                    case 8: {
                        return new as(new v(bt));
                    }
                }
            }
            else {
                Label_0384: {
                    switch (a) {
                        default: {
                            break Label_0384;
                        }
                        case 4: {
                            Label_0399: {
                                break Label_0399;
                                try {
                                    return h.a(a, bt, this.c);
                                    return new bc(bt);
                                }
                                catch (IllegalArgumentException ex) {
                                    throw new ASN1Exception("corrupted stream detected", ex);
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
    
    d a(final int n) {
        switch (n) {
            default: {
                throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(n));
            }
            case 8: {
                return new as(this);
            }
            case 4: {
                return new ae(this);
            }
            case 16: {
                return new ag(this);
            }
            case 17: {
                return new ai(this);
            }
        }
    }
    
    q a(final boolean b, final int n) {
        if (!b) {
            return new bk(false, n, new bb(((bt)this.a).b()));
        }
        final e b2 = this.b();
        if (this.a instanceof bv) {
            if (b2.a() == 1) {
                return new aj(true, n, b2.a(0));
            }
            return new aj(false, n, ab.a(b2));
        }
        else {
            if (b2.a() == 1) {
                return new bk(true, n, b2.a(0));
            }
            return new bk(false, n, at.a(b2));
        }
    }
    
    e b() {
        final e e = new e();
        while (true) {
            final d a = this.a();
            if (a == null) {
                break;
            }
            if (a instanceof bu) {
                e.a(((bu)a).e());
            }
            else {
                e.a(a.a());
            }
        }
        return e;
    }
}
