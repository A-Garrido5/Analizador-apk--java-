// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.ah;
import com.twitter.library.api.MentionEntity;
import com.twitter.library.api.ax;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.provider.ad;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import com.twitter.android.client.bn;
import android.content.Intent;

public class NotificationActivity extends NotificationsBaseTimelineActivity
{
    @Override
    protected jy a(final Intent intent, final bn bn) {
        return new jy(new mq((Context)this, this.getResources(), this.T()).a(intent.getBooleanExtra("activity_mention_only", false)), "connect");
    }
    
    public Tweet a(final TwitterUser twitterUser, final TwitterUser twitterUser2) {
        if (twitterUser != null) {
            final String string = this.getString(2131297596, new Object[] { twitterUser.username });
            final ad ad = new ad();
            if (twitterUser2 == null) {
                ad.b(1934802841L);
                ad.f("TwitterTips");
                ad.c("Twitter Tips");
                ad.d("Twitter Tips");
                ad.e("https://pbs.twimg.com/profile_images/530872164480610304/ITjwbHBa_normal.png");
            }
            else {
                ad.b(twitterUser2.userId);
                ad.f(twitterUser2.username);
                ad.c(twitterUser2.name);
                ad.d(twitterUser2.name);
                ad.e(twitterUser2.profileImageUrl);
            }
            return ad.a(string).a((TweetEntities)new ax().a((MentionEntity)new ah().a(twitterUser.userId).a(twitterUser.username).b(twitterUser.name).f()).f()).a();
        }
        return null;
    }
}
