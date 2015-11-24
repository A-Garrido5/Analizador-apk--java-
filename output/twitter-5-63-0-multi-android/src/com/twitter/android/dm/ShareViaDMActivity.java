// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dm;

import com.twitter.errorreporter.ErrorReporter;
import android.view.View;
import com.twitter.library.client.d;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import com.twitter.library.client.AbsFragmentActivity;

public class ShareViaDMActivity extends AbsFragmentActivity implements c
{
    public static void a(final Activity activity, final Tweet tweet) {
        activity.startActivity(new Intent((Context)activity, (Class)ShareViaDMActivity.class).putExtra("tweet", (Parcelable)tweet));
    }
    
    @Override
    protected void S_() {
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        final Tweet tweet = (Tweet)this.getIntent().getParcelableExtra("tweet");
        if (tweet != null) {
            this.setContentView((View)new ShareViaDMView((Context)this, tweet, this));
            return;
        }
        ErrorReporter.a(new IllegalStateException("ShareViaDMActivity failed to start due to a null Tweet"));
        this.finish();
    }
    
    @Override
    public void b() {
        this.finish();
    }
    
    @Override
    protected void g_() {
    }
}
