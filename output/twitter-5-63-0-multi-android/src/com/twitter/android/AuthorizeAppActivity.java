// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import android.content.Intent;
import com.twitter.library.service.AuthTokenService;
import android.accounts.Account;
import android.content.Context;
import android.widget.Toast;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ServiceConnection;
import com.twitter.android.client.TwitterFragmentActivity;

public class AuthorizeAppActivity extends TwitterFragmentActivity implements al
{
    private ServiceConnection a;
    private String b;
    private String c;
    
    private CharSequence h() {
        final ComponentName callingActivity = this.getCallingActivity();
        if (callingActivity == null) {
            return null;
        }
        final PackageManager packageManager = this.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(callingActivity.getPackageName(), 0));
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    private void i() {
        if (this.a != null) {
            this.unbindService(this.a);
            this.a = null;
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.b(10);
        bn.d(false);
        bn.b(false);
        bn.a(false);
        bn.a(0);
        return bn;
    }
    
    public void a(final int n) {
        Toast.makeText((Context)this, n, 1).show();
        this.finish();
    }
    
    @Override
    public void a(final Account account) {
        final aj a = new aj(this.b, this.c, new ak(this), account);
        if (this.a((Context)this, (ServiceConnection)a, 1)) {
            this.a = (ServiceConnection)a;
            return;
        }
        this.a = null;
        this.a(2131296290);
    }
    
    public boolean a(final Context context, final ServiceConnection serviceConnection, final int n) {
        return context.bindService(new Intent((Context)this, (Class)AuthTokenService.class), serviceConnection, n);
    }
    
    @Override
    public void b() {
        this.setResult(0);
        this.finish();
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.b = intent.getStringExtra("ck");
        this.c = intent.getStringExtra("cs");
        if (bundle == null) {
            final AuthorizeAppFragment authorizeAppFragment = new AuthorizeAppFragment();
            final CharSequence h = this.h();
            if (h != null) {
                final Bundle arguments = new Bundle();
                arguments.putCharSequence("app_name", h);
                arguments.putCharSequence("app_consumer_key", (CharSequence)this.b);
                authorizeAppFragment.setArguments(arguments);
            }
            authorizeAppFragment.a(this);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, authorizeAppFragment).commit();
            return;
        }
        ((AuthorizeAppFragment)this.getSupportFragmentManager().findFragmentById(2131886241)).a(this);
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            default: {
                super.onActivityResult(n, n2, intent);
                break;
            }
            case 1: {
                if (n2 != -1) {
                    this.finish();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    protected void onDestroy() {
        this.i();
        super.onDestroy();
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        if (!this.U().d()) {
            this.startActivityForResult(new Intent((Context)this, (Class)LoginActivity.class).putExtra("add_account", true).putExtra("authorize_account", true), 1);
        }
    }
}
