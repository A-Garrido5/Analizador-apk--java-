// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class ActivityDetailActivity extends TwitterFragmentActivity
{
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.setTitle(this.getString(intent.getIntExtra("title_res_id", 2131296292)));
        if (bundle == null) {
            final ActivityDetailFragment activityDetailFragment = new ActivityDetailFragment();
            activityDetailFragment.setArguments(TwitterListFragment.a(intent, false));
            this.getSupportFragmentManager().beginTransaction().add(2131886241, activityDetailFragment).commit();
        }
    }
}
