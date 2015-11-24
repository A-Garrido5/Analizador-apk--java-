// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.accounts.AccountManager;
import com.twitter.android.samsung.model.g;
import android.os.Bundle;
import android.content.Context;

@Deprecated
public class StartupWidgetPreferencesActivity extends WidgetPreferencesActivity
{
    private String d;
    
    public StartupWidgetPreferencesActivity() {
        this.d = null;
    }
    
    private void a(final String s) {
        TwitterWidgetProvider.a((Context)this, "widget::::add", this.c);
        if (s != null) {
            i.a((Context)this, s, this.c);
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.c == 0) {
            this.setResult(0);
            this.finish();
        }
        if (g.a((Context)this) == 0) {
            this.a(null);
            this.finish();
        }
        if (g.a((Context)this) == 1) {
            this.d = AccountManager.get((Context)this).getAccountsByType(g.a)[0].name;
            this.finish();
        }
    }
    
    @Override
    protected void onDestroy() {
        this.a(this.d);
        super.onDestroy();
    }
}
