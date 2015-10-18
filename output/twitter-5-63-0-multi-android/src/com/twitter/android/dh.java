// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import com.twitter.library.api.TwitterUser;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.provider.bg;
import android.content.Context;
import java.util.List;
import android.os.AsyncTask;

class dh extends AsyncTask
{
    final /* synthetic */ cx a;
    private final List b;
    private final Context c;
    private final long d;
    
    public dh(final cx a, final List b, final Context c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    protected List a(final Void... array) {
        return bg.a(this.c, this.d).a(CollectionUtils.c(this.b));
    }
    
    protected void a(final List list) {
        this.a.c.clear();
        if (list != null) {
            for (final TwitterUser twitterUser : list) {
                this.a.c.put(twitterUser.userId, twitterUser);
            }
        }
        this.a.a();
        this.a.e = false;
    }
}
