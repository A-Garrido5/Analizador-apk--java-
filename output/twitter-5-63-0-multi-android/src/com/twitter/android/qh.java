// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.provider.bg;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.util.collection.CollectionUtils;
import java.util.Collection;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.p;

public class qh extends p
{
    private final long[] a;
    
    public qh(final Context context, final Session session, final Collection collection) {
        super(context, qh.class.getName(), session);
        this.a = CollectionUtils.c(collection);
    }
    
    @Override
    protected void a() {
        final bg t = this.t();
        final long c = this.h().c;
        for (final long n : this.a) {
            ScribeService.a(this.i, new TwitterScribeLog(c).b("home", null, null, "polled_content", "impression"));
        }
        t.a(this.a, c, 0);
    }
}
