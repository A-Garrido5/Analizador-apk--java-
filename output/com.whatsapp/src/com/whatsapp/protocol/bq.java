// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.IOException;
import java.io.ByteArrayOutputStream;

public abstract class bq
{
    private static final String[] z;
    bc a;
    bf b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    b6 i;
    co j;
    byte[] k;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0013p=B\u001c\u0013zk@\u001c\u0015} \u0003\u0003\u001fj?J\u001e\u001d";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'p';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "/J\r\u000eH";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public bq(final b6 i, final bc a, final co j) {
        this.a = a;
        this.j = j;
        this.i = i;
    }
    
    private void a(final ByteArrayOutputStream byteArrayOutputStream, final String s) {
        if (s == null) {
            return;
        }
        try {
            byteArrayOutputStream.write(s.getBytes(bq.z[1]));
        }
        catch (IOException ex) {}
    }
    
    private byte[] c() {
        if (this.k != null) {
            return this.k;
        }
        if (this.d != null || this.f != null || this.e != null || this.c != null || this.h != null || this.g != null) {
            final cd cd = new cd();
            this.a(cd, this.d);
            cd.write(0);
            this.a(cd, this.f);
            cd.write(0);
            this.a(cd, this.e);
            cd.write(0);
            this.a(cd, this.c);
            cd.write(0);
            this.a(cd, this.h);
            cd.write(0);
            this.a(cd, this.g);
            this.b(cd.toByteArray());
            return this.k;
        }
        return new byte[0];
    }
    
    private byte[] d() {
        final long n = System.currentTimeMillis() / 1000L;
        if (n < 1000000000L) {
            return String.valueOf(n + 10000000000L).substring(1).getBytes();
        }
        if (n >= 10000000000L) {
            throw new IOException(bq.z[0]);
        }
        return Long.toString(n).getBytes();
    }
    
    public bc a() {
        return this.a;
    }
    
    public void a(final bf b) {
        this.b = b;
    }
    
    public void a(final String d) {
        this.d = d;
    }
    
    abstract void a(final boolean p0);
    
    protected byte[] a(final byte[] array) {
        final byte[] bytes = this.b.A.getBytes();
        final byte[] d = this.d();
        final byte[] c = this.c();
        final int n = array.length + bytes.length + d.length + c.length;
        final byte[] array2 = new byte[n + 4];
        System.arraycopy(bytes, 0, array2, 4, bytes.length);
        final int n2 = 4 + bytes.length;
        System.arraycopy(array, 0, array2, n2, array.length);
        final int n3 = n2 + array.length;
        System.arraycopy(d, 0, array2, n3, d.length);
        final int n4 = n3 + d.length;
        if (c.length > 0) {
            System.arraycopy(c, 0, array2, n4, c.length);
        }
        this.b.D.b(array2, 4, n);
        System.arraycopy(this.b.D.a(), 0, array2, 0, 4);
        return array2;
    }
    
    public co b() {
        return this.j;
    }
    
    public void b(final String f) {
        this.f = f;
    }
    
    public void b(final byte[] k) {
        this.k = k;
    }
    
    public void c(final String e) {
        this.e = e;
    }
    
    public void d(final String h) {
        this.h = h;
    }
    
    public void e(final String c) {
        this.c = c;
    }
    
    public void f(final String g) {
        this.g = g;
    }
}
