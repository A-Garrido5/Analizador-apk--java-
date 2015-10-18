// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.autocomplete;

import com.twitter.library.util.bk;
import com.twitter.util.l;

class i
{
    private Object a;
    
    public Object a() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public boolean a(final Object a) {
        synchronized (this) {
            boolean b;
            if (!l.a(this.a, a)) {
                this.a = a;
                this.notify();
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    public boolean a(final Object o, final int n) {
        boolean b = false;
        synchronized (this) {
            final long n2 = bk.a() + n;
            while (l.a(this.a, o) && bk.a() < n2) {
                final long n3 = n;
                try {
                    this.wait(n3);
                    continue;
                }
                catch (InterruptedException ex) {}
                return b;
            }
            final boolean a = l.a(this.a, o);
            b = false;
            if (!a) {
                b = true;
                return b;
            }
            return b;
        }
    }
    
    public boolean b(final Object o) {
        synchronized (this) {
            return l.a(this.a, o);
        }
    }
}
