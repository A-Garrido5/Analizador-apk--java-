// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.AsyncTask;
import com.twitter.library.client.ab;
import android.app.Activity;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.os.Handler;
import android.content.Context;
import com.twitter.library.client.af;

public class k implements af
{
    long a;
    long b;
    boolean c;
    private final Context d;
    private final Handler e;
    private final Runnable f;
    
    public k(final Context d) {
        this.d = d;
        this.e = new Handler();
        this.f = new l(this);
    }
    
    void a() {
        this.c = false;
        if (this.a > 0L) {
            final az a = az.a(this.d);
            final long n = System.currentTimeMillis() - this.a - 500L;
            final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(a.b().g());
            twitterScribeLog.b(new String[] { "app::::become_inactive" });
            twitterScribeLog.b(n);
            com.twitter.android.client.c.a(this.d).a(twitterScribeLog);
        }
    }
    
    @Override
    public void a(final Activity activity) {
        this.e.removeCallbacks(this.f);
        this.c = true;
        this.e.postDelayed(this.f, 500L);
        ab.a(this.d).b();
    }
    
    @Override
    public void b(final Activity activity) {
        if (this.c) {
            this.c = false;
            this.e.removeCallbacks(this.f);
        }
        else {
            this.a = System.currentTimeMillis();
        }
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b > 2000L) {
            this.b = currentTimeMillis;
            AsyncTask.execute((Runnable)new m(this.d));
        }
    }
}
