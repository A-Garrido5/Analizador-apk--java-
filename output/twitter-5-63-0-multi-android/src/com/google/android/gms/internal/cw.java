// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;

public class cw
{
    protected final int a;
    protected final Class b;
    public final int c;
    protected final boolean d;
    
    int a(final Object o) {
        if (this.d) {
            return this.b(o);
        }
        return this.c(o);
    }
    
    void a(final Object o, final qp qp) {
        if (this.d) {
            this.c(o, qp);
            return;
        }
        this.b(o, qp);
    }
    
    protected int b(final Object o) {
        int n = 0;
        for (int length = Array.getLength(o), i = 0; i < length; ++i) {
            if (Array.get(o, i) != null) {
                n += this.c(Array.get(o, i));
            }
        }
        return n;
    }
    
    protected void b(final Object o, final qp qp) {
        Label_0105: {
            try {
                qp.e(this.c);
                switch (this.a) {
                    default: {
                        throw new IllegalArgumentException("Unknown type " + this.a);
                    }
                    case 10: {
                        break;
                    }
                    case 11: {
                        break Label_0105;
                    }
                }
            }
            catch (IOException ex) {
                throw new IllegalStateException(ex);
            }
            final da da = (da)o;
            final int a = dd.a(this.c);
            qp.a(da);
            qp.c(a, 4);
            return;
        }
        qp.b((da)o);
    }
    
    protected int c(final Object o) {
        final int a = dd.a(this.c);
        switch (this.a) {
            default: {
                throw new IllegalArgumentException("Unknown type " + this.a);
            }
            case 10: {
                return qp.b(a, (da)o);
            }
            case 11: {
                return qp.c(a, (da)o);
            }
        }
    }
    
    protected void c(final Object o, final qp qp) {
        for (int length = Array.getLength(o), i = 0; i < length; ++i) {
            final Object value = Array.get(o, i);
            if (value != null) {
                this.b(value, qp);
            }
        }
    }
}
