// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.crashlytics.android.d;
import com.twitter.android.widget.ProgressDialogFragment;
import com.twitter.library.client.AbsFragment;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class PhoneVerifyBaseActivity extends TwitterFragmentActivity implements mo, nv
{
    protected int a;
    protected AbsFragment b;
    private ProgressDialogFragment c;
    
    private int q() {
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        final int backStackEntryCount = supportFragmentManager.getBackStackEntryCount();
        if (backStackEntryCount > 0) {
            final String name = supportFragmentManager.getBackStackEntryAt(backStackEntryCount - 1).getName();
            if (name.equals("manual")) {
                this.ag_();
                supportFragmentManager.popBackStackImmediate();
                if (backStackEntryCount > 1) {
                    this.a = 0;
                    this.b = (AbsFragment)supportFragmentManager.findFragmentByTag("waiting");
                }
            }
            else if (name.equals("waiting")) {
                this.f();
                supportFragmentManager.popBackStackImmediate();
                return backStackEntryCount;
            }
            return backStackEntryCount;
        }
        com.crashlytics.android.d.c("Illegal state: stackCount should not be 0");
        return backStackEntryCount;
    }
    
    @Override
    public void J_() {
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968966);
        bn.a(false);
        bn.b(false);
        return bn;
    }
    
    public void a(final int n) {
        if (this.c == null) {
            (this.c = ProgressDialogFragment.a(n)).setRetainInstance(true);
            this.c.a(this.getSupportFragmentManager(), null);
        }
    }
    
    @Override
    public void a(final boolean b) {
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(2131297431);
        this.a = this.getIntent().getIntExtra("liveFragment", 0);
        if (bundle == null) {
            if (this.a == 0) {
                this.n();
            }
            else if (this.a == 1) {
                this.m();
            }
        }
    }
    
    @Override
    public void d() {
    }
    
    public void g_() {
        this.onBackPressed();
    }
    
    public void j() {
        if (this.a == 1) {
            ((ManualEntryPinFragment)this.b).b();
        }
    }
    
    protected void k() {
        for (int i = this.q(); i > 1; i = this.q()) {}
        this.finish();
    }
    
    protected int l() {
        return this.getSupportFragmentManager().getBackStackEntryCount();
    }
    
    protected void m() {
        this.a = 1;
        this.b = new ManualEntryPinFragment();
        this.getSupportFragmentManager().beginTransaction().add(2131886241, this.b, "manual").addToBackStack("manual").commit();
    }
    
    protected void n() {
        this.a = 0;
        this.b = new PinWaitingFragment();
        this.getSupportFragmentManager().beginTransaction().add(2131886241, this.b, "waiting").addToBackStack("waiting").commit();
    }
    
    public void o() {
        if (this.c != null) {
            this.c.dismiss();
            this.c = null;
        }
    }
    
    @Override
    public void onBackPressed() {
        if (this.q() <= 1) {
            super.onBackPressed();
        }
    }
    
    public void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.a = this.getIntent().getIntExtra("liveFragment", 0);
        if (this.a == 1) {
            this.m();
        }
    }
    
    protected abstract String p();
}
