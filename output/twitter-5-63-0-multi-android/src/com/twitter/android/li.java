// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.search.f;
import com.twitter.library.featureswitch.d;
import com.twitter.android.client.bz;
import com.twitter.library.client.k;
import com.twitter.library.client.az;
import android.os.Message;
import com.twitter.library.service.z;
import com.twitter.library.api.search.y;
import com.twitter.library.client.as;
import com.twitter.library.client.Session;
import android.content.Context;
import android.os.Handler;

final class li extends Handler
{
    public static final int[] a;
    private final Context b;
    
    static {
        a = new int[] { 2, 5, 4 };
    }
    
    public li(final Context b) {
        this.b = b;
    }
    
    private void a(final Context context, final Session session, final lq lq, final int n, final int n2, final long n3) {
        as.a(context).a(new y(context, session, n, n2, n3), lq);
    }
    
    public void a(final long n, final int n2, final lq lq, final int... array) {
        for (final int n3 : array) {
            if (this.hasMessages(n3)) {
                this.removeMessages(n3);
            }
            this.sendMessageDelayed(this.obtainMessage(n3, n2, -1, (Object)lq), n);
        }
    }
    
    public void a(final long n, final lq lq, final int... array) {
        this.a(n, -1, lq, array);
    }
    
    public void handleMessage(final Message message) {
        final Context b = this.b;
        final Session b2 = az.a(b).b();
        final as a = as.a(b);
        switch (message.what) {
            case 1: {
                a.a(new oy(b, b2, 0).c(400));
                new k(b, b2.e(), "hometab").a().a("ft", System.currentTimeMillis()).apply();
            }
            case 2: {
                final lq lq = (lq)message.obj;
                final int arg1 = message.arg1;
                long b3;
                if (arg1 > -1) {
                    b3 = arg1;
                }
                else {
                    b3 = bz.b();
                }
                this.a(b, b2, lq, 1, bz.a(), b3);
            }
            case 5: {
                final lq lq2 = (lq)message.obj;
                final int arg2 = message.arg1;
                long n;
                if (arg2 > -1) {
                    n = arg2;
                }
                else {
                    n = 3600000L * d.a("saved_searches_ttl_hours", 1);
                }
                if (d.f("search_concierge_enabled")) {
                    this.a(b, b2, lq2, 4, d.a("search_concierge_max_oneclick", 0), n);
                    return;
                }
                break;
            }
            case 4: {
                a.a(new f(b, b2, 3600000L * d.a("saved_searches_ttl_hours", 1)), (z)null);
            }
            case 6: {
                final oc a2 = oi.a(b, b2, false);
                if (a2 != null) {
                    a.a(a2);
                    return;
                }
                break;
            }
        }
    }
}
