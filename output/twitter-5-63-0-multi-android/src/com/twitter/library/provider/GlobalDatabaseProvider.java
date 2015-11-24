// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.Map;
import android.database.sqlite.SQLiteQueryBuilder;
import android.database.Cursor;
import android.content.ContentValues;
import android.net.Uri;
import com.twitter.library.client.App;
import java.util.HashMap;
import android.content.UriMatcher;
import android.content.ContentProvider;

public class GlobalDatabaseProvider extends ContentProvider
{
    public static final String a;
    private static final UriMatcher b;
    private static final HashMap c;
    private k d;
    
    static {
        a = App.a(".provider.GlobalDatabaseProvider");
        b = new m(-1);
        (c = new HashMap()).put("_id", "_id");
        GlobalDatabaseProvider.c.put("name", "name");
        GlobalDatabaseProvider.c.put("value", "value");
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        throw new UnsupportedOperationException("Delete not supported: " + uri);
    }
    
    public String getType(final Uri uri) {
        switch (GlobalDatabaseProvider.b.match(uri)) {
            default: {
                throw new IllegalArgumentException("Unknown URL " + uri);
            }
            case 1:
            case 2: {
                return "vnd.android.cursor.dir/vnd.twitter.android.uservalues";
            }
        }
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported " + uri);
    }
    
    public boolean onCreate() {
        this.d = k.a(this.getContext());
        return true;
    }
    
    public Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        final SQLiteQueryBuilder sqLiteQueryBuilder = new SQLiteQueryBuilder();
        switch (GlobalDatabaseProvider.b.match(uri)) {
            default: {
                throw new IllegalArgumentException("Unknown URL " + uri);
            }
            case 1: {
                sqLiteQueryBuilder.setTables("user_values");
                sqLiteQueryBuilder.setProjectionMap((Map)GlobalDatabaseProvider.c);
                break;
            }
            case 2: {
                sqLiteQueryBuilder.setTables("user_values");
                sqLiteQueryBuilder.appendWhere((CharSequence)("_id=" + uri.getPathSegments().get(1)));
                break;
            }
            case 3: {
                sqLiteQueryBuilder.setTables("activity_states");
                break;
            }
            case 4: {
                sqLiteQueryBuilder.setTables("activity_states");
                sqLiteQueryBuilder.appendWhere((CharSequence)("account_name='" + uri.getLastPathSegment() + "'"));
                break;
            }
            case 5: {
                sqLiteQueryBuilder.setTables("account_settings");
                break;
            }
            case 6: {
                sqLiteQueryBuilder.setTables("account_settings");
                sqLiteQueryBuilder.appendWhere((CharSequence)("account_name='" + uri.getLastPathSegment() + "'"));
                break;
            }
        }
        final Cursor query = sqLiteQueryBuilder.query(this.d.getReadableDatabase(), array, s, array2, (String)null, (String)null, s2);
        query.setNotificationUri(this.getContext().getContentResolver(), uri);
        return query;
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("Update not supported: " + uri);
    }
}
