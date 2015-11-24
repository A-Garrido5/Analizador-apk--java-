// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.internal.android.service.a;
import com.twitter.internal.android.service.c;
import com.twitter.android.composer.bh;
import com.twitter.library.provider.DraftTweet;
import com.twitter.library.service.y;
import com.twitter.library.service.z;
import com.twitter.library.client.as;
import com.twitter.library.api.upload.ab;
import android.content.Context;
import com.twitter.library.client.ap;
import com.twitter.library.client.Session;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ca
{
    private static final AtomicInteger a;
    private static final HashMap b;
    
    static {
        a = new AtomicInteger();
        b = new HashMap(2);
    }
    
    public static ap a(final Session session) {
        synchronized (ca.b) {
            return ca.b.get(session.c());
        }
    }
    
    public static String a(final Context context, final Session session, final ap ap) {
        x.a(context).a(2131297345, session);
        final y h = new ab(context, session).a(ap).g(1).h(ca.a.incrementAndGet());
        a(session, ap, h.R());
        return as.a(context).a(h, new cb(context));
    }
    
    public static String a(final Context context, final Session session, final DraftTweet draftTweet) {
        final bh bh = new bh(context, session, draftTweet, true);
        bh.a(new cc(context, session));
        return as.a(context).a(bh);
    }
    
    private static void a(final Session session, final ap ap, final int l) {
        ap.l = l;
        synchronized (ca.b) {
            ca.b.put(session.c(), ap);
        }
    }
    
    private static void b(final Session session, final int n) {
        final String c = session.c();
        synchronized (ca.b) {
            final ap ap = ca.b.get(c);
            if (ap != null && ap.l == n) {
                ca.b.remove(c);
            }
        }
    }
}
