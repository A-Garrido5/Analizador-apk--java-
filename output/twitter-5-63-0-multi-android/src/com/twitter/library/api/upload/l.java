// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.RateLimit;
import com.twitter.library.service.aa;
import android.text.TextUtils;
import android.content.Context;

public class l extends e
{
    public l(final Context context) {
        super(context, "");
    }
    
    private void a(final StringBuilder sb, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            if (sb.length() > 0 && sb.charAt(-1 + sb.length()) != ':') {
                sb.append(',');
            }
            sb.append(s);
        }
    }
    
    private void a(final StringBuilder sb, final String s, final com.twitter.internal.network.l l) {
        if (l != null) {
            this.a(sb, s, "statusCode", l.a);
            this.a(sb, s, "durationMs", l.e);
            this.a(sb, s, "readDurationMs", l.f);
            this.a(sb, s, "openDurationMs", l.g);
            this.a(sb, s, "closeDurationMs", l.h);
            this.a(sb, s, "bytesReceived", l.i);
            this.a(sb, s, "contentLength", l.k);
            this.a(sb, s, "errorCode", l.j);
            this.a(sb, s, "reasonPhrase", l.b);
            this.a(sb, s, "exception", l.c);
        }
    }
    
    private void a(final StringBuilder sb, final String s, final aa aa) {
        String s2;
        if (aa.a()) {
            s2 = "success";
        }
        else {
            s2 = "fail";
        }
        this.a(sb, "result", "", s2);
        this.a(sb, s);
        this.a(sb, "Upload_", "error", aa.c());
        this.a(sb, "Upload_", "errorMsg", aa.d());
        this.a(sb, "Upload_", "exception", aa.b());
        this.a(sb, "http_", aa.f());
        final RateLimit g = aa.g();
        if (g != null) {
            this.a(sb, "Rate_", "remainingHits", Integer.toString(g.a()));
        }
    }
    
    private void a(final StringBuilder sb, final String s, final String s2, final int n) {
        if (n != 0 && n != -1) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(s).append(s2).append('=').append(Integer.toString(n));
        }
    }
    
    private void a(final StringBuilder sb, final String s, final String s2, final Exception ex) {
        if (ex != null) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(s).append(s2).append('=').append('\"').append(ex.toString()).append('\"');
        }
    }
    
    private void a(final StringBuilder sb, final String s, final String s2, final Object o) {
        if (o != null) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(s).append(s2).append('=').append(o.toString());
        }
    }
    
    @Override
    public void a(final ag ag, final aa aa) {
    }
    
    @Override
    public void a(final ag ag, final aa aa, final q q) {
        if (q.e()) {
            this.a = "::async_uploader:upload";
        }
        else {
            this.a = "::segmented_uploader:upload";
        }
        final String f = q.f();
        final ArrayList d = q.d();
        String join;
        if (d != null) {
            join = TextUtils.join((CharSequence)",", (Iterable)d);
        }
        else {
            join = "";
        }
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            throw new IllegalStateException();
        }
        String s;
        if (!aa.a()) {
            s = this.a + ":failure";
        }
        else if (q.c() > 1) {
            s = this.a + ":retry";
        }
        else {
            s = this.a + ":success";
        }
        final StringBuilder sb = new StringBuilder();
        this.a(sb, f, aa);
        this.a(sb, TwitterScribeLog.c(this.b));
        sb.append(':');
        this.a(sb, join);
        ScribeService.a(this.b, ((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(ag.P().c).b(new String[] { s })).c(2)).c(sb.toString()));
    }
}
