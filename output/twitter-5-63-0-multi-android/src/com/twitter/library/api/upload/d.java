// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.internal.network.l;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import android.content.Context;

public class d extends e
{
    private boolean c;
    private boolean d;
    
    public d(final Context context) {
        super(context, "::media:upload");
    }
    
    public d a(final boolean c) {
        this.c = c;
        return this;
    }
    
    @Override
    public void a(final ag ag, final aa aa) {
        final l f = aa.f();
        if (f != null) {
            final boolean e = ((k)ag).e();
            final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(ag.P().c);
            final String[] array = { "app:twitter_service:media", null, null };
            String s;
            if (this.c) {
                s = "retry_media";
            }
            else {
                s = "upload_media";
            }
            array[1] = s;
            String s2;
            if (f.a == 200) {
                s2 = "success";
            }
            else {
                s2 = "failure";
            }
            array[2] = s2;
            final TwitterScribeLog twitterScribeLog2 = (TwitterScribeLog)twitterScribeLog.b(array);
            if (this.d) {
                twitterScribeLog2.c(2);
            }
            String s3;
            if (e) {
                s3 = "has_media";
            }
            else {
                s3 = "no_media";
            }
            twitterScribeLog2.g(s3);
            twitterScribeLog2.b(TwitterScribeLog.b(f));
            TwitterScribeLog.a(this.b, twitterScribeLog2, f);
            ScribeService.a(this.b, twitterScribeLog2);
        }
    }
    
    public d b(final boolean d) {
        this.d = d;
        return this;
    }
}
