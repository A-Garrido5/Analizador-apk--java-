// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.util.bk;
import com.twitter.android.BouncerWebViewActivity;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.preference.PreferenceManager;
import com.twitter.android.dialog.PhoneVerificationDialogFragmentActivity;
import com.twitter.util.collection.CollectionUtils;
import android.content.Intent;
import com.twitter.android.DialogActivity;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.az;
import android.content.Context;

public class ce
{
    private static ce a;
    private final Context b;
    private final az c;
    
    private ce(final Context b) {
        this.b = b;
        this.c = az.a(this.b);
    }
    
    public static ce a(final Context context) {
        synchronized (ce.class) {
            if (ce.a == null) {
                ce.a = new ce(context.getApplicationContext());
            }
            return ce.a;
        }
    }
    
    private static boolean a(final TwitterUser twitterUser) {
        return twitterUser != null && twitterUser.suspended;
    }
    
    private static boolean a(final TwitterUser twitterUser, final int[] array) {
        return a(twitterUser) || b(array);
    }
    
    private void b(final TwitterUser twitterUser) {
        this.b.startActivity(new Intent(this.b, (Class)DialogActivity.class).setAction("blocked_suspended").putExtra("username", twitterUser.username).setFlags(268435456));
    }
    
    private static boolean b(final int[] array) {
        return array != null && CollectionUtils.a(array, 64);
    }
    
    private void c() {
        this.b.startActivity(new Intent(this.b, (Class)PhoneVerificationDialogFragmentActivity.class).setFlags(268435456));
    }
    
    public void a() {
        PreferenceManager.getDefaultSharedPreferences(this.b).edit().putLong("age_gating_failure_time", System.currentTimeMillis()).apply();
    }
    
    void a(final Session session, final aa aa) {
        final az c = this.c;
        if (!c.d(session) || c.b(session) || aa == null) {
            return;
        }
        BouncerWebViewActivity.a(this.b, ae.b(aa), ae.c(aa));
    }
    
    public void a(final int[] array) {
        final TwitterUser f = this.c.b().f();
        if (a(f) && f.needsPhoneVerification) {
            this.c();
        }
        else if (f != null && a(f, array)) {
            this.b(f);
        }
    }
    
    boolean b() {
        return Math.abs(bk.a() - PreferenceManager.getDefaultSharedPreferences(this.b).getLong("age_gating_failure_time", 0L)) < 86400000L;
    }
}
