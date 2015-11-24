// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import com.twitter.util.l;

public class i
{
    public final Object a;
    public final Object b;
    
    public i(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public static i a(final Object o, final Object o2) {
        return new i(o, o2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final i i = (i)o;
            if (!l.a(this.a, i.a) || !l.a(this.b, i.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * l.a(this.a) + l.a(this.b);
    }
}
