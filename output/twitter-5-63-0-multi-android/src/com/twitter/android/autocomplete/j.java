// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.autocomplete;

import android.util.Pair;
import com.twitter.util.d;
import android.os.Message;
import android.os.Looper;
import java.lang.ref.WeakReference;
import android.os.Handler;

class j extends Handler
{
    private final WeakReference a;
    
    public j(final m m) {
        super(Looper.getMainLooper());
        this.a = new WeakReference((T)m);
    }
    
    public void handleMessage(final Message message) {
        d.a();
        if (message.what == -791613427) {
            final Pair pair = (Pair)message.obj;
            final Object first = pair.first;
            final ln ln = (ln)pair.second;
            final m m = (m)this.a.get();
            if (m == null || this.hasMessages(-559038737)) {
                ln.b();
                return;
            }
            m.b(first, ln);
        }
    }
}
