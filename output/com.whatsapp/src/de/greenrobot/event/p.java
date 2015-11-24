// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

import java.lang.reflect.Method;

final class p
{
    final Class a;
    final a b;
    String c;
    final Method d;
    
    p(final Method d, final a b, final Class a) {
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    private void a() {
        synchronized (this) {
            if (this.c == null) {
                final StringBuilder sb = new StringBuilder(64);
                sb.append(this.d.getDeclaringClass().getName());
                sb.append('#').append(this.d.getName());
                sb.append('(').append(this.a.getName());
                this.c = sb.toString();
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof p) {
            this.a();
            final p p = (p)o;
            p.a();
            return this.c.equals(p.c);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.d.hashCode();
    }
}
