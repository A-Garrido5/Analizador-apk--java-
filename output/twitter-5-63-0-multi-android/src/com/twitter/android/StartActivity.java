// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;

public class StartActivity extends BaseFragmentActivity
{
    private Intent b() {
        final Intent intent = this.getIntent();
        final Intent intent2 = new Intent((Context)this, (Class)DispatchActivity.class);
        if (intent != null && intent.getCategories() != null && intent.getCategories().contains("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) {
            intent2.putExtra("from_launcher", true);
        }
        return intent2;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.startActivity(this.b());
        this.finish();
    }
}
