// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.kz;
import android.content.Context;
import android.os.Bundle;
import com.twitter.library.client.aa;
import com.twitter.android.ju;
import com.twitter.library.client.AbsPreferenceActivity;

public class TwitterPreferenceActivity extends AbsPreferenceActivity implements ju
{
    protected aa X;
    protected c Y;
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968989);
        this.Y = com.twitter.android.client.c.a((Context)this);
        this.X = new kz((Context)this);
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        if (this.X != null) {
            this.Y.b(this.X);
        }
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (this.X != null) {
            this.Y.a(this.X);
        }
    }
    
    @Override
    public boolean v() {
        return true;
    }
}
