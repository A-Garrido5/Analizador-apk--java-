// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.internal.android.service.x;
import java.util.Date;
import java.text.ParseException;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.text.TextUtils;
import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import java.util.concurrent.TimeUnit;
import com.twitter.util.platform.k;
import java.util.Arrays;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import android.content.Context;
import com.twitter.util.s;
import java.util.Collection;

public final class m extends q
{
    private static final Collection a;
    private static final Collection e;
    private static final s f;
    private final Context g;
    private final int h;
    private int i;
    private long j;
    private long k;
    private long l;
    
    static {
        a = Arrays.asList(HttpOperation$RequestMethod.a, HttpOperation$RequestMethod.b);
        e = Arrays.asList(401, 503);
        f = k.f().a();
    }
    
    public m(final Context context) {
        this(context, 1);
    }
    
    public m(final Context context, final int h) {
        super(m.a, m.e);
        this.g = context.getApplicationContext();
        this.l = TimeUnit.SECONDS.toMillis(30L);
        this.h = h;
    }
    
    @Override
    protected boolean a(final HttpOperation httpOperation, final l l) {
        int n = 1;
        ++this.i;
        switch (l.a) {
            case 401: {
                this.j = 0L;
                return this.i <= this.h && n;
            }
            case 503: {
                if (this.i <= this.h && HttpOperation$RequestMethod.a.equals(httpOperation.h())) {
                    final String b = httpOperation.b("Retry-After");
                    while (true) {
                        Label_0357: {
                            if (TextUtils.isEmpty((CharSequence)b)) {
                                break Label_0357;
                            }
                            try {
                                final long millis = TimeUnit.SECONDS.toMillis(Integer.parseInt(b));
                                final Context g = this.g;
                                final TwitterScribeLog g2 = new TwitterScribeLog(0L).g();
                                final String[] array = new String[n];
                                array[0] = "api:::attempt";
                                ScribeService.a(g, ((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)g2.b(array)).a(503)).c("retry-after")).a(TimeUnit.SECONDS.convert(millis, TimeUnit.MILLISECONDS))).a(httpOperation.i().toString())).b(l.e));
                                if (millis != 0L) {
                                    this.j = millis;
                                    if (this.j + this.k <= this.l) {
                                        this.k += this.j;
                                        return n != 0;
                                    }
                                    break;
                                }
                            }
                            catch (NumberFormatException ex) {
                                try {
                                    final Date parse = m.f.a().parse(b);
                                    if (parse != null) {
                                        final long millis = parse.getTime() - (System.currentTimeMillis() + httpOperation.r());
                                        continue;
                                    }
                                    break Label_0357;
                                }
                                catch (ParseException ex2) {
                                    final long millis = 0L;
                                }
                            }
                            this.j = 0L;
                            if (this.i > this.h) {
                                n = 0;
                            }
                            return n != 0;
                        }
                        final long millis = 0L;
                        continue;
                    }
                }
                break;
            }
        }
        return false;
    }
    
    @Override
    public long b(final x x) {
        return this.j;
    }
}
