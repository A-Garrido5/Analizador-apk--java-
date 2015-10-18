// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.Iterator;
import android.content.SharedPreferences;
import android.accounts.AccountManager;
import android.preference.PreferenceManager;
import android.accounts.Account;
import android.util.Log;
import com.twitter.library.platform.PushService;
import android.database.Cursor;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.errorreporter.a;
import java.util.HashMap;
import com.twitter.library.api.TwitterUser;
import android.net.Uri;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.content.Context;
import java.util.Set;

public class k extends sh
{
    public static final String[] b;
    public static final String[] c;
    private static final String[] d;
    private static k e;
    private static final Set f;
    private final Context g;
    
    static {
        b = new String[] { "notif_tweet", "notif_mention", "notif_message", "tweet", "mention", "unread_interactions", "message", "discover", "notif_experimental", "notif_lifeline_alerts" };
        c = new String[] { "widget_id", "account_name", "content_type" };
        d = new String[] { "CREATE TABLE user_values (_id INTEGER PRIMARY KEY,name TEXT UNIQUE ON CONFLICT REPLACE,value TEXT);", "CREATE TABLE activity_states (_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE ON CONFLICT REPLACE,tweet INTEGER, mention INTEGER, unread_interactions INTEGER, message INTEGER, discover INTEGER); ", "CREATE TABLE widget_settings (_id INTEGER PRIMARY KEY,widget_id INTEGER UNIQUE ON CONFLICT REPLACE,widget_type INTEGER, account_name TEXT, content_type INTEGER); ", "CREATE TABLE account_settings (_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE ON CONFLICT REPLACE,notif_id INTEGER, notif_tweet INTEGER, notif_mention INTEGER, notif_message INTEGER, interval INTEGER, vibrate INTEGER, ringtone TEXT, light INTEGER, notif_experimental INTEGER, notif_lifeline_alerts INTEGER, notif_recommendations INTEGER, notif_news INTEGER, notif_vit_notable_event INTEGER, notif_offer_redemption INTEGER, notif_highlights INTEGER);", "CREATE INDEX user_values_index  ON user_values (name);", "CREATE INDEX activity_states_index ON activity_states (account_name);", "CREATE INDEX widget_settings_index ON widget_settings (account_name);", "CREATE INDEX account_settings_index ON account_settings (account_name);", "CREATE VIEW states_settings AS SELECT activity_states.account_name AS account_name,activity_states.mention AS mention,activity_states.unread_interactions AS unread_interactions,activity_states.message AS message,activity_states.tweet AS tweet,activity_states.discover AS discover,account_settings.notif_id AS notif_id,account_settings.notif_mention AS notif_mention,account_settings.notif_message AS notif_message,account_settings.notif_tweet AS notif_tweet,account_settings.interval AS interval,account_settings.light AS light,account_settings.ringtone AS ringtone,account_settings.vibrate AS vibrate,account_settings.notif_experimental AS notif_experimental,account_settings.notif_lifeline_alerts AS notif_lifeline_alerts,account_settings.notif_recommendations AS notif_recommendations,account_settings.notif_news AS notif_news,account_settings.notif_vit_notable_event AS notif_vit_notable_event,account_settings.notif_offer_redemption AS notif_offer_redemption,account_settings.notif_highlights AS notif_highlights FROM activity_states LEFT JOIN account_settings ON activity_states.account_name=account_settings.account_name;" };
        f = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList("notif_tweet", "notif_mention", "notif_message", "notif_lifeline_alerts", "notif_recommendations", "notif_news", "notif_vit_notable_event", "notif_followed_verified", "notif_offer_redemption", "notif_highlights", "notif_experimental")));
    }
    
    private k(final Context g) {
        super(g, "global.db", null, 21);
        this.g = g;
    }
    
    private int a(final SQLiteDatabase sqLiteDatabase, final String s, final ContentValues contentValues, final boolean b, final b b2) {
        if (s != null) {
            final int n = 0 + sqLiteDatabase.update("account_settings", contentValues, "account_name=?", new String[] { s });
            while (true) {
                Label_0385: {
                    if (n != 0) {
                        break Label_0385;
                    }
                    contentValues.put("account_name", s);
                    if (!b) {
                        if (!contentValues.containsKey("notif_mention")) {
                            contentValues.put("notif_mention", 2005);
                        }
                        if (!contentValues.containsKey("notif_message")) {
                            contentValues.put("notif_message", 1);
                        }
                        if (!contentValues.containsKey("notif_lifeline_alerts")) {
                            contentValues.put("notif_lifeline_alerts", 1);
                        }
                        if (!contentValues.containsKey("notif_experimental")) {
                            contentValues.put("notif_experimental", 1);
                        }
                        if (!contentValues.containsKey("notif_recommendations")) {
                            contentValues.put("notif_recommendations", 1);
                        }
                        if (!contentValues.containsKey("notif_news")) {
                            contentValues.put("notif_news", 1);
                        }
                        if (!contentValues.containsKey("notif_vit_notable_event")) {
                            contentValues.put("notif_vit_notable_event", 1);
                        }
                        if (!contentValues.containsKey("notif_offer_redemption")) {
                            contentValues.put("notif_offer_redemption", 1);
                        }
                        if (!contentValues.containsKey("notif_highlights")) {
                            contentValues.put("notif_highlights", 0);
                        }
                    }
                    if (!contentValues.containsKey("notif_tweet")) {
                        contentValues.put("notif_tweet", 0);
                    }
                    if (!contentValues.containsKey("interval")) {
                        int n2;
                        if (b) {
                            n2 = 60;
                        }
                        else {
                            n2 = 15;
                        }
                        contentValues.put("interval", n2);
                    }
                    if (!contentValues.containsKey("vibrate")) {
                        contentValues.put("vibrate", true);
                    }
                    if (!contentValues.containsKey("light")) {
                        contentValues.put("light", true);
                    }
                    if (!contentValues.containsKey("ringtone")) {
                        contentValues.put("ringtone", com.twitter.library.provider.n.b);
                    }
                    if (sqLiteDatabase.insert("account_settings", "account_name", contentValues) <= 0L) {
                        break Label_0385;
                    }
                    final int n3 = n + 1;
                    if (n3 > 0 && b2 != null) {
                        b2.a(com.twitter.library.provider.n.a);
                        return n3;
                    }
                    return n3;
                }
                final int n3 = n;
                continue;
            }
        }
        return 0;
    }
    
    static ContentValues a(final TwitterUser twitterUser, final int n) {
        boolean b;
        if ((n & 0x40) != 0x0) {
            b = true;
        }
        else {
            b = false;
        }
        if (!b && twitterUser != null && twitterUser.verified) {
            final ContentValues contentValues = new ContentValues(1);
            contentValues.put("notif_mention", n | 0x800);
            return contentValues;
        }
        return null;
    }
    
    public static k a(final Context context) {
        synchronized (k.class) {
            if (k.e == null) {
                k.e = new k(context.getApplicationContext());
            }
            return k.e;
        }
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final int n, final int n2, final HashMap hashMap) {
        while (true) {
            Label_0250: {
                if (n <= 5) {
                    break Label_0250;
                }
                final Cursor query = sqLiteDatabase.query("account_settings", new String[] { "account_name" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
                if (query == null) {
                    break Label_0250;
                }
                int n3 = 0;
                while (query.moveToNext()) {
                    final String string = query.getString(0);
                    if (!hashMap.containsKey(string)) {
                        ++n3;
                        sqLiteDatabase.delete("account_settings", "account_name=?", new String[] { string });
                    }
                }
                query.close();
                int n4 = n3;
                final Cursor query2 = sqLiteDatabase.query("activity_states", new String[] { "account_name" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
                if (query2 != null) {
                    while (query2.moveToNext()) {
                        final String string2 = query2.getString(0);
                        if (!hashMap.containsKey(string2)) {
                            ++n4;
                            sqLiteDatabase.delete("activity_states", "account_name=?", new String[] { string2 });
                        }
                    }
                    query2.close();
                }
                if (n >= 14 && n4 > 0) {
                    ErrorReporter.a(new a().a("Old DB version", n).a("New DB version", n2).a("Num accounts missing", n4).a(new IllegalStateException("GlobalDatabaseHelper had missing accounts.")));
                }
                return;
            }
            int n4 = 0;
            continue;
        }
    }
    
    public int a(final int n, final int n2, final String s, final int n3) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("widget_type", n2);
        contentValues.put("account_name", s);
        contentValues.put("content_type", n3);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int n4 = 0 + writableDatabase.update("widget_settings", contentValues, "widget_id=?", new String[] { String.valueOf(n) });
            if (n4 == 0) {
                contentValues.put("widget_id", n);
                if (writableDatabase.insert("widget_settings", "widget_id", contentValues) > 0L) {
                    ++n4;
                }
            }
            writableDatabase.setTransactionSuccessful();
            return n4;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final String s) {
        if (s == null) {
            return -1;
        }
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        final String[] array = { "notif_id" };
        final Cursor query = readableDatabase.query("account_settings", array, "account_name=?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
        Label_0098: {
            if (query == null) {
                break Label_0098;
            }
        Label_0149_Outer:
            while (true) {
            Label_0226_Outer:
                while (true) {
                    Label_0274: {
                        while (true) {
                        Label_0268:
                            while (true) {
                                Cursor query2;
                                try {
                                    if (query.moveToFirst() && !query.isNull(0)) {
                                        return query.getInt(0);
                                    }
                                    query.close();
                                    query2 = readableDatabase.query("account_settings", array, "notif_id NOT NULL", (String[])null, (String)null, (String)null, "notif_id ASC");
                                    if (query2 == null) {
                                        break Label_0274;
                                    }
                                    final int count = query2.getCount();
                                    final int n = 0;
                                    if (count == 0) {
                                        query2.close();
                                        int n2 = n;
                                        if (n2 >= 0) {
                                            final ContentValues contentValues = new ContentValues();
                                            contentValues.put("notif_id", n2);
                                            if (this.a(s, contentValues, PushService.c(this.g), null) == 0) {
                                                Log.w("GlobalDatabaseHelper", "Failed to save notification id");
                                                n2 = -1;
                                            }
                                        }
                                        return n2;
                                    }
                                    break Label_0268;
                                }
                                finally {
                                    query.close();
                                }
                                int n3;
                                while (true) {
                                    final int int1;
                                    n3 = int1;
                                    if (query2.moveToNext()) {
                                        int1 = query2.getInt(0);
                                        if (int1 - n3 <= 1000) {
                                            continue Label_0226_Outer;
                                        }
                                    }
                                    break;
                                }
                                final int n = n3 + 1000;
                                continue Label_0149_Outer;
                            }
                            int n3 = 0;
                            continue;
                        }
                    }
                    int n2 = -1;
                    continue;
                }
            }
        }
    }
    
    public int a(final String s, final int n, final b b) {
        if (s == null) {
            return 0;
        }
        return this.a(s, "mention", n | this.b(s, "mention"), b);
    }
    
    public int a(final String s, final ContentValues contentValues, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int n = 0 + writableDatabase.update("user_values", contentValues, "name=?", new String[] { s });
            if (n == 0) {
                contentValues.put("name", s);
                if (writableDatabase.insert("user_values", "name", contentValues) > 0L) {
                    ++n;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                b.a(q.a);
            }
            return n;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final String s, final ContentValues contentValues, final boolean b, final b b2) {
        if (s == null) {
            return 0;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int a = this.a(writableDatabase, s, contentValues, b, b2);
            writableDatabase.setTransactionSuccessful();
            return a;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final String s, final String s2) {
        if (!k.f.contains(s2)) {
            throw new IllegalArgumentException(s2 + " is not a valid notification settings column in " + "account_settings");
        }
        final Cursor query = this.getReadableDatabase().query("account_settings", new String[] { s2 }, "account_name=?", new String[] { s }, (String)null, (String)null, (String)null);
        if (query == null) {
            return 0;
        }
        while (true) {
            try {
                if (query.moveToFirst()) {
                    return query.getInt(0);
                }
            }
            finally {
                query.close();
            }
            return 0;
        }
    }
    
    public int a(final String s, final String s2, final int n) {
        if (s == null) {
            return 0;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put(s2, n);
            int n2 = 0 + writableDatabase.update("account_settings", contentValues, "account_name=?", new String[] { s });
            if (n2 == 0) {
                contentValues.put("account_name", s);
                if (writableDatabase.insert("account_settings", "account_name", contentValues) > 0L) {
                    ++n2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            return n2;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final String s, final String s2, final int n, final b b) {
        if (s == null) {
            return 0;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put(s2, n);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int n2 = 0 + writableDatabase.update("activity_states", contentValues, "account_name=?", new String[] { s });
            if (n2 == 0) {
                contentValues.put("account_name", s);
                if (writableDatabase.insert("activity_states", "account_name", contentValues) > 0L) {
                    ++n2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (n2 > 0 && b != null) {
                b.a(Uri.withAppendedPath(p.a, s));
            }
            return n2;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final String s, final boolean b) {
        Label_0073: {
            if (s == null) {
                break Label_0073;
            }
            final Cursor query = this.getReadableDatabase().query("account_settings", new String[] { "interval" }, "account_name=?", new String[] { s }, (String)null, (String)null, (String)null);
            if (query == null) {
                break Label_0073;
            }
            try {
                if (query.moveToFirst()) {
                    return query.getInt(0);
                }
                query.close();
                if (b) {
                    return 60;
                }
            }
            finally {
                query.close();
            }
        }
        return 15;
    }
    
    public int a(final int[] array) {
        int i = 0;
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int length = array.length;
            int n = 0;
            while (i < length) {
                n += writableDatabase.delete("widget_settings", "widget_id=?", new String[] { String.valueOf(array[i]) });
                ++i;
            }
            writableDatabase.setTransactionSuccessful();
            return n;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int b(final String s) {
        if (s == null) {
            return 0;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("account_settings", "account_name=?", new String[] { s });
            writableDatabase.setTransactionSuccessful();
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int b(final String s, final String s2) {
        int n;
        if ("tweet".equals(s2)) {
            n = 1;
        }
        else if ("mention".equals(s2)) {
            n = 2;
        }
        else if ("unread_interactions".equals(s2)) {
            n = 3;
        }
        else {
            if (!"message".equals(s2)) {
                throw new IllegalArgumentException("Invalid activity type: " + s2);
            }
            n = 4;
        }
        final Cursor query = this.getReadableDatabase().query("activity_states", l.a, "account_name=?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
        if (query != null) {
            int int1;
            if (query.moveToFirst()) {
                int1 = query.getInt(n);
            }
            else {
                int1 = 0;
            }
            query.close();
            return int1;
        }
        return 0;
    }
    
    public int c(final String s) {
        if (s == null) {
            return 0;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("activity_states", "account_name=?", new String[] { s });
            writableDatabase.setTransactionSuccessful();
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int c(final String s, final String s2) {
        if (s == null) {
            return 0;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("account_name", s2);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int update = writableDatabase.update("widget_settings", contentValues, "account_name=?", new String[] { s });
            writableDatabase.setTransactionSuccessful();
            return update;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        final String[] d = k.d;
        for (int length = d.length, i = 0; i < length; ++i) {
            sqLiteDatabase.execSQL(d[i]);
        }
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        final Context g = this.g;
        final boolean c = PushService.c(g);
        final HashSet<Account> set = new HashSet<Account>();
        final HashMap<String, Account> hashMap = new HashMap<String, Account>();
        for (final Account account : com.twitter.library.util.a.a(g)) {
            hashMap.put(account.name, account);
        }
        this.a(sqLiteDatabase, n, n2, hashMap);
        int n3;
        if (n == 1) {
            n3 = 2;
        }
        else {
            n3 = n;
        }
        if (n3 == 2) {
            sqLiteDatabase.execSQL("CREATE TABLE widget_settings (_id INTEGER PRIMARY KEY,widget_id INTEGER UNIQUE ON CONFLICT REPLACE,widget_type INTEGER, account_name TEXT, content_type INTEGER); ");
            sqLiteDatabase.execSQL("CREATE INDEX widget_settings_index ON widget_settings (account_name);");
            n3 = 3;
        }
        if (n3 == 3) {
            sqLiteDatabase.execSQL("DROP TABLE scribe;");
            n3 = 4;
        }
        if (n3 == 4) {
            n3 = 5;
        }
        if (n3 == 5) {
            sqLiteDatabase.execSQL("CREATE TABLE account_settings (_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE ON CONFLICT REPLACE,notif_id INTEGER, notif_tweet INTEGER, notif_mention INTEGER, notif_message INTEGER, interval INTEGER, vibrate INTEGER, ringtone TEXT, light INTEGER, notif_experimental INTEGER, notif_lifeline_alerts INTEGER, notif_recommendations INTEGER, notif_news INTEGER, notif_vit_notable_event INTEGER, notif_offer_redemption INTEGER, notif_highlights INTEGER);");
            sqLiteDatabase.execSQL("CREATE INDEX account_settings_index ON account_settings (account_name);");
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(g);
            final ContentValues contentValues = new ContentValues(4);
            String[] array;
            if (n < 5) {
                contentValues.put("interval", Integer.parseInt(defaultSharedPreferences.getString("polling_interval", String.valueOf(60))));
                array = new String[] { "account_name", "notif_id", "notif_tweet", "notif_mention", "notif_message" };
            }
            else {
                array = new String[] { "account_name", "notif_id", "interval", "notif_tweet", "notif_mention", "notif_message" };
            }
            contentValues.put("vibrate", defaultSharedPreferences.getBoolean("vibrate", true));
            contentValues.put("ringtone", defaultSharedPreferences.getString("ringtone", n.b));
            contentValues.put("light", defaultSharedPreferences.getBoolean("use_led", true));
            final Account[] accountsByType = AccountManager.get(g).getAccountsByType(com.twitter.library.util.a.a);
            for (int length2 = accountsByType.length, j = 0; j < length2; ++j) {
                this.a(sqLiteDatabase, accountsByType[j].name, contentValues, c, null);
            }
            final Cursor query = sqLiteDatabase.query("activity_states", array, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (query != null) {
                final ContentValues contentValues2 = new ContentValues(5);
                while (query.moveToNext()) {
                    if (n == 5) {
                        contentValues2.put("interval", query.getInt(query.getColumnIndexOrThrow("interval")));
                    }
                    contentValues2.put("notif_id", query.getInt(query.getColumnIndex("notif_id")));
                    contentValues2.put("notif_tweet", query.getInt(query.getColumnIndex("notif_tweet")));
                    contentValues2.put("notif_mention", query.getInt(query.getColumnIndex("notif_mention")));
                    contentValues2.put("notif_message", query.getInt(query.getColumnIndex("notif_message")));
                    this.a(sqLiteDatabase, query.getString(0), contentValues2, c, null);
                }
                query.close();
            }
            n3 = 6;
        }
        if (n3 == 6) {
            sqLiteDatabase.execSQL("ALTER TABLE activity_states ADD COLUMN discover INTEGER; ");
            n3 = 7;
        }
        if (n3 == 7) {
            final Cursor query2 = sqLiteDatabase.query("account_settings", new String[] { "account_name", "notif_tweet", "notif_mention", "notif_message" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (query2 != null) {
                while (query2.moveToNext()) {
                    final String string = query2.getString(0);
                    final int int1 = query2.getInt(1);
                    final int int2 = query2.getInt(2);
                    final int int3 = query2.getInt(3);
                    if (int1 != 0 || int2 != 0 || int3 != 0) {
                        final ContentValues contentValues3 = new ContentValues(1);
                        contentValues3.put("notif_mention", 0x40 | (0x4 | (int2 | 0x10)));
                        this.a(sqLiteDatabase, string, contentValues3, c, null);
                        set.add(hashMap.get(string));
                    }
                }
                query2.close();
            }
            n3 = 8;
        }
        if (n3 == 8) {
            n3 = 9;
        }
        if (n3 == 9) {
            sqLiteDatabase.execSQL("UPDATE account_settings SET notif_id=null;");
            n3 = 10;
        }
        if (n3 == 10) {
            if (n > 5) {
                sqLiteDatabase.execSQL("ALTER TABLE account_settings ADD COLUMN notif_experimental INTEGER DEFAULT 1;");
            }
            final Cursor query3 = sqLiteDatabase.query("account_settings", new String[] { "account_name", "notif_mention" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (query3 != null) {
                while (query3.moveToNext()) {
                    final String string2 = query3.getString(0);
                    final int int4 = query3.getInt(1);
                    if (int4 != 0) {
                        final ContentValues contentValues4 = new ContentValues(2);
                        contentValues4.put("notif_mention", int4 | 0x100);
                        contentValues4.put("notif_experimental", 1);
                        this.a(sqLiteDatabase, string2, contentValues4, c, null);
                        set.add(hashMap.get(string2));
                    }
                }
                query3.close();
            }
            n3 = 11;
        }
        if (n3 == 11) {
            if (n > 5) {
                sqLiteDatabase.execSQL("ALTER TABLE account_settings ADD COLUMN notif_lifeline_alerts INTEGER DEFAULT 1;");
            }
            n3 = 12;
        }
        if (n3 == 12) {
            if (n > 5) {
                sqLiteDatabase.execSQL("ALTER TABLE account_settings ADD COLUMN notif_recommendations INTEGER DEFAULT 0;");
            }
            final Cursor query4 = sqLiteDatabase.query("account_settings", new String[] { "account_name", "notif_mention", "notif_experimental" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (query4 != null) {
                while (query4.moveToNext()) {
                    final String string3 = query4.getString(0);
                    int int5 = query4.getInt(1);
                    final int int6 = query4.getInt(2);
                    int n4;
                    if ((int5 & 0xC) != 0x0) {
                        n4 = 1;
                    }
                    else {
                        n4 = 0;
                    }
                    int n5;
                    if ((int5 & 0x30) != 0x0) {
                        n5 = 1;
                    }
                    else {
                        n5 = 0;
                    }
                    if (int6 > 0) {
                        final ContentValues contentValues5 = new ContentValues(2);
                        if (n4 != 0) {
                            int5 |= 0x200;
                        }
                        if (n5 != 0) {
                            int5 |= 0x400;
                        }
                        contentValues5.put("notif_mention", int5);
                        contentValues5.put("notif_recommendations", 1);
                        this.a(sqLiteDatabase, string3, contentValues5, c, null);
                        set.add(hashMap.get(string3));
                    }
                }
                query4.close();
            }
            n3 = 13;
        }
        if (n3 == 13) {
            n3 = 14;
        }
        if (n3 == 14) {
            n3 = 15;
        }
        if (n3 == 15) {
            n3 = 16;
        }
        if (n3 == 16) {
            if (sqLiteDatabase.rawQuery("SELECT * FROM activity_states LIMIT 0", (String[])null).getColumnIndex("unread_interactions") == -1) {
                sqLiteDatabase.execSQL("ALTER TABLE activity_states ADD COLUMN unread_interactions INTEGER; ");
            }
            if (n > 5) {
                sqLiteDatabase.execSQL("ALTER TABLE account_settings ADD COLUMN notif_news INTEGER DEFAULT 0;");
                final Cursor query5 = sqLiteDatabase.query("account_settings", new String[] { "account_name", "notif_experimental" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
                if (query5 != null) {
                    while (query5.moveToNext()) {
                        final String string4 = query5.getString(0);
                        if (query5.getInt(1) > 0) {
                            final ContentValues contentValues6 = new ContentValues(1);
                            contentValues6.put("notif_news", 1);
                            this.a(sqLiteDatabase, string4, contentValues6, c, null);
                            set.add(hashMap.get(string4));
                        }
                    }
                    query5.close();
                }
            }
            n3 = 17;
        }
        if (n3 == 17) {
            if (n > 5) {
                sqLiteDatabase.execSQL("ALTER TABLE account_settings ADD COLUMN notif_vit_notable_event INTEGER DEFAULT 1;");
            }
            final Cursor query6 = sqLiteDatabase.query("account_settings", new String[] { "account_name", "notif_vit_notable_event" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (query6 != null) {
                while (query6.moveToNext()) {
                    final String string5 = query6.getString(0);
                    if (query6.getInt(1) > 0) {
                        final ContentValues contentValues7 = new ContentValues(1);
                        contentValues7.put("notif_vit_notable_event", 1);
                        this.a(sqLiteDatabase, string5, contentValues7, c, null);
                        set.add(hashMap.get(string5));
                    }
                }
                query6.close();
            }
            n3 = 18;
        }
        if (n3 == 18) {
            final Cursor query7 = sqLiteDatabase.query("account_settings", new String[] { "account_name", "notif_mention" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (query7 != null) {
                while (query7.moveToNext()) {
                    final String string6 = query7.getString(0);
                    final int int7 = query7.getInt(1);
                    final Account account2 = hashMap.get(string6);
                    TwitterUser a2;
                    if (account2 != null) {
                        a2 = com.twitter.library.util.a.a(AccountManager.get(this.g), account2);
                    }
                    else {
                        a2 = null;
                    }
                    final ContentValues a3 = a(a2, int7);
                    if (a3 != null) {
                        this.a(sqLiteDatabase, string6, a3, c, null);
                        set.add(account2);
                    }
                }
                query7.close();
            }
            n3 = 19;
        }
        if (n3 == 19) {
            if (n > 5) {
                sqLiteDatabase.execSQL("ALTER TABLE account_settings ADD COLUMN notif_offer_redemption INTEGER DEFAULT 1;");
            }
            final Cursor query8 = sqLiteDatabase.query("account_settings", new String[] { "account_name", "notif_offer_redemption" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (query8 != null) {
                while (query8.moveToNext()) {
                    final String string7 = query8.getString(0);
                    if (query8.getInt(1) > 0) {
                        final ContentValues contentValues8 = new ContentValues(1);
                        contentValues8.put("notif_offer_redemption", 1);
                        this.a(sqLiteDatabase, string7, contentValues8, c, null);
                        set.add(hashMap.get(string7));
                    }
                }
                query8.close();
            }
            n3 = 20;
        }
        if (n3 == 20) {
            if (n > 5) {
                sqLiteDatabase.execSQL("ALTER TABLE account_settings ADD COLUMN notif_highlights INTEGER DEFAULT 0;");
            }
            final Cursor query9 = sqLiteDatabase.query("account_settings", new String[] { "account_name" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
            if (query9 != null) {
                while (query9.moveToNext()) {
                    final String string8 = query9.getString(0);
                    final ContentValues contentValues9 = new ContentValues(1);
                    contentValues9.put("notif_highlights", 0);
                    this.a(sqLiteDatabase, string8, contentValues9, c, null);
                    set.add(hashMap.get(string8));
                }
                query9.close();
            }
            sqLiteDatabase.execSQL("DROP VIEW IF EXISTS states_settings;");
            sqLiteDatabase.execSQL("CREATE VIEW states_settings AS SELECT activity_states.account_name AS account_name,activity_states.mention AS mention,activity_states.unread_interactions AS unread_interactions,activity_states.message AS message,activity_states.tweet AS tweet,activity_states.discover AS discover,account_settings.notif_id AS notif_id,account_settings.notif_mention AS notif_mention,account_settings.notif_message AS notif_message,account_settings.notif_tweet AS notif_tweet,account_settings.interval AS interval,account_settings.light AS light,account_settings.ringtone AS ringtone,account_settings.vibrate AS vibrate,account_settings.notif_experimental AS notif_experimental,account_settings.notif_lifeline_alerts AS notif_lifeline_alerts,account_settings.notif_recommendations AS notif_recommendations,account_settings.notif_news AS notif_news,account_settings.notif_vit_notable_event AS notif_vit_notable_event,account_settings.notif_offer_redemption AS notif_offer_redemption,account_settings.notif_highlights AS notif_highlights FROM activity_states LEFT JOIN account_settings ON activity_states.account_name=account_settings.account_name;");
        }
        if (set.size() > 0) {
            final Iterator<Account> iterator = set.iterator();
            while (iterator.hasNext()) {
                PushService.a(g, iterator.next(), 0L);
            }
            com.google.android.gcm.b.a(g, false);
        }
    }
}
