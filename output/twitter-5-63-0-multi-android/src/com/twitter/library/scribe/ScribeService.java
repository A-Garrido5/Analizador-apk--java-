// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.twitter.library.api.TwitterUser;
import android.accounts.Account;
import android.accounts.AccountManager;
import com.twitter.experiments.client.thriftandroid.DdgImpression;
import java.util.Map;
import java.io.IOException;
import android.support.v4.content.LocalBroadcastManager;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.bh;
import com.twitter.library.util.a;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import android.os.IBinder;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.Serializable;
import org.apache.thrift.TException;
import com.twitter.errorreporter.ErrorReporter;
import org.apache.thrift.e;
import org.apache.thrift.TBase;
import com.twitter.library.network.ae;
import android.os.Parcelable;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.content.Context;
import java.util.HashSet;
import java.util.ArrayList;
import com.twitter.library.util.bn;
import com.twitter.internal.network.HttpOperation;
import java.util.Iterator;
import org.apache.thrift.d;
import com.twitter.common_header.thriftandroid.CommonHeader;
import java.util.TimeZone;
import com.twitter.common_header.thriftandroid.ClientHeader;
import com.twitter.common_header.thriftandroid.b;
import com.twitter.common_header.thriftandroid.VersionedCommonHeader;
import android.content.SharedPreferences;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.Set;
import java.util.HashMap;
import com.twitter.library.featureswitch.n;
import android.app.IntentService;

public class ScribeService extends IntentService implements n
{
    public static q a;
    public static m b;
    public static l c;
    public static final boolean d;
    private static final HashMap e;
    private static final HashMap f;
    private static final HashMap g;
    private static int h;
    private static ic i;
    private static volatile Set j;
    private String k;
    private String l;
    private long m;
    private boolean n;
    
    static {
        ScribeService.a = new o();
        ScribeService.b = new com.twitter.library.scribe.n();
        ScribeService.c = new k();
        d = (App.l() && Log.isLoggable("ScribeService", 3));
        e = new HashMap();
        f = new HashMap();
        g = new HashMap();
        ScribeService.h = Integer.MIN_VALUE;
        ScribeService.e.put("LOG", 1);
        ScribeService.e.put("FLUSH", 2);
        ScribeService.e.put("RAW", 3);
        ScribeService.e.put("RESEND_EXPERIMENTS", 4);
        ScribeService.e.put("UPDATE_EXP_LOG_TIMESTAMP", 5);
        ScribeService.e.put("UPDATE_ENDPOINT_URL", 6);
        ScribeService.e.put("LOG_THRIFT", 7);
    }
    
    public ScribeService() {
        super("ScribeService");
    }
    
    private static long a(final SharedPreferences sharedPreferences) {
        final int int1 = sharedPreferences.getInt("log_failure_cnt", 0);
        if (App.f() && sharedPreferences.getBoolean("debug_scribe", false)) {
            return 5000L;
        }
        return sharedPreferences.getLong("log_interval", 60000L) << int1;
    }
    
    public static VersionedCommonHeader a() {
        final b b = new b();
        b.a(ClientHeader.b, System.currentTimeMillis()).a(ClientHeader.c, a(System.currentTimeMillis(), TimeZone.getDefault()));
        final CommonHeader commonHeader = new CommonHeader();
        commonHeader.b(CommonHeader.b, b.a());
        final VersionedCommonHeader versionedCommonHeader = new VersionedCommonHeader();
        versionedCommonHeader.b(VersionedCommonHeader.c, commonHeader);
        return versionedCommonHeader;
    }
    
    private static Long a(final long n, long min) {
        final HashMap<Object, p> hashMap = ScribeService.f.get(n);
        if (hashMap == null || hashMap.size() == 0) {
            return 0L;
        }
        final Iterator<p> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            min = Math.min(iterator.next().e, min);
        }
        return min;
    }
    
    public static String a(final HttpOperation httpOperation, final long n) {
        final String a = bn.a(httpOperation.i());
        if (ScribeService.j != null && a != null && ScribeService.j.contains(a.toLowerCase())) {
            if (a("scribe_cdn_sample_size")) {
                return "cdn::::request";
            }
        }
        else if (n != -1L && a("scribe_api_sample_size")) {
            return "api::::request";
        }
        return null;
    }
    
    private static Set a(final ArrayList list) {
        final HashSet<Long> set = new HashSet<Long>();
        if (list == null) {
            return set;
        }
        final Iterator<TwitterScribeLog> iterator = list.iterator();
        while (iterator.hasNext()) {
            final long b = iterator.next().b();
            if (!set.contains(b)) {
                set.add(b);
            }
        }
        return set;
    }
    
    static short a(final long n, final TimeZone timeZone) {
        return (short)(timeZone.getOffset(n) / 60000L);
    }
    
    public static void a(final Context context) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("log_last_flush_request", System.currentTimeMillis()).putInt("log_failure_cnt", 0).apply();
    }
    
    private static void a(final Context context, final long n) {
        context.startService(new Intent(context, (Class)ScribeService.class).setAction("RESEND_EXPERIMENTS").putExtra("user_id", n).putExtra("log", (Parcelable)new TwitterScribeLog(n)).putExtra("exp_request_time", System.currentTimeMillis()));
    }
    
    private static void a(final Context context, final long n, final String s, final int n2, final String s2, final long n3) {
        context.startService(new Intent(context, (Class)ScribeService.class).setAction("UPDATE_EXP_LOG_TIMESTAMP").putExtra("user_id", n).putExtra("exp_request_time", n3).putExtra("exp_key", s).putExtra("exp_version", n2).putExtra("exp_bucket", s2));
    }
    
    public static void a(final Context context, final long n, final Throwable t) {
        if (a("scribe_crash_sample_size", 10000)) {
            final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { "app::::crash" })).b(ae.a(context).h.toString());
            if (t != null) {
                ((TwitterScribeLog)twitterScribeLog.d(t.getClass().getName())).c(Log.getStackTraceString(t));
            }
            a(context, twitterScribeLog);
        }
    }
    
    public static void a(final Context context, final LogCategory logCategory, final long n, final TBase tBase) {
        if (com.twitter.library.featureswitch.d.f("thrift_logging_enabled")) {
            try {
                context.startService(new Intent(context, (Class)ScribeService.class).setAction("LOG_THRIFT").putExtra("scribe_category", logCategory.a()).putExtra("owner_id", n).putExtra("thrift_log", new e().a(tBase)));
            }
            catch (TException ex) {
                if (com.twitter.library.featureswitch.d.f("thrift_logging_crash_report_enabled")) {
                    ErrorReporter.a(ex);
                }
            }
        }
    }
    
    public static void a(final Context context, final ScribeLog scribeLog) {
        a(context, scribeLog, true);
    }
    
    public static void a(final Context context, final ScribeLog scribeLog, final boolean b) {
        if (b) {
            a(context, scribeLog.b());
        }
        c(context, scribeLog);
    }
    
    public static void a(final Context context, final String s, final int n, final String s2, final long n2) {
        a(context, n2, s, n, s2, System.currentTimeMillis());
        a(context, n2);
    }
    
    public static void a(final Context context, final Throwable t) {
        if (ScribeService.d) {
            Log.w("ScribeService", "Error", t);
        }
        if (a("scribe_error_sample_size", 10)) {
            a(context, new TwitterScribeLog(0L).a(t, 2, null, ae.a(context).h.toString()));
        }
    }
    
    public static void a(final Context context, final ArrayList list) {
        if (list.isEmpty()) {
            return;
        }
        final Iterator<Long> iterator = a(list).iterator();
        while (iterator.hasNext()) {
            a(context, iterator.next());
        }
        context.startService(new Intent(context, (Class)ScribeService.class).setAction("LOG").putExtra("logs", (Serializable)list));
    }
    
    public static void a(final Context context, final boolean b) {
        a(context, b, null);
    }
    
    public static void a(final ic i) {
        ScribeService.i = i;
    }
    
    private void a(final boolean b) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext());
        final int int1 = defaultSharedPreferences.getInt("log_failure_cnt", 0);
        if (b) {
            if (int1 != 0) {
                defaultSharedPreferences.edit().putInt("log_failure_cnt", 0).apply();
            }
        }
        else if (int1 < 5) {
            defaultSharedPreferences.edit().putInt("log_failure_cnt", int1 + 1).apply();
        }
    }
    
    public static boolean a(final Context context, final boolean b, final String s) {
        if (ScribeService.b.a() && b(context)) {
            final Context applicationContext = context.getApplicationContext();
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            final long currentTimeMillis = System.currentTimeMillis();
            int n;
            if (b) {
                n = 1;
            }
            else if (a(defaultSharedPreferences) + defaultSharedPreferences.getLong("log_last_flush_request", 0L) < currentTimeMillis) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                defaultSharedPreferences.edit().putLong("log_last_flush_request", currentTimeMillis).apply();
                applicationContext.startService(new Intent(applicationContext, (Class)ScribeService.class).setAction("FLUSH").putExtra("flush_request_id", s));
                return true;
            }
        }
        return false;
    }
    
    public static boolean a(final String s) {
        return a(s, 0);
    }
    
    public static boolean a(final String s, final int n) {
        return com.twitter.util.q.a.nextInt(10000) < Math.min(10000, com.twitter.library.featureswitch.d.a(s, n));
    }
    
    private void b() {
        this.n = com.twitter.library.featureswitch.d.f("scribe_enabled");
        this.m = 1000L * com.twitter.library.featureswitch.d.a("scribe_interval_seconds", 60);
        final HashSet<String> j = new HashSet<String>();
        for (final String next : com.twitter.library.featureswitch.d.h("scribe_cdn_host_list")) {
            if (next instanceof String) {
                j.add(next.toLowerCase());
            }
        }
        ScribeService.j = j;
        PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext()).edit().putBoolean("log_enabled", this.n).putLong("log_interval", this.m).apply();
    }
    
    public static void b(final Context context, final ScribeLog scribeLog) {
        a(context, scribeLog.b());
        c(context, scribeLog);
        a(context, true);
    }
    
    public static boolean b(final Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("log_enabled", false);
    }
    
    private static void c(final Context context, final ScribeLog scribeLog) {
        context.startService(new Intent(context, (Class)ScribeService.class).setAction("LOG").putExtra("log", (Parcelable)scribeLog));
    }
    
    public void a(final long n) {
        final boolean n2 = this.n;
        final long m = this.m;
        this.b();
        int n3;
        if (n2 != this.n || m != this.m) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            a(this.getApplicationContext(), false);
        }
    }
    
    public void a(final String s, final byte[] array, final long n) {
        if (array == null) {
            return;
        }
        while (true) {
            if (!ScribeService.d) {
                break Label_0035;
            }
            try {
                Log.d("ScribeService", new JSONObject(new String(array)).toString(2));
                ScribeDatabaseHelper.a((Context)this, n).a(s, array);
                a((Context)this, false);
            }
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    public void a(final byte[] array, final long n) {
        if (array == null) {
            return;
        }
        while (true) {
            if (!ScribeService.d) {
                break Label_0035;
            }
            try {
                Log.d("ScribeService", new JSONObject(new String(array)).toString(2));
                ScribeDatabaseHelper.a((Context)this, n).a(array);
                a((Context)this, false);
            }
            catch (JSONException ex) {
                continue;
            }
            break;
        }
    }
    
    public IBinder onBind(final Intent intent) {
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        final SharedPreferences sharedPreferences = this.getSharedPreferences("debug_prefs", 0);
        if (App.f() && sharedPreferences.getBoolean("scribe_endpoint_enabled", false)) {
            this.k = sharedPreferences.getString("scribe_endpoint_url", "https://twitter.com/scribe");
        }
        else {
            this.k = this.getSharedPreferences("config", 0).getString("scribe_url", "https://twitter.com/scribe");
        }
        if (App.f() && sharedPreferences.getBoolean("scribe_thrift_endpoint_enabled", false)) {
            this.l = sharedPreferences.getString("scribe_thrift_endpoint_url", "https://api.twitter.com/1.1/jot/t");
        }
        else {
            this.l = "https://api.twitter.com/1.1/jot/t";
        }
        this.b();
        com.twitter.library.featureswitch.d.a(this);
    }
    
    public void onDestroy() {
        com.twitter.library.featureswitch.d.b(this);
        super.onDestroy();
    }
    
    protected void onHandleIntent(final Intent intent) {
        Label_0004: {
            if (intent != null) {
                final Integer n = ScribeService.e.get(intent.getAction());
                int intValue;
                if (n == null) {
                    intValue = 0;
                }
                else {
                    intValue = n;
                }
                switch (intValue) {
                    default: {
                        return;
                    }
                    case 1: {
                        final ScribeLog scribeLog = (ScribeLog)intent.getParcelableExtra("log");
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (scribeLog != null) {
                            scribeLog.a(byteArrayOutputStream);
                            this.a(byteArrayOutputStream.toByteArray(), scribeLog.b());
                            return;
                        }
                        final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("logs");
                        if (parcelableArrayListExtra != null) {
                            for (final ScribeLog scribeLog2 : parcelableArrayListExtra) {
                                if (scribeLog2 != null) {
                                    scribeLog2.a(byteArrayOutputStream);
                                    this.a(byteArrayOutputStream.toByteArray(), scribeLog2.b());
                                    byteArrayOutputStream.reset();
                                }
                            }
                            break;
                        }
                        break;
                    }
                    case 7: {
                        final byte[] byteArrayExtra = intent.getByteArrayExtra("thrift_log");
                        final long longExtra = intent.getLongExtra("owner_id", 0L);
                        final String stringExtra = intent.getStringExtra("scribe_category");
                        if (byteArrayExtra != null) {
                            this.a(stringExtra, byteArrayExtra, longExtra);
                            return;
                        }
                        break;
                    }
                    case 3: {
                        this.a(intent.getByteArrayExtra("raw"), 0L);
                        return;
                    }
                    case 2: {
                    Block_9_Outer:
                        while (true) {
                            final AccountManager a;
                            final Account[] accountsByType;
                            int n2 = 0;
                            final int length;
                            int n3 = 0;
                            int n4 = 0;
                            if (ScribeService.b.a()) {
                                a = ScribeService.c.a((Context)this);
                                accountsByType = a.getAccountsByType(com.twitter.library.util.a.a);
                                n2 = 1;
                                length = accountsByType.length;
                                n3 = 0;
                                n4 = 1;
                                break Label_0310;
                            }
                            int a3 = 0;
                            int a4 = 0;
                            Label_0614: {
                            Label_0469_Outer:
                                while (true) {
                                    while (true) {
                                        Label_0543: {
                                            break Label_0543;
                                        Label_0422_Outer:
                                            while (true) {
                                                while (true) {
                                                    Label_1453: {
                                                        while (true) {
                                                            Label_1446: {
                                                                while (true) {
                                                                    Label_1439: {
                                                                        while (true) {
                                                                            Label_1432: {
                                                                                while (true) {
                                                                                Label_0634:
                                                                                    while (true) {
                                                                                        Label_0628: {
                                                                                            try {
                                                                                                final String userData;
                                                                                                final TwitterUser b = bh.b(userData);
                                                                                                final Account account;
                                                                                                final UserSettings a2 = UserSettings.a(a.getUserData(account, "account_settings"));
                                                                                                if (a2 == null) {
                                                                                                    break Label_0628;
                                                                                                }
                                                                                                final String h = a2.h;
                                                                                                final long userId = b.userId;
                                                                                                final OAuthToken b2 = com.twitter.library.util.a.b(a, account);
                                                                                                if (n4 == 0) {
                                                                                                    break Label_1453;
                                                                                                }
                                                                                                a3 = (new r((Context)this, userId, h, b2, this.k, ScribeService.i).a() ? 1 : 0);
                                                                                                if (n2 == 0) {
                                                                                                    break Label_1446;
                                                                                                }
                                                                                                a4 = (new t((Context)this, userId, b2, this.l, ScribeService.i).a() ? 1 : 0);
                                                                                                if (a3 == 0 && a4 == 0) {
                                                                                                    n2 = a4;
                                                                                                    n4 = a3;
                                                                                                    if (n4 == 0) {
                                                                                                        break Label_1439;
                                                                                                    }
                                                                                                    final int a5 = new r((Context)this, 0L, null, null, this.k, ScribeService.i).a() ? 1 : 0;
                                                                                                    if (n2 == 0) {
                                                                                                        break Label_1432;
                                                                                                    }
                                                                                                    final int a6 = new t((Context)this, 0L, null, this.l, ScribeService.i).a() ? 1 : 0;
                                                                                                    if (a5 == 0 || a6 == 0) {
                                                                                                        break Label_0634;
                                                                                                    }
                                                                                                    final boolean b3 = true;
                                                                                                    this.a(b3);
                                                                                                    if (App.a()) {
                                                                                                        final String stringExtra2 = intent.getStringExtra("flush_request_id");
                                                                                                        final Context applicationContext = this.getApplicationContext();
                                                                                                        final Intent intent2 = new Intent("SCRIBE_FLUSH_COMPLETED");
                                                                                                        if (stringExtra2 != null) {
                                                                                                            intent2.putExtra("flush_request_id", stringExtra2);
                                                                                                        }
                                                                                                        LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(intent2);
                                                                                                        return;
                                                                                                    }
                                                                                                    break Label_0004;
                                                                                                }
                                                                                            }
                                                                                            catch (IOException ex) {
                                                                                                a3 = n4;
                                                                                                a4 = n2;
                                                                                            }
                                                                                            break Label_0614;
                                                                                        }
                                                                                        final String h = null;
                                                                                        continue Label_0422_Outer;
                                                                                    }
                                                                                    final boolean b3 = false;
                                                                                    continue;
                                                                                }
                                                                            }
                                                                            final int a6 = n2;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    final int a5 = n4;
                                                                    continue;
                                                                }
                                                            }
                                                            a4 = n2;
                                                            continue Label_0469_Outer;
                                                        }
                                                    }
                                                    a3 = n4;
                                                    continue Label_0469_Outer;
                                                }
                                            }
                                        }
                                        if (n3 >= length) {
                                            continue;
                                        }
                                        break;
                                    }
                                    final Account account = accountsByType[n3];
                                    final String userData = a.getUserData(account, "account_user_info");
                                    if (userData != null) {
                                        continue Label_0469_Outer;
                                    }
                                    break;
                                }
                                a3 = n4;
                                a4 = n2;
                            }
                            ++n3;
                            n2 = a4;
                            n4 = a3;
                            continue Block_9_Outer;
                        }
                    }
                    case 4: {
                        final Long value = intent.getLongExtra("user_id", 0L);
                        final Long value2 = intent.getLongExtra("exp_request_time", 0L);
                        final Long n5 = ScribeService.g.get(value);
                        final HashMap<K, p> hashMap = ScribeService.f.get(value);
                        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext());
                        long n6;
                        long n7;
                        if (App.f() && defaultSharedPreferences.getBoolean("debug_scribe", false)) {
                            n6 = 5000L;
                            n7 = 3600000L;
                        }
                        else {
                            n6 = 1680000L;
                            n7 = 3360000L;
                        }
                        if (hashMap != null && n5 != null && value2 - n5 > n6) {
                            final Iterator<Map.Entry<K, p>> iterator2 = hashMap.entrySet().iterator();
                            while (iterator2.hasNext()) {
                                final p p = iterator2.next().getValue();
                                final long n8 = value2 - p.e;
                                boolean b4;
                                if (p.f || n8 > n6) {
                                    b4 = true;
                                }
                                else {
                                    b4 = false;
                                }
                                boolean b5;
                                if (value2 - p.d <= n6 || n8 <= n7) {
                                    b5 = true;
                                }
                                else {
                                    b5 = false;
                                }
                                if (b4 && b5) {
                                    p.a(value2);
                                    final String a7 = p.a;
                                    final int b6 = p.b;
                                    final String c = p.c;
                                    final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)intent.getParcelableExtra("log");
                                    ((TwitterScribeLog)twitterScribeLog.b(new String[] { "ddg:" + a7.toLowerCase() + ":::experiment" })).a(a7, b6, c);
                                    final ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                    twitterScribeLog.a(byteArrayOutputStream2);
                                    this.a(byteArrayOutputStream2.toByteArray(), twitterScribeLog.b());
                                    if (!com.twitter.library.featureswitch.d.f("thrift_logging_ddg_double_write_enabled")) {
                                        continue;
                                    }
                                    a(this.getApplicationContext(), LogCategory.a, value, new com.twitter.experiments.client.thriftandroid.b().a(DdgImpression.b, a()).a(DdgImpression.c, a7).a(DdgImpression.d, b6).a(DdgImpression.e, c).a());
                                }
                                else {
                                    if (b5) {
                                        continue;
                                    }
                                    iterator2.remove();
                                }
                            }
                            ScribeService.g.put(value, a(value, value2));
                            return;
                        }
                        break;
                    }
                    case 5: {
                        final Long value3 = intent.getLongExtra("user_id", 0L);
                        final Long value4 = intent.getLongExtra("exp_request_time", 0L);
                        final String stringExtra3 = intent.getStringExtra("exp_key");
                        final Integer value5 = intent.getIntExtra("exp_version", 0);
                        final String stringExtra4 = intent.getStringExtra("exp_bucket");
                        HashMap<?, ?> hashMap2 = ScribeService.f.get(value3);
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap<Object, Object>();
                            ScribeService.f.put(value3, hashMap2);
                        }
                        if (hashMap2.containsKey(stringExtra3)) {
                            hashMap2.get(stringExtra3).a(value5, stringExtra4, value4);
                        }
                        else {
                            hashMap2.put((Long)stringExtra3, new p(stringExtra3, value5, stringExtra4, value4));
                        }
                        ScribeService.g.put(value3, a(value3, value4));
                        return;
                    }
                    case 6: {
                        final SharedPreferences sharedPreferences = this.getSharedPreferences("debug_prefs", 0);
                        final String stringExtra5 = intent.getStringExtra("endpoint_url");
                        if (stringExtra5 != null) {
                            this.k = stringExtra5;
                            sharedPreferences.edit().putBoolean("scribe_endpoint_enabled", true).putString("scribe_endpoint_url", stringExtra5).apply();
                            return;
                        }
                        this.k = "https://twitter.com/scribe";
                        sharedPreferences.edit().putBoolean("scribe_endpoint_enabled", false).putString("scribe_endpoint_url", "https://twitter.com/scribe").apply();
                        return;
                    }
                }
            }
        }
    }
}
