// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import com.twitter.internal.network.l;
import com.twitter.internal.network.DataUsageEvent;
import com.twitter.internal.network.DataUsageEvent$Type;
import com.twitter.internal.network.b;
import java.util.ArrayList;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.client.ad;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import com.twitter.internal.network.d;

public class f implements d
{
    private static ic a;
    private static ic b;
    private static ic c;
    private final Context d;
    private final long e;
    private boolean f;
    private boolean g;
    private TwitterScribeLog h;
    
    public f(final Context context) {
        this(context, -1L);
    }
    
    public f(final Context context, final long e) {
        this.d = context.getApplicationContext();
        this.e = e;
    }
    
    public static void a(final ic a, final ic b, final ic c) {
        f.a = a;
        f.b = b;
        f.c = c;
    }
    
    @Override
    public void a(final HttpOperation httpOperation) {
        this.f = ad.a().c();
        this.g = TelephonyUtil.c();
        final String a = ScribeService.a(httpOperation, this.e);
        if (a != null) {
            long e;
            if (this.e != -1L) {
                e = this.e;
            }
            else {
                e = 0L;
            }
            (this.h = (TwitterScribeLog)new TwitterScribeLog(e).b(new String[] { a })).g();
        }
    }
    
    @Override
    public void a(final HttpOperation httpOperation, final Exception ex) {
    }
    
    @Override
    public void b(final HttpOperation httpOperation) {
        final l l = httpOperation.l();
        final TwitterScribeLog h = this.h;
        ArrayList<TwitterScribeLog> list = null;
        if (h != null) {
            this.h.a(httpOperation, this.f);
            list = new ArrayList<TwitterScribeLog>();
            list.add(this.h);
        }
        if (this.e != -1L && l.a != 200) {
            ArrayList<TwitterScribeLog> list2;
            if (list == null) {
                list2 = new ArrayList<TwitterScribeLog>();
            }
            else {
                list2 = list;
            }
            list2.add((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.e).a(httpOperation, this.f).b(new String[] { "api::::error" })).b(TwitterScribeLog.b(l))).c(String.valueOf(l.j)));
            list = list2;
        }
        if (list != null) {
            ScribeService.a(this.d, list);
        }
        final long i = httpOperation.l().i;
        final long f = httpOperation.f();
        if (this.f) {
            if (com.twitter.library.network.f.b != null) {
                com.twitter.library.network.f.b.a(i);
                com.twitter.library.network.f.c.a(i);
            }
        }
        else if (com.twitter.library.network.f.a != null) {
            com.twitter.library.network.f.a.a(i);
        }
        com.twitter.internal.network.b.a().a(new DataUsageEvent(DataUsageEvent$Type.a, this.g, i, f));
    }
}
