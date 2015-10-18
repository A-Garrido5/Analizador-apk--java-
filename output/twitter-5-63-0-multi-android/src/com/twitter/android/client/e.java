// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.internal.android.service.a;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.y;
import com.twitter.library.client.k;
import com.twitter.library.service.z;

class e extends z
{
    final /* synthetic */ pb a;
    final /* synthetic */ k b;
    final /* synthetic */ com.twitter.android.client.c c;
    
    e(final com.twitter.android.client.c c, final pb a, final k b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        super.a(y);
        final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(this.a.P().c);
        if (y.X()) {
            this.b.a().a("auto_device_follow_candidate", false).apply();
            twitterScribeLog.b(new String[] { "who_to_follow:nux::device_follow:success" });
        }
        else {
            ((TwitterScribeLog)twitterScribeLog.b(new String[] { "who_to_follow:nux::device_follow:failure" })).d("Friendship_create");
        }
        this.c.a(twitterScribeLog);
    }
}
