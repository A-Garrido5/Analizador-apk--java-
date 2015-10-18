// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.provider.af;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.provider.ActivityDataList;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.provider.Tweet;
import android.os.Bundle;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import com.twitter.android.client.c;
import java.util.ArrayList;
import com.twitter.library.scribe.TwitterScribeAssociation;
import java.util.HashSet;

public class ab
{
    private final HashSet a;
    private final TwitterScribeAssociation b;
    private final ArrayList c;
    private final c d;
    private final Context e;
    
    public ab(final Context e, final TwitterScribeAssociation b) {
        this.a = new HashSet();
        this.c = new ArrayList();
        this.d = com.twitter.android.client.c.a(e);
        this.e = e;
        this.b = b;
    }
    
    public void a(final long n, final String s) {
        if (!this.c.isEmpty()) {
            this.d.a(((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s })).b(this.c));
            this.c.clear();
        }
    }
    
    public void a(final Bundle bundle) {
        final long long1 = bundle.getLong("activity_row_id", -1L);
        final Tweet tweet = (Tweet)bundle.getParcelable("tweet");
        if (this.a.add(long1)) {
            if (tweet != null && !tweet.k) {
                final PromotedContent j = tweet.j;
                if (j != null) {
                    this.d.a(PromotedEvent.a, j);
                }
            }
            this.a(tweet, (TwitterUser)bundle.getParcelable("user"), (ActivityDataList)bundle.getSerializable("list"), bundle.getInt("event_type", 0), 1 + bundle.getInt("position", 0), bundle.getLong("magic_rec_id", -1L));
        }
    }
    
    protected void a(final Tweet tweet, final TwitterUser twitterUser, final ActivityDataList list, final int n, final int g, final long n2) {
        TwitterScribeItem twitterScribeItem;
        long a2;
        if (tweet != null) {
            String s;
            if (tweet.B()) {
                s = "focal";
            }
            else if (tweet.A()) {
                s = "ancestor";
            }
            else {
                s = null;
            }
            final long e = tweet.E;
            final TwitterScribeItem a = TwitterScribeItem.a(this.e, tweet, this.b, s);
            a.b = tweet.L;
            twitterScribeItem = a;
            a2 = e;
        }
        else {
            twitterScribeItem = new TwitterScribeItem();
            if (twitterUser != null) {
                a2 = twitterUser.a();
            }
            else if (list != null) {
                a2 = list.id;
            }
            else {
                a2 = -1L;
            }
        }
        switch (n) {
            case 18:
            case 20: {
                twitterScribeItem.b = "magic_rec_tweet";
                twitterScribeItem.c = 0;
                twitterScribeItem.A = Long.toString(n2);
                break;
            }
            case 19: {
                twitterScribeItem.b = "magic_rec_user";
                twitterScribeItem.c = 3;
                twitterScribeItem.A = Long.toString(n2);
                break;
            }
        }
        twitterScribeItem.a = a2;
        twitterScribeItem.y = af.b.get(n);
        twitterScribeItem.g = g;
        this.c.add(twitterScribeItem);
    }
}
