// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.search.TwitterSearchQuery;
import java.util.ArrayList;
import android.database.Cursor;

public class a extends r
{
    public a(final Cursor cursor) {
        super(cursor);
    }
    
    @Override
    public void a() {
        TwitterSearchQuery twitterSearchQuery = null;
        final Cursor e = this.e;
        if (e != null && e.moveToFirst()) {
            long n = 0L;
            this.c = new ArrayList();
            do {
                final long long1 = e.getLong(3);
                if (long1 != n) {
                    if (twitterSearchQuery != null) {
                        this.c.add(twitterSearchQuery);
                    }
                    twitterSearchQuery = new TwitterSearchQuery(e.getString(1), e.getString(2), e.getLong(3), new ArrayList());
                    n = long1;
                }
                final TwitterUser b = new TwitterUser().a(e.getLong(4)).e(e.getString(6)).b(e.getString(7));
                if (twitterSearchQuery != null) {
                    twitterSearchQuery.i.add(b);
                }
            } while (e.moveToNext());
            return;
        }
        this.c = null;
    }
    
    public Bundle getExtras() {
        final Bundle bundle = new Bundle(super.getExtras());
        final TwitterSearchQuery twitterSearchQuery = (TwitterSearchQuery)this.c();
        bundle.putString("name", twitterSearchQuery.a);
        bundle.putString("query", twitterSearchQuery.b);
        bundle.putParcelableArrayList("users", twitterSearchQuery.i);
        return bundle;
    }
    
    public long getLong(final int n) {
        if (n == 0) {
            return this.c.get(this.d).g;
        }
        return super.getLong(n);
    }
    
    public String getString(final int n) {
        if (n == 1) {
            return this.c.get(this.d).a;
        }
        if (n == 2) {
            return this.c.get(this.d).b;
        }
        return super.getString(n);
    }
}
