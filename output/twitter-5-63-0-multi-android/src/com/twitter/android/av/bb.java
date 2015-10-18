// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.preference.PreferenceManager;
import com.twitter.library.client.App;
import android.content.Context;

public class bb
{
    private final Context a;
    private final be b;
    private bd c;
    
    public bb(final Context a) {
        this.a = a;
        this.b = new be(this, null);
    }
    
    public void a() {
        this.b.removeMessages(2);
    }
    
    public void a(final long n) {
        final boolean f = App.f();
        boolean boolean1 = false;
        if (f) {
            boolean1 = PreferenceManager.getDefaultSharedPreferences(this.a).getBoolean("video_disable_control_hiding", false);
        }
        if (!boolean1) {
            this.b.removeMessages(2);
            this.b.sendEmptyMessageDelayed(2, n);
        }
    }
    
    public void a(final bd c) {
        this.c = c;
    }
    
    public bd b() {
        return this.c;
    }
}
