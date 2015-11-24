// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

final class c
{
    final p a;
    final int b;
    volatile boolean c;
    final Object d;
    
    c(final Object d, final p a, final int b) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = true;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof c;
        boolean b2 = false;
        if (b) {
            final c c = (c)o;
            final Object d = this.d;
            final Object d2 = c.d;
            b2 = false;
            if (d == d2) {
                final boolean equals = this.a.equals(c.a);
                b2 = false;
                if (equals) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return this.d.hashCode() + this.a.c.hashCode();
    }
}
