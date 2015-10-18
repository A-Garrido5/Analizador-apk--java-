// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.util.Map;
import java.util.Locale;
import com.twitter.library.service.f;
import java.util.TimeZone;
import android.util.Pair;
import com.twitter.util.q;
import java.util.HashMap;
import android.text.TextUtils;
import com.twitter.library.service.b;
import java.util.ArrayList;
import java.net.URI;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.util.UUID;
import android.preference.PreferenceManager;
import com.twitter.library.api.bd;
import android.os.Bundle;
import com.twitter.library.service.aa;
import android.net.Uri;
import com.twitter.library.api.RateLimit;
import com.twitter.internal.network.HttpOperation;
import android.content.SharedPreferences;
import android.provider.Settings$Secure;
import com.twitter.util.i;
import java.util.Collections;
import java.util.LinkedList;
import com.twitter.util.c;
import android.util.Log;
import com.twitter.library.client.App;
import android.content.Context;
import java.util.List;

public class ae
{
    public static final int[] a;
    public static final String[] b;
    public static final int[] c;
    private static final boolean m;
    private static ae n;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ag h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    private final List o;
    private Context p;
    
    static {
        a = new int[0];
        b = new String[0];
        c = new int[0];
        final boolean l = App.l();
        boolean i = false;
        if (l) {
            final boolean loggable = Log.isLoggable("TwitterAPI", 3);
            i = false;
            if (loggable) {
                i = true;
            }
        }
        m = i;
    }
    
    private ae(final Context context) {
        this.j = com.twitter.util.c.c(context);
        this.h = new ag(context, com.twitter.util.c.b(context), this.j);
        this.i = b(context);
        this.f = context.getString(lg.base_url_mobile);
        final String string = context.getString(lg.base_host);
        String string2 = context.getString(lg.base_url);
        final String string3 = context.getString(lg.upload_host);
        String string5 = null;
        String d = null;
        List<Object> o = null;
        Label_0189: {
            if (App.f()) {
                final SharedPreferences sharedPreferences = context.getSharedPreferences("debug_prefs", 0);
                while (true) {
                    Label_0258: {
                        if (!sharedPreferences.getBoolean("staging_enabled", false)) {
                            break Label_0258;
                        }
                        final String string4 = sharedPreferences.getString("staging_url", (String)null);
                        if (string4 == null) {
                            break Label_0258;
                        }
                        final String substring = string4.substring(0, string4.lastIndexOf(47));
                        while (true) {
                            Label_0251: {
                                if (!sharedPreferences.getBoolean("upload_staging_enabled", false)) {
                                    break Label_0251;
                                }
                                string5 = sharedPreferences.getString("upload_staging_host", (String)null);
                                if (string5 == null) {
                                    break Label_0251;
                                }
                                final List<Object> synchronizedList = Collections.synchronizedList(new LinkedList<Object>());
                                d = substring;
                                string2 = string4;
                                o = synchronizedList;
                                break Label_0189;
                            }
                            string5 = string3;
                            continue;
                        }
                    }
                    final String string4 = string2;
                    final String substring = string;
                    continue;
                }
            }
            d = string;
            string5 = string3;
            o = null;
        }
        this.d = d;
        this.e = string2;
        this.g = string5;
        this.k = com.twitter.util.i.c(context.getResources().getConfiguration().locale);
        this.l = Settings$Secure.getString(context.getContentResolver(), "android_id");
        this.o = o;
        this.p = context.getApplicationContext();
    }
    
    public static int a(final int n, final int n2) {
        if (n % n2 > 0) {
            return 1 + n / n2;
        }
        return n / n2;
    }
    
    public static int a(final StringBuilder sb, final String s, final long[] array, final int n, final int n2) {
        if (array != null && n < array.length && n2 > 0) {
            a(sb, s);
            return a(sb, array, n, n2);
        }
        return 0;
    }
    
    public static int a(final StringBuilder sb, final long[] array, final int n, final int n2) {
        final int min = Math.min(n + n2, array.length);
        for (int i = n; i < min; ++i) {
            sb.append(array[i]);
            if (i < min - 1) {
                sb.append(',');
            }
        }
        return min - n;
    }
    
    public static RateLimit a(final HttpOperation httpOperation) {
        final String b = httpOperation.b("x-rate-limit-limit");
        RateLimit rateLimit = null;
        if (b != null) {
            final int int1 = Integer.parseInt(b);
            final String b2 = httpOperation.b("x-rate-limit-remaining");
            rateLimit = null;
            if (b2 != null) {
                final int int2 = Integer.parseInt(b2);
                final String b3 = httpOperation.b("x-rate-limit-reset");
                rateLimit = null;
                if (b3 != null) {
                    rateLimit = new RateLimit(int2, int1, 1000L * Long.parseLong(b3));
                }
            }
        }
        return rateLimit;
    }
    
    public static ae a(final Context context) {
        synchronized (ae.class) {
            if (ae.n == null) {
                ae.n = new ae(context.getApplicationContext());
            }
            return ae.n;
        }
    }
    
    public static StringBuilder a(final String s, final Object... array) {
        final StringBuilder sb = new StringBuilder(s);
        if (array != null) {
            for (final Object o : array) {
                sb.append('/');
                sb.append(Uri.encode(o.toString(), "/"));
            }
        }
        return sb;
    }
    
    private static StringBuilder a(final StringBuilder sb, final String s) {
        if (sb.indexOf("?") == -1) {
            sb.append('?');
        }
        else {
            sb.append('&');
        }
        return sb.append(s).append('=');
    }
    
    public static void a(final HttpOperation httpOperation, final String s, final String s2) {
        httpOperation.a(s, s2);
    }
    
    public static void a(final StringBuilder sb, final String s, final double n) {
        a(sb, s).append(n);
    }
    
    public static void a(final StringBuilder sb, final String s, final int n) {
        a(sb, s).append(n);
    }
    
    public static void a(final StringBuilder sb, final String s, final long n) {
        a(sb, s).append(n);
    }
    
    public static void a(final StringBuilder sb, final String s, final String s2) {
        a(sb, s).append(com.twitter.library.network.a.a(s2));
    }
    
    public static void a(final StringBuilder sb, final String s, final boolean b) {
        a(sb, s).append(b);
    }
    
    public static boolean a(final aa aa) {
        return !d(aa).isEmpty();
    }
    
    public static int[] a(final Bundle bundle) {
        if (bundle.containsKey("custom_errors")) {
            return bundle.getIntArray("custom_errors");
        }
        return ae.a;
    }
    
    public static int[] a(final List list) {
        if (list != null && !list.isEmpty()) {
            final int size = list.size();
            final int[] array = new int[size];
            for (int i = 0; i < size; ++i) {
                array[i] = list.get(i).a;
            }
            return array;
        }
        return ae.a;
    }
    
    public static String b(final Context context) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String s = defaultSharedPreferences.getString("client_uuid", (String)null);
        if (s == null) {
            s = UUID.randomUUID().toString();
            final SharedPreferences$Editor edit = defaultSharedPreferences.edit();
            edit.putString("client_uuid", s);
            edit.apply();
        }
        return s;
    }
    
    public static String b(final aa aa) {
        for (final bd bd : d(aa)) {
            if (bd.f != null) {
                return bd.f;
            }
        }
        return null;
    }
    
    private boolean b(final URI uri) {
        return !uri.getHost().endsWith("twimg.com");
    }
    
    private void c(final StringBuilder sb) {
        if (App.f() && PreferenceManager.getDefaultSharedPreferences(this.p).getBoolean("debug_show_catfood_cards", false)) {
            sb.append("Catfood-");
        }
        sb.append("Android-12");
    }
    
    public static boolean c(final aa aa) {
        final Iterator<bd> iterator = d(aa).iterator();
        while (iterator.hasNext()) {
            if (iterator.next().e > 0) {
                return true;
            }
        }
        return false;
    }
    
    private static List d(final aa aa) {
        final ArrayList<bd> list = new ArrayList<bd>();
        if (aa.h() instanceof b) {
            final List a = ((b)aa.h()).a();
            if (a != null) {
                for (final bd bd : a) {
                    if (bd.a == 326) {
                        list.add(bd);
                    }
                }
            }
        }
        return list;
    }
    
    public static boolean d(final HttpOperation httpOperation) {
        return "True".equals(httpOperation.a("X-Twitter-Polling"));
    }
    
    private com.twitter.library.api.b g() {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.p);
        final boolean boolean1 = defaultSharedPreferences.getBoolean("adid_no_tracking_enabled", false);
        final String string = defaultSharedPreferences.getString("adid_identifier", "");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return new com.twitter.library.api.b(string, boolean1);
        }
        return null;
    }
    
    public String a() {
        final StringBuilder sb = new StringBuilder();
        this.c(sb);
        return sb.toString();
    }
    
    public StringBuilder a(final Object... array) {
        return a(this.e, array);
    }
    
    public HashMap a(final URI uri) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("User-Agent", this.h.toString());
        hashMap.put("X-Client-UUID", this.i);
        hashMap.put("X-Twitter-Client", "TwitterAndroid");
        hashMap.put("X-Twitter-Client-Version", this.j);
        hashMap.put("X-Twitter-API-Version", "5");
        hashMap.put("Accept-Language", this.k);
        hashMap.put("X-Twitter-Client-Language", this.k);
        hashMap.put("X-Twitter-Client-DeviceID", this.l);
        if (this.e() && this.b(uri)) {
            final String b = q.b(16);
            hashMap.put("X-B3-Flags", "1");
            hashMap.put("X-B3-TraceId", b);
            hashMap.put("X-B3-SpanId", b);
            this.o.add(0, new Pair((Object)b, (Object)uri));
            if (this.o.size() > 10) {
                this.o.remove(-1 + this.o.size());
            }
            if (ae.m) {
                Log.d("TwitterAPI", "TraceID " + b + " for [" + uri + "]");
            }
        }
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.p);
        if (r.a(defaultSharedPreferences)) {
            hashMap.put("x-tsa-max-connection-bandwidth-kbs", Integer.toString(r.b(defaultSharedPreferences)));
            hashMap.put("x-tsa-fixed-request-latency-ms", Integer.toString(r.c(defaultSharedPreferences)));
        }
        if (this.c()) {
            hashMap.put("Dtab-Local", this.d());
        }
        if (sk.a().a()) {
            hashMap.put("Geolocation", sp.a(this.p).b());
        }
        final com.twitter.library.api.b g = this.g();
        if (g == null || !g.b()) {
            hashMap.put("Timezone", TimeZone.getDefault().getID());
        }
        if (g != null) {
            hashMap.put("X-Twitter-Client-AdID", g.a());
            String s;
            if (g.b()) {
                s = "1";
            }
            else {
                s = "0";
            }
            hashMap.put("X-Twitter-Client-Limit-Ad-Tracking", s);
        }
        if (App.f()) {
            final String string = defaultSharedPreferences.getString("simulate_back_pressure", (String)null);
            if (!TextUtils.isEmpty((CharSequence)string)) {
                hashMap.put("Simulate-Back-Pressure", string);
            }
        }
        return hashMap;
    }
    
    public void a(final f f) {
        final Locale locale = this.p.getResources().getConfiguration().locale;
        if (locale != null) {
            final String country = locale.getCountry();
            final String lowerCase = com.twitter.util.i.b(locale).toLowerCase();
            if (!TextUtils.isEmpty((CharSequence)lowerCase) || !TextUtils.isEmpty((CharSequence)country)) {
                f.a("localize", true);
                if (!TextUtils.isEmpty((CharSequence)lowerCase)) {
                    f.a("lang", lowerCase);
                }
                if (!TextUtils.isEmpty((CharSequence)country)) {
                    f.a("country", country);
                }
            }
        }
    }
    
    public void a(final StringBuilder sb) {
        a(sb, "cards_platform");
        this.c(sb);
    }
    
    public String b() {
        return this.d;
    }
    
    public void b(final HttpOperation httpOperation) {
        for (final Map.Entry<String, V> entry : this.a(httpOperation.i()).entrySet()) {
            httpOperation.a(entry.getKey(), (String)entry.getValue());
        }
    }
    
    public void b(final StringBuilder sb) {
        final Locale locale = this.p.getResources().getConfiguration().locale;
        if (locale != null) {
            a(sb, "lang", com.twitter.util.i.b(locale).toLowerCase());
        }
    }
    
    public void c(final HttpOperation httpOperation) {
        httpOperation.a("X-Twitter-Polling", "True");
        this.b(httpOperation);
    }
    
    public boolean c() {
        if (!yw.a()) {
            final boolean f = App.f();
            final boolean boolean1 = false;
            if (!f) {
                return boolean1;
            }
        }
        return PreferenceManager.getDefaultSharedPreferences(this.p).getBoolean("extra_dtab_enabled", false);
    }
    
    public String d() {
        return PreferenceManager.getDefaultSharedPreferences(this.p).getString("extra_dtab", "");
    }
    
    public boolean e() {
        final boolean f = App.f();
        boolean boolean1 = false;
        if (f) {
            boolean1 = PreferenceManager.getDefaultSharedPreferences(this.p).getBoolean("debug_force_zipkin_tracing", false);
        }
        return boolean1;
    }
    
    public List f() {
        return this.o;
    }
}
