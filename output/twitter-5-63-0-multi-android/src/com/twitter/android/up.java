// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.util.bq;
import java.io.Serializable;
import android.content.Context;
import android.content.Intent;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.view.TweetActionType;
import android.content.DialogInterface;
import com.twitter.library.api.QuotedTweetData;
import android.support.v4.app.FragmentActivity;
import android.util.SparseArray;
import com.twitter.ui.dialog.e;

class up implements e
{
    final /* synthetic */ SparseArray a;
    final /* synthetic */ FragmentActivity b;
    final /* synthetic */ QuotedTweetData c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ ul f;
    
    up(final ul f, final SparseArray a, final FragmentActivity b, final QuotedTweetData c, final long d, final long e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        String s2 = null;
        switch (us.a[((TweetActionType)this.a.get(n2)).ordinal()]) {
            default: {
                final TweetActionType tweetActionType = (TweetActionType)this.a.get(n2);
                String s;
                if (tweetActionType == null) {
                    s = Integer.toString(n2);
                }
                else {
                    s = tweetActionType.name();
                }
                ErrorReporter.a(new IllegalArgumentException("Unhandled QuoteView Long Click Choice:" + s));
                s2 = null;
                break;
            }
            case 1: {
                s2 = "share_via_dm";
                this.b.startActivity(new Intent((Context)this.b, (Class)DMActivity.class).putExtra("quoted_tweet", (Serializable)this.c));
                break;
            }
            case 2: {
                s2 = "share";
                bq.a((Context)this.b, this.c, false);
                break;
            }
            case 3: {
                s2 = "click";
                this.f.a(this.d, this.b);
                break;
            }
        }
        if (s2 != null) {
            this.f.c.a(this.e, TwitterScribeLog.a(this.f.f, "share_sheet", "quoted_tweet", s2));
        }
    }
}
