// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.bn;
import android.os.Bundle;
import android.net.Uri;
import com.twitter.library.featureswitch.d;
import android.content.Intent;
import android.content.Context;
import com.twitter.android.client.TwitterWebViewActivity;

public class TweetAnalyticsWebViewActivity extends TwitterWebViewActivity
{
    public static Intent a(final Context context, final String s, final long n) {
        String s2;
        if (d.f("tweet_analytics_with_quick_promote_enabled")) {
            s2 = context.getString(2131298278, new Object[] { n });
        }
        else {
            s2 = context.getString(2131298277, new Object[] { s, n });
        }
        return new Intent(context, (Class)TweetAnalyticsWebViewActivity.class).setData(Uri.parse(s2));
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        super.a(bundle, bn);
        bn.b(14);
        bn.b(false);
        return bn;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        final Uri data = this.getIntent().getData();
        this.setTitle(2131297973);
        this.a(data.toString());
    }
}
