// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class CategoriesActivity extends TwitterFragmentActivity
{
    private boolean a;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        this.a = this.getIntent().getBooleanExtra("onboarding", false);
        final boolean a = this.a;
        boolean b = false;
        if (!a) {
            b = true;
        }
        bn.a(b);
        return bn;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        boolean a = super.a(jv, toolBar);
        if (this.a) {
            jv.a(2131951620, toolBar);
            a = true;
        }
        return a;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131887404) {
            this.finish();
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(this.getString(2131296382));
        if (bundle == null) {
            final CategoriesFragment categoriesFragment = new CategoriesFragment();
            categoriesFragment.setArguments(TwitterListFragment.a(this.getIntent(), false));
            this.getSupportFragmentManager().beginTransaction().add(2131886241, categoriesFragment).commit();
        }
    }
}
