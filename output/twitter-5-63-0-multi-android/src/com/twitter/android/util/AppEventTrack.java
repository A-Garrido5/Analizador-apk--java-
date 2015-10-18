// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.api.b;
import org.json.JSONException;
import com.twitter.library.util.bq;
import com.twitter.library.network.ae;
import android.os.Build$VERSION;
import android.telephony.TelephonyManager;
import android.os.Build;
import java.util.Locale;
import com.twitter.library.client.az;
import com.twitter.library.client.u;
import org.json.JSONObject;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.featureswitch.d;
import android.net.Uri;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class AppEventTrack
{
    public static final Map a;
    
    static {
        (a = new HashMap()).put("twcamp", "utm_campaign");
        AppEventTrack.a.put("twcon", "utm_content");
        AppEventTrack.a.put("twterm", "utm_term");
        AppEventTrack.a.put("twsrc", "utm_source");
        AppEventTrack.a.put("twgr", "utm_medium");
    }
    
    static String a(final Context context) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        final long n = lcmp((System.currentTimeMillis() - defaultSharedPreferences.getLong("pref_ref_src_date", 0L)) / 86400000L, 30L);
        String string = null;
        if (n <= 0) {
            string = defaultSharedPreferences.getString("pref_ref_src", (String)null);
        }
        return string;
    }
    
    public static String a(final String s, final ArrayList list) {
        if (s != null && list != null) {
            final Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                final String[] split = iterator.next().split(":");
                if (split.length == 2 && TextUtils.equals((CharSequence)split[0], (CharSequence)s)) {
                    return split[1];
                }
            }
        }
        return null;
    }
    
    public static String a(final HashMap hashMap) {
        final Iterator<Map.Entry<Object, V>> iterator = hashMap.entrySet().iterator();
        final StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            final Map.Entry<Object, V> entry = iterator.next();
            sb.append(entry.getKey() + "%5E" + entry.getValue());
            if (!iterator.hasNext()) {
                break;
            }
            sb.append("%7C");
            iterator.remove();
        }
        return sb.toString();
    }
    
    public static HashMap a(final String s) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        if (s != null) {
            final String[] split = s.split("&|%26|\\||%7C");
            for (int length = split.length, i = 0; i < length; ++i) {
                final String[] split2 = split[i].split("=|%3D|\\^|%5E");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }
    
    public static void a(final Context context, final Uri uri) {
        final String queryParameter = uri.getQueryParameter("mat_click_id");
        String s = uri.getQueryParameter("ref_src");
        if (s == null) {
            s = a(uri.getQueryParameter("s"), d.h("shortened_tracking_parameters_mapping"));
        }
        if (queryParameter != null || s != null) {
            a(context, s);
            a(context, AppEventTrack$EventType.b, uri.toString(), queryParameter, s);
        }
    }
    
    public static void a(final Context context, final AppEventTrack$EventType appEventTrack$EventType, final String... array) {
        if (appEventTrack$EventType == AppEventTrack$EventType.a || d.f("app_event_track_enabled")) {
            new f(context, appEventTrack$EventType).execute((Object[])array);
        }
    }
    
    public static void a(final Context context, final TwitterScribeLog twitterScribeLog) {
        final String a = a(context);
        if (a != null) {
            new h(a(a)).a(twitterScribeLog, null);
        }
    }
    
    public static void a(final Context context, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("pref_ref_src", s).putLong("pref_ref_src_date", System.currentTimeMillis()).apply();
        }
    }
    
    static JSONObject b(final Context context, final AppEventTrack$EventType appEventTrack$EventType, final String... array) {
        final JSONObject jsonObject = new JSONObject();
        final b a = u.a.a();
        final Long value = az.a(context).b().g();
        final Locale default1 = Locale.getDefault();
        final String country = default1.getCountry();
        final String brand = Build.BRAND;
        final String model = Build.MODEL;
        final String networkOperatorName = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
        final String displayLanguage = default1.getDisplayLanguage();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final String string = ae.a(context).h.toString();
        final long currentTimeMillis = System.currentTimeMillis();
        Label_0136: {
            if (a == null) {
                break Label_0136;
            }
            try {
                jsonObject.put("aid", (Object)a.a());
                int n;
                if (a.b()) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                jsonObject.put("limit_ad_tracking", n);
                jsonObject.put("user_id", (Object)value).put("country_code", (Object)country).put("dev_brand", (Object)brand).put("dev_model", (Object)model).put("dev_carrier", (Object)networkOperatorName).put("lang", (Object)displayLanguage).put("os_ver", sdk_INT).put("user_agent", (Object)string).put("ts", currentTimeMillis).put("os_name", (Object)"android").put("guest_id", bq.a(context));
                switch (e.a[appEventTrack$EventType.ordinal()]) {
                    case 4: {
                        jsonObject.put("action", (Object)"login");
                        jsonObject.put("integration", (Object)"hasOffersEvent");
                        break;
                    }
                    case 5: {
                        jsonObject.put("action", (Object)"signup");
                        jsonObject.put("integration", (Object)"hasOffersEvent");
                        break;
                    }
                    case 1: {
                        if (array.length != 1) {
                            return null;
                        }
                        jsonObject.put("action", (Object)"launch");
                        jsonObject.put("referrer", (Object)array[0]);
                        jsonObject.put("integration", (Object)"hasOffersSession");
                        break;
                    }
                    case 2: {
                        if (array.length != 3) {
                            return null;
                        }
                        jsonObject.put("action", (Object)"open");
                        jsonObject.put("integration", (Object)"hasOffersSession");
                        jsonObject.put("mat_click_id", (Object)array[1]).put("ref_src", (Object)array[2]).put("ref", (Object)array[0]);
                        break;
                    }
                    case 3: {
                        jsonObject.put("action", (Object)"update");
                        jsonObject.put("integration", (Object)"hasOffersSession");
                        break;
                    }
                }
                return jsonObject;
            }
            catch (JSONException ex) {
                return null;
            }
        }
    }
    
    public static void b(final Context context, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("oem_referrer", s).apply();
        }
    }
    
    public static boolean b(final Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("oem_referrer", (String)null) != null;
    }
}
