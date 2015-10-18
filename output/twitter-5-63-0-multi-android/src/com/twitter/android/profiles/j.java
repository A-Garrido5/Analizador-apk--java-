// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.media.model.MediaFile;
import android.app.Activity;
import android.net.Uri;
import com.twitter.library.media.util.m;
import com.twitter.library.client.k;
import com.twitter.internal.android.service.a;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.service.ab;
import com.twitter.library.client.as;
import com.twitter.library.util.bk;
import com.twitter.library.api.TwitterUser;
import android.content.Context;

public class j
{
    private final Context a;
    
    public j(final Context a) {
        this.a = a;
    }
    
    private boolean b(final TwitterUser twitterUser) {
        boolean b = true;
        final long long1 = this.c(twitterUser.username).getLong("ht", 0L);
        if (long1 != 0L) {
            final boolean b2 = long1 + 600000L < bk.a() && b;
            if (b2) {
                this.b(twitterUser.username);
                as.a(this.a).a(new n(this.a, new ab(twitterUser.userId, twitterUser.username, null, b)));
            }
            b = b2;
        }
        return b;
    }
    
    private k c(final String s) {
        return new k(this.a, s, "profile");
    }
    
    public String a(final TwitterUser twitterUser) {
        if (twitterUser != null && !this.b(twitterUser)) {
            return Uri.fromFile(m.b(this.a, twitterUser.userId)).toString();
        }
        return null;
    }
    
    public void a(final Activity activity, final TwitterUser twitterUser, final com.twitter.android.profiles.m m) {
        new com.twitter.android.profiles.k(activity, twitterUser.userId, m).execute((Object[])new Void[0]);
    }
    
    public void a(final Activity activity, final TwitterUser twitterUser, final MediaFile mediaFile, final com.twitter.android.profiles.m m) {
        new l(activity, mediaFile, twitterUser.userId, m).execute((Object[])new Void[0]);
    }
    
    public void a(final String s) {
        this.c(s).a().a("ht", System.currentTimeMillis()).apply();
    }
    
    public void b(final String s) {
        this.c(s).a().a("ht").apply();
    }
}
