// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.preference.PreferenceManager;
import com.twitter.library.api.conversations.DMPhoto;
import com.twitter.library.api.conversations.BaseConversationEntry;
import java.util.Collection;
import com.twitter.library.api.conversations.u;
import com.twitter.library.api.conversations.ay;
import java.util.HashSet;
import android.os.Build$VERSION;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.provider.Settings$Secure;
import android.text.TextUtils;
import android.content.ContentResolver;
import com.twitter.library.provider.NotificationSetting;
import android.net.Uri;
import com.twitter.library.provider.n;
import android.os.Parcelable;
import android.content.SharedPreferences$Editor;
import com.twitter.library.client.az;
import com.twitter.library.client.m;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.api.conversations.BaseDMAttachment;
import com.twitter.library.api.conversations.y;
import com.twitter.library.api.conversations.DMMessageEntry;
import java.util.List;
import com.twitter.library.platform.notifications.f;
import org.json.JSONException;
import com.twitter.library.api.conversations.DMTweet;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.api.conversations.s;
import com.twitter.library.api.conversations.JoinConversationEntry;
import java.io.Serializable;
import com.twitter.library.featureswitch.d;
import com.twitter.library.platform.notifications.NotificationParser;
import com.twitter.library.experiments.c;
import org.json.JSONObject;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.database.Cursor;
import com.twitter.library.provider.bg;
import com.twitter.library.provider.ae;
import android.content.Intent;
import com.twitter.errorreporter.ErrorReporter;
import com.google.android.gcm.b;
import com.twitter.library.util.a;
import android.accounts.AccountManager;
import android.accounts.Account;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import android.os.Looper;
import android.util.Log;
import com.twitter.library.client.App;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.HashMap;
import com.google.android.gcm.GCMBaseIntentService;

public class PushService extends GCMBaseIntentService
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static final HashMap f;
    private static final HashMap g;
    private static final boolean h;
    private static final AtomicBoolean i;
    private static final AtomicBoolean j;
    private static boolean k;
    private static boolean l;
    private static String m;
    private static final Handler n;
    private static boolean o;
    private static String p;
    
    static {
        a = App.a(".c2dm.add");
        b = App.a(".c2dm.update");
        c = App.a(".c2dm.del");
        d = App.a(".c2dm.registered");
        e = App.a(".c2dm.error");
        f = new HashMap(14);
        g = new HashMap(14);
        h = (App.l() && Log.isLoggable("PushService", 3));
        PushService.m = "";
        n = new Handler(Looper.getMainLooper());
        PushService.o = false;
        PushService.p = "";
        PushService.f.put(74, "tweet");
        PushService.f.put(4, "mention");
        PushService.f.put(22, "direct_message");
        PushService.f.put(5, "favorited");
        PushService.f.put(6, "retweeted");
        PushService.f.put(23, "followed");
        PushService.f.put(24, "followed_request");
        PushService.f.put(143, "login_verification_request");
        PushService.f.put(9, "generic");
        PushService.f.put(10, "lifeline");
        PushService.f.put(11, "media_tagged");
        PushService.f.put(274, "group_direct_message");
        PushService.f.put(13, "msg_join_cnv");
        PushService.f.put(270, "highlights");
        PushService.f.put(285, "logged_out_notification");
        for (final Map.Entry<K, Object> entry : PushService.f.entrySet()) {
            PushService.g.put(entry.getValue(), entry.getKey());
        }
        i = new AtomicBoolean(false);
        j = new AtomicBoolean(false);
    }
    
    public PushService() {
        super(new String[] { "49625052041" });
    }
    
    public static int a(final Context context, final Account account, final int n) {
        return a(context, account, n, true);
    }
    
    public static int a(final Context context, final Account account, final int n, final boolean b) {
        final boolean d = d(context, account);
        final Context applicationContext = context.getApplicationContext();
        a(applicationContext, account, n != 0);
        final int b2 = new k().b(applicationContext, account, com.twitter.library.util.a.b(AccountManager.get(applicationContext), account), b.f(applicationContext), n);
        if (b2 == 1) {
            a(applicationContext, account, System.currentTimeMillis());
        }
        else if (b2 == 2) {
            ErrorReporter.a(new i(context, account, b2).a(new PushService$DeviceLimitException("Device limit exceeded failure when updating push destinations")));
        }
        String s;
        if (d) {
            s = PushService.b;
        }
        else {
            s = PushService.a;
        }
        final Intent intent = new Intent(s);
        intent.putExtra("push_return_code", b2).putExtra("show_toast_message", b);
        applicationContext.sendOrderedBroadcast(intent, ae.a);
        return b2;
    }
    
    public static int a(final String s, final long n, final Context context) {
        if (s == null) {
            return 0;
        }
        final Cursor query = com.twitter.library.provider.k.a(context).getReadableDatabase().query("states_settings", com.twitter.library.provider.k.b, "account_name=?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
        int n2;
        if (query != null) {
            if (query.moveToFirst()) {
                if (query.getInt(0) != 0 && 1 == query.getInt(3)) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                final int int1 = query.getInt(1);
                final int int2 = query.getInt(4);
                if ((int1 & 0x3) != 0x0 && (int2 & 0x1) != 0x0) {
                    n2 |= 0x2;
                }
                if ((int1 & 0x3) != 0x0 && (int2 & 0x200) != 0x0) {
                    n2 |= 0x200;
                }
                if ((int1 & 0xC) != 0x0 && (int2 & 0x8) != 0x0) {
                    n2 |= 0x8;
                }
                if ((int1 & 0x30) != 0x0 && (int2 & 0x2) != 0x0) {
                    n2 |= 0x10;
                }
                if ((int1 & 0x40) != 0x0 && ((int2 & 0x4) != 0x0 || (int2 & 0x20) != 0x0)) {
                    n2 |= 0x20;
                }
                if ((int2 & 0x40) != 0x0) {
                    n2 |= 0x40;
                }
                if ((int2 & 0x80) != 0x0) {
                    n2 |= 0x80;
                }
                if ((int2 & 0x100) != 0x0) {
                    n2 |= 0x100;
                }
                if (query.getInt(2) != 0) {
                    final Cursor rawQuery = bg.a(context, n).getReadableDatabase().rawQuery("SELECT COUNT(*) FROM conversations WHERE last_readable_event_id > last_read_event_id AND last_readable_event_id > (SELECT COALESCE((SELECT CAST(next as int) AS last_seen_event_id FROM cursors WHERE kind=14 AND type=0 ORDER BY last_seen_event_id DESC LIMIT 1), 0));", (String[])null);
                    if (rawQuery != null) {
                        if (rawQuery.moveToFirst() && rawQuery.getInt(0) > 0) {
                            n2 |= 0x4;
                        }
                        rawQuery.close();
                    }
                }
            }
            else {
                n2 = 0;
            }
            query.close();
        }
        else {
            n2 = 0;
        }
        return n2;
    }
    
    public static long a(final Context context, final Account account) {
        return f(context, account).getLong("last_refresh.", 0L);
    }
    
    static g a(final Bundle d, final SharedPreferences sharedPreferences, final Context context, final int n) {
        if (n == 0) {
            final g g = new g();
            (g.d = d).putString("recipient_id", d.getString("user_id"));
            return g;
        }
        final h b = b(d);
        Label_0214: {
            if (!d.containsKey("users")) {
                break Label_0214;
            }
            final String string = d.getString("users");
        Label_0109:
            while (true) {
                if (!PushService.h) {
                    break Label_0109;
                }
                j j;
                f a;
                f b2;
                String s;
                Bundle d2;
                String string2;
                j i;
                com.twitter.library.platform.notifications.d a2;
                com.twitter.library.platform.notifications.d a3;
                String string3;
                j k;
                List d3;
                List c;
                String s2;
                int b3;
                String string4;
                j l;
                DMTweet b4;
                DMMessageEntry b5;
                y c2;
                String e;
                String string5;
                g g2;
                Label_0144_Outer:Label_0895_Outer:
                while (true) {
                    while (true) {
                        Label_1545: {
                            try {
                                Log.d("PushService", "Notification Payload - users: " + new JSONObject(string).toString(2));
                                j = new j(b.a);
                                a = NotificationParser.a(string, j, com.twitter.library.experiments.c.a());
                                ErrorReporter.a(j);
                                b2 = a;
                                while (true) {
                                    if (b2 == null || b2.a == null || (b.b != 143 && b2.b == null)) {
                                        if (b2 == null) {
                                            s = "Missing users";
                                        }
                                        else if (b2.a == null) {
                                            s = "Missing recipient";
                                        }
                                        else {
                                            s = "Missing sender";
                                        }
                                        ErrorReporter.a(new PushService$InvalidNotificationPayloadException(s));
                                        if (PushService.h) {
                                            Log.w("PushService", s);
                                        }
                                        return null;
                                    }
                                    d2 = new Bundle();
                                    d2.putString("recipient_name", b2.a.b);
                                    Label_0652: {
                                        if (!d.containsKey("priority")) {
                                            break Label_0652;
                                        }
                                        d2.putString("priority", d.getString("priority"));
                                        Label_0718: {
                                            if (!d.containsKey("tweet")) {
                                                break Label_0718;
                                            }
                                            string2 = d.getString("tweet");
                                            Label_0355: {
                                                if (!PushService.h) {
                                                    break Label_0355;
                                                }
                                                try {
                                                    Log.d("PushService", "Notification Payload - tweet: " + new JSONObject(string2).toString(2));
                                                    i = new j(b2.a.a, b.a);
                                                    a2 = NotificationParser.a(string2, i);
                                                    ErrorReporter.a(i);
                                                    a3 = a2;
                                                    while (true) {
                                                        Label_0724: {
                                                            if (!d.f("android_notification_actions_from_push_payload_enabled") || !d.containsKey("actions")) {
                                                                break Label_0724;
                                                            }
                                                            string3 = d.getString("actions");
                                                            Label_0467: {
                                                                if (!PushService.h) {
                                                                    break Label_0467;
                                                                }
                                                                try {
                                                                    Log.d("PushService", "Notification Payload - actions: " + new JSONObject(string3).toString(2));
                                                                    k = new j(b2.a.a, b.a);
                                                                    d3 = NotificationParser.d(string3, k);
                                                                    ErrorReporter.a(k);
                                                                    c = d3;
                                                                    // iftrue(Label_0294:, !PushService.h)
                                                                    Block_25: {
                                                                        while (true) {
                                                                            s2 = null;
                                                                            Label_0764: {
                                                                                if (n == 2) {
                                                                                    if (b.b != 22) {
                                                                                        b3 = b.b;
                                                                                        s2 = null;
                                                                                        if (b3 != 274) {
                                                                                            break Label_0764;
                                                                                        }
                                                                                    }
                                                                                    if (!d.containsKey("notification_event_data")) {
                                                                                        ErrorReporter.a(new j(b2.a.a, b.a).a(new PushService$InvalidNotificationPayloadException("Missing notification_event_data")));
                                                                                        if (PushService.h) {
                                                                                            Log.w("PushService", "Missing notification_event_data");
                                                                                        }
                                                                                        return null;
                                                                                    }
                                                                                    string4 = d.getString("notification_event_data");
                                                                                    l = new j(b2.a.a, b.a);
                                                                                    if (d.containsKey("dm_tweet")) {
                                                                                        b4 = NotificationParser.b(d.getString("dm_tweet"), l);
                                                                                    }
                                                                                    else {
                                                                                        b4 = null;
                                                                                    }
                                                                                    b5 = NotificationParser.b(string4, l, Boolean.parseBoolean(d.getString("is_partial")) || b4 != null);
                                                                                    ErrorReporter.a(l);
                                                                                    if (b5 == null) {
                                                                                        return null;
                                                                                    }
                                                                                    s2 = a(b5, b4, b2, context);
                                                                                    d2.putSerializable("notification_dm_data", (Serializable)b5);
                                                                                }
                                                                            }
                                                                            if (b.b == 13 && d.containsKey("notification_event_data")) {
                                                                                c2 = NotificationParser.c(d.getString("notification_event_data"), new j(b2.a.a, b.a));
                                                                                d2.putSerializable("notification_dm_data", (Serializable)c2.a().get(0));
                                                                                e = c2.c().get(0).e;
                                                                                s2 = ak.a(context.getResources(), b2.b.a, b2.b.c, s2, false, false, true, 17, null, true);
                                                                                if (s2 != null) {
                                                                                    d2.putString("text", s2);
                                                                                }
                                                                                else if (d.containsKey("text")) {
                                                                                    d2.putString("text", d.getString("text"));
                                                                                }
                                                                                else {
                                                                                    if (a3 == null) {
                                                                                        ErrorReporter.a(new j(b2.a.a, b.a).a(new PushService$InvalidNotificationPayloadException("Missing text")));
                                                                                        if (PushService.h) {
                                                                                            Log.w("PushService", "Missing text");
                                                                                        }
                                                                                        return null;
                                                                                    }
                                                                                    d2.putString("text", a3.d);
                                                                                }
                                                                                if (e != null) {
                                                                                    d2.putString("title", e);
                                                                                }
                                                                                else {
                                                                                    d2.putString("title", d.getString("title"));
                                                                                }
                                                                                d2.putString("scribe_target", d.getString("scribe_target"));
                                                                                d2.putString("sound", d.getString("sound"));
                                                                                d2.putString("collapse_key", b.a);
                                                                                d2.putInt("notification_type", b.b);
                                                                                if (b.b == 9) {
                                                                                    d2.putString("notification_setting_key", b.a);
                                                                                    d2.putString("recipient_id", String.valueOf(b2.a.a));
                                                                                    d2.putString("uri", d.getString("uri"));
                                                                                    if (b2.b != null) {
                                                                                        d2.putString("sender_id", String.valueOf(b2.b.a));
                                                                                    }
                                                                                    if (a3 != null) {
                                                                                        d2.putString("status_id", String.valueOf(a3.a));
                                                                                    }
                                                                                    string5 = b.a + "_opt_out_count";
                                                                                    sharedPreferences.edit().putInt(string5, sharedPreferences.getInt(string5, 0) + 1).apply();
                                                                                }
                                                                                else if (b.b == 270) {
                                                                                    d2.putString("recipient_id", String.valueOf(b2.a.a));
                                                                                    d2.putString("uri", d.getString("uri"));
                                                                                }
                                                                                else {
                                                                                    d2.putString("recipient_id", String.valueOf(b2.a.a));
                                                                                    if (a3 != null) {
                                                                                        d2.putString("status_id", String.valueOf(a3.a));
                                                                                    }
                                                                                    else {
                                                                                        d2.putString("status_id", "0");
                                                                                    }
                                                                                    if (b2.b != null) {
                                                                                        d2.putString("sender_id", String.valueOf(b2.b.a));
                                                                                    }
                                                                                    if (b.b == 143) {
                                                                                        d2.putString("sender_name", "");
                                                                                    }
                                                                                    else {
                                                                                        d2.putString("sender_name", b2.b.b);
                                                                                    }
                                                                                }
                                                                                g2 = new g();
                                                                                g2.a = a3;
                                                                                g2.b = b2;
                                                                                g2.c = c;
                                                                                g2.d = d2;
                                                                                return g2;
                                                                            }
                                                                            break Label_1545;
                                                                            d2.putString("priority", String.valueOf(0));
                                                                            ErrorReporter.a(new j(b2.a.a, b.a).a(new PushService$InvalidNotificationPayloadException("Missing priority")));
                                                                            break Block_25;
                                                                            c = null;
                                                                            continue Label_0895_Outer;
                                                                        }
                                                                        a3 = null;
                                                                        continue Label_0144_Outer;
                                                                    }
                                                                    Log.w("PushService", "Missing priority");
                                                                }
                                                                catch (JSONException ex) {}
                                                            }
                                                        }
                                                    }
                                                }
                                                catch (JSONException ex2) {}
                                            }
                                        }
                                    }
                                    b2 = null;
                                    continue Label_0895_Outer;
                                }
                            }
                            catch (JSONException ex3) {
                                continue Label_0109;
                            }
                        }
                        e = null;
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public static String a() {
        return PushService.m;
    }
    
    static String a(final int n) {
        return PushService.f.get(n);
    }
    
    static String a(final Bundle bundle) {
        final h b = b(bundle);
        if (b.b == 22 || b.b == 13 || b.b == 274 || b.b == 270) {
            return b.a;
        }
        return bundle.getString("collapse_key");
    }
    
    private static String a(final DMMessageEntry dmMessageEntry, final DMTweet dmTweet, final f f, final Context context) {
        if (dmTweet != null) {
            final com.twitter.library.provider.i b = ak.b(new com.twitter.library.provider.i(dmMessageEntry.text, dmMessageEntry.entities), dmTweet);
            return ak.a(context.getResources(), f.b.a, f.b.c, TweetEntities.a(new StringBuilder(b.a), b.b).toString(), false, false, true, 0, dmTweet, true);
        }
        return TweetEntities.a(new StringBuilder(dmMessageEntry.text), dmMessageEntry.entities).toString();
    }
    
    public static void a(final Context context, final Account account, final long n) {
        f(context, account).a().a("last_refresh.", n).apply();
    }
    
    public static void a(final Context context, final Account account, final boolean b) {
        f(context, account).a().a("enabled", b).apply();
    }
    
    private static void a(final Context context, final SharedPreferences sharedPreferences) {
        if (!sharedPreferences.getAll().isEmpty()) {
            final Account[] accountsByType = AccountManager.get(context).getAccountsByType(com.twitter.library.util.a.a);
            if (accountsByType != null) {
                for (final Account account : accountsByType) {
                    final m a = new com.twitter.library.client.k(context, account.name, "c2dm").a();
                    final String string = "last_refresh." + account.name;
                    if (sharedPreferences.contains(string)) {
                        a.a("last_refresh.", sharedPreferences.getLong(string, 0L));
                    }
                    final String string2 = "reg_enabled_for." + account.name;
                    if (sharedPreferences.contains(string2)) {
                        a.a("reg_enabled_for.", sharedPreferences.getInt(string2, 0));
                    }
                    a.apply();
                }
            }
        }
    }
    
    private static void a(final Context context, final String s, final PushService$DebugNotificationException ex) {
        if (az.a(context).b().g() == 16671865L) {
            ErrorReporter.a(new com.twitter.errorreporter.a().a("Package", context.getPackageName()).a("Registration ID", s).a("Device ID", b(context)).a(ex));
        }
    }
    
    private static void a(final SharedPreferences sharedPreferences, int n, final int n2) {
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        if (n == 0) {
            n = 1;
        }
        if (n == 1) {
            edit.remove("reg_id").remove("backoff").remove("backoff_ceil").remove("last_refresh.");
        }
        edit.putInt("ver", n2).apply();
    }
    
    private void a(final DataSyncResult dataSyncResult, final String s) {
        final Intent intent = new Intent(TwitterDataSyncService.a);
        intent.putExtra(s, (Parcelable)dataSyncResult);
        intent.putExtra("from_push", true);
        this.sendOrderedBroadcast(intent, ae.a);
    }
    
    public static void a(final String p) {
        PushService.o = true;
        PushService.p = p;
    }
    
    public static int b(final Context context, final Account account) {
        int int1 = 1;
        if (account == null) {
            return 0;
        }
        final ContentResolver contentResolver = context.getContentResolver();
        final Uri withAppendedPath = Uri.withAppendedPath(com.twitter.library.provider.n.a, account.name);
        final String[] array = new String[10];
        array[0] = "notif_mention";
        array[int1] = "notif_message";
        array[2] = "notif_tweet";
        array[3] = "notif_experimental";
        array[4] = "notif_lifeline_alerts";
        array[5] = "notif_recommendations";
        array[6] = "notif_news";
        array[7] = "notif_vit_notable_event";
        array[8] = "notif_offer_redemption";
        array[9] = "notif_highlights";
        final Cursor query = contentResolver.query(withAppendedPath, array, (String)null, (String[])null, (String)null);
        int int3;
        int int4;
        int int5;
        int int6;
        int int7;
        int int8;
        int int9;
        int n;
        int n2;
        if (query != null) {
            if (query.moveToFirst()) {
                int int2;
                if (!query.isNull(0)) {
                    int2 = query.getInt(0);
                }
                else {
                    int2 = 2005;
                }
                if (!query.isNull(int1)) {
                    int3 = query.getInt(int1);
                }
                else {
                    int3 = int1;
                }
                if (!query.isNull(2)) {
                    int4 = query.getInt(2);
                }
                else {
                    int4 = 0;
                }
                if (!query.isNull(3)) {
                    int5 = query.getInt(3);
                }
                else {
                    int5 = int1;
                }
                if (!query.isNull(4)) {
                    int6 = query.getInt(4);
                }
                else {
                    int6 = int1;
                }
                if (!query.isNull(5)) {
                    int7 = query.getInt(5);
                }
                else {
                    int7 = int1;
                }
                if (!query.isNull(6)) {
                    int8 = query.getInt(6);
                }
                else {
                    int8 = int1;
                }
                if (!query.isNull(7)) {
                    int9 = query.getInt(7);
                }
                else {
                    int9 = int1;
                }
                if (!query.isNull(8)) {
                    int1 = query.getInt(8);
                }
                if (!query.isNull(9)) {
                    final int int10 = query.getInt(9);
                    n = int2;
                    n2 = int10;
                }
                else {
                    n = int2;
                    n2 = 0;
                }
            }
            else {
                int9 = int1;
                int7 = int1;
                int6 = int1;
                int5 = int1;
                int3 = int1;
                n = 2005;
                int8 = int1;
                n2 = 0;
                int4 = 0;
            }
            query.close();
        }
        else {
            int9 = int1;
            int7 = int1;
            int6 = int1;
            int5 = int1;
            int3 = int1;
            n = 2005;
            int8 = int1;
            n2 = 0;
            int4 = 0;
        }
        return 0x0 | NotificationSetting.a.d(n) | NotificationSetting.c.d(n) | NotificationSetting.b.d(n) | NotificationSetting.d.d(n) | NotificationSetting.h.d(n) | NotificationSetting.l.d(n) | NotificationSetting.m.d(n) | NotificationSetting.e.d(int3) | NotificationSetting.g.d(int4) | NotificationSetting.i.d(int5) | NotificationSetting.f.d(int6) | NotificationSetting.j.d(int7) | NotificationSetting.k.d(int8) | NotificationSetting.n.d(int9) | NotificationSetting.o.d(n) | NotificationSetting.p.d(int1) | NotificationSetting.q.d(n2);
    }
    
    static int b(final String s) {
        final Integer n = PushService.g.get(s);
        if (n == null) {
            return 9;
        }
        return n;
    }
    
    static h b(final Bundle bundle) {
        int b = 9;
        String string2;
        if (bundle.containsKey("type")) {
            final String string = bundle.getString("type");
            int int1;
            if (TextUtils.isEmpty((CharSequence)string)) {
                int1 = b;
            }
            else {
                int1 = Integer.parseInt(string);
            }
            final String a = a(int1);
            if (a == null) {
                string2 = "generic";
            }
            else {
                b = int1;
                string2 = a;
            }
        }
        else {
            string2 = bundle.getString("collapse_key");
            b = b(string2);
        }
        return new h(string2, b);
    }
    
    public static String b(final Context context) {
        String s = Settings$Secure.getString(context.getContentResolver(), "android_id");
        if (App.f()) {
            s = s + "-" + App.i();
        }
        return s;
    }
    
    private static void b(final StringBuilder sb) {
        if (App.b()) {
            com.twitter.library.network.ae.a(sb, "environment", 2);
        }
    }
    
    public static boolean c(final Context context) {
        synchronized (PushService.class) {
            Label_0033: {
                if (PushService.k) {
                    break Label_0033;
                }
                try {
                    com.google.android.gcm.b.a(context);
                    if (App.a()) {
                        com.google.android.gcm.b.b(context);
                    }
                    PushService.l = true;
                    PushService.k = true;
                    return PushService.l;
                }
                catch (UnsupportedOperationException ex) {
                    PushService.l = false;
                }
            }
        }
    }
    
    public static boolean c(final Context context, final Account account) {
        final Context applicationContext = context.getApplicationContext();
        if (com.google.android.gcm.b.g(applicationContext)) {
            a(applicationContext, account, true);
            return true;
        }
        e(applicationContext);
        return false;
    }
    
    public static String d(final Context context) {
        return com.google.android.gcm.b.f(context.getApplicationContext());
    }
    
    public static boolean d(final Context context, final Account account) {
        return f(context, account).getBoolean("enabled", true);
    }
    
    public static void e(final Context context) {
        if (PushService.i.compareAndSet(false, true)) {
            if (PushService.k) {
                if (!PushService.l) {
                    ErrorReporter.a(new com.twitter.errorreporter.a(new IllegalStateException("Should not call PushService#register if PushService#isEnabled isn't true")));
                }
            }
            else {
                ErrorReporter.a(new com.twitter.errorreporter.a(new IllegalStateException("Should call PushService#isEnabled before PushService#register")));
            }
            com.google.android.gcm.b.a(context.getApplicationContext(), new String[] { "49625052041" });
        }
    }
    
    public static void e(final Context context, final Account account) {
        final Context applicationContext = context.getApplicationContext();
        if (new k().a(applicationContext, AccountManager.get(applicationContext), account)) {
            applicationContext.sendOrderedBroadcast(new Intent(PushService.c).putExtra("push_return_code", 1), ae.a);
        }
    }
    
    public static void e(final Context context, final String s) {
        if (!PushService.j.compareAndSet(false, true)) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        final AccountManager value = AccountManager.get(applicationContext);
        final Account[] accountsByType = value.getAccountsByType(com.twitter.library.util.a.a);
        final long currentTimeMillis = System.currentTimeMillis();
        int n = 0;
        int n2;
        for (int length = accountsByType.length, i = 0; i < length; ++i, n = n2) {
            final Account account = accountsByType[i];
            if (!d(applicationContext, account) || 86400000L + a(applicationContext, account) >= currentTimeMillis) {
                n2 = n + 1;
            }
            else {
                final int a = new k().a(applicationContext, account, com.twitter.library.util.a.b(value, account), s, b(applicationContext, account));
                if (a == 1) {
                    a(applicationContext, account, currentTimeMillis);
                    n2 = n + 1;
                }
                else {
                    if (a == 2) {
                        ErrorReporter.a(new i(context, account, a).a(new PushService$DeviceLimitException("Device limit exceeded failure when refreshing push destinations")));
                    }
                    n2 = n;
                }
            }
        }
        if (n == accountsByType.length) {
            com.google.android.gcm.b.a(applicationContext, 86400000L);
            com.google.android.gcm.b.a(applicationContext, true);
        }
        PushService.j.set(false);
    }
    
    private static com.twitter.library.client.k f(final Context context, final Account account) {
        final Context applicationContext = context.getApplicationContext();
        g(applicationContext);
        return new com.twitter.library.client.k(applicationContext, account.name, "c2dm");
    }
    
    public static void f(final Context context) {
        com.google.android.gcm.b.c(context.getApplicationContext());
    }
    
    public static boolean f(final Context context, final String s) {
        return !com.google.android.gcm.b.i(context) || (s != null && a(context, com.twitter.library.util.a.a(s)) == 0L);
    }
    
    private static void g(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("c2dm", 0);
        if (sharedPreferences.contains("ver")) {
            final int int1 = sharedPreferences.getInt("ver", 2);
            if (int1 < 2) {
                a(sharedPreferences, int1, 2);
            }
            return;
        }
        a(sharedPreferences, 0, 2);
        a(context, sharedPreferences);
    }
    
    public static boolean g(final Context context, final String s) {
        final Context applicationContext = context.getApplicationContext();
        if (com.google.android.gcm.b.g(applicationContext)) {
            final Account a = com.twitter.library.util.a.a(applicationContext, s);
            if (a != null && d(applicationContext, a)) {
                return true;
            }
        }
        return false;
    }
    
    private void h(final Context context, String s) {
        if (s == null) {
            s = "unknown";
        }
        ScribeService.a(context, ((TwitterScribeLog)new TwitterScribeLog(Long.valueOf(az.a(context).b().g())).b(new String[] { "notification:status_bar::" + s + ":push_data_received" })).c(2));
    }
    
    DataSyncResult a(final g g) {
        final Bundle d = g.d;
        final Account a = com.twitter.library.util.a.a((Context)this, d.getString("recipient_name"));
        if (a == null) {
            return null;
        }
        final String name = a.name;
        final int int1 = d.getInt("notification_type");
        final String string = d.getString("collapse_key");
        final String string2 = d.getString("priority");
        final String string3 = d.getString("recipient_id");
        final String string4 = d.getString("status_id");
        final String string5 = d.getString("sender_name");
        final String string6 = d.getString("sender_id");
        final String string7 = d.getString("title");
        final String string8 = d.getString("text");
        final String string9 = d.getString("scribe_target");
        final String string10 = d.getString("notification_setting_key");
        final String string11 = d.getString("sound");
        if (PushService.h) {
            Log.d("PushService", "collapse_key: " + string);
            Log.d("PushService", "notificationType: " + int1);
            Log.d("PushService", "priority:" + string2);
            Log.d("PushService", "sender_name: " + string5);
            Log.d("PushService", "recipient_name: " + name);
            Log.d("PushService", "recipient_id: " + string3);
            Log.d("PushService", "status_id: " + string4);
            Log.d("PushService", "text: " + string8);
            Log.d("PushService", "title: " + string7);
            Log.d("PushService", "scribe_target: " + string9);
            Log.d("PushService", "notification_setting_key: " + string10);
            Log.d("PushService", "sound: " + string11);
        }
        final long long1 = Long.parseLong(string3);
        final com.twitter.library.provider.k a2 = com.twitter.library.provider.k.a((Context)this);
        final bg a3 = bg.a((Context)this, long1);
        final DataSyncResult dataSyncResult = new DataSyncResult(name, long1, true);
        final com.twitter.library.platform.d m = new com.twitter.library.platform.d();
        m.c = 1;
        m.e = string8;
        m.d = string7;
        m.j = string9;
        m.h = string5;
        String e;
        if (g.a != null) {
            e = g.a.e;
        }
        else {
            e = null;
        }
        m.l = e;
        m.m = (g.a != null && g.a.f);
        int int2;
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            int2 = Integer.parseInt(string2);
        }
        else {
            int2 = 0;
        }
        m.q = int2;
        m.v = g.b;
        m.u = g.a;
        m.r = string;
        boolean b;
        if (Build$VERSION.SDK_INT >= 16) {
            b = true;
        }
        else {
            b = false;
        }
        if (b && g.c != null) {
            m.w = g.c;
        }
        final Context applicationContext = this.getApplicationContext();
        final com.twitter.library.provider.b b2 = new com.twitter.library.provider.b(applicationContext.getContentResolver());
        switch (int1) {
            default: {
                return null;
            }
            case 74: {
                a2.a(name, "tweet", 1, b2);
                m.a(a3.a(string5));
                m.b = 1;
                m.f = Long.parseLong(string4);
                m.p = a3.a(name, 1, string5, m.a(), m.g, string8, string5, null);
                if (b && m.w == null) {
                    m.w = com.twitter.library.platform.notifications.a.b;
                }
                m.t = a3.i();
                dataSyncResult.g = m;
                break;
            }
            case 4: {
                a2.a(name, 1, b2);
                m.a(a3.a(string5));
                m.f = Long.parseLong(string4);
                m.p = a3.a(name, 2, string5, m.a(), m.g, string8, string5, null);
                m.t = a3.h();
                m.b = m.t.length;
                if (b && m.w == null) {
                    m.w = com.twitter.library.platform.notifications.a.b;
                }
                dataSyncResult.e = 1;
                dataSyncResult.j = m;
                break;
            }
            case 22:
            case 274: {
                if (d.containsKey("notification_dm_data")) {
                    m.a(a3.a(string5));
                    final DMMessageEntry dmMessageEntry = (DMMessageEntry)d.getSerializable("notification_dm_data");
                    final HashSet<ay> set = new HashSet<ay>();
                    int n;
                    if (22 == int1) {
                        set.add(new ay(dmMessageEntry.senderId, -1L));
                        set.add(new ay(Long.parseLong(string3), -1L));
                        n = 0;
                    }
                    else {
                        n = 1;
                    }
                    a3.a(new u().a(n).a(set).b(dmMessageEntry.conversationId).b(dmMessageEntry.id).c(dmMessageEntry.date).a(), false);
                    a3.a(dmMessageEntry, false, b2);
                    byte[] a4;
                    if (dmMessageEntry.a("photo")) {
                        m.l = ((DMPhoto)dmMessageEntry.attachment).mediaUrl;
                        a4 = com.twitter.util.f.a(!TextUtils.isEmpty((CharSequence)m.l));
                    }
                    else {
                        a4 = null;
                    }
                    m.d = ak.a(applicationContext, dmMessageEntry.conversationId, long1);
                    m.p = a3.a(name, 13, string5, m.a(), m.g, string8, dmMessageEntry.conversationId, a4);
                    m.t = a3.g(dmMessageEntry.conversationId);
                    m.i = dmMessageEntry.conversationId;
                    m.b = m.t.length;
                    dataSyncResult.h = m;
                    break;
                }
                break;
            }
            case 13: {
                m.a(a3.a(string5));
                if (d.containsKey("notification_dm_data")) {
                    final JoinConversationEntry joinConversationEntry = (JoinConversationEntry)d.getSerializable("notification_dm_data");
                    final HashSet<ay> set2 = new HashSet<ay>();
                    set2.add(new ay(joinConversationEntry.senderId, -1L));
                    set2.add(new ay(Long.valueOf(string3), -1L));
                    a3.a(new u().a(1).a(set2).b(joinConversationEntry.conversationId).b(joinConversationEntry.id).c(joinConversationEntry.date).a(), false);
                    a3.a(joinConversationEntry, false, b2);
                    m.p = a3.a(name, 13, string5, m.a(), m.g, string8, joinConversationEntry.conversationId, null);
                    m.t = a3.g(joinConversationEntry.conversationId);
                    m.i = joinConversationEntry.conversationId;
                }
                m.b = m.t.length;
                dataSyncResult.h = m;
                break;
            }
            case 5: {
                a2.a(name, 2, b2);
                m.a(a3.a(string5));
                m.f = Long.parseLong(string4);
                m.p = a3.a(name, 4, string5, m.a(), m.g, string8, string5, null);
                m.t = a3.h();
                m.b = m.t.length;
                dataSyncResult.e = 2;
                dataSyncResult.j = m;
                break;
            }
            case 6: {
                a2.a(name, 8, b2);
                m.a(a3.a(string5));
                m.f = Long.parseLong(string4);
                m.p = a3.a(name, 3, string5, m.a(), m.g, string8, string5, null);
                m.t = a3.h();
                m.b = m.t.length;
                dataSyncResult.e = 8;
                dataSyncResult.j = m;
                break;
            }
            case 23: {
                a2.a(name, 4, b2);
                m.a(a3.a(string5));
                m.p = a3.a(name, 5, string5, m.a(), m.g, string8, false);
                m.t = a3.h();
                m.b = m.t.length;
                dataSyncResult.e = 4;
                dataSyncResult.j = m;
                if (b && m.w == null) {
                    m.w = com.twitter.library.platform.notifications.a.c;
                    break;
                }
                break;
            }
            case 24: {
                a2.a(name, 32, b2);
                m.a(a3.a(string5));
                m.b = 1;
                m.p = a3.a(name, 8, string5, m.a(), m.g, string8, false);
                dataSyncResult.e = 32;
                dataSyncResult.j = m;
                if (b && m.w == null) {
                    m.w = com.twitter.library.platform.notifications.a.d;
                    break;
                }
                break;
            }
            case 143: {
                a2.a(name, 64, b2);
                m.b = 1;
                m.p = a3.a(name, 9, string5, m.a(), m.g, string8, true);
                dataSyncResult.e = 64;
                dataSyncResult.k = m;
                break;
            }
            case 10: {
                a2.a(name, 128, b2);
                m.a(a3.a(string5));
                m.b = 1;
                m.f = Long.parseLong(string4);
                m.p = a3.a(name, 11, string5, m.a(), m.g, string8, string5, null);
                dataSyncResult.e = 128;
                dataSyncResult.l = m;
                break;
            }
            case 11: {
                a2.a(name, 512, b2);
                m.a(a3.a(string5));
                m.f = Long.parseLong(string4);
                m.p = a3.a(name, 12, string5, m.a(), m.g, string8, string5, null);
                m.t = a3.h();
                m.b = m.t.length;
                dataSyncResult.e = 512;
                dataSyncResult.j = m;
                break;
            }
            case 9: {
                a2.a(name, 256, b2);
                m.b = 1;
                long long2;
                if (string4 != null) {
                    long2 = Long.parseLong(string4);
                }
                else {
                    long2 = 0L;
                }
                m.f = long2;
                long long3;
                if (string6 != null) {
                    long3 = Long.parseLong(string6);
                }
                else {
                    long3 = 0L;
                }
                m.g = long3;
                m.p = a3.a(name, 10, null, null, m.g, string8, string5, null);
                m.k = d.getString("uri");
                m.o = string10;
                dataSyncResult.e = 256;
                dataSyncResult.n = m;
                break;
            }
            case 270: {
                a2.a(name, 256, b2);
                m.b = 1;
                m.k = d.getString("uri");
                dataSyncResult.m = m;
                break;
            }
        }
        b2.a();
        if (dataSyncResult.j != null) {
            TwitterDataSyncService.d(applicationContext, name);
        }
        dataSyncResult.d = a(name, Long.parseLong(string3), applicationContext);
        dataSyncResult.f = string11;
        return dataSyncResult;
    }
    
    g a(final Bundle bundle, final Context context) {
        final String string = bundle.getString("schema");
        int int1;
        if (string == null) {
            int1 = 0;
        }
        else {
            int1 = Integer.parseInt(string);
        }
        if (PushService.h) {
            Log.d("PushService", "Payload schema=" + int1);
        }
        return a(bundle, PreferenceManager.getDefaultSharedPreferences((Context)this), context, int1);
    }
    
    @Override
    protected void a(final Context context, final Intent intent) {
        if (PushService.h) {
            Log.d("PushService", "Push received.");
        }
        if (App.f()) {
            a(context, d(context), new PushService$DebugNotificationException("Received push"));
        }
        final Bundle extras = intent.getExtras();
        this.h(context, a(extras));
        if (String.valueOf(285).equals(extras.getString("type"))) {
            this.a(this.c(extras), "logged_out_notification");
        }
        else {
            final g a = this.a(extras, context);
            if (a != null) {
                final DataSyncResult a2 = this.a(a);
                if (a2 != null) {
                    this.a(a2, "data");
                }
            }
        }
    }
    
    @Override
    protected void b(final Context context, final Intent intent) {
        final i i = new i();
        String string;
        if (intent == null) {
            string = "intent was null";
        }
        else {
            string = "action was: " + intent.getAction();
        }
        ErrorReporter.a(i.a("onInvalidIntent", string).a(new PushService$DebugNotificationException("onInvalidIntent() invoked")));
    }
    
    @Override
    protected void b(final Context context, final String s) {
        PushService.i.set(false);
        context.sendOrderedBroadcast(new Intent(PushService.e), ae.a);
        if (PushService.o) {
            PushService.n.post((Runnable)new l(this, lg.preference_notification_error));
            PushService.o = false;
        }
        ErrorReporter.a(new i().a("Error id", s).a(new PushService$DebugNotificationException("onError in PushService")));
    }
    
    DataSyncResult c(final Bundle bundle) {
        final DataSyncResult dataSyncResult = new DataSyncResult("", -1L, true);
        dataSyncResult.n = new com.twitter.library.platform.d();
        dataSyncResult.n.c = 1;
        dataSyncResult.n.b = 1;
        dataSyncResult.n.k = bundle.getString("uri");
        dataSyncResult.n.e = bundle.getString("text");
        dataSyncResult.n.d = bundle.getString("title");
        dataSyncResult.n.j = bundle.getString("scribe_target");
        return dataSyncResult;
    }
    
    @Override
    protected void c(final Context context, final String s) {
        final AccountManager value = AccountManager.get(context);
        final Account[] accountsByType = value.getAccountsByType(com.twitter.library.util.a.a);
        final long currentTimeMillis = System.currentTimeMillis();
        int n = 0;
        int n2;
        for (int length = accountsByType.length, i = 0; i < length; ++i, n = n2) {
            final Account account = accountsByType[i];
            if (d(context, account)) {
                final int a = new k().a(context, account, com.twitter.library.util.a.b(value, account), s, b(context, account));
                if (a == 1) {
                    a(context, account, currentTimeMillis);
                    n2 = n + 1;
                }
                else {
                    if (a == 2) {
                        ErrorReporter.a(new i(context, account, a).a(new PushService$DeviceLimitException("Device limit exceeded failure when posting push destinations after registration")));
                    }
                    n2 = n;
                }
            }
            else {
                n2 = n + 1;
            }
        }
        if (n == accountsByType.length) {
            com.google.android.gcm.b.a(context, 86400000L);
            com.google.android.gcm.b.a(context, true);
        }
        PushService.i.set(false);
        context.sendOrderedBroadcast(new Intent(PushService.d), ae.a);
        if (App.f()) {
            a(context, s, new PushService$DebugNotificationException("Registered with GCM"));
        }
        if (PushService.o) {
            final Account a2 = com.twitter.library.util.a.a(context, PushService.p);
            switch (a(context, a2, b(context, a2))) {
                default: {
                    PushService.n.post((Runnable)new l(this, lg.preference_notification_error));
                    break;
                }
                case 1: {
                    PushService.n.post((Runnable)new l(this, lg.preference_notification_success));
                    break;
                }
                case 2: {
                    PushService.n.post((Runnable)new l(this, lg.preference_notification_too_many_devices));
                    break;
                }
            }
            PushService.o = false;
        }
    }
}
