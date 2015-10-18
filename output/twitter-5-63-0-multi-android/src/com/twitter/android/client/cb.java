// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.internal.android.service.c;
import com.twitter.android.composer.bh;
import com.twitter.library.provider.DraftTweet;
import com.twitter.library.client.as;
import com.twitter.library.client.ap;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.ab;
import com.twitter.library.client.az;
import com.twitter.library.service.y;
import android.os.Bundle;
import com.twitter.library.media.util.m;
import com.twitter.android.profiles.j;
import com.twitter.library.media.util.ak;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.media.manager.q;
import com.twitter.library.media.model.MediaFile;
import android.os.Parcelable;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.aa;
import com.twitter.library.api.upload.w;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.z;

class cb extends z
{
    private final Context a;
    
    public cb(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    private void a(final Session session, final w w, final aa aa) {
        final x a = x.a(this.a);
        final Bundle o = w.o;
        final boolean a2 = aa.a();
        TwitterUser twitterUser;
        if (a2) {
            twitterUser = (TwitterUser)o.getParcelable("user");
        }
        else {
            final TwitterUser f = session.f();
            o.putParcelable("user", (Parcelable)f);
            twitterUser = f;
        }
        final boolean b = a2 && twitterUser != null;
        long userId;
        if (twitterUser != null) {
            userId = twitterUser.userId;
        }
        else {
            userId = 0L;
        }
        final MediaFile mediaFile = (MediaFile)o.getParcelable("avatar_media");
        if (mediaFile != null && b) {
            q.a(this.a).a(UserImageRequest.a(twitterUser.profileImageUrl, -3).a(), mediaFile.file);
        }
        else {
            ak.a().b(userId);
        }
        final j j = new j(this.a);
        if (w.b() && b) {
            j.b(twitterUser.username);
            m.d(this.a, twitterUser.userId);
        }
        if (o.getParcelable("header_media") != null && b) {
            j.a(twitterUser.username);
        }
        if (mediaFile != null && b) {
            mediaFile.c();
        }
        b(session, w.R());
        int n = 0;
        if (b) {
            n = 2131297344;
            if (userId == session.g()) {
                session.a(twitterUser);
            }
        }
        else {
            switch (aa.c()) {
                default: {
                    n = 2131297343;
                    break;
                }
                case 503: {
                    n = 2131297342;
                    break;
                }
                case 422: {
                    n = 2131297341;
                    break;
                }
            }
        }
        a.a(b, n, o, session);
    }
    
    @Override
    public void a(final y y) {
        final az a = az.a(this.a);
        final ab p = y.P();
        final Session b = a.b();
        if (p.c != b.g()) {
            return;
        }
        this.a(b, (w)y, (aa)y.l().b());
    }
}
