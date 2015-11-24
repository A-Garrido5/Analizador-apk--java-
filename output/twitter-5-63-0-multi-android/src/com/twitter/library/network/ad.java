// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import java.security.NoSuchAlgorithmException;
import com.twitter.library.client.App;
import com.twitter.internal.network.HttpOperation$Protocol;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.j;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.net.URISyntaxException;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.errorreporter.a;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.squareup.okhttp.internal.http.aa;
import java.net.URI;
import com.twitter.library.featureswitch.d;
import java.net.CookieHandler;
import java.util.HashMap;
import com.twitter.internal.network.g;
import java.util.HashSet;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import android.content.SharedPreferences;
import java.security.KeyStore;
import java.util.Set;
import com.twitter.library.featureswitch.n;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import com.twitter.internal.network.p;

public class ad extends p implements SharedPreferences$OnSharedPreferenceChangeListener, n
{
    private static final Set c;
    private final KeyStore d;
    private final SharedPreferences e;
    private SSLSocketFactory f;
    private volatile Set g;
    private volatile Map h;
    
    static {
        (c = new HashSet()).add("/1.1/help/settings.json");
    }
    
    public ad(final KeyStore d, final g g, final SharedPreferences e) {
        super(g);
        this.f = null;
        this.g = new HashSet();
        this.h = new HashMap();
        this.d = d;
        this.e = e;
        this.b.a((CookieHandler)null);
        this.b.a(this.c());
        this.d();
        com.twitter.library.featureswitch.d.a(this);
        this.e.registerOnSharedPreferenceChangeListener((SharedPreferences$OnSharedPreferenceChangeListener)this);
    }
    
    private boolean a(final URI uri) {
        int port = uri.getPort();
        if (port == -1) {
            if ("https".equals(uri.getScheme())) {
                port = 443;
            }
            else {
                port = 80;
            }
        }
        final aa aa = new aa(uri.getScheme(), uri.getHost(), port);
        return (this.g.contains(aa) || this.h.containsKey(aa)) && !ad.c.contains(uri.getPath());
    }
    
    private void d() {
        final HashSet<aa> g = new HashSet<aa>();
        final ArrayList h = com.twitter.library.featureswitch.d.h("spdy_origins");
        if (!CollectionUtils.a((Collection)h)) {
            for (final String next : h) {
                try {
                    final URI uri = new URI(next);
                    g.add(new aa(uri.getScheme(), uri.getHost(), uri.getPort()));
                }
                catch (URISyntaxException ex) {
                    ErrorReporter.a(new a(ex).a("message", "Failure in parsing SPDY origin " + next.toString()));
                }
            }
        }
        this.g = g;
        Object emptyMap = Collections.emptyMap();
        if (com.twitter.library.featureswitch.d.f("spdy_aliases_enabled") || r.a(this.e)) {
            final ArrayList h2 = com.twitter.library.featureswitch.d.h("spdy_origin_aliases");
            final HashMap<aa, aa> hashMap = new HashMap<aa, aa>();
            for (final String next2 : h2) {
                final String[] split = next2.split("\\|");
                if (split.length == 2) {
                    try {
                        final URI uri2 = new URI(split[0]);
                        final URI uri3 = new URI(split[1]);
                        hashMap.put(new aa(uri2.getScheme(), uri2.getHost(), uri2.getPort()), new aa(uri3.getScheme(), uri3.getHost(), uri3.getPort()));
                    }
                    catch (URISyntaxException ex2) {
                        ErrorReporter.a(new a(ex2).a("message", "Failure in parsing SPDY origin " + next2.toString()));
                    }
                }
                else {
                    ErrorReporter.a(new a().a("message", "Failure in parsing SPDY origins " + next2.toString()));
                }
            }
            emptyMap = hashMap;
        }
        synchronized (this) {
            if (!((Map)emptyMap).equals(this.h)) {
                this.h = (Map)emptyMap;
                this.b.a(this.h);
            }
        }
    }
    
    @Override
    public HttpOperation a(final HttpOperation$RequestMethod httpOperation$RequestMethod, final URI uri, final j j) {
        final HttpOperation a = super.a(httpOperation$RequestMethod, uri, j);
        if (this.a(uri)) {
            a.b(HttpOperation$Protocol.e);
        }
        return a;
    }
    
    public void a() {
        com.twitter.library.featureswitch.d.b(this);
        super.a();
    }
    
    public void a(final long n) {
        this.d();
    }
    
    protected SSLSocketFactory c() {
        // monitorenter(this)
        try {
            Label_0042: {
                if (this.f != null) {
                    break Label_0042;
                }
                try {
                    this.f = new ko(new kr(this.d), wj.b, App.h(), wj.c);
                    return this.f;
                }
                catch (NoSuchAlgorithmException ex) {}
                catch (UnrecoverableKeyException ex2) {}
                catch (KeyStoreException ex2) {}
                catch (KeyManagementException ex2) {}
            }
        }
        finally {}
    }
    
    public void onSharedPreferenceChanged(final SharedPreferences sharedPreferences, final String s) {
        if (r.a(s)) {
            this.d();
        }
    }
}
