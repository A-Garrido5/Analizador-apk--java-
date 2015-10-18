// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.internal.android.service.a;
import java.util.Iterator;
import android.os.Bundle;
import com.twitter.internal.network.l;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.y;
import com.twitter.library.api.UserSettings;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.api.timeline.am;
import android.content.Context;
import com.twitter.library.service.z;

public class ah extends z
{
    public final Context a;
    
    public ah(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    private void a(final am am, final x x, final Session session) {
        if (((aa)x.b()).a()) {
            final UserSettings j = session.j();
            if (j != null) {
                j.s = am.b();
            }
        }
    }
    
    @Override
    public void a(final y y) {
        final x l = y.l();
        final az a = az.a(this.a);
        final Session c = a.c(y.P().a);
        if (c != null) {
            final aa aa = (aa)l.b();
            c.a(aa.g());
            if (y.c.equals(am.class.getName())) {
                this.a((am)y, l, c);
            }
            this.a(y, l, c);
            final l f = aa.f();
            int n;
            if (f != null) {
                if (f.a == 401 && f.j == 89) {
                    n = 1;
                }
                else {
                    n = 0;
                }
            }
            else {
                n = 0;
            }
            if (n != 0) {
                final String value = String.valueOf(f.j);
                final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(c.g()).b(new String[] { "api:::unauthorized:error" });
                twitterScribeLog.c(new String[] { value });
                twitterScribeLog.a(aa.e().i().toString(), f);
                ScribeService.a(this.a, twitterScribeLog);
                a.a(c, y);
            }
        }
    }
    
    public void a(final y y, final x x, final Session session) {
        final Bundle o = y.o;
        final Iterator<aa> iterator = x.a().iterator();
        while (iterator.hasNext()) {
            final int int1 = iterator.next().c.getInt("scribe_item_count", -1);
            TwitterScribeLog twitterScribeLog = (TwitterScribeLog)o.getParcelable("scribe_log");
            if (twitterScribeLog == null) {
                final String string = o.getString("scribe_event");
                if (string != null) {
                    twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(session.g()).b(new String[] { string });
                }
                else {
                    twitterScribeLog = null;
                }
            }
            if (twitterScribeLog != null) {
                if (int1 > -1) {
                    twitterScribeLog.f(int1);
                }
                ScribeService.a(this.a, twitterScribeLog);
            }
        }
    }
}
