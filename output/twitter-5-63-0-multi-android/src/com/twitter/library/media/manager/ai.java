// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.af;
import java.io.File;
import java.lang.ref.WeakReference;
import com.twitter.internal.android.service.a;

class ai extends a
{
    private final WeakReference a;
    private final aj e;
    private final File f;
    
    public ai(final t t, final aj e, final File f) {
        super(ai.class.getName());
        this.b(3);
        this.a = new WeakReference((T)t);
        this.e = e;
        this.f = f;
    }
    
    protected Void a() {
        final t t = (t)this.a.get();
        Label_0063: {
            if (t == null) {
                break Label_0063;
            }
            try {
                final aj e = this.e;
                final Object b = t.b(e, this.f);
                if (b != null) {
                    t.a(e.n(), b);
                    t.a(e, b);
                }
                af.b(this.f);
                return null;
            }
            catch (Exception ex) {
                ErrorReporter.a(ex);
                return null;
            }
        }
    }
    
    protected Void b() {
        return null;
    }
}
