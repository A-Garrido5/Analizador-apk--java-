// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.content.Intent;
import com.twitter.android.RelatedTweetsActivity;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import android.text.TextUtils;
import com.twitter.library.api.search.g;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import com.twitter.library.provider.cc;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aw;
import android.support.v4.content.CursorLoader;
import android.content.Context;

public class bb
{
    public static CursorLoader a(final long n, final Context context, final long n2) {
        return new CursorLoader(context, ae.a(aw.a, n2), cc.a, "search_id=? AND s_type =?", new String[] { String.valueOf(n), String.valueOf(0) }, "type_id ASC, _id ASC");
    }
    
    public static g a(final long n, final Context context, final c c, final Session session, final long n2, final String s, final int n3) {
        final String string = "related_to_tweet_id:" + String.valueOf(n);
        String s2;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s2 = string;
        }
        else {
            s2 = s;
        }
        return new g(context, session, n2, string, 12, "related_tweet", s2, n3, RelatedTweetsExperimentHelper.b(), false).a(10, false, false, false).c(31).a(false);
    }
    
    public static void a(final Context context, final long n, final long n2) {
        context.startActivity(new Intent(context, (Class)RelatedTweetsActivity.class).putExtra("status_id", n).putExtra("search_id", n2).putExtra("query", String.format("%s:%d", "related_to_tweet_id:", n)).putExtra("related_tweets", "related_tweet").putExtra("scribe_context", "related_tweets"));
    }
}
