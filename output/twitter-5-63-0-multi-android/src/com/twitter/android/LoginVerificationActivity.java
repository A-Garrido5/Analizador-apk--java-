// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class LoginVerificationActivity extends TwitterFragmentActivity
{
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final String stringExtra = this.getIntent().getStringExtra("lv_account_name");
        this.setTitle(this.getString(2131297229));
        if (bundle == null) {
            final LoginVerificationFragment loginVerificationFragment = new LoginVerificationFragment();
            final Bundle a = TwitterListFragment.a(this.getIntent(), true);
            a.putInt("empty_desc", 2131297235);
            if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                a.putString("lv_account_name", stringExtra);
            }
            loginVerificationFragment.setArguments(a);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, loginVerificationFragment).commit();
        }
    }
}
