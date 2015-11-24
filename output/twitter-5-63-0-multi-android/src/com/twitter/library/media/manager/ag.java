// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.util.Iterator;
import com.twitter.library.util.ak;
import com.twitter.errorreporter.ErrorReporter;
import java.util.Collection;
import java.lang.ref.WeakReference;
import com.twitter.internal.android.service.a;

class ag extends a
{
    private final WeakReference a;
    private final Collection e;
    
    public ag(final t t, final Collection e) {
        super(ag.class.getName());
        this.b(3);
        this.a = new WeakReference((T)t);
        this.e = e;
    }
    
    protected Void a() {
        final t t = (t)this.a.get();
        if (t != null) {
            try {
                final ak c = t.c;
                final com.twitter.library.media.manager.a e = t.e;
                for (final String s : this.e) {
                    if (s != null) {
                        if (c != null) {
                            c.a(s);
                        }
                        if (e == null) {
                            continue;
                        }
                        e.d(s);
                    }
                }
            }
            catch (Exception ex) {
                ErrorReporter.a(ex);
            }
        }
        return null;
    }
    
    protected Void b() {
        return null;
    }
}
