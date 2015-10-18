// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.location.Location;
import com.twitter.library.featureswitch.d;
import com.twitter.library.platform.f;
import java.util.List;
import java.net.URI;
import android.util.Pair;
import com.twitter.library.network.ae;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import com.twitter.android.client.x;
import android.app.Activity;
import java.util.concurrent.Callable;
import android.os.AsyncTask;
import com.twitter.util.t;
import com.twitter.library.client.p;
import com.twitter.util.concurrent.i;
import java.util.Iterator;
import java.nio.charset.Charset;
import android.text.TextUtils;
import android.util.Log;
import com.twitter.errorreporter.b;
import java.util.Date;
import java.util.Map;
import com.twitter.library.network.g;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$CompressFormat;
import android.net.Uri;
import java.util.ArrayList;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.File;
import com.twitter.library.client.ad;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.twitter.library.client.App;
import android.support.v4.util.LruCache;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.client.af;
import com.twitter.errorreporter.c;

public class az implements c, af
{
    public static final Intent a;
    private static final String b;
    private static az c;
    private final Context d;
    private final LruCache e;
    
    static {
        b = App.a(".bug");
        a = new Intent().setAction(az.b);
    }
    
    private az(final Context context) {
        this.d = context.getApplicationContext();
        this.e = new LruCache(10);
        if (f()) {
            context.registerReceiver((BroadcastReceiver)new bb(null), new IntentFilter(az.b));
            ad.a().a(this);
        }
    }
    
    public static az a(final Context context) {
        synchronized (az.class) {
            if (az.c == null) {
                az.c = new az(context);
            }
            return az.c;
        }
    }
    
    public static void b(final Context context) {
        final File c = com.twitter.library.util.af.c(context);
        if (c == null) {
            return;
        }
        final File file = new File(c, "bug_reports");
        while (true) {
            if (!file.exists() || !file.isDirectory()) {
                break Label_0038;
            }
            try {
                yh.a(file);
                new File(c, "bug_report.jpg").delete();
                new File(c, "stack_traces.txt").delete();
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static boolean e() {
        return App.f() || App.c();
    }
    
    public static boolean f() {
        return App.f() || App.d();
    }
    
    public Intent a(final String s, final String s2, final String s3, final Bitmap bitmap) {
        final Intent setType = new Intent("android.intent.action.SEND_MULTIPLE").setType("text/xml");
        setType.putExtra("android.intent.extra.EMAIL", new String[] { s });
        setType.putExtra("android.intent.extra.SUBJECT", s2);
        setType.putExtra("android.intent.extra.TEXT", s3);
        b(this.d);
        final File c = com.twitter.library.util.af.c(this.d);
        if (e() && c != null) {
            final ArrayList<Uri> list = new ArrayList<Uri>();
            File file2 = null;
            StringBuilder sb = null;
            Label_0135: {
                if (bitmap == null) {
                    break Label_0135;
                }
                try {
                    final File file = new File(c, "bug_report.jpg");
                    if (m.a(bitmap, file, Bitmap$CompressFormat.JPEG, 70)) {
                        list.add(Uri.fromFile(file));
                    }
                    bitmap.recycle();
                    if (g.b()) {
                        final String a = g.a(this.d, true);
                        if (a != null) {
                            list.add(Uri.fromFile(new File(a)));
                        }
                    }
                    file2 = new File(c, "stack_traces.txt");
                    sb = new StringBuilder();
                    for (final Map.Entry<Long, V> entry : this.e.snapshot().entrySet()) {
                        if (sb.length() > 0) {
                            sb.append("\n\n");
                        }
                        sb.append("Time: ").append(new Date(entry.getKey())).append("\n");
                        sb.append("----------------------------------------\n");
                        final b b = (b)entry.getValue();
                        sb.append(Log.getStackTraceString(b.b()));
                        final Map a2 = b.a();
                        if (!a2.isEmpty()) {
                            sb.append("----------------------------------------\n");
                            for (final Map.Entry<Object, V> entry2 : a2.entrySet()) {
                                sb.append(entry2.getKey().toString()).append(" : ").append(entry2.getValue().toString()).append("\n");
                            }
                        }
                    }
                }
                finally {
                    bitmap.recycle();
                }
            }
            final String string = sb.toString();
            if (!TextUtils.isEmpty((CharSequence)string) && yh.a(string, Charset.defaultCharset(), file2)) {
                list.add(Uri.fromFile(file2));
            }
            if (!list.isEmpty()) {
                setType.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList)list);
            }
        }
        return setType;
    }
    
    public i a(final String s, final String s2, final String s3) {
        final Activity b = p.a().b();
        Bitmap d;
        if (e() && b != null) {
            d = t.d(b.getWindow().getDecorView());
        }
        else {
            d = null;
        }
        return new com.twitter.util.concurrent.b().a(AsyncTask.THREAD_POOL_EXECUTOR).a(new ba(this, s, s2, s3, d)).a();
    }
    
    public String a() {
        final Context d = this.d;
        final Activity b = p.a().b();
        String simpleName;
        if (b != null) {
            simpleName = b.getClass().getSimpleName();
        }
        else {
            simpleName = "Unknown";
        }
        return "Reporting bug in " + simpleName + " with v" + com.twitter.util.c.d(d) + " (" + d.getPackageName() + ")";
    }
    
    @Override
    public void a(final Activity activity) {
        x.a(this.d).b();
    }
    
    @Override
    public void a(final b b) {
        this.e.put(System.currentTimeMillis(), b);
    }
    
    public String b() {
        final StringBuilder sb = new StringBuilder();
        final Session b = com.twitter.library.client.az.a(this.d).b();
        if (b.d()) {
            final TwitterUser f = b.f();
            sb.append("\nuserId: ").append(f.userId);
            sb.append("\nusername: ").append(f.username);
            sb.append("\nprotected: ").append(f.isProtected);
            sb.append("\nsuspended: ").append(f.suspended);
            sb.append("\ncrash url: ").append(this.d.getString(2131298196, new Object[] { f.username }));
        }
        else {
            sb.append("\nusername: <none -- logged out>");
        }
        return sb.toString();
    }
    
    @Override
    public void b(final Activity activity) {
        x.a(this.d).a();
    }
    
    @Override
    public void b(final b b) {
    }
    
    public String c() {
        final Context d = this.d;
        final StringBuilder sb = new StringBuilder();
        final Activity b = p.a().b();
        if (b instanceof bd) {
            final String b2 = ((bd)b).b();
            if (!TextUtils.isEmpty((CharSequence)b2)) {
                sb.append("\n\n").append(b2);
            }
        }
        sb.append("\n\n");
        sb.append("package: ").append(d.getPackageName());
        sb.append("\nversion: ").append(com.twitter.util.c.d(d));
        final boolean c = TelephonyUtil.c(d);
        sb.append("\nconnectivity: ").append(String.valueOf(c));
        if (c) {
            sb.append("\nconnectivityType: ").append(TelephonyUtil.a());
        }
        sb.append(this.b());
        final ae a = ae.a(d);
        sb.append("\n").append(a.h);
        if (a.e()) {
            final List f = a.f();
            final int min = Math.min(f.size(), 4);
            if (min > 0) {
                sb.append("\nRecent traces (only work if requests sent from Dodo):");
                for (final Pair pair : f.subList(0, min)) {
                    final String format = String.format("http://go/zipkin/%1$s", pair.first);
                    sb.append("\n");
                    sb.append(format).append(" (").append(((URI)pair.second).getPath()).append(")");
                }
            }
        }
        return sb.toString();
    }
    
    public String d() {
        final Context d = this.d;
        final StringBuilder sb = new StringBuilder();
        final sl a = sk.a();
        sb.append("isLocationEnabled [geoTag, system, app]: [").append(a.b(com.twitter.library.client.az.a(d).b())).append(", ").append(a.e()).append(", ").append(a.d()).append("]");
        sb.append("\nisGooglePlayServicesEnabled: ").append(f.a(d) && com.twitter.library.featureswitch.d.f("geo_data_provider_google_play_services_enabled"));
        final Location a2 = sp.a(d).a();
        if (a2 != null) {
            sb.append("\nlocation [lat,lng]: [").append(a2.getLatitude()).append(", ").append(a2.getLongitude()).append("]");
            sb.append("\nlocationAccuracy: ").append(a2.getAccuracy());
            sb.append("\nlocationProvider: ").append(a2.getProvider());
        }
        else {
            sb.append("\nlocation: null");
        }
        return sb.toString();
    }
}
