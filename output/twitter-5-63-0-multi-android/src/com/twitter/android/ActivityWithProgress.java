// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.App;
import com.twitter.library.featureswitch.d;
import android.content.Context;
import android.preference.PreferenceManager;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.widget.ed;
import android.widget.ProgressBar;
import android.os.Handler;
import android.content.SharedPreferences;
import com.twitter.util.n;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class ActivityWithProgress extends TwitterFragmentActivity implements n
{
    protected static boolean a;
    protected SharedPreferences b;
    private Handler c;
    private boolean d;
    private nx e;
    private ProgressBar f;
    
    static {
        ActivityWithProgress.a = false;
    }
    
    public ActivityWithProgress() {
        this.d = false;
    }
    
    public void a(final nz nz) {
        if (nz.b == 5) {
            nz a;
            if (ActivityWithProgress.a) {
                a = nz;
            }
            else {
                a = nz.a(nz.a, nz.b, 0);
            }
            this.c.post((Runnable)new ed(this.c, this.f, a, false, !ActivityWithProgress.a, false));
        }
        else if (this.d) {
            this.c.post((Runnable)new ed(this.c, this.f, nz, true, !ActivityWithProgress.a, true));
        }
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        final boolean a = super.a(jv, toolBar);
        this.f = (ProgressBar)this.findViewById(2131886919);
        return a;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.c = new Handler(this.getApplicationContext().getMainLooper());
        this.b = PreferenceManager.getDefaultSharedPreferences((Context)this);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.e != null) {
            this.e.a();
            ny.a().b(this.e, 2);
            this.e = null;
            ny.a().b(this, 4);
        }
    }
    
    @Override
    protected void onResume() {
        int a = 1;
        super.onResume();
        final String[] array = new String[a];
        array[0] = "enabled";
        this.d = com.twitter.library.featureswitch.d.a("pending_tweet_ui2_3297", array);
        if (this.d) {
            (this.e = new nx(4)).b(2);
            ny.a().a(this, 4);
        }
        if ((!App.a() && !App.b()) || this.b == null || !this.b.getBoolean("data_usage_meter", false)) {
            a = 0;
        }
        ActivityWithProgress.a = (a != 0);
        if (ActivityWithProgress.a) {
            jz.a().b();
            ny.a().a(this, 5);
        }
    }
}
