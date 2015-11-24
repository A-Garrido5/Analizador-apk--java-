// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import com.twitter.library.service.z;
import com.twitter.library.api.y;
import com.twitter.library.client.as;
import android.preference.PreferenceManager;
import com.twitter.library.util.l;
import java.io.File;
import com.crashlytics.android.d;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import com.twitter.library.util.bq;
import com.twitter.library.network.ae;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Collection;
import com.twitter.library.client.az;
import java.util.Iterator;
import com.twitter.library.client.af;
import com.twitter.library.client.ad;
import org.json.JSONException;
import java.util.Map;
import android.os.Looper;
import android.util.Log;
import com.twitter.library.client.App;
import android.os.Handler;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.twitter.config.c;

public class i implements c
{
    private static final boolean c;
    private static String d;
    public final ConcurrentHashMap a;
    public boolean b;
    private final ConcurrentHashMap e;
    private final HashMap f;
    private final HashMap g;
    private int h;
    private boolean i;
    private final ArrayList j;
    private FeatureSwitchesManifest k;
    private Context l;
    private Handler m;
    private boolean n;
    private Runnable o;
    private long p;
    
    static {
        c = (App.l() && Log.isLoggable("FS", 3));
        i.d = null;
    }
    
    public i(final Context context) {
        this.a = new ConcurrentHashMap();
        this.b = false;
        this.e = new ConcurrentHashMap();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = -1;
        this.j = new ArrayList();
        this.n = false;
        this.o = new j(this);
        this.m = new Handler(Looper.getMainLooper());
        this.l = context.getApplicationContext();
        if (App.f()) {
            for (final Map.Entry<String, V> entry : context.getSharedPreferences("fs_override", 0).getAll().entrySet()) {
                final String s = entry.getKey();
                final String string = entry.getValue().toString();
                try {
                    final FeatureSwitchesValue a = FeatureSwitchesValue.a(s, string);
                    if (a == null) {
                        continue;
                    }
                    this.a.put(s, a);
                }
                catch (JSONException ex) {
                    this.a("Failed to load global overrides.", (Exception)ex);
                }
            }
        }
        ad.a().a(new k(this));
    }
    
    private Object a(final long n, final String s, final FeatureSwitchesValue featureSwitchesValue, final boolean b) {
        if (s == null || featureSwitchesValue == null) {
            return null;
        }
        if (b && featureSwitchesValue.d()) {
            final FeatureSwitchesValue$FeatureSwitchesImpression e = featureSwitchesValue.e();
            this.a(s, e.b(), e.c(), n);
        }
        return featureSwitchesValue.c();
    }
    
    private Object a(final long n, final String s, final boolean b, final long n2) {
        if (this.a.containsKey(s)) {
            return this.a.get(s).c();
        }
        FeatureSwitchesConfig featureSwitchesConfig = this.e.get(n);
        if (featureSwitchesConfig == null && az.a(this.l).b(n).g() == n) {
            this.a(n, false);
            featureSwitchesConfig = this.e.get(n);
        }
        if (featureSwitchesConfig.a(s)) {
            return this.a(n2, s, featureSwitchesConfig.c(s), b);
        }
        final FeatureSwitchesManifest b2 = this.b();
        if (b2.embeddedExperiments.containsKey(s) && featureSwitchesConfig.embeddedDarkmoded.contains(s)) {
            return "unassigned";
        }
        if (b2.embeddedExperiments.containsKey(s)) {
            return this.a(n2, s, b2.c(s), b);
        }
        if (b2.a(s)) {
            return b2.b(s);
        }
        return null;
    }
    
    private static String a(final FeatureSwitchesManifest featureSwitchesManifest, final FeatureSwitchesConfig featureSwitchesConfig, final String s) {
        String s2 = (String)featureSwitchesConfig.b(s);
        if (s2 == null) {
            if (featureSwitchesConfig.embeddedDarkmoded.contains(s)) {
                return "unassigned";
            }
            s2 = (String)featureSwitchesManifest.b(s);
            if (s2 == null) {
                return "unassigned";
            }
        }
        return s2;
    }
    
    public static boolean a(final FeatureSwitchesManifest featureSwitchesManifest, final FeatureSwitchesConfig featureSwitchesConfig, final FeatureSwitchesConfig featureSwitchesConfig2) {
        final ArrayList a = featureSwitchesConfig.a(featureSwitchesConfig2);
        a.addAll(featureSwitchesManifest.embeddedExperiments.keySet());
        for (final String s : a) {
            if (featureSwitchesManifest.requiresRestart.contains(s)) {
                if (!featureSwitchesManifest.embeddedExperiments.containsKey(s)) {
                    return true;
                }
                if (!a(featureSwitchesManifest, featureSwitchesConfig, s).equals(a(featureSwitchesManifest, featureSwitchesConfig2, s))) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }
    
    private void b(final long n, final FeatureSwitchesConfig featureSwitchesConfig) {
        if (featureSwitchesConfig != null && featureSwitchesConfig.versions != null) {
            ScribeService.a(this.l, new TwitterScribeLog(n).a(featureSwitchesConfig.versions).b(new String[] { "fs:settings:version:changed" }));
        }
    }
    
    private boolean e() {
        Label_0033: {
            if (this.h >= 0) {
                break Label_0033;
            }
            try {
                this.h = com.twitter.library.featureswitch.a.a(Long.toString(bq.d(ae.a(this.l).i)), "feature_switches_configs_crashlytics_enabled");
                return this.h > 0 && this.h < 10;
            }
            catch (Exception ex) {
                return this.h > 0 && this.h < 10;
            }
        }
    }
    
    private boolean f() {
        try {
            return (boolean)com.twitter.util.k.a(this.a(this.p, "feature_switches_configs_crashlytics_enabled", false), this.e());
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    private long g() {
        return 60000L * ((Number)com.twitter.util.k.a(this.a(this.p, "feature_switches_configs_wait_before_kill_minutes", false), 0)).intValue();
    }
    
    public FeatureSwitchesManifest a(final boolean b, final String s) {
        // monitorenter(this)
        Label_0017: {
            if (b) {
                break Label_0017;
            }
            try {
                Label_0068: {
                    if (this.k != null) {
                        break Label_0068;
                    }
                    try {
                        final ih ih = new ih("fs:load:embedded_manifest", ih.m);
                        ih.b("FS");
                        ih.i();
                        this.k = FeatureSwitchesManifest.a(this.l, s, this.i);
                        ih.j();
                        ir.b().a(ih);
                        return this.k;
                    }
                    catch (Exception ex) {
                        this.k = FeatureSwitchesManifest.b;
                        this.a("Failed to read feature switches manifest.", ex);
                    }
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @Override
    public Object a(final long n, final String s, final boolean b) {
        return this.a(n, s, b, n);
    }
    
    public String a() {
        synchronized (this) {
            if (com.twitter.library.featureswitch.i.d == null) {
                com.twitter.library.featureswitch.i.d = this.b().featureSetToken;
            }
            return com.twitter.library.featureswitch.i.d;
        }
    }
    
    public String a(final String s) {
        if (this.p == 0L) {
            throw new IllegalStateException("getLoggedOutExperimentBucketForNUX should be called by logged-in users only");
        }
        try {
            String s2 = (String)this.a(0L, s, true, this.p);
            if (s2 == null) {
                s2 = "unassigned";
            }
            return s2;
        }
        catch (Exception ex) {
            this.a("Invalid FeatureSwitch value. Key: " + s, ex);
            return "unassigned";
        }
    }
    
    public ArrayList a(final int n) {
        synchronized (this) {
            final ArrayList<String> list = new ArrayList<String>();
            final StringBuffer sb = new StringBuffer();
            final FeatureSwitchesConfig featureSwitchesConfig = this.e.get(this.p);
            ArrayList<String> list2;
            if (featureSwitchesConfig == null) {
                list2 = list;
            }
            else {
                final List<T> list3 = Arrays.asList((T[])featureSwitchesConfig.a().toArray());
                Collections.sort((List<Comparable>)list3);
                for (int i = 0; i < list3.size(); ++i) {
                    final String s = (String)list3.get(i);
                    final Object b = featureSwitchesConfig.b(s);
                    String string;
                    if (b == null) {
                        string = "null";
                    }
                    else {
                        try {
                            string = b.toString();
                        }
                        catch (Exception ex) {
                            string = "";
                        }
                    }
                    sb.append(s).append(":").append(string).append(", ");
                }
                final String string2 = sb.toString();
                int length;
                for (int j = 0; j < string2.length(); j = length) {
                    if (j + n < string2.length()) {
                        length = j + n;
                    }
                    else {
                        length = string2.length();
                    }
                    list.add(string2.substring(j, length));
                }
                list2 = list;
            }
            return list2;
        }
    }
    
    public void a(final long n, final FeatureSwitchesConfig featureSwitchesConfig) {
        featureSwitchesConfig.a(this.b(this.l, n));
    }
    
    public void a(final long n, final FeatureSwitchesManifest featureSwitchesManifest, final FeatureSwitchesConfig featureSwitchesConfig) {
        // monitorenter(this)
        Label_0028: {
            if (featureSwitchesManifest != null) {
                if (featureSwitchesConfig != null) {
                    break Label_0028;
                }
            }
            while (true) {
                FeatureSwitchesConfig featureSwitchesConfig2;
                try {
                    this.a("Manifest or fetchedConfig cannot be null", new Exception());
                    return;
                    featureSwitchesConfig2 = this.e.get(n);
                    // iftrue(Label_0068:, n == this.p)
                    this.c(n);
                    return;
                }
                finally {
                }
                // monitorexit(this)
                Label_0068: {
                    if (featureSwitchesConfig2 != null) {
                        this.b |= a(featureSwitchesManifest, featureSwitchesConfig2, featureSwitchesConfig);
                        this.a(n, true);
                    }
                }
            }
        }
    }
    
    public void a(final long n, final boolean b) {
        while (true) {
        Label_0311_Outer:
            while (true) {
                FeatureSwitchesManifest b2 = null;
                Label_0468: {
                    ih ih = null;
                    Label_0452: {
                        while (true) {
                            Label_0427: {
                                synchronized (this) {
                                    if (this.e.containsKey(n)) {
                                        if (!b) {
                                            return;
                                        }
                                    }
                                    FeatureSwitchesConfig a2;
                                    SettingVersionDetails versions;
                                    while (true) {
                                        while (true) {
                                            Label_0285: {
                                                try {
                                                    ih = new ih("fs:load:feature_switches", ih.m);
                                                    ih.b("FS");
                                                    ih.i();
                                                    if (this.i) {
                                                        final FeatureSwitchesConfig a = this.a(true, "feature_switch_manifest");
                                                        this.e.put(n, a);
                                                        for (int i = -1 + this.j.size(); i >= 0; --i) {
                                                            ((n)this.j.get(i)).a(n);
                                                        }
                                                        break Label_0452;
                                                    }
                                                    a2 = FeatureSwitchesConfig.a(this.l, this.b(this.l, n));
                                                    final FeatureSwitchesConfig featureSwitchesConfig = this.e.get(n);
                                                    if (featureSwitchesConfig == null) {
                                                        break Label_0285;
                                                    }
                                                    versions = featureSwitchesConfig.versions;
                                                    if (a2 == null || a2.updatedAt <= App.h()) {
                                                        break Label_0427;
                                                    }
                                                    if (featureSwitchesConfig != null) {
                                                        for (final String s : this.b().requiresRestart) {
                                                            a2.config.put(s, featureSwitchesConfig.config.get(s));
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                catch (Exception ex) {
                                                    this.e.put(n, new FeatureSwitchesConfig());
                                                    this.a("Failed to load featureSwitches.", ex);
                                                }
                                                return;
                                            }
                                            versions = null;
                                            continue Label_0311_Outer;
                                        }
                                    }
                                    this.g.put(n, true);
                                    b2 = (FeatureSwitchesManifest)a2;
                                    if (versions != null && b2 != null && !versions.equals(b2.versions)) {
                                        this.b(n, b2);
                                    }
                                    if (b2 == null || !App.f()) {
                                        break Label_0468;
                                    }
                                    final FeatureSwitchesConfig a3 = FeatureSwitchesConfig.a(this.l, lf.feature_switch_overrides);
                                    if (a3 != null) {
                                        for (final String s2 : a3.a()) {
                                            b2.a(s2, a3.c(s2));
                                        }
                                    }
                                    break Label_0468;
                                }
                            }
                            b2 = this.b();
                            this.g.put(n, false);
                            continue;
                        }
                    }
                    ih.j();
                    ir.b().a(ih);
                    return;
                }
                final FeatureSwitchesConfig a = b2;
                continue;
            }
        }
    }
    
    public void a(final Context context, final long n) {
        this.b(context, n).delete();
    }
    
    public void a(final n n) {
        if (!this.j.contains(n)) {
            this.j.add(n);
            if (this.a(this.p)) {
                n.a(this.p);
            }
        }
    }
    
    public void a(final String s, final int n, final String s2, final long n2) {
        if (!s2.equals("unassigned")) {
            ScribeService.a(this.l, s, n, s2, n2);
        }
    }
    
    @Override
    public void a(final String s, final Exception ex) {
        if (App.a()) {
            Log.e("FS", s, (Throwable)ex);
            if (!this.n) {
                this.m.post((Runnable)new m(this, s));
            }
        }
        else {
            try {
                if (!this.n && this.f()) {
                    com.crashlytics.android.d.a(ex);
                }
            }
            catch (Exception ex2) {}
        }
    }
    
    public boolean a(final long n) {
        return this.g.get(n) != null && this.g.get(n);
    }
    
    public FeatureSwitchesManifest b() {
        synchronized (this) {
            return this.a(false, "feature_switch_manifest");
        }
    }
    
    public File b(final Context context, final long n) {
        return new File(com.twitter.library.util.af.b(context), "feature_switches_" + n);
    }
    
    public void b(final long p) {
        synchronized (this) {
            this.a(this.p = p, this.b = false);
        }
    }
    
    public void b(final n n) {
        this.j.remove(n);
    }
    
    public void c() {
        synchronized (this.o) {
            if (this.b) {
                final long g = this.g();
                if (g > 0L) {
                    this.m.postDelayed(this.o, g);
                }
            }
        }
    }
    
    public void c(final long n) {
        synchronized (this) {
            if (n != this.p) {
                this.a(n, false);
                this.d(n);
            }
            else {
                this.a("loadFeatureSwitchesForNonActiveUser should not be called for a current user", new Exception());
            }
        }
    }
    
    public void d() {
        synchronized (this.o) {
            this.m.removeCallbacks(this.o);
        }
    }
    
    public void d(final long n) {
        synchronized (this) {
            l l = this.f.get(n);
            if (l == null) {
                l = new l(3600000L, PreferenceManager.getDefaultSharedPreferences(this.l).getLong("feature_timestamp_" + n, 0L));
                this.f.put(n, l);
            }
            if (!this.i && l.a()) {
                if (com.twitter.library.featureswitch.i.c) {
                    Log.d("FS", "Fetching feature switches from server");
                }
                this.e(n);
            }
        }
    }
    
    public String e(final long n) {
        ix.a("fs:load:fetched_manifest", ir.b(), n, ih.m).i();
        l l = this.f.get(n);
        if (l == null) {
            l = new l(3600000L, 0L);
            this.f.put(n, l);
        }
        l.b();
        return as.a(this.l).a(new y(this.l, az.a(this.l).b(n), this.a()).j("Users never trigger FS fetches."), new com.twitter.library.featureswitch.l(this, n));
    }
}
