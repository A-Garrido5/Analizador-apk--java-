// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public abstract class dv extends dD implements aP
{
    private static final String z;
    private final bB b;
    
    static {
        final char[] charArray = "{CM\u000f9JSP\u0019w\\BK\u00129FX\u0004\u001av]\u000bE\\}FMB\u0019kJEP\\tJXW\u001d~J\u000bP\u0005iJ\u0005\u0004\\ICNE\u000f|\u000fFE\u0017|\u000fXQ\u000e|\u000f_L\u001dm\u000fRK\t9NYA\\w@_\u0004\u000fl_[V\u0019j\\BJ\u001b9NE]\\~JEA\u000epLX\u0004\b`_N\u0004\u000bx]EM\u0012~\\\u0005".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0019';
                    break;
                }
                case 0: {
                    c2 = '/';
                    break;
                }
                case 1: {
                    c2 = '+';
                    break;
                }
                case 2: {
                    c2 = '$';
                    break;
                }
                case 3: {
                    c2 = '|';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected dv() {
        this.b = bB.j();
    }
    
    protected dv(final gy gy) {
        this.b = gy.a(gy);
    }
    
    static bB a(final dv dv) {
        return dv.b;
    }
    
    private void a(final ax ax) {
        try {
            if (ax.b() != this.getDefaultInstanceForType()) {
                throw new IllegalArgumentException(dv.z);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    protected int a() {
        return this.b.c();
    }
    
    public final Object a(final ax ax, final int n) {
        this.a(ax);
        return this.b.a(ax.a(ax), n);
    }
    
    @Override
    protected void a() {
        this.b.b();
    }
    
    @Override
    protected boolean a(final cL cl, final fu fu, final int n) {
        return dD.a(this.b, this.getDefaultInstanceForType(), cl, fu, n);
    }
    
    protected boolean b() {
        return this.b.e();
    }
    
    public final boolean b(final ax ax) {
        this.a(ax);
        return this.b.a(ax.a(ax));
    }
    
    protected z c() {
        return new z(this, false, null);
    }
    
    public final Object c(final ax ax) {
        this.a(ax);
        Object o = this.b.c(ax.a(ax));
        if (o != null) {
            return o;
        }
        try {
            o = ax.b(ax);
            return o;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    protected int d() {
        return this.b.f();
    }
    
    public final int d(final ax ax) {
        this.a(ax);
        return this.b.b(ax.a(ax));
    }
    
    protected z e() {
        return new z(this, true, null);
    }
}
