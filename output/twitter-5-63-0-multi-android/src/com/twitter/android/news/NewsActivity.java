// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.news;

import android.support.v4.app.Fragment;
import com.twitter.library.featureswitch.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class NewsActivity extends TwitterFragmentActivity
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(0);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(2131297300);
        if (bundle == null) {
            final NewsFragment newsFragment = new NewsFragment();
            final Bundle arguments = new Bundle();
            arguments.putString("country", com.twitter.library.featureswitch.d.a("japan_news_country", "US"));
            arguments.putString("language", com.twitter.library.featureswitch.d.a("japan_news_lang", "en"));
            newsFragment.setArguments(arguments);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, newsFragment).commit();
        }
    }
}
