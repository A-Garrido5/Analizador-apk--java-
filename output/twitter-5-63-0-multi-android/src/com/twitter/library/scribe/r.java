// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.database.Cursor;
import android.text.TextUtils;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import android.util.Pair;
import java.util.List;
import android.util.Base64;
import com.twitter.library.featureswitch.d;
import com.twitter.library.network.OAuthToken;
import android.content.Context;

public class r extends s
{
    private boolean k;
    private String l;
    
    public r(final Context context, final long n, final String l, final OAuthToken oAuthToken, final ic ic, final String s, final c c, final q q, final boolean b, final boolean k) {
        super(context, n, oAuthToken, ic, s, c, q, b, ScribeDatabaseHelper$LogType.a);
        this.k = k;
        this.l = l;
    }
    
    public r(final Context context, final long n, final String s, final OAuthToken oAuthToken, final String s2, final ic ic) {
        this(context, n, s, oAuthToken, ic, s2, ScribeDatabaseHelper.a(context, n), ScribeService.a, ScribeService.d, com.twitter.library.featureswitch.d.f("compress_scribe_logs"));
    }
    
    public static String a(final String s) {
        return Base64.encodeToString(yo.a(s.getBytes(r.a)), 0);
    }
    
    private Pair c(final List list) {
        final ArrayList<BasicNameValuePair> list2 = new ArrayList<BasicNameValuePair>();
        if (this.l != null) {
            list2.add(new BasicNameValuePair("lang", this.l));
        }
        final String e = e(list);
        while (true) {
            Label_0140: {
                if (!this.k) {
                    break Label_0140;
                }
                list.add(this.d(list).toString());
                final String a = a(e(list));
                if (a.getBytes().length >= e.getBytes().length) {
                    list.remove(-1 + list.size());
                    break Label_0140;
                }
                final String s = "gzip_log";
                list2.add(new BasicNameValuePair(s, a));
                return new Pair((Object)list2, (Object)a.getBytes().length);
            }
            final String a = e;
            final String s = "log";
            continue;
        }
    }
    
    private TwitterScribeLog d(final List list) {
        final String e = e(list);
        final int length = e.getBytes().length;
        final int length2 = a(e).getBytes().length;
        final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(this.c);
        twitterScribeLog.b(new String[] { "app::scribe:network_activity:send" });
        twitterScribeLog.g("scribe_compression_metrics");
        twitterScribeLog.c(length + "," + length2);
        return twitterScribeLog;
    }
    
    private static String e(final List list) {
        return "[" + TextUtils.join((CharSequence)",", (Iterable)list) + "]";
    }
    
    protected int a(final List list) {
        final Pair c = this.c(list);
        final List list2 = (List)c.first;
        final int intValue = (int)c.second;
        this.h.a(this.d).a(list2).a(this.f).a(this.b);
        return intValue;
    }
    
    protected List a(final String s, final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Log record limit must greater than 0.");
        }
        this.g.a("0", s, ScribeDatabaseHelper$LogType.a.toString(), n);
        final ArrayList<String> list = new ArrayList<String>();
        final Cursor c = this.g.c(s);
        if (c == null) {
            return list;
        }
        try {
            while (c.moveToNext()) {
                list.add(new String(c.getBlob(1)));
            }
        }
        finally {
            c.close();
        }
        c.close();
        return list;
    }
    
    protected boolean b(final List list) {
        return list.size() > 0;
    }
}
