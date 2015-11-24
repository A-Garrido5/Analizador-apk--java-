// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.net.ProtocolException;
import java.util.List;
import java.io.IOException;

final class w implements a
{
    private final bj a;
    private final boolean b;
    private final o c;
    
    w(final bj a, final boolean b) {
        this.a = a;
        this.c = new o(this.a);
        this.b = b;
    }
    
    private static IOException a(final String s, final Object... array) {
        throw new IOException(String.format(s, array));
    }
    
    private void a(final b b, final int n, final int n2) {
        boolean b2 = true;
        final int i = this.a.i();
        final int j = this.a.i();
        final short g = this.a.g();
        final int n3 = i & Integer.MAX_VALUE;
        final int n4 = j & Integer.MAX_VALUE;
        final int n5 = (0xE000 & g) >>> 13;
        final List a = this.c.a(n2 - 10);
        final boolean b3 = (n & 0x1) != 0x0 && b2;
        if ((n & 0x2) == 0x0) {
            b2 = false;
        }
        b.a(b2, b3, n3, n4, n5, a, HeadersMode.a);
    }
    
    private void b(final b b, final int n, final int n2) {
        b.a(false, (n & 0x1) != 0x0, Integer.MAX_VALUE & this.a.i(), -1, -1, this.c.a(n2 - 4), HeadersMode.b);
    }
    
    private void c(final b b, final int n, final int n2) {
        if (n2 != 8) {
            throw a("TYPE_RST_STREAM length: %d != 8", n2);
        }
        final int n3 = Integer.MAX_VALUE & this.a.i();
        final int i = this.a.i();
        final ErrorCode a = ErrorCode.a(i);
        if (a == null) {
            throw a("TYPE_RST_STREAM unexpected error code: %d", i);
        }
        b.a(n3, a);
    }
    
    private void d(final b b, final int n, final int n2) {
        b.a(false, false, Integer.MAX_VALUE & this.a.i(), -1, -1, this.c.a(n2 - 4), HeadersMode.c);
    }
    
    private void e(final b b, final int n, final int n2) {
        if (n2 != 8) {
            throw a("TYPE_WINDOW_UPDATE length: %d != 8", n2);
        }
        final int i = this.a.i();
        final int j = this.a.i();
        final int n3 = i & Integer.MAX_VALUE;
        final long n4 = j & Integer.MAX_VALUE;
        if (n4 == 0L) {
            throw a("windowSizeIncrement was 0", n4);
        }
        b.a(n3, n4);
    }
    
    private void f(final b b, final int n, final int n2) {
        int n3 = 1;
        if (n2 != 4) {
            final Object[] array = new Object[n3];
            array[0] = n2;
            throw a("TYPE_PING length: %d != 4", array);
        }
        final int i = this.a.i();
        if (this.b != ((i & 0x1) == n3 && n3)) {
            n3 = 0;
        }
        b.a(n3 != 0, i, 0);
    }
    
    private void g(final b b, final int n, final int n2) {
        if (n2 != 8) {
            throw a("TYPE_GOAWAY length: %d != 8", n2);
        }
        final int n3 = Integer.MAX_VALUE & this.a.i();
        final int i = this.a.i();
        final ErrorCode c = ErrorCode.c(i);
        if (c == null) {
            throw a("TYPE_GOAWAY unexpected error code: %d", i);
        }
        b.a(n3, c, bk.a);
    }
    
    private void h(final b b, final int n, final int n2) {
        int n3 = 1;
        final int i = this.a.i();
        if (n2 != 4 + i * 8) {
            final Object[] array = { n2, null };
            array[n3] = i;
            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", array);
        }
        final u u = new u();
        for (int j = 0; j < i; ++j) {
            final int k = this.a.i();
            u.a(k & 0xFFFFFF, (0xFF000000 & k) >>> 24, this.a.i());
        }
        if ((n & 0x1) == 0x0) {
            n3 = 0;
        }
        b.a(n3 != 0, u);
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public boolean a(final b b) {
        while (true) {
            int i = 0;
            int n2 = 0;
            int n3 = 0;
            Label_0266: {
                int n5 = 0;
            Label_0111:
                while (true) {
                    try {
                        i = this.a.i();
                        final int j = this.a.i();
                        if ((Integer.MIN_VALUE & i) != 0x0) {
                            final int n = 1;
                            n2 = (0xFF000000 & j) >>> 24;
                            n3 = (j & 0xFFFFFF);
                            if (n == 0) {
                                break Label_0266;
                            }
                            final int n4 = (0x7FFF0000 & i) >>> 16;
                            n5 = (0xFFFF & i);
                            if (n4 != 3) {
                                throw new ProtocolException("version != 3: " + n4);
                            }
                            break Label_0111;
                        }
                    }
                    catch (IOException ex) {
                        return false;
                    }
                    final int n = 0;
                    continue;
                }
                switch (n5) {
                    default: {
                        this.a.b(n3);
                        return true;
                    }
                    case 1: {
                        this.a(b, n2, n3);
                        return true;
                    }
                    case 2: {
                        this.b(b, n2, n3);
                        return true;
                    }
                    case 3: {
                        this.c(b, n2, n3);
                        return true;
                    }
                    case 4: {
                        this.h(b, n2, n3);
                        return true;
                    }
                    case 6: {
                        this.f(b, n2, n3);
                        return true;
                    }
                    case 7: {
                        this.g(b, n2, n3);
                        return true;
                    }
                    case 8: {
                        this.d(b, n2, n3);
                        return true;
                    }
                    case 9: {
                        this.e(b, n2, n3);
                        return true;
                    }
                }
            }
            final int n6 = Integer.MAX_VALUE & i;
            final int n7 = n2 & 0x1;
            boolean b2 = false;
            if (n7 != 0) {
                b2 = true;
            }
            b.a(b2, n6, this.a, n3);
            return true;
        }
    }
    
    @Override
    public void close() {
        this.c.a();
    }
}
