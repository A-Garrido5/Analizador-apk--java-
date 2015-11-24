// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class aN extends aZ
{
    private final String d;
    private final String e;
    
    aN(final hN hn, final String e, final String d) {
        super(hn);
        this.d = d;
        this.e = e;
    }
    
    private void d(final StringBuilder sb, final int n) {
        final int a = this.a().a(n, 16);
        if (a == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.d);
        sb.append(')');
        final int n2 = a % 32;
        final int n3 = a / 32;
        final int n4 = 1 + n3 % 12;
        final int n5 = n3 / 12;
        if (n5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(n5);
        if (n4 / 10 == 0) {
            sb.append('0');
        }
        sb.append(n4);
        if (n2 / 10 == 0) {
            sb.append('0');
        }
        sb.append(n2);
    }
    
    @Override
    protected int a(final int n) {
        return n % 100000;
    }
    
    @Override
    public String c() {
        if (this.b().b() != 84) {
            throw fv.a();
        }
        final StringBuilder sb = new StringBuilder();
        this.a(sb, 8);
        this.b(sb, 48, 20);
        this.d(sb, 68);
        return sb.toString();
    }
    
    @Override
    protected void c(final StringBuilder sb, final int n) {
        final int n2 = n / 100000;
        sb.append('(');
        sb.append(this.e);
        sb.append(n2);
        sb.append(')');
    }
}
