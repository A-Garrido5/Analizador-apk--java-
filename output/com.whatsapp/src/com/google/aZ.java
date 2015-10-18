// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

abstract class aZ extends an
{
    aZ(final hN hn) {
        super(hn);
    }
    
    protected abstract int a(final int p0);
    
    protected final void b(final StringBuilder sb, final int n, final int n2) {
        final int c = ay.c;
        final int a = this.a().a(n, n2);
        this.c(sb, a);
        final int a2 = this.a(a);
        int n3 = 100000;
        int i = 0;
        while (i < 5) {
            if (a2 / n3 == 0) {
                sb.append('0');
            }
            n3 /= 10;
            ++i;
            if (c != 0) {
                break;
            }
        }
        sb.append(a2);
    }
    
    protected abstract void c(final StringBuilder p0, final int p1);
}
