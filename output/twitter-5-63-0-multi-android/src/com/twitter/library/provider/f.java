// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.LinkedList;
import android.net.Uri;
import com.twitter.util.d;
import com.twitter.library.media.model.legacy.a;
import android.database.sqlite.SQLiteDatabase;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.geo.GeoTag;
import java.util.List;
import com.twitter.library.api.QuotedTweetData;
import android.database.Cursor;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.io.Serializable;
import com.twitter.library.util.bk;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import java.util.HashMap;

public class f extends sh
{
    static final String[][] b;
    private static final HashMap c;
    private final Context d;
    private final long e;
    
    static {
        b = new String[][] { { "_id", "INTEGER PRIMARY KEY AUTOINCREMENT" }, { "author_id", "INT" }, { "content", "TEXT" }, { "in_r_status_id", "INT" }, { "updated_at", "INT" }, { "media", "TEXT" }, { "pc", "BLOB" }, { "quoted_tweet_data", "BLOB" }, { "geo_tag", "BLOB" }, { "prepared_media_ids", "BLOB" }, { "media_prepared_at", "INT" }, { "card_url", "TEXT" }, { "sending_state", "INT DEFAULT 0" } };
        c = new HashMap();
    }
    
    private f(final Context d, final long e) {
        super(d, e + "-" + "drafts" + ".db", null, 18);
        this.d = d;
        this.e = e;
    }
    
    static ContentValues a(final DraftTweet draftTweet, final int n) {
        final ContentValues contentValues = new ContentValues();
        final long a = bk.a();
        contentValues.put("content", draftTweet.statusText);
        contentValues.put("updated_at", a);
        contentValues.put("sending_state", n);
        if (draftTweet.promotedContent != null) {
            contentValues.put("pc", com.twitter.util.f.a(draftTweet.promotedContent));
        }
        else {
            contentValues.putNull("pc");
        }
        if (draftTweet.quotedData != null) {
            contentValues.put("quoted_tweet_data", com.twitter.util.f.a(draftTweet.quotedData));
        }
        else {
            contentValues.putNull("quoted_tweet_data");
        }
        if (!draftTweet.media.isEmpty()) {
            contentValues.put("media", com.twitter.util.f.a(CollectionUtils.b(draftTweet.media)));
        }
        else {
            contentValues.putNull("media");
        }
        if (draftTweet.geoTag != null) {
            contentValues.put("geo_tag", com.twitter.util.f.a(draftTweet.geoTag));
        }
        else {
            contentValues.putNull("geo_tag");
        }
        if (!CollectionUtils.a((Collection)draftTweet.b())) {
            contentValues.put("prepared_media_ids", com.twitter.util.f.a(CollectionUtils.b(draftTweet.b())));
        }
        if (draftTweet.a() != 0L) {
            contentValues.put("media_prepared_at", draftTweet.a());
        }
        if (draftTweet.cardUrl != null) {
            contentValues.put("card_url", draftTweet.cardUrl);
            return contentValues;
        }
        contentValues.putNull("card_url");
        return contentValues;
    }
    
    public static DraftTweet a(final Cursor cursor) {
        final QuotedTweetData quotedTweetData = (QuotedTweetData)com.twitter.util.f.a(cursor.getBlob(5));
        String s = cursor.getString(1);
        if (s != null && quotedTweetData != null) {
            final String a = quotedTweetData.a();
            if (s.endsWith(a)) {
                s = s.substring(0, s.length() - a.length());
            }
        }
        return (DraftTweet)new e().a(cursor.getLong(0)).a(s).a((List)com.twitter.util.f.a(cursor.getBlob(3))).b(cursor.getLong(2)).a((GeoTag)com.twitter.util.f.a(cursor.getBlob(6))).a((List)com.twitter.util.f.a(cursor.getBlob(7)), cursor.getLong(8)).a((PromotedContent)com.twitter.util.f.a(cursor.getBlob(4))).a(quotedTweetData).b(cursor.getString(9)).f();
    }
    
    public static f a(final Context context, final long n) {
        synchronized (f.class) {
            f f = com.twitter.library.provider.f.c.get(n);
            if (f == null) {
                f = new f(context.getApplicationContext(), n);
                com.twitter.library.provider.f.c.put(n, f);
            }
            return f;
        }
    }
    
    static void a(final SQLiteDatabase sqLiteDatabase) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < f.b.length; ++i) {
            sb.append(f.b[i][0]);
            if (i < -1 + f.b.length) {
                sb.append(", ");
            }
        }
        sqLiteDatabase.beginTransaction();
        try {
            sqLiteDatabase.execSQL(String.format("CREATE TEMPORARY TABLE drafts_backup(%s);", b()));
            sqLiteDatabase.execSQL(String.format("INSERT INTO drafts_backup SELECT %s FROM %s;", sb.toString(), "drafts"));
            sqLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s;", "drafts"));
            sqLiteDatabase.execSQL(c());
            sqLiteDatabase.execSQL(String.format("INSERT INTO %s SELECT %s FROM drafts_backup;", "drafts", sb));
            sqLiteDatabase.execSQL("DROP TABLE drafts_backup;");
            sqLiteDatabase.setTransactionSuccessful();
        }
        finally {
            sqLiteDatabase.endTransaction();
        }
    }
    
    private static String b() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < f.b.length; ++i) {
            final String[] array = f.b[i];
            sb.append(array[0]);
            sb.append(" ");
            sb.append(array[1]);
            if (i < -1 + f.b.length) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    
    static void b(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.beginTransaction();
        Label_0146: {
            Cursor rawQuery;
            try {
                rawQuery = sqLiteDatabase.rawQuery("SELECT _id, media_entities FROM drafts", (String[])null);
                if (rawQuery == null) {
                    break Label_0146;
                }
                try {
                    while (rawQuery.moveToNext()) {
                        final long long1 = rawQuery.getLong(0);
                        final List list = (List)com.twitter.library.media.model.legacy.a.a(rawQuery.getBlob(1));
                        if (list != null) {
                            final List a = com.twitter.library.media.model.legacy.a.a(list, "");
                            final ContentValues contentValues = new ContentValues(1);
                            contentValues.put("media", com.twitter.util.f.a(CollectionUtils.b(a)));
                            sqLiteDatabase.update("drafts", contentValues, "_id=" + long1, (String[])null);
                        }
                    }
                }
                finally {
                    rawQuery.close();
                }
            }
            finally {
                sqLiteDatabase.endTransaction();
            }
            rawQuery.close();
        }
        sqLiteDatabase.setTransactionSuccessful();
        sqLiteDatabase.endTransaction();
    }
    
    private static String c() {
        return String.format("CREATE TABLE drafts(%s);", b());
    }
    
    static void c(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.beginTransaction();
        Label_0144: {
            Cursor rawQuery;
            try {
                rawQuery = sqLiteDatabase.rawQuery("SELECT _id, flags FROM drafts", (String[])null);
                if (rawQuery == null) {
                    break Label_0144;
                }
                try {
                    while (rawQuery.moveToNext()) {
                        final long long1 = rawQuery.getLong(0);
                        final int int1 = rawQuery.getInt(1);
                        if ((int1 & 0x1) > 0) {
                            final ContentValues contentValues = new ContentValues(2);
                            contentValues.put("flags", int1 & 0xFFFFFFFE);
                            contentValues.put("sending_state", 1);
                            sqLiteDatabase.update("drafts", contentValues, "_id=" + long1, (String[])null);
                        }
                    }
                }
                finally {
                    rawQuery.close();
                }
            }
            finally {
                sqLiteDatabase.endTransaction();
            }
            rawQuery.close();
        }
        sqLiteDatabase.setTransactionSuccessful();
        sqLiteDatabase.endTransaction();
    }
    
    public int a(final int n) {
        com.twitter.util.d.c();
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM ");
        sb.append("drafts");
        Label_0105: {
            if (n != 1) {
                break Label_0105;
            }
            sb.append(" WHERE ");
            sb.append("sending_state=1");
            while (true) {
                final Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), (String[])null);
                int int1 = 0;
                if (rawQuery == null) {
                    return int1;
                }
                try {
                    if (rawQuery.moveToFirst()) {
                        int1 = rawQuery.getInt(0);
                        return int1;
                    }
                    return 0;
                    // iftrue(Label_0052:, n != 2)
                    sb.append(" WHERE ");
                    sb.append("sending_state!=1");
                    continue;
                }
                finally {
                    rawQuery.close();
                }
                break;
            }
        }
    }
    
    public int a(final long n, final List list, final long n2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            final ContentValues contentValues = new ContentValues();
            contentValues.put("updated_at", currentTimeMillis);
            contentValues.put("prepared_media_ids", com.twitter.util.f.a(CollectionUtils.b(list)));
            contentValues.put("media_prepared_at", n2);
            final int update = writableDatabase.update("drafts", contentValues, "_id=" + n, (String[])null);
            writableDatabase.setTransactionSuccessful();
            return update;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final b b) {
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                try {
                    final Cursor query = writableDatabase.query("drafts", g.a, "sending_state=1 AND author_id=?", new String[] { String.valueOf(this.e) }, (String)null, (String)null, (String)null);
                    if (query != null) {
                        try {
                            final int count = query.getCount();
                            int n = 0;
                            while (query.moveToNext()) {
                                final long long1 = query.getLong(0);
                                final ContentValues contentValues = new ContentValues(1);
                                contentValues.put("sending_state", 0);
                                n += writableDatabase.update("drafts", contentValues, "_id=?", new String[] { String.valueOf(long1) });
                            }
                            query.close();
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            if (count > 0 && b != null) {
                                b.a(ap.a);
                            }
                            return n;
                        }
                        finally {
                            query.close();
                        }
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                final int count = 0;
                int n = 0;
                continue;
            }
        }
    }
    
    public int a(final long[] array, final b b, final boolean b2) {
        while (true) {
            com.twitter.util.d.c();
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                int n;
                try {
                    final String[] array2 = { null };
                    final int length = array.length;
                    n = 0;
                    int n2 = 0;
                    if (n >= length) {
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (n2 > 0 && b != null) {
                            b.a(ap.a);
                        }
                        return n2;
                    }
                    final long n3 = array[n];
                    final DraftTweet a = this.a(n3);
                    if (a != null) {
                        if (b2) {
                            a.c();
                        }
                        array2[0] = String.valueOf(n3);
                        n2 += writableDatabase.delete("drafts", "_id=?", array2);
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                ++n;
                continue;
            }
        }
    }
    
    public long a(final DraftTweet draftTweet, final int n, final b b) {
        while (true) {
            int n2 = 1;
            final ContentValues a = a(draftTweet, n);
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                try {
                    if (draftTweet.draftId > 0L) {
                        if (writableDatabase.update("drafts", a, "_id=" + draftTweet.draftId, (String[])null) <= 0) {
                            n2 = 0;
                        }
                        long n3;
                        if (n2 == 0) {
                            a.put("author_id", this.e);
                            a.put("in_r_status_id", draftTweet.repliedTweetId);
                            n3 = writableDatabase.insert("drafts", (String)null, a);
                        }
                        else {
                            n3 = draftTweet.draftId;
                        }
                        if (b != null) {
                            b.a(ap.a);
                        }
                        writableDatabase.setTransactionSuccessful();
                        return n3;
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                n2 = 0;
                continue;
            }
        }
    }
    
    public DraftTweet a(final long n) {
        final Cursor query = this.d.getContentResolver().query(ap.b.buildUpon().appendEncodedPath(String.valueOf(n)).appendQueryParameter("ownerId", String.valueOf(this.e)).appendQueryParameter("limit", "1").build(), h.a, "_id=?", new String[] { String.valueOf(n) }, (String)null);
        DraftTweet a = null;
        if (query == null) {
            return a;
        }
        try {
            if (query.moveToFirst()) {
                a = a(query);
                return a;
            }
            return null;
        }
        finally {
            query.close();
        }
    }
    
    public List a() {
        final LinkedList<Long> list = new LinkedList<Long>();
        final Cursor rawQuery = this.getReadableDatabase().rawQuery("SELECT _id FROM drafts WHERE sending_state=2", (String[])null);
        if (rawQuery != null) {
            try {
                while (rawQuery.moveToNext()) {
                    list.add(rawQuery.getLong(0));
                }
            }
            finally {
                rawQuery.close();
            }
            rawQuery.close();
        }
        return list;
    }
    
    public boolean a(final long n, final int n2, final b b) {
        SQLiteDatabase writableDatabase;
        Cursor query;
        boolean b2;
        ContentValues contentValues;
        Label_0090_Outer:Label_0097_Outer:
        while (true) {
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                Label_0215: {
                    while (true) {
                    Label_0209:
                        while (true) {
                            Label_0203: {
                                try {
                                    query = writableDatabase.query("drafts", g.a, "author_id=? AND _id=?", new String[] { String.valueOf(this.e), String.valueOf(n) }, (String)null, (String)null, (String)null);
                                    if (query == null) {
                                        break Label_0215;
                                    }
                                    if (query.moveToFirst()) {
                                        if (query.getInt(1) == n2) {
                                            b2 = true;
                                        }
                                        else {
                                            contentValues = new ContentValues(1);
                                            contentValues.put("sending_state", n2);
                                            if (writableDatabase.update("drafts", contentValues, "_id=?", new String[] { String.valueOf(n) }) <= 0) {
                                                break Label_0203;
                                            }
                                            b2 = true;
                                            if (b != null) {
                                                b.a(ap.a);
                                            }
                                        }
                                        query.close();
                                        writableDatabase.setTransactionSuccessful();
                                        return b2;
                                    }
                                    break Label_0209;
                                }
                                finally {
                                    writableDatabase.endTransaction();
                                }
                            }
                            b2 = false;
                            continue Label_0090_Outer;
                        }
                        b2 = false;
                        continue Label_0097_Outer;
                    }
                }
                b2 = false;
                continue;
            }
        }
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(c());
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        int n3;
        if (n == 1) {
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN flags INT DEFAULT 0;");
            n3 = 2;
        }
        else {
            n3 = n;
        }
        if (n3 == 2) {
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN pc BLOB;");
            n3 = 3;
        }
        if (n3 == 3) {
            sqLiteDatabase.execSQL("UPDATE drafts SET pc =  NULL");
            n3 = 4;
        }
        if (n3 == 4) {
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN quoted_tweet_data BLOB;");
            n3 = 5;
        }
        if (n3 == 5) {
            n3 = 6;
        }
        if (n3 == 6) {
            n3 = 7;
        }
        if (n3 == 7) {
            n3 = 8;
        }
        if (n3 == 8) {
            sqLiteDatabase.execSQL("UPDATE drafts SET pc = NULL");
            n3 = 9;
        }
        if (n3 == 9) {
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN prepared_media_ids BLOB;");
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN media_prepared_at INT;");
            n3 = 10;
        }
        if (n3 == 10) {
            sqLiteDatabase.execSQL("UPDATE drafts SET pc = NULL");
            n3 = 11;
        }
        if (n3 == 11 || n3 == 12 || n3 == 13) {
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN geo_tag BLOB;");
            n3 = 14;
        }
        if (n3 == 14) {
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN media BLOB;");
            b(sqLiteDatabase);
            n3 = 15;
        }
        if (n3 == 15) {
            sqLiteDatabase.execSQL("UPDATE drafts SET geo_tag = Null;");
            n3 = 16;
        }
        if (n3 == 16) {
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN sending_state INT DEFAULT 0;");
            c(sqLiteDatabase);
            n3 = 17;
        }
        if (n3 == 17) {
            sqLiteDatabase.execSQL("ALTER TABLE drafts ADD COLUMN card_url TEXT;");
            a(sqLiteDatabase);
        }
    }
}
