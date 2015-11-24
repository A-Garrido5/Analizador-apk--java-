// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.FilterInputStream;

public class h extends FilterInputStream
{
    private final int a;
    private final boolean b;
    private final byte[][] c;
    
    public h(final InputStream inputStream) {
        this(inputStream, ca.a(inputStream));
    }
    
    public h(final InputStream inputStream, final int n) {
        this(inputStream, n, false);
    }
    
    public h(final InputStream inputStream, final int a, final boolean b) {
        super(inputStream);
        this.a = a;
        this.b = b;
        this.c = new byte[11][];
    }
    
    public h(final byte[] array) {
        this(new ByteArrayInputStream(array), array.length);
    }
    
    public h(final byte[] array, final boolean b) {
        this(new ByteArrayInputStream(array), array.length, b);
    }
    
    static int a(final InputStream inputStream, final int n) {
        int n2 = n & 0x1F;
        if (n2 == 31) {
            int n3 = inputStream.read();
            final int n4 = n3 & 0x7F;
            int n5 = 0;
            if (n4 == 0) {
                throw new IOException("corrupted stream - invalid high tag number found");
            }
            while (n3 >= 0 && (n3 & 0x80) != 0x0) {
                n5 = (n5 | (n3 & 0x7F)) << 7;
                n3 = inputStream.read();
            }
            if (n3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            n2 = (n5 | (n3 & 0x7F));
        }
        return n2;
    }
    
    static q a(final int n, final bt bt, final byte[][] array) {
        switch (n) {
            default: {
                throw new IOException("unknown tag " + n + " encountered");
            }
            case 3: {
                return ao.a(bt.a(), bt);
            }
            case 30: {
                return new an(b(bt));
            }
            case 1: {
                return ap.b(a(bt, array));
            }
            case 10: {
                return aq.b(a(bt, array));
            }
            case 24: {
                return new g(bt.b());
            }
            case 27: {
                return new au(bt.b());
            }
            case 22: {
                return new aw(bt.b());
            }
            case 2: {
                return new i(bt.b());
            }
            case 5: {
                return ay.a;
            }
            case 18: {
                return new az(bt.b());
            }
            case 6: {
                return ba.b(a(bt, array));
            }
            case 4: {
                return new bb(bt.b());
            }
            case 19: {
                return new be(bt.b());
            }
            case 20: {
                return new bj(bt.b());
            }
            case 28: {
                return new bn(bt.b());
            }
            case 23: {
                return new y(bt.b());
            }
            case 12: {
                return new bm(bt.b());
            }
            case 26: {
                return new bo(bt.b());
            }
        }
    }
    
    private static byte[] a(final bt bt, final byte[][] array) {
        final int a = bt.a();
        if (bt.a() < array.length) {
            byte[] array2 = array[a];
            if (array2 == null) {
                array2 = new byte[a];
                array[a] = array2;
            }
            aam.a(bt, array2);
            return array2;
        }
        return bt.b();
    }
    
    static int b(final InputStream inputStream, final int n) {
        int i = 0;
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (read == 128) {
            read = -1;
        }
        else if (read > 127) {
            final int n2 = read & 0x7F;
            if (n2 > 4) {
                throw new IOException("DER length more than 4 bytes: " + n2);
            }
            read = 0;
            while (i < n2) {
                final int read2 = inputStream.read();
                if (read2 < 0) {
                    throw new EOFException("EOF found reading length");
                }
                final int n3 = read2 + (read << 8);
                ++i;
                read = n3;
            }
            if (read < 0) {
                throw new IOException("corrupted stream - negative length found");
            }
            if (read >= n) {
                throw new IOException("corrupted stream - out of bounds length found");
            }
        }
        return read;
    }
    
    private static char[] b(final bt bt) {
        final int n = bt.a() / 2;
        final char[] array = new char[n];
        int n2;
        for (int i = 0; i < n; i = n2) {
            final int read = bt.read();
            if (read < 0) {
                break;
            }
            final int read2 = bt.read();
            if (read2 < 0) {
                break;
            }
            n2 = i + 1;
            array[i] = (char)(read << 8 | (read2 & 0xFF));
        }
        return array;
    }
    
    int a() {
        return this.a;
    }
    
    e a(final bt bt) {
        return new h(bt).c();
    }
    
    protected q a(final int n, final int n2, final int n3) {
        int i = 0;
        final boolean b = (n & 0x20) != 0x0;
        final bt bt = new bt(this, n3);
        if ((n & 0x40) != 0x0) {
            return new am(b, n2, bt.b());
        }
        if ((n & 0x80) != 0x0) {
            return new v(bt).a(b, n2);
        }
        if (!b) {
            return a(n2, bt, this.c);
        }
        switch (n2) {
            default: {
                throw new IOException("unknown tag " + n2 + " encountered");
            }
            case 4: {
                final e a = this.a(bt);
                m[] array;
                for (array = new m[a.a()]; i != array.length; ++i) {
                    array[i] = (m)a.a(i);
                }
                return new ac(array);
            }
            case 16: {
                if (this.b) {
                    return new bx(bt.b());
                }
                return at.a(this.a(bt));
            }
            case 17: {
                return at.b(this.a(bt));
            }
            case 8: {
                return new ar(this.a(bt));
            }
        }
    }
    
    protected int b() {
        return b(this, this.a);
    }
    
    e c() {
        final e e = new e();
        while (true) {
            final q d = this.d();
            if (d == null) {
                break;
            }
            e.a(d);
        }
        return e;
    }
    
    public q d() {
        final int read = this.read();
        if (read <= 0) {
            if (read == 0) {
                throw new IOException("unexpected end-of-contents marker");
            }
            return null;
        }
        else {
            final int a = a(this, read);
            int n;
            if ((read & 0x20) != 0x0) {
                n = 1;
            }
            else {
                n = 0;
            }
            final int b = this.b();
            if (b < 0) {
                if (n == 0) {
                    throw new IOException("indefinite length primitive encoding encountered");
                }
                final v v = new v(new bv(this, this.a), this.a);
                if ((read & 0x40) != 0x0) {
                    return new aa(a, v).e();
                }
                if ((read & 0x80) != 0x0) {
                    return new ak(true, a, v).e();
                }
                switch (a) {
                    default: {
                        throw new IOException("unknown BER object encountered");
                    }
                    case 4: {
                        return new ae(v).e();
                    }
                    case 16: {
                        return new ag(v).e();
                    }
                    case 17: {
                        return new ai(v).e();
                    }
                    case 8: {
                        return new as(v).e();
                    }
                }
            }
            else {
                try {
                    return this.a(read, a, b);
                }
                catch (IllegalArgumentException ex) {
                    throw new ASN1Exception("corrupted stream detected", ex);
                }
            }
        }
    }
}
