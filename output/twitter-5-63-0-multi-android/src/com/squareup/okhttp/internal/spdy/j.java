// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.List;

final class j implements a
{
    final f a;
    private final bj b;
    private final i c;
    private final boolean d;
    
    j(final bj b, final int n, final boolean d) {
        this.b = b;
        this.d = d;
        this.c = new i(this.b);
        this.a = new f(d, n, this.c);
    }
    
    private List a(final short n, final byte b, final int c) {
        final i c2 = this.c;
        this.c.d = n;
        c2.a = n;
        this.c.b = b;
        this.c.c = c;
        this.a.a();
        this.a.b();
        return this.a.c();
    }
    
    private void a(final b b, short n, final byte b2, final int n2) {
        if (n2 == 0) {
            throw d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        final boolean b3 = (b2 & 0x1) != 0x0;
        int n3;
        if ((b2 & 0x8) != 0x0) {
            n3 = (Integer.MAX_VALUE & this.b.i());
            n -= 4;
        }
        else {
            n3 = -1;
        }
        b.a(false, b3, n2, -1, n3, this.a(n, b2, n2), HeadersMode.d);
    }
    
    private void b(final b b, final short n, final byte b2, final int n2) {
        b.a((b2 & 0x1) != 0x0, n2, this.b, n);
    }
    
    private void c(final b b, final short n, final byte b2, final int n2) {
        if (n != 4) {
            throw d("TYPE_PRIORITY length: %d != 4", new Object[] { n });
        }
        if (n2 == 0) {
            throw d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        b.a(n2, Integer.MAX_VALUE & this.b.i());
    }
    
    private void d(final b b, final short n, final byte b2, final int n2) {
        if (n != 4) {
            throw d("TYPE_RST_STREAM length: %d != 4", new Object[] { n });
        }
        if (n2 == 0) {
            throw d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        final int i = this.b.i();
        final ErrorCode b3 = ErrorCode.b(i);
        if (b3 == null) {
            throw d("TYPE_RST_STREAM unexpected error code: %d", new Object[] { i });
        }
        b.a(n2, b3);
    }
    
    private void e(final b b, final short n, final byte b2, final int n2) {
        if (n2 != 0) {
            throw d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 0x1) != 0x0) {
            if (n != 0) {
                throw d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            b.b();
        }
        else {
            if (n % 8 != 0) {
                throw d("TYPE_SETTINGS length %% 8 != 0: %s", new Object[] { n });
            }
            final u u = new u();
            for (short n3 = 0; n3 < n; n3 += 8) {
                u.a(this.b.i() & 0xFFFFFF, 0, this.b.i());
            }
            b.a(false, u);
            if (u.c() >= 0) {
                this.a.a(u.c());
            }
        }
    }
    
    private void f(final b b, final short n, final byte b2, final int n2) {
        if (n2 == 0) {
            throw d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        b.a(n2, Integer.MAX_VALUE & this.b.i(), this.a((short)(n - 4), b2, n2));
    }
    
    private void g(final b b, final short n, final byte b2, final int n2) {
        int n3 = 1;
        if (n != 8) {
            final Object[] array = new Object[n3];
            array[0] = n;
            throw d("TYPE_PING length != 8: %s", array);
        }
        if (n2 != 0) {
            throw d("TYPE_PING streamId != 0", new Object[0]);
        }
        final int i = this.b.i();
        final int j = this.b.i();
        if ((b2 & 0x1) == 0x0) {
            n3 = 0;
        }
        b.a(n3 != 0, i, j);
    }
    
    private void h(final b b, final short n, final byte b2, final int n2) {
        if (n < 8) {
            throw d("TYPE_GOAWAY length < 8: %s", new Object[] { n });
        }
        if (n2 != 0) {
            throw d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        final int i = this.b.i();
        final int j = this.b.i();
        final short n3 = (short)(n - 8);
        final ErrorCode b3 = ErrorCode.b(j);
        if (b3 == null) {
            throw d("TYPE_GOAWAY unexpected error code: %d", new Object[] { j });
        }
        bk bk = bk.a;
        if (n3 > 0) {
            bk = this.b.c(n3);
        }
        b.a(i, b3, bk);
    }
    
    private void i(final b b, final short n, final byte b2, final int n2) {
        if (n != 4) {
            throw d("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] { n });
        }
        final long n3 = Integer.MAX_VALUE & this.b.i();
        if (n3 == 0L) {
            throw d("windowSizeIncrement was 0", new Object[] { n3 });
        }
        b.a(n2, n3);
    }
    
    @Override
    public void a() {
        if (!this.d) {
            final bk c = this.b.c(h.a.e());
            if (!h.a.equals(c)) {
                throw d("Expected a connection header but was %s", new Object[] { c.a() });
            }
        }
    }
    
    @Override
    public boolean a(final b b) {
        while (true) {
            short n = 0;
            byte b3 = 0;
            int n2 = 0;
            Label_0241: {
                Label_0227: {
                    Label_0213: {
                        Label_0199: {
                            Label_0185: {
                                Label_0171: {
                                    Label_0157: {
                                        Label_0143: {
                                            try {
                                                final int i = this.b.i();
                                                final int j = this.b.i();
                                                n = (short)((0x3FFF0000 & i) >> 16);
                                                final byte b2 = (byte)((0xFF00 & i) >> 8);
                                                b3 = (byte)(i & 0xFF);
                                                n2 = (j & Integer.MAX_VALUE);
                                                switch (b2) {
                                                    default: {
                                                        this.b.b(n);
                                                        return true;
                                                    }
                                                    case 0: {
                                                        break;
                                                    }
                                                    case 1: {
                                                        break Label_0143;
                                                    }
                                                    case 2: {
                                                        break Label_0157;
                                                    }
                                                    case 3: {
                                                        break Label_0171;
                                                    }
                                                    case 4: {
                                                        break Label_0185;
                                                    }
                                                    case 5: {
                                                        break Label_0199;
                                                    }
                                                    case 6: {
                                                        break Label_0213;
                                                    }
                                                    case 7: {
                                                        break Label_0227;
                                                    }
                                                    case 9: {
                                                        break Label_0241;
                                                    }
                                                }
                                            }
                                            catch (IOException ex) {
                                                return false;
                                            }
                                            this.b(b, n, b3, n2);
                                            return true;
                                        }
                                        this.a(b, n, b3, n2);
                                        return true;
                                    }
                                    this.c(b, n, b3, n2);
                                    return true;
                                }
                                this.d(b, n, b3, n2);
                                return true;
                            }
                            this.e(b, n, b3, n2);
                            return true;
                        }
                        this.f(b, n, b3, n2);
                        return true;
                    }
                    this.g(b, n, b3, n2);
                    return true;
                }
                this.h(b, n, b3, n2);
                return true;
            }
            this.i(b, n, b3, n2);
            return true;
        }
    }
    
    @Override
    public void close() {
        this.b.close();
    }
}
