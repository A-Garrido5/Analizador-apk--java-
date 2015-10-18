// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import android.content.Context;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class PhotoGridActivity extends TwitterFragmentActivity
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        if (kg.a((Context)this)) {
            bn.d(false);
            bn.a(4);
        }
        bn.a(false);
        return bn;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.setTitle(intent.getStringExtra("user_name"));
        this.i(2131297916);
        if (bundle == null) {
            final PhotoGridFragment photoGridFragment = new PhotoGridFragment();
            photoGridFragment.i(!kg.a((Context)this));
            photoGridFragment.setArguments(TwitterListFragment.a(intent, true));
            this.getSupportFragmentManager().beginTransaction().add(2131886241, photoGridFragment).commit();
        }
    }
}
