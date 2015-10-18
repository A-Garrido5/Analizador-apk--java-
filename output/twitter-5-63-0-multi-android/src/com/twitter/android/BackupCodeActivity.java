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

public class BackupCodeActivity extends TwitterFragmentActivity
{
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(false);
        return bn;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final String stringExtra = this.getIntent().getStringExtra("bc_account_name");
        final boolean booleanExtra = this.getIntent().getBooleanExtra("show_welcome", false);
        this.setTitle(this.getString(2131297217));
        if (bundle == null) {
            final BackupCodeFragment backupCodeFragment = new BackupCodeFragment();
            final Bundle a = TwitterListFragment.a(this.getIntent(), false);
            if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                a.putString("bc_account_name", stringExtra);
                a.putBoolean("show_welcome", booleanExtra);
            }
            backupCodeFragment.setArguments(a);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, backupCodeFragment).commit();
        }
    }
}
