// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import com.twitter.library.provider.DraftTweet;
import com.twitter.library.service.y;
import android.content.Context;
import android.support.v4.util.LruCache;
import com.twitter.library.client.as;
import com.twitter.library.service.z;

public class cm extends z
{
    private static cm a;
    private final as b;
    private final LruCache c;
    
    private cm(final Context context) {
        this.c = new LruCache(100);
        (this.b = as.a(context)).a(cm.a);
    }
    
    public static cm a(final Context context) {
        synchronized (cm.class) {
            if (cm.a == null) {
                cm.a = new cm(context);
            }
            return cm.a;
        }
    }
    
    public static void a() {
        synchronized (cm.class) {
            if (cm.a != null) {
                cm.a.b.b(cm.a);
                cm.a = null;
            }
        }
    }
    
    public cn a(final long n) {
        cn cn = (cn)this.c.get(n);
        if (cn == null) {
            cn = new cn();
            this.c.put(n, cn);
        }
        return cn;
    }
    
    @Override
    public void a(final y y) {
        if (y instanceof ob) {
            final DraftTweet b = ((ob)y).b();
            if (b != null) {
                final long repliedTweetId = b.repliedTweetId;
                if (repliedTweetId > 0L) {
                    final cn cn = (cn)this.c.get(repliedTweetId);
                    if (cn != null) {
                        cn.a = 0L;
                        cn.b = 0L;
                    }
                }
            }
        }
    }
}
