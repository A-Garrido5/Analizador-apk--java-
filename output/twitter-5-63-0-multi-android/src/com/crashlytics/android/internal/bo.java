// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.bluetooth.BluetoothAdapter;
import android.provider.Settings$Secure;
import android.net.wifi.WifiInfo;
import java.util.Collections;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import android.content.SharedPreferences;
import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public final class bo
{
    private static final Pattern a;
    private static final String b;
    private final ReentrantLock c;
    private final boolean d;
    private final boolean e;
    private final Context f;
    
    static {
        a = Pattern.compile("[^\\p{Alnum}]");
        b = Pattern.quote("/");
    }
    
    public bo(final Context f) {
        this.c = new ReentrantLock();
        if (f == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        this.f = f;
        if (!(this.d = bd.a(f, "com.crashlytics.CollectDeviceIdentifiers", true))) {
            cl.a().b().a("Crashlytics", "Device ID collection disabled for " + f.getPackageName());
        }
        if (!(this.e = bd.a(f, "com.crashlytics.CollectUserIdentifiers", true))) {
            cl.a().b().a("Crashlytics", "User information collection disabled for " + f.getPackageName());
        }
    }
    
    private String a(final SharedPreferences sharedPreferences) {
        this.c.lock();
        try {
            String s = sharedPreferences.getString("crashlytics.installation.id", (String)null);
            if (s == null) {
                s = b(UUID.randomUUID().toString());
                sharedPreferences.edit().putString("crashlytics.installation.id", s).commit();
            }
            return s;
        }
        finally {
            this.c.unlock();
        }
    }
    
    private static void a(final Map map, final ap ap, final String s) {
        if (s != null) {
            map.put(ap, s);
        }
    }
    
    private boolean a(final String s) {
        return this.f.checkCallingPermission(s) == 0;
    }
    
    private static String b(final String s) {
        if (s == null) {
            return null;
        }
        return bo.a.matcher(s).replaceAll("").toLowerCase(Locale.US);
    }
    
    private static String c(final String s) {
        return s.replaceAll(bo.b, "");
    }
    
    private String i() {
        if (this.d && Build$VERSION.SDK_INT >= 9) {
            try {
                return b((String)Build.class.getField("SERIAL").get(null));
            }
            catch (Exception ex) {
                cl.a().b().a("Crashlytics", "Could not retrieve android.os.Build.SERIAL value", ex);
            }
        }
        return null;
    }
    
    public final boolean a() {
        return this.e;
    }
    
    public final String b() {
        String s = cl.a().j();
        if (s == null) {
            final SharedPreferences a = bd.a();
            s = a.getString("crashlytics.installation.id", (String)null);
            if (s == null) {
                s = this.a(a);
            }
        }
        return s;
    }
    
    public final String c() {
        return String.format(Locale.US, "%s/%s", c(Build$VERSION.RELEASE), c(Build$VERSION.INCREMENTAL));
    }
    
    public final String d() {
        return String.format(Locale.US, "%s/%s", c(Build.MANUFACTURER), c(Build.MODEL));
    }
    
    public final String e() {
        String s = "";
        if (this.d) {
            s = this.g();
            if (s == null) {
                final SharedPreferences a = bd.a();
                s = a.getString("crashlytics.installation.id", (String)null);
                if (s == null) {
                    s = this.a(a);
                }
            }
        }
        return s;
    }
    
    public final Map f() {
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        a(hashMap, ap.c, this.g());
        final ap d = ap.d;
        while (true) {
            Label_0193: {
                if (!this.d || !this.a("android.permission.READ_PHONE_STATE")) {
                    break Label_0193;
                }
                final TelephonyManager telephonyManager = (TelephonyManager)this.f.getSystemService("phone");
                if (telephonyManager == null) {
                    break Label_0193;
                }
                final String b = b(telephonyManager.getDeviceId());
                a(hashMap, d, b);
                a(hashMap, ap.e, this.i());
                final ap a = ap.a;
                final boolean d2 = this.d;
                String b2 = null;
                if (d2) {
                    final boolean a2 = this.a("android.permission.ACCESS_WIFI_STATE");
                    b2 = null;
                    if (a2) {
                        final WifiManager wifiManager = (WifiManager)this.f.getSystemService("wifi");
                        b2 = null;
                        if (wifiManager != null) {
                            final WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                            b2 = null;
                            if (connectionInfo != null) {
                                b2 = b(connectionInfo.getMacAddress());
                            }
                        }
                    }
                }
                a(hashMap, a, b2);
                a(hashMap, ap.b, this.h());
                return Collections.unmodifiableMap((Map<?, ?>)hashMap);
            }
            final String b = null;
            continue;
        }
    }
    
    public final String g() {
        final boolean d = this.d;
        String b = null;
        if (d) {
            final String string = Settings$Secure.getString(this.f.getContentResolver(), "android_id");
            final boolean equals = "9774d56d682e549c".equals(string);
            b = null;
            if (!equals) {
                b = b(string);
            }
        }
        return b;
    }
    
    public final String h() {
        Label_0033: {
            if (!this.d || !this.a("android.permission.BLUETOOTH")) {
                break Label_0033;
            }
            try {
                final BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    b(defaultAdapter.getAddress());
                }
                return null;
            }
            catch (Exception ex) {
                cl.a().b().a("Crashlytics", "Utils#getBluetoothMacAddress failed, returning null. Requires prior call to BluetoothAdatpter.getDefaultAdapter() on thread that has called Looper.prepare()", ex);
                return null;
            }
        }
    }
}
