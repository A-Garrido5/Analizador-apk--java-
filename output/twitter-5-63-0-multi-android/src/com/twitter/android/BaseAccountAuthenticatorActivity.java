// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.accounts.AccountAuthenticatorActivity;

public class BaseAccountAuthenticatorActivity extends AccountAuthenticatorActivity implements jw
{
    private final ad a;
    private boolean b;
    private boolean c;
    private boolean d;
    
    public BaseAccountAuthenticatorActivity() {
        this.a = new ad();
    }
    
    public void a(final ac ac) {
        this.a.a(ac);
    }
    
    public void b(final ac ac) {
        this.a.b(ac);
    }
    
    public boolean h_() {
        return this.b && !this.isFinishing();
    }
    
    public boolean isDestroyed() {
        return this.d;
    }
    
    protected void onCreate(final Bundle bundle) {
        this.a.a((Activity)this, bundle);
        super.onCreate(bundle);
    }
    
    protected void onDestroy() {
        this.d = true;
        super.onDestroy();
        this.a.e((Activity)this);
    }
    
    protected void onNewIntent(final Intent intent) {
        this.a.a((Activity)this, intent);
        super.onNewIntent(intent);
    }
    
    protected void onPause() {
        this.c = false;
        super.onPause();
        this.a.c((Activity)this);
    }
    
    protected void onResume() {
        this.a.b((Activity)this);
        super.onResume();
        this.c = true;
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.b((Activity)this, bundle);
    }
    
    protected void onStart() {
        this.a.a((Activity)this);
        super.onStart();
        this.b = true;
    }
    
    protected void onStop() {
        this.b = false;
        super.onStop();
        this.a.d((Activity)this);
    }
}
