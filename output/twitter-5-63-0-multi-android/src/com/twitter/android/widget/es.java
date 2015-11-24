// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.client.az;
import com.twitter.library.service.y;
import com.twitter.android.qg;
import java.lang.ref.WeakReference;
import com.twitter.library.provider.Tweet;
import android.content.Context;
import com.twitter.library.service.z;

public class es extends z
{
    private final Context a;
    private final long b;
    private final Tweet c;
    private final boolean d;
    private final WeakReference e;
    
    public es(final Context context, final long b, final Tweet c, final boolean d, final qg qg) {
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new WeakReference((T)qg);
    }
    
    @Override
    public void a(final y y) {
        final qg qg = (qg)this.e.get();
        if (qg != null && y.P().c == az.a(this.a).b().g()) {
            long n;
            if (y instanceof oq) {
                n = ((oq)y).t();
            }
            else {
                n = this.c.E;
            }
            qg.a(n, ((aa)y.l().b()).a(), this.d, y.isCancelled());
        }
    }
    
    @Override
    public void b(final y y) {
        final qg qg = (qg)this.e.get();
        if (qg != null) {
            qg.a(this.b, this.c, this.d);
        }
    }
}
