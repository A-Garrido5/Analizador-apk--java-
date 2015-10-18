// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.support.v4.app.Fragment;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class OrderHistoryActivity extends TwitterFragmentActivity
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(true);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        this.d(false);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(this.getString(2131296614));
        if (bundle == null) {
            this.getSupportFragmentManager().beginTransaction().add(2131886241, new OrderHistoryFragment()).commit();
        }
    }
}
