// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.provider;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.twitter.library.util.bn;
import android.content.ContentValues;
import com.twitter.library.provider.cy;
import com.twitter.library.util.text.a;
import com.twitter.library.api.search.TwitterTypeAheadGroup;
import com.twitter.android.client.bz;
import com.twitter.library.provider.bg;
import com.twitter.library.client.az;
import android.database.DatabaseUtils;
import com.twitter.library.util.bq;
import com.twitter.library.provider.w;
import android.content.res.Resources;
import com.twitter.library.provider.ParcelableMatrixCursor;
import java.util.ArrayList;
import java.util.Iterator;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.api.search.TwitterTypeAhead;
import java.util.Set;
import java.util.List;
import android.net.Uri$Builder;
import com.twitter.library.provider.av;
import android.database.Cursor;
import android.text.TextUtils;
import android.database.sqlite.SQLiteQueryBuilder;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import android.database.MatrixCursor$RowBuilder;
import android.database.MatrixCursor;
import android.content.Context;
import java.util.HashMap;
import android.util.Log;
import com.twitter.library.client.App;
import android.content.UriMatcher;
import java.util.Map;
import java.util.regex.Pattern;
import android.net.Uri;
import android.content.ContentProvider;

public class SuggestionsProvider extends ContentProvider
{
    public static final String a;
    public static final String b;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    public static final Uri f;
    public static final Uri g;
    public static final Uri h;
    public static final Uri i;
    public static final Pattern j;
    public static final Pattern k;
    private static final boolean l;
    private static final String[] m;
    private static final Map n;
    private static final Map o;
    private static final Map p;
    private static final Map q;
    private static final Map r;
    private static final Map s;
    private static final UriMatcher t;
    private static final String[] u;
    
    static {
        a = App.a(".provider.SuggestionsProvider");
        b = "content://" + SuggestionsProvider.a + '/';
        c = Uri.parse(SuggestionsProvider.b + "compose_users");
        d = Uri.parse(SuggestionsProvider.b + "hashtags");
        e = Uri.parse(SuggestionsProvider.b + "dmableusers");
        f = Uri.parse(SuggestionsProvider.b + "dmsharetweetusers");
        g = Uri.parse(SuggestionsProvider.b + "locations");
        h = Uri.parse(SuggestionsProvider.b + "users");
        i = Uri.parse(SuggestionsProvider.b + "search_suggest_query");
        j = Pattern.compile("[\\w ]+");
        k = Pattern.compile("\\A@?#?\\w+\\z");
        l = (App.l() && Log.isLoggable("SuggestionsProvider", 3));
        m = new String[] { "topic" };
        u = new String[] { "_id", "s_type", "suggest_text_1", "suggest_intent_query", "suggest_intent_action", "suggest_text_2", "suggest_intent_data", "suggest_intent_extra_data", "filter_name", "filter_location", "filter_follow", "user_id", "image_url", "user_verified", "friendship", "soc_name" };
        n = new HashMap();
        o = new HashMap();
        p = new HashMap();
        (t = new UriMatcher(-1)).addURI(SuggestionsProvider.a, "search_suggest_query", 1);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "search_suggest_query/*", 1);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "search_suggest_shortcut", 2);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "search_suggest_shortcut/*", 2);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "compose_users", 3);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "compose_users/*", 3);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "hashtags", 4);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "hashtags/*", 4);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "locations", 5);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "dmableusers", 7);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "dmableusers/*", 7);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "dmsharetweetusers", 8);
        SuggestionsProvider.t.addURI(SuggestionsProvider.a, "users", 6);
        (q = new HashMap(4)).put("images", 2131296713);
        SuggestionsProvider.q.put("news", 2131296708);
        SuggestionsProvider.q.put("videos", 2131296716);
        SuggestionsProvider.q.put("users", 2131296710);
        (r = new HashMap(3)).put("images", 2131296712);
        SuggestionsProvider.r.put("news", 2131296707);
        SuggestionsProvider.r.put("videos", 2131296715);
        (s = new HashMap(4)).put("news", 6);
        SuggestionsProvider.s.put("users", 2);
        SuggestionsProvider.s.put("images", 3);
        SuggestionsProvider.s.put("videos", 5);
    }
    
    private static int a(final Context context, final MatrixCursor matrixCursor, final int n, final g g) {
        final MatrixCursor$RowBuilder row = matrixCursor.newRow();
        row.add((Object)n);
        row.add((Object)1);
        row.add((Object)context.getString(2131297631, new Object[] { g.a }));
        row.add((Object)g.a);
        row.add((Object)"com.twitter.android.action.USER_SHOW");
        return n + 1;
    }
    
    private static int a(final Context context, final MatrixCursor matrixCursor, int n, final g g, final HashSet set) {
        if (!set.contains(g)) {
            set.add(g);
            final String trim = g.a.trim();
            final MatrixCursor$RowBuilder row = matrixCursor.newRow();
            row.add((Object)n);
            row.add((Object)1);
            row.add((Object)context.getString(2131297630, new Object[] { trim }));
            row.add((Object)trim);
            row.add((Object)"com.twitter.android.action.SEARCH");
            ++n;
        }
        return n;
    }
    
    private static int a(final Context context, final SQLiteDatabase sqLiteDatabase, final MatrixCursor matrixCursor, int n, final int n2, final HashSet set) {
        final SQLiteQueryBuilder sqLiteQueryBuilder = new SQLiteQueryBuilder();
        sqLiteQueryBuilder.setTables("one_click");
        sqLiteQueryBuilder.setDistinct(true);
        final Cursor query = sqLiteQueryBuilder.query(sqLiteDatabase, com.twitter.android.provider.f.a, (String)null, (String[])null, (String)null, (String)null, (String)null, (String)null);
        if (query == null) {
            return n;
        }
    Label_0151_Outer:
        while (true) {
        Label_0151:
            while (true) {
                int n3 = 0;
            Label_0512:
                while (true) {
                    int n5 = 0;
                    Label_0505: {
                        try {
                            if (query.moveToFirst()) {
                                n3 = 0;
                                final String string = query.getString(0);
                                final String string2 = query.getString(2);
                                String string3 = query.getString(3);
                                final boolean b = query.getInt(1) == 1;
                                int n4 = 0;
                                String s;
                                if (!TextUtils.isEmpty((CharSequence)string3)) {
                                    s = string3;
                                }
                                else if ("me".equals(string2) && !TextUtils.isEmpty((CharSequence)string)) {
                                    final String string4 = context.getString((int)SuggestionsProvider.q.get(string));
                                    n4 = SuggestionsProvider.s.get(string);
                                    s = string4;
                                    string3 = "";
                                }
                                else {
                                    if (!b || TextUtils.isEmpty((CharSequence)string)) {
                                        break Label_0512;
                                    }
                                    final String string5 = context.getString((int)SuggestionsProvider.r.get(string));
                                    n4 = SuggestionsProvider.s.get(string);
                                    s = string5;
                                    string3 = "";
                                }
                                Label_0336: {
                                    if (TextUtils.isEmpty((CharSequence)string3)) {
                                        break Label_0336;
                                    }
                                    final g g = new g(string3);
                                    if (!set.contains(g)) {
                                        set.add(g);
                                        break Label_0336;
                                    }
                                    n5 = n3;
                                    if (!query.moveToNext() || n5 >= n2) {
                                        return n;
                                    }
                                    break Label_0505;
                                }
                                final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                                row.add((Object)n);
                                row.add((Object)9);
                                row.add((Object)s);
                                row.add((Object)string3);
                                row.add((Object)"com.twitter.android.action.SEARCH_QUERY_ONECLICK");
                                row.add((Object)null);
                                row.add((Object)null);
                                row.add((Object)null);
                                row.add((Object)n4);
                                int n6;
                                if ("me".equals(string2)) {
                                    n6 = 1;
                                }
                                else {
                                    n6 = 0;
                                }
                                row.add((Object)n6);
                                int n7;
                                if (b) {
                                    n7 = 1;
                                }
                                else {
                                    n7 = 0;
                                }
                                row.add((Object)n7);
                                ++n;
                                n5 = n3 + 1;
                                continue Label_0151;
                            }
                            return n;
                        }
                        finally {
                            if (query != null) {
                                query.close();
                            }
                        }
                    }
                    n3 = n5;
                    continue Label_0151_Outer;
                }
                int n5 = n3;
                continue Label_0151;
            }
        }
    }
    
    private static int a(final MatrixCursor matrixCursor, int n, final Cursor cursor, final HashSet set, final int n2) {
        if (!cursor.isAfterLast() && n2 != 0) {
            int n3 = 0;
            while (cursor.getInt(2) == 0) {
                final String string = cursor.getString(0);
                final g g = new g(string);
                if (!set.contains(g)) {
                    set.add(g);
                    final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                    row.add((Object)n);
                    row.add((Object)4);
                    row.add((Object)string);
                    row.add((Object)cursor.getString(1));
                    row.add((Object)"com.twitter.android.action.SEARCH_RECENT");
                    row.add((Object)null);
                    final Uri$Builder buildUpon = av.a.buildUpon();
                    buildUpon.appendQueryParameter("type", String.valueOf(0));
                    row.add((Object)buildUpon.build());
                    ++n;
                    ++n3;
                }
                if (!cursor.moveToNext()) {
                    break;
                }
                if (n3 >= n2) {
                    break;
                }
            }
            if (!cursor.isAfterLast()) {
                while (cursor.getInt(2) == 0) {
                    if (!cursor.moveToNext()) {
                        return n;
                    }
                }
            }
        }
        return n;
    }
    
    private static int a(final MatrixCursor matrixCursor, int n, final List list, final Set set, final int n2) {
        final Iterator<TwitterTypeAhead> iterator = list.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            final TwitterTypeAhead twitterTypeAhead = iterator.next();
            if (n3 >= n2) {
                break;
            }
            int intValue;
            if (!SuggestionsProvider.s.containsKey(twitterTypeAhead.f.m)) {
                intValue = 0;
            }
            else {
                intValue = SuggestionsProvider.s.get(twitterTypeAhead.f.m);
            }
            final g g = new g(twitterTypeAhead.f.b, intValue);
            int n4;
            if (!set.contains(g)) {
                set.add(g);
                final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                row.add((Object)n);
                row.add((Object)2);
                row.add((Object)twitterTypeAhead.f.a);
                row.add((Object)twitterTypeAhead.f.b);
                row.add((Object)"com.twitter.android.action.SEARCH_TYPEAHEAD_TOPIC");
                row.add((Object)null);
                row.add((Object)null);
                row.add((Object)TwitterScribeItem.a(-1L, twitterTypeAhead.f.b, 12, n).toString());
                row.add((Object)intValue);
                ++n;
                n4 = n3 + 1;
            }
            else {
                n4 = n3;
            }
            n3 = n4;
        }
        return n;
    }
    
    private static int a(final SQLiteDatabase sqLiteDatabase, final MatrixCursor matrixCursor, final int n, final String s, final HashSet set, final int n2, final boolean b) {
        final Cursor query = sqLiteDatabase.query("search_queries", com.twitter.android.provider.k.a, "cluster_titles NOT NULL", (String[])null, (String)null, (String)null, (String)null);
        if (query == null) {
            return n;
        }
        int n3 = 0;
        int n4 = n;
        while (true) {
            while (true) {
                Label_0225: {
                    try {
                        while (query.moveToNext() && n3 < n2) {
                            final String string = query.getString(0);
                            final ArrayList list = (ArrayList)com.twitter.util.f.a(query.getBlob(1));
                            String join;
                            if (list != null) {
                                join = TextUtils.join((CharSequence)s, (Iterable)list);
                            }
                            else {
                                join = null;
                            }
                            if (TextUtils.isEmpty((CharSequence)join)) {
                                break Label_0225;
                            }
                            final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                            row.add((Object)n4);
                            row.add((Object)8);
                            row.add((Object)string);
                            row.add((Object)string);
                            row.add((Object)"com.twitter.android.action.SEARCH_TREND");
                            row.add((Object)join);
                            final int n5 = n4 + 1;
                            set.add(new g(string));
                            final int n6 = n3 + 1;
                            final int n7 = n5;
                            n4 = n7;
                            n3 = n6;
                        }
                        return n4;
                    }
                    finally {
                        query.close();
                    }
                }
                final int n6 = n3;
                final int n7 = n4;
                continue;
            }
        }
    }
    
    private static int a(final SQLiteDatabase sqLiteDatabase, final MatrixCursor matrixCursor, int n, final String s, final String[] array, final String s2, final HashSet set, final int n2) {
        if (set.size() < n2) {
            final Cursor query = sqLiteDatabase.query(true, "tokens_user_view", com.twitter.android.provider.j.a, s, array, (String)null, (String)null, s2, String.valueOf(100));
            if (query != null) {
                while (query.moveToNext() && set.size() < n2) {
                    final String string = query.getString(1);
                    final g g = new g(string);
                    if (!set.contains(g)) {
                        set.add(g);
                        final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                        row.add((Object)n);
                        row.add((Object)7);
                        row.add((Object)query.getString(0));
                        row.add((Object)string);
                        if (1 == query.getInt(2)) {
                            row.add((Object)"com.twitter.android.action.USER_SHOW_TYPEAHEAD");
                        }
                        else {
                            row.add((Object)"com.twitter.android.action.USER_SHOW_SEARCH_SUGGESTION");
                        }
                        row.add((Object)('@' + string));
                        row.add((Object)null);
                        final long long1 = query.getLong(3);
                        row.add((Object)TwitterScribeItem.a(long1, null, 3, n).toString());
                        row.add((Object)null);
                        row.add((Object)null);
                        row.add((Object)null);
                        row.add((Object)long1);
                        row.add((Object)query.getString(4));
                        row.add((Object)query.getInt(5));
                        row.add((Object)query.getInt(6));
                        row.add((Object)query.getString(7));
                        ++n;
                    }
                }
                query.close();
            }
        }
        return n;
    }
    
    private Cursor a(final SQLiteDatabase sqLiteDatabase, final ParcelableMatrixCursor parcelableMatrixCursor, final String s, final String[] array, final String s2, final HashSet set) {
        final Cursor query = sqLiteDatabase.query("locations", com.twitter.android.provider.d.a, s, array, (String)null, (String)null, s2, (String)null);
        if (query != null) {
            final Resources resources = this.getContext().getResources();
            while (query.moveToNext()) {
                final String string = query.getString(2);
                final g g = new g(string);
                if (!set.contains(g)) {
                    set.add(g);
                    final w a = parcelableMatrixCursor.a();
                    a.a(query.getLong(0));
                    a.a(query.getLong(1));
                    a.a(string);
                    final String string2 = query.getString(3);
                    if (!string.equalsIgnoreCase(string2) && !TextUtils.isEmpty((CharSequence)string2)) {
                        a.a(resources.getString(2131297958, new Object[] { string, string2 }));
                    }
                    else {
                        a.a(string);
                    }
                }
            }
            query.close();
        }
        return (Cursor)parcelableMatrixCursor;
    }
    
    private Cursor a(final String s, final int n, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final char char1 = s.charAt(0);
            boolean b2 = false;
            if (char1 != '@') {
                b2 = true;
            }
            final String string = bq.a(s) + '%';
            final String sqlEscapeString = DatabaseUtils.sqlEscapeString(string);
            sb.append("(username LIKE " + sqlEscapeString);
            if (b2) {
                sb.append(" OR name LIKE " + sqlEscapeString + " OR " + "name" + " LIKE " + DatabaseUtils.sqlEscapeString("% " + string));
            }
            sb.append(')');
        }
        final Context context = this.getContext();
        final long g = az.a(context).b().g();
        if (n != 0) {
            if (sb.length() != 0) {
                sb.append(" AND ");
            }
            sb.append("(friendship&" + n + '=' + n);
            if (b) {
                sb.append(" OR user_id = " + g);
            }
            sb.append(')');
        }
        String string2;
        if (sb.length() > 0) {
            string2 = sb.toString();
        }
        else {
            string2 = null;
        }
        return bg.a(context, g).getReadableDatabase().query(true, "tokens_user_view", com.twitter.android.provider.j.a, string2, (String[])null, (String)null, (String)null, "graph_weight DESC, LOWER(username) ASC", (String)null);
    }
    
    private Cursor a(final String s, final int n, final boolean b, final boolean b2, final boolean b3, final List list, final yg yg) {
        final MatrixCursor matrixCursor = new MatrixCursor(com.twitter.android.provider.l.a);
        final int g = bz.g();
        Set<Long> a;
        if (list != null && list.size() > 0) {
            a = (Set<Long>)this.a(matrixCursor, list, g);
        }
        else {
            a = new HashSet<Long>();
        }
        final Cursor a2 = this.a(s, n, b2);
        if (a2 != null) {
            while (a2.moveToNext()) {
                final long long1 = a2.getLong(3);
                if (!a.contains(long1)) {
                    this.a(matrixCursor, long1, a2.getString(1), a2.getString(0), a2.getString(4), a2.getInt(5), a2.getInt(6));
                    a.add(long1);
                    if (matrixCursor.getCount() >= g) {
                        break;
                    }
                    continue;
                }
            }
            a2.close();
        }
        if (b) {
            this.a(matrixCursor, bq.a(s), g, a, yg);
        }
        if (b3) {
            this.a(matrixCursor, s);
        }
        return (Cursor)matrixCursor;
    }
    
    public static TwitterTypeAheadGroup a(final String s) {
        synchronized (SuggestionsProvider.n) {
            return SuggestionsProvider.n.get(d(s));
        }
    }
    
    private Set a(final MatrixCursor matrixCursor, final List list, final int n) {
        final Context context = this.getContext();
        final HashSet<Long> set = new HashSet<Long>();
        if (matrixCursor.getCount() < n) {
            final Cursor query = bg.a(context, az.a(context).b().g()).getReadableDatabase().query("users", com.twitter.android.provider.l.a, "user_id IN (" + TextUtils.join((CharSequence)",", (Iterable)list) + ") AND " + "friendship" + " <> 0", (String[])null, (String)null, (String)null, (String)null);
            if (query != null) {
                final HashMap hashMap = new HashMap<Object, Object>(query.getCount());
                while (query.moveToNext()) {
                    hashMap.put(query.getLong(1), query.getPosition());
                }
                for (final Long n2 : list) {
                    final Integer n3 = hashMap.get(n2);
                    if (n3 != null) {
                        query.moveToPosition((int)n3);
                        this.a(matrixCursor, n2, query.getString(2), query.getString(3), query.getString(4), query.getInt(5), query.getInt(6));
                        set.add(n2);
                        if (matrixCursor.getCount() >= n) {
                            break;
                        }
                        continue;
                    }
                }
                query.close();
            }
        }
        return set;
    }
    
    public static void a() {
        synchronized (SuggestionsProvider.n) {
            SuggestionsProvider.n.clear();
        }
    }
    
    private void a(final MatrixCursor matrixCursor, final long n, final String s, final String s2, final String s3, final int n2, final int n3) {
        final MatrixCursor$RowBuilder row = matrixCursor.newRow();
        row.add((Object)(-1 + matrixCursor.getCount()));
        row.add((Object)n);
        row.add((Object)s);
        row.add((Object)s2);
        row.add((Object)s3);
        row.add((Object)n2);
        row.add((Object)n3);
    }
    
    private void a(final MatrixCursor matrixCursor, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s) && com.twitter.library.util.text.d.b.matcher(s).matches()) {
            final int count = matrixCursor.getCount();
            final MatrixCursor$RowBuilder row = matrixCursor.newRow();
            row.add((Object)count);
            row.add((Object)0);
            final String a = bq.a(s);
            row.add((Object)a);
            row.add((Object)("@" + a));
            row.add((Object)null);
            row.add((Object)0);
            row.add((Object)0);
        }
    }
    
    private void a(final MatrixCursor matrixCursor, final String s, final int n, final Set set, final yg yg) {
        if (!TextUtils.isEmpty((CharSequence)s) && matrixCursor.getCount() < n) {
            Iterable iterable = b(s);
            if (iterable != null) {
                if (yg != null) {
                    iterable = xy.a(iterable, yg);
                }
                for (final TwitterTypeAhead twitterTypeAhead : iterable) {
                    if (matrixCursor.getCount() >= n) {
                        break;
                    }
                    if (set.contains(twitterTypeAhead.e.userId)) {
                        continue;
                    }
                    final long userId = twitterTypeAhead.e.userId;
                    final String username = twitterTypeAhead.e.username;
                    final String name = twitterTypeAhead.e.name;
                    final String profileImageUrl = twitterTypeAhead.e.profileImageUrl;
                    int n2;
                    if (twitterTypeAhead.e.verified) {
                        n2 = 2;
                    }
                    else {
                        n2 = 0;
                    }
                    this.a(matrixCursor, userId, username, name, profileImageUrl, n2, twitterTypeAhead.e.friendship);
                }
            }
        }
    }
    
    public static void a(final String s, final TwitterTypeAheadGroup twitterTypeAheadGroup) {
        synchronized (SuggestionsProvider.n) {
            SuggestionsProvider.n.put(d(s), twitterTypeAheadGroup);
        }
    }
    
    public static void a(String string, final List list) {
        synchronized (SuggestionsProvider.o) {
            if (!string.startsWith("@")) {
                string = "@" + string;
            }
            SuggestionsProvider.o.put(string, list);
        }
    }
    
    private static int b(final MatrixCursor matrixCursor, int n, final Cursor cursor, final HashSet set, final int n2) {
        if (!cursor.isAfterLast() && n2 != 0) {
            int n3 = 0;
            while (cursor.getInt(2) == 6) {
                final String string = cursor.getString(0);
                final g g = new g(string);
                if (!set.contains(g)) {
                    set.add(g);
                    final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                    row.add((Object)n);
                    row.add((Object)5);
                    row.add((Object)string);
                    row.add((Object)cursor.getString(1));
                    row.add((Object)"com.twitter.android.action.SEARCH_QUERY_SAVED");
                    row.add((Object)null);
                    final Uri$Builder buildUpon = av.a.buildUpon();
                    buildUpon.appendQueryParameter("type", String.valueOf(6));
                    row.add((Object)buildUpon.build());
                    row.add((Object)TwitterScribeItem.a(cursor.getLong(3), string, 13, n).toString());
                    ++n;
                    ++n3;
                }
                if (!cursor.moveToNext()) {
                    break;
                }
                if (n3 >= n2) {
                    break;
                }
            }
            if (!cursor.isAfterLast()) {
                while (cursor.getInt(2) == 6) {
                    if (!cursor.moveToNext()) {
                        return n;
                    }
                }
            }
        }
        return n;
    }
    
    private static int b(final MatrixCursor matrixCursor, int n, final List list, final Set set, final int n2) {
        final Iterator<TwitterTypeAhead> iterator = list.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            final TwitterTypeAhead twitterTypeAhead = iterator.next();
            if (n3 >= n2) {
                break;
            }
            final g g = new g(twitterTypeAhead.e.username);
            int n5;
            if (!set.contains(g)) {
                set.add(g);
                final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                row.add((Object)n);
                row.add((Object)6);
                row.add((Object)twitterTypeAhead.e.name);
                row.add((Object)twitterTypeAhead.e.username);
                row.add((Object)"com.twitter.android.action.USER_SHOW_TYPEAHEAD");
                row.add((Object)('@' + twitterTypeAhead.e.username));
                row.add((Object)null);
                row.add((Object)TwitterScribeItem.a(twitterTypeAhead.e.a(), null, 3, n).toString());
                row.add((Object)null);
                row.add((Object)null);
                row.add((Object)null);
                row.add((Object)twitterTypeAhead.e.a());
                row.add((Object)twitterTypeAhead.e.profileImageUrl);
                int n4;
                if (twitterTypeAhead.e.verified) {
                    n4 = 2;
                }
                else {
                    n4 = 0;
                }
                row.add((Object)n4);
                ++n;
                n5 = n3 + 1;
            }
            else {
                n5 = n3;
            }
            n3 = n5;
        }
        return n;
    }
    
    private static int b(final SQLiteDatabase sqLiteDatabase, final MatrixCursor matrixCursor, int n, final String s, final String[] array, final String s2, final HashSet set, final int n2) {
        if (n2 <= 0) {
            return n;
        }
        final Cursor query = sqLiteDatabase.query(true, "tokens_topic_view", com.twitter.android.provider.i.a, s, array, (String)null, (String)null, s2, String.valueOf(100));
        if (query == null) {
            return n;
        }
        int n3 = 0;
        int n4 = n;
        try {
            while (query.moveToNext() && n3 < n2) {
                final String string = query.getString(0);
                final g g = new g(string);
                if (!set.contains(g)) {
                    set.add(g);
                    final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                    row.add((Object)n4);
                    row.add((Object)3);
                    row.add((Object)string);
                    row.add((Object)string);
                    row.add((Object)"com.twitter.android.action.SEARCH_TYPEAHEAD_TOPIC");
                    row.add((Object)null);
                    row.add((Object)null);
                    row.add((Object)TwitterScribeItem.a(-1L, string, 12, n4).toString());
                    ++n4;
                    ++n3;
                }
            }
            query.close();
            n = n4;
            return n;
        }
        finally {
            query.close();
        }
    }
    
    public static List b(String string) {
        synchronized (SuggestionsProvider.o) {
            if (!string.startsWith("@")) {
                string = "@" + string;
            }
            return SuggestionsProvider.o.get(string);
        }
    }
    
    public static void b() {
        synchronized (SuggestionsProvider.o) {
            SuggestionsProvider.o.clear();
        }
    }
    
    public static void b(String string, final List list) {
        synchronized (SuggestionsProvider.p) {
            if (!string.startsWith("#")) {
                string = "#" + string;
            }
            SuggestionsProvider.p.put(string, list);
        }
    }
    
    public static List c(String string) {
        synchronized (SuggestionsProvider.p) {
            if (!string.startsWith("#")) {
                string = "#" + string;
            }
            return SuggestionsProvider.p.get(string);
        }
    }
    
    public static void c() {
        synchronized (SuggestionsProvider.p) {
            SuggestionsProvider.p.clear();
        }
    }
    
    private Cursor d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/twitter/android/provider/SuggestionsProvider.getContext:()Landroid/content/Context;
        //     4: invokestatic    com/twitter/library/client/az.a:(Landroid/content/Context;)Lcom/twitter/library/client/az;
        //     7: invokevirtual   com/twitter/library/client/az.b:()Lcom/twitter/library/client/Session;
        //    10: invokevirtual   com/twitter/library/client/Session.g:()J
        //    13: lstore_1       
        //    14: aload_0        
        //    15: invokevirtual   com/twitter/android/provider/SuggestionsProvider.getContext:()Landroid/content/Context;
        //    18: lload_1        
        //    19: invokestatic    com/twitter/library/provider/bg.a:(Landroid/content/Context;J)Lcom/twitter/library/provider/bg;
        //    22: invokevirtual   com/twitter/library/provider/bg.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    25: astore_3       
        //    26: new             Landroid/database/sqlite/SQLiteQueryBuilder;
        //    29: dup            
        //    30: invokespecial   android/database/sqlite/SQLiteQueryBuilder.<init>:()V
        //    33: astore          4
        //    35: new             Landroid/database/MatrixCursor;
        //    38: dup            
        //    39: getstatic       com/twitter/android/provider/l.a:[Ljava/lang/String;
        //    42: invokespecial   android/database/MatrixCursor.<init>:([Ljava/lang/String;)V
        //    45: astore          5
        //    47: aload           4
        //    49: ldc_w           "dm_inbox"
        //    52: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.setTables:(Ljava/lang/String;)V
        //    55: aload           4
        //    57: aload_3        
        //    58: getstatic       com/twitter/library/api/conversations/aa.a:[Ljava/lang/String;
        //    61: aconst_null    
        //    62: aconst_null    
        //    63: aconst_null    
        //    64: aconst_null    
        //    65: ldc_w           "sort_event_id DESC"
        //    68: aconst_null    
        //    69: invokevirtual   android/database/sqlite/SQLiteQueryBuilder.query:(Landroid/database/sqlite/SQLiteDatabase;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    72: astore          6
        //    74: new             Lcom/twitter/library/provider/c;
        //    77: dup            
        //    78: aload           6
        //    80: lload_1        
        //    81: aload_0        
        //    82: invokevirtual   com/twitter/android/provider/SuggestionsProvider.getContext:()Landroid/content/Context;
        //    85: aconst_null    
        //    86: iconst_0       
        //    87: invokespecial   com/twitter/library/provider/c.<init>:(Landroid/database/Cursor;JLandroid/content/Context;Ljava/lang/String;Z)V
        //    90: astore          7
        //    92: new             Ljava/util/HashSet;
        //    95: dup            
        //    96: invokespecial   java/util/HashSet.<init>:()V
        //    99: astore          8
        //   101: aload           8
        //   103: lload_1        
        //   104: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   107: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   112: pop            
        //   113: invokestatic    com/twitter/android/client/bz.g:()I
        //   116: istore          10
        //   118: aload           7
        //   120: invokevirtual   com/twitter/library/provider/c.moveToNext:()Z
        //   123: ifeq            218
        //   126: aload           7
        //   128: invokevirtual   com/twitter/library/provider/c.i:()J
        //   131: lstore          18
        //   133: aload           7
        //   135: invokevirtual   com/twitter/library/provider/c.h:()Z
        //   138: ifne            118
        //   141: lload           18
        //   143: lconst_0       
        //   144: lcmp           
        //   145: ifeq            118
        //   148: aload           8
        //   150: lload           18
        //   152: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   155: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   160: ifne            118
        //   163: aload_0        
        //   164: aload           5
        //   166: lload           18
        //   168: aload           7
        //   170: invokevirtual   com/twitter/library/provider/c.g:()Ljava/lang/String;
        //   173: invokestatic    com/twitter/library/util/bq.a:(Ljava/lang/String;)Ljava/lang/String;
        //   176: aload           7
        //   178: invokevirtual   com/twitter/library/provider/c.f:()Ljava/lang/String;
        //   181: aload           7
        //   183: invokevirtual   com/twitter/library/provider/c.m:()Ljava/lang/String;
        //   186: iconst_0       
        //   187: iconst_0       
        //   188: invokespecial   com/twitter/android/provider/SuggestionsProvider.a:(Landroid/database/MatrixCursor;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
        //   191: aload           8
        //   193: lload           18
        //   195: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   198: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   203: pop            
        //   204: aload           5
        //   206: invokevirtual   android/database/MatrixCursor.getCount:()I
        //   209: istore          21
        //   211: iload           21
        //   213: iload           10
        //   215: if_icmplt       118
        //   218: aload           6
        //   220: invokeinterface android/database/Cursor.close:()V
        //   225: aload           5
        //   227: invokevirtual   android/database/MatrixCursor.getCount:()I
        //   230: iload           10
        //   232: if_icmpge       367
        //   235: aload_0        
        //   236: aconst_null    
        //   237: iconst_2       
        //   238: iconst_0       
        //   239: invokespecial   com/twitter/android/provider/SuggestionsProvider.a:(Ljava/lang/String;IZ)Landroid/database/Cursor;
        //   242: astore          12
        //   244: aload           12
        //   246: ifnull          367
        //   249: aload           12
        //   251: invokeinterface android/database/Cursor.moveToNext:()Z
        //   256: ifeq            360
        //   259: aload           12
        //   261: iconst_3       
        //   262: invokeinterface android/database/Cursor.getLong:(I)J
        //   267: lstore          14
        //   269: aload           8
        //   271: lload           14
        //   273: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   276: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   281: ifne            249
        //   284: aload_0        
        //   285: aload           5
        //   287: lload           14
        //   289: aload           12
        //   291: iconst_1       
        //   292: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   297: aload           12
        //   299: iconst_0       
        //   300: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   305: aload           12
        //   307: iconst_4       
        //   308: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   313: aload           12
        //   315: iconst_5       
        //   316: invokeinterface android/database/Cursor.getInt:(I)I
        //   321: aload           12
        //   323: bipush          6
        //   325: invokeinterface android/database/Cursor.getInt:(I)I
        //   330: invokespecial   com/twitter/android/provider/SuggestionsProvider.a:(Landroid/database/MatrixCursor;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
        //   333: aload           8
        //   335: lload           14
        //   337: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   340: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   345: pop            
        //   346: aload           5
        //   348: invokevirtual   android/database/MatrixCursor.getCount:()I
        //   351: istore          17
        //   353: iload           17
        //   355: iload           10
        //   357: if_icmplt       249
        //   360: aload           12
        //   362: invokeinterface android/database/Cursor.close:()V
        //   367: aload           5
        //   369: areturn        
        //   370: astore          11
        //   372: aload           6
        //   374: invokeinterface android/database/Cursor.close:()V
        //   379: aload           11
        //   381: athrow         
        //   382: astore          13
        //   384: aload           12
        //   386: invokeinterface android/database/Cursor.close:()V
        //   391: aload           13
        //   393: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  118    141    370    382    Any
        //  148    211    370    382    Any
        //  249    353    382    394    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0249:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static String d(final String s) {
        final int length = s.length();
        final boolean b = length > 1 && com.twitter.library.util.text.a.b.matcher(s.substring(length - 1)).matches();
        final StringBuilder append = new StringBuilder().append(s.toLowerCase().trim());
        String s2;
        if (b) {
            s2 = " ";
        }
        else {
            s2 = "";
        }
        return append.append(s2).toString();
    }
    
    private Cursor e(final String s) {
        final String d = d(s);
        final g g = new g(d);
        final Context context = this.getContext();
        final bg a = bg.a(context, cy.b(context));
        final HashSet set = new HashSet();
        final SQLiteDatabase readableDatabase = a.getReadableDatabase();
        final int e = bz.e();
        final int a2 = com.twitter.library.featureswitch.d.a("search_concierge_max_oneclick", 0);
        final int d2 = bz.d();
        final int c = bz.c();
        final int f = bz.f();
        final MatrixCursor matrixCursor = new MatrixCursor(SuggestionsProvider.u);
        final SQLiteQueryBuilder sqLiteQueryBuilder = new SQLiteQueryBuilder();
        sqLiteQueryBuilder.setTables("search_queries");
        sqLiteQueryBuilder.appendWhere((CharSequence)"name LIKE ");
        sqLiteQueryBuilder.appendWhereEscapeString(d + "%");
        sqLiteQueryBuilder.appendWhere((CharSequence)" AND query!=''");
        sqLiteQueryBuilder.appendWhere((CharSequence)" AND query NOT LIKE 'place:%'");
        sqLiteQueryBuilder.setDistinct(true);
        final Cursor query = sqLiteQueryBuilder.query(readableDatabase, com.twitter.android.provider.h.a, "type IN (6,0)", (String[])null, "name", (String)null, "type ASC, query_id DESC, time DESC");
        if (!TextUtils.isEmpty((CharSequence)d)) {
            TwitterTypeAheadGroup a3;
            if (d2 + e == 0) {
                a3 = null;
            }
            else {
                a3 = a(d);
            }
            int n2;
            int n3;
            if (query != null && query.moveToFirst()) {
                final int a4 = a(matrixCursor, 0, query, set, d2);
                final int n = 0 + (a4 - 0);
                final int b = b(matrixCursor, a4, query, set, d2 - n);
                n2 = n + (b - a4);
                n3 = b;
            }
            else {
                n2 = 0;
                n3 = 0;
            }
            int n4;
            if (a3 != null) {
                n4 = a(matrixCursor, n3, a3.b, set, d2 - n2);
                n2 += n4 - n3;
            }
            else {
                n4 = n3;
            }
            final HashSet set2 = new HashSet();
            final String[] array = { d + '%' };
            int n11;
            boolean b3;
            int matches;
            int n12;
            int n13;
            if (SuggestionsProvider.k.matcher(d).matches()) {
                final char char1 = d.charAt(0);
                int n6;
                int n7;
                int n8;
                int n9;
                if (char1 == '@') {
                    int a5;
                    if (n2 == 0) {
                        a5 = a(context, matrixCursor, n4, g, set);
                    }
                    else {
                        a5 = n4;
                    }
                    n4 = a(readableDatabase, matrixCursor, a5, "text LIKE ? AND username NOT NULL", array, "graph_weight DESC, LOWER(username) ASC", set2, e);
                    final int n5 = 0 + (n4 - a5);
                    n6 = 0;
                    n7 = n5;
                    n8 = n2;
                    n9 = 1;
                }
                else if (char1 == '#') {
                    final int b2 = b(readableDatabase, matrixCursor, n4, "text LIKE ? AND topic NOT NULL", array, "weight DESC, LOWER(topic) ASC", set, d2);
                    final int n10 = n2 + (b2 - n4);
                    n4 = b2;
                    n8 = n10;
                    n9 = 0;
                    n6 = 0;
                    n7 = 0;
                }
                else {
                    n8 = n2;
                    n6 = 1;
                    n9 = 0;
                    n7 = 0;
                }
                n11 = n9;
                b3 = false;
                matches = n6;
                n12 = n7;
                n13 = n8;
            }
            else {
                b3 = ((matches = (SuggestionsProvider.j.matcher(d).matches() ? 1 : 0)) != 0);
                n13 = n2;
                n12 = 0;
                n11 = 0;
            }
            int n15;
            int n16;
            if (matches != 0) {
                String s2;
                String s3;
                String s4;
                if (b3) {
                    s2 = "topic LIKE ?";
                    s3 = "name LIKE ?";
                    s4 = "graph_weight DESC, LOWER(name) ASC";
                }
                else {
                    s2 = "text LIKE ? AND topic NOT NULL";
                    s3 = "text LIKE ? AND username NOT NULL";
                    s4 = "graph_weight DESC, LOWER(username) ASC";
                }
                int n14 = b(readableDatabase, matrixCursor, n4, s2, array, "weight DESC, LOWER(topic) ASC", set, d2 - n13);
                if (n13 + (n14 - n4) == 0) {
                    n14 = a(context, matrixCursor, n14, g, set);
                }
                final int a6 = a(readableDatabase, matrixCursor, n14, s3, array, s4, set2, e);
                n15 = n12 + (a6 - n14);
                n16 = a6;
            }
            else if (n13 == 0 && n11 == 0) {
                final int a7 = a(context, matrixCursor, n4, g, set);
                n15 = n12;
                n16 = a7;
            }
            else {
                n15 = n12;
                n16 = n4;
            }
            int b4;
            if (a3 != null) {
                b4 = b(matrixCursor, n16, a3.a, set2, e - n15);
            }
            else {
                b4 = n16;
            }
            if (!b3) {
                if (n11 != 0) {
                    a(context, matrixCursor, b4, new g(d.substring(1)));
                }
                else if (matches != 0) {
                    a(context, matrixCursor, b4, g);
                }
            }
        }
        else {
            int n17 = a(readableDatabase, matrixCursor, 0, context.getString(2131298184), set, f, true);
            if (com.twitter.library.featureswitch.d.f("search_concierge_enabled")) {
                n17 = a(context, readableDatabase, matrixCursor, n17, a2, set);
            }
            if (query != null && query.moveToFirst()) {
                b(matrixCursor, a(matrixCursor, n17, query, set, c), query, set, Integer.MAX_VALUE);
            }
        }
        if (query != null) {
            query.close();
        }
        return (Cursor)matrixCursor;
    }
    
    Cursor a(final String s, final MatrixCursor matrixCursor) {
        final Context context = this.getContext();
        int n;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            n = 1;
        }
        else {
            n = 0;
        }
        String[] array;
        String s2;
        if (n == 0) {
            array = null;
            s2 = null;
        }
        else {
            String s3;
            if (com.twitter.library.util.text.a.b.matcher(s).find()) {
                s3 = "name LIKE ?";
            }
            else {
                s3 = "text LIKE ? AND username NOT NULL";
            }
            array = new String[] { s + "%" };
            s2 = s3;
        }
        final HashSet<Long> set = new HashSet<Long>();
        final long g = az.a(context).b().g();
        final int g2 = bz.g();
        final Cursor query = bg.a(context, g).getReadableDatabase().query(true, "tokens_user_view", com.twitter.android.provider.b.a, s2, array, (String)null, (String)null, "graph_weight DESC, LOWER(username) ASC", String.valueOf(g2));
        if (query != null) {
            int n2 = 0;
            while (query.moveToNext()) {
                final String string = query.getString(1);
                if (string != null) {
                    final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                    final int n3 = n2 + 1;
                    row.add((Object)n2);
                    row.add((Object)query.getLong(0));
                    row.add((Object)string);
                    row.add((Object)query.getString(2));
                    row.add((Object)query.getString(3));
                    row.add((Object)query.getInt(4));
                    row.add((Object)query.getInt(5));
                    set.add(query.getLong(0));
                    n2 = n3;
                }
            }
            query.close();
        }
        this.a(matrixCursor, s, g2, set, null);
        return (Cursor)matrixCursor;
    }
    
    Cursor a(final String s, final MatrixCursor matrixCursor, final boolean b) {
        final Context context = this.getContext();
        final HashSet<g> set = new HashSet<g>();
        final List c = c(s);
        int n3;
        if (c != null) {
            final Iterator<TwitterTypeAhead> iterator = c.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final TwitterTypeAhead twitterTypeAhead = iterator.next();
                final MatrixCursor$RowBuilder row = matrixCursor.newRow();
                final int n2 = n + 1;
                row.add((Object)n);
                row.add((Object)twitterTypeAhead.g);
                set.add(new g(twitterTypeAhead.g));
                n = n2;
            }
            n3 = n;
        }
        else {
            n3 = 0;
        }
        final int g = bz.g();
        if (n3 < g) {
            final Cursor query = bg.a(context, az.a(context).b().g()).getReadableDatabase().query(true, "tokens_topic_view", SuggestionsProvider.m, "text LIKE ? AND topic NOT NULL", new String[] { s + "%" }, (String)null, (String)null, "weight DESC, LOWER(topic) ASC", String.valueOf(g));
            if (query != null) {
                while (query.moveToNext()) {
                    final String string = query.getString(0);
                    if (!set.contains(new g(string))) {
                        if (n3 >= g) {
                            break;
                        }
                        final MatrixCursor$RowBuilder row2 = matrixCursor.newRow();
                        final int n4 = n3 + 1;
                        row2.add((Object)n3);
                        row2.add((Object)string);
                        n3 = n4;
                    }
                }
                query.close();
            }
        }
        if (n3 < g && s.length() > 1 && (matrixCursor.getCount() > 0 || b) && !set.contains(new g(s))) {
            final MatrixCursor$RowBuilder row3 = matrixCursor.newRow();
            row3.add((Object)n3);
            row3.add((Object)s);
        }
        return (Cursor)matrixCursor;
    }
    
    Cursor a(final String s, final ParcelableMatrixCursor parcelableMatrixCursor) {
        final Context context = this.getContext();
        final SQLiteDatabase readableDatabase = bg.a(context, az.a(context).b().g()).getReadableDatabase();
        final HashSet set = new HashSet();
        if (TextUtils.isEmpty((CharSequence)s)) {
            return this.a(readableDatabase, parcelableMatrixCursor, "country=name OR country=''", null, "country ASC", set);
        }
        final String[] array = { s + "%" };
        this.a(readableDatabase, parcelableMatrixCursor, "country LIKE ? AND country=name", array, "country ASC", set);
        this.a(readableDatabase, parcelableMatrixCursor, "name LIKE ?", array, "name ASC,country ASC", set);
        return (Cursor)parcelableMatrixCursor;
    }
    
    public int delete(final Uri uri, final String s, final String[] array) {
        throw new UnsupportedOperationException("Delete not supported " + uri);
    }
    
    public String getType(final Uri uri) {
        switch (SuggestionsProvider.t.match(uri)) {
            default: {
                throw new IllegalArgumentException("Unknown URL " + uri);
            }
            case 1: {
                return "vnd.android.cursor.dir/vnd.android.search.suggest";
            }
            case 2: {
                return "vnd.android.cursor.item/vnd.android.search.suggest";
            }
            case 3: {
                return "vnd.android.cursor.item/vnd.twitter.android.suggest_compose_users";
            }
            case 4: {
                return "vnd.android.cursor.item/vnd.twitter.android.suggest_hashtags";
            }
            case 7: {
                return "vnd.android.cursor.item/vnd.twitter.android.suggest_dmable_users";
            }
            case 8: {
                return "vnd.android.cursor.item/vnd.twitter.android.suggest_dm_share_tweet_users";
            }
            case 5: {
                return "vnd.android.cursor.item/vnd.twitter.android.suggest_locations";
            }
            case 6: {
                return "vnd.android.cursor.item/vnd.twitter.android.suggest_users";
            }
        }
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert not supported " + uri);
    }
    
    public boolean onCreate() {
        return true;
    }
    
    public Cursor query(final Uri uri, final String[] array, String s, final String[] array2, final String s2) {
        if (SuggestionsProvider.l) {
            Log.d("SuggestionsProvider", "QUERY uri: " + uri + " -> " + SuggestionsProvider.t.match(uri));
        }
        switch (SuggestionsProvider.t.match(uri)) {
            default: {
                throw new IllegalArgumentException("Unknown URL " + uri);
            }
            case 1: {
                String lastPathSegment;
                if (uri.getPathSegments().size() > 1) {
                    lastPathSegment = uri.getLastPathSegment();
                }
                else {
                    lastPathSegment = null;
                }
                return this.e(com.twitter.util.k.a(lastPathSegment));
            }
            case 2: {
                return null;
            }
            case 3: {
                return this.a(s, new MatrixCursor(com.twitter.android.provider.l.a));
            }
            case 4: {
                if (TextUtils.isEmpty((CharSequence)s) || s.charAt(0) != '#') {
                    String string;
                    if (s != null) {
                        string = "#" + s;
                    }
                    else {
                        string = "#";
                    }
                    s = string;
                }
                return this.a(s, new MatrixCursor(com.twitter.android.provider.c.a), bn.a(uri, "add_query_to_empty_result", false));
            }
            case 7: {
                return this.a(s, 2, bn.a(uri, "add_real_time_suggestions", false), false, bn.a(uri, "add_query", true), null, new com.twitter.android.provider.a());
            }
            case 8: {
                return this.d();
            }
            case 5: {
                return this.a(s, new ParcelableMatrixCursor(com.twitter.android.provider.e.a));
            }
            case 6: {
                return this.a(s, bn.a(uri, "friendship", 0), bn.a(uri, "add_real_time_suggestions", false), true, false, bn.a(uri, "additional_user_ids", null), null);
            }
        }
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("Update not supported " + uri);
    }
}
