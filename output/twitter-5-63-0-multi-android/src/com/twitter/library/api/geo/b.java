// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collection;
import com.twitter.internal.util.Optional;
import com.twitter.library.util.bk;
import com.twitter.library.platform.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import android.os.Build;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import android.text.TextUtils;
import com.twitter.library.featureswitch.d;
import com.twitter.library.service.f;
import java.util.Collections;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import android.os.Build$VERSION;
import java.util.List;
import com.twitter.library.service.c;

public class b extends c
{
    public static final boolean a;
    static final long e;
    private String f;
    private String g;
    private List h;
    private e i;
    
    static {
        a = (Build$VERSION.SDK_INT >= 17);
        e = TimeUnit.MINUTES.toMillis(2L);
    }
    
    public b(final Context context, final Session session) {
        super(context, b.class.getName(), session);
        this.h = Collections.emptyList();
        this.g(1);
    }
    
    private void a(final f f) {
        if (com.twitter.library.featureswitch.d.f("place_picker_new_data_provider") && TextUtils.equals((CharSequence)this.g, (CharSequence)"tweet_compose_location")) {
            f.a(HttpOperation$RequestMethod.b);
            final boolean wifiEnabled = ((WifiManager)this.p.getSystemService("wifi")).isWifiEnabled();
            f.a("wifi_on", wifiEnabled);
            final LocationManager locationManager = (LocationManager)this.p.getSystemService("location");
            f.a("gps_assistance", locationManager.isProviderEnabled("gps"));
            f.a("network_assistance", locationManager.isProviderEnabled("network"));
            f.a("os", "Android " + Build$VERSION.RELEASE);
            f.a("device_type", Build.MODEL);
            if (wifiEnabled && b.a && sk.a().c()) {
                for (final Map.Entry<String, V> entry : d(c(b(this.h))).entrySet()) {
                    f.a(entry.getKey(), entry.getValue().toString());
                }
            }
        }
    }
    
    static List b(final List list) {
        final ArrayList<m> list2 = new ArrayList<m>();
        final long n = bk.a() - b.e;
        for (final m m : list) {
            final Optional d = m.d();
            if (d.c() && (long)d.b() >= n) {
                list2.add(m);
            }
        }
        return list2;
    }
    
    static List c(final List list) {
        List<Object> subList = new ArrayList<Object>(list);
        Collections.sort(subList, new com.twitter.library.api.geo.d(null));
        if (list.size() > 20) {
            subList = subList.subList(0, 20);
        }
        return subList;
    }
    
    static Map d(final List list) {
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        final Iterator<m> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final m m = iterator.next();
            final boolean e = m.e();
            hashMap.put(String.format("wifi%d_private", n), (Integer)(Object)e);
            hashMap.put(String.format("wifi%d_bssid", n), (Integer)m.a());
            if (!e) {
                hashMap.put(String.format("wifi%d_level", n), m.b());
                hashMap.put(String.format("wifi%d_frequency", n), m.c());
                hashMap.put(String.format("wifi%d_timestamp", n), (Integer)m.d().b());
            }
            ++n;
        }
        hashMap.put("wifi_count", list.size());
        return hashMap;
    }
    
    public b a(final String g) {
        this.g = g;
        return this;
    }
    
    public b a(final List list) {
        this.h = Collections.unmodifiableList((List<?>)list);
        return this;
    }
    
    @Override
    protected com.twitter.library.service.e a() {
        final f a = this.M().a(new Object[] { "geo", "places" });
        if (!TextUtils.isEmpty((CharSequence)this.g)) {
            a.a("query_type", this.g);
        }
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            a.a("search_term", this.f);
        }
        this.a(a);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            this.i = (e)bg.a();
        }
    }
    
    protected bg b() {
        return bg.a(91);
    }
    
    public b b(final String f) {
        this.f = f;
        return this;
    }
    
    public String e() {
        return this.f;
    }
    
    public e f() {
        return this.i;
    }
}
