// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import com.twitter.android.client.NotificationService;
import com.twitter.android.widget.NotifyRetweetDialogFragment;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.client.az;
import android.os.Bundle;
import com.twitter.library.provider.Tweet;
import com.twitter.android.qg;

public class NotifyRetweetDialogFragmentActivity extends DialogFragmentActivity implements qg
{
    @Override
    public void a() {
    }
    
    @Override
    public void a(final long n, final Tweet tweet, final boolean b) {
        this.finish();
    }
    
    @Override
    public void a(final long n, final boolean b, final boolean b2, final boolean b3) {
    }
    
    @Override
    protected void a(final Bundle bundle) {
        NotifyRetweetDialogFragment.a(0, az.a((Context)this).b(bundle.getString("sb_account_name")).g(), (Tweet)bundle.getParcelable("tweet"), false, true, (Intent)bundle.getParcelable("retweet_service_intent"), (Context)this).a(this.getSupportFragmentManager());
    }
    
    @Override
    public void b(final long n, final Tweet tweet, final boolean b) {
        NotificationService.a((Context)this, this.getIntent().getExtras());
        this.finish();
    }
    
    @Override
    public void c(final long n, final Tweet tweet, final boolean b) {
        this.finish();
    }
    
    @Override
    public void d(final long n, final Tweet tweet, final boolean b) {
    }
}
