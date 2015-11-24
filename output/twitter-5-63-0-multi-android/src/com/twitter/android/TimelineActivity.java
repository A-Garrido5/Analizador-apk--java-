// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Toast;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.client.TwitterListFragment;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.client.bn;
import android.os.Bundle;

public class TimelineActivity extends UserQueryActivity
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        return new tk(this, bn);
    }
    
    @Override
    protected jy a(final Intent intent, final bn bn) {
        final tk tk = (tk)bn;
        final TimelineFragment timelineFragment = new TimelineFragment();
        timelineFragment.i(!kg.a((Context)this));
        if (tk.b) {
            intent.putExtra("owner_id", this.b);
            intent.putExtra("type", tk.c);
        }
        timelineFragment.a(intent).h(tk.a);
        return new jy(timelineFragment);
    }
    
    @Override
    protected CharSequence a(final Intent intent) {
        final String stringExtra = intent.getStringExtra("title_string");
        if (stringExtra != null) {
            return stringExtra;
        }
        return this.getString(intent.getIntExtra("title", 2131297085));
    }
    
    @Override
    protected void a(final TwitterUser twitterUser) {
        super.a(twitterUser);
        final TimelineFragment timelineFragment = (TimelineFragment)this.getSupportFragmentManager().findFragmentById(2131886241);
        if (timelineFragment != null) {
            timelineFragment.a(twitterUser);
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        if (((tk)bn).b && this.c == null && this.b == 0L) {
            Toast.makeText((Context)this, 2131298000, 1).show();
            this.finish();
            return;
        }
        this.h();
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        final TimelineFragment timelineFragment = (TimelineFragment)this.getSupportFragmentManager().findFragmentById(2131886241);
        timelineFragment.i(!kg.a((Context)this));
        this.H().a(timelineFragment.I());
    }
}
