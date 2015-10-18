// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.content.Intent;

public class ActivitiesActivity extends ListFragmentActivity
{
    @Override
    protected jy a(final Intent intent, final bn bn) {
        return new jy(new ActivityFragment());
    }
    
    @Override
    protected CharSequence a(final Intent intent) {
        return this.getString(2131296292);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        if (this.getIntent().getIntExtra("activity_type", 0) == 0) {
            this.H().a("connect");
            return;
        }
        this.H().a("network_activity");
    }
}
