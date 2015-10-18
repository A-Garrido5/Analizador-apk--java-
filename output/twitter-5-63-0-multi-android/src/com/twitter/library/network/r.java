// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import com.twitter.library.client.App;
import android.annotation.SuppressLint;
import android.content.SharedPreferences$Editor;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.content.Context;

public class r
{
    @SuppressLint({ "CommitPrefEdits" })
    public static void a(final Context context, final SharedPreferences sharedPreferences, final boolean b, final int n, final int n2, String s) {
        if (a(context, b, n, n2)) {
            final SharedPreferences$Editor putInt = sharedPreferences.edit().putBoolean("network_emulation_enabled", b).putInt("network_emulation_bandwidth", n).putInt("network_emulation_latency", n2);
            if (!b) {
                s = "";
            }
            putInt.putString("network_emulation_profile", s).commit();
            Toast.makeText(context, (CharSequence)"Updated emulation settings", 0).show();
        }
    }
    
    private static boolean a(final Context context, final boolean b, final int n, final int n2) {
        if (b) {
            final StringBuffer sb = new StringBuffer();
            if (n < 32) {
                sb.append("Bandwidth limit must be greater than ").append(32);
            }
            if (n2 < 1 || n2 > 30000) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(String.format("Latency must be between %d and %d", 1, 30000));
            }
            if (sb.length() > 0) {
                Toast.makeText(context, (CharSequence)sb.toString(), 1).show();
                return false;
            }
        }
        return true;
    }
    
    public static boolean a(final SharedPreferences sharedPreferences) {
        final boolean f = App.f();
        boolean b = false;
        if (f) {
            final boolean boolean1 = sharedPreferences.getBoolean("network_emulation_enabled", false);
            b = false;
            if (boolean1) {
                b = true;
            }
        }
        return b;
    }
    
    public static boolean a(final String s) {
        return s.equals("network_emulation_enabled") || s.equals("network_emulation_bandwidth") || s.equals("network_emulation_latency");
    }
    
    public static int b(final SharedPreferences sharedPreferences) {
        return sharedPreferences.getInt("network_emulation_bandwidth", 0);
    }
    
    public static int c(final SharedPreferences sharedPreferences) {
        return sharedPreferences.getInt("network_emulation_latency", 0);
    }
    
    public static String d(final SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("network_emulation_profile", "");
    }
}
