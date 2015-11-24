// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.telephony;

import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.content.Context;
import com.twitter.internal.network.r;

public abstract class TelephonyUtil
{
    private static volatile String a;
    private static volatile int b;
    private static volatile boolean c;
    private static volatile boolean d;
    private static volatile boolean e;
    private static volatile d f;
    private static r g;
    private static long h;
    
    static {
        TelephonyUtil.a = "";
        TelephonyUtil.g = r.a();
        TelephonyUtil.h = 0L;
    }
    
    public static int a(final int n) {
        if (c()) {
            return n;
        }
        switch (b()) {
            default: {
                return Math.min(n, 1572864);
            }
            case 1:
            case 2:
            case 4:
            case 5:
            case 7:
            case 11: {
                return Math.min(n, 367001);
            }
            case 3:
            case 8: {
                return Math.min(n, 576716);
            }
            case 6:
            case 9: {
                return Math.min(n, 1048576);
            }
            case 10:
            case 12: {
                return Math.min(n, 1258291);
            }
            case 14: {
                return Math.min(n, 1572864);
            }
            case 15: {
                return Math.min(n, 2097152);
            }
            case 13: {
                return Math.min(n, 2621440);
            }
        }
    }
    
    static TelephonyUtil$DownloadQuality a(final int n, final int n2) {
        TelephonyUtil$DownloadQuality telephonyUtil$DownloadQuality = TelephonyUtil$DownloadQuality.a;
        if (n == 1) {
            telephonyUtil$DownloadQuality = TelephonyUtil$DownloadQuality.h;
        }
        else if (n == 0) {
            final float b = b(n2);
            if (b != 0.0f) {
                if (b <= TelephonyUtil$DownloadQuality.b.c()) {
                    if (n2 != 2) {
                        return TelephonyUtil$DownloadQuality.b;
                    }
                    return TelephonyUtil$DownloadQuality.c;
                }
                else {
                    if (b <= TelephonyUtil$DownloadQuality.d.c()) {
                        return TelephonyUtil$DownloadQuality.d;
                    }
                    if (b <= TelephonyUtil$DownloadQuality.e.c()) {
                        return TelephonyUtil$DownloadQuality.e;
                    }
                    if (b <= TelephonyUtil$DownloadQuality.f.c()) {
                        return TelephonyUtil$DownloadQuality.f;
                    }
                    if (b <= TelephonyUtil$DownloadQuality.g.c()) {
                        return TelephonyUtil$DownloadQuality.g;
                    }
                }
            }
        }
        return telephonyUtil$DownloadQuality;
    }
    
    public static String a() {
        return TelephonyUtil.a;
    }
    
    public static void a(final Context context) {
        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        TelephonyUtil.e = (telephonyManager != null && telephonyManager.getPhoneType() != 0);
    }
    
    static float b(final int n) {
        float n2 = 6.25f;
        switch (n) {
            default: {
                n2 = 0.0f;
                return n2;
            }
            case 2:
            case 7: {
                return n2;
            }
            case 4: {
                return 1.75f;
            }
            case 11: {
                return 3.125f;
            }
            case 1: {
                return 12.5f;
            }
            case 3: {
                return 50.0f;
            }
            case 5: {
                return 50.0f;
            }
            case 6: {
                return 75.0f;
            }
            case 10: {
                return 87.5f;
            }
            case 8: {
                return 250.0f;
            }
            case 9: {
                return 125.0f;
            }
            case 14: {
                return 125.0f;
            }
            case 12: {
                return 625.0f;
            }
            case 15: {
                return 1250.0f;
            }
            case 13: {
                return 1250.0f;
            }
        }
    }
    
    public static int b() {
        return TelephonyUtil.b;
    }
    
    public static String b(final Context context) {
        final WifiInfo connectionInfo = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo != null) {
            return connectionInfo.getSSID();
        }
        return null;
    }
    
    public static boolean c() {
        return TelephonyUtil.c;
    }
    
    public static boolean c(final Context context) {
        if (context == null || !TelephonyUtil.g.b()) {
            return false;
        }
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
    
    public static void d(final Context context) {
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        TelephonyUtil.f = new d();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            TelephonyUtil.h = System.currentTimeMillis();
            TelephonyUtil.d = false;
        }
        else {
            TelephonyUtil.d = true;
            TelephonyUtil.f.a = a(activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
        }
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
            TelephonyUtil.a = "wifi";
            TelephonyUtil.c = true;
            TelephonyUtil.b = 0;
            TelephonyUtil.f.c = TelephonyUtil.a;
            TelephonyUtil.f.b = TelephonyUtil.a;
            return;
        }
        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        TelephonyUtil.c = false;
        TelephonyUtil.b = telephonyManager.getNetworkType();
        TelephonyUtil.f.c = telephonyManager.getNetworkOperatorName();
        final d f = TelephonyUtil.f;
        String subtypeName;
        if (activeNetworkInfo != null) {
            subtypeName = activeNetworkInfo.getSubtypeName();
        }
        else {
            subtypeName = "";
        }
        f.b = subtypeName;
        switch (TelephonyUtil.b) {
            default: {
                TelephonyUtil.a = "cellular";
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 11: {
                TelephonyUtil.a = "2g";
            }
            case 0: {
                TelephonyUtil.a = "unknown";
            }
        }
    }
    
    public static boolean d() {
        return TelephonyUtil.d && TelephonyUtil.g.b();
    }
    
    public static d e() {
        return TelephonyUtil.f;
    }
    
    public static boolean f() {
        return TelephonyUtil.e;
    }
    
    public static boolean g() {
        final long currentTimeMillis = System.currentTimeMillis();
        return !d() || currentTimeMillis - TelephonyUtil.h < 15000L;
    }
}
