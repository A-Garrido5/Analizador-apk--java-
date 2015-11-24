// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class BaseFragmentActivity extends FragmentActivity implements jw
{
    private final ad a;
    private boolean b;
    private boolean c;
    private boolean d;
    
    public BaseFragmentActivity() {
        this.a = new ad();
    }
    
    @Override
    public void a(final ac ac) {
        this.a.a(ac);
    }
    
    @Override
    public void b(final ac ac) {
        this.a.b(ac);
    }
    
    public boolean h_() {
        return this.b && !this.isFinishing();
    }
    
    public boolean i_() {
        return this.c;
    }
    
    public boolean isDestroyed() {
        return this.d;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.a.a(this, bundle);
        super.onCreate(bundle);
    }
    
    @Override
    protected void onDestroy() {
        this.d = true;
        super.onDestroy();
        this.a.e(this);
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        this.a.a(this, intent);
        super.onNewIntent(intent);
    }
    
    @Override
    protected void onPause() {
        this.c = false;
        super.onPause();
        this.a.c(this);
    }
    
    @Override
    protected void onResume() {
        this.a.b(this);
        super.onResume();
        this.c = true;
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.b(this, bundle);
    }
    
    @Override
    protected void onStart() {
        this.a.a(this);
        super.onStart();
        this.b = true;
    }
    
    @Override
    protected void onStop() {
        this.b = false;
        super.onStop();
        this.a.d(this);
    }
}
