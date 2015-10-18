// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.library.scribe.ScribeLog;
import java.util.Locale;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.network.g;
import com.twitter.library.service.aa;
import com.twitter.internal.network.l;
import com.twitter.internal.android.service.x;
import java.io.InputStream;
import android.os.SystemClock;
import com.twitter.library.service.t;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.internal.android.service.d;
import com.twitter.library.network.a;
import com.twitter.internal.network.j;
import com.twitter.library.service.y;

public class s extends y implements j
{
    private final String a;
    private final com.twitter.library.network.a e;
    private final com.twitter.library.media.manager.a f;
    private long g;
    private boolean h;
    private s i;
    private boolean j;
    private final ResourceRequestType k;
    private final d l;
    
    public s(final Context context, final Session session, final String a, final com.twitter.library.network.a e, final com.twitter.library.media.manager.a f, final ResourceRequestType k) {
        super(context, a, session);
        this.g = 0L;
        this.h = false;
        this.j = false;
        this.a = a;
        this.e = e;
        this.f = f;
        this.k = k;
        this.l = new d();
        if (k == ResourceRequestType.a) {
            this.b(2);
            this.a(new t());
        }
        else if (k == ResourceRequestType.b || k == ResourceRequestType.c) {
            this.b(5);
            this.a(Integer.MAX_VALUE);
        }
        this.g = SystemClock.elapsedRealtime();
    }
    
    @Override
    public Runnable a(final a a) {
        if (a instanceof s) {
            this.i = (s)a;
        }
        return null;
    }
    
    @Override
    public final void a(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        this.f.a(this.a, inputStream);
    }
    
    @Override
    public void a(final x x) {
        this.d(x);
    }
    
    @Override
    public void a(final l l) {
    }
    
    @Override
    protected void a_(final aa aa) {
        this.j = true;
        aa.a(new g(this.p, this.a).a(this.e).a(this).a(this.l).a(45000).a().c());
    }
    
    @Override
    protected boolean c(final aa aa) {
        if (this.k == ResourceRequestType.b && !TelephonyUtil.c()) {
            this.cancel(true);
            return false;
        }
        if (this.i != null) {
            final x l = this.i.l();
            if (l != null) {
                final aa aa2 = (aa)l.b();
                if (aa2 != null) {
                    final HttpOperation e = aa2.e();
                    if (e != null && e.j()) {
                        aa.a(e);
                        this.h = true;
                        return false;
                    }
                }
            }
            this.i = null;
        }
        return super.c(aa);
    }
    
    public void d(final x x) {
        int n;
        if (!this.h && ScribeService.a("resource_fetch_scribe_sample")) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            return;
        }
        final long n2 = SystemClock.elapsedRealtime() - this.g;
        final aa aa = (aa)x.b();
        String s;
        if (aa.a()) {
            s = "success";
        }
        else {
            s = "failure";
        }
        final int n3 = -1 + x.a().size();
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.P().c).b(new String[] { "app:twitter_service:media:downloaded", s });
        String string;
        if (TelephonyUtil.d()) {
            if (TelephonyUtil.c()) {
                string = "wifi";
            }
            else {
                string = "cellular_" + TelephonyUtil.b();
            }
        }
        else {
            string = "disconnected";
        }
        twitterScribeLog.g();
        final l f = aa.f();
        final HttpOperation e = aa.e();
        if (f != null && e != null && e.i() != null) {
            twitterScribeLog.a(e.i().toString(), f);
        }
        twitterScribeLog.a((long)n3);
        twitterScribeLog.d(string);
        String name;
        if (f != null && f.c != null) {
            name = f.c.getClass().getName();
        }
        else {
            name = "none";
        }
        final Locale english = Locale.ENGLISH;
        final Object[] array = { n2, this.isCancelled(), null, null, null };
        int k;
        if (f != null) {
            k = f.k;
        }
        else {
            k = 0;
        }
        array[2] = k;
        array[3] = name;
        array[4] = this.j;
        twitterScribeLog.c(String.format(english, "total_duration_ms:%d,is_canceled:%b,content_length:%d,exception:%s,executed:%b", array));
        ScribeService.a(this.p, twitterScribeLog);
    }
    
    @Override
    public d m() {
        return this.l;
    }
    
    @Override
    protected String p() {
        return "resource_fetch_" + this.a;
    }
}
