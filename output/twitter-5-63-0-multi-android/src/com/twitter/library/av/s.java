// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeLog;
import android.text.TextUtils;
import android.content.Context;
import com.twitter.library.av.model.a;
import com.twitter.library.av.model.b;
import com.twitter.library.provider.Tweet;

public class s
{
    public void a(final Tweet tweet, final b b, final f f, final a a, final Context context, final c c, final t t) {
        if (a != null) {
            mc i;
            if (b != null) {
                i = b.i();
            }
            else {
                i = null;
            }
            String a2;
            if (i != null) {
                a2 = i.a;
            }
            else {
                a2 = null;
            }
            final String c2 = a.c();
            if (a2 != null && !TextUtils.equals((CharSequence)a2, (CharSequence)c2)) {
                final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(az.a(context).b().g()).b(new String[] { ":::dynamic_video_ads:dynamic_preroll_request_mismatch" });
                final TwitterScribeItem a3 = TwitterScribeItem.a(context, tweet, null, null);
                a3.L = c2;
                a3.ah = a2;
                twitterScribeLog.a(a3);
                c.a(context, twitterScribeLog);
            }
        }
        else {
            boolean b2;
            if (f.a(tweet) != null) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            boolean b3;
            if (b != null) {
                if (b.i() != null) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
            }
            else {
                b3 = false;
            }
            boolean b4;
            if (b2 && !b3) {
                b4 = true;
            }
            else {
                b4 = false;
            }
            boolean b5;
            if (!b3 && t.a(tweet.D)) {
                b5 = true;
            }
            else {
                b5 = false;
            }
            if (b4 || b5) {
                final TwitterScribeLog twitterScribeLog2 = (TwitterScribeLog)new TwitterScribeLog(az.a(context).b().g()).b(new String[] { ":::dynamic_video_ads:dynamic_preroll_request_late" });
                twitterScribeLog2.a(context, tweet, null, null);
                c.a(context, twitterScribeLog2);
            }
        }
    }
}
