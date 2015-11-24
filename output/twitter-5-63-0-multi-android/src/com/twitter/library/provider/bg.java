// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.conversations.x;
import com.twitter.library.api.conversations.ParticipantsNotAddedEntry;
import com.twitter.library.api.conversations.DMMessageEntry;
import com.twitter.library.api.MediaEntityList;
import com.twitter.library.api.ax;
import android.database.SQLException;
import android.database.DatabaseUtils;
import com.twitter.library.api.TwitterTopic$TrendsPlus$TargetInfo;
import com.twitter.library.api.TwitterTopic$TrendsPlus$ContextInfo;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import com.twitter.library.api.conversations.BaseConversationEntry;
import com.twitter.library.api.conversations.DMLocalMessageEntry;
import com.twitter.library.api.conversations.BaseDMAttachment;
import com.twitter.library.api.geo.GeoTag;
import com.twitter.library.util.bk;
import com.twitter.library.api.TwitterLocation;
import android.content.Intent;
import com.twitter.library.util.bn;
import com.twitter.library.commerce.model.OrderHistoryList;
import com.twitter.library.api.search.j;
import com.twitter.library.api.timeline.aa;
import com.twitter.library.api.timeline.ac;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.library.api.search.l;
import com.twitter.library.platform.d;
import com.twitter.library.platform.c;
import java.util.LinkedHashSet;
import java.util.Arrays;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.api.bq;
import com.twitter.library.api.geo.Coordinate;
import com.twitter.library.api.be;
import com.twitter.library.api.search.TwitterSearchQuery;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.api.MediaEntity$Type;
import java.lang.reflect.InvocationTargetException;
import com.twitter.util.h;
import com.twitter.library.api.TwitterTopic$TwitterList;
import com.twitter.library.api.TwitterTopic$Metadata;
import com.twitter.library.api.TwitterTopic$Data;
import com.twitter.library.api.ReferralCampaign;
import com.twitter.library.api.Prompt;
import android.database.sqlite.SQLiteException;
import java.io.File;
import com.twitter.errorreporter.a;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.twitter.library.api.conversations.DMResponseSource;
import com.twitter.library.api.conversations.s;
import com.twitter.library.api.conversations.y;
import com.twitter.library.api.conversations.q;
import com.twitter.library.api.z;
import android.content.ContentUris;
import com.twitter.library.api.Entity;
import com.twitter.library.api.TwitterUserMetadata;
import com.twitter.library.util.bm;
import java.util.Set;
import com.twitter.library.api.PromotedContent;
import com.twitter.errorreporter.ErrorReporter;
import java.util.LinkedHashMap;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.io.Serializable;
import com.twitter.library.api.search.m;
import android.text.TextUtils;
import com.twitter.library.api.Conversation$Participant;
import com.twitter.library.api.Conversation$Metadata;
import com.twitter.library.api.Conversation;
import com.twitter.library.api.bo;
import com.twitter.library.api.TwitterSocialProof;
import com.twitter.library.api.ExtendedProfile;
import com.twitter.internal.util.Optional;
import com.twitter.library.api.TweetEntities;
import java.util.LinkedList;
import android.util.Pair;
import android.database.MergeCursor;
import com.twitter.library.api.ab;
import com.twitter.library.api.TwitterTopic;
import java.util.Map;
import com.twitter.library.api.search.TwitterTypeAhead;
import java.util.List;
import com.twitter.library.util.al;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.util.f;
import com.twitter.library.api.bp;
import android.database.Cursor;
import com.twitter.util.collection.CollectionUtils;
import java.util.HashSet;
import com.twitter.library.api.at;
import android.content.ContentValues;
import java.util.Collection;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.ArrayList;
import android.content.Context;
import java.util.HashMap;
import android.net.Uri;

public class bg extends sh
{
    private static final boolean b;
    private static final int[] c;
    private static final Uri[] d;
    private static final Uri[] e;
    private static final HashMap f;
    private final Context g;
    private final long h;
    private final ArrayList i;
    
    static {
        b = (App.l() && Log.isLoggable("DatabaseHelper", 3));
        c = new int[] { 10, 6, 11, 12, 20 };
        d = new Uri[] { az.a, ay.a, aw.a, af.a };
        e = new Uri[] { bc.a, ao.a, ba.a, ba.b };
        f = new HashMap();
    }
    
    private bg(final Context g, final String s, final long h) {
        super(g, s, null, 24);
        this.i = new ArrayList();
        this.g = g;
        this.h = h;
    }
    
    private static int a(final long n, final ArrayList list) {
        if (list != null) {
            final Iterator<Long> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (n == iterator.next()) {
                    list.remove(n);
                    return 1;
                }
            }
        }
        return 0;
    }
    
    static int a(final SQLiteDatabase sqLiteDatabase, final long n, final int n2, final Collection collection, final long n3) {
        int n4;
        if (!collection.isEmpty()) {
            final ContentValues contentValues = new ContentValues(2);
            final String[] array = { String.valueOf(n), String.valueOf(n2), null };
            contentValues.put("timeline_group_id", n3);
            final Iterator<at> iterator = collection.iterator();
            n4 = 0;
            while (iterator.hasNext()) {
                final at at = iterator.next();
                array[2] = String.valueOf(at.a());
                if (at.d > 0L) {
                    contentValues.put("sort_index", at.d);
                }
                else {
                    contentValues.remove("sort_index");
                }
                n4 += sqLiteDatabase.update("timeline", contentValues, "owner_id=? AND type=? AND entity_id=?", array);
            }
        }
        else {
            n4 = 0;
        }
        return n4;
    }
    
    private int a(final SQLiteDatabase sqLiteDatabase, final long n, final int n2, final HashSet set) {
        if (set.isEmpty()) {
            return 0;
        }
        sqLiteDatabase.beginTransaction();
        int n3 = 0;
        Label_0243: {
            Cursor query;
            ArrayList<Long> list;
            try {
                query = sqLiteDatabase.query("timeline", new String[] { "data_id", "entity_id" }, "owner_id=? AND type=? AND data_type=1 AND flags&8=8", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, (String)null);
                n3 = 0;
                if (query == null) {
                    break Label_0243;
                }
                list = new ArrayList<Long>();
                try {
                    while (query.moveToNext()) {
                        if (set.contains(query.getLong(0))) {
                            list.add(query.getLong(1));
                        }
                    }
                }
                finally {
                    query.close();
                }
            }
            finally {
                sqLiteDatabase.endTransaction();
            }
            query.close();
            final Iterator<Long> iterator = list.iterator();
            while (iterator.hasNext()) {
                n3 += sqLiteDatabase.delete("timeline", "owner_id=? AND type=? AND entity_id=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(iterator.next()) });
            }
        }
        final int n4 = n3 + this.a(sqLiteDatabase, "timeline", "data_type=1 AND data_id=? AND flags&1=1 AND owner_id=" + n + " AND " + "type" + '=' + n2, CollectionUtils.c(set));
        sqLiteDatabase.setTransactionSuccessful();
        sqLiteDatabase.endTransaction();
        return n4;
    }
    
    private static int a(final SQLiteDatabase sqLiteDatabase, final bp bp, final long n, final int n2, final long n3) {
        while (true) {
            int n4 = 1;
            sqLiteDatabase.beginTransaction();
            while (true) {
                int update;
                try {
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put("owner_id", n);
                    contentValues.put("status_group", n2);
                    contentValues.put("status_group_tag", n3);
                    final long a = bp.a();
                    contentValues.put("status_id", a);
                    if (bp.F != null) {
                        a(contentValues, bp.F);
                    }
                    contentValues.put("scribe_component", bp.H);
                    if (bp.I != null && !bp.I.isEmpty()) {
                        contentValues.put("scribe_data", com.twitter.util.f.a(bp.I));
                    }
                    update = sqLiteDatabase.update("status_metadata", contentValues, "status_id=? AND status_group=? AND status_group_tag=?", new String[] { String.valueOf(a), String.valueOf(n2), String.valueOf(n3) });
                    if (update == 0 && sqLiteDatabase.insert("status_metadata", "status_id", contentValues) > 0L) {
                        sqLiteDatabase.setTransactionSuccessful();
                        return n4;
                    }
                }
                finally {
                    sqLiteDatabase.endTransaction();
                }
                n4 = update;
                continue;
            }
        }
    }
    
    private int a(final SQLiteDatabase sqLiteDatabase, final String s, final String s2, final int[] array) {
        int i = 0;
        sqLiteDatabase.beginTransaction();
        try {
            final String[] array2 = { null };
            final int length = array.length;
            int n = 0;
            while (i < length) {
                array2[0] = String.valueOf((long)array[i]);
                n += sqLiteDatabase.delete(s, s2, array2);
                ++i;
            }
            sqLiteDatabase.setTransactionSuccessful();
            return n;
        }
        finally {
            sqLiteDatabase.endTransaction();
        }
    }
    
    private int a(final SQLiteDatabase sqLiteDatabase, final String s, final String s2, final long[] array) {
        int i = 0;
        sqLiteDatabase.beginTransaction();
        try {
            final String[] array2 = { null };
            final int length = array.length;
            int n = 0;
            while (i < length) {
                array2[0] = String.valueOf(array[i]);
                n += sqLiteDatabase.delete(s, s2, array2);
                ++i;
            }
            sqLiteDatabase.setTransactionSuccessful();
            return n;
        }
        finally {
            sqLiteDatabase.endTransaction();
        }
    }
    
    private int a(final SQLiteDatabase sqLiteDatabase, final String s, final String[] array) {
        final Cursor query = sqLiteDatabase.query("statuses", cl.a, s, array, (String)null, (String)null, (String)null);
        if (query != null) {
            sqLiteDatabase.beginTransaction();
            int n = 0;
            try {
                while (query.moveToNext()) {
                    final ContentValues contentValues = new ContentValues();
                    final long long1 = query.getLong(0);
                    final long long2 = query.getLong(4);
                    contentValues.put("in_r_status_id", "-1");
                    contentValues.put("in_r_user_id", "-1");
                    contentValues.put("flags", long2 | 0x100L);
                    final int n2 = n + sqLiteDatabase.update("statuses", contentValues, "_id=?", new String[] { String.valueOf(long1) });
                    final long long3 = query.getLong(1);
                    final long long4 = query.getLong(2);
                    final long long5 = query.getLong(3);
                    contentValues.clear();
                    contentValues.put("in_r_status_id", String.valueOf(long4));
                    contentValues.put("in_r_user_id", String.valueOf(long5));
                    n = n2 + sqLiteDatabase.update("statuses", contentValues, "in_r_status_id=?", new String[] { String.valueOf(long3) });
                }
                sqLiteDatabase.setTransactionSuccessful();
                return n;
            }
            finally {
                query.close();
                sqLiteDatabase.endTransaction();
            }
        }
        return 0;
    }
    
    private static int a(final TwitterStatusCard twitterStatusCard) {
        int n = 4;
        if (twitterStatusCard != null) {
            final CardInstanceData cardInstanceData = twitterStatusCard.cardInstanceData;
            if (cardInstanceData != null) {
                final String name = cardInstanceData.name;
                if ("photo".equalsIgnoreCase(name) || "gallery".equalsIgnoreCase(name)) {
                    n = 1;
                }
                else if (!"player".equalsIgnoreCase(name) && !"amplify".equalsIgnoreCase(name) && !"animated_gif".equalsIgnoreCase(name)) {
                    if ("promotion".equalsIgnoreCase(name)) {
                        return 32;
                    }
                    if ("summary".equalsIgnoreCase(name) || "summary_large_image".equalsIgnoreCase(name)) {
                        return 8;
                    }
                    return 8;
                }
            }
            else {
                if (twitterStatusCard.classicCard == null) {
                    return 0;
                }
                final TweetClassicCard classicCard = twitterStatusCard.classicCard;
                if (classicCard.type == 1) {
                    return 1;
                }
                if (classicCard.type != 2) {
                    return 8;
                }
            }
            return n;
        }
        return 0;
    }
    
    public static int a(final TwitterUser twitterUser) {
        int flags = twitterUser.flags;
        if (twitterUser.verified) {
            flags |= 0x2;
        }
        if (twitterUser.isProtected) {
            flags |= 0x1;
        }
        if (twitterUser.isTranslator) {
            flags |= 0x4;
        }
        if (twitterUser.isLifelineInstitution) {
            flags |= 0x8;
        }
        if (twitterUser.isGeoEnabled) {
            flags |= 0x10;
        }
        if (twitterUser.hasEmptyExtendedProfile) {
            flags |= 0x200;
        }
        if (twitterUser.hasCollections) {
            flags |= 0x20;
        }
        return flags;
    }
    
    private static int a(final bh bh, final com.twitter.library.api.az az, final int n) {
        int n2 = 1;
        if (bh != null && az != null && bh.b == az.a) {
            if (af.a(n)) {
                switch (bh.b) {
                    default: {
                        return 0;
                    }
                    case 1:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 16:
                    case 17: {
                        if (bh.j == 2 && bh.j == az.i && bh.l != null && az.k != null) {
                            if (!a(bh.l, az.k)) {
                                n2 = 0;
                            }
                            return n2;
                        }
                        break;
                    }
                    case 4: {
                        if (bh.o == 2 && bh.o == az.n && bh.p != null && az.o != null) {
                            if (!a(bh.p, az.o)) {
                                n2 = 0;
                            }
                            return n2;
                        }
                        break;
                    }
                    case 5: {
                        if (bh.j == n2 && bh.j == az.i && bh.k != null && az.j != null) {
                            if (!b(bh.k, az.j)) {
                                n2 = 0;
                            }
                            return n2;
                        }
                        break;
                    }
                }
            }
            else {
                switch (bh.b) {
                    default: {
                        return 0;
                    }
                    case 1: {
                        if (bh.j != 2 || bh.j != az.i || bh.l == null || az.k == null) {
                            break;
                        }
                        if (a(bh.l, az.k)) {
                            return n2;
                        }
                        if (b(bh.h, az.g)) {
                            return 3;
                        }
                        break;
                    }
                    case 4: {
                        if (bh.o != 2 || bh.o != az.n || bh.p == null || az.o == null) {
                            break;
                        }
                        if (a(bh.p, az.o)) {
                            return n2;
                        }
                        if (b(bh.h, az.g)) {
                            return 4;
                        }
                        break;
                    }
                    case 5: {
                        if (bh.j != n2 || bh.j != az.i || bh.k == null || az.j == null) {
                            break;
                        }
                        if (b(bh.k, az.j)) {
                            return n2;
                        }
                        if (b(bh.h, az.g)) {
                            return 2;
                        }
                        break;
                    }
                }
            }
        }
        return 0;
    }
    
    private int a(final String s, final ContentValues contentValues, final long[] array) {
        int update = 0;
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        Label_0042: {
            if (array != null) {
                break Label_0042;
            }
            try {
                update = writableDatabase.update(s, contentValues, (String)null, (String[])null);
                Label_0029: {
                    writableDatabase.setTransactionSuccessful();
                }
                return update;
                // iftrue(Label_0029:, n >= length)
                while (true) {
                    while (true) {
                        final String[] array2;
                        int n = 0;
                        array2[0] = String.valueOf(array[n]);
                        final int n2 = writableDatabase.update(s, contentValues, "entity_id=?", array2) + update;
                        ++n;
                        update = n2;
                        continue;
                    }
                    final String[] array2 = { null };
                    final int length = array.length;
                    int n = 0;
                    continue;
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    private int a(final String s, final String s2, final String[] array, final boolean b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        Label_0052: {
            if (!b) {
                break Label_0052;
            }
            try {
                int n = this.b(s, array);
                while (true) {
                    final int n2 = n + writableDatabase.delete("status_groups", s2, array);
                    writableDatabase.setTransactionSuccessful();
                    return n2;
                    n = this.a(s, array);
                    continue;
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    private int a(final ArrayList list, final long n, final b b) {
        int n2 = 0;
        SQLiteDatabase writableDatabase = null;
    Label_0245_Outer:
        while (true) {
            n2 = 0;
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
            Label_0069_Outer:
                while (true) {
                    ArrayList<TwitterUser> list2 = null;
                Label_0252:
                    while (true) {
                        try {
                            this.f(1);
                            this.o();
                            list2 = new ArrayList<TwitterUser>();
                            final al al = new al(100, list);
                            if (!al.hasNext()) {
                                break;
                            }
                            list2.clear();
                            final Iterator iterator = al.a().iterator();
                            if (!iterator.hasNext()) {
                                break Label_0252;
                            }
                            final TwitterTypeAhead twitterTypeAhead = iterator.next();
                            if (twitterTypeAhead.d.isEmpty()) {
                                break Label_0069_Outer;
                            }
                            final int c = twitterTypeAhead.c;
                            final long userId = twitterTypeAhead.e.userId;
                            list2.add(twitterTypeAhead.e);
                            final ContentValues contentValues = new ContentValues();
                            final Iterator iterator2 = twitterTypeAhead.d.iterator();
                            while (iterator2.hasNext()) {
                                contentValues.put("text", (String)iterator2.next());
                                contentValues.put("weight", c);
                                contentValues.put("type", 1);
                                contentValues.put("ref_id", userId);
                                writableDatabase.insert("tokens", (String)null, contentValues);
                            }
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                        final int n3 = n2 + 1;
                        n2 = n3;
                        continue Label_0245_Outer;
                    }
                    if (!list2.isEmpty()) {
                        this.a(list2, n, 15, -1L, null, null, true, b);
                        continue Label_0069_Outer;
                    }
                    continue Label_0069_Outer;
                }
                final int n3 = n2;
                continue;
            }
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        return n2;
    }
    
    private int a(final Collection collection, final long n, final int n2, final long n3, final boolean b) {
        final ArrayList<bp> list = new ArrayList<bp>();
        final ArrayList<bp> list2 = new ArrayList<bp>();
        for (final bp bp : collection) {
            if (bp.s != null) {
                list2.add(bp);
            }
            else {
                list.add(bp);
            }
        }
    Label_0227_Outer:
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                int n5 = 0;
            Label_0256:
                while (true) {
                    try {
                        if (!list.isEmpty()) {
                            final int n4 = 0 + this.a(list, n, n2, n3, false, false, false, null, b, null, true).size();
                            if (!list2.isEmpty()) {
                                final ArrayList<bp> list3 = new ArrayList<bp>();
                                final Iterator<bp> iterator2 = list2.iterator();
                                n5 = n4;
                                while (iterator2.hasNext()) {
                                    final bp bp2 = iterator2.next();
                                    list3.clear();
                                    list3.add(bp2);
                                    n5 += this.a(list3, n, n2, bp2.s.hashCode(), false, false, false, null, b, null, true).size();
                                }
                                break Label_0256;
                            }
                            writableDatabase.setTransactionSuccessful();
                            return n4;
                        }
                    }
                    finally {
                        writableDatabase.endTransaction();
                    }
                    final int n4 = 0;
                    continue Label_0227_Outer;
                }
                final int n4 = n5;
                continue;
            }
        }
    }
    
    private long a(final SQLiteDatabase sqLiteDatabase, long max, final long n) {
        final Cursor query = sqLiteDatabase.query("statuses", new String[] { "MAX(status_id)" }, "status_id>" + max + " AND " + "status_id" + '<' + n, (String[])null, (String)null, (String)null, (String)null);
        Label_0103: {
            if (query == null) {
                break Label_0103;
            }
            try {
                if (query.moveToFirst()) {
                    max = Math.max(max, query.getLong(0));
                }
                query.close();
                return 1L + max;
            }
            finally {
                query.close();
            }
        }
    }
    
    private static long a(final xa xa, final Map map) {
        if (xa != null) {
            final xa xa2 = map.get(xa.b);
            if (xa2 != null) {
                return xa2.a;
            }
        }
        return 0L;
    }
    
    private long a(final String[] array, final String s, final String[] array2) {
        final Cursor query = this.getReadableDatabase().query("search_queries", array, s, array2, (String)null, (String)null, (String)null);
        if (query == null) {
            return 0L;
        }
        try {
            if (query.moveToFirst()) {
                return query.getInt(0);
            }
            return 0L;
        }
        finally {
            query.close();
        }
    }
    
    private ContentValues a(final long n, final int n2, final int n3, final int n4, final TwitterTopic twitterTopic, final byte[] array, final boolean b) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("search_id", n);
        contentValues.put("s_type", n3);
        contentValues.put("data_type", n4);
        contentValues.put("type_id", n2);
        int n5;
        if (b) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        contentValues.put("polled", n5);
        contentValues.put("data_id", twitterTopic.a());
        if (array != null) {
            contentValues.put("related_data", array);
        }
        return contentValues;
    }
    
    private ContentValues a(final long n, final int n2, final int n3, final int n4, final TwitterUser twitterUser, final byte[] array, final long n5, final boolean b) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("search_id", n);
        contentValues.put("s_type", n3);
        contentValues.put("data_type", n4);
        contentValues.put("type_id", n2);
        int n6;
        if (b) {
            n6 = 1;
        }
        else {
            n6 = 0;
        }
        contentValues.put("polled", n6);
        contentValues.put("data_id", twitterUser.a());
        if (array != null) {
            contentValues.put("related_data", array);
        }
        contentValues.put("cluster_id", n5);
        return contentValues;
    }
    
    private ContentValues a(final long n, final int n2, final int n3, final int n4, final bp bp, final byte[] array, final long n5, final boolean b) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("search_id", n);
        contentValues.put("s_type", n3);
        contentValues.put("data_type", n4);
        contentValues.put("type_id", n2);
        int n6;
        if (b) {
            n6 = 1;
        }
        else {
            n6 = 0;
        }
        contentValues.put("polled", n6);
        contentValues.put("data_id", bp.a());
        if (array != null) {
            contentValues.put("related_data", array);
        }
        contentValues.put("cluster_id", n5);
        return contentValues;
    }
    
    private ContentValues a(final long n, final int n2, final int n3, final int n4, final byte[] array, final boolean b) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("search_id", n);
        contentValues.put("s_type", n3);
        contentValues.put("data_type", n4);
        int n5;
        if (b) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        contentValues.put("polled", n5);
        contentValues.put("type_id", n2);
        if (array != null) {
            contentValues.put("related_data", array);
        }
        return contentValues;
    }
    
    private static Cursor a(final SQLiteDatabase sqLiteDatabase, final String s, final String[] array, final String s2, final String s3, final String[] array2, final Collection collection, final Map map, final Map map2) {
        final ArrayList<Cursor> list = new ArrayList<Cursor>();
        final Iterator<ab> iterator = collection.iterator();
        final int n = collection.size() / 10;
        if (n > 0) {
            final StringBuilder append = new StringBuilder(s2).append(" IN (?,?,?,?,?,?,?,?,?,?)");
            if (s3 != null) {
                append.append(" AND ").append(s3);
            }
            final String string = append.toString();
            final String[] a = a(10, array2);
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 10; ++j) {
                    final ab ab = iterator.next();
                    a[j] = ab.b();
                    if (map != null) {
                        map.put(ab.a(), ab);
                    }
                    if (map2 != null) {
                        map2.put(ab.b(), ab);
                    }
                }
                final Cursor query = sqLiteDatabase.query(s, array, string, a, (String)null, (String)null, (String)null);
                if (query != null) {
                    list.add(query);
                }
            }
        }
        final StringBuilder append2 = new StringBuilder(s2).append("=?");
        if (s3 != null) {
            append2.append(" AND ").append(s3);
        }
        final String string2 = append2.toString();
        final String[] a2 = a(1, array2);
        while (iterator.hasNext()) {
            final ab ab2 = iterator.next();
            a2[0] = ab2.b();
            if (map != null) {
                map.put(ab2.a(), ab2);
            }
            if (map2 != null) {
                map2.put(ab2.b(), ab2);
            }
            final Cursor query2 = sqLiteDatabase.query(s, array, string2, a2, (String)null, (String)null, (String)null);
            if (query2 != null) {
                list.add(query2);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (Cursor)new MergeCursor((Cursor[])list.toArray(new Cursor[list.size()]));
    }
    
    private Pair a(final SQLiteDatabase sqLiteDatabase, final long n, final long n2, final long n3, final long n4) {
        long n5 = -1L;
        final Cursor query = sqLiteDatabase.query("status_groups_view", new String[] { "sender_id", "ref_id", "updated_at" }, "owner_id=? AND type=? AND g_status_id=?", new String[] { String.valueOf(n), String.valueOf(7), String.valueOf(n2) }, (String)null, (String)null, (String)null);
        Label_0181: {
            if (query == null) {
                final ContentValues contentValues = null;
                break Label_0181;
            }
            while (true) {
                while (true) {
                    try {
                        if (query.moveToFirst()) {
                            final long long1 = query.getLong(0);
                            final ContentValues contentValues2 = new ContentValues(3);
                            contentValues2.put("sender_id", long1);
                            contentValues2.put("ref_id", query.getLong(1));
                            contentValues2.put("updated_at", query.getLong(2));
                            query.close();
                            n5 = long1;
                            ContentValues contentValues = contentValues2;
                            if (contentValues == null) {
                                contentValues = new ContentValues(3);
                                contentValues.put("sender_id", n3);
                                contentValues.put("ref_id", n2);
                                contentValues.put("tweet_type", 0);
                            }
                            return new Pair((Object)sqLiteDatabase.update("status_groups", contentValues, "owner_id=? AND sender_id=? AND ref_id=?", new String[] { String.valueOf(n), String.valueOf(n), String.valueOf(n4) }), (Object)n5);
                        }
                    }
                    finally {
                        query.close();
                    }
                    final long long1 = n5;
                    final ContentValues contentValues2 = null;
                    continue;
                }
            }
        }
    }
    
    private static Pair a(final List list, final HashMap hashMap) {
        final LinkedList<at> list2 = new LinkedList<at>();
        final HashSet<bp> set = new HashSet<bp>();
        for (int i = -1 + list.size(); i >= 0; --i) {
            at a = list.get(i);
            if (a.f != null) {
                final bp[] b = a.f.b;
                final bp bp = b[-1 + b.length];
                int j = 0;
                int n = 0;
                boolean b2 = true;
                while (j < b.length) {
                    final bp bp2 = b[j];
                    final Long value = bp2.a();
                    final Integer n2 = hashMap.get(value);
                    if (n2 != null) {
                        if (bb.d(n2)) {
                            b2 = false;
                        }
                        else {
                            n = j + 1;
                        }
                    }
                    Integer n3;
                    if (bp2 == bp) {
                        n3 = 8;
                    }
                    else {
                        n3 = 4;
                    }
                    hashMap.put(value, n3);
                    ++j;
                }
                if (b2 && n > 0 && n < b.length) {
                    a = a(a, n);
                    set.add(a.f.b[0]);
                }
            }
            list2.addFirst(a);
        }
        return new Pair((Object)list2, (Object)set);
    }
    
    public static TwitterUser a(final Cursor cursor) {
        int n = 1;
        final int int1 = cursor.getInt(5);
        final TwitterUser a = new TwitterUser().a(cursor.getLong(n)).a(cursor.getString(2)).e(cursor.getString(3)).b(cursor.getString(4)).g(cursor.getString(19)).c(cursor.getString(8)).d(cursor.getString(10)).a(cursor.getInt(17)).b(cursor.getInt(23)).a(TweetEntities.a(cursor.getBlob(20))).b(TweetEntities.a(cursor.getBlob(21))).b(cursor.getLong(12)).a(false);
        int n2;
        if ((int1 & 0x1) != 0x0) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        final TwitterUser b = a.b(n2 != 0);
        int n3;
        if ((int1 & 0x2) != 0x0) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        final TwitterUser c = b.c(n3 != 0);
        int n4;
        if ((int1 & 0x4) != 0x0) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        final TwitterUser d = c.d(n4 != 0);
        int n5;
        if ((int1 & 0x8) != 0x0) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        final TwitterUser g = d.e(n5 != 0).c(cursor.getInt(9)).d(cursor.getInt(24)).e(cursor.getInt(11)).h(cursor.getInt(16)).f(cursor.getInt(13)).g(cursor.getInt(22));
        int n6;
        if ((int1 & 0x10) != 0x0) {
            n6 = n;
        }
        else {
            n6 = 0;
        }
        final TwitterUser g2 = g.g(n6 != 0);
        int n7;
        if ((int1 & 0x200) != 0x0) {
            n7 = n;
        }
        else {
            n7 = 0;
        }
        final TwitterUser h = g2.f(n7 != 0).f(cursor.getString(6)).a(Optional.c(com.twitter.util.f.a(cursor.getBlob(7)))).a((ExtendedProfile)com.twitter.util.f.a(cursor.getBlob(25))).i(cursor.getInt(14)).c(cursor.getLong(18)).d(cursor.getLong(15)).h(false);
        if ((int1 & 0x20) == 0x0) {
            n = 0;
        }
        return h.i(n != 0).j(int1);
    }
    
    static at a(final at at, final int n) {
        int i = 0;
        final bp[] b = at.f.b;
        final bp[] array = new bp[b.length - n];
        System.arraycopy(b, n, array, 0, array.length);
        final bp bp = array[0];
        final TwitterUser y = b[n - 1].y;
        final long j = bp.i;
        String s = null;
        Label_0071: {
            if (j != y.userId) {
            Label_0233:
                while (true) {
                    if (at.f.a != null && at.f.a.participants != null) {
                        for (Conversation$Participant[] participants = at.f.a.participants; i < participants.length; ++i) {
                            final Conversation$Participant conversation$Participant = participants[i];
                            if (j == conversation$Participant.id) {
                                final String name = conversation$Participant.name;
                                break Label_0233;
                            }
                        }
                    }
                    Label_0261: {
                        break Label_0261;
                        final String name;
                        if (name == null) {
                            s = y.name;
                            break Label_0071;
                        }
                        s = name;
                        break Label_0071;
                    }
                    final String name = null;
                    continue Label_0233;
                }
            }
            s = y.name;
        }
        if (s != null) {
            if (bp.F == null) {
                bp.F = (xb)new xc().f();
            }
            bp.F.f = (TwitterSocialProof)new bo().a(24).a(s).f();
        }
        return new at(at.a, new Conversation(null, array), at.d, at.o);
    }
    
    public static bg a(final Context context, final long n) {
        final String j = j(n, 23);
        synchronized (bg.f) {
            bg bg = com.twitter.library.provider.bg.f.get(j);
            if (bg == null) {
                bg = new bg(context.getApplicationContext(), j, n);
                com.twitter.library.provider.bg.f.put(j, bg);
            }
            return bg;
        }
    }
    
    private static String a(final com.twitter.library.api.az az, final int n) {
        return Long.valueOf(az.c).toString() + '|' + Integer.valueOf(n).toString();
    }
    
    public static String a(final Iterable iterable) {
        return " IN ('" + TextUtils.join((CharSequence)"','", iterable) + "')";
    }
    
    private String a(final String s, final SQLiteDatabase sqLiteDatabase) {
        final Cursor query = sqLiteDatabase.query("conversations", new String[] { "title" }, "conversation_id=?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
        if (query == null) {
            return null;
        }
        try {
            final boolean moveToFirst = query.moveToFirst();
            String string = null;
            if (moveToFirst) {
                string = query.getString(0);
            }
            return string;
        }
        finally {
            query.close();
        }
    }
    
    public static String a(final Object... array) {
        return " IN ('" + TextUtils.join((CharSequence)"','", array) + "')";
    }
    
    private ArrayList a(final long n, int n2, final m m, final Map map, final boolean b, final boolean b2) {
        final int a = m.a;
        if (bg.b) {
            Log.d("DatabaseHelper", "insertSearchResult: type = " + a);
        }
        final ArrayList<ContentValues> list = new ArrayList<ContentValues>();
        switch (a) {
            case 0:
            case 4:
            case 9: {
                final xb f = m.b.F;
                byte[] a2;
                int n3;
                if (f != null) {
                    if (f.c) {
                        n2 = Integer.MIN_VALUE;
                    }
                    if (f.d != null) {
                        a2 = com.twitter.util.f.a(f.d);
                        n3 = n2;
                    }
                    else {
                        n3 = n2;
                        a2 = null;
                    }
                }
                else {
                    n3 = n2;
                    a2 = null;
                }
                long a3;
                if (!b) {
                    a3 = a(m.h, map);
                }
                else {
                    a3 = 0L;
                }
                list.add(this.a(n, n3, a, 1, m.b, a2, a3, b2));
                return list;
            }
            case 1: {
                list.add(this.a(n, n2, a, 2, m.c, null, 0L, b2));
                return list;
            }
            case 7:
            case 10: {
                byte[] a4;
                if (m.i != null) {
                    a4 = com.twitter.util.f.a(m.i);
                }
                else {
                    a4 = null;
                }
                final Iterator iterator = m.d.iterator();
                while (iterator.hasNext()) {
                    list.add(this.a(n, n2, a, 1, iterator.next(), a4, a(m.h, map), b2));
                }
                break;
            }
            case 6: {
                if (!m.g.isEmpty()) {
                    for (final TwitterUser twitterUser : m.g) {
                        list.add(this.a(n, n2, a, 2, twitterUser, com.twitter.util.f.a((twitterUser.metadata != null && twitterUser.metadata.d) || twitterUser.promotedContent != null), a(m.h, map), b2));
                    }
                    break;
                }
                list.add(this.a(n, n2, 8, 0, null, b2));
                return list;
            }
            case 3: {
                final String[] f2 = m.f;
                for (int length = f2.length, i = 0; i < length; ++i) {
                    list.add(this.a(n, n2, a, 0, com.twitter.util.f.a((Serializable)f2[i]), b2));
                }
                break;
            }
            case 2: {
                list.add(this.a(n, n2, a, 0, com.twitter.util.f.a(m.e), b2));
                return list;
            }
            case 12: {
                final byte[] a5 = com.twitter.util.f.a(m.j);
                if (m.j.b()) {
                    final Iterator iterator3 = m.d.iterator();
                    while (iterator3.hasNext()) {
                        list.add(this.a(n, n2, a, 1, iterator3.next(), a5, 0L, b2));
                    }
                    break;
                }
                list.add(this.a(n, n2, a, 0, a5, b2));
                return list;
            }
            case 11: {
                if (m.l != null) {
                    final Iterator iterator4 = m.l.iterator();
                    while (iterator4.hasNext()) {
                        list.add(this.a(n, n2, a, 3, iterator4.next(), null, b2));
                    }
                    break;
                }
                break;
            }
        }
        return list;
    }
    
    private ArrayList a(final ArrayList list, final int n) {
        final ArrayList<com.twitter.library.api.az> list2 = new ArrayList<com.twitter.library.api.az>();
        final ArrayList<Object> list3 = new ArrayList<Object>(list);
        Collections.reverse(list3);
        final HashSet<String> set = new HashSet<String>();
        for (final com.twitter.library.api.az az : list3) {
            if (!set.contains(a(az, n))) {
                set.add(a(az, n));
            }
            else {
                list2.add(az);
            }
        }
        return list2;
    }
    
    public static ArrayList a(final byte[] array) {
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        final int n = array.length / 8;
        final ArrayList list = new ArrayList<Long>(n);
        for (int i = 0; i < n; ++i) {
            list.add(wrap.getLong());
        }
        return list;
    }
    
    private Collection a(final Collection collection, final long n, final int n2, final long n3, final boolean b, final boolean b2, final boolean b3, final String s, final boolean b4) {
        if (bg.b) {
            Log.d("DatabaseHelper", "mergeStatusGroups: " + collection.size() + ", owned by: " + n + ", of type: " + n2 + ", read: " + b + ", last page: " + b2 + ", " + "timeline: " + b4 + ", next: " + s);
        }
        if (n2 == -1 || n < 0L) {
            return Collections.emptySet();
        }
        LinkedHashMap<Object, bp> linkedHashMap;
        SQLiteDatabase writableDatabase;
        Long n4 = null;
        List list = null;
        while (true) {
            linkedHashMap = new LinkedHashMap<Object, bp>();
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                Long w = null;
                List x = null;
                Label_1382: {
                    Label_1374: {
                        bp bp = null;
                        Label_0316: {
                            RuntimeException ex;
                            try {
                                if (collection.isEmpty()) {
                                    if (b2) {
                                        this.d(n, n2, null);
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                    return Collections.emptySet();
                                }
                                n4 = null;
                                list = null;
                                final Iterator<bp> iterator = collection.iterator();
                                if (!iterator.hasNext()) {
                                    break;
                                }
                                bp = iterator.next();
                                final long a = bp.a();
                                linkedHashMap.put(new cj(a, bp.s), bp);
                                if (bp.w == null) {
                                    break Label_1374;
                                }
                                if (n4 == null) {
                                    break Label_0316;
                                }
                                ex = new RuntimeException("A tweet status group should never have multiple previews: " + a);
                                if (App.a()) {
                                    throw ex;
                                }
                            }
                            finally {
                                writableDatabase.endTransaction();
                            }
                            ErrorReporter.a(ex);
                        }
                        w = bp.w;
                        x = bp.x;
                        break Label_1382;
                    }
                    x = list;
                    w = n4;
                }
                list = x;
                n4 = w;
                continue;
            }
        }
        final Cursor a2 = a(writableDatabase, "status_groups", br.a, "g_status_id", "owner_id=? AND type=? AND tag=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3) }, collection, null, null);
        if (a2 == null) {
            writableDatabase.setTransactionSuccessful();
            final Set<Object> emptySet = Collections.emptySet();
            writableDatabase.endTransaction();
            return emptySet;
        }
        int n5 = 0;
    Label_0475_Outer:
        while (true) {
            while (true) {
            Label_1404:
                while (true) {
                    int n7 = 0;
                    Label_1397: {
                        int n6 = 0;
                        Label_1393: {
                            Label_1367: {
                                while (true) {
                                    ContentValues contentValues = null;
                                    bp bp2 = null;
                                    Label_0690: {
                                        try {
                                            contentValues = new ContentValues();
                                            n5 = 0;
                                            if (!a2.moveToNext()) {
                                                break;
                                            }
                                            final long long1 = a2.getLong(0);
                                            if (a2.isNull(2)) {
                                                break Label_1404;
                                            }
                                            final PromotedContent promotedContent = (PromotedContent)com.twitter.util.f.a(a2.getBlob(2));
                                            bp2 = linkedHashMap.remove(new cj(long1, promotedContent));
                                            if (bp2 == null) {
                                                break Label_1367;
                                            }
                                            contentValues.clear();
                                            if (b4) {
                                                contentValues.put("timeline", b4);
                                            }
                                            if (bp2.l != null) {
                                                contentValues.put("tweet_type", 1);
                                            }
                                            else {
                                                if (!bp2.d()) {
                                                    break Label_0690;
                                                }
                                                contentValues.put("tweet_type", 4);
                                            }
                                            contentValues.put("ref_id", bp2.a);
                                            contentValues.put("sender_id", bp2.y.userId);
                                            n6 = n5 + writableDatabase.update("status_groups", contentValues, "_id=?", new String[] { String.valueOf(a2.getLong(1)) });
                                            if (bp2.F != null || bp2.H != null) {
                                                a(writableDatabase, bp2, n, n2, n3);
                                            }
                                            break Label_1393;
                                        }
                                        finally {
                                            a2.close();
                                        }
                                    }
                                    if (bp2.e()) {
                                        contentValues.put("tweet_type", 7);
                                        continue;
                                    }
                                    contentValues.put("tweet_type", 0);
                                    continue;
                                }
                            }
                            n7 = n5;
                            break Label_1397;
                        }
                        n7 = n6;
                    }
                    n5 = n7;
                    continue Label_0475_Outer;
                }
                final PromotedContent promotedContent = null;
                continue;
            }
        }
        a2.close();
        if (bg.b) {
            Log.d("DatabaseHelper", "Updated " + n5 + " status groups.");
        }
        if (linkedHashMap.size() > 0) {
            final ContentValues contentValues2 = new ContentValues();
            final Iterator<bp> iterator2 = linkedHashMap.values().iterator();
            int n8 = 0;
            while (iterator2.hasNext()) {
                final bp bp3 = iterator2.next();
                contentValues2.clear();
                contentValues2.put("owner_id", n);
                contentValues2.put("type", n2);
                contentValues2.put("tag", n3);
                int n9;
                if (b) {
                    n9 = 1;
                }
                else {
                    n9 = 0;
                }
                contentValues2.put("is_read", n9);
                contentValues2.put("timeline", b4);
                contentValues2.put("preview_draft_id", n4);
                if (bp3.l != null) {
                    contentValues2.put("tweet_type", 1);
                }
                else if (bp3.d()) {
                    contentValues2.put("tweet_type", 4);
                }
                else if (bp3.e()) {
                    contentValues2.put("tweet_type", 7);
                }
                else {
                    contentValues2.put("tweet_type", 0);
                }
                contentValues2.put("g_status_id", bp3.a());
                if (list != null && !list.isEmpty()) {
                    contentValues2.put("preview_media", com.twitter.util.f.a(CollectionUtils.b(list)));
                }
                else {
                    contentValues2.putNull("preview_media");
                }
                contentValues2.put("updated_at", bp3.G);
                contentValues2.put("ref_id", bp3.a);
                contentValues2.put("sender_id", bp3.y.userId);
                final PromotedContent s2 = bp3.s;
                int n10 = 0;
                if (s2 != null) {
                    final byte[] a3 = com.twitter.util.f.a(bp3.s);
                    n10 = 0;
                    if (a3 != null) {
                        contentValues2.put("pc", a3);
                        n10 = 1;
                        if (bp3.s.b()) {
                            n10 = 5;
                        }
                        if (bp3.s.a()) {
                            n10 |= 0x2;
                        }
                    }
                }
                if (bp3.F != null && bp3.F.b) {
                    n10 |= 0x8;
                }
                if (n10 != 0) {
                    contentValues2.put("g_flags", n10);
                }
                int n12;
                if (writableDatabase.insert("status_groups", "g_status_id", contentValues2) > 0L) {
                    final int n11 = n8 + 1;
                    if (bp3.F != null || bp3.H != null) {
                        a(writableDatabase, bp3, n, n2, n3);
                    }
                    n12 = n11;
                }
                else {
                    n12 = n8;
                }
                n8 = n12;
            }
            if (bg.b) {
                Log.d("DatabaseHelper", "Inserted new status groups: " + n8);
            }
            if (b3) {
                this.a(n, n2, n3);
            }
        }
        else if (b2) {
            this.d(n, n2, null);
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        return linkedHashMap.values();
    }
    
    private List a(final List list, final List list2) {
        final ArrayList<TwitterTopic> list3 = new ArrayList<TwitterTopic>(list2.size());
        final HashMap<Object, TwitterTopic> hashMap = new HashMap<Object, TwitterTopic>(list.size());
        for (final TwitterTopic twitterTopic : list) {
            hashMap.put(twitterTopic.b(), twitterTopic);
        }
        for (final TwitterTopic twitterTopic2 : list2) {
            final TwitterTopic twitterTopic3 = hashMap.get(twitterTopic2.b());
            if (bm.a(twitterTopic3, twitterTopic2)) {
                list3.add(twitterTopic2);
            }
            else {
                list3.add(twitterTopic3);
            }
        }
        return list3;
    }
    
    private void a(final int n, final b b) {
        final Uri a = ae.a(n);
        if (b == null || a == null) {
            return;
        }
        b.a(a);
    }
    
    private void a(final long n, final int n2, final long[] array, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Marking timeline owned by: " + n + ", of type: " + n2 + " as read.");
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("is_read", 1);
            int update;
            if (array == null) {
                update = writableDatabase.update("timeline", contentValues, "owner_id=? AND type=?", new String[] { String.valueOf(n), String.valueOf(n2) });
            }
            else {
                final int length = array.length;
                update = 0;
                int n3;
                for (int i = 0; i < length; ++i, update = n3) {
                    n3 = writableDatabase.update("timeline", contentValues, "_id=?", new String[] { String.valueOf(array[i]) }) + update;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (update > 0 && b != null) {
                b.a(bc.a);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    private static void a(final ContentValues contentValues, final int n, final bh bh, final com.twitter.library.api.az az) {
        contentValues.put("event", az.a);
        contentValues.put("created_at", az.b);
        contentValues.put("hash", az.hashCode());
        contentValues.put("max_position", az.c);
        contentValues.put("min_position", az.d);
        contentValues.put("source_type", az.f);
        contentValues.put("target_type", az.i);
        contentValues.put("target_object_type", az.n);
        contentValues.put("magic_rec_id", az.q);
        if (bh != null) {
            switch (n) {
                case 1: {
                    final byte[] a = a(c(bh.h, az.g));
                    if (a != null) {
                        contentValues.put("sources_size", bh.f + az.e);
                        contentValues.put("sources", a);
                        break;
                    }
                    break;
                }
                case 2: {
                    final byte[] a2 = a(c(bh.k, az.j));
                    if (a2 != null) {
                        contentValues.put("targets_size", bh.i + az.h);
                        contentValues.put("targets", a2);
                        break;
                    }
                    break;
                }
                case 3: {
                    final byte[] a3 = a(d(bh.l, az.k));
                    if (a3 != null) {
                        contentValues.put("targets_size", bh.i + az.h);
                        contentValues.put("targets", a3);
                        break;
                    }
                    break;
                }
                case 4: {
                    final byte[] a4 = a(d(bh.p, az.o));
                    if (a4 != null) {
                        contentValues.put("target_objects_size", bh.n + az.m);
                        contentValues.put("target_objects", a4);
                        break;
                    }
                    break;
                }
            }
        }
        if (!contentValues.containsKey("sources")) {
            contentValues.put("sources_size", az.e);
            if (az.f == 1) {
                contentValues.put("sources", b(az.g));
            }
            else {
                contentValues.putNull("sources");
            }
        }
        if (!contentValues.containsKey("targets")) {
            contentValues.put("targets_size", az.h);
            switch (az.i) {
                default: {
                    contentValues.putNull("targets");
                    break;
                }
                case 1: {
                    contentValues.put("targets", b(az.j));
                    break;
                }
                case 2: {
                    contentValues.put("targets", c(az.k));
                    break;
                }
                case 3: {
                    contentValues.put("targets", ActivityDataList.a(az.l));
                    break;
                }
            }
        }
        if (!contentValues.containsKey("target_objects")) {
            contentValues.put("target_objects_size", az.m);
            switch (az.n) {
                default: {
                    contentValues.putNull("target_objects");
                    break;
                }
                case 2: {
                    contentValues.put("target_objects", c(az.o));
                }
                case 3: {
                    contentValues.put("target_objects", ActivityDataList.a(az.p));
                }
            }
        }
    }
    
    private static void a(final ContentValues contentValues, final TwitterTopic twitterTopic, final byte[] array, int n, final boolean b) {
        if (b) {
            n |= 0x100000;
        }
        contentValues.put("data_type", 7);
        contentValues.putNull("data_type_group");
        contentValues.putNull("data_type_tag");
        contentValues.put("data_id", twitterTopic.a());
        contentValues.put("data", array);
        contentValues.put("flags", n);
        int n2;
        if (twitterTopic.c()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        contentValues.put("is_read", n2);
    }
    
    public static void a(final ContentValues contentValues, final TwitterUser twitterUser) {
        contentValues.put("user_id", twitterUser.userId);
        if (twitterUser.promotedContent == null) {
            contentValues.putNull("pc");
            contentValues.putNull("g_flags");
            return;
        }
        final byte[] a = com.twitter.util.f.a(twitterUser.promotedContent);
        if (a != null) {
            contentValues.put("pc", a);
            int n = 1;
            if (twitterUser.promotedContent.a()) {
                n = 3;
            }
            contentValues.put("g_flags", n);
            return;
        }
        contentValues.putNull("pc");
        contentValues.putNull("g_flags");
    }
    
    private void a(final ContentValues contentValues, final TwitterUserMetadata twitterUserMetadata) {
        final TwitterSocialProof a = twitterUserMetadata.a;
        if (a != null) {
            contentValues.put("soc_type", a.type);
            contentValues.put("soc_name", a.name);
            contentValues.put("soc_follow_count", a.followCount);
        }
        else {
            contentValues.put("soc_type", -1);
            contentValues.putNull("soc_name");
            contentValues.putNull("soc_follow_count");
        }
        contentValues.put("user_title", twitterUserMetadata.b);
        contentValues.put("token", twitterUserMetadata.c);
    }
    
    private static void a(final ContentValues contentValues, final xa xa) {
        contentValues.put("cl_cluster_id", xa.b);
        contentValues.put("cl_type", xa.c);
        contentValues.put("cl_title", xa.d);
        contentValues.put("cl_subtitle", xa.e);
        contentValues.put("cl_size", xa.f);
        contentValues.put("cl_timestamp", xa.g);
    }
    
    private static void a(final ContentValues contentValues, final xb xb) {
        final TwitterSocialProof f = xb.f;
        if (f != null) {
            contentValues.put("soc_type", f.type);
            contentValues.put("soc_name", f.name);
            contentValues.put("soc_fav_count", f.favoriteCount);
            contentValues.put("soc_rt_count", f.retweetCount);
            contentValues.put("soc_second_name", f.secondName);
            contentValues.put("soc_others_count", f.othersCount);
        }
        if (!CollectionUtils.a((Collection)xb.a)) {
            contentValues.put("highlights", com.twitter.util.f.a(xb.a.toArray(new Entity[xb.a.size()])));
        }
        if (!TextUtils.isEmpty((CharSequence)xb.j) && !TextUtils.isEmpty((CharSequence)xb.i)) {
            contentValues.put("reason_icon_type", xb.j);
            contentValues.put("reason_text", xb.i);
        }
    }
    
    private void a(final Cursor cursor, final int n, final boolean b, final b b2) {
        this.a(cursor, n, b, b2, false, -1L);
    }
    
    private void a(final Cursor cursor, final int n, final boolean b, final b b2, final boolean b3, final long n2) {
        final ArrayList<Long> list = new ArrayList<Long>();
        Label_0452: {
            if (!cursor.moveToFirst()) {
                final int n3 = 0;
                break Label_0452;
            }
        Label_0125_Outer:
            while (true) {
                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                writableDatabase.beginTransaction();
                while (true) {
                    int int1 = 0;
                    int n5 = 0;
                    Label_0618: {
                        try {
                            final ContentValues contentValues = new ContentValues();
                            final long currentTimeMillis = System.currentTimeMillis();
                            int n4 = 0;
                        Label_0125:
                            while (true) {
                                while (true) {
                                    final long long1 = cursor.getLong(0);
                                    int1 = cursor.getInt(1);
                                    if (b) {
                                        break;
                                    }
                                    Label_0540: {
                                        break Label_0540;
                                    Label_0438_Outer:
                                        while (true) {
                                            while (true) {
                                                int max2;
                                                try {
                                                    final Cursor query;
                                                    if (query.moveToFirst()) {
                                                        final ContentValues contentValues2 = new ContentValues(1);
                                                        final int int2 = query.getInt(3);
                                                        int max;
                                                        if (b) {
                                                            max = int2 + 1;
                                                        }
                                                        else {
                                                            max = Math.max(0, int2 - 1);
                                                        }
                                                        contentValues2.put("friends", max);
                                                        writableDatabase.update("users", contentValues2, "user_id=?", new String[] { String.valueOf(n2) });
                                                        list.add(n2);
                                                    }
                                                    query.close();
                                                    writableDatabase.setTransactionSuccessful();
                                                    writableDatabase.endTransaction();
                                                    final int n3 = n4;
                                                    if (n3 > 0 && b2 != null) {
                                                        b2.a(bg.d);
                                                        b2.a(bg.e);
                                                        final Iterator<Object> iterator = list.iterator();
                                                        while (iterator.hasNext()) {
                                                            b2.a(ContentUris.withAppendedId(bf.b, (long)iterator.next()));
                                                        }
                                                        break Label_0452;
                                                    }
                                                    break Label_0452;
                                                    Label_0551: {
                                                        final int int3;
                                                        max2 = Math.max(0, int3 - 1);
                                                    }
                                                    break Label_0125;
                                                    n5 = z.b(int1, n);
                                                }
                                                finally {
                                                    final Cursor query;
                                                    query.close();
                                                }
                                                contentValues.put("followers", max2);
                                                list.add(long1);
                                                Label_0151: {
                                                    contentValues.put("friendship", n5);
                                                }
                                                contentValues.put("friendship_time", currentTimeMillis);
                                                n4 += writableDatabase.update("users", contentValues, "user_id=?", new String[] { String.valueOf(long1) });
                                                if (bg.b) {
                                                    Log.d("DatabaseHelper", "updateFriendship: " + long1 + " friendship now: " + n5);
                                                }
                                                if (cursor.moveToNext()) {
                                                    break;
                                                }
                                                if (!b3 || n2 == -1L || list.isEmpty()) {
                                                    continue Label_0125_Outer;
                                                }
                                                final Cursor query = writableDatabase.query("users", bs.a, "user_id=?", new String[] { String.valueOf(n2) }, (String)null, (String)null, (String)null);
                                                if (query != null) {
                                                    continue Label_0438_Outer;
                                                }
                                                continue Label_0125_Outer;
                                            }
                                        }
                                    }
                                }
                                n5 = z.a(int1, n);
                                break Label_0618;
                                final boolean d = bf.d(cursor.getInt(4));
                                final int int3 = cursor.getInt(2);
                                int max2 = int3 + 1;
                                continue Label_0125;
                            }
                        }
                        // iftrue(Label_0151:, !b3 || n6 == 0 || d)
                        // iftrue(Label_0551:, !b)
                        finally {
                            writableDatabase.endTransaction();
                        }
                        break;
                    }
                    if ((0x1 & (int1 ^ n5)) != 0x0) {
                        final int n6 = 1;
                        continue;
                    }
                    final int n6 = 0;
                    continue;
                }
            }
        }
    }
    
    static void a(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.beginTransaction();
        try {
            sqLiteDatabase.execSQL("DELETE FROM statuses;");
            sqLiteDatabase.execSQL("DELETE FROM timeline");
            sqLiteDatabase.execSQL("DELETE FROM activities;");
            sqLiteDatabase.execSQL("DELETE FROM search_results;");
            sqLiteDatabase.execSQL("DELETE FROM discover;");
            sqLiteDatabase.execSQL("DELETE FROM stories;");
            sqLiteDatabase.execSQL("DELETE FROM cursors WHERE kind IN (4,15,5,6);");
            sqLiteDatabase.execSQL("DELETE FROM status_groups;");
            sqLiteDatabase.setTransactionSuccessful();
        }
        finally {
            sqLiteDatabase.endTransaction();
        }
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final int n) {
        final Cursor query = sqLiteDatabase.query("discover", new String[] { String.valueOf("_id") }, "page> ?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        if (query == null) {
            return;
        }
        sqLiteDatabase.beginTransaction();
        try {
            final String[] array = { null };
            int n2 = 0;
            while (query.moveToNext()) {
                array[0] = String.valueOf(query.getInt(0));
                n2 += sqLiteDatabase.delete("discover", "_id=?", array);
            }
            if (bg.b) {
                Log.d("DatabaseHelper", "deleteOldDiscover: deleted: " + n2);
            }
            sqLiteDatabase.setTransactionSuccessful();
        }
        finally {
            query.close();
            sqLiteDatabase.endTransaction();
        }
    }
    
    static void a(final SQLiteDatabase sqLiteDatabase, final long n) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Recreate conversation data");
        }
        sqLiteDatabase.execSQL("DROP VIEW IF EXISTS dm_inbox");
        sqLiteDatabase.execSQL("DROP VIEW IF EXISTS conversation");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS conversations");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS conversation_entries");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS conversation_participants");
        sqLiteDatabase.execSQL("CREATE TABLE conversations (_id INTEGER PRIMARY KEY,conversation_id TEXT UNIQUE NOT NULL,title TEXT,type INT,sort_event_id BIGINT,last_readable_event_id BIGINT,last_read_event_id BIGINT,sort_timestamp BIGINT,is_muted INT,min_event_id BIGINT,is_hidden INT,has_more INT,read_only INT);");
        sqLiteDatabase.execSQL("CREATE TABLE conversation_participants (_id INTEGER PRIMARY KEY,conversation_id TEXT NOT NULL,user_id TEXT NOT NULL,join_time INT NOT NULL,participant_type INT NOT NULL);");
        sqLiteDatabase.execSQL("CREATE TABLE conversation_entries (_id INTEGER PRIMARY KEY,entry_id INT UNIQUE NOT NULL,sort_entry_id INT UNIQUE NOT NULL,conversation_id TEXT,user_id INT,created INT,entry_type INT,data BLOB,request_id TEXT);");
        sqLiteDatabase.execSQL("CREATE UNIQUE INDEX conversation_index ON conversations (conversation_id);");
        sqLiteDatabase.execSQL("CREATE INDEX conversation_entries_index ON conversation_entries (conversation_id);");
        sqLiteDatabase.execSQL("CREATE INDEX conversation_entries_request_id_index ON conversation_entries (request_id);");
        sqLiteDatabase.execSQL("CREATE UNIQUE INDEX conversation_participants_index ON conversation_participants (conversation_id,user_id);");
        sqLiteDatabase.execSQL("CREATE VIEW dm_inbox AS SELECT conversations._id AS _id,conversations.conversation_id AS conversation_id,conversations.type AS type,conversations.title AS title,conversations.is_muted AS is_muted,conversations.is_hidden AS is_hidden,conversations.sort_event_id AS sort_event_id,conversations.sort_timestamp AS sort_timestamp,conversations.read_only AS read_only,conversations.last_readable_event_id>conversations.last_read_event_id AS is_unread FROM conversation_participants JOIN conversations   ON conversations.conversation_id=conversation_participants.conversation_id AND conversations.is_hidden=0 GROUP BY conversations.conversation_id;");
        sqLiteDatabase.execSQL("CREATE VIEW conversation AS SELECT conversation_entries._id AS _id,conversation_entries.entry_id AS entry_id,conversation_entries.sort_entry_id AS sort_entry_id,conversation_entries.conversation_id AS conversation_id,conversation_entries.created AS created,conversation_entries.user_id AS user_id,conversation_entries.entry_type AS entry_type,conversation_entries.data AS data,users.username AS s_username,users.name AS s_name,users.image_url AS s_profile_image_url FROM conversation_entries LEFT JOIN users ON conversation_entries.user_id=users.user_id;");
        a(sqLiteDatabase, n, 0, 12, 0L);
        a(sqLiteDatabase, n, 0, 13, 0L);
        a(sqLiteDatabase, n, 0, 14, 0L);
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final long n, final int n2) {
        int n3 = 0;
        final String[] array = { String.valueOf(n), String.valueOf(n2) };
        final Cursor query = sqLiteDatabase.query("timeline", new String[] { "COUNT(*)" }, "owner_id=? AND type=?", array, (String)null, (String)null, (String)null);
        Label_0090: {
            if (query == null) {
                final int n4 = 0;
                break Label_0090;
            }
            while (true) {
                while (true) {
                    Label_0348: {
                        int n4;
                        try {
                            if (!query.moveToFirst()) {
                                break Label_0348;
                            }
                            n4 = query.getInt(0) + 0;
                            query.close();
                            if (n4 <= 400) {
                                return;
                            }
                        }
                        finally {
                            query.close();
                        }
                        if (bg.b) {
                            Log.d("DatabaseHelper", "deleteOldTimelineEntries: total count of timeline rows: " + n4);
                        }
                        final Cursor query2 = sqLiteDatabase.query("timeline", new String[] { String.valueOf("_id") }, "owner_id=? AND type=?", array, (String)null, (String)null, "updated_at ASC, _id DESC", String.valueOf(n4 - 100));
                        if (query2 == null) {
                            return;
                        }
                        try {
                            if (!query2.moveToFirst()) {
                                return;
                            }
                            sqLiteDatabase.beginTransaction();
                            try {
                                final String[] array2 = { null };
                                do {
                                    array2[0] = String.valueOf(query2.getLong(0));
                                    n3 += sqLiteDatabase.delete("timeline", "_id=?", array2);
                                } while (query2.moveToNext());
                                if (bg.b) {
                                    Log.d("DatabaseHelper", "deleteOldTimelineEntries: deleted: " + n3);
                                }
                                if (n3 > 0) {
                                    this.a(4, n2, n, 0L, String.valueOf(this.a(n, n2)));
                                }
                                sqLiteDatabase.setTransactionSuccessful();
                                return;
                            }
                            finally {
                                sqLiteDatabase.endTransaction();
                            }
                        }
                        finally {
                            query2.close();
                        }
                    }
                    int n4 = 0;
                    continue;
                }
            }
        }
    }
    
    private static void a(final SQLiteDatabase sqLiteDatabase, final long n, final int n2, final int n3, final long n4) {
        a(sqLiteDatabase, n, n2, n3, l(n4));
    }
    
    private static void a(final SQLiteDatabase sqLiteDatabase, final long n, final int n2, final int n3, final String s) {
        int n4;
        if (s != null) {
            n4 = sqLiteDatabase.delete("cursors", "owner_id=? AND type=? AND kind=? AND ref_id=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3), String.valueOf(s) });
        }
        else {
            n4 = sqLiteDatabase.delete("cursors", "owner_id=? AND type=? AND kind=? AND ref_id IS NULL", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3) });
        }
        if (bg.b && n4 > 0) {
            Log.d("DatabaseHelper", "Invalidated cursor: " + n3);
        }
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final long n, final long n2, final b b) {
        final String value = String.valueOf(n);
        final String value2 = String.valueOf(n2);
        if (bg.b) {
            Log.d("DatabaseHelper", "Removing activity user: " + value2 + ", owned by: " + value);
        }
        final HashSet<Long> set = new HashSet<Long>();
        final Cursor query = sqLiteDatabase.query("user_groups", new String[] { "tag" }, "owner_id=? AND user_id=? AND type IN (8,13)", new String[] { value, value2 }, (String)null, (String)null, (String)null);
        if (query != null) {
            try {
                while (query.moveToNext()) {
                    set.add(query.getLong(0));
                }
            }
            finally {
                query.close();
            }
            query.close();
        }
        final Cursor query2 = sqLiteDatabase.query("status_groups", new String[] { "tag" }, "owner_id=? AND sender_id=? AND type IN (12,14)", new String[] { value, value2 }, (String)null, (String)null, (String)null);
        if (query2 != null) {
            try {
                while (query2.moveToNext()) {
                    set.add(query2.getLong(0));
                }
            }
            finally {
                query2.close();
            }
            query2.close();
        }
        if (set.isEmpty()) {
            if (bg.b) {
                Log.d("DatabaseHelper", "No user or status group activity records associated with " + value2);
            }
        }
        else {
            final HashMap<Long, bh> hashMap = new HashMap<Long, bh>();
            final ArrayList<Long> list = new ArrayList<Long>();
            final String[] array = { null };
            final Iterator<Long> iterator = set.iterator();
            while (iterator.hasNext()) {
                array[0] = iterator.next().toString();
                final Cursor query3 = sqLiteDatabase.query("activities", bi.a, "_id=?", array, (String)null, (String)null, (String)null);
                if (query3 != null) {
                Label_0493_Outer:
                    while (true) {
                    Label_0493:
                        while (true) {
                            Label_1367: {
                                int int1 = 0;
                                int int2 = 0;
                                ArrayList a = null;
                                Label_0490: {
                                    try {
                                        while (query3.moveToNext()) {
                                            int1 = query3.getInt(4);
                                            int2 = query3.getInt(3);
                                            final int n3 = 0;
                                            a = null;
                                            if (int1 == 0) {
                                                break Label_0493;
                                            }
                                            a = a(query3.getBlob(5));
                                            final int a2 = a(n2, a);
                                            if (a2 <= 0) {
                                                break Label_1367;
                                            }
                                            int2 -= a2;
                                            if (int2 > 0) {
                                                break Label_0490;
                                            }
                                            list.add(query3.getLong(0));
                                        }
                                        break;
                                    }
                                    finally {
                                        query3.close();
                                    }
                                }
                                int n3 = 1;
                                final int int3 = query3.getInt(7);
                                int int4 = query3.getInt(6);
                                ArrayList a3 = null;
                                if (int3 != 0) {
                                    a3 = a(query3.getBlob(8));
                                    final int a4 = a(n2, a3);
                                    if (a4 > 0) {
                                        int4 -= a4;
                                        if (int4 <= 0) {
                                            list.add(query3.getLong(0));
                                            continue Label_0493_Outer;
                                        }
                                        n3 = 1;
                                    }
                                    else {
                                        a3 = null;
                                    }
                                }
                                final int int5 = query3.getInt(10);
                                int int6 = query3.getInt(9);
                                while (true) {
                                    Label_1354: {
                                        if (1 != query3.getInt(15)) {
                                            break Label_1354;
                                        }
                                        final int int7 = query3.getInt(1);
                                        ArrayList list2;
                                        int n4;
                                        ArrayList a6;
                                        if (int7 && 2 == int3) {
                                            ArrayList a5 = a(query3.getBlob(8));
                                            final int b2 = this.b(n2, a5);
                                            if (b2 > 0) {
                                                int4 -= b2;
                                                if (int4 <= 0) {
                                                    list.add(query3.getLong(0));
                                                    continue Label_0493_Outer;
                                                }
                                                n3 = 1;
                                            }
                                            else {
                                                a5 = null;
                                            }
                                            list2 = a5;
                                            n4 = int4;
                                            a6 = null;
                                        }
                                        else {
                                            if (4 != int7 || 2 != int5) {
                                                break Label_1354;
                                            }
                                            a6 = a(query3.getBlob(11));
                                            final int b3 = this.b(n2, a6);
                                            if (b3 > 0) {
                                                int6 -= b3;
                                                if (int6 <= 0) {
                                                    list.add(query3.getLong(0));
                                                    continue Label_0493_Outer;
                                                }
                                                n3 = 1;
                                                n4 = int4;
                                                list2 = null;
                                            }
                                            else {
                                                n4 = int4;
                                                list2 = null;
                                                a6 = null;
                                            }
                                        }
                                        if (n3 != 0) {
                                            hashMap.put(query3.getLong(0), new bh(0L, 0, 0L, 0L, 0L, int2, int1, a, n4, int3, a3, list2, null, int6, int5, a6, null));
                                            continue Label_0493_Outer;
                                        }
                                        continue Label_0493_Outer;
                                    }
                                    int n4 = int4;
                                    ArrayList list2 = null;
                                    ArrayList a6 = null;
                                    continue;
                                }
                            }
                            int n3 = 0;
                            ArrayList a = null;
                            continue Label_0493;
                        }
                    }
                    query3.close();
                }
            }
            if (bg.b) {
                Log.d("DatabaseHelper", "Found " + hashMap.size() + " " + list.size() + " activity records associated with " + value2);
            }
            if (!hashMap.isEmpty() || !list.isEmpty()) {
                while (true) {
                    sqLiteDatabase.beginTransaction();
                    while (true) {
                        ContentValues contentValues = null;
                        bh bh = null;
                        Label_1208: {
                            try {
                                contentValues = new ContentValues();
                                for (final Map.Entry<Long, bh> entry : hashMap.entrySet()) {
                                    contentValues.clear();
                                    bh = entry.getValue();
                                    if (bh.h != null) {
                                        final byte[] a7 = a(bh.h);
                                        if (a7 != null) {
                                            contentValues.put("sources_size", bh.f);
                                            contentValues.put("sources", a7);
                                        }
                                    }
                                    if (bh.k == null) {
                                        break Label_1208;
                                    }
                                    final byte[] a8 = a(bh.k);
                                    if (a8 != null) {
                                        contentValues.put("targets_size", bh.i);
                                        contentValues.put("targets", a8);
                                    }
                                    if (bh.p != null) {
                                        final byte[] a9 = a(bh.p);
                                        if (a9 != null) {
                                            contentValues.put("target_objects_size", bh.n);
                                            contentValues.put("target_objects", a9);
                                        }
                                    }
                                    sqLiteDatabase.update("activities", contentValues, "_id=?", new String[] { entry.getKey().toString() });
                                }
                                break;
                            }
                            finally {
                                sqLiteDatabase.endTransaction();
                            }
                        }
                        if (bh.l == null) {
                            continue;
                        }
                        final byte[] a10 = a(bh.l);
                        if (a10 != null) {
                            contentValues.put("targets_size", bh.i);
                            contentValues.put("targets", a10);
                            continue;
                        }
                        continue;
                    }
                }
                final Iterator<Long> iterator3 = list.iterator();
                while (iterator3.hasNext()) {
                    sqLiteDatabase.delete("activities", "_id=?", new String[] { iterator3.next().toString() });
                }
                if (b != null) {
                    b.a(af.a);
                }
                sqLiteDatabase.setTransactionSuccessful();
                sqLiteDatabase.endTransaction();
            }
        }
    }
    
    private static void a(final SQLiteDatabase sqLiteDatabase, final long n, final b b) {
        while (true) {
            sqLiteDatabase.beginTransaction();
            while (true) {
                try {
                    final Cursor query = sqLiteDatabase.query("discover_view", new String[] { "_id" }, "d_type=1 AND sender_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
                    if (query != null) {
                        try {
                            final String[] array = { null };
                            int n2 = 0;
                            while (query.moveToNext()) {
                                array[0] = String.valueOf(query.getInt(0));
                                n2 += sqLiteDatabase.delete("discover", "_id=?", array);
                            }
                            int n3;
                            if (n2 > 0) {
                                n3 = 1;
                            }
                            else {
                                n3 = 0;
                            }
                            query.close();
                            if (sqLiteDatabase.delete("discover", "type=? AND identifier=?", new String[] { String.valueOf(2), String.valueOf(n) }) > 0) {
                                n3 = 1;
                            }
                            sqLiteDatabase.setTransactionSuccessful();
                            sqLiteDatabase.endTransaction();
                            if (n3 != 0 && b != null) {
                                b.a(ao.a);
                            }
                            return;
                        }
                        finally {
                            query.close();
                        }
                    }
                }
                finally {
                    sqLiteDatabase.endTransaction();
                }
                int n3 = 0;
                continue;
            }
        }
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final q q) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Clearing conversation data");
        }
        sqLiteDatabase.delete("conversation_entries", "entry_type!=?", new String[] { String.valueOf(1) });
        if (q == null || q.c().isEmpty()) {
            sqLiteDatabase.delete("conversations", "conversation_id NOT IN (SELECT conversation_id FROM conversation_entries WHERE entry_type=1) AND conversation_id NOT LIKE 'CONV_%'", (String[])null);
        }
        else {
            sqLiteDatabase.delete("conversations", "conversation_id NOT IN (?) AND conversation_id NOT IN (SELECT conversation_id FROM conversation_entries WHERE entry_type=1) AND conversation_id NOT LIKE 'CONV_%'", new String[] { TextUtils.join((CharSequence)",", (Iterable)q.c()) });
        }
        sqLiteDatabase.execSQL("DELETE FROM conversation_participants WHERE conversation_id NOT IN (SELECT conversation_id FROM conversation_entries WHERE entry_type=1) AND conversation_id NOT LIKE 'CONV_%';");
        a(sqLiteDatabase, this.h, 0, 12, 0L);
        a(sqLiteDatabase, this.h, 0, 13, 0L);
        a(sqLiteDatabase, this.h, 0, 14, 0L);
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final y y, final boolean b, final b b2) {
        if (y != null) {
            final HashSet<String> set = new HashSet<String>();
            final List a = y.a();
            final List b3 = y.b();
            final List c = y.c();
            final long f = y.f();
            if (!CollectionUtils.a((Collection)b3)) {
                final Iterator<TwitterUser> iterator = b3.iterator();
                while (iterator.hasNext()) {
                    iterator.next().e();
                }
                this.a(b3, -1L, -1, -1L, null, null, true, b2);
            }
            if (!CollectionUtils.a((Collection)a)) {
                if (bg.b) {
                    Log.d("DatabaseHelper", "Adding conversation entries: " + a.size());
                }
                for (final com.twitter.library.api.conversations.f f2 : a) {
                    f2.a(sqLiteDatabase, this.h, b, true);
                    set.add(f2.conversationId);
                }
            }
            if (!CollectionUtils.a((Collection)c)) {
                if (bg.b) {
                    Log.d("DatabaseHelper", "Adding conversation info: " + c.size());
                }
                for (final s s : c) {
                    this.a(s, true);
                    set.add(s.a);
                }
            }
            if (DMResponseSource.c == y.d() && !CollectionUtils.a((Collection)a)) {
                final com.twitter.library.api.conversations.f f3 = (com.twitter.library.api.conversations.f)CollectionUtils.a(a);
                if (f3 != null) {
                    final ContentValues contentValues = new ContentValues(1);
                    contentValues.put("min_event_id", y.e());
                    sqLiteDatabase.update("conversations", contentValues, "conversation_id=? AND (min_event_id < 0  OR min_event_id > ?)", new String[] { f3.conversationId, String.valueOf(y.e()) });
                }
            }
            if (f > 0L) {
                this.a(14, 0, this.h, "server", String.valueOf(f), b2);
            }
            if (!CollectionUtils.a((Collection)a) || !CollectionUtils.a((Collection)b3) || !CollectionUtils.a((Collection)c)) {
                this.a(set, b2);
            }
        }
    }
    
    private void a(final SQLiteDatabase sqLiteDatabase, final String s, final long n, final int n2) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("list_mapping_list_id", s);
        contentValues.put("list_mapping_user_id", n);
        contentValues.put("list_mapping_type", n2);
        contentValues.put("list_is_last", false);
        sqLiteDatabase.replace("list_mapping", (String)null, contentValues);
    }
    
    private void a(final SQLiteDatabaseCorruptException ex) {
        final a a = new a(this.h);
        while (true) {
            try {
                this.close();
                final String path = this.g.getDatabasePath(this.getDatabaseName()).getPath();
                a.a("path", path).a("deleted", new File(path).delete()).a((Throwable)ex);
                ErrorReporter.a(a);
            }
            catch (SQLiteException ex2) {
                continue;
            }
            break;
        }
    }
    
    private static void a(final Prompt prompt, int n, final ContentValues contentValues) {
        contentValues.put("data_type", 6);
        contentValues.putNull("data_type_group");
        contentValues.putNull("data_type_tag");
        contentValues.put("data_id", prompt.b);
        if (prompt.g()) {
            n |= 0x800000;
        }
        contentValues.put("flags", n);
    }
    
    private void a(final Prompt prompt, final ContentValues contentValues) {
        contentValues.put("p_id", prompt.b);
        contentValues.put("p_format", prompt.c);
        contentValues.put("p_template", prompt.m);
        contentValues.put("p_header", prompt.d);
        contentValues.put("p_text", prompt.a);
        contentValues.put("p_action_text", prompt.e);
        contentValues.put("p_action_url", prompt.f);
        contentValues.put("p_icon", prompt.h);
        contentValues.put("p_background_image_url", prompt.j);
        contentValues.put("p_persistence", prompt.i);
        contentValues.put("p_status_id", prompt.n);
        contentValues.put("p_insertion_index", prompt.o);
        contentValues.put("p_trigger", prompt.g);
        final TweetEntities k = prompt.k;
        if (k != null) {
            contentValues.put("p_entities", k.a());
        }
        final TweetEntities l = prompt.l;
        if (l != null) {
            contentValues.put("p_header_entities", l.a());
        }
    }
    
    private static void a(final ReferralCampaign referralCampaign, final ContentValues contentValues) {
        contentValues.put("id", referralCampaign.c());
        contentValues.put("list_id", referralCampaign.f());
        contentValues.put("promoted_account_id", referralCampaign.d());
        contentValues.put("protocol_handling_flow", referralCampaign.e());
        contentValues.put("country_override", referralCampaign.g());
    }
    
    private static void a(final TwitterTopic twitterTopic, final ContentValues contentValues) {
        final TwitterTopic$Metadata d = twitterTopic.d();
        contentValues.put("ev_id", d.id);
        contentValues.put("ev_type", d.type);
        contentValues.put("ev_title", twitterTopic.e());
        contentValues.put("ev_subtitle", twitterTopic.g());
        contentValues.put("ev_query", twitterTopic.f());
        contentValues.put("ev_seed_hashtag", twitterTopic.h());
        contentValues.put("ev_view_url", twitterTopic.k());
        contentValues.put("ev_status", twitterTopic.l());
        contentValues.put("ev_image_url", twitterTopic.i());
        contentValues.put("ev_explanation", twitterTopic.j());
        contentValues.put("ev_tweet_count", twitterTopic.m());
        contentValues.put("ev_start_time", twitterTopic.n());
        contentValues.put("ev_owner_id", twitterTopic.o());
        if (twitterTopic.q() != null) {
            contentValues.put("ev_pc", com.twitter.util.f.a(twitterTopic.q()));
        }
        final TwitterTopic$Data a = twitterTopic.a(TwitterTopic$Data.class);
        if (a != null) {
            contentValues.put("ev_content", com.twitter.util.f.a(a));
        }
    }
    
    private static void a(final TwitterTopic twitterTopic, final byte[] array) {
        if (twitterTopic.d().type == 4) {
            final TwitterTopic$TwitterList list = (TwitterTopic$TwitterList)twitterTopic.a(TwitterTopic$TwitterList.class);
            list.mostRecentTweetTimestampMillis = Math.max(list.mostRecentTweetTimestampMillis, ((TwitterTopic$TwitterList)com.twitter.util.f.a(array)).mostRecentTweetTimestampMillis);
        }
    }
    
    private static void a(final TwitterTopic twitterTopic, final byte[] array, int n, final ContentValues contentValues, final boolean b) {
        if (b) {
            n |= 0x100000;
        }
        contentValues.put("data_type", 3);
        contentValues.putNull("data_type_group");
        contentValues.putNull("data_type_tag");
        contentValues.put("data_id", twitterTopic.a());
        contentValues.put("data", array);
        contentValues.put("flags", n);
        int n2;
        if (twitterTopic.c()) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        contentValues.put("is_read", n2);
    }
    
    private static void a(final TwitterUser twitterUser, final int n, final byte[] array, int n2, final ContentValues contentValues, final boolean b) {
        if (b) {
            n2 |= 0x100000;
        }
        contentValues.put("data_type", 8);
        contentValues.put("data_type_group", n);
        if (twitterUser.promotedContent != null) {
            contentValues.put("data_type_tag", twitterUser.promotedContent.hashCode());
        }
        else {
            contentValues.put("data_type_tag", -1);
        }
        contentValues.put("data_id", twitterUser.a());
        contentValues.put("data", array);
        contentValues.put("flags", n2);
    }
    
    public static void a(final TwitterUser twitterUser, final ContentValues contentValues, final int n, final boolean b) {
        contentValues.put("user_id", twitterUser.userId);
        contentValues.put("username", twitterUser.username);
        contentValues.put("name", twitterUser.name);
        contentValues.put("location", twitterUser.location);
        if (twitterUser.structuredLocation != null) {
            contentValues.put("structured_location", com.twitter.util.f.a(Optional.b(twitterUser.structuredLocation)));
        }
        if (twitterUser.hasEmptyExtendedProfile) {
            contentValues.put("extended_profile_fields", h.a);
        }
        else if (twitterUser.extendedProfile != null) {
            contentValues.put("extended_profile_fields", com.twitter.util.f.a(twitterUser.extendedProfile));
        }
        contentValues.put("user_flags", a(twitterUser));
        contentValues.put("image_url", twitterUser.profileImageUrl);
        contentValues.put("updated", System.currentTimeMillis());
        if (b) {
            contentValues.put("friendship", twitterUser.friendship);
        }
        if (15 != n) {
            contentValues.put("header_url", twitterUser.profileHeaderImageUrl);
            contentValues.put("description", twitterUser.profileDescription);
            contentValues.put("web_url", twitterUser.profileUrl);
            contentValues.put("bg_color", twitterUser.profileBgColor);
            contentValues.put("link_color", twitterUser.profileLinkColor);
            contentValues.put("profile_created", twitterUser.createdAt);
            contentValues.put("followers", twitterUser.followersCount);
            contentValues.put("fast_followers", twitterUser.fastfollowersCount);
            contentValues.put("friends", twitterUser.friendsCount);
            contentValues.put("statuses", twitterUser.statusesCount);
            contentValues.put("media_count", twitterUser.mediaCount);
            contentValues.put("hash", twitterUser.hashCode());
            contentValues.put("favorites", twitterUser.favoritesCount);
            if (twitterUser.descriptionEntities == null) {
                contentValues.putNull("description_entities");
            }
            else {
                contentValues.put("description_entities", twitterUser.descriptionEntities.a());
            }
            if (twitterUser.urlEntities != null) {
                contentValues.put("url_entities", twitterUser.urlEntities.a());
                return;
            }
            contentValues.putNull("url_entities");
        }
    }
    
    private static void a(final bp bp, final int n, final byte[] array, int n2, final ContentValues contentValues, final boolean b) {
        if (b) {
            n2 |= 0x100000;
        }
        contentValues.put("data_type", 1);
        contentValues.put("data_type_group", n);
        if (bp.s != null) {
            contentValues.put("data_type_tag", bp.s.hashCode());
        }
        else {
            contentValues.put("data_type_tag", -1);
        }
        contentValues.put("data_id", bp.a());
        contentValues.put("data", array);
        contentValues.put("flags", n2);
    }
    
    private void a(final m m, final ArrayList list, final ArrayList list2, final ArrayList list3, final HashMap hashMap, final boolean b) {
        final int a = m.a;
        if (bg.b) {
            Log.d("DatabaseHelper", "extractSearchResultObjects: type = " + a);
        }
        switch (a) {
            case 0:
            case 4:
            case 9: {
                list.add(m.b);
                if (b) {
                    break;
                }
                final xa h = m.h;
                if (h != null) {
                    hashMap.put(h.b, h);
                    return;
                }
                break;
            }
            case 1: {
                list2.add(m.c);
            }
            case 7:
            case 10:
            case 12: {
                if (m.d != null) {
                    list.addAll(m.d);
                }
                final xa h2 = m.h;
                if (h2 != null) {
                    hashMap.put(h2.b, h2);
                    return;
                }
                break;
            }
            case 6: {
                list2.addAll(m.g);
                final xa h3 = m.h;
                if (h3 != null) {
                    hashMap.put(h3.b, h3);
                    return;
                }
                break;
            }
            case 11: {
                if (m.l != null) {
                    list3.addAll(m.l);
                    final Iterator<TwitterTopic> iterator = m.l.iterator();
                    while (iterator.hasNext()) {
                        final TwitterUser p6 = iterator.next().p();
                        if (p6 != null) {
                            list2.add(p6);
                        }
                    }
                    break;
                }
                break;
            }
        }
    }
    
    static void a(final TwitterDatabaseHelperMigration twitterDatabaseHelperMigration, int i, final int n) {
        while (i < n) {
            ++i;
            try {
                TwitterDatabaseHelperMigration.class.getDeclaredMethod("upgradeToVersion" + i, (Class<?>[])new Class[0]).invoke(twitterDatabaseHelperMigration, new Object[0]);
                continue;
            }
            catch (NoSuchMethodException ex) {
                throw new IllegalArgumentException(ex);
            }
            catch (InvocationTargetException ex2) {
                throw new IllegalArgumentException(ex2);
            }
            catch (IllegalAccessException ex3) {
                throw new IllegalArgumentException(ex3);
            }
            break;
        }
    }
    
    private void a(final Set set, final b b) {
        if (b != null) {
            b.a(com.twitter.library.provider.al.a);
            b.a(am.a);
            for (final String s : set) {
                b.a(Uri.withAppendedPath(ai.a, s), Uri.withAppendedPath(ak.a, s));
            }
        }
    }
    
    private static void a(final wk wk, final ContentValues contentValues, final String s, final String s2) {
        contentValues.put("country", s);
        contentValues.put("language", s2);
        contentValues.put("news_id", wk.a);
        contentValues.put("title", wk.b);
        contentValues.put("image_url", wk.c);
        contentValues.put("author_name", wk.d);
        contentValues.put("article_description", wk.e);
        contentValues.put("article_url", wk.f);
    }
    
    private void a(final boolean b, final int n, final String s, final long n2, final String s2, final boolean b2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final String s9) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Promoted Content Status: " + b + " Event: " + n + ", impressionId: " + s + ", trendId: " + n2 + " earned:" + b2);
        }
        String[] array;
        String s11;
        if (s == null) {
            array = new String[] { String.valueOf(n), null };
            String s10;
            if (b2) {
                s10 = "1";
            }
            else {
                s10 = "0";
            }
            array[1] = s10;
            s11 = "event=? AND is_earned=?";
        }
        else {
            array = new String[] { s, String.valueOf(n), null };
            String s12;
            if (b2) {
                s12 = "1";
            }
            else {
                s12 = "0";
            }
            array[2] = s12;
            s11 = "impression_id=? AND event=? AND is_earned=?";
        }
        final com.twitter.library.api.al[] e = this.e(s11, array);
        com.twitter.library.api.al al;
        if (e.length > 0) {
            al = e[0];
        }
        else {
            al = null;
        }
        if (b && al == null) {
            return;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        final ContentValues contentValues = new ContentValues();
        Label_0411: {
            if (al != null) {
                break Label_0411;
            }
            while (true) {
                while (true) {
                    try {
                        contentValues.put("impression_id", s);
                        contentValues.put("event", n);
                        int n3;
                        if (b2) {
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        contentValues.put("is_earned", n3);
                        contentValues.put("num_retries", 0);
                        contentValues.put("trend_id", n2);
                        contentValues.put("url", s2);
                        contentValues.put("video_playlist_url", s3);
                        contentValues.put("video_content_uuid", s4);
                        contentValues.put("video_content_type", s5);
                        contentValues.put("video_cta_url", s6);
                        contentValues.put("video_cta_app_id", s7);
                        contentValues.put("video_cta_app_name", s8);
                        contentValues.put("card_event", s9);
                        writableDatabase.insert("promoted_retry", (String)null, contentValues);
                        writableDatabase.setTransactionSuccessful();
                        return;
                        // iftrue(Label_0450:, !b && al.g < 3)
                        writableDatabase.delete("promoted_retry", s11, array);
                        continue;
                    }
                    finally {
                        writableDatabase.endTransaction();
                    }
                    Label_0450: {
                        contentValues.put("num_retries", 1 + al.g);
                    }
                    writableDatabase.update("promoted_retry", contentValues, s11, array);
                    continue;
                }
            }
        }
    }
    
    private static void a(final byte[] array, final byte[] array2, final int n, final ContentValues contentValues) {
        contentValues.put("data_type", 2);
        contentValues.putNull("data_type_group");
        contentValues.putNull("data_type_tag");
        contentValues.put("data_id", 0);
        contentValues.put("data", array);
        contentValues.put("flags", n);
        contentValues.put("scribe_content", array2);
    }
    
    static boolean a(final bp bp, final ContentValues contentValues, final long n) {
        final String b = bp.b;
        if (TextUtils.isEmpty((CharSequence)b) && bp.w == null) {
            return false;
        }
        contentValues.put("status_id", bp.a);
        contentValues.put("author_id", bp.y.userId);
        contentValues.put("source", bp.g);
        contentValues.put("source_url", bp.h);
        contentValues.put("created", bp.f);
        contentValues.put("in_r_status_id", bp.j);
        contentValues.put("in_r_user_id", bp.i);
        contentValues.put("favorited", bp.A);
        contentValues.put("retweeted", bp.z);
        if (bp.t != null) {
            contentValues.put("latitude", bp.t.a());
            contentValues.put("longitude", bp.t.b());
        }
        if (bp.u != null) {
            contentValues.put("place_data", com.twitter.util.f.a(bp.u));
        }
        contentValues.put("retweet_count", bp.m);
        contentValues.put("favorite_count", bp.B);
        if (bp.n > -1) {
            contentValues.put("view_count", bp.n);
        }
        final TwitterStatusCard v = bp.v;
        int n2 = 0;
        if (v != null) {
            n2 = (0x0 | a(v));
            if (v.cardInstanceData != null && v.cardInstanceData.i()) {
                n2 |= 0x1000;
            }
            contentValues.put("cards", com.twitter.util.f.a(v));
        }
        if (bp.e) {
            n2 |= 0x10;
        }
        final TweetEntities c = bp.c;
        contentValues.put("entities", c.a());
        if (c.a(n)) {
            n2 |= 0x2;
        }
        if (c.media.a(MediaEntity$Type.b)) {
            n2 |= 0x1;
        }
        if (c.media.a(MediaEntity$Type.c)) {
            n2 |= 0x200;
        }
        if (c.media.a(MediaEntity$Type.d)) {
            n2 |= 0x400;
        }
        if (bp.p) {
            n2 |= 0x40;
        }
        if (bp.q) {
            n2 |= 0x800;
        }
        if (bp.r) {
            n2 |= 0x80;
        }
        if (bp.E) {
            n2 |= 0x2000;
        }
        contentValues.put("content", b);
        contentValues.put("r_content", bp.d);
        contentValues.put("flags", n2);
        contentValues.put("lang", bp.o);
        if (bp.C != null) {
            contentValues.put("quoted_tweet_data", com.twitter.util.f.a(new QuotedTweetData(bp.C)));
        }
        contentValues.put("quoted_tweet_id", bp.D);
        return true;
    }
    
    private boolean a(final String s, final TweetEntities tweetEntities, final String s2) {
        return s == null || s2 == null || !TweetEntities.a(new StringBuilder(s), tweetEntities).toString().equals(s2.replaceAll("http://", "").replaceAll("https://", "").replaceAll("(?i)www\\.", ""));
    }
    
    private static boolean a(final ArrayList list, final ArrayList list2) {
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (size == 1) {
            return list.get(0) == list2.get(0).a;
        }
        final HashSet<Long> set = new HashSet<Long>();
        final Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        final Iterator<bp> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            if (!set.contains(iterator2.next().a)) {
                return false;
            }
        }
        return true;
    }
    
    public static byte[] a(final ArrayList list) {
        final byte[] array = new byte[8 * list.size()];
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        final Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()) {
            wrap.putLong(iterator.next());
        }
        return array;
    }
    
    public static long[] a(final byte[] array, final int n) {
        int i = 0;
        final int min = Math.min(n, array.length / 8);
        final ByteBuffer wrap = ByteBuffer.wrap(array, 0, min * 8);
        final long[] array2 = new long[min];
        while (i < min) {
            array2[i] = wrap.getLong();
            ++i;
        }
        return array2;
    }
    
    private static String[] a(final int n, final String[] array) {
        int length;
        if (array == null) {
            length = 0;
        }
        else {
            length = array.length;
        }
        final String[] array2 = new String[n + length];
        if (length > 0) {
            System.arraycopy(array, 0, array2, n, length);
        }
        return array2;
    }
    
    private int b(final long n, final ArrayList list) {
        if (list != null) {
            final int size = list.size();
            final ArrayList<Long> list2 = new ArrayList<Long>();
            final Iterator<Long> iterator = list.iterator();
            while (iterator.hasNext()) {
                final bp b = this.b(iterator.next());
                if (b != null && b.y != null && b.y.userId == n) {
                    list2.add(b.a);
                }
            }
            final Iterator<Long> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                list.remove(iterator2.next());
            }
            return size - list.size();
        }
        return 0;
    }
    
    private int b(final String s, final ContentValues contentValues, final long[] array) {
        int update = 0;
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        Label_0042: {
            if (array != null) {
                break Label_0042;
            }
            try {
                update = writableDatabase.update(s, contentValues, (String)null, (String[])null);
                Label_0029: {
                    writableDatabase.setTransactionSuccessful();
                }
                return update;
                while (true) {
                    int n = 0;
                    final String[] array2;
                    Block_3: {
                        break Block_3;
                        array2 = new String[] { null };
                        final int length = array.length;
                        n = 0;
                        continue;
                    }
                    array2[0] = String.valueOf(array[n]);
                    final int n2 = writableDatabase.update(s, contentValues, "_id=?", array2) + update;
                    ++n;
                    update = n2;
                    continue;
                }
            }
            // iftrue(Label_0029:, n >= length)
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    private int b(final String[] array) {
        final Cursor query = this.getReadableDatabase().query("timeline", new String[] { String.valueOf("_id") }, "owner_id=? AND type=? AND data_type=1 AND data_id=?", array, (String)null, (String)null, (String)null);
        if (query != null) {
            try {
                return query.getCount();
            }
            finally {
                query.close();
            }
        }
        return 0;
    }
    
    private long b(final TwitterSearchQuery twitterSearchQuery, final int n) {
        if (twitterSearchQuery != null) {
            if (bg.b) {
                Log.d("DatabaseHelper", "findSearchQuery: " + twitterSearchQuery.a + ", of type: " + n);
            }
            String s;
            String[] array;
            if (twitterSearchQuery.c != null && twitterSearchQuery.d != null) {
                s = "LOWER(query)=LOWER(?) AND LOWER(name)=LOWER(?) AND type=? AND latitude=? AND longitude=?";
                array = new String[] { twitterSearchQuery.b, twitterSearchQuery.a, String.valueOf(n), twitterSearchQuery.c.toString(), twitterSearchQuery.d.toString() };
            }
            else {
                s = "LOWER(query)=LOWER(?) AND LOWER(name)=LOWER(?) AND type=? AND latitude IS NULL AND longitude IS NULL";
                array = new String[] { twitterSearchQuery.b, twitterSearchQuery.a, String.valueOf(n) };
            }
            return this.a(ca.a, s, array);
        }
        return 0L;
    }
    
    private TwitterTopic$TwitterList b(final be be) {
        final TwitterTopic$TwitterList k = this.k(be.a());
        k.followStatus = be.i;
        k.members = be.e;
        k.subscribers = be.f;
        k.mode = be.g;
        return k;
    }
    
    private bp b(final SQLiteDatabase sqLiteDatabase, final long n) {
        final Cursor query = sqLiteDatabase.query("statuses", ce.a, "status_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        Label_0118: {
            if (query == null) {
                break Label_0118;
            }
            try {
                if (!query.moveToFirst()) {
                    return null;
                }
                final TwitterUser a = this.a(query.getLong(1));
                if (a == null) {
                    if (bg.b) {
                        Log.d("DatabaseHelper", "findStatus: User not found: " + query.getLong(1));
                    }
                    return null;
                }
                final boolean null = query.isNull(5);
                Coordinate coordinate = null;
                if (!null) {
                    final boolean null2 = query.isNull(6);
                    coordinate = null;
                    if (!null2) {
                        coordinate = new Coordinate(Double.parseDouble(query.getString(5)), Double.parseDouble(query.getString(6)));
                    }
                }
                return new bq().a(query.getLong(0)).b(query.getLong(2)).b(query.getString(7)).c(query.getString(8)).a(query.getString(3)).c(query.getLong(10)).d(query.getLong(9)).a(query.getInt(18) == 1).b(query.getInt(4) == 1).a(coordinate).a((TwitterPlace)com.twitter.util.f.a(query.getBlob(15))).b(a).a(query.getInt(11)).b(query.getInt(12)).c(query.getInt(14)).d(query.getString(13)).f();
            }
            finally {
                query.close();
            }
        }
    }
    
    private static bh b(final SQLiteDatabase sqLiteDatabase, final int n) {
        final Cursor query = sqLiteDatabase.query("activities", bi.a, "type=?", new String[] { String.valueOf(n) }, (String)null, (String)null, "max_position DESC", "1");
        if (query == null) {
            return null;
        }
        while (true) {
            try {
                if (query.moveToFirst()) {
                    final int int1 = query.getInt(4);
                    ArrayList a;
                    if (int1 != 0) {
                        a = a(query.getBlob(5));
                    }
                    else {
                        a = null;
                    }
                    final int int2 = query.getInt(7);
                    ArrayList a2 = null;
                    ArrayList a3 = null;
                    ArrayList a4 = null;
                    switch (int2) {
                        case 2: {
                            a3 = a(query.getBlob(8));
                            a2 = null;
                            a4 = null;
                            break;
                        }
                        case 1: {
                            a2 = a(query.getBlob(8));
                            a3 = null;
                            a4 = null;
                            break;
                        }
                        case 3: {
                            a4 = ActivityDataList.a(query.getBlob(8));
                            a2 = null;
                            a3 = null;
                            break;
                        }
                    }
                    final int int3 = query.getInt(10);
                    ArrayList a5 = null;
                    ArrayList a6 = null;
                    switch (int3) {
                        case 2: {
                            a5 = a(query.getBlob(11));
                            a6 = null;
                            break;
                        }
                        case 3: {
                            a6 = ActivityDataList.a(query.getBlob(11));
                            a5 = null;
                            break;
                        }
                    }
                    return new bh(query.getLong(0), query.getInt(1), query.getLong(2), query.getLong(12), query.getLong(13), query.getInt(3), int1, a, query.getInt(6), int2, a2, a3, a4, query.getInt(9), int3, a5, a6);
                }
            }
            finally {
                query.close();
            }
            return null;
        }
    }
    
    private void b(final int n, final b b) {
        final long c = this.c(n);
        if (c != 0L) {
            if (bg.b) {
                Log.d("DatabaseHelper", "Tagging the oldest activity of type: " + n + " activity id: " + c);
            }
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("is_last", 0);
                writableDatabase.update("activities", contentValues, "is_last=1", (String[])null);
                contentValues.put("is_last", 1);
                writableDatabase.update("activities", contentValues, "_id=?", new String[] { String.valueOf(c) });
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (b != null) {
                    b.a(af.a);
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    public static void b(final Context context, final long n) {
        final String j = j(n, 23);
        synchronized (bg.f) {
            final bg bg = com.twitter.library.provider.bg.f.remove(j);
            if (bg != null) {
                bg.close();
            }
            if (!context.deleteDatabase(j)) {
                ErrorReporter.a((Throwable)new SQLiteException("Cannot delete: " + j));
            }
        }
    }
    
    private void b(final SQLiteDatabase sqLiteDatabase) {
        int n = 0;
        final String value = String.valueOf(this.h);
        final String string = value + ".db";
        final String string2 = 2L + (45L + this.h) + ".db";
        final String string3 = value + "-";
        final Iterator<String> iterator = Arrays.asList(this.g.databaseList()).iterator();
        int n2 = 0;
        while (true) {
        Label_0480_Outer:
            while (iterator.hasNext()) {
                final String s = iterator.next();
                final int equals = "twitter.db".equals(s) ? 1 : 0;
                String s2;
                if (equals != 0) {
                    s2 = "twitter.db";
                }
                else if (s.equals(string)) {
                    s2 = string;
                }
                else {
                    if (!s.equals(string2)) {
                        while (true) {
                            Label_0535: {
                                if (!s.startsWith(string3) || s.contains("drafts") || s.contains("scribe.db")) {
                                    break Label_0535;
                                }
                                final int int1 = Integer.parseInt(s.substring(1 + s.indexOf("-"), s.indexOf(46)));
                                if (int1 <= n2 || int1 >= 23) {
                                    break Label_0535;
                                }
                                n2 = int1;
                                n = equals;
                                continue Label_0480_Outer;
                            }
                            final int int1 = n2;
                            continue;
                        }
                    }
                    s2 = string2;
                }
                String j;
                if (s2 == null && n2 > 0 && n2 < 23) {
                    j = j(this.h, n2);
                }
                else {
                    j = s2;
                }
                if (j != null) {
                    SQLiteDatabase openDatabase = null;
                    Label_0507: {
                        try {
                            openDatabase = SQLiteDatabase.openDatabase(this.g.getDatabasePath(j).getAbsolutePath(), (SQLiteDatabase$CursorFactory)null, 1);
                            if (equals == 0) {
                                break Label_0507;
                            }
                            try {
                                final SQLiteDatabase writableDatabase = k.a(this.g).getWritableDatabase();
                                final Cursor query = openDatabase.query("user_values", new String[] { "name", "value" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
                                if (query == null) {
                                    break Label_0507;
                                }
                                writableDatabase.beginTransaction();
                                try {
                                    while (query.moveToNext()) {
                                        final ContentValues contentValues = new ContentValues(2);
                                        contentValues.put("name", query.getString(0));
                                        contentValues.put("value", query.getString(1));
                                        writableDatabase.insert("user_values", "name", contentValues);
                                    }
                                }
                                finally {
                                    query.close();
                                    writableDatabase.endTransaction();
                                }
                            }
                            finally {
                                if (openDatabase != null) {
                                    openDatabase.close();
                                }
                                this.g.deleteDatabase(j);
                            }
                        }
                        catch (SQLiteException ex) {}
                        return;
                        SQLiteDatabase writableDatabase = null;
                        writableDatabase.setTransactionSuccessful();
                        Cursor query = null;
                        query.close();
                        writableDatabase.endTransaction();
                    }
                    if (openDatabase != null) {
                        openDatabase.close();
                    }
                    this.g.deleteDatabase(j);
                }
                return;
            }
            final int equals = n;
            String s2 = null;
            continue;
        }
    }
    
    private void b(final SQLiteDatabase sqLiteDatabase, String s, final long n, final int n2) {
        if (s == null) {
            s = "*";
        }
        String value;
        if (n2 >= 0) {
            value = String.valueOf(n2);
        }
        else {
            value = "*";
        }
        String value2;
        if (n != 0L) {
            value2 = String.valueOf(n);
        }
        else {
            value2 = "*";
        }
        sqLiteDatabase.delete("list_mapping", "list_mapping_list_id=? AND list_mapping_type=? AND list_mapping_user_id=?", new String[] { s, value, value2 });
    }
    
    private static void b(final SQLiteDatabase sqLiteDatabase, final HashMap hashMap) {
        final String s = hashMap.remove("status_groups_view");
        if (s != null) {
            sqLiteDatabase.execSQL("DROP VIEW IF EXISTS status_groups_view");
            sqLiteDatabase.execSQL(s);
        }
        for (final Map.Entry<K, String> entry : hashMap.entrySet()) {
            sqLiteDatabase.execSQL("DROP VIEW IF EXISTS " + (String)entry.getKey());
            sqLiteDatabase.execSQL((String)entry.getValue());
        }
    }
    
    private static boolean b(final ArrayList list, final ArrayList list2) {
        final int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (size == 1) {
            return list.get(0) == list2.get(0).userId;
        }
        final HashSet<Long> set = new HashSet<Long>();
        final Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next());
        }
        final Iterator<TwitterUser> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            if (!set.contains(iterator2.next().userId)) {
                return false;
            }
        }
        return true;
    }
    
    public static byte[] b(final ArrayList list) {
        final byte[] array = new byte[8 * list.size()];
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        final Iterator<TwitterUser> iterator = list.iterator();
        while (iterator.hasNext()) {
            wrap.putLong(iterator.next().userId);
        }
        return array;
    }
    
    private static int c(final long n, final ArrayList list) {
        if (list != null) {
            final int size = list.size();
            final ArrayList<Long> list2 = new ArrayList<Long>();
            for (final Long n2 : list) {
                if (n2 == n) {
                    list2.add(n2);
                }
            }
            final Iterator<Long> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                list.remove(iterator2.next());
            }
            return size - list.size();
        }
        return 0;
    }
    
    private int c(final SQLiteDatabase sqLiteDatabase, final long n) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Removing activity status: " + n);
        }
        final Cursor query = sqLiteDatabase.query("activities", bi.a, "target_type=2 OR target_object_type=2", (String[])null, (String)null, (String)null, (String)null);
        if (query == null) {
            return 0;
        }
        final HashMap<Long, bh> hashMap = new HashMap<Long, bh>();
        final ArrayList<Long> list = new ArrayList<Long>();
        sqLiteDatabase.beginTransaction();
    Label_0202_Outer:
        while (true) {
        Label_0202:
            while (true) {
                Label_0710: {
                    int int1 = 0;
                    int int2 = 0;
                    ArrayList a = null;
                    Label_0199: {
                        try {
                            while (query.moveToNext()) {
                                int1 = query.getInt(7);
                                int2 = query.getInt(6);
                                final int n2 = 0;
                                a = null;
                                if (2 != int1) {
                                    break Label_0202;
                                }
                                a = a(query.getBlob(8));
                                final int c = c(n, a);
                                if (c <= 0) {
                                    break Label_0710;
                                }
                                int2 -= c;
                                if (int2 > 0) {
                                    break Label_0199;
                                }
                                list.add(query.getLong(0));
                            }
                            break;
                        }
                        finally {
                            query.close();
                            sqLiteDatabase.endTransaction();
                        }
                    }
                    int n2 = 1;
                    final int int3 = query.getInt(10);
                    int int4 = query.getInt(9);
                    ArrayList a2 = null;
                    if (2 == int3) {
                        a2 = a(query.getBlob(11));
                        final int c2 = c(n, a2);
                        if (c2 > 0) {
                            int4 -= c2;
                            if (int4 <= 0) {
                                list.add(query.getLong(0));
                                continue Label_0202_Outer;
                            }
                            n2 = 1;
                        }
                        else {
                            a2 = null;
                        }
                    }
                    if (n2 != 0) {
                        hashMap.put(query.getLong(0), new bh(int2, int1, a, int4, int3, a2));
                        continue Label_0202_Outer;
                    }
                    continue Label_0202_Outer;
                }
                int n2 = 0;
                ArrayList a = null;
                continue Label_0202;
            }
        }
        if (bg.b) {
            Log.d("DatabaseHelper", "Found " + hashMap.size() + " " + list.size() + " activity records associated with " + n);
        }
        int n5;
        if (!hashMap.isEmpty() || !list.isEmpty()) {
            final ContentValues contentValues = new ContentValues();
            final Iterator<Map.Entry<Long, bh>> iterator = hashMap.entrySet().iterator();
            int n3 = 0;
            while (iterator.hasNext()) {
                final Map.Entry<Long, bh> entry = iterator.next();
                contentValues.clear();
                final bh bh = entry.getValue();
                if (bh.l != null) {
                    final byte[] a3 = a(bh.l);
                    if (a3 != null) {
                        contentValues.put("targets_size", bh.i);
                        contentValues.put("targets", a3);
                    }
                }
                if (bh.p != null) {
                    final byte[] a4 = a(bh.p);
                    if (a4 != null) {
                        contentValues.put("target_objects_size", bh.n);
                        contentValues.put("target_objects", a4);
                    }
                }
                n3 += sqLiteDatabase.update("activities", contentValues, "_id=?", new String[] { entry.getKey().toString() });
            }
            final Iterator<Long> iterator2 = list.iterator();
            int n4 = n3;
            while (iterator2.hasNext()) {
                n4 += sqLiteDatabase.delete("activities", "_id=?", new String[] { iterator2.next().toString() });
            }
            n5 = n4;
        }
        else {
            n5 = 0;
        }
        sqLiteDatabase.setTransactionSuccessful();
        query.close();
        sqLiteDatabase.endTransaction();
        return n5;
    }
    
    private static ArrayList c(final ArrayList list, final ArrayList list2) {
        final LinkedHashSet<Long> set = new LinkedHashSet<Long>();
        final Iterator<TwitterUser> iterator = list2.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().userId);
        }
        final Iterator<Long> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            set.add(iterator2.next());
        }
        return new ArrayList((Collection<? extends E>)set);
    }
    
    private void c(final long n, final int n2, final b b) {
        final long c = this.c(n, n2);
        if (c != 0L) {
            if (bg.b) {
                Log.d("DatabaseHelper", "Tagging the oldest user of type: " + n2 + " owner id: " + n + " row id: " + c);
            }
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("is_last", 0);
                writableDatabase.update("user_groups", contentValues, "is_last=1", (String[])null);
                contentValues.put("is_last", 1);
                writableDatabase.update("user_groups", contentValues, "_id=?", new String[] { String.valueOf(c) });
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (b != null) {
                    b.a(com.twitter.library.provider.be.a);
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    private void c(final long n, final int n2, final String s) {
        Label_0098: {
            if (TextUtils.isEmpty((CharSequence)s)) {
                break Label_0098;
            }
            String s2 = "is_last=1 AND owner_id=? AND type=? AND timeline_tag=?";
            String[] array = { String.valueOf(n), String.valueOf(n2), s };
            while (true) {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("is_last", 0);
                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.update("timeline", contentValues, s2, array);
                    writableDatabase.setTransactionSuccessful();
                    return;
                    s2 = "is_last=1 AND owner_id=? AND type=?";
                    array = new String[] { String.valueOf(n), String.valueOf(n2) };
                }
                finally {
                    writableDatabase.endTransaction();
                }
            }
        }
    }
    
    private void c(final long p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/twitter/library/provider/bg.b:Z
        //     3: ifeq            42
        //     6: ldc             "DatabaseHelper"
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: ldc_w           "deleteOldSearchResults: owner id: "
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: lload_1        
        //    22: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    25: ldc_w           ", searchId: "
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: lload_3        
        //    32: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    35: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    38: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    41: pop            
        //    42: aload_0        
        //    43: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    46: astore          5
        //    48: aload           5
        //    50: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    53: iconst_1       
        //    54: anewarray       Ljava/lang/String;
        //    57: astore          7
        //    59: aload           7
        //    61: iconst_0       
        //    62: lload_3        
        //    63: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    66: aastore        
        //    67: aload           5
        //    69: ldc_w           "search_results"
        //    72: iconst_1       
        //    73: anewarray       Ljava/lang/String;
        //    76: dup            
        //    77: iconst_0       
        //    78: ldc_w           "COUNT(*)"
        //    81: aastore        
        //    82: ldc_w           "search_id=?"
        //    85: aload           7
        //    87: aconst_null    
        //    88: aconst_null    
        //    89: aconst_null    
        //    90: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    93: astore          8
        //    95: aload           8
        //    97: ifnull          320
        //   100: aload           8
        //   102: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   107: ifeq            365
        //   110: aload           8
        //   112: iconst_0       
        //   113: invokeinterface android/database/Cursor.getInt:(I)I
        //   118: istore          17
        //   120: iload           17
        //   122: istore          10
        //   124: aload           8
        //   126: invokeinterface android/database/Cursor.close:()V
        //   131: getstatic       com/twitter/library/provider/bg.b:Z
        //   134: ifeq            164
        //   137: ldc             "DatabaseHelper"
        //   139: new             Ljava/lang/StringBuilder;
        //   142: dup            
        //   143: invokespecial   java/lang/StringBuilder.<init>:()V
        //   146: ldc_w           "deleteOldSearchResults: total count: "
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: iload           10
        //   154: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   157: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   160: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   163: pop            
        //   164: iload           10
        //   166: sipush          400
        //   169: if_icmple       320
        //   172: aload           5
        //   174: ldc_w           "search_results"
        //   177: iconst_2       
        //   178: anewarray       Ljava/lang/String;
        //   181: dup            
        //   182: iconst_0       
        //   183: ldc_w           "_id"
        //   186: aastore        
        //   187: dup            
        //   188: iconst_1       
        //   189: ldc_w           "search_id"
        //   192: aastore        
        //   193: ldc_w           "search_id=?"
        //   196: aload           7
        //   198: aconst_null    
        //   199: aconst_null    
        //   200: ldc_w           "type_id DESC, _id DESC"
        //   203: bipush          100
        //   205: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   208: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   211: astore          11
        //   213: aload           11
        //   215: ifnull          320
        //   218: aload           11
        //   220: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   225: ifeq            313
        //   228: iconst_1       
        //   229: anewarray       Ljava/lang/String;
        //   232: astore          13
        //   234: iconst_0       
        //   235: istore          14
        //   237: aload           13
        //   239: iconst_0       
        //   240: aload           11
        //   242: iconst_0       
        //   243: invokeinterface android/database/Cursor.getLong:(I)J
        //   248: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   251: aastore        
        //   252: iload           14
        //   254: aload           5
        //   256: ldc_w           "search_results"
        //   259: ldc_w           "_id=?"
        //   262: aload           13
        //   264: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   267: iadd           
        //   268: istore          14
        //   270: aload           11
        //   272: invokeinterface android/database/Cursor.moveToNext:()Z
        //   277: ifne            237
        //   280: getstatic       com/twitter/library/provider/bg.b:Z
        //   283: ifeq            313
        //   286: ldc             "DatabaseHelper"
        //   288: new             Ljava/lang/StringBuilder;
        //   291: dup            
        //   292: invokespecial   java/lang/StringBuilder.<init>:()V
        //   295: ldc_w           "deleteOldSearchResults: Deleted: "
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: iload           14
        //   303: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   312: pop            
        //   313: aload           11
        //   315: invokeinterface android/database/Cursor.close:()V
        //   320: aload           5
        //   322: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   325: aload           5
        //   327: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   330: return         
        //   331: astore          9
        //   333: aload           8
        //   335: invokeinterface android/database/Cursor.close:()V
        //   340: aload           9
        //   342: athrow         
        //   343: astore          6
        //   345: aload           5
        //   347: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   350: aload           6
        //   352: athrow         
        //   353: astore          12
        //   355: aload           11
        //   357: invokeinterface android/database/Cursor.close:()V
        //   362: aload           12
        //   364: athrow         
        //   365: iconst_0       
        //   366: istore          10
        //   368: goto            124
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  53     95     343    353    Any
        //  100    120    331    343    Any
        //  124    164    343    353    Any
        //  172    213    343    353    Any
        //  218    234    353    365    Any
        //  237    313    353    365    Any
        //  313    320    343    353    Any
        //  320    325    343    353    Any
        //  333    343    343    353    Any
        //  355    365    343    353    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0237:
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
    
    private void c(final SQLiteDatabase sqLiteDatabase) {
        final Cursor query = sqLiteDatabase.query("discover", new String[] { String.valueOf("page") }, (String)null, (String[])null, (String)null, (String)null, "page DESC,_id DESC");
        if (query == null) {
            return;
        }
        try {
            if (!query.moveToFirst()) {
                return;
            }
            final int int1 = query.getInt(0);
            sqLiteDatabase.beginTransaction();
            try {
                final ContentValues contentValues = new ContentValues(1);
                contentValues.put("is_last", 0);
                sqLiteDatabase.update("discover", contentValues, "is_last=1", (String[])null);
                contentValues.put("is_last", 1);
                sqLiteDatabase.update("discover", contentValues, "page=?", new String[] { String.valueOf(int1) });
                sqLiteDatabase.setTransactionSuccessful();
            }
            finally {
                sqLiteDatabase.endTransaction();
            }
        }
        finally {
            query.close();
        }
    }
    
    public static byte[] c(final ArrayList list) {
        final byte[] array = new byte[8 * list.size()];
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        final Iterator<bp> iterator = list.iterator();
        while (iterator.hasNext()) {
            wrap.putLong(iterator.next().a);
        }
        return array;
    }
    
    private int d(final ArrayList list) {
        SQLiteDatabase writableDatabase;
        int n = 0;
        while (true) {
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
        Label_0139_Outer:
            while (true) {
            Label_0207:
                while (true) {
                    Label_0201: {
                        try {
                            final Iterator<TwitterTypeAhead> iterator = list.iterator();
                            n = 0;
                            while (iterator.hasNext()) {
                                final TwitterSearchQuery f = iterator.next().f;
                                if (bg.b) {
                                    Log.d("DatabaseHelper", "insertOneClick: " + f.m + " from followers? " + f.l);
                                }
                                final ContentValues contentValues = new ContentValues();
                                contentValues.put("topic", f.a);
                                contentValues.put("filter_name", f.m);
                                if (!f.l) {
                                    break Label_0201;
                                }
                                final int n2 = 1;
                                contentValues.put("filter_follow", n2);
                                contentValues.put("filter_location", f.f);
                                if (writableDatabase.insert("one_click", "filter_name", contentValues) > 0L) {
                                    break Label_0207;
                                }
                                Log.w("DatabaseHelper", "Failed to insert typeahead oneclick");
                            }
                            break;
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                    }
                    final int n2 = 0;
                    continue;
                }
                ++n;
                continue Label_0139_Outer;
            }
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        return n;
    }
    
    private static ArrayList d(final ArrayList list, final ArrayList list2) {
        final LinkedHashSet<Long> set = new LinkedHashSet<Long>();
        final Iterator<bp> iterator = list2.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().a);
        }
        final Iterator<Long> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            set.add(iterator2.next());
        }
        return new ArrayList((Collection<? extends E>)set);
    }
    
    private List d(final String s, final String[] array) {
        final String string = s + a((Object[])array);
        final StringBuilder sb = new StringBuilder(" CASE " + s + ' ');
        for (int i = 0; i < array.length; ++i) {
            sb.append(" WHEN '").append(array[i]).append("' THEN ").append(i + 1);
        }
        sb.append(" END");
        final Cursor query = this.getReadableDatabase().query("users", cv.a, string, (String[])null, (String)null, (String)null, sb.toString());
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        if (query != null) {
            try {
                while (query.moveToNext()) {
                    list.add(a(query));
                }
            }
            finally {
                query.close();
            }
            query.close();
        }
        return list;
    }
    
    private void d(final long n, final int n2, final b b) {
        final long e = this.e(n, n2);
        if (e != 0L) {
            if (bg.b) {
                Log.d("DatabaseHelper", "Tagging the oldest status of type: " + n2 + " owner id: " + n + " row id: " + e);
            }
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("is_last", 0);
                writableDatabase.update("status_groups", contentValues, "is_last=1", (String[])null);
                contentValues.put("is_last", 1);
                writableDatabase.update("status_groups", contentValues, "_id=?", new String[] { String.valueOf(e) });
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (b != null) {
                    b.a(bg.d);
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    private void d(final SQLiteDatabase sqLiteDatabase) {
        final String[] array = { String.valueOf(1) };
        final Cursor query = sqLiteDatabase.query("discover", new String[] { "COUNT(*)" }, "type=?", array, (String)null, (String)null, (String)null);
        Label_0069: {
            if (query == null) {
                final int int1 = 0;
                break Label_0069;
            }
            while (true) {
                while (true) {
                    Label_0214: {
                        int int1;
                        try {
                            if (!query.moveToFirst()) {
                                break Label_0214;
                            }
                            int1 = query.getInt(0);
                            query.close();
                            if (int1 <= 200) {
                                return;
                            }
                        }
                        finally {
                            query.close();
                        }
                        if (bg.b) {
                            Log.d("DatabaseHelper", "deleteOldDiscover: total count of discover tweets: " + int1);
                        }
                        final Cursor query2 = sqLiteDatabase.query("discover", new String[] { String.valueOf("page") }, "type=?", array, (String)null, (String)null, "page DESC,_id DESC", String.valueOf(int1 - 50));
                        if (query2 == null) {
                            return;
                        }
                        try {
                            if (query2.moveToLast()) {
                                this.a(sqLiteDatabase, query2.getInt(0));
                            }
                            return;
                        }
                        finally {
                            query2.close();
                        }
                    }
                    int int1 = 0;
                    continue;
                }
            }
        }
    }
    
    private com.twitter.library.api.al[] e(final String s, final String[] array) {
        final Cursor query = this.getReadableDatabase().query("promoted_retry", bx.a, s, array, (String)null, (String)null, (String)null, (String)null);
        if (query != null) {
            com.twitter.library.api.al[] array2;
            while (true) {
                while (true) {
                    Label_0200: {
                        try {
                            array2 = new com.twitter.library.api.al[query.getCount()];
                            while (query.moveToNext()) {
                                final String string = query.getString(0);
                                final int int1 = query.getInt(1);
                                final long long1 = query.getLong(2);
                                final String string2 = query.getString(3);
                                if (query.getInt(4) == 0) {
                                    break Label_0200;
                                }
                                final boolean b = true;
                                array2[query.getPosition()] = new com.twitter.library.api.al(string, int1, long1, string2, b, query.getString(6), query.getString(7), query.getString(8), query.getString(9), query.getString(10), query.getString(11), query.getString(12), query.getInt(5));
                            }
                            break;
                        }
                        finally {
                            query.close();
                        }
                    }
                    final boolean b = false;
                    continue;
                }
            }
            query.close();
            return array2;
        }
        return com.twitter.library.api.al.a;
    }
    
    private void f(final int n) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("tokens", "type=?", new String[] { String.valueOf(n) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    private c[] f(final String s, final String[] array) {
        final Cursor query = this.getReadableDatabase().query("notifications", new String[] { "notif_id", "notif_txt", "s_name", "s_id", "source_user_name", "type", "aggregation_data", "notif_extra_data" }, s + "AND " + "notif_txt" + " NOT NULL", array, (String)null, (String)null, "notif_id DESC", (String)null);
        if (query != null) {
            c[] array2;
            try {
                array2 = new c[query.getCount()];
                while (query.moveToNext()) {
                    final c c = new c();
                    c.b = query.getInt(0);
                    c.c = query.getString(1);
                    c.d = query.getString(2);
                    c.f = query.getLong(3);
                    c.e = query.getString(4);
                    c.a = query.getInt(5);
                    c.g = query.getString(6);
                    c.h = query.getBlob(7);
                    array2[query.getPosition()] = c;
                }
            }
            finally {
                query.close();
            }
            query.close();
            return array2;
        }
        return com.twitter.library.platform.d.a;
    }
    
    private void g(final long n, final b b) {
        final long h = this.h(n);
        if (h != 0L) {
            if (bg.b) {
                Log.d("DatabaseHelper", "Tagging the oldest list owned by: " + n + " row id: " + h);
            }
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                final ContentValues contentValues = new ContentValues();
                contentValues.put("list_is_last", 0);
                writableDatabase.update("list_mapping", contentValues, "list_is_last=1", (String[])null);
                contentValues.put("list_is_last", 1);
                writableDatabase.update("list_mapping", contentValues, "_id=?", new String[] { String.valueOf(h) });
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (b != null) {
                    b.a(aq.a);
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    private int i(final String s) {
        int n = 0;
        Label_0042: {
            switch (s.hashCode()) {
                case -1959191647: {
                    if (s.equals("home_timeline")) {
                        n = 0;
                        break Label_0042;
                    }
                    break;
                }
                case 1223860258: {
                    if (s.equals("profile_self")) {
                        n = 1;
                        break Label_0042;
                    }
                    break;
                }
                case -718288646: {
                    if (s.equals("profile_other")) {
                        n = 2;
                        break Label_0042;
                    }
                    break;
                }
            }
            n = -1;
        }
        int n2 = 0;
        switch (n) {
            default: {
                n2 = -1;
                return n2;
            }
            case 0: {
                return n2;
            }
            case 1:
            case 2: {
                return 1;
            }
        }
    }
    
    static String j(final long n, final int n2) {
        return n + "-" + n2 + ".db";
    }
    
    private c[] j(final String s) {
        return this.f(s, null);
    }
    
    private String[] j() {
        return new String[] { "user_groups", "cursors", "users", "search_queries", "activities", "discover", "tokens", "locations", "timeline", "topics", "one_click", "referral_campaigns", "search_suggestion_metadata" };
    }
    
    private long k(final long n, final int n2) {
        final Cursor query = this.getReadableDatabase().query("timeline", new String[] { "MAX(updated_at)" }, "owner_id=? AND type=?", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, (String)null);
        if (query == null) {
            return 0L;
        }
        while (true) {
            try {
                if (query.moveToFirst()) {
                    return query.getLong(0);
                }
            }
            finally {
                query.close();
            }
            return 0L;
        }
    }
    
    private TwitterTopic$TwitterList k(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/twitter/library/provider/bg.getReadableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //     4: astore_3       
        //     5: iconst_1       
        //     6: anewarray       Ljava/lang/String;
        //     9: dup            
        //    10: iconst_0       
        //    11: ldc_w           "ev_content"
        //    14: aastore        
        //    15: astore          4
        //    17: iconst_1       
        //    18: anewarray       Ljava/lang/String;
        //    21: astore          7
        //    23: aload           7
        //    25: iconst_0       
        //    26: lload_1        
        //    27: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    30: aastore        
        //    31: aload_3        
        //    32: ldc_w           "topics"
        //    35: aload           4
        //    37: ldc_w           "ev_type=5 AND ev_id=?"
        //    40: aload           7
        //    42: aconst_null    
        //    43: aconst_null    
        //    44: aconst_null    
        //    45: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    48: astore          8
        //    50: aload           8
        //    52: astore          6
        //    54: aload           6
        //    56: ifnull          139
        //    59: aload           6
        //    61: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    66: ifeq            139
        //    69: aload           6
        //    71: iconst_0       
        //    72: invokeinterface android/database/Cursor.getBlob:(I)[B
        //    77: invokestatic    com/twitter/util/h.a:([B)Ljava/lang/Object;
        //    80: checkcast       Lcom/twitter/library/api/TwitterTopic$TwitterList;
        //    83: astore          9
        //    85: aload           6
        //    87: ifnull          97
        //    90: aload           6
        //    92: invokeinterface android/database/Cursor.close:()V
        //    97: aload           9
        //    99: ifnonnull       111
        //   102: new             Lcom/twitter/library/api/TwitterTopic$TwitterList;
        //   105: dup            
        //   106: invokespecial   com/twitter/library/api/TwitterTopic$TwitterList.<init>:()V
        //   109: astore          9
        //   111: aload           9
        //   113: areturn        
        //   114: astore          5
        //   116: aconst_null    
        //   117: astore          6
        //   119: aload           6
        //   121: ifnull          131
        //   124: aload           6
        //   126: invokeinterface android/database/Cursor.close:()V
        //   131: aload           5
        //   133: athrow         
        //   134: astore          5
        //   136: goto            119
        //   139: aconst_null    
        //   140: astore          9
        //   142: goto            85
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  5      50     114    119    Any
        //  59     85     134    139    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0085:
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
    
    private static String[] k() {
        return new String[] { "CREATE TABLE users (_id INTEGER PRIMARY KEY,user_id INT UNIQUE NOT NULL,username TEXT,name TEXT,description TEXT,web_url TEXT,bg_color INT,location TEXT,structured_location BLOB,user_flags INT,followers INT,fast_followers INT DEFAULT 0,friends INT,statuses INT,profile_created INT,image_url TEXT,hash INT,updated INT,friendship INT,friendship_time INT,favorites INT DEFAULT 0,header_url TEXT,description_entities BLOB,url_entities BLOB,media_count INT,extended_profile_fields BLOB,link_color INT);", "CREATE TABLE user_groups (_id INTEGER PRIMARY KEY,type INT,tag INT,rank INT,owner_id INT,user_id INT,is_last INT,pc BLOB,g_flags INT);", "CREATE TABLE order_history (_id INTEGER PRIMARY KEY,ordered_at INT ,order_id INT ,data BLOB);", "CREATE TABLE promoted_retry(impression_id TEXT,event INT NOT NULL,is_earned INT NOT NULL,trend_id INT,num_retries INT NOT NULL,url TEXT,video_playlist_url TEXT,video_content_uuid TEXT,video_content_type TEXT,video_cta_url TEXT,video_cta_app_id TEXT,video_cta_app_name TEXT,card_event TEXT,PRIMARY KEY(impression_id,event,is_earned,trend_id));", "CREATE TABLE user_metadata (_id INTEGER PRIMARY KEY,owner_id INT NOT NULL,user_id INT NOT NULL,user_group_type INT NOT NULL,user_group_tag INT NOT NULL,soc_type INT,soc_name TEXT,soc_follow_count INT,user_title TEXT,token TEXT);", "CREATE TABLE cursors (_id INTEGER PRIMARY KEY,kind INT,type INT,owner_id INT,ref_id TEXT,next TEXT);", "CREATE TABLE statuses (_id INTEGER PRIMARY KEY,status_id INT UNIQUE NOT NULL,author_id INT,content TEXT,source TEXT,source_url TEXT,created INT,in_r_user_id INT,in_r_status_id INT,favorited INT,latitude TEXT,longitude TEXT,place_data BLOB,entities TEXT,retweet_count INT,r_content TEXT,cards BLOB,flags INT,favorite_count INT,lang TEXT,view_count INT,quoted_tweet_data BLOB,quoted_tweet_id INT,retweeted INT)", "CREATE TABLE status_groups (_id INTEGER PRIMARY KEY,tweet_type INT DEFAULT 0,type INT,sender_id INT,owner_id INT,ref_id INT,tag INT,g_status_id INT,is_read INT,page INT,is_last INT,updated_at INT,timeline INT,pc BLOB,g_flags INT,preview_draft_id INT,preview_media BLOB);", "CREATE TABLE search_queries (_id INTEGER PRIMARY KEY,type INT,name TEXT NOT NULL,query TEXT NOT NULL,query_id INT,time INT,latitude REAL,longitude REAL,radius REAL,location TEXT,pc BLOB,cluster_titles BLOB);", "CREATE TABLE activities (_id INTEGER PRIMARY KEY,type INT,event INT,created_at INT,hash INT,max_position INT,min_position INT,sources_size INT,source_type INT,sources BLOB,targets_size INT,target_type INT,targets BLOB,target_objects_size INT,target_object_type INT,target_objects BLOB,is_last INT,tag INT,magic_rec_id INT,UNIQUE (type, max_position) ON CONFLICT REPLACE)", "CREATE TABLE discover (_id INTEGER PRIMARY KEY,type INT,identifier INT,unread INT DEFAULT 0,page INT,is_last INT,scribe_content BLOB);", "CREATE TABLE tokens (_id INTEGER PRIMARY KEY,text TEXT,weight INT,type INT,ref_id INT);", "CREATE TABLE notifications (_id INTEGER PRIMARY KEY,type INT,notif_id INT,source_user_name TEXT,s_name TEXT,s_id INT,notif_txt TEXT,aggregation_data TEXT,notif_extra_data BLOB);", "CREATE TABLE status_metadata (_id INTEGER PRIMARY KEY,owner_id INT NOT NULL,status_id INT NOT NULL,status_group INT NOT NULL,status_group_tag INT NOT NULL,soc_type INT,soc_name TEXT,soc_second_name TEXT,soc_others_count INT,soc_fav_count INT,soc_rt_count INT,reason_icon_type TEXT,reason_text TEXT,scribe_component TEXT,scribe_data BLOB,highlights TEXT);", "CREATE TABLE search_results (_id INTEGER PRIMARY KEY,search_id INT,s_type INT,data_type INT,type_id INT,polled INT,data_id INT,related_data BLOB,cluster_id INT);", "CREATE TABLE clusters (_id INTEGER PRIMARY KEY,cl_cluster_id TEXT UNIQUE NOT NULL,cl_type INT,cl_title TEXT,cl_subtitle TEXT,cl_size INT,cl_timestamp INT,cl_content BLOB);", "CREATE TABLE locations (_id INTEGER PRIMARY KEY,name TEXT,woeid INT,country TEXT,country_code TEXT);", "CREATE TABLE timeline (_id INTEGER PRIMARY KEY AUTOINCREMENT,owner_id INT,type INT,sort_index INT,entity_id INT,entity_type INT,data_type INT,data_type_group INT,data_type_tag INT,timeline_tag TEXT,timeline_group_id INT,timeline_scribe_group_id INT,data_id INT,data BLOB,flags INT,updated_at INT,data_origin_id TEXT,is_last INT,is_read INT,scribe_content BLOB);", "CREATE TABLE topics (_id INTEGER PRIMARY KEY,ev_id TEXT UNIQUE NOT NULL,ev_type INT,ev_query TEXT NOT NULL,ev_seed_hashtag TEXT,ev_title STRING,ev_subtitle STRING,ev_view_url STRING,ev_status STRING,ev_image_url TEXT,ev_explanation TEXT,ev_tweet_count INT,ev_start_time INT,ev_owner_id INT,ev_pc BLOB,ev_content BLOB,ev_hash INT);", "CREATE TABLE one_click (_id INTEGER PRIMARY KEY,topic TEXT,filter_name TEXT,filter_location TEXT,filter_follow INT);", "CREATE TABLE search_suggestion_metadata (_id INTEGER PRIMARY KEY,type INT,last_update LONG);", "CREATE TABLE conversation_entries (_id INTEGER PRIMARY KEY,entry_id INT UNIQUE NOT NULL,sort_entry_id INT UNIQUE NOT NULL,conversation_id TEXT,user_id INT,created INT,entry_type INT,data BLOB,request_id TEXT);", "CREATE TABLE conversations (_id INTEGER PRIMARY KEY,conversation_id TEXT UNIQUE NOT NULL,title TEXT,type INT,sort_event_id BIGINT,last_readable_event_id BIGINT,last_read_event_id BIGINT,sort_timestamp BIGINT,is_muted INT,min_event_id BIGINT,is_hidden INT,has_more INT,read_only INT);", "CREATE TABLE conversation_participants (_id INTEGER PRIMARY KEY,conversation_id TEXT NOT NULL,user_id TEXT NOT NULL,join_time INT NOT NULL,participant_type INT NOT NULL);", "CREATE TABLE list_mapping (_id INTEGER PRIMARY KEY,list_mapping_list_id TEXT,list_mapping_type INT,list_mapping_user_id INT,list_is_last INT);", "CREATE TABLE referral_campaigns (_id INTEGER PRIMARY KEY,id TEXT,list_id INT,promoted_account_id INT,protocol_handling_flow TEXT,country_override TEXT);", "CREATE TABLE IF NOT EXISTS category_timestamp (_id INTEGER PRIMARY KEY,cat_status_id INT NOT NULL,cat_tag INT NOT NULL,cat_timestamp INT NOT NULL);", "CREATE TABLE prompts (_id INTEGER PRIMARY KEY,p_id INT,p_format TEXT,p_template TEXT,p_header TEXT,p_text TEXT,p_action_text TEXT,p_action_url TEXT,p_icon TEXT,p_background_image_url TEXT,p_persistence TEXT,p_entities BLOB,p_header_entities BLOB,p_status_id LONG,p_insertion_index INT,p_trigger TEXT);", "CREATE TABLE stories ( _id INTEGER PRIMARY KEY,story_id TEXT,story_order INT,story_type INT,story_proof_type INT,story_proof_addl_count INT,data_type INT,data_id INT,story_is_read INT,story_meta_title TEXT,story_meta_subtitle TEXT,story_meta_query TEXT,story_meta_header_img_url TEXT,story_source TEXT,story_impression_info TEXT,story_existing_feedback INT);", "CREATE TABLE news (_id INTEGER PRIMARY KEY,country TEXT,language TEXT,news_id TEXT,title TEXT,image_url TEXT,author_name TEXT,article_description TEXT,article_url TEXT);" };
    }
    
    private static String l(final long n) {
        if (n > 0L) {
            return Long.toString(n);
        }
        return null;
    }
    
    private static String[] l() {
        return new String[] { "CREATE INDEX user_groups_idx ON user_groups (type,owner_id,user_id);", "CREATE INDEX user_metadata_index ON user_metadata (owner_id,user_id,user_group_type);", "CREATE INDEX status_groups_idx ON status_groups (type,owner_id,tag,g_status_id);", "CREATE INDEX user_cursors_index ON cursors (kind,type,owner_id);", "CREATE INDEX search_queries_index ON search_queries (type,name,query);", "CREATE UNIQUE INDEX search_suggestion_metadata_index ON search_suggestion_metadata (type);", "CREATE INDEX status_metadata_index ON status_metadata (owner_id,status_id,status_group);", "CREATE INDEX serach_results_index ON search_results (search_id,s_type,data_type,type_id,polled,data_id,cluster_id);", "CREATE INDEX clusters_index ON clusters (cl_cluster_id);", "CREATE INDEX topics_index ON topics (ev_id,ev_owner_id);", "CREATE UNIQUE INDEX conversation_index ON conversations (conversation_id);", "CREATE INDEX conversation_entries_index ON conversation_entries (conversation_id);", "CREATE INDEX conversation_entries_request_id_index ON conversation_entries (request_id);", "CREATE UNIQUE INDEX conversation_participants_index ON conversation_participants (conversation_id,user_id);", "CREATE UNIQUE INDEX list_mapping_index ON list_mapping (list_mapping_list_id,list_mapping_type,list_mapping_user_id);", "CREATE INDEX timeline_index ON timeline (type,sort_index,updated_at);", "CREATE INDEX stories_index ON stories (story_id,story_order,story_type,data_type,data_id);" };
    }
    
    private static String[] m() {
        return new String[] { "CREATE VIEW status_groups_view AS SELECT status_groups._id AS _id,status_groups.owner_id AS owner_id,status_groups.type AS type,status_groups.tag AS tag,status_groups.g_status_id AS g_status_id,status_groups.is_read AS is_read,status_groups.page AS page,status_groups.is_last AS is_last,status_groups.timeline AS timeline,status_groups.sender_id AS sender_id,status_groups.tweet_type AS tweet_type,status_groups.ref_id AS ref_id,status_groups.updated_at AS updated_at,status_groups.pc AS pc,status_groups.g_flags AS g_flags,status_groups.preview_draft_id AS preview_draft_id,status_groups.preview_media AS preview_media,statuses.author_id AS author_id,statuses.content AS content,statuses.source AS source,statuses.source_url AS source_url,statuses.created AS created,statuses.in_r_user_id AS in_r_user_id,statuses.in_r_status_id AS in_r_status_id,statuses.retweeted AS retweeted,statuses.favorited AS favorited,statuses.latitude AS latitude,statuses.longitude AS longitude,statuses.place_data AS place_data,statuses.entities AS entities,statuses.retweet_count AS retweet_count,statuses.r_content AS r_content,statuses.flags AS flags,statuses.lang AS lang,statuses.cards AS cards,statuses.favorite_count AS favorite_count,statuses.view_count AS view_count,statuses.quoted_tweet_data AS quoted_tweet_data,statuses.quoted_tweet_id AS quoted_tweet_id,metadata.soc_type AS soc_type,metadata.soc_name AS soc_name,metadata.soc_fav_count AS soc_fav_count,metadata.soc_rt_count AS soc_rt_count,metadata.highlights AS highlights,metadata.scribe_component AS scribe_component,metadata.scribe_data AS scribe_data,metadata.reason_icon_type AS reason_icon_type,metadata.reason_text AS reason_text,user.username AS username,user.name AS name,user.image_url AS image_url,user.user_flags AS user_flags,user.friendship AS friendship,user.friendship_time AS friendship_time,sender.username AS s_username,sender.name AS s_name,sender.image_url AS s_profile_image_url,sender.user_flags AS s_flags FROM status_groups LEFT JOIN statuses ON status_groups.g_status_id=statuses.status_id LEFT JOIN users AS user ON statuses.author_id=user.user_id LEFT JOIN users AS sender ON status_groups.sender_id=sender.user_id LEFT JOIN status_metadata AS metadata ON status_groups.owner_id=metadata.owner_id AND statuses.status_id=metadata.status_id AND status_groups.type=metadata.status_group AND status_groups.tag=metadata.status_group_tag;", "CREATE VIEW user_groups_view AS SELECT user_groups._id AS _id,user_groups.type AS type,user_groups.tag AS tag,user_groups.owner_id AS owner_id,user_groups.user_id AS user_id,user_groups.rank AS rank,user_groups.is_last AS is_last,user_groups.pc AS pc,user_groups.g_flags AS g_flags,user.username AS username,user.name AS name,user.description AS description,user.web_url AS web_url,user.bg_color AS bg_color,user.link_color AS link_color,user.location AS location,user.structured_location AS structured_location,user.user_flags AS user_flags,user.profile_created AS profile_created,user.image_url AS image_url,user.header_url AS header_url,user.description_entities AS description_entities,user.url_entities AS url_entities,user.followers AS followers,user.friends AS friends,user.statuses AS statuses,user.media_count AS media_count,user.friendship AS friendship,user.friendship_time AS friendship_time,metadata.soc_type AS soc_type,metadata.soc_name AS soc_name,metadata.soc_follow_count AS soc_follow_count,metadata.token AS token FROM user_groups LEFT JOIN users AS user ON user_groups.user_id=user.user_id LEFT JOIN user_metadata AS metadata ON user_groups.owner_id=metadata.owner_id AND user_groups.user_id=metadata.user_id AND user_groups.type=metadata.user_group_type AND user_groups.tag=metadata.user_group_tag;", "CREATE VIEW lists_view AS SELECT topics._id AS _id,topics.ev_type AS ev_type,topics.ev_owner_id AS ev_owner_id,topics.ev_id AS ev_id,topics.ev_title AS ev_title,topics.ev_query AS ev_query,topics.ev_subtitle AS ev_subtitle,topics.ev_content AS ev_content,topics.ev_view_url AS ev_view_url,users.username AS username,users.name AS name,users.image_url AS image_url,list_mapping.list_mapping_user_id AS list_mapping_user_id,list_mapping.list_mapping_type AS list_mapping_type,list_mapping.list_is_last AS list_is_last,list_mapping._id AS list_mapping_id FROM topics LEFT JOIN list_mapping ON topics.ev_id=list_mapping.list_mapping_list_id LEFT JOIN users ON topics.ev_owner_id=users.user_id WHERE topics.ev_type IN (5,4);", "CREATE VIEW topics_view AS SELECT topics._id AS _id,topics.ev_id AS ev_id,topics.ev_type AS ev_type,topics.ev_title AS ev_title,topics.ev_subtitle AS ev_subtitle,topics.ev_view_url AS ev_view_url,topics.ev_status AS ev_status,topics.ev_content AS ev_content,topics.ev_owner_id AS ev_owner_id,users.username AS username,users.name AS name,users.image_url AS image_url FROM topics,users WHERE topics.ev_owner_id=users.user_id;", "CREATE VIEW status_groups_retweets_view AS SELECT status_groups_view.*, retweets.* FROM status_groups_view LEFT JOIN ( SELECT g_status_id AS rt_orig_status_id,ref_id AS rt_orig_ref_id FROM status_groups_view WHERE type=0 AND tweet_type=1 AND sender_id=owner_id GROUP BY rt_orig_status_id) AS retweets ON (retweets.rt_orig_status_id=status_groups_view.g_status_id);", "CREATE VIEW categories_view AS SELECT search_queries._id AS _id,search_queries.name AS name,search_queries.query AS query,search_queries.query_id AS query_id,user_groups_view.username AS username,user_groups_view.user_id AS user_id,user_groups_view.rank AS rank,user_groups_view.image_url AS image_url FROM search_queries LEFT JOIN user_groups_view ON search_queries.query_id=user_groups_view.tag WHERE user_groups_view.type=6;", "CREATE VIEW tokens_user_view AS SELECT tokens.text AS text,tokens.weight AS graph_weight,tokens.type AS type,tokens.ref_id AS user_id,users.username AS username,users.name AS name,users.location AS location,users.structured_location AS structured_location,users.user_flags AS flags,users.profile_created AS profile_created,users.image_url AS image_url,users.friendship AS friendship,user_metadata.soc_type AS soc_type,user_metadata.soc_name AS soc_name FROM tokens AS tokens LEFT JOIN users AS users ON tokens.ref_id=users.user_id LEFT JOIN user_metadata AS user_metadata ON tokens.ref_id=user_metadata.user_id WHERE tokens.type IN(1,4);", "CREATE VIEW tokens_topic_view AS SELECT tokens.text AS text,tokens.weight AS weight,search_queries.query AS topic FROM tokens AS tokens LEFT JOIN search_queries AS search_queries ON tokens.ref_id=search_queries._id WHERE tokens.type=3;", "CREATE VIEW discover_view AS SELECT status_groups.owner_id AS owner_id,status_groups.type AS type,status_groups.tag AS tag,status_groups.g_status_id AS g_status_id,status_groups.is_read AS is_read,status_groups.page AS page,status_groups.timeline AS timeline,status_groups.sender_id AS sender_id,status_groups.tweet_type AS tweet_type,status_groups.ref_id AS ref_id,status_groups.updated_at AS updated_at,status_groups.pc AS pc,status_groups.g_flags AS g_flags,status_groups.preview_draft_id AS preview_draft_id,status_groups.preview_media AS preview_media,statuses.author_id AS author_id,statuses.content AS content,statuses.source AS source,statuses.source_url AS source_url,statuses.created AS created,statuses.in_r_user_id AS in_r_user_id,statuses.in_r_status_id AS in_r_status_id,statuses.retweeted AS retweeted,statuses.favorited AS favorited,statuses.latitude AS latitude,statuses.longitude AS longitude,statuses.place_data AS place_data,statuses.entities AS entities,statuses.retweet_count AS retweet_count,statuses.r_content AS r_content,statuses.flags AS flags,statuses.cards AS cards,statuses.favorite_count AS favorite_count,statuses.lang AS lang,statuses.view_count AS view_count,statuses.quoted_tweet_data AS quoted_tweet_data,statuses.quoted_tweet_id AS quoted_tweet_id,metadata.soc_type AS soc_type,metadata.soc_name AS soc_name,metadata.soc_fav_count AS soc_fav_count,metadata.soc_rt_count AS soc_rt_count,metadata.highlights AS highlights,metadata.scribe_component AS scribe_component,metadata.scribe_data AS scribe_data,user.username AS username,user.name AS name,user.image_url AS image_url,user.user_flags AS user_flags,user.friendship AS friendship,user.friendship_time AS friendship_time,sender.username AS s_username,sender.name AS s_name,sender.image_url AS s_profile_image_url,sender.user_flags AS s_flags,d._id AS _id,d.is_last AS is_last,d.unread AS d_state,d.page AS d_page,d.type AS d_type,d.scribe_content AS d_scribe_content,u.user_id AS u_user_id,u.username AS u_username,u.name AS u_name,u.image_url AS u_image_url,u.user_flags AS u_user_flags,u.description AS u_description,u.description_entities AS u_description_entities,u.friendship AS u_friendship,ug.pc AS u_pc,ug.g_flags AS u_g_flags,um.soc_type AS u_soc_type,um.soc_name AS u_soc_name,um.soc_follow_count AS u_soc_follow_count,um.token AS u_token FROM discover AS d  LEFT JOIN statuses ON d.identifier=statuses.status_id AND d.type=1 LEFT JOIN status_groups ON statuses.status_id=status_groups.g_status_id AND status_groups.type=19 LEFT JOIN users AS user ON statuses.author_id=user.user_id LEFT JOIN users AS sender ON status_groups.sender_id=sender.user_id LEFT JOIN status_metadata AS metadata ON status_groups.owner_id=metadata.owner_id AND statuses.status_id=metadata.status_id AND status_groups.type=metadata.status_group AND status_groups.tag=metadata.status_group_tag LEFT JOIN users AS u  ON d.identifier=u.user_id AND d.type=2 LEFT JOIN user_groups AS ug  ON u.user_id=ug.user_id AND ug.type=9 AND ug.tag=-1 LEFT JOIN user_metadata AS um  ON ug.owner_id=um.owner_id AND ug.user_id=um.user_id AND ug.type=um.user_group_type AND ug.tag=um.user_group_tag;", "CREATE VIEW search_results_view AS SELECT search_results._id AS _id,search_results.type_id AS type_id,search_results.polled AS polled,search_results.s_type AS s_type,search_results.search_id AS search_id,search_results.related_data AS related_data,status_groups_view.g_status_id AS g_status_id,status_groups_view.content AS content,status_groups_view.username AS username,status_groups_view.name AS name,status_groups_view.author_id AS author_id,status_groups_view.friendship AS friendship,status_groups_view.friendship_time AS friendship_time,status_groups_view.updated_at AS updated_at,status_groups_view.source AS source,status_groups_view.in_r_status_id AS in_r_status_id,status_groups_view.image_url AS image_url,status_groups_view.user_flags AS user_flags,status_groups_view.retweeted AS retweeted,status_groups_view.favorited AS favorited,status_groups_view.latitude AS latitude,status_groups_view.longitude AS longitude,status_groups_view.is_last AS is_last,status_groups_view.timeline AS timeline,status_groups_view.entities AS entities,status_groups_view.type AS type,status_groups_view.tweet_type AS tweet_type,status_groups_view.sender_id AS sender_id,status_groups_view.s_username AS s_username,status_groups_view.ref_id AS ref_id,status_groups_view.place_data AS place_data,status_groups_view.s_name AS s_name,status_groups_view.created AS created,status_groups_view.r_content AS r_content,status_groups_view.flags AS flags,status_groups_view.pc AS pc,status_groups_view.g_flags AS g_flags,status_groups_view.is_read AS is_read,status_groups_view.cards AS cards,status_groups_view.lang AS lang,status_groups_view.soc_type AS soc_type,status_groups_view.soc_name AS soc_name,status_groups_view.highlights AS highlights,status_groups_view.scribe_component AS scribe_component,status_groups_view.scribe_data AS scribe_data,status_groups_view.retweet_count AS retweet_count,status_groups_view.favorite_count AS favorite_count,status_groups_view.view_count AS view_count,status_groups_view.reason_icon_type AS reason_icon_type,status_groups_view.reason_text AS reason_text,status_groups_view.quoted_tweet_data AS quoted_tweet_data,status_groups_view.quoted_tweet_id AS quoted_tweet_id,status_groups_view.preview_draft_id AS preview_draft_id,status_groups_view.preview_media AS preview_media,users.user_id AS u_user_id,users.username AS u_username,users.name AS u_name,users.image_url AS u_image_url,users.user_flags AS u_user_flags,users.friendship AS u_friendship,users.description AS u_description,users.description_entities AS u_description_entities,user_groups.pc AS u_pc,user_metadata.soc_type AS u_soc_type,user_metadata.soc_name AS u_soc_name,user_metadata.user_title AS u_user_title,clusters.cl_cluster_id AS cl_cluster_id,clusters.cl_type AS cl_type,clusters.cl_title AS cl_title,clusters.cl_subtitle AS cl_subtitle,clusters.cl_size AS cl_size,clusters.cl_timestamp AS cl_timestamp,clusters.cl_content AS cl_content,topics.ev_id AS ev_id,topics.ev_type AS ev_type,topics.ev_query AS ev_query,topics.ev_title AS ev_title,topics.ev_subtitle AS ev_subtitle,topics.ev_view_url AS ev_view_url,topics.ev_status AS ev_status,topics.ev_image_url AS ev_image_url,topics.ev_seed_hashtag AS ev_seed_hashtag,topics.ev_start_time AS ev_start_time,topics.ev_explanation AS ev_explanation,topics.ev_tweet_count AS ev_tweet_count,topics.ev_content AS ev_content,topics.ev_owner_id AS ev_owner_id FROM search_results LEFT JOIN status_groups_view ON search_results.data_type=1 AND search_results.data_id=status_groups_view.g_status_id AND status_groups_view.type=13 AND status_groups_view.tag=search_id LEFT JOIN topics ON search_results.data_type=3 AND topics._id=search_results.data_id LEFT JOIN user_groups ON ((search_results.data_type=2 AND search_results.data_id=user_groups.user_id) OR (search_results.data_type=3 AND topics.ev_owner_id=user_groups.user_id)) AND user_groups.tag=search_id AND user_groups.type=3 LEFT JOIN user_metadata ON user_groups.owner_id=user_metadata.owner_id AND user_groups.user_id=user_metadata.user_id AND user_groups.type=user_metadata.user_group_type AND user_groups.tag=user_metadata.user_group_tag LEFT JOIN users ON (search_results.data_type=2 OR search_results.data_type=3) AND user_groups.user_id = users.user_id LEFT JOIN clusters ON search_results.cluster_id=clusters._id;", "CREATE VIEW timeline_view AS SELECT status_groups.type AS type,status_groups.tag AS tag,status_groups.g_status_id AS g_status_id,status_groups.page AS page,status_groups.timeline AS timeline,status_groups.sender_id AS sender_id,status_groups.tweet_type AS tweet_type,status_groups.ref_id AS ref_id,status_groups.updated_at AS updated_at,status_groups.pc AS pc,status_groups.g_flags AS g_flags,status_groups.preview_draft_id AS preview_draft_id,status_groups.preview_media AS preview_media,statuses.author_id AS author_id,statuses.content AS content,statuses.source AS source,statuses.source_url AS source_url,statuses.created AS created,statuses.in_r_user_id AS in_r_user_id,statuses.in_r_status_id AS in_r_status_id,statuses.retweeted AS retweeted,statuses.favorited AS favorited,statuses.latitude AS latitude,statuses.longitude AS longitude,statuses.place_data AS place_data,statuses.entities AS entities,statuses.retweet_count AS retweet_count,statuses.r_content AS r_content,statuses.flags AS flags,statuses.cards AS cards,statuses.favorite_count AS favorite_count,statuses.lang AS lang,statuses.view_count AS view_count,statuses.quoted_tweet_data AS quoted_tweet_data,statuses.quoted_tweet_id AS quoted_tweet_id,metadata.soc_type AS soc_type,metadata.soc_name AS soc_name,metadata.soc_second_name AS soc_second_name,metadata.soc_others_count AS soc_others_count,metadata.soc_fav_count AS soc_fav_count,metadata.soc_rt_count AS soc_rt_count,metadata.highlights AS highlights,metadata.scribe_component AS scribe_component,metadata.scribe_data AS scribe_data,user.username AS username,user.name AS name,user.image_url AS image_url,user.user_flags AS user_flags,user.friendship AS friendship,user.friendship_time AS friendship_time,sender.username AS s_username,sender.name AS s_name,sender.image_url AS s_profile_image_url,sender.user_flags AS s_flags,wtf.user_id AS wtf_user_id,wtf.username AS wtf_username,wtf.name AS wtf_name,wtf.image_url AS wtf_profile_image_url,t._id AS _id,t.owner_id AS owner_id,t.type AS t_type,t.sort_index AS t_sort_index,t.entity_id AS t_entity_id,t.entity_type AS t_entity_type,t.data_type AS t_data_type,t.data_type_group AS t_data_type_group,t.timeline_tag AS t_tag,t.timeline_group_id AS t_timeline_group_id,t.timeline_scribe_group_id AS t_timeline_scribe_group_id,t.data_id AS t_data_id,t.data AS t_data,t.flags AS t_flags,t.updated_at AS t_updated_at,t.is_last AS is_last,t.is_read AS is_read,t.scribe_content AS scribe_content,ev.ev_id AS ev_id,ev.ev_type AS ev_type,ev.ev_query AS ev_query,ev.ev_title AS ev_title,ev.ev_subtitle AS ev_subtitle,ev.ev_view_url AS ev_view_url,ev.ev_status AS ev_status,ev.ev_image_url AS ev_image_url,ev.ev_explanation AS ev_explanation,ev.ev_tweet_count AS ev_tweet_count,ev.ev_pc AS ev_pc,ev.ev_content AS ev_content,ev.ev_seed_hashtag AS ev_seed_hashtag,ev.ev_start_time AS ev_start_time,p.p_id AS p_id,p.p_format AS p_format,p.p_template AS p_template,p.p_header AS p_header,p.p_text AS p_text,p.p_action_text AS p_action_text,p.p_action_url AS p_action_url,p.p_icon AS p_icon,p.p_background_image_url AS p_background_image_url,p.p_persistence AS p_persistence,p.p_entities AS p_entities,p.p_header_entities AS p_header_entities,p.p_status_id AS p_status_id,p.p_insertion_index AS p_insertion_index,p.p_trigger AS p_trigger FROM timeline AS t  LEFT JOIN statuses ON t.data_id=statuses.status_id AND t.data_type=1 LEFT JOIN status_groups ON statuses.status_id=status_groups.g_status_id AND t.owner_id=status_groups.owner_id AND t.data_type_group=status_groups.type AND t.data_type_tag=status_groups.tag LEFT JOIN users AS user ON statuses.author_id=user.user_id LEFT JOIN users AS wtf ON  t.data_type=8 AND t.data_id=wtf.user_id LEFT JOIN users AS sender ON status_groups.sender_id=sender.user_id LEFT JOIN topics AS ev ON (t.data_type=3 OR t.data_type=7) AND t.data_id=ev._id LEFT JOIN prompts AS p ON t.data_id=p.p_id LEFT JOIN status_metadata AS metadata ON status_groups.owner_id=metadata.owner_id AND statuses.status_id=metadata.status_id AND status_groups.type=metadata.status_group AND status_groups.tag=metadata.status_group_tag;", "CREATE VIEW conversation AS SELECT conversation_entries._id AS _id,conversation_entries.entry_id AS entry_id,conversation_entries.sort_entry_id AS sort_entry_id,conversation_entries.conversation_id AS conversation_id,conversation_entries.created AS created,conversation_entries.user_id AS user_id,conversation_entries.entry_type AS entry_type,conversation_entries.data AS data,users.username AS s_username,users.name AS s_name,users.image_url AS s_profile_image_url FROM conversation_entries LEFT JOIN users ON conversation_entries.user_id=users.user_id;", "CREATE VIEW dm_inbox AS SELECT conversations._id AS _id,conversations.conversation_id AS conversation_id,conversations.type AS type,conversations.title AS title,conversations.is_muted AS is_muted,conversations.is_hidden AS is_hidden,conversations.sort_event_id AS sort_event_id,conversations.sort_timestamp AS sort_timestamp,conversations.read_only AS read_only,conversations.last_readable_event_id>conversations.last_read_event_id AS is_unread FROM conversation_participants JOIN conversations   ON conversations.conversation_id=conversation_participants.conversation_id AND conversations.is_hidden=0 GROUP BY conversations.conversation_id;", "CREATE VIEW category_status_groups_view AS SELECT * FROM status_groups_view LEFT JOIN category_timestamp ON status_groups_view.g_status_id=category_timestamp.cat_status_id AND status_groups_view.tag=category_timestamp.cat_tag;", "CREATE VIEW weighted_users AS SELECT * FROM users LEFT JOIN tokens ON users.user_id=tokens.ref_id GROUP BY users.user_id;", "CREATE VIEW stories_view AS SELECT s._id AS _id,s.story_id AS story_id,s.story_order AS story_order,s.story_type AS story_type,s.story_proof_type AS story_proof_type,s.story_proof_addl_count AS story_proof_addl_count,s.story_meta_title AS story_meta_title,s.story_meta_subtitle AS story_meta_subtitle,s.story_meta_query AS story_meta_query,s.story_meta_header_img_url AS story_meta_header_img_url,s.story_source AS story_source,s.story_impression_info AS story_impression_info,s.story_existing_feedback AS story_existing_feedback,s.data_type AS data_type,s.data_id AS data_id,s.story_is_read AS story_is_read,t.g_status_id AS g_status_id,t.content AS content,t.username AS username,t.name AS name,t.author_id AS author_id,t.friendship AS friendship,t.friendship_time AS friendship_time,t.updated_at AS updated_at,t.source AS source,t.in_r_status_id AS in_r_status_id,t.image_url AS image_url,t.user_flags AS user_flags,t.retweeted AS retweeted,t.favorited AS favorited,t.latitude AS latitude,t.longitude AS longitude,t.is_last AS is_last,t.timeline AS timeline,t.entities AS entities,t.type AS type,t.tweet_type AS tweet_type,t.sender_id AS sender_id,t.s_username AS s_username,t.ref_id AS ref_id,t.place_data AS place_data,t.s_name AS s_name,t.created AS created,t.r_content AS r_content,t.flags AS flags,t.pc AS pc,t.g_flags AS g_flags,t.is_read AS is_read,t.cards AS cards,t.lang AS lang,t.soc_type AS soc_type,t.soc_name AS soc_name,t.highlights AS highlights,t.scribe_component AS scribe_component,t.scribe_data AS scribe_data,t.retweet_count AS retweet_count,t.favorite_count AS favorite_count,t.view_count AS view_count,t.reason_icon_type AS reason_icon_type,t.reason_text AS reason_text,t.quoted_tweet_data AS quoted_tweet_data,t.quoted_tweet_id AS quoted_tweet_id,t.preview_draft_id AS preview_draft_id,t.preview_media AS preview_media,u.user_id AS u_user_id,u.username AS u_username,u.name AS u_name,u.image_url AS u_image_url,u.header_url AS u_header_url,u.user_flags AS u_user_flags,u.description AS u_description,u.description_entities AS u_description_entities,u.location AS u_location,u.web_url AS u_web_url,u.url_entities AS u_url_entities,u.friendship AS u_friendship,u.followers AS u_followers,u.profile_created AS u_profile_created,u.pc AS u_pc FROM stories AS s  LEFT JOIN status_groups_view AS t ON s.data_type=4 AND s.data_id= t.g_status_id AND t.type=29 AND s.story_order= t.tag LEFT JOIN user_groups_view AS u ON s.data_type IN (2,3) AND s.data_id= u.user_id AND u.type=34 AND s.story_order= u.tag" };
    }
    
    private static String[] n() {
        return new String[] { "CREATE TRIGGER user_tokens_delete_trigger AFTER DELETE ON users FOR EACH ROW BEGIN DELETE FROM tokens WHERE tokens.type=4 AND tokens.ref_id=OLD.user_id;END;", "CREATE TRIGGER discover_tweets_delete_trigger AFTER DELETE ON discover FOR EACH ROW BEGIN DELETE FROM status_groups WHERE OLD.type=1 AND OLD.identifier=status_groups.g_status_id AND status_groups.type=19;END;", "CREATE TRIGGER search_results_delete_trigger AFTER DELETE ON search_results FOR EACH ROW BEGIN DELETE FROM status_groups WHERE OLD.data_type=1 AND type=13 AND tag=OLD.search_id AND g_status_id=OLD.data_id;DELETE FROM user_groups WHERE OLD.data_type=2 AND type=3 AND tag=OLD.search_id AND user_id=OLD.data_id;DELETE FROM clusters WHERE OLD.data_type=1 AND _id=OLD.cluster_id;END;", "CREATE TRIGGER status_metadata_delete_trigger AFTER DELETE ON status_groups FOR EACH ROW BEGIN DELETE FROM status_metadata WHERE owner_id=OLD.owner_id AND status_id=OLD.g_status_id AND status_group=OLD.type AND status_group_tag=OLD.tag;END;", "CREATE TRIGGER user_metadata_delete_trigger AFTER DELETE ON user_groups FOR EACH ROW BEGIN DELETE FROM user_metadata WHERE owner_id=OLD.owner_id AND user_id=OLD.user_id AND user_group_type=OLD.type AND user_group_tag=OLD.tag;END;", "CREATE TRIGGER user_group_update_trigger AFTER UPDATE OF user_id ON user_groups FOR EACH ROW BEGIN DELETE FROM user_metadata WHERE owner_id=OLD.owner_id AND user_id=OLD.user_id AND user_group_type=OLD.type AND user_group_tag=OLD.tag;END;", "CREATE TRIGGER activity_statuses_delete_trigger AFTER DELETE ON activities FOR EACH ROW BEGIN DELETE FROM status_groups WHERE type IN(12,14) AND tag=OLD._id;END;", "CREATE TRIGGER activity_users_delete_trigger AFTER DELETE ON activities FOR EACH ROW BEGIN DELETE FROM user_groups WHERE type IN(8,13) AND tag=OLD._id;END;", "CREATE TRIGGER timeline_is_read_trigger AFTER UPDATE OF is_read ON timeline FOR EACH ROW BEGIN UPDATE status_groups SET is_read=NEW.is_read WHERE OLD.data_type=1 AND owner_id=OLD.owner_id AND g_status_id=OLD.data_id AND type=OLD.data_type_group AND tag=OLD.data_type_tag;END;", "CREATE TRIGGER stories_delete_trigger AFTER DELETE ON stories FOR EACH ROW BEGIN DELETE FROM status_groups WHERE OLD.data_type=4 AND type=29 AND OLD.story_order=tag AND OLD.data_id=g_status_id;DELETE FROM user_groups WHERE OLD.data_type IN(2,3) AND type=34 AND OLD.story_order=tag AND OLD.data_id+user_id;END;", "CREATE TRIGGER news_delete_trigger AFTER DELETE ON news FOR EACH ROW BEGIN DELETE FROM status_groups WHERE type=32 AND tag=OLD._id;DELETE FROM user_groups WHERE type=35 AND tag=OLD._id;END;" };
    }
    
    private void o() {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("user_groups", "type=?", new String[] { String.valueOf(15) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final int n, final long n2, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues(1);
            contentValues.put("tag", 0);
            final int update = writableDatabase.update("activities", contentValues, "type=? AND max_position<=?", new String[] { String.valueOf(n), String.valueOf(n2) });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (update > 0 && b != null) {
                b.a(af.a);
            }
            return update;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final int n, final String s) {
        String s2;
        String[] array;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            s2 = "type=? AND source_user_name=?";
            array = new String[] { String.valueOf(n), s };
        }
        else {
            s2 = "type=?";
            array = new String[] { String.valueOf(n) };
        }
        return this.c(s2, array);
    }
    
    public int a(final int n, final String s, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final StringBuilder append = new StringBuilder().append("type=? AND timeline_tag=? AND ");
            String s2;
            if (b) {
                s2 = "(flags&?)!=0";
            }
            else {
                s2 = "NOT ((flags&?)!=0)";
            }
            final int delete = writableDatabase.delete("timeline", append.append(s2).toString(), new String[] { String.valueOf(n), s, String.valueOf(1048576) });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (delete > 0 && b2 != null) {
                b2.a(ae.a(n));
            }
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final int n, final long[] array, final b b) {
        Label_0073: {
            if (n != 0) {
                break Label_0073;
            }
            String s = "timeline";
            Uri uri = bc.a;
            while (true) {
                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    final int a = this.a(writableDatabase, s, "_id=?", array);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    if (a > 0 && b != null) {
                        b.a(uri);
                    }
                    return a;
                    // iftrue(Label_0092:, n != 13)
                    s = "search_results";
                    uri = aw.a;
                    continue;
                    Label_0092: {
                        s = "status_groups";
                    }
                    uri = az.a;
                }
                finally {
                    writableDatabase.endTransaction();
                }
            }
        }
    }
    
    public int a(final long n, final int n2, final long n3, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("timeline", "owner_id=? AND type=? AND entity_id=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3) });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (delete > 0 && b != null) {
                b.a(ae.a(n2));
            }
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final long n, final long n2, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final bp b3 = this.b(writableDatabase, n2);
            if (b3 == null) {
                return -1;
            }
            if (b3.z == b) {
                return b3.m;
            }
            int max;
            if (b) {
                max = 1 + b3.m;
            }
            else {
                max = Math.max(0, -1 + b3.m);
            }
            final ContentValues contentValues = new ContentValues();
            contentValues.put("retweeted", b);
            contentValues.put("retweet_count", max);
            writableDatabase.update("statuses", contentValues, "status_id=?", new String[] { String.valueOf(n2) });
            if (b2 != null) {
                b2.a(bg.d);
                b2.a(bg.e);
            }
            writableDatabase.setTransactionSuccessful();
            return max;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final long n, final l l, final long n2, final int n3, final boolean b, final boolean b2, final boolean b3, final b b4) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final HashMap hashMap = new HashMap();
        final ArrayList list3 = new ArrayList();
        final Iterator<m> iterator = (Iterator<m>)l.a.iterator();
        while (iterator.hasNext()) {
            this.a(iterator.next(), list, list2, list3, hashMap, b2);
        }
        while (true) {
            int n4 = 0;
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
        Label_0253_Outer:
            while (true) {
                int n5 = 0;
                int n6 = 0;
            Label_0395:
                while (true) {
                    int n7 = 0;
                    Label_0388: {
                        try {
                            Map<Object, Object> map;
                            if (!hashMap.isEmpty()) {
                                map = (Map<Object, Object>)this.a(writableDatabase, hashMap);
                            }
                            else {
                                map = Collections.emptyMap();
                            }
                            if (!list.isEmpty()) {
                                this.a(list, n2, 13, n, false, false, false, null, true, null, true);
                            }
                            if (!list2.isEmpty()) {
                                this.a(list2, n2, 3, n, null, null, true, b4);
                            }
                            if (l.j != null) {
                                list3.addAll(l.j);
                            }
                            if (!list3.isEmpty()) {
                                this.a(list3, (b)null);
                            }
                            final Iterator iterator2 = l.a.iterator();
                            n5 = n3;
                            if (!iterator2.hasNext()) {
                                if (b) {
                                    this.c(n2, n);
                                }
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                if (b4 != null) {
                                    b4.a(aw.a);
                                    b4.a(ba.b);
                                }
                                return n4;
                            }
                            final Iterator iterator3 = this.a(n, n5, iterator2.next(), map, b2, b3).iterator();
                            n6 = n4;
                            if (!iterator3.hasNext()) {
                                break Label_0395;
                            }
                            if (writableDatabase.insert("search_results", (String)null, (ContentValues)iterator3.next()) > 0L) {
                                n7 = n6 + 1;
                                break Label_0388;
                            }
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                        n7 = n6;
                    }
                    n6 = n7;
                    continue;
                }
                ++n5;
                n4 = n6;
                continue Label_0253_Outer;
            }
        }
    }
    
    public int a(final long n, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String value = String.valueOf(n);
            final String[] array = { value };
            final String[] array2 = { value, String.valueOf(21), value };
            final int n2 = 0 + this.c(writableDatabase, n);
            final int n3 = 0 + this.a("t_data_type=1 AND t_data_id=?", array);
            final int n4 = 0 + this.a(writableDatabase, "status_id=?", array) + writableDatabase.delete("status_groups", "g_status_id=? OR (type=? AND tag=?)", array2) + writableDatabase.delete("discover", "identifier=?", array) + writableDatabase.delete("search_results", "data_type=1 AND data_id=?", array);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                if (n2 > 0) {
                    b.a(af.a);
                }
                if (n3 > 0) {
                    b.a(bc.a, bc.b, bc.c, bc.d, bc.e);
                }
                if (n4 > 0) {
                    b.a(az.a, ay.a, aw.a, ao.a);
                }
            }
            return n4 + (n2 + n3);
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final long n, final Collection collection, final String s, final b b) {
        if (collection.isEmpty()) {
            return 0;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            this.a(2, s, false, b);
            int size = collection.size();
            final long currentTimeMillis = System.currentTimeMillis();
            final ArrayList list = new ArrayList<at>(size);
            for (final TwitterTopic twitterTopic : collection) {
                list.add(new at(twitterTopic.f(), twitterTopic, currentTimeMillis, null));
                --size;
            }
            final int a = this.a(list, n, 2, s, true, false, 0L, 0L, false, null, false, b);
            writableDatabase.setTransactionSuccessful();
            return a;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final long p0, final List p1, final int p2, final b p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //     4: astore          6
        //     6: iconst_0       
        //     7: istore          7
        //     9: aload           6
        //    11: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    14: iconst_1       
        //    15: anewarray       Ljava/lang/String;
        //    18: astore          9
        //    20: aload           9
        //    22: iconst_0       
        //    23: iconst_0       
        //    24: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    27: aastore        
        //    28: aload           6
        //    30: ldc_w           "stories"
        //    33: ldc_w           "story_is_read = ?"
        //    36: aload           9
        //    38: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //    41: pop            
        //    42: iconst_1       
        //    43: anewarray       Ljava/lang/String;
        //    46: dup            
        //    47: iconst_0       
        //    48: ldc_w           "story_order"
        //    51: aastore        
        //    52: astore          11
        //    54: iconst_1       
        //    55: anewarray       Ljava/lang/String;
        //    58: astore          12
        //    60: aload           12
        //    62: iconst_0       
        //    63: iconst_1       
        //    64: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    67: aastore        
        //    68: aload           6
        //    70: ldc_w           "stories"
        //    73: aload           11
        //    75: ldc_w           "data_type=?"
        //    78: aload           12
        //    80: aconst_null    
        //    81: aconst_null    
        //    82: ldc_w           "story_order DESC"
        //    85: ldc_w           "1"
        //    88: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    91: astore          13
        //    93: iconst_0       
        //    94: istore          14
        //    96: aload           13
        //    98: ifnull          141
        //   101: aload           13
        //   103: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   108: istore          61
        //   110: iconst_0       
        //   111: istore          14
        //   113: iload           61
        //   115: ifeq            134
        //   118: aload           13
        //   120: iconst_0       
        //   121: invokeinterface android/database/Cursor.getInt:(I)I
        //   126: istore          62
        //   128: iload           62
        //   130: iconst_1       
        //   131: iadd           
        //   132: istore          14
        //   134: aload           13
        //   136: invokeinterface android/database/Cursor.close:()V
        //   141: new             Landroid/content/ContentValues;
        //   144: dup            
        //   145: invokespecial   android/content/ContentValues.<init>:()V
        //   148: astore          15
        //   150: aload           6
        //   152: ldc_w           "SELECT COUNT(*)  FROM stories WHERE story_id =?"
        //   155: invokevirtual   android/database/sqlite/SQLiteDatabase.compileStatement:(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
        //   158: astore          16
        //   160: aload_3        
        //   161: iconst_0       
        //   162: iload           4
        //   164: aload_3        
        //   165: invokeinterface java/util/List.size:()I
        //   170: invokestatic    java/lang/Math.min:(II)I
        //   173: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //   178: astore          17
        //   180: aload           17
        //   182: invokestatic    java/util/Collections.reverse:(Ljava/util/List;)V
        //   185: new             Ljava/util/HashSet;
        //   188: dup            
        //   189: invokespecial   java/util/HashSet.<init>:()V
        //   192: astore          18
        //   194: new             Ljava/util/HashSet;
        //   197: dup            
        //   198: invokespecial   java/util/HashSet.<init>:()V
        //   201: astore          19
        //   203: aload           17
        //   205: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   210: astore          20
        //   212: aload           20
        //   214: invokeinterface java/util/Iterator.hasNext:()Z
        //   219: ifeq            1263
        //   222: aload           20
        //   224: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   229: checkcast       Lmw;
        //   232: astore          26
        //   234: aload           16
        //   236: iconst_1       
        //   237: aload           26
        //   239: getfield        mw.a:Ljava/lang/String;
        //   242: invokevirtual   android/database/sqlite/SQLiteStatement.bindString:(ILjava/lang/String;)V
        //   245: aload           16
        //   247: invokevirtual   android/database/sqlite/SQLiteStatement.simpleQueryForLong:()J
        //   250: lconst_0       
        //   251: lcmp           
        //   252: ifne            1224
        //   255: getstatic       com/twitter/library/provider/bg.b:Z
        //   258: ifeq            302
        //   261: ldc             "DatabaseHelper"
        //   263: new             Ljava/lang/StringBuilder;
        //   266: dup            
        //   267: invokespecial   java/lang/StringBuilder.<init>:()V
        //   270: ldc_w           "Adding story "
        //   273: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   276: aload           26
        //   278: getfield        mw.a:Ljava/lang/String;
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   284: ldc_w           " at order "
        //   287: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   290: iload           14
        //   292: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   295: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   298: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   301: pop            
        //   302: aload           15
        //   304: ldc_w           "story_id"
        //   307: aload           26
        //   309: getfield        mw.a:Ljava/lang/String;
        //   312: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   315: aload           15
        //   317: ldc_w           "story_order"
        //   320: iload           14
        //   322: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   325: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   328: aload           15
        //   330: ldc_w           "story_type"
        //   333: aload           26
        //   335: getfield        mw.b:I
        //   338: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   341: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   344: aload           15
        //   346: ldc_w           "story_proof_type"
        //   349: aload           26
        //   351: getfield        mw.c:Lmx;
        //   354: getfield        mx.a:I
        //   357: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   360: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   363: aload           15
        //   365: ldc_w           "story_proof_addl_count"
        //   368: aload           26
        //   370: getfield        mw.c:Lmx;
        //   373: getfield        mx.b:I
        //   376: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   379: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   382: aload           15
        //   384: ldc_w           "data_type"
        //   387: iconst_1       
        //   388: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   391: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   394: aload           15
        //   396: ldc             "data_id"
        //   398: invokevirtual   android/content/ContentValues.putNull:(Ljava/lang/String;)V
        //   401: aload           15
        //   403: ldc_w           "story_is_read"
        //   406: iconst_0       
        //   407: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   410: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   413: aload           15
        //   415: ldc_w           "story_meta_title"
        //   418: aload           26
        //   420: getfield        mw.d:Ljava/lang/String;
        //   423: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   426: aload           15
        //   428: ldc_w           "story_meta_subtitle"
        //   431: aload           26
        //   433: getfield        mw.e:Ljava/lang/String;
        //   436: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   439: aload           15
        //   441: ldc_w           "story_meta_query"
        //   444: aload           26
        //   446: getfield        mw.f:Ljava/lang/String;
        //   449: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   452: aload           15
        //   454: ldc_w           "story_meta_header_img_url"
        //   457: aload           26
        //   459: getfield        mw.g:Ljava/lang/String;
        //   462: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   465: aload           15
        //   467: ldc_w           "story_source"
        //   470: aload           26
        //   472: getfield        mw.h:Ljava/lang/String;
        //   475: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   478: aload           15
        //   480: ldc_w           "story_impression_info"
        //   483: aload           26
        //   485: getfield        mw.i:Ljava/lang/String;
        //   488: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //   491: aload           15
        //   493: ldc_w           "story_existing_feedback"
        //   496: aload           26
        //   498: getfield        mw.j:I
        //   501: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   504: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   507: aload           6
        //   509: ldc_w           "stories"
        //   512: aconst_null    
        //   513: aload           15
        //   515: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   518: pop2           
        //   519: aload           15
        //   521: ldc_w           "story_proof_type"
        //   524: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   527: aload           15
        //   529: ldc_w           "story_proof_addl_count"
        //   532: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   535: aload           15
        //   537: ldc_w           "story_meta_title"
        //   540: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   543: aload           15
        //   545: ldc_w           "story_meta_subtitle"
        //   548: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   551: aload           15
        //   553: ldc_w           "story_meta_query"
        //   556: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   559: aload           15
        //   561: ldc_w           "story_meta_header_img_url"
        //   564: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   567: aload           15
        //   569: ldc_w           "story_source"
        //   572: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   575: aload           15
        //   577: ldc_w           "story_impression_info"
        //   580: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   583: aload           15
        //   585: ldc_w           "story_existing_feedback"
        //   588: invokevirtual   android/content/ContentValues.remove:(Ljava/lang/String;)V
        //   591: aload           26
        //   593: getfield        mw.c:Lmx;
        //   596: getfield        mx.c:Ljava/util/List;
        //   599: ifnull          713
        //   602: aload           26
        //   604: getfield        mw.c:Lmx;
        //   607: getfield        mx.c:Ljava/util/List;
        //   610: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   615: astore          54
        //   617: aload           54
        //   619: invokeinterface java/util/Iterator.hasNext:()Z
        //   624: ifeq            795
        //   627: aload           54
        //   629: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   634: checkcast       Lcom/twitter/library/api/TwitterUser;
        //   637: astore          55
        //   639: aload           19
        //   641: aload           55
        //   643: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   648: pop            
        //   649: aload           15
        //   651: ldc_w           "data_type"
        //   654: iconst_2       
        //   655: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   658: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   661: aload           15
        //   663: ldc             "data_id"
        //   665: aload           55
        //   667: getfield        com/twitter/library/api/TwitterUser.userId:J
        //   670: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   673: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   676: aload           6
        //   678: ldc_w           "stories"
        //   681: aconst_null    
        //   682: aload           15
        //   684: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   687: pop2           
        //   688: goto            617
        //   691: astore          8
        //   693: aload           6
        //   695: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   698: aload           8
        //   700: athrow         
        //   701: astore          60
        //   703: aload           13
        //   705: invokeinterface android/database/Cursor.close:()V
        //   710: aload           60
        //   712: athrow         
        //   713: aload           26
        //   715: getfield        mw.c:Lmx;
        //   718: getfield        mx.a:I
        //   721: bipush          14
        //   723: if_icmpne       795
        //   726: aload           26
        //   728: getfield        mw.k:Lcom/twitter/library/api/bp;
        //   731: ifnull          795
        //   734: aload           19
        //   736: aload           26
        //   738: getfield        mw.k:Lcom/twitter/library/api/bp;
        //   741: getfield        com/twitter/library/api/bp.y:Lcom/twitter/library/api/TwitterUser;
        //   744: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   749: pop            
        //   750: aload           15
        //   752: ldc_w           "data_type"
        //   755: iconst_2       
        //   756: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   759: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   762: aload           15
        //   764: ldc             "data_id"
        //   766: aload           26
        //   768: getfield        mw.k:Lcom/twitter/library/api/bp;
        //   771: getfield        com/twitter/library/api/bp.y:Lcom/twitter/library/api/TwitterUser;
        //   774: getfield        com/twitter/library/api/TwitterUser.userId:J
        //   777: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   780: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   783: aload           6
        //   785: ldc_w           "stories"
        //   788: aconst_null    
        //   789: aload           15
        //   791: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   794: pop2           
        //   795: aload           26
        //   797: getfield        mw.l:Lcom/twitter/library/api/TwitterUser;
        //   800: ifnull          930
        //   803: aload           19
        //   805: aload           26
        //   807: getfield        mw.l:Lcom/twitter/library/api/TwitterUser;
        //   810: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   815: pop            
        //   816: aload           15
        //   818: ldc_w           "data_type"
        //   821: iconst_3       
        //   822: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   825: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   828: aload           15
        //   830: ldc             "data_id"
        //   832: aload           26
        //   834: getfield        mw.l:Lcom/twitter/library/api/TwitterUser;
        //   837: getfield        com/twitter/library/api/TwitterUser.userId:J
        //   840: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   843: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   846: aload           6
        //   848: ldc_w           "stories"
        //   851: aconst_null    
        //   852: aload           15
        //   854: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   857: pop2           
        //   858: aload           26
        //   860: getfield        mw.l:Lcom/twitter/library/api/TwitterUser;
        //   863: getfield        com/twitter/library/api/TwitterUser.status:Lcom/twitter/library/api/bp;
        //   866: ifnull          930
        //   869: aload           18
        //   871: aload           26
        //   873: getfield        mw.l:Lcom/twitter/library/api/TwitterUser;
        //   876: getfield        com/twitter/library/api/TwitterUser.status:Lcom/twitter/library/api/bp;
        //   879: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   884: pop            
        //   885: aload           15
        //   887: ldc_w           "data_type"
        //   890: iconst_4       
        //   891: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   894: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   897: aload           15
        //   899: ldc             "data_id"
        //   901: aload           26
        //   903: getfield        mw.l:Lcom/twitter/library/api/TwitterUser;
        //   906: getfield        com/twitter/library/api/TwitterUser.status:Lcom/twitter/library/api/bp;
        //   909: getfield        com/twitter/library/api/bp.a:J
        //   912: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   915: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   918: aload           6
        //   920: ldc_w           "stories"
        //   923: aconst_null    
        //   924: aload           15
        //   926: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   929: pop2           
        //   930: aload           26
        //   932: getfield        mw.k:Lcom/twitter/library/api/bp;
        //   935: ifnull          1056
        //   938: aload           18
        //   940: aload           26
        //   942: getfield        mw.k:Lcom/twitter/library/api/bp;
        //   945: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   950: pop            
        //   951: aload           15
        //   953: ldc_w           "data_type"
        //   956: iconst_4       
        //   957: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   960: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   963: aload           15
        //   965: ldc             "data_id"
        //   967: aload           26
        //   969: getfield        mw.k:Lcom/twitter/library/api/bp;
        //   972: getfield        com/twitter/library/api/bp.a:J
        //   975: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   978: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   981: aload           6
        //   983: ldc_w           "stories"
        //   986: aconst_null    
        //   987: aload           15
        //   989: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   992: pop2           
        //   993: aload           26
        //   995: getfield        mw.n:Lcom/twitter/library/api/bp;
        //   998: ifnull          1056
        //  1001: aload           18
        //  1003: aload           26
        //  1005: getfield        mw.n:Lcom/twitter/library/api/bp;
        //  1008: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //  1013: pop            
        //  1014: aload           15
        //  1016: ldc_w           "data_type"
        //  1019: iconst_4       
        //  1020: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1023: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  1026: aload           15
        //  1028: ldc             "data_id"
        //  1030: aload           26
        //  1032: getfield        mw.n:Lcom/twitter/library/api/bp;
        //  1035: getfield        com/twitter/library/api/bp.a:J
        //  1038: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1041: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  1044: aload           6
        //  1046: ldc_w           "stories"
        //  1049: aconst_null    
        //  1050: aload           15
        //  1052: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  1055: pop2           
        //  1056: aload           26
        //  1058: getfield        mw.m:Ljava/util/List;
        //  1061: ifnull          1150
        //  1064: aload           26
        //  1066: getfield        mw.m:Ljava/util/List;
        //  1069: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1074: astore          34
        //  1076: aload           34
        //  1078: invokeinterface java/util/Iterator.hasNext:()Z
        //  1083: ifeq            1150
        //  1086: aload           34
        //  1088: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1093: checkcast       Lcom/twitter/library/api/bp;
        //  1096: astore          35
        //  1098: aload           18
        //  1100: aload           35
        //  1102: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //  1107: pop            
        //  1108: aload           15
        //  1110: ldc_w           "data_type"
        //  1113: iconst_4       
        //  1114: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1117: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  1120: aload           15
        //  1122: ldc             "data_id"
        //  1124: aload           35
        //  1126: getfield        com/twitter/library/api/bp.a:J
        //  1129: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1132: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  1135: aload           6
        //  1137: ldc_w           "stories"
        //  1140: aconst_null    
        //  1141: aload           15
        //  1143: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  1146: pop2           
        //  1147: goto            1076
        //  1150: aload           18
        //  1152: invokeinterface java/util/Set.isEmpty:()Z
        //  1157: ifne            1187
        //  1160: aload_0        
        //  1161: aload           18
        //  1163: lload_1        
        //  1164: bipush          29
        //  1166: iload           14
        //  1168: i2l            
        //  1169: iconst_0       
        //  1170: iconst_0       
        //  1171: iconst_0       
        //  1172: aconst_null    
        //  1173: iconst_1       
        //  1174: aconst_null    
        //  1175: iconst_1       
        //  1176: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJZZZLjava/lang/String;ZLcom/twitter/library/provider/b;Z)Ljava/util/Collection;
        //  1179: pop            
        //  1180: aload           18
        //  1182: invokeinterface java/util/Set.clear:()V
        //  1187: aload           19
        //  1189: invokeinterface java/util/Set.isEmpty:()Z
        //  1194: ifne            1382
        //  1197: aload_0        
        //  1198: aload           19
        //  1200: lload_1        
        //  1201: bipush          34
        //  1203: iload           14
        //  1205: i2l            
        //  1206: aconst_null    
        //  1207: aconst_null    
        //  1208: iconst_1       
        //  1209: aconst_null    
        //  1210: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;ZLcom/twitter/library/provider/b;)I
        //  1213: pop            
        //  1214: aload           19
        //  1216: invokeinterface java/util/Set.clear:()V
        //  1221: goto            1382
        //  1224: getstatic       com/twitter/library/provider/bg.b:Z
        //  1227: ifeq            1405
        //  1230: ldc             "DatabaseHelper"
        //  1232: new             Ljava/lang/StringBuilder;
        //  1235: dup            
        //  1236: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1239: ldc_w           "Story already exists "
        //  1242: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1245: aload           26
        //  1247: getfield        mw.a:Ljava/lang/String;
        //  1250: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1253: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1256: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //  1259: pop            
        //  1260: goto            1405
        //  1263: iload           14
        //  1265: iconst_1       
        //  1266: isub           
        //  1267: iload           4
        //  1269: isub           
        //  1270: istore          21
        //  1272: getstatic       com/twitter/library/provider/bg.b:Z
        //  1275: ifeq            1305
        //  1278: ldc             "DatabaseHelper"
        //  1280: new             Ljava/lang/StringBuilder;
        //  1283: dup            
        //  1284: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1287: ldc_w           "Should be clearing all stories with story order <= "
        //  1290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1293: iload           21
        //  1295: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1298: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1301: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //  1304: pop            
        //  1305: iconst_1       
        //  1306: anewarray       Ljava/lang/String;
        //  1309: astore          22
        //  1311: aload           22
        //  1313: iconst_0       
        //  1314: iload           21
        //  1316: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //  1319: aastore        
        //  1320: aload           6
        //  1322: ldc_w           "stories"
        //  1325: ldc_w           "story_order <= ?"
        //  1328: aload           22
        //  1330: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //  1333: pop            
        //  1334: aload           16
        //  1336: invokevirtual   android/database/sqlite/SQLiteStatement.close:()V
        //  1339: aload           6
        //  1341: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //  1344: aload           6
        //  1346: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1349: iload           7
        //  1351: ifle            1379
        //  1354: aload           5
        //  1356: ifnull          1379
        //  1359: iconst_1       
        //  1360: anewarray       Landroid/net/Uri;
        //  1363: astore          24
        //  1365: aload           24
        //  1367: iconst_0       
        //  1368: getstatic       com/twitter/library/provider/ba.a:Landroid/net/Uri;
        //  1371: aastore        
        //  1372: aload           5
        //  1374: aload           24
        //  1376: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //  1379: iload           7
        //  1381: ireturn        
        //  1382: iload           14
        //  1384: iconst_1       
        //  1385: iadd           
        //  1386: istore          27
        //  1388: iload           7
        //  1390: iconst_1       
        //  1391: iadd           
        //  1392: istore          28
        //  1394: iload           27
        //  1396: istore          14
        //  1398: iload           28
        //  1400: istore          7
        //  1402: goto            212
        //  1405: iload           14
        //  1407: istore          27
        //  1409: iload           7
        //  1411: istore          28
        //  1413: goto            1394
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  14     93     691    701    Any
        //  101    110    701    713    Any
        //  118    128    701    713    Any
        //  134    141    691    701    Any
        //  141    212    691    701    Any
        //  212    302    691    701    Any
        //  302    617    691    701    Any
        //  617    688    691    701    Any
        //  703    713    691    701    Any
        //  713    795    691    701    Any
        //  795    930    691    701    Any
        //  930    1056   691    701    Any
        //  1056   1076   691    701    Any
        //  1076   1147   691    701    Any
        //  1150   1187   691    701    Any
        //  1187   1221   691    701    Any
        //  1224   1260   691    701    Any
        //  1272   1305   691    701    Any
        //  1305   1344   691    701    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0134:
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
    
    public int a(final long n, final List list, final boolean b, final b b2, final boolean b3) {
        SQLiteDatabase writableDatabase = null;
        ArrayList list2 = null;
    Label_0055_Outer:
        while (true) {
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
            Label_0189:
                while (true) {
                    Label_0183: {
                        try {
                            final long currentTimeMillis = System.currentTimeMillis();
                            final ArrayList a = this.a(false);
                            if (b) {
                                this.a(6, "TRENDSPLUS", b, null);
                            }
                            else {
                                this.a(6, "TRENDSPLUS", b, b2);
                                if (b) {
                                    break Label_0183;
                                }
                                final boolean b4 = true;
                                this.a(6, "TRENDSPLUS", b4, b2);
                            }
                            if (!b3) {
                                final List<TwitterTopic> a2 = (List<TwitterTopic>)this.a(a, list);
                                int size = list.size();
                                list2 = new ArrayList<at>(size);
                                for (final TwitterTopic twitterTopic : a2) {
                                    list2.add(new at(twitterTopic.f(), twitterTopic, currentTimeMillis, null));
                                    --size;
                                }
                                break;
                            }
                            break Label_0189;
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                    }
                    final boolean b4 = false;
                    continue Label_0055_Outer;
                }
                final List<TwitterTopic> a2 = (List<TwitterTopic>)list;
                continue;
            }
        }
        final int a3 = this.a(null, list2, n, 6, "TRENDSPLUS", true, false, 0L, 0L, false, null, false, b2, null, null, b, new ac().a(false).a());
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        return a3;
    }
    
    public int a(final Prompt prompt, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Delete prompt: " + prompt.b());
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int[] array = { prompt.b };
            final int a = this.a(writableDatabase, "timeline", "data_type=6 AND data_id=?", array);
            this.a(writableDatabase, "prompts", "p_id=?", array);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null && a > 0) {
                b.a(bc.a, au.a);
            }
            return a;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int a(final TwitterTopic twitterTopic, final TwitterUser twitterUser, final ArrayList list, final long n, final int n2, final String s, final String s2, final String s3, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        Label_0081: {
            if (twitterTopic == null || twitterUser == null) {
                break Label_0081;
            }
            try {
                final ArrayList<TwitterUser> list2 = new ArrayList<TwitterUser>(1);
                list2.add(twitterUser);
                this.a(list2, n, 27, -1L, null, null, true, b2);
                final ArrayList<TwitterTopic> list3 = new ArrayList<TwitterTopic>(1);
                list3.add(twitterTopic);
                this.a(list3, b2);
                final int a = this.a(list, n, n2, s, b, false, 0L, 0L, false, null, true, b2, s2, s3, false, new ac().a(false).a());
                writableDatabase.setTransactionSuccessful();
                return a;
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    public int a(final com.twitter.library.api.bs p0, final ArrayList p1, final long p2, final int p3, final String p4, final boolean p5, final boolean p6, final long p7, final long p8, final boolean p9, final String p10, final boolean p11, final b p12, final String p13, final String p14, final boolean p15, final aa p16) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnonnull       19
        //     4: aload_2        
        //     5: ifnonnull       19
        //     8: new             Ljava/lang/IllegalArgumentException;
        //    11: dup            
        //    12: ldc_w           "The response and entities params can not both be null!"
        //    15: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    18: athrow         
        //    19: aload_1        
        //    20: ifnull          38
        //    23: aload_2        
        //    24: ifnull          38
        //    27: new             Ljava/lang/IllegalArgumentException;
        //    30: dup            
        //    31: ldc_w           "Either the response or entities param must be null!"
        //    34: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    37: athrow         
        //    38: new             Lcom/twitter/errorreporter/a;
        //    41: dup            
        //    42: lload_3        
        //    43: invokespecial   com/twitter/errorreporter/a.<init>:(J)V
        //    46: astore          21
        //    48: iload           5
        //    50: invokestatic    com/twitter/library/provider/ae.b:(I)I
        //    53: istore          22
        //    55: aload           21
        //    57: ldc_w           "statusGroupType"
        //    60: iload           22
        //    62: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    65: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //    68: pop            
        //    69: iload           5
        //    71: invokestatic    com/twitter/library/provider/ae.c:(I)I
        //    74: istore          24
        //    76: aload_1        
        //    77: ifnull          262
        //    80: iconst_1       
        //    81: istore          25
        //    83: aload           21
        //    85: ldc_w           "isCursoringResponse"
        //    88: iload           25
        //    90: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    93: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //    96: pop            
        //    97: iload           25
        //    99: ifeq            107
        //   102: aload_1        
        //   103: getfield        com/twitter/library/api/bs.a:Ljava/util/ArrayList;
        //   106: astore_2       
        //   107: aload           21
        //   109: ldc_w           "timelineEntities.size"
        //   112: aload_2        
        //   113: invokevirtual   java/util/ArrayList.size:()I
        //   116: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   119: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   122: pop            
        //   123: iconst_0       
        //   124: istore          28
        //   126: aload_0        
        //   127: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   130: astore          29
        //   132: aload           29
        //   134: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   137: iload           25
        //   139: ifeq            280
        //   142: aload_1        
        //   143: invokevirtual   com/twitter/library/api/bs.b:()Lcom/twitter/library/api/bt;
        //   146: astore          225
        //   148: iconst_0       
        //   149: istore          28
        //   151: aload           225
        //   153: ifnull          280
        //   156: aload           225
        //   158: getfield        com/twitter/library/api/bt.a:Lcom/twitter/library/api/timeline/RichTimeline$RequestType;
        //   161: astore          226
        //   163: aload           225
        //   165: getfield        com/twitter/library/api/bt.c:Ljava/lang/String;
        //   168: astore          227
        //   170: aload           226
        //   172: getstatic       com/twitter/library/api/timeline/RichTimeline$RequestType.c:Lcom/twitter/library/api/timeline/RichTimeline$RequestType;
        //   175: if_acmpne       280
        //   178: aload           227
        //   180: ifnull          280
        //   183: aload_0        
        //   184: iload           24
        //   186: lload_3        
        //   187: aconst_null    
        //   188: invokevirtual   com/twitter/library/provider/bg.b:(IJLjava/lang/String;)Ljava/lang/String;
        //   191: astore          228
        //   193: iconst_0       
        //   194: istore          28
        //   196: aload           228
        //   198: ifnull          280
        //   201: aload           228
        //   203: aload           227
        //   205: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   208: ifne            280
        //   211: aload           21
        //   213: ldc_w           "getOlderDiscarded"
        //   216: iconst_1       
        //   217: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   220: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   223: pop            
        //   224: aload           21
        //   226: ldc_w           "downCursor"
        //   229: aload           227
        //   231: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   234: pop            
        //   235: aload           21
        //   237: ldc_w           "bottomCursor"
        //   240: aload           228
        //   242: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   245: pop            
        //   246: aload           29
        //   248: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   251: iconst_0       
        //   252: istore          35
        //   254: aload           29
        //   256: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   259: iload           35
        //   261: ireturn        
        //   262: iconst_0       
        //   263: istore          25
        //   265: goto            83
        //   268: astore          232
        //   270: aload           21
        //   272: aload           232
        //   274: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   277: pop            
        //   278: iconst_0       
        //   279: ireturn        
        //   280: aload           17
        //   282: ifnull          322
        //   285: aload           21
        //   287: ldc_w           "saveMinPos"
        //   290: ldc_w           "BEGIN"
        //   293: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   296: pop            
        //   297: aload_0        
        //   298: bipush          9
        //   300: iload           5
        //   302: lload_3        
        //   303: aload           6
        //   305: aload           17
        //   307: invokevirtual   com/twitter/library/provider/bg.a:(IIJLjava/lang/String;Ljava/lang/String;)V
        //   310: aload           21
        //   312: ldc_w           "saveMinPos"
        //   315: ldc_w           "END"
        //   318: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   321: pop            
        //   322: aload           18
        //   324: ifnull          364
        //   327: aload           21
        //   329: ldc_w           "saveMaxPos"
        //   332: ldc_w           "BEGIN"
        //   335: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   338: pop            
        //   339: aload_0        
        //   340: bipush          10
        //   342: iload           5
        //   344: lload_3        
        //   345: aload           6
        //   347: aload           18
        //   349: invokevirtual   com/twitter/library/provider/bg.a:(IIJLjava/lang/String;Ljava/lang/String;)V
        //   352: aload           21
        //   354: ldc_w           "saveMaxPos"
        //   357: ldc_w           "END"
        //   360: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   363: pop            
        //   364: aload_2        
        //   365: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   368: ifeq            444
        //   371: aload           21
        //   373: ldc_w           "timelineEntities.empty"
        //   376: iconst_1       
        //   377: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   380: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   383: pop            
        //   384: aload           21
        //   386: ldc_w           "lastPage"
        //   389: iload           7
        //   391: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   394: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   397: pop            
        //   398: iload           7
        //   400: ifeq            420
        //   403: aload_0        
        //   404: lload_3        
        //   405: iload           5
        //   407: aload           6
        //   409: invokevirtual   com/twitter/library/provider/bg.a:(JILjava/lang/String;)V
        //   412: aload_0        
        //   413: iload           5
        //   415: aload           16
        //   417: invokespecial   com/twitter/library/provider/bg.a:(ILcom/twitter/library/provider/b;)V
        //   420: aload           29
        //   422: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   425: aload           29
        //   427: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   430: iconst_0       
        //   431: ireturn        
        //   432: astore          221
        //   434: aload           21
        //   436: aload           221
        //   438: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   441: pop            
        //   442: iconst_0       
        //   443: ireturn        
        //   444: new             Ljava/util/LinkedHashMap;
        //   447: dup            
        //   448: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   451: astore          41
        //   453: new             Ljava/util/LinkedHashSet;
        //   456: dup            
        //   457: invokespecial   java/util/LinkedHashSet.<init>:()V
        //   460: astore          42
        //   462: new             Ljava/util/LinkedHashSet;
        //   465: dup            
        //   466: invokespecial   java/util/LinkedHashSet.<init>:()V
        //   469: astore          43
        //   471: new             Ljava/util/LinkedHashSet;
        //   474: dup            
        //   475: invokespecial   java/util/LinkedHashSet.<init>:()V
        //   478: astore          44
        //   480: new             Ljava/util/ArrayList;
        //   483: dup            
        //   484: invokespecial   java/util/ArrayList.<init>:()V
        //   487: astore          45
        //   489: aload_2        
        //   490: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   493: astore          46
        //   495: aload           46
        //   497: invokeinterface java/util/Iterator.hasNext:()Z
        //   502: istore          47
        //   504: iconst_0       
        //   505: istore          28
        //   507: iload           47
        //   509: ifeq            647
        //   512: aload           46
        //   514: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   519: checkcast       Lcom/twitter/library/api/at;
        //   522: astore          48
        //   524: aload           41
        //   526: aload           48
        //   528: invokevirtual   com/twitter/library/api/at.a:()J
        //   531: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   534: aload           48
        //   536: invokevirtual   java/util/LinkedHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   539: pop            
        //   540: aload           42
        //   542: aload           48
        //   544: invokevirtual   com/twitter/library/api/at.g:()Ljava/util/Collection;
        //   547: invokevirtual   java/util/LinkedHashSet.addAll:(Ljava/util/Collection;)Z
        //   550: pop            
        //   551: aload           44
        //   553: aload           48
        //   555: invokevirtual   com/twitter/library/api/at.h:()Ljava/util/Collection;
        //   558: invokevirtual   java/util/LinkedHashSet.addAll:(Ljava/util/Collection;)Z
        //   561: pop            
        //   562: aload           48
        //   564: invokevirtual   com/twitter/library/api/at.k:()Lcom/twitter/library/api/h;
        //   567: astore          52
        //   569: iconst_0       
        //   570: istore          28
        //   572: aload           52
        //   574: ifnull          591
        //   577: aload           42
        //   579: aload           48
        //   581: invokevirtual   com/twitter/library/api/at.k:()Lcom/twitter/library/api/h;
        //   584: invokevirtual   com/twitter/library/api/h.b:()Ljava/util/List;
        //   587: invokevirtual   java/util/LinkedHashSet.addAll:(Ljava/util/Collection;)Z
        //   590: pop            
        //   591: aload           43
        //   593: aload           48
        //   595: invokevirtual   com/twitter/library/api/at.j:()Ljava/util/Collection;
        //   598: invokevirtual   java/util/LinkedHashSet.addAll:(Ljava/util/Collection;)Z
        //   601: pop            
        //   602: goto            495
        //   605: astore          33
        //   607: aload           33
        //   609: astore          34
        //   611: iload           28
        //   613: istore          35
        //   615: aload           21
        //   617: aload           34
        //   619: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   622: pop            
        //   623: aload           29
        //   625: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   628: aload           21
        //   630: invokevirtual   com/twitter/errorreporter/a.a:()Ljava/util/List;
        //   633: invokestatic    com/twitter/util/collection/CollectionUtils.a:(Ljava/util/Collection;)Z
        //   636: ifne            259
        //   639: aload           21
        //   641: invokestatic    com/twitter/errorreporter/ErrorReporter.b:(Lcom/twitter/errorreporter/a;)V
        //   644: iload           35
        //   646: ireturn        
        //   647: aload           21
        //   649: ldc_w           "tweets.size"
        //   652: aload           42
        //   654: invokevirtual   java/util/LinkedHashSet.size:()I
        //   657: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   660: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   663: pop            
        //   664: aload           21
        //   666: ldc_w           "topics.size"
        //   669: aload           43
        //   671: invokevirtual   java/util/LinkedHashSet.size:()I
        //   674: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   677: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   680: pop            
        //   681: aload           21
        //   683: ldc_w           "users.size"
        //   686: aload           44
        //   688: invokevirtual   java/util/LinkedHashSet.size:()I
        //   691: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   694: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   697: pop            
        //   698: aload           42
        //   700: invokevirtual   java/util/LinkedHashSet.isEmpty:()Z
        //   703: ifne            745
        //   706: aload           21
        //   708: ldc_w           "mergeTimelineStatuses"
        //   711: ldc_w           "BEGIN"
        //   714: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   717: pop            
        //   718: aload_0        
        //   719: aload           42
        //   721: lload_3        
        //   722: iload           22
        //   724: ldc2_w          -1
        //   727: iload           15
        //   729: invokespecial   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJZ)I
        //   732: pop            
        //   733: aload           21
        //   735: ldc_w           "mergeTimelineStatuses"
        //   738: ldc_w           "END"
        //   741: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   744: pop            
        //   745: aload           43
        //   747: invokevirtual   java/util/LinkedHashSet.isEmpty:()Z
        //   750: ifne            785
        //   753: aload           21
        //   755: ldc_w           "mergeTopics"
        //   758: ldc_w           "BEGIN"
        //   761: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   764: pop            
        //   765: aload_0        
        //   766: aload           43
        //   768: aconst_null    
        //   769: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/Collection;Lcom/twitter/library/provider/b;)Ljava/util/Collection;
        //   772: pop            
        //   773: aload           21
        //   775: ldc_w           "mergeTopics"
        //   778: ldc_w           "END"
        //   781: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   784: pop            
        //   785: aload           44
        //   787: invokevirtual   java/util/LinkedHashSet.isEmpty:()Z
        //   790: ifne            834
        //   793: aload           21
        //   795: ldc_w           "mergeUsers"
        //   798: ldc_w           "BEGIN"
        //   801: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   804: pop            
        //   805: aload_0        
        //   806: aload           44
        //   808: lload_3        
        //   809: iconst_m1      
        //   810: ldc2_w          -1
        //   813: aconst_null    
        //   814: aconst_null    
        //   815: iconst_1       
        //   816: aload           16
        //   818: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;ZLcom/twitter/library/provider/b;)I
        //   821: pop            
        //   822: aload           21
        //   824: ldc_w           "mergeUsers"
        //   827: ldc_w           "END"
        //   830: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   833: pop            
        //   834: iload           5
        //   836: bipush          6
        //   838: if_icmpeq       1089
        //   841: aload           6
        //   843: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   846: ifne            961
        //   849: ldc_w           "owner_id=? AND type=? AND timeline_tag=?"
        //   852: astore          58
        //   854: iconst_2       
        //   855: anewarray       Ljava/lang/String;
        //   858: dup            
        //   859: iconst_0       
        //   860: ldc             "entity_id"
        //   862: aastore        
        //   863: dup            
        //   864: iconst_1       
        //   865: ldc_w           "data_type_tag"
        //   868: aastore        
        //   869: astore          59
        //   871: iconst_3       
        //   872: anewarray       Ljava/lang/String;
        //   875: astore          60
        //   877: aload           60
        //   879: iconst_0       
        //   880: lload_3        
        //   881: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   884: aastore        
        //   885: aload           60
        //   887: iconst_1       
        //   888: iload           5
        //   890: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   893: aastore        
        //   894: aload           60
        //   896: iconst_2       
        //   897: aload           6
        //   899: aastore        
        //   900: aload           29
        //   902: ldc             "timeline"
        //   904: aload           59
        //   906: ldc             "entity_id"
        //   908: aload           58
        //   910: aload           60
        //   912: aload_2        
        //   913: aconst_null    
        //   914: aconst_null    
        //   915: invokestatic    com/twitter/library/provider/bg.a:(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/util/Collection;Ljava/util/Map;Ljava/util/Map;)Landroid/database/Cursor;
        //   918: astore          61
        //   920: aload           61
        //   922: ifnonnull       969
        //   925: aload           21
        //   927: ldc_w           "dedupCursor"
        //   930: ldc_w           "null"
        //   933: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //   936: pop            
        //   937: aload           29
        //   939: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   942: aload           29
        //   944: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   947: iconst_0       
        //   948: ireturn        
        //   949: astore          63
        //   951: aload           21
        //   953: aload           63
        //   955: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //   958: pop            
        //   959: iconst_0       
        //   960: ireturn        
        //   961: ldc_w           "owner_id=? AND type=?"
        //   964: astore          58
        //   966: goto            854
        //   969: aload           61
        //   971: invokeinterface android/database/Cursor.moveToNext:()Z
        //   976: ifeq            1082
        //   979: aload           61
        //   981: iconst_0       
        //   982: invokeinterface android/database/Cursor.getLong:(I)J
        //   987: lstore          205
        //   989: aload           41
        //   991: lload           205
        //   993: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   996: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   999: checkcast       Lcom/twitter/library/api/at;
        //  1002: astore          207
        //  1004: aload           207
        //  1006: ifnull          969
        //  1009: aload           207
        //  1011: invokevirtual   com/twitter/library/api/at.c:()Lcom/twitter/library/api/PromotedContent;
        //  1014: astore          208
        //  1016: aload           208
        //  1018: ifnull          1039
        //  1021: aload           208
        //  1023: invokevirtual   com/twitter/library/api/PromotedContent.hashCode:()I
        //  1026: i2l            
        //  1027: aload           61
        //  1029: iconst_1       
        //  1030: invokeinterface android/database/Cursor.getLong:(I)J
        //  1035: lcmp           
        //  1036: ifne            969
        //  1039: aload           45
        //  1041: aload           41
        //  1043: lload           205
        //  1045: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1048: invokevirtual   java/util/LinkedHashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1051: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  1056: pop            
        //  1057: goto            969
        //  1060: astore          65
        //  1062: aload           61
        //  1064: invokeinterface android/database/Cursor.close:()V
        //  1069: aload           65
        //  1071: athrow         
        //  1072: astore          30
        //  1074: aload           29
        //  1076: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1079: aload           30
        //  1081: athrow         
        //  1082: aload           61
        //  1084: invokeinterface android/database/Cursor.close:()V
        //  1089: aload           21
        //  1091: ldc_w           "dedupedTimelineEntities.size"
        //  1094: aload           45
        //  1096: invokeinterface java/util/Collection.size:()I
        //  1101: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1104: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1107: pop            
        //  1108: aload           21
        //  1110: ldc_w           "timelineEntitiesMap.size"
        //  1113: aload           41
        //  1115: invokevirtual   java/util/LinkedHashMap.size:()I
        //  1118: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1121: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1124: pop            
        //  1125: aload           45
        //  1127: invokeinterface java/util/Collection.isEmpty:()Z
        //  1132: ifne            1186
        //  1135: iconst_0       
        //  1136: istore          28
        //  1138: iload           25
        //  1140: ifeq            1267
        //  1143: aload_1        
        //  1144: invokevirtual   com/twitter/library/api/bs.a:()J
        //  1147: lstore          68
        //  1149: aload           21
        //  1151: ldc_w           "updateTimelineEntities"
        //  1154: ldc_w           "BEGIN"
        //  1157: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1160: pop            
        //  1161: aload           29
        //  1163: lload_3        
        //  1164: iload           5
        //  1166: aload           45
        //  1168: lload           68
        //  1170: invokestatic    com/twitter/library/provider/bg.a:(Landroid/database/sqlite/SQLiteDatabase;JILjava/util/Collection;J)I
        //  1173: pop            
        //  1174: aload           21
        //  1176: ldc_w           "updateTimelineEntities"
        //  1179: ldc_w           "END"
        //  1182: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1185: pop            
        //  1186: aload           41
        //  1188: invokevirtual   java/util/LinkedHashMap.isEmpty:()Z
        //  1191: ifeq            1283
        //  1194: aload           21
        //  1196: ldc_w           "timelineEntitiesMap.empty"
        //  1199: iconst_1       
        //  1200: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1203: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1206: pop            
        //  1207: aload           21
        //  1209: ldc_w           "lastPage"
        //  1212: iload           7
        //  1214: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1217: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1220: pop            
        //  1221: iload           7
        //  1223: ifeq            1243
        //  1226: aload_0        
        //  1227: lload_3        
        //  1228: iload           5
        //  1230: aload           6
        //  1232: invokevirtual   com/twitter/library/provider/bg.a:(JILjava/lang/String;)V
        //  1235: aload_0        
        //  1236: iload           5
        //  1238: aload           16
        //  1240: invokespecial   com/twitter/library/provider/bg.a:(ILcom/twitter/library/provider/b;)V
        //  1243: aload           29
        //  1245: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //  1248: aload           29
        //  1250: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1253: iconst_0       
        //  1254: ireturn        
        //  1255: astore          203
        //  1257: aload           21
        //  1259: aload           203
        //  1261: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  1264: pop            
        //  1265: iconst_0       
        //  1266: ireturn        
        //  1267: aload_2        
        //  1268: iconst_0       
        //  1269: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1272: checkcast       Lcom/twitter/library/api/at;
        //  1275: getfield        com/twitter/library/api/at.m:J
        //  1278: lstore          68
        //  1280: goto            1149
        //  1283: lconst_1       
        //  1284: aload_0        
        //  1285: lload_3        
        //  1286: iload           5
        //  1288: invokespecial   com/twitter/library/provider/bg.k:(JI)J
        //  1291: ladd           
        //  1292: lstore          73
        //  1294: new             Ljava/util/ArrayList;
        //  1297: dup            
        //  1298: invokespecial   java/util/ArrayList.<init>:()V
        //  1301: astore          75
        //  1303: new             Ljava/util/HashSet;
        //  1306: dup            
        //  1307: invokespecial   java/util/HashSet.<init>:()V
        //  1310: astore          76
        //  1312: aload           41
        //  1314: invokevirtual   java/util/LinkedHashMap.values:()Ljava/util/Collection;
        //  1317: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //  1322: astore          77
        //  1324: aload           77
        //  1326: invokeinterface java/util/Iterator.hasNext:()Z
        //  1331: istore          78
        //  1333: iconst_0       
        //  1334: istore          28
        //  1336: iload           78
        //  1338: ifeq            1375
        //  1341: aload           77
        //  1343: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1348: checkcast       Lcom/twitter/library/api/at;
        //  1351: astore          79
        //  1353: aload           75
        //  1355: aload           79
        //  1357: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1360: pop            
        //  1361: aload           76
        //  1363: aload           79
        //  1365: invokevirtual   com/twitter/library/api/at.i:()Ljava/util/Collection;
        //  1368: invokevirtual   java/util/HashSet.addAll:(Ljava/util/Collection;)Z
        //  1371: pop            
        //  1372: goto            1324
        //  1375: aload           76
        //  1377: invokevirtual   java/util/HashSet.isEmpty:()Z
        //  1380: ifne            1662
        //  1383: aload           21
        //  1385: ldc_w           "conversationTweetIds.size"
        //  1388: aload           76
        //  1390: invokevirtual   java/util/HashSet.size:()I
        //  1393: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1396: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1399: pop            
        //  1400: new             Ljava/util/HashMap;
        //  1403: dup            
        //  1404: invokespecial   java/util/HashMap.<init>:()V
        //  1407: astore          187
        //  1409: iconst_2       
        //  1410: anewarray       Ljava/lang/String;
        //  1413: astore          188
        //  1415: aload           188
        //  1417: iconst_0       
        //  1418: lload_3        
        //  1419: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  1422: aastore        
        //  1423: aload           188
        //  1425: iconst_1       
        //  1426: iload           5
        //  1428: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //  1431: aastore        
        //  1432: aload           29
        //  1434: ldc             "timeline"
        //  1436: iconst_2       
        //  1437: anewarray       Ljava/lang/String;
        //  1440: dup            
        //  1441: iconst_0       
        //  1442: ldc             "data_id"
        //  1444: aastore        
        //  1445: dup            
        //  1446: iconst_1       
        //  1447: ldc_w           "flags"
        //  1450: aastore        
        //  1451: ldc_w           "owner_id=? AND type=? AND data_type=1 AND (flags&4=4 OR flags&8=8)"
        //  1454: aload           188
        //  1456: aconst_null    
        //  1457: aconst_null    
        //  1458: aconst_null    
        //  1459: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  1462: astore          189
        //  1464: aload           189
        //  1466: ifnull          1529
        //  1469: aload           189
        //  1471: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1476: ifeq            1522
        //  1479: aload           187
        //  1481: aload           189
        //  1483: iconst_0       
        //  1484: invokeinterface android/database/Cursor.getLong:(I)J
        //  1489: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1492: aload           189
        //  1494: iconst_1       
        //  1495: invokeinterface android/database/Cursor.getInt:(I)I
        //  1500: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1503: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1506: pop            
        //  1507: goto            1469
        //  1510: astore          199
        //  1512: aload           189
        //  1514: invokeinterface android/database/Cursor.close:()V
        //  1519: aload           199
        //  1521: athrow         
        //  1522: aload           189
        //  1524: invokeinterface android/database/Cursor.close:()V
        //  1529: aload           21
        //  1531: ldc_w           "deleteStaleTimelineEntities"
        //  1534: ldc_w           "BEGIN"
        //  1537: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1540: pop            
        //  1541: aload_0        
        //  1542: aload           29
        //  1544: lload_3        
        //  1545: iload           5
        //  1547: aload           76
        //  1549: invokespecial   com/twitter/library/provider/bg.a:(Landroid/database/sqlite/SQLiteDatabase;JILjava/util/HashSet;)I
        //  1552: pop            
        //  1553: aload           21
        //  1555: ldc_w           "deleteStaleTimelineEntities"
        //  1558: ldc_w           "END"
        //  1561: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1564: pop            
        //  1565: aload           75
        //  1567: aload           187
        //  1569: invokestatic    com/twitter/library/provider/bg.a:(Ljava/util/List;Ljava/util/HashMap;)Landroid/util/Pair;
        //  1572: astore          193
        //  1574: aload           193
        //  1576: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1579: checkcast       Ljava/util/List;
        //  1582: astore          75
        //  1584: aload           193
        //  1586: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  1589: checkcast       Ljava/util/Set;
        //  1592: astore          194
        //  1594: aload           21
        //  1596: ldc_w           "statusesToUpdate.size"
        //  1599: aload           194
        //  1601: invokeinterface java/util/Set.size:()I
        //  1606: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1609: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1612: pop            
        //  1613: aload           194
        //  1615: invokeinterface java/util/Set.isEmpty:()Z
        //  1620: ifne            1662
        //  1623: aload           21
        //  1625: ldc_w           "mergeTimelineStatuses"
        //  1628: ldc_w           "BEGIN"
        //  1631: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1634: pop            
        //  1635: aload_0        
        //  1636: aload           194
        //  1638: lload_3        
        //  1639: iload           22
        //  1641: ldc2_w          -1
        //  1644: iload           15
        //  1646: invokespecial   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJZ)I
        //  1649: pop            
        //  1650: aload           21
        //  1652: ldc_w           "mergeTimelineStatuses"
        //  1655: ldc_w           "END"
        //  1658: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1661: pop            
        //  1662: iconst_0       
        //  1663: istore          28
        //  1665: iload           25
        //  1667: ifeq            4539
        //  1670: aload_1        
        //  1671: invokevirtual   com/twitter/library/api/bs.a:()J
        //  1674: lstore          82
        //  1676: new             Landroid/content/ContentValues;
        //  1679: dup            
        //  1680: invokespecial   android/content/ContentValues.<init>:()V
        //  1683: astore          84
        //  1685: aload           21
        //  1687: ldc_w           "timelineEntitiesToMerge.size"
        //  1690: aload           75
        //  1692: invokeinterface java/util/List.size:()I
        //  1697: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1700: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  1703: pop            
        //  1704: aload           75
        //  1706: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1711: astore          86
        //  1713: aload           86
        //  1715: invokeinterface java/util/Iterator.hasNext:()Z
        //  1720: ifeq            3579
        //  1723: aload           86
        //  1725: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1730: checkcast       Lcom/twitter/library/api/at;
        //  1733: astore          118
        //  1735: aload           84
        //  1737: invokevirtual   android/content/ContentValues.clear:()V
        //  1740: aload           84
        //  1742: ldc             "owner_id"
        //  1744: lload_3        
        //  1745: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1748: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  1751: aload           84
        //  1753: ldc             "type"
        //  1755: iload           5
        //  1757: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1760: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  1763: aload           84
        //  1765: ldc_w           "is_read"
        //  1768: iconst_0       
        //  1769: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1772: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  1775: aload           84
        //  1777: ldc_w           "timeline_tag"
        //  1780: aload           6
        //  1782: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //  1785: aload           84
        //  1787: ldc             "entity_id"
        //  1789: aload           118
        //  1791: invokevirtual   com/twitter/library/api/at.a:()J
        //  1794: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1797: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  1800: aload           84
        //  1802: ldc_w           "entity_type"
        //  1805: aload           118
        //  1807: getfield        com/twitter/library/api/at.b:I
        //  1810: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1813: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  1816: iload           25
        //  1818: ifeq            2053
        //  1821: lload           82
        //  1823: lstore          119
        //  1825: aload           84
        //  1827: ldc             "timeline_group_id"
        //  1829: lload           119
        //  1831: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1834: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  1837: aload           84
        //  1839: ldc_w           "timeline_scribe_group_id"
        //  1842: aload           118
        //  1844: getfield        com/twitter/library/api/at.n:J
        //  1847: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1850: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  1853: iload           5
        //  1855: ifeq            1864
        //  1858: iload           5
        //  1860: iconst_1       
        //  1861: if_icmpne       2063
        //  1864: aload           118
        //  1866: getfield        com/twitter/library/api/at.d:J
        //  1869: lconst_0       
        //  1870: lcmp           
        //  1871: ifgt            2063
        //  1874: aload_0        
        //  1875: lload_3        
        //  1876: iload           5
        //  1878: invokevirtual   com/twitter/library/provider/bg.i:(JI)J
        //  1881: lstore          121
        //  1883: aload           84
        //  1885: ldc             "sort_index"
        //  1887: lload           121
        //  1889: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1892: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  1895: ldc2_w          -1
        //  1898: aload           118
        //  1900: getfield        com/twitter/library/api/at.o:J
        //  1903: lcmp           
        //  1904: ifeq            4547
        //  1907: aload           118
        //  1909: getfield        com/twitter/library/api/at.o:J
        //  1912: lstore          123
        //  1914: aload           84
        //  1916: ldc_w           "updated_at"
        //  1919: lload           123
        //  1921: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1924: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  1927: aload           118
        //  1929: getfield        com/twitter/library/api/at.e:Lcom/twitter/library/api/bp;
        //  1932: ifnull          2092
        //  1935: aload           118
        //  1937: invokevirtual   com/twitter/library/api/at.d:()Z
        //  1940: ifeq            4554
        //  1943: ldc_w           65536
        //  1946: istore          185
        //  1948: aload           118
        //  1950: invokevirtual   com/twitter/library/api/at.e:()Z
        //  1953: ifeq            1964
        //  1956: iload           185
        //  1958: ldc_w           67108864
        //  1961: ior            
        //  1962: istore          185
        //  1964: aload           118
        //  1966: invokevirtual   com/twitter/library/api/at.f:()Z
        //  1969: ifeq            1980
        //  1972: iload           185
        //  1974: sipush          256
        //  1977: ior            
        //  1978: istore          185
        //  1980: aload           118
        //  1982: getfield        com/twitter/library/api/at.c:I
        //  1985: tableswitch {
        //                4: 4560
        //                5: 4571
        //                6: 2073
        //          default: 2012
        //        }
        //  2012: aload           118
        //  2014: getfield        com/twitter/library/api/at.e:Lcom/twitter/library/api/bp;
        //  2017: iload           22
        //  2019: aconst_null    
        //  2020: iload           185
        //  2022: aload           84
        //  2024: iload           19
        //  2026: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/bp;I[BILandroid/content/ContentValues;Z)V
        //  2029: aload           29
        //  2031: ldc             "timeline"
        //  2033: aconst_null    
        //  2034: aload           84
        //  2036: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2039: lconst_0       
        //  2040: lcmp           
        //  2041: ifle            4483
        //  2044: iload           28
        //  2046: iconst_1       
        //  2047: iadd           
        //  2048: istore          35
        //  2050: goto            4532
        //  2053: aload           118
        //  2055: getfield        com/twitter/library/api/at.m:J
        //  2058: lstore          119
        //  2060: goto            1825
        //  2063: aload           118
        //  2065: getfield        com/twitter/library/api/at.d:J
        //  2068: lstore          121
        //  2070: goto            1883
        //  2073: aload           84
        //  2075: ldc_w           "data_origin_id"
        //  2078: aload           118
        //  2080: getfield        com/twitter/library/api/at.g:Lcom/twitter/library/api/TwitterTopic;
        //  2083: invokevirtual   com/twitter/library/api/TwitterTopic.b:()Ljava/lang/String;
        //  2086: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //  2089: goto            2012
        //  2092: aload           118
        //  2094: getfield        com/twitter/library/api/at.f:Lcom/twitter/library/api/Conversation;
        //  2097: ifnull          2288
        //  2100: aload           118
        //  2102: getfield        com/twitter/library/api/at.f:Lcom/twitter/library/api/Conversation;
        //  2105: getfield        com/twitter/library/api/Conversation.b:[Lcom/twitter/library/api/bp;
        //  2108: arraylength    
        //  2109: istore          170
        //  2111: iload           170
        //  2113: iconst_1       
        //  2114: isub           
        //  2115: istore          171
        //  2117: aload           118
        //  2119: getfield        com/twitter/library/api/at.f:Lcom/twitter/library/api/Conversation;
        //  2122: invokevirtual   com/twitter/library/api/Conversation.b:()Z
        //  2125: istore          172
        //  2127: iconst_0       
        //  2128: istore          173
        //  2130: iload           28
        //  2132: istore          35
        //  2134: iload           173
        //  2136: iload           170
        //  2138: if_icmpge       4532
        //  2141: iload           173
        //  2143: iconst_1       
        //  2144: if_icmpne       4525
        //  2147: iload           172
        //  2149: ifeq            4525
        //  2152: aload           118
        //  2154: getfield        com/twitter/library/api/at.f:Lcom/twitter/library/api/Conversation;
        //  2157: getfield        com/twitter/library/api/Conversation.a:Lcom/twitter/library/api/Conversation$Metadata;
        //  2160: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2163: aconst_null    
        //  2164: iconst_2       
        //  2165: aload           84
        //  2167: invokestatic    com/twitter/library/provider/bg.a:([B[BILandroid/content/ContentValues;)V
        //  2170: aload           29
        //  2172: ldc             "timeline"
        //  2174: aconst_null    
        //  2175: aload           84
        //  2177: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2180: lstore          183
        //  2182: lload           183
        //  2184: lconst_0       
        //  2185: lcmp           
        //  2186: ifle            4525
        //  2189: iload           35
        //  2191: iconst_1       
        //  2192: iadd           
        //  2193: istore          174
        //  2195: iload           173
        //  2197: iload           171
        //  2199: if_icmpne       2282
        //  2202: bipush          8
        //  2204: istore          175
        //  2206: aload           118
        //  2208: getfield        com/twitter/library/api/at.f:Lcom/twitter/library/api/Conversation;
        //  2211: getfield        com/twitter/library/api/Conversation.b:[Lcom/twitter/library/api/bp;
        //  2214: iload           173
        //  2216: aaload         
        //  2217: astore          177
        //  2219: aload           177
        //  2221: iload           22
        //  2223: aconst_null    
        //  2224: iload           175
        //  2226: aload           84
        //  2228: iload           19
        //  2230: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/bp;I[BILandroid/content/ContentValues;Z)V
        //  2233: aload           29
        //  2235: ldc             "timeline"
        //  2237: aconst_null    
        //  2238: aload           84
        //  2240: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2243: lstore          178
        //  2245: lload           178
        //  2247: lconst_0       
        //  2248: lcmp           
        //  2249: ifle            4518
        //  2252: iload           174
        //  2254: iconst_1       
        //  2255: iadd           
        //  2256: istore          180
        //  2258: aload           76
        //  2260: aload           177
        //  2262: invokevirtual   com/twitter/library/api/bp.a:()J
        //  2265: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2268: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  2271: pop            
        //  2272: iload           180
        //  2274: istore          35
        //  2276: iinc            173, 1
        //  2279: goto            2134
        //  2282: iconst_4       
        //  2283: istore          175
        //  2285: goto            2206
        //  2288: aload           118
        //  2290: getfield        com/twitter/library/api/at.g:Lcom/twitter/library/api/TwitterTopic;
        //  2293: ifnull          2732
        //  2296: aload           118
        //  2298: getfield        com/twitter/library/api/at.g:Lcom/twitter/library/api/TwitterTopic;
        //  2301: astore          161
        //  2303: iload           5
        //  2305: iconst_2       
        //  2306: if_icmpeq       2316
        //  2309: iload           5
        //  2311: bipush          6
        //  2313: if_icmpne       2593
        //  2316: aload           84
        //  2318: aload           161
        //  2320: aload           161
        //  2322: invokevirtual   com/twitter/library/api/TwitterTopic.d:()Lcom/twitter/library/api/TwitterTopic$Metadata;
        //  2325: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2328: bipush          64
        //  2330: iload           19
        //  2332: invokestatic    com/twitter/library/provider/bg.a:(Landroid/content/ContentValues;Lcom/twitter/library/api/TwitterTopic;[BIZ)V
        //  2335: aload           29
        //  2337: ldc             "timeline"
        //  2339: aconst_null    
        //  2340: aload           84
        //  2342: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2345: lconst_0       
        //  2346: lcmp           
        //  2347: ifle            4582
        //  2350: iinc            28, 1
        //  2353: goto            4582
        //  2356: aload           161
        //  2358: invokevirtual   com/twitter/library/api/TwitterTopic.d:()Lcom/twitter/library/api/TwitterTopic$Metadata;
        //  2361: getfield        com/twitter/library/api/TwitterTopic$Metadata.type:I
        //  2364: istore          163
        //  2366: iload           163
        //  2368: iconst_1       
        //  2369: if_icmpeq       4607
        //  2372: iload           163
        //  2374: iconst_3       
        //  2375: if_icmpeq       4607
        //  2378: iconst_1       
        //  2379: istore          162
        //  2381: iload           162
        //  2383: ifeq            2442
        //  2386: aload           161
        //  2388: invokevirtual   com/twitter/library/api/TwitterTopic.d:()Lcom/twitter/library/api/TwitterTopic$Metadata;
        //  2391: getfield        com/twitter/library/api/TwitterTopic$Metadata.type:I
        //  2394: tableswitch {
        //                4: 4613
        //          default: 4601
        //        }
        //  2412: aload           161
        //  2414: aconst_null    
        //  2415: iload           164
        //  2417: aload           84
        //  2419: iload           19
        //  2421: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/TwitterTopic;[BILandroid/content/ContentValues;Z)V
        //  2424: aload           29
        //  2426: ldc             "timeline"
        //  2428: aconst_null    
        //  2429: aload           84
        //  2431: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2434: lconst_0       
        //  2435: lcmp           
        //  2436: ifle            2442
        //  2439: iinc            28, 1
        //  2442: aload           161
        //  2444: invokevirtual   com/twitter/library/api/TwitterTopic.r:()Ljava/util/ArrayList;
        //  2447: ifnull          2636
        //  2450: aload           118
        //  2452: getfield        com/twitter/library/api/at.h:Lcom/twitter/library/api/TimelineScribeContent;
        //  2455: ifnull          2620
        //  2458: aload           118
        //  2460: getfield        com/twitter/library/api/at.h:Lcom/twitter/library/api/TimelineScribeContent;
        //  2463: astore          168
        //  2465: aload           168
        //  2467: iconst_0       
        //  2468: putfield        com/twitter/library/api/TimelineScribeContent.tweetProofCursor:I
        //  2471: aload           168
        //  2473: aload           161
        //  2475: invokevirtual   com/twitter/library/api/TwitterTopic.d:()Lcom/twitter/library/api/TwitterTopic$Metadata;
        //  2478: getfield        com/twitter/library/api/TwitterTopic$Metadata.type:I
        //  2481: putfield        com/twitter/library/api/TimelineScribeContent.eventType:I
        //  2484: aload           168
        //  2486: aload           161
        //  2488: invokevirtual   com/twitter/library/api/TwitterTopic.f:()Ljava/lang/String;
        //  2491: putfield        com/twitter/library/api/TimelineScribeContent.query:Ljava/lang/String;
        //  2494: aload           168
        //  2496: aload           161
        //  2498: invokevirtual   com/twitter/library/api/TwitterTopic.m:()J
        //  2501: putfield        com/twitter/library/api/TimelineScribeContent.tweetCount:J
        //  2504: aload           161
        //  2506: invokevirtual   com/twitter/library/api/TwitterTopic.r:()Ljava/util/ArrayList;
        //  2509: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2512: astore          169
        //  2514: aload           169
        //  2516: invokeinterface java/util/Iterator.hasNext:()Z
        //  2521: ifeq            2636
        //  2524: aload           169
        //  2526: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2531: checkcast       Lcom/twitter/library/api/bp;
        //  2534: iload           22
        //  2536: aconst_null    
        //  2537: sipush          2048
        //  2540: aload           84
        //  2542: iload           19
        //  2544: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/bp;I[BILandroid/content/ContentValues;Z)V
        //  2547: aload           84
        //  2549: ldc_w           "scribe_content"
        //  2552: aload           168
        //  2554: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2557: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //  2560: aload           29
        //  2562: ldc             "timeline"
        //  2564: aconst_null    
        //  2565: aload           84
        //  2567: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2570: lconst_0       
        //  2571: lcmp           
        //  2572: ifle            2578
        //  2575: iinc            28, 1
        //  2578: aload           168
        //  2580: iconst_1       
        //  2581: aload           168
        //  2583: getfield        com/twitter/library/api/TimelineScribeContent.tweetProofCursor:I
        //  2586: iadd           
        //  2587: putfield        com/twitter/library/api/TimelineScribeContent.tweetProofCursor:I
        //  2590: goto            2514
        //  2593: aload           161
        //  2595: invokevirtual   com/twitter/library/api/TwitterTopic.d:()Lcom/twitter/library/api/TwitterTopic$Metadata;
        //  2598: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2601: aload           118
        //  2603: getfield        com/twitter/library/api/at.h:Lcom/twitter/library/api/TimelineScribeContent;
        //  2606: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2609: sipush          128
        //  2612: aload           84
        //  2614: invokestatic    com/twitter/library/provider/bg.a:([B[BILandroid/content/ContentValues;)V
        //  2617: goto            2335
        //  2620: new             Lcom/twitter/library/api/TimelineScribeContent;
        //  2623: dup            
        //  2624: invokespecial   com/twitter/library/api/TimelineScribeContent.<init>:()V
        //  2627: astore          167
        //  2629: aload           167
        //  2631: astore          168
        //  2633: goto            2465
        //  2636: iload           28
        //  2638: istore          35
        //  2640: iload           5
        //  2642: iconst_2       
        //  2643: if_icmpeq       2651
        //  2646: iload           5
        //  2648: ifne            4532
        //  2651: aload           118
        //  2653: getfield        com/twitter/library/api/at.g:Lcom/twitter/library/api/TwitterTopic;
        //  2656: invokevirtual   com/twitter/library/api/TwitterTopic.d:()Lcom/twitter/library/api/TwitterTopic$Metadata;
        //  2659: getfield        com/twitter/library/api/TwitterTopic$Metadata.type:I
        //  2662: tableswitch {
        //                4: 2680
        //          default: 4621
        //        }
        //  2680: aload           118
        //  2682: getfield        com/twitter/library/api/at.g:Lcom/twitter/library/api/TwitterTopic;
        //  2685: invokevirtual   com/twitter/library/api/TwitterTopic.d:()Lcom/twitter/library/api/TwitterTopic$Metadata;
        //  2688: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2691: aload           118
        //  2693: getfield        com/twitter/library/api/at.h:Lcom/twitter/library/api/TimelineScribeContent;
        //  2696: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2699: sipush          128
        //  2702: aload           84
        //  2704: invokestatic    com/twitter/library/provider/bg.a:([B[BILandroid/content/ContentValues;)V
        //  2707: aload           29
        //  2709: ldc             "timeline"
        //  2711: aconst_null    
        //  2712: aload           84
        //  2714: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2717: lstore          165
        //  2719: lload           165
        //  2721: lconst_0       
        //  2722: lcmp           
        //  2723: ifle            4532
        //  2726: iinc            35, 1
        //  2729: goto            4532
        //  2732: aload           118
        //  2734: getfield        com/twitter/library/api/at.l:Lcom/twitter/library/api/Prompt;
        //  2737: ifnull          2810
        //  2740: aload           21
        //  2742: ldc_w           "savePrompt"
        //  2745: ldc_w           "BEGIN"
        //  2748: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  2751: pop            
        //  2752: aload           118
        //  2754: getfield        com/twitter/library/api/at.l:Lcom/twitter/library/api/Prompt;
        //  2757: ldc_w           4194304
        //  2760: aload           84
        //  2762: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/Prompt;ILandroid/content/ContentValues;)V
        //  2765: aload           29
        //  2767: ldc             "timeline"
        //  2769: aconst_null    
        //  2770: aload           84
        //  2772: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2775: lstore          158
        //  2777: lload           158
        //  2779: lconst_0       
        //  2780: lcmp           
        //  2781: ifle            4511
        //  2784: iload           28
        //  2786: iconst_1       
        //  2787: iadd           
        //  2788: istore          35
        //  2790: aload           21
        //  2792: ldc_w           "savePrompt"
        //  2795: ldc_w           "END"
        //  2798: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  2801: pop            
        //  2802: goto            4532
        //  2805: astore          34
        //  2807: goto            615
        //  2810: aload           118
        //  2812: getfield        com/twitter/library/api/at.j:Lcom/twitter/library/api/Recap;
        //  2815: ifnull          3034
        //  2818: aload           20
        //  2820: getfield        com/twitter/library/api/timeline/aa.a:Z
        //  2823: ifeq            3034
        //  2826: aload           21
        //  2828: ldc_w           "saveRecap"
        //  2831: ldc_w           "BEGIN"
        //  2834: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  2837: pop            
        //  2838: aload           118
        //  2840: getfield        com/twitter/library/api/at.j:Lcom/twitter/library/api/Recap;
        //  2843: astore          148
        //  2845: aload           148
        //  2847: getfield        com/twitter/library/api/Recap.c:Lcom/twitter/library/api/Recap$Metadata;
        //  2850: getfield        com/twitter/library/api/Recap$Metadata.display:Z
        //  2853: ifeq            4504
        //  2856: aload           148
        //  2858: getfield        com/twitter/library/api/Recap.c:Lcom/twitter/library/api/Recap$Metadata;
        //  2861: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2864: astore          150
        //  2866: aload           150
        //  2868: aconst_null    
        //  2869: ldc_w           16777216
        //  2872: aload           84
        //  2874: invokestatic    com/twitter/library/provider/bg.a:([B[BILandroid/content/ContentValues;)V
        //  2877: aload           29
        //  2879: ldc             "timeline"
        //  2881: aconst_null    
        //  2882: aload           84
        //  2884: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2887: lconst_0       
        //  2888: lcmp           
        //  2889: ifle            2895
        //  2892: iinc            28, 1
        //  2895: aload           148
        //  2897: getfield        com/twitter/library/api/Recap.a:Ljava/util/ArrayList;
        //  2900: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //  2903: astore          151
        //  2905: iload           28
        //  2907: istore          127
        //  2909: aload           151
        //  2911: invokeinterface java/util/Iterator.hasNext:()Z
        //  2916: ifeq            3015
        //  2919: aload           151
        //  2921: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2926: checkcast       Lcom/twitter/library/api/bp;
        //  2929: astore          152
        //  2931: aload           152
        //  2933: iload           22
        //  2935: aload           150
        //  2937: ldc_w           33554432
        //  2940: aload           84
        //  2942: iload           19
        //  2944: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/bp;I[BILandroid/content/ContentValues;Z)V
        //  2947: aload           148
        //  2949: getfield        com/twitter/library/api/Recap.b:Ljava/util/HashMap;
        //  2952: aload           152
        //  2954: invokevirtual   com/twitter/library/api/bp.b:()Ljava/lang/String;
        //  2957: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2960: checkcast       Lcom/twitter/library/api/EntityScribeContent;
        //  2963: astore          153
        //  2965: aload           153
        //  2967: ifnull          2983
        //  2970: aload           84
        //  2972: ldc_w           "scribe_content"
        //  2975: aload           153
        //  2977: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  2980: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //  2983: aload           29
        //  2985: ldc             "timeline"
        //  2987: aconst_null    
        //  2988: aload           84
        //  2990: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  2993: lstore          154
        //  2995: lload           154
        //  2997: lconst_0       
        //  2998: lcmp           
        //  2999: ifle            4497
        //  3002: iload           127
        //  3004: iconst_1       
        //  3005: iadd           
        //  3006: istore          156
        //  3008: iload           156
        //  3010: istore          127
        //  3012: goto            2909
        //  3015: iload           127
        //  3017: istore          35
        //  3019: aload           21
        //  3021: ldc_w           "saveRecap"
        //  3024: ldc_w           "END"
        //  3027: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3030: pop            
        //  3031: goto            4532
        //  3034: aload           118
        //  3036: getfield        com/twitter/library/api/at.k:Lcom/twitter/library/api/WhoToFollow;
        //  3039: ifnull          3463
        //  3042: aload           21
        //  3044: ldc_w           "saveWhoToFollow"
        //  3047: ldc_w           "BEGIN"
        //  3050: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3053: pop            
        //  3054: aload           118
        //  3056: getfield        com/twitter/library/api/at.k:Lcom/twitter/library/api/WhoToFollow;
        //  3059: astore          133
        //  3061: aload           133
        //  3063: getfield        com/twitter/library/api/WhoToFollow.c:Lcom/twitter/library/api/WhoToFollow$Metadata;
        //  3066: getfield        com/twitter/library/api/WhoToFollow$Metadata.type:I
        //  3069: tableswitch {
        //                2: 3123
        //                3: 3280
        //          default: 3092
        //        }
        //  3092: aload           21
        //  3094: ldc_w           "saveWhoToFollow"
        //  3097: ldc_w           "UNKNOWN_TYPE"
        //  3100: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3103: pop            
        //  3104: iload           28
        //  3106: istore          35
        //  3108: aload           21
        //  3110: ldc_w           "saveWhoToFollow"
        //  3113: ldc_w           "END"
        //  3116: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3119: pop            
        //  3120: goto            4532
        //  3123: aload           20
        //  3125: getfield        com/twitter/library/api/timeline/aa.b:Z
        //  3128: ifeq            3104
        //  3131: aload           21
        //  3133: ldc_w           "saveWhoToFollow(tweet)"
        //  3136: ldc_w           "BEGIN"
        //  3139: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3142: pop            
        //  3143: aload           133
        //  3145: getfield        com/twitter/library/api/WhoToFollow.b:Ljava/util/List;
        //  3148: invokestatic    com/twitter/util/collection/CollectionUtils.a:(Ljava/util/List;)Ljava/lang/Object;
        //  3151: checkcast       Lcom/twitter/library/api/bp;
        //  3154: astore          143
        //  3156: aload           133
        //  3158: getfield        com/twitter/library/api/WhoToFollow.c:Lcom/twitter/library/api/WhoToFollow$Metadata;
        //  3161: ifnull          3261
        //  3164: aload           143
        //  3166: ifnull          3261
        //  3169: aload           143
        //  3171: getfield        com/twitter/library/api/bp.y:Lcom/twitter/library/api/TwitterUser;
        //  3174: ifnull          3261
        //  3177: aload           143
        //  3179: iload           22
        //  3181: aload           133
        //  3183: getfield        com/twitter/library/api/WhoToFollow.c:Lcom/twitter/library/api/WhoToFollow$Metadata;
        //  3186: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  3189: ldc_w           268435456
        //  3192: aload           84
        //  3194: iload           19
        //  3196: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/bp;I[BILandroid/content/ContentValues;Z)V
        //  3199: aload           133
        //  3201: getfield        com/twitter/library/api/WhoToFollow.c:Lcom/twitter/library/api/WhoToFollow$Metadata;
        //  3204: getfield        com/twitter/library/api/WhoToFollow$Metadata.userScribeContent:Ljava/util/Map;
        //  3207: aload           143
        //  3209: getfield        com/twitter/library/api/bp.y:Lcom/twitter/library/api/TwitterUser;
        //  3212: invokevirtual   com/twitter/library/api/TwitterUser.b:()Ljava/lang/String;
        //  3215: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3220: checkcast       Lcom/twitter/library/api/EntityScribeContent;
        //  3223: astore          145
        //  3225: aload           145
        //  3227: ifnull          3243
        //  3230: aload           84
        //  3232: ldc_w           "scribe_content"
        //  3235: aload           145
        //  3237: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  3240: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //  3243: aload           29
        //  3245: ldc             "timeline"
        //  3247: aconst_null    
        //  3248: aload           84
        //  3250: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  3253: lconst_0       
        //  3254: lcmp           
        //  3255: ifle            3261
        //  3258: iinc            28, 1
        //  3261: aload           21
        //  3263: ldc_w           "saveWhoToFollow(tweet)"
        //  3266: ldc_w           "END"
        //  3269: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3272: pop            
        //  3273: iload           28
        //  3275: istore          35
        //  3277: goto            3108
        //  3280: aload           20
        //  3282: getfield        com/twitter/library/api/timeline/aa.c:Z
        //  3285: ifeq            3104
        //  3288: aload           21
        //  3290: ldc_w           "saveWhoToFollow(followModule)"
        //  3293: ldc_w           "BEGIN"
        //  3296: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3299: pop            
        //  3300: aload           133
        //  3302: getfield        com/twitter/library/api/WhoToFollow.c:Lcom/twitter/library/api/WhoToFollow$Metadata;
        //  3305: ifnull          3444
        //  3308: aload           133
        //  3310: getfield        com/twitter/library/api/WhoToFollow.a:Ljava/util/List;
        //  3313: invokestatic    com/twitter/util/collection/CollectionUtils.a:(Ljava/util/Collection;)Z
        //  3316: ifne            3444
        //  3319: aload           133
        //  3321: getfield        com/twitter/library/api/WhoToFollow.c:Lcom/twitter/library/api/WhoToFollow$Metadata;
        //  3324: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //  3327: astore          137
        //  3329: aload           137
        //  3331: aconst_null    
        //  3332: ldc_w           134217728
        //  3335: aload           84
        //  3337: invokestatic    com/twitter/library/provider/bg.a:([B[BILandroid/content/ContentValues;)V
        //  3340: aload           29
        //  3342: ldc             "timeline"
        //  3344: aconst_null    
        //  3345: aload           84
        //  3347: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  3350: lconst_0       
        //  3351: lcmp           
        //  3352: ifle            3358
        //  3355: iinc            28, 1
        //  3358: aload           133
        //  3360: getfield        com/twitter/library/api/WhoToFollow.a:Ljava/util/List;
        //  3363: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3368: astore          138
        //  3370: iload           28
        //  3372: istore          127
        //  3374: aload           138
        //  3376: invokeinterface java/util/Iterator.hasNext:()Z
        //  3381: ifeq            3440
        //  3384: aload           138
        //  3386: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3391: checkcast       Lcom/twitter/library/api/TwitterUser;
        //  3394: iload           22
        //  3396: aload           137
        //  3398: ldc_w           536870912
        //  3401: aload           84
        //  3403: iload           19
        //  3405: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/TwitterUser;I[BILandroid/content/ContentValues;Z)V
        //  3408: aload           29
        //  3410: ldc             "timeline"
        //  3412: aconst_null    
        //  3413: aload           84
        //  3415: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  3418: lstore          139
        //  3420: lload           139
        //  3422: lconst_0       
        //  3423: lcmp           
        //  3424: ifle            4490
        //  3427: iload           127
        //  3429: iconst_1       
        //  3430: iadd           
        //  3431: istore          141
        //  3433: iload           141
        //  3435: istore          127
        //  3437: goto            3374
        //  3440: iload           127
        //  3442: istore          28
        //  3444: aload           21
        //  3446: ldc_w           "saveWhoToFollow(followModule)"
        //  3449: ldc_w           "END"
        //  3452: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3455: pop            
        //  3456: iload           28
        //  3458: istore          35
        //  3460: goto            3108
        //  3463: aload           118
        //  3465: invokevirtual   com/twitter/library/api/at.k:()Lcom/twitter/library/api/h;
        //  3468: ifnull          4483
        //  3471: aload           118
        //  3473: invokevirtual   com/twitter/library/api/at.k:()Lcom/twitter/library/api/h;
        //  3476: invokevirtual   com/twitter/library/api/h.a:()Z
        //  3479: ifeq            4483
        //  3482: aload           118
        //  3484: invokevirtual   com/twitter/library/api/at.k:()Lcom/twitter/library/api/h;
        //  3487: invokevirtual   com/twitter/library/api/h.c:()Ljava/lang/String;
        //  3490: invokevirtual   java/lang/String.getBytes:()[B
        //  3493: astore          125
        //  3495: aload           118
        //  3497: invokevirtual   com/twitter/library/api/at.k:()Lcom/twitter/library/api/h;
        //  3500: invokevirtual   com/twitter/library/api/h.b:()Ljava/util/List;
        //  3503: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3508: astore          126
        //  3510: iload           28
        //  3512: istore          127
        //  3514: aload           126
        //  3516: invokeinterface java/util/Iterator.hasNext:()Z
        //  3521: ifeq            4476
        //  3524: aload           126
        //  3526: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3531: checkcast       Lcom/twitter/library/api/bp;
        //  3534: iload           22
        //  3536: aload           125
        //  3538: bipush          16
        //  3540: aload           84
        //  3542: iload           19
        //  3544: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/bp;I[BILandroid/content/ContentValues;Z)V
        //  3547: aload           29
        //  3549: ldc             "timeline"
        //  3551: aconst_null    
        //  3552: aload           84
        //  3554: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  3557: lstore          129
        //  3559: lload           129
        //  3561: lconst_0       
        //  3562: lcmp           
        //  3563: ifle            4469
        //  3566: iload           127
        //  3568: iconst_1       
        //  3569: iadd           
        //  3570: istore          131
        //  3572: iload           131
        //  3574: istore          127
        //  3576: goto            3514
        //  3579: aload           21
        //  3581: ldc_w           "insertGap"
        //  3584: iload           8
        //  3586: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3589: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3592: pop            
        //  3593: iload           25
        //  3595: ifeq            4139
        //  3598: iload           8
        //  3600: ifeq            3903
        //  3603: ldc_w           "bottom"
        //  3606: aload_1        
        //  3607: getfield        com/twitter/library/api/bs.d:Ljava/lang/String;
        //  3610: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3613: ifeq            3903
        //  3616: iconst_m1      
        //  3617: aload_2        
        //  3618: invokevirtual   java/util/ArrayList.size:()I
        //  3621: iadd           
        //  3622: istore          111
        //  3624: aload_2        
        //  3625: iload           111
        //  3627: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3630: checkcast       Lcom/twitter/library/api/at;
        //  3633: astore          112
        //  3635: aload           84
        //  3637: ldc             "entity_id"
        //  3639: new             Ljava/lang/StringBuilder;
        //  3642: dup            
        //  3643: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3646: aload_1        
        //  3647: getfield        com/twitter/library/api/bs.d:Ljava/lang/String;
        //  3650: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3653: ldc_w           "-"
        //  3656: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3659: lload           82
        //  3661: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  3664: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3667: invokevirtual   java/lang/String.hashCode:()I
        //  3670: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3673: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  3676: aload           84
        //  3678: ldc_w           "updated_at"
        //  3681: aload           112
        //  3683: getfield        com/twitter/library/api/at.o:J
        //  3686: lconst_1       
        //  3687: lsub           
        //  3688: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3691: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  3694: aload           84
        //  3696: ldc_w           "data_type"
        //  3699: iconst_5       
        //  3700: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3703: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  3706: aload           84
        //  3708: ldc_w           "data_type_group"
        //  3711: iload           22
        //  3713: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3716: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  3719: aload           84
        //  3721: ldc             "type"
        //  3723: iload           5
        //  3725: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3728: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  3731: aload           84
        //  3733: ldc_w           "timeline_tag"
        //  3736: aload           6
        //  3738: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //  3741: aload           84
        //  3743: ldc             "timeline_group_id"
        //  3745: lload           82
        //  3747: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3750: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  3753: aload           84
        //  3755: ldc_w           "data_type_tag"
        //  3758: iconst_m1      
        //  3759: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3762: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  3765: aload           84
        //  3767: ldc             "sort_index"
        //  3769: aload           112
        //  3771: getfield        com/twitter/library/api/at.d:J
        //  3774: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3777: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  3780: aload           84
        //  3782: ldc_w           "data"
        //  3785: invokevirtual   android/content/ContentValues.putNull:(Ljava/lang/String;)V
        //  3788: aload           84
        //  3790: ldc_w           "flags"
        //  3793: invokevirtual   android/content/ContentValues.putNull:(Ljava/lang/String;)V
        //  3796: aload           29
        //  3798: ldc             "timeline"
        //  3800: aconst_null    
        //  3801: aload           84
        //  3803: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  3806: lconst_0       
        //  3807: lcmp           
        //  3808: ifle            3814
        //  3811: iinc            28, 1
        //  3814: aload           21
        //  3816: ldc_w           "insertGapTopCursor"
        //  3819: ldc_w           "BEGIN"
        //  3822: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3825: pop            
        //  3826: aload_0        
        //  3827: iload           24
        //  3829: iconst_4       
        //  3830: lload_3        
        //  3831: lload           82
        //  3833: aload_1        
        //  3834: getfield        com/twitter/library/api/bs.c:Ljava/lang/String;
        //  3837: invokevirtual   com/twitter/library/provider/bg.a:(IIJJLjava/lang/String;)V
        //  3840: aload           21
        //  3842: ldc_w           "insertGapTopCursor"
        //  3845: ldc_w           "END"
        //  3848: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3851: pop            
        //  3852: aload_0        
        //  3853: iload           24
        //  3855: iconst_2       
        //  3856: lload_3        
        //  3857: lload           82
        //  3859: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  3862: invokevirtual   com/twitter/library/provider/bg.a:(IIJLjava/lang/String;)Ljava/lang/String;
        //  3865: astore          115
        //  3867: aload           21
        //  3869: ldc_w           "insertGapBottomCursor"
        //  3872: ldc_w           "BEGIN"
        //  3875: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3878: pop            
        //  3879: aload_0        
        //  3880: iload           24
        //  3882: iconst_5       
        //  3883: lload_3        
        //  3884: lload           82
        //  3886: aload           115
        //  3888: invokevirtual   com/twitter/library/provider/bg.a:(IIJJLjava/lang/String;)V
        //  3891: aload           21
        //  3893: ldc_w           "insertGapBottomCursor"
        //  3896: ldc_w           "END"
        //  3899: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3902: pop            
        //  3903: aload           21
        //  3905: ldc_w           "topCursor"
        //  3908: aload_1        
        //  3909: getfield        com/twitter/library/api/bs.b:Ljava/lang/String;
        //  3912: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3915: pop            
        //  3916: aload           21
        //  3918: ldc_w           "bottomCursor"
        //  3921: aload_1        
        //  3922: getfield        com/twitter/library/api/bs.c:Ljava/lang/String;
        //  3925: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3928: pop            
        //  3929: aload_1        
        //  3930: getfield        com/twitter/library/api/bs.b:Ljava/lang/String;
        //  3933: ifnull          3974
        //  3936: aload           21
        //  3938: ldc_w           "saveTopCursor"
        //  3941: ldc_w           "BEGIN"
        //  3944: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3947: pop            
        //  3948: aload_0        
        //  3949: iload           24
        //  3951: iconst_2       
        //  3952: lload_3        
        //  3953: lload           82
        //  3955: aload_1        
        //  3956: getfield        com/twitter/library/api/bs.b:Ljava/lang/String;
        //  3959: invokevirtual   com/twitter/library/provider/bg.a:(IIJJLjava/lang/String;)V
        //  3962: aload           21
        //  3964: ldc_w           "saveTopCursor"
        //  3967: ldc_w           "END"
        //  3970: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3973: pop            
        //  3974: aload_1        
        //  3975: getfield        com/twitter/library/api/bs.c:Ljava/lang/String;
        //  3978: ifnull          4331
        //  3981: aload           21
        //  3983: ldc_w           "saveBottomCursor"
        //  3986: ldc_w           "BEGIN"
        //  3989: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  3992: pop            
        //  3993: aload_0        
        //  3994: iload           24
        //  3996: iconst_3       
        //  3997: lload_3        
        //  3998: lload           82
        //  4000: aload_1        
        //  4001: getfield        com/twitter/library/api/bs.c:Ljava/lang/String;
        //  4004: invokevirtual   com/twitter/library/provider/bg.a:(IIJJLjava/lang/String;)V
        //  4007: aload           21
        //  4009: ldc_w           "saveBottomCursor"
        //  4012: ldc_w           "END"
        //  4015: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4018: pop            
        //  4019: iload           28
        //  4021: istore          90
        //  4023: iload           90
        //  4025: ifle            4036
        //  4028: aload_0        
        //  4029: iload           5
        //  4031: aload           16
        //  4033: invokespecial   com/twitter/library/provider/bg.a:(ILcom/twitter/library/provider/b;)V
        //  4036: aload           21
        //  4038: ldc_w           "deleteOlder"
        //  4041: iload           13
        //  4043: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  4046: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4049: pop            
        //  4050: iload           13
        //  4052: ifeq            4098
        //  4055: iload           25
        //  4057: ifeq            4338
        //  4060: aload           21
        //  4062: ldc_w           "deleteTimelineEntities"
        //  4065: ldc_w           "BEGIN"
        //  4068: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4071: pop            
        //  4072: aload_0        
        //  4073: aload           29
        //  4075: lload_3        
        //  4076: iload           5
        //  4078: bipush          100
        //  4080: sipush          400
        //  4083: invokevirtual   com/twitter/library/provider/bg.a:(Landroid/database/sqlite/SQLiteDatabase;JIII)V
        //  4086: aload           21
        //  4088: ldc_w           "deleteTimelineEntities"
        //  4091: ldc_w           "END"
        //  4094: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4097: pop            
        //  4098: aload           21
        //  4100: ldc_w           "mergeTimelineSuccess"
        //  4103: ldc_w           "BEGIN"
        //  4106: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4109: pop            
        //  4110: aload           29
        //  4112: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //  4115: aload           21
        //  4117: ldc_w           "mergeTimelineSuccess"
        //  4120: ldc_w           "END"
        //  4123: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4126: pop            
        //  4127: aload           29
        //  4129: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  4132: iload           90
        //  4134: istore          35
        //  4136: goto            628
        //  4139: iload           8
        //  4141: ifeq            4291
        //  4144: aload           21
        //  4146: ldc_w           "legacyInsertGap"
        //  4149: ldc_w           "BEGIN"
        //  4152: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4155: pop            
        //  4156: aload_0        
        //  4157: lload_3        
        //  4158: lload           9
        //  4160: lload           11
        //  4162: iload           22
        //  4164: iconst_0       
        //  4165: iconst_0       
        //  4166: invokevirtual   com/twitter/library/provider/bg.a:(JJJIZI)J
        //  4169: lstore          102
        //  4171: aload           84
        //  4173: ldc             "entity_id"
        //  4175: lload           102
        //  4177: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4180: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  4183: aload           84
        //  4185: ldc_w           "updated_at"
        //  4188: lload           11
        //  4190: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4193: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  4196: aload           84
        //  4198: ldc_w           "data_type"
        //  4201: iconst_1       
        //  4202: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4205: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  4208: aload           84
        //  4210: ldc_w           "data_type_group"
        //  4213: iload           22
        //  4215: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4218: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  4221: aload           84
        //  4223: ldc_w           "data_type_tag"
        //  4226: iconst_m1      
        //  4227: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4230: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  4233: aload           84
        //  4235: ldc             "data_id"
        //  4237: lload           102
        //  4239: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4242: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //  4245: aload           84
        //  4247: ldc_w           "data"
        //  4250: invokevirtual   android/content/ContentValues.putNull:(Ljava/lang/String;)V
        //  4253: aload           84
        //  4255: ldc_w           "flags"
        //  4258: invokevirtual   android/content/ContentValues.putNull:(Ljava/lang/String;)V
        //  4261: aload           29
        //  4263: ldc             "timeline"
        //  4265: aconst_null    
        //  4266: aload           84
        //  4268: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //  4271: lconst_0       
        //  4272: lcmp           
        //  4273: ifle            4279
        //  4276: iinc            28, 1
        //  4279: aload           21
        //  4281: ldc_w           "legacyInsertGap"
        //  4284: ldc_w           "END"
        //  4287: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4290: pop            
        //  4291: aload           14
        //  4293: ifnull          4331
        //  4296: aload           21
        //  4298: ldc_w           "legacySaveNextCursor"
        //  4301: ldc_w           "BEGIN"
        //  4304: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4307: pop            
        //  4308: aload_0        
        //  4309: iconst_4       
        //  4310: iload           5
        //  4312: lload_3        
        //  4313: lconst_0       
        //  4314: aload           14
        //  4316: invokevirtual   com/twitter/library/provider/bg.a:(IIJJLjava/lang/String;)V
        //  4319: aload           21
        //  4321: ldc_w           "legacySaveNextCursor"
        //  4324: ldc_w           "END"
        //  4327: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4330: pop            
        //  4331: iload           28
        //  4333: istore          90
        //  4335: goto            4023
        //  4338: aload           21
        //  4340: ldc_w           "legacyDeleteOldTimelineEntities"
        //  4343: ldc_w           "BEGIN"
        //  4346: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4349: pop            
        //  4350: aload_0        
        //  4351: aload           29
        //  4353: lload_3        
        //  4354: iload           5
        //  4356: invokespecial   com/twitter/library/provider/bg.a:(Landroid/database/sqlite/SQLiteDatabase;JI)V
        //  4359: aload           21
        //  4361: ldc_w           "legacyDeleteOldTimelineEntities"
        //  4364: ldc_w           "END"
        //  4367: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twitter/errorreporter/a;
        //  4370: pop            
        //  4371: goto            4098
        //  4374: astore          91
        //  4376: aload           91
        //  4378: astore          34
        //  4380: iload           90
        //  4382: istore          35
        //  4384: goto            615
        //  4387: astore          95
        //  4389: aload           21
        //  4391: aload           95
        //  4393: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  4396: pop            
        //  4397: iload           90
        //  4399: istore          35
        //  4401: goto            628
        //  4404: astore          37
        //  4406: aload           21
        //  4408: aload           37
        //  4410: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  4413: pop            
        //  4414: goto            628
        //  4417: astore          31
        //  4419: aload           21
        //  4421: aload           31
        //  4423: invokevirtual   com/twitter/errorreporter/a.a:(Ljava/lang/Throwable;)Lcom/twitter/errorreporter/a;
        //  4426: pop            
        //  4427: goto            1079
        //  4430: astore          176
        //  4432: aload           176
        //  4434: astore          34
        //  4436: iload           174
        //  4438: istore          35
        //  4440: goto            615
        //  4443: astore          181
        //  4445: iload           180
        //  4447: istore          35
        //  4449: aload           181
        //  4451: astore          34
        //  4453: goto            615
        //  4456: astore          128
        //  4458: aload           128
        //  4460: astore          34
        //  4462: iload           127
        //  4464: istore          35
        //  4466: goto            615
        //  4469: iload           127
        //  4471: istore          131
        //  4473: goto            3572
        //  4476: iload           127
        //  4478: istore          35
        //  4480: goto            4532
        //  4483: iload           28
        //  4485: istore          35
        //  4487: goto            4532
        //  4490: iload           127
        //  4492: istore          141
        //  4494: goto            3433
        //  4497: iload           127
        //  4499: istore          156
        //  4501: goto            3008
        //  4504: iload           28
        //  4506: istore          35
        //  4508: goto            3019
        //  4511: iload           28
        //  4513: istore          35
        //  4515: goto            2790
        //  4518: iload           174
        //  4520: istore          35
        //  4522: goto            2276
        //  4525: iload           35
        //  4527: istore          174
        //  4529: goto            2195
        //  4532: iload           35
        //  4534: istore          28
        //  4536: goto            1713
        //  4539: ldc2_w          -1
        //  4542: lstore          82
        //  4544: goto            1676
        //  4547: lload           73
        //  4549: lstore          123
        //  4551: goto            1914
        //  4554: iconst_1       
        //  4555: istore          185
        //  4557: goto            1948
        //  4560: iload           185
        //  4562: ldc_w           262144
        //  4565: ior            
        //  4566: istore          185
        //  4568: goto            2012
        //  4571: iload           185
        //  4573: ldc_w           524288
        //  4576: ior            
        //  4577: istore          185
        //  4579: goto            2012
        //  4582: iconst_1       
        //  4583: istore          162
        //  4585: iload           5
        //  4587: iconst_2       
        //  4588: if_icmpeq       2356
        //  4591: iload           5
        //  4593: bipush          6
        //  4595: if_icmpne       2381
        //  4598: goto            2356
        //  4601: iconst_0       
        //  4602: istore          164
        //  4604: goto            2412
        //  4607: iconst_0       
        //  4608: istore          162
        //  4610: goto            2381
        //  4613: ldc_w           32768
        //  4616: istore          164
        //  4618: goto            2412
        //  4621: goto            4532
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  142    148    605    615    Landroid/database/SQLException;
        //  142    148    1072   1082   Any
        //  156    178    605    615    Landroid/database/SQLException;
        //  156    178    1072   1082   Any
        //  183    193    605    615    Landroid/database/SQLException;
        //  183    193    1072   1082   Any
        //  201    251    605    615    Landroid/database/SQLException;
        //  201    251    1072   1082   Any
        //  254    259    268    280    Landroid/database/SQLException;
        //  285    322    605    615    Landroid/database/SQLException;
        //  285    322    1072   1082   Any
        //  327    364    605    615    Landroid/database/SQLException;
        //  327    364    1072   1082   Any
        //  364    398    605    615    Landroid/database/SQLException;
        //  364    398    1072   1082   Any
        //  403    420    605    615    Landroid/database/SQLException;
        //  403    420    1072   1082   Any
        //  420    425    605    615    Landroid/database/SQLException;
        //  420    425    1072   1082   Any
        //  425    430    432    444    Landroid/database/SQLException;
        //  444    495    605    615    Landroid/database/SQLException;
        //  444    495    1072   1082   Any
        //  495    504    605    615    Landroid/database/SQLException;
        //  495    504    1072   1082   Any
        //  512    569    605    615    Landroid/database/SQLException;
        //  512    569    1072   1082   Any
        //  577    591    605    615    Landroid/database/SQLException;
        //  577    591    1072   1082   Any
        //  591    602    605    615    Landroid/database/SQLException;
        //  591    602    1072   1082   Any
        //  615    623    1072   1082   Any
        //  623    628    4404   4417   Landroid/database/SQLException;
        //  647    745    605    615    Landroid/database/SQLException;
        //  647    745    1072   1082   Any
        //  745    785    605    615    Landroid/database/SQLException;
        //  745    785    1072   1082   Any
        //  785    834    605    615    Landroid/database/SQLException;
        //  785    834    1072   1082   Any
        //  841    849    605    615    Landroid/database/SQLException;
        //  841    849    1072   1082   Any
        //  854    920    605    615    Landroid/database/SQLException;
        //  854    920    1072   1082   Any
        //  925    942    605    615    Landroid/database/SQLException;
        //  925    942    1072   1082   Any
        //  942    947    949    961    Landroid/database/SQLException;
        //  969    1004   1060   1072   Any
        //  1009   1016   1060   1072   Any
        //  1021   1039   1060   1072   Any
        //  1039   1057   1060   1072   Any
        //  1062   1072   605    615    Landroid/database/SQLException;
        //  1062   1072   1072   1082   Any
        //  1074   1079   4417   4430   Landroid/database/SQLException;
        //  1082   1089   605    615    Landroid/database/SQLException;
        //  1082   1089   1072   1082   Any
        //  1089   1135   605    615    Landroid/database/SQLException;
        //  1089   1135   1072   1082   Any
        //  1143   1149   605    615    Landroid/database/SQLException;
        //  1143   1149   1072   1082   Any
        //  1149   1186   605    615    Landroid/database/SQLException;
        //  1149   1186   1072   1082   Any
        //  1186   1221   605    615    Landroid/database/SQLException;
        //  1186   1221   1072   1082   Any
        //  1226   1243   605    615    Landroid/database/SQLException;
        //  1226   1243   1072   1082   Any
        //  1243   1248   605    615    Landroid/database/SQLException;
        //  1243   1248   1072   1082   Any
        //  1248   1253   1255   1267   Landroid/database/SQLException;
        //  1267   1280   605    615    Landroid/database/SQLException;
        //  1267   1280   1072   1082   Any
        //  1283   1324   605    615    Landroid/database/SQLException;
        //  1283   1324   1072   1082   Any
        //  1324   1333   605    615    Landroid/database/SQLException;
        //  1324   1333   1072   1082   Any
        //  1341   1372   605    615    Landroid/database/SQLException;
        //  1341   1372   1072   1082   Any
        //  1375   1464   605    615    Landroid/database/SQLException;
        //  1375   1464   1072   1082   Any
        //  1469   1507   1510   1522   Any
        //  1512   1522   605    615    Landroid/database/SQLException;
        //  1512   1522   1072   1082   Any
        //  1522   1529   605    615    Landroid/database/SQLException;
        //  1522   1529   1072   1082   Any
        //  1529   1662   605    615    Landroid/database/SQLException;
        //  1529   1662   1072   1082   Any
        //  1670   1676   605    615    Landroid/database/SQLException;
        //  1670   1676   1072   1082   Any
        //  1676   1713   605    615    Landroid/database/SQLException;
        //  1676   1713   1072   1082   Any
        //  1713   1816   605    615    Landroid/database/SQLException;
        //  1713   1816   1072   1082   Any
        //  1825   1853   605    615    Landroid/database/SQLException;
        //  1825   1853   1072   1082   Any
        //  1864   1883   605    615    Landroid/database/SQLException;
        //  1864   1883   1072   1082   Any
        //  1883   1914   605    615    Landroid/database/SQLException;
        //  1883   1914   1072   1082   Any
        //  1914   1943   605    615    Landroid/database/SQLException;
        //  1914   1943   1072   1082   Any
        //  1948   1956   605    615    Landroid/database/SQLException;
        //  1948   1956   1072   1082   Any
        //  1964   1972   605    615    Landroid/database/SQLException;
        //  1964   1972   1072   1082   Any
        //  1980   2012   605    615    Landroid/database/SQLException;
        //  1980   2012   1072   1082   Any
        //  2012   2044   605    615    Landroid/database/SQLException;
        //  2012   2044   1072   1082   Any
        //  2053   2060   605    615    Landroid/database/SQLException;
        //  2053   2060   1072   1082   Any
        //  2063   2070   605    615    Landroid/database/SQLException;
        //  2063   2070   1072   1082   Any
        //  2073   2089   605    615    Landroid/database/SQLException;
        //  2073   2089   1072   1082   Any
        //  2092   2111   605    615    Landroid/database/SQLException;
        //  2092   2111   1072   1082   Any
        //  2117   2127   605    615    Landroid/database/SQLException;
        //  2117   2127   1072   1082   Any
        //  2152   2182   2805   2810   Landroid/database/SQLException;
        //  2152   2182   1072   1082   Any
        //  2206   2245   4430   4443   Landroid/database/SQLException;
        //  2206   2245   1072   1082   Any
        //  2258   2272   4443   4456   Landroid/database/SQLException;
        //  2258   2272   1072   1082   Any
        //  2288   2303   605    615    Landroid/database/SQLException;
        //  2288   2303   1072   1082   Any
        //  2316   2335   605    615    Landroid/database/SQLException;
        //  2316   2335   1072   1082   Any
        //  2335   2350   605    615    Landroid/database/SQLException;
        //  2335   2350   1072   1082   Any
        //  2356   2366   605    615    Landroid/database/SQLException;
        //  2356   2366   1072   1082   Any
        //  2386   2412   605    615    Landroid/database/SQLException;
        //  2386   2412   1072   1082   Any
        //  2412   2439   605    615    Landroid/database/SQLException;
        //  2412   2439   1072   1082   Any
        //  2442   2465   605    615    Landroid/database/SQLException;
        //  2442   2465   1072   1082   Any
        //  2465   2514   605    615    Landroid/database/SQLException;
        //  2465   2514   1072   1082   Any
        //  2514   2575   605    615    Landroid/database/SQLException;
        //  2514   2575   1072   1082   Any
        //  2578   2590   605    615    Landroid/database/SQLException;
        //  2578   2590   1072   1082   Any
        //  2593   2617   605    615    Landroid/database/SQLException;
        //  2593   2617   1072   1082   Any
        //  2620   2629   605    615    Landroid/database/SQLException;
        //  2620   2629   1072   1082   Any
        //  2651   2680   2805   2810   Landroid/database/SQLException;
        //  2651   2680   1072   1082   Any
        //  2680   2719   2805   2810   Landroid/database/SQLException;
        //  2680   2719   1072   1082   Any
        //  2732   2777   605    615    Landroid/database/SQLException;
        //  2732   2777   1072   1082   Any
        //  2790   2802   2805   2810   Landroid/database/SQLException;
        //  2790   2802   1072   1082   Any
        //  2810   2892   605    615    Landroid/database/SQLException;
        //  2810   2892   1072   1082   Any
        //  2895   2905   605    615    Landroid/database/SQLException;
        //  2895   2905   1072   1082   Any
        //  2909   2965   4456   4469   Landroid/database/SQLException;
        //  2909   2965   1072   1082   Any
        //  2970   2983   4456   4469   Landroid/database/SQLException;
        //  2970   2983   1072   1082   Any
        //  2983   2995   4456   4469   Landroid/database/SQLException;
        //  2983   2995   1072   1082   Any
        //  3019   3031   2805   2810   Landroid/database/SQLException;
        //  3019   3031   1072   1082   Any
        //  3034   3092   605    615    Landroid/database/SQLException;
        //  3034   3092   1072   1082   Any
        //  3092   3104   605    615    Landroid/database/SQLException;
        //  3092   3104   1072   1082   Any
        //  3108   3120   2805   2810   Landroid/database/SQLException;
        //  3108   3120   1072   1082   Any
        //  3123   3164   605    615    Landroid/database/SQLException;
        //  3123   3164   1072   1082   Any
        //  3169   3225   605    615    Landroid/database/SQLException;
        //  3169   3225   1072   1082   Any
        //  3230   3243   605    615    Landroid/database/SQLException;
        //  3230   3243   1072   1082   Any
        //  3243   3258   605    615    Landroid/database/SQLException;
        //  3243   3258   1072   1082   Any
        //  3261   3273   605    615    Landroid/database/SQLException;
        //  3261   3273   1072   1082   Any
        //  3280   3355   605    615    Landroid/database/SQLException;
        //  3280   3355   1072   1082   Any
        //  3358   3370   605    615    Landroid/database/SQLException;
        //  3358   3370   1072   1082   Any
        //  3374   3420   4456   4469   Landroid/database/SQLException;
        //  3374   3420   1072   1082   Any
        //  3444   3456   605    615    Landroid/database/SQLException;
        //  3444   3456   1072   1082   Any
        //  3463   3510   605    615    Landroid/database/SQLException;
        //  3463   3510   1072   1082   Any
        //  3514   3559   4456   4469   Landroid/database/SQLException;
        //  3514   3559   1072   1082   Any
        //  3579   3593   605    615    Landroid/database/SQLException;
        //  3579   3593   1072   1082   Any
        //  3603   3811   605    615    Landroid/database/SQLException;
        //  3603   3811   1072   1082   Any
        //  3814   3903   605    615    Landroid/database/SQLException;
        //  3814   3903   1072   1082   Any
        //  3903   3974   605    615    Landroid/database/SQLException;
        //  3903   3974   1072   1082   Any
        //  3974   4019   605    615    Landroid/database/SQLException;
        //  3974   4019   1072   1082   Any
        //  4028   4036   4374   4387   Landroid/database/SQLException;
        //  4028   4036   1072   1082   Any
        //  4036   4050   4374   4387   Landroid/database/SQLException;
        //  4036   4050   1072   1082   Any
        //  4060   4098   4374   4387   Landroid/database/SQLException;
        //  4060   4098   1072   1082   Any
        //  4098   4127   4374   4387   Landroid/database/SQLException;
        //  4098   4127   1072   1082   Any
        //  4127   4132   4387   4404   Landroid/database/SQLException;
        //  4144   4276   605    615    Landroid/database/SQLException;
        //  4144   4276   1072   1082   Any
        //  4279   4291   605    615    Landroid/database/SQLException;
        //  4279   4291   1072   1082   Any
        //  4296   4331   605    615    Landroid/database/SQLException;
        //  4296   4331   1072   1082   Any
        //  4338   4371   4374   4387   Landroid/database/SQLException;
        //  4338   4371   1072   1082   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 2006, Size: 2006
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    public int a(final j p0, final long p1, final boolean p2, final boolean p3, final boolean p4, final long p5, final long p6, final boolean p7, final b p8) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //     4: astore          13
        //     6: aload           13
        //     8: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    11: aload_1        
        //    12: invokevirtual   com/twitter/library/api/search/j.a:()Ljava/util/ArrayList;
        //    15: astore          15
        //    17: aload_0        
        //    18: aload           15
        //    20: lload_2        
        //    21: bipush          19
        //    23: ldc2_w          -1
        //    26: iconst_0       
        //    27: iconst_0       
        //    28: iconst_0       
        //    29: aconst_null    
        //    30: iconst_1       
        //    31: aconst_null    
        //    32: iconst_1       
        //    33: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJZZZLjava/lang/String;ZLcom/twitter/library/provider/b;Z)Ljava/util/Collection;
        //    36: astore          16
        //    38: aload           16
        //    40: invokeinterface java/util/Collection.size:()I
        //    45: istore          17
        //    47: iload           17
        //    49: ifle            328
        //    52: iconst_1       
        //    53: istore          18
        //    55: lconst_0       
        //    56: lstore          19
        //    58: iload           17
        //    60: ifne            334
        //    63: iload           5
        //    65: ifeq            890
        //    68: aload_0        
        //    69: aload           13
        //    71: invokespecial   com/twitter/library/provider/bg.c:(Landroid/database/sqlite/SQLiteDatabase;)V
        //    74: iconst_0       
        //    75: istore          37
        //    77: lload           9
        //    79: lconst_0       
        //    80: lcmp           
        //    81: ifle            852
        //    84: iconst_1       
        //    85: anewarray       Ljava/lang/String;
        //    88: dup            
        //    89: iconst_0       
        //    90: ldc_w           "_id"
        //    93: aastore        
        //    94: astore          38
        //    96: iconst_2       
        //    97: anewarray       Ljava/lang/String;
        //   100: astore          39
        //   102: aload           39
        //   104: iconst_0       
        //   105: iconst_1       
        //   106: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   109: aastore        
        //   110: aload           39
        //   112: iconst_1       
        //   113: lload           7
        //   115: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   118: aastore        
        //   119: aload           13
        //   121: ldc_w           "discover"
        //   124: aload           38
        //   126: ldc_w           "type=? AND identifier=?"
        //   129: aload           39
        //   131: aconst_null    
        //   132: aconst_null    
        //   133: aconst_null    
        //   134: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   137: astore          40
        //   139: aload           40
        //   141: ifnull          196
        //   144: aload           40
        //   146: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   151: ifeq            189
        //   154: iconst_1       
        //   155: anewarray       Ljava/lang/String;
        //   158: astore          45
        //   160: aload           45
        //   162: iconst_0       
        //   163: aload           40
        //   165: iconst_0       
        //   166: invokeinterface android/database/Cursor.getInt:(I)I
        //   171: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   174: aastore        
        //   175: aload           13
        //   177: ldc_w           "discover"
        //   180: ldc_w           "_id=?"
        //   183: aload           45
        //   185: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   188: pop            
        //   189: aload           40
        //   191: invokeinterface android/database/Cursor.close:()V
        //   196: aload_0        
        //   197: lload_2        
        //   198: bipush          19
        //   200: bipush          6
        //   202: lload           9
        //   204: invokevirtual   com/twitter/library/provider/bg.a:(JIIJ)V
        //   207: iconst_1       
        //   208: istore          41
        //   210: aload_1        
        //   211: getfield        com/twitter/library/api/search/j.b:Ljava/lang/String;
        //   214: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   217: ifne            233
        //   220: aload_0        
        //   221: iconst_5       
        //   222: bipush          19
        //   224: lload_2        
        //   225: lconst_0       
        //   226: aload_1        
        //   227: getfield        com/twitter/library/api/search/j.b:Ljava/lang/String;
        //   230: invokevirtual   com/twitter/library/provider/bg.a:(IIJJLjava/lang/String;)V
        //   233: iload           11
        //   235: ifeq            267
        //   238: aload_1        
        //   239: getfield        com/twitter/library/api/search/j.c:Ljava/lang/String;
        //   242: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   245: ifne            267
        //   248: aload_1        
        //   249: getfield        com/twitter/library/api/search/j.c:Ljava/lang/String;
        //   252: astore          43
        //   254: aload_0        
        //   255: bipush          6
        //   257: bipush          19
        //   259: lload_2        
        //   260: lload           19
        //   262: aload           43
        //   264: invokevirtual   com/twitter/library/provider/bg.a:(IIJJLjava/lang/String;)V
        //   267: iload           4
        //   269: ifne            278
        //   272: aload_0        
        //   273: aload           13
        //   275: invokespecial   com/twitter/library/provider/bg.d:(Landroid/database/sqlite/SQLiteDatabase;)V
        //   278: iload           41
        //   280: ifeq            315
        //   283: aload           12
        //   285: ifnull          315
        //   288: iconst_2       
        //   289: anewarray       Landroid/net/Uri;
        //   292: astore          42
        //   294: aload           42
        //   296: iconst_0       
        //   297: getstatic       com/twitter/library/provider/an.a:Landroid/net/Uri;
        //   300: aastore        
        //   301: aload           42
        //   303: iconst_1       
        //   304: getstatic       com/twitter/library/provider/ao.a:Landroid/net/Uri;
        //   307: aastore        
        //   308: aload           12
        //   310: aload           42
        //   312: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   315: aload           13
        //   317: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   320: aload           13
        //   322: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   325: iload           37
        //   327: ireturn        
        //   328: iconst_0       
        //   329: istore          18
        //   331: goto            55
        //   334: aload_0        
        //   335: aload           16
        //   337: lload_2        
        //   338: bipush          19
        //   340: iload           4
        //   342: lload           9
        //   344: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIZJ)I
        //   347: istore          21
        //   349: iload           6
        //   351: ifeq            880
        //   354: aload           15
        //   356: invokevirtual   java/util/ArrayList.size:()I
        //   359: istore          22
        //   361: iload           22
        //   363: ifle            480
        //   366: aload           15
        //   368: iload           22
        //   370: iconst_1       
        //   371: isub           
        //   372: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   375: checkcast       Lcom/twitter/library/api/bp;
        //   378: astore          23
        //   380: aload           23
        //   382: ifnull          880
        //   385: aload           23
        //   387: getfield        com/twitter/library/api/bp.a:J
        //   390: lstore          24
        //   392: aload_0        
        //   393: lload_2        
        //   394: lload           24
        //   396: aload           23
        //   398: getfield        com/twitter/library/api/bp.f:J
        //   401: bipush          19
        //   403: iconst_1       
        //   404: iload           21
        //   406: invokevirtual   com/twitter/library/provider/bg.a:(JJJIZI)J
        //   409: lstore          26
        //   411: lload           24
        //   413: lstore          28
        //   415: new             Ljava/util/HashSet;
        //   418: dup            
        //   419: iload           17
        //   421: invokespecial   java/util/HashSet.<init>:(I)V
        //   424: astore          30
        //   426: aload           16
        //   428: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   433: astore          31
        //   435: aload           31
        //   437: invokeinterface java/util/Iterator.hasNext:()Z
        //   442: ifeq            486
        //   445: aload           30
        //   447: aload           31
        //   449: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   454: checkcast       Lcom/twitter/library/api/bp;
        //   457: invokevirtual   com/twitter/library/api/bp.a:()J
        //   460: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   463: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   466: pop            
        //   467: goto            435
        //   470: astore          14
        //   472: aload           13
        //   474: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   477: aload           14
        //   479: athrow         
        //   480: aconst_null    
        //   481: astore          23
        //   483: goto            380
        //   486: new             Landroid/content/ContentValues;
        //   489: dup            
        //   490: invokespecial   android/content/ContentValues.<init>:()V
        //   493: astore          32
        //   495: aload_1        
        //   496: getfield        com/twitter/library/api/search/j.a:Ljava/util/ArrayList;
        //   499: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   502: astore          33
        //   504: iconst_0       
        //   505: istore          34
        //   507: aload           33
        //   509: invokeinterface java/util/Iterator.hasNext:()Z
        //   514: ifeq            794
        //   517: aload           33
        //   519: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   524: checkcast       Lcom/twitter/library/api/search/b;
        //   527: astore          47
        //   529: aload           32
        //   531: ldc_w           "unread"
        //   534: iconst_0       
        //   535: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   538: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   541: aload           32
        //   543: ldc_w           "page"
        //   546: iload           21
        //   548: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   551: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   554: aload           32
        //   556: ldc             "type"
        //   558: aload           47
        //   560: getfield        com/twitter/library/api/search/b.a:I
        //   563: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   566: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   569: aload           47
        //   571: getfield        com/twitter/library/api/search/b.a:I
        //   574: iconst_1       
        //   575: if_icmpne       688
        //   578: aload           47
        //   580: getfield        com/twitter/library/api/search/b.b:Lcom/twitter/library/api/bp;
        //   583: astore          52
        //   585: aload           30
        //   587: aload           52
        //   589: invokevirtual   com/twitter/library/api/bp.a:()J
        //   592: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   595: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   598: ifeq            873
        //   601: aload           32
        //   603: ldc_w           "identifier"
        //   606: aload           52
        //   608: invokevirtual   com/twitter/library/api/bp.a:()J
        //   611: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   614: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   617: aload           52
        //   619: getfield        com/twitter/library/api/bp.F:Lxb;
        //   622: ifnull          655
        //   625: aload           52
        //   627: getfield        com/twitter/library/api/bp.F:Lxb;
        //   630: getfield        xb.h:Lcom/twitter/library/api/DiscoverStoryMetadata;
        //   633: ifnull          655
        //   636: aload           32
        //   638: ldc_w           "scribe_content"
        //   641: aload           52
        //   643: getfield        com/twitter/library/api/bp.F:Lxb;
        //   646: getfield        xb.h:Lcom/twitter/library/api/DiscoverStoryMetadata;
        //   649: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //   652: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //   655: aload           13
        //   657: ldc_w           "discover"
        //   660: aconst_null    
        //   661: aload           32
        //   663: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   666: lconst_0       
        //   667: lcmp           
        //   668: ifle            873
        //   671: iload           34
        //   673: iconst_1       
        //   674: iadd           
        //   675: istore          53
        //   677: goto            896
        //   680: aload           32
        //   682: invokevirtual   android/content/ContentValues.clear:()V
        //   685: goto            507
        //   688: aload           47
        //   690: getfield        com/twitter/library/api/search/b.a:I
        //   693: iconst_2       
        //   694: if_icmpne       680
        //   697: aload           47
        //   699: getfield        com/twitter/library/api/search/b.c:Ljava/util/ArrayList;
        //   702: astore          48
        //   704: aload_0        
        //   705: aload           48
        //   707: lload_2        
        //   708: bipush          9
        //   710: ldc2_w          -1
        //   713: aconst_null    
        //   714: aconst_null    
        //   715: iconst_1       
        //   716: aload           12
        //   718: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;ZLcom/twitter/library/provider/b;)I
        //   721: ifle            680
        //   724: aload           48
        //   726: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   729: astore          49
        //   731: iload           34
        //   733: istore          50
        //   735: aload           49
        //   737: invokeinterface java/util/Iterator.hasNext:()Z
        //   742: ifeq            866
        //   745: aload           32
        //   747: ldc_w           "identifier"
        //   750: aload           49
        //   752: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   757: checkcast       Lcom/twitter/library/api/TwitterUser;
        //   760: getfield        com/twitter/library/api/TwitterUser.userId:J
        //   763: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   766: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   769: aload           13
        //   771: ldc_w           "discover"
        //   774: aconst_null    
        //   775: aload           32
        //   777: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   780: lconst_0       
        //   781: lcmp           
        //   782: ifle            859
        //   785: iload           50
        //   787: iconst_1       
        //   788: iadd           
        //   789: istore          51
        //   791: goto            903
        //   794: lload           26
        //   796: lconst_0       
        //   797: lcmp           
        //   798: ifle            910
        //   801: aload           32
        //   803: ldc             "type"
        //   805: iconst_1       
        //   806: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   809: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   812: aload           32
        //   814: ldc_w           "identifier"
        //   817: lload           26
        //   819: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   822: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   825: aload           13
        //   827: ldc_w           "discover"
        //   830: aconst_null    
        //   831: aload           32
        //   833: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   836: pop2           
        //   837: goto            910
        //   840: astore          44
        //   842: aload           40
        //   844: invokeinterface android/database/Cursor.close:()V
        //   849: aload           44
        //   851: athrow         
        //   852: iload           18
        //   854: istore          41
        //   856: goto            210
        //   859: iload           50
        //   861: istore          51
        //   863: goto            903
        //   866: iload           50
        //   868: istore          34
        //   870: goto            680
        //   873: iload           34
        //   875: istore          53
        //   877: goto            896
        //   880: lconst_0       
        //   881: lstore          26
        //   883: lload           19
        //   885: lstore          28
        //   887: goto            415
        //   890: iconst_0       
        //   891: istore          37
        //   893: goto            77
        //   896: iload           53
        //   898: istore          34
        //   900: goto            680
        //   903: iload           51
        //   905: istore          50
        //   907: goto            735
        //   910: iload           34
        //   912: istore          37
        //   914: lload           28
        //   916: lstore          19
        //   918: goto            77
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  11     47     470    480    Any
        //  68     74     470    480    Any
        //  84     139    470    480    Any
        //  144    189    840    852    Any
        //  189    196    470    480    Any
        //  196    207    470    480    Any
        //  210    233    470    480    Any
        //  238    267    470    480    Any
        //  272    278    470    480    Any
        //  288    315    470    480    Any
        //  315    320    470    480    Any
        //  334    349    470    480    Any
        //  354    361    470    480    Any
        //  366    380    470    480    Any
        //  385    411    470    480    Any
        //  415    435    470    480    Any
        //  435    467    470    480    Any
        //  486    504    470    480    Any
        //  507    655    470    480    Any
        //  655    671    470    480    Any
        //  680    685    470    480    Any
        //  688    731    470    480    Any
        //  735    785    470    480    Any
        //  801    837    470    480    Any
        //  842    852    470    480    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0189:
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
    
    public int a(final OrderHistoryList p0, final b p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/twitter/library/provider/bg.b:Z
        //     3: ifeq            40
        //     6: ldc             "DatabaseHelper"
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: ldc_w           "Merging order history: "
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_1        
        //    22: invokevirtual   com/twitter/library/commerce/model/OrderHistoryList.a:()Ljava/util/List;
        //    25: invokeinterface java/util/List.size:()I
        //    30: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    33: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    36: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    39: pop            
        //    40: aload_1        
        //    41: invokevirtual   com/twitter/library/commerce/model/OrderHistoryList.a:()Ljava/util/List;
        //    44: invokeinterface java/util/List.isEmpty:()Z
        //    49: ifeq            54
        //    52: iconst_0       
        //    53: ireturn        
        //    54: new             Ljava/util/LinkedHashMap;
        //    57: dup            
        //    58: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    61: astore_3       
        //    62: aload_1        
        //    63: invokevirtual   com/twitter/library/commerce/model/OrderHistoryList.a:()Ljava/util/List;
        //    66: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    71: astore          4
        //    73: aload           4
        //    75: invokeinterface java/util/Iterator.hasNext:()Z
        //    80: ifeq            110
        //    83: aload           4
        //    85: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    90: checkcast       Lcom/twitter/library/commerce/model/OrderHistoryItem;
        //    93: astore          25
        //    95: aload_3        
        //    96: aload           25
        //    98: invokevirtual   com/twitter/library/commerce/model/OrderHistoryItem.g:()Ljava/lang/Long;
        //   101: aload           25
        //   103: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   106: pop            
        //   107: goto            73
        //   110: aload_0        
        //   111: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   114: astore          5
        //   116: aload           5
        //   118: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   121: aload           5
        //   123: ldc_w           "order_history"
        //   126: getstatic       com/twitter/library/provider/bw.a:[Ljava/lang/String;
        //   129: aconst_null    
        //   130: aconst_null    
        //   131: aconst_null    
        //   132: aconst_null    
        //   133: aconst_null    
        //   134: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   137: astore          7
        //   139: aload           7
        //   141: ifnonnull       515
        //   144: aload           5
        //   146: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   149: aload           5
        //   151: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   154: iconst_0       
        //   155: ireturn        
        //   156: aload           7
        //   158: invokeinterface android/database/Cursor.moveToNext:()Z
        //   163: ifeq            301
        //   166: aload           7
        //   168: iconst_1       
        //   169: invokeinterface android/database/Cursor.getLong:(I)J
        //   174: lstore          17
        //   176: aload           7
        //   178: iconst_0       
        //   179: invokeinterface android/database/Cursor.getLong:(I)J
        //   184: lstore          19
        //   186: aload_3        
        //   187: lload           17
        //   189: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   192: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   195: checkcast       Lcom/twitter/library/commerce/model/OrderHistoryItem;
        //   198: astore          21
        //   200: aload           21
        //   202: ifnull          156
        //   205: new             Landroid/content/ContentValues;
        //   208: dup            
        //   209: invokespecial   android/content/ContentValues.<init>:()V
        //   212: astore          22
        //   214: aload           22
        //   216: ldc_w           "data"
        //   219: aload           21
        //   221: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //   224: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //   227: aload           22
        //   229: ldc_w           "ordered_at"
        //   232: aload           21
        //   234: invokevirtual   com/twitter/library/commerce/model/OrderHistoryItem.d:()Ljava/util/Calendar;
        //   237: invokevirtual   java/util/Calendar.getTimeInMillis:()J
        //   240: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   243: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   246: aload           22
        //   248: ldc_w           "order_id"
        //   251: aload           21
        //   253: invokevirtual   com/twitter/library/commerce/model/OrderHistoryItem.g:()Ljava/lang/Long;
        //   256: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   259: iconst_1       
        //   260: anewarray       Ljava/lang/String;
        //   263: astore          23
        //   265: aload           23
        //   267: iconst_0       
        //   268: lload           19
        //   270: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   273: aastore        
        //   274: aload           5
        //   276: ldc_w           "order_history"
        //   279: aload           22
        //   281: ldc_w           "_id=?"
        //   284: aload           23
        //   286: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   289: istore          24
        //   291: iload           24
        //   293: iload           8
        //   295: iadd           
        //   296: istore          8
        //   298: goto            156
        //   301: aload           7
        //   303: invokeinterface android/database/Cursor.close:()V
        //   308: getstatic       com/twitter/library/provider/bg.b:Z
        //   311: ifeq            343
        //   314: ldc             "DatabaseHelper"
        //   316: new             Ljava/lang/StringBuilder;
        //   319: dup            
        //   320: invokespecial   java/lang/StringBuilder.<init>:()V
        //   323: ldc_w           "Inserting new Order History: "
        //   326: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   329: aload_3        
        //   330: invokevirtual   java/util/HashMap.size:()I
        //   333: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   336: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   339: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   342: pop            
        //   343: aload_3        
        //   344: invokevirtual   java/util/HashMap.size:()I
        //   347: ifle            474
        //   350: new             Landroid/content/ContentValues;
        //   353: dup            
        //   354: invokespecial   android/content/ContentValues.<init>:()V
        //   357: astore          10
        //   359: aload_3        
        //   360: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //   363: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   368: astore          11
        //   370: aload           11
        //   372: invokeinterface java/util/Iterator.hasNext:()Z
        //   377: ifeq            474
        //   380: aload           11
        //   382: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   387: checkcast       Lcom/twitter/library/commerce/model/OrderHistoryItem;
        //   390: astore          13
        //   392: aload           10
        //   394: ldc_w           "data"
        //   397: aload           13
        //   399: invokestatic    com/twitter/util/h.a:(Ljava/io/Serializable;)[B
        //   402: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //   405: aload           10
        //   407: ldc_w           "ordered_at"
        //   410: aload           13
        //   412: invokevirtual   com/twitter/library/commerce/model/OrderHistoryItem.d:()Ljava/util/Calendar;
        //   415: invokevirtual   java/util/Calendar.getTimeInMillis:()J
        //   418: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   421: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   424: aload           10
        //   426: ldc_w           "order_id"
        //   429: aload           13
        //   431: invokevirtual   com/twitter/library/commerce/model/OrderHistoryItem.g:()Ljava/lang/Long;
        //   434: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   437: aload           5
        //   439: ldc_w           "order_history"
        //   442: aconst_null    
        //   443: aload           10
        //   445: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   448: pop2           
        //   449: goto            370
        //   452: astore          6
        //   454: aload           5
        //   456: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   459: aload           6
        //   461: athrow         
        //   462: astore          9
        //   464: aload           7
        //   466: invokeinterface android/database/Cursor.close:()V
        //   471: aload           9
        //   473: athrow         
        //   474: aload           5
        //   476: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   479: aload           5
        //   481: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   484: aload_2        
        //   485: ifnull          507
        //   488: iconst_1       
        //   489: anewarray       Landroid/net/Uri;
        //   492: astore          12
        //   494: aload           12
        //   496: iconst_0       
        //   497: getstatic       com/twitter/library/provider/at.a:Landroid/net/Uri;
        //   500: aastore        
        //   501: aload_2        
        //   502: aload           12
        //   504: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   507: iload           8
        //   509: aload_3        
        //   510: invokevirtual   java/util/HashMap.size:()I
        //   513: iadd           
        //   514: ireturn        
        //   515: iconst_0       
        //   516: istore          8
        //   518: goto            156
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  121    139    452    462    Any
        //  144    149    452    462    Any
        //  156    200    462    474    Any
        //  205    291    462    474    Any
        //  301    343    452    462    Any
        //  343    370    452    462    Any
        //  370    449    452    462    Any
        //  464    474    452    462    Any
        //  474    479    452    462    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0156:
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
    
    public int a(final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        final Cursor query = writableDatabase.query("timeline", new String[] { "_id", "flags" }, "type=6 AND (flags&?)!=0", new String[] { String.valueOf(1048576) }, (String)null, (String)null, (String)null);
        while (true) {
            Label_0227: {
                if (query == null) {
                    break Label_0227;
                }
                writableDatabase.beginTransaction();
                try {
                    final ContentValues contentValues = new ContentValues(2);
                    int n = 0;
                    while (query.moveToNext()) {
                        contentValues.clear();
                        final long long1 = query.getLong(0);
                        contentValues.put("flags", 0xFFEFFFFF & query.getInt(1));
                        n += writableDatabase.update("timeline", contentValues, "_id=?", new String[] { String.valueOf(long1) });
                    }
                    writableDatabase.setTransactionSuccessful();
                    query.close();
                    writableDatabase.endTransaction();
                    final int n2 = n;
                    if (n2 > 0 && b != null) {
                        b.a(bc.e);
                    }
                    return n2;
                }
                finally {
                    query.close();
                    writableDatabase.endTransaction();
                }
            }
            final int n2 = 0;
            continue;
        }
    }
    
    public int a(final String s, final int n, final String s2, final String s3, final long n2, final String s4, final String s5, final byte[] array) {
        final int a = k.a(this.g).a(s);
        if (a == -1) {
            return 0;
        }
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                Label_0310: {
                    Label_0301: {
                        try {
                            final Cursor query = writableDatabase.query("notifications", new String[] { "notif_id" }, "notif_id>0", (String[])null, (String)null, (String)null, "notif_id ASC");
                            int n3 = a + 1;
                            Label_0111: {
                                if (query == null) {
                                    break Label_0111;
                                }
                                try {
                                    while (query.moveToNext()) {
                                        final int int1 = query.getInt(0);
                                        if (int1 > n3) {
                                            break;
                                        }
                                        n3 = int1 + 1;
                                    }
                                    query.close();
                                    final int n4 = n3 - a;
                                    if (n4 < 1 || n4 > 999) {
                                        break Label_0301;
                                    }
                                    final ContentValues contentValues = new ContentValues();
                                    contentValues.put("notif_id", n3);
                                    contentValues.put("type", n);
                                    contentValues.put("source_user_name", s2);
                                    contentValues.put("s_name", s3);
                                    contentValues.put("s_id", n2);
                                    contentValues.put("notif_txt", s4);
                                    contentValues.put("aggregation_data", s5);
                                    contentValues.put("notif_extra_data", array);
                                    if (writableDatabase.insert("notifications", (String)null, contentValues) == -1L) {
                                        Log.w("DatabaseHelper", "Failed to save notification id");
                                        break Label_0310;
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                    return n3;
                                }
                                finally {
                                    query.close();
                                }
                            }
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                    }
                    Log.w("DatabaseHelper", "Notification id out of range");
                }
                int n3 = a;
                continue;
            }
        }
    }
    
    public int a(final String s, final int n, final String s2, final String s3, final long n2, final String s4, final boolean b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        Label_0023: {
            if (b) {
                break Label_0023;
            }
            try {
                String s5;
                String[] array;
                if (TextUtils.isEmpty((CharSequence)s2)) {
                    s5 = "type=?";
                    array = new String[] { String.valueOf(n) };
                }
                else {
                    s5 = "type=? AND source_user_name=?";
                    array = new String[] { String.valueOf(n), s2 };
                }
                writableDatabase.delete("notifications", s5, array);
                final int a = this.a(s, n, s2, s3, n2, s4, s2, null);
                writableDatabase.setTransactionSuccessful();
                return a;
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
    }
    
    public int a(final String s, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Delete topic: " + s);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("topics", "ev_id=?", new String[] { s });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null && delete > 0) {
                b.a(bd.a);
            }
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    int a(final String s, final String[] array) {
        SQLiteDatabase writableDatabase;
        Cursor query;
        boolean moveToFirst;
        int n;
        long long1;
        int int1;
        String value;
        String value2;
        String value3;
        int n2 = 0;
        Cursor query2;
        long long2;
        ContentValues contentValues;
        int n3 = 0;
        String[] array2;
        ContentValues contentValues2;
        Label_0285_Outer:Label_0299_Outer:
        while (true) {
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                Label_0531: {
                    while (true) {
                    Label_0524:
                        while (true) {
                            Label_0517: {
                                try {
                                    query = writableDatabase.query("timeline_view", cp.a, s, array, (String)null, (String)null, (String)null);
                                    try {
                                        moveToFirst = query.moveToFirst();
                                        n = 0;
                                        if (!moveToFirst) {
                                            break Label_0531;
                                        }
                                        long1 = query.getLong(0);
                                        int1 = query.getInt(4);
                                        value = String.valueOf(query.getLong(1));
                                        value2 = String.valueOf(query.getLong(2));
                                        value3 = String.valueOf(query.getLong(3));
                                        n2 = n + writableDatabase.delete("timeline", "_id=?", new String[] { String.valueOf(long1) });
                                        if (!bb.a(int1)) {
                                            break Label_0524;
                                        }
                                        query2 = writableDatabase.query("timeline", new String[] { "_id", "data_id" }, "owner_id=? AND type=? AND entity_id=? AND data_type=1", new String[] { value, value2, value3 }, (String)null, (String)null, "_id ASC");
                                        try {
                                            Label_0477: {
                                                if (bb.d(int1)) {
                                                    if (!query2.moveToLast()) {
                                                        break Label_0477;
                                                    }
                                                    long2 = query2.getLong(0);
                                                    contentValues = new ContentValues();
                                                    contentValues.put("flags", 8);
                                                    writableDatabase.update("timeline", contentValues, "_id=?", new String[] { String.valueOf(long2) });
                                                    n3 = n2;
                                                }
                                                else {
                                                    n2 += writableDatabase.delete("timeline", "owner_id=? AND type=? AND entity_type=2 AND entity_id=? AND (flags&?)!=0", new String[] { value, value2, value3, String.valueOf(2) });
                                                    if (query2.moveToFirst() && long1 > query2.getLong(0)) {
                                                        array2 = new String[] { null };
                                                        contentValues2 = new ContentValues();
                                                        do {
                                                            array2[0] = String.valueOf(query2.getLong(0));
                                                            contentValues2.put("flags", 1);
                                                            contentValues2.put("entity_id", query2.getLong(1));
                                                            writableDatabase.update("timeline", contentValues2, "_id=?", array2);
                                                        } while (query2.moveToNext());
                                                    }
                                                    break Label_0477;
                                                }
                                                query2.close();
                                                if (!query.moveToNext()) {
                                                    query.close();
                                                    writableDatabase.setTransactionSuccessful();
                                                    return n3;
                                                }
                                                break Label_0517;
                                            }
                                            n3 = n2;
                                        }
                                        finally {
                                            query2.close();
                                        }
                                    }
                                    finally {
                                        query.close();
                                    }
                                }
                                finally {
                                    writableDatabase.endTransaction();
                                }
                            }
                            n = n3;
                            continue Label_0285_Outer;
                        }
                        n3 = n2;
                        continue Label_0299_Outer;
                    }
                }
                n3 = 0;
                continue;
            }
        }
    }
    
    public int a(final ArrayList list, final int n, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Merging search queries: " + list.size() + " of type: " + n);
        }
        if (list.isEmpty()) {
            return 0;
        }
        final LinkedHashMap<Object, TwitterSearchQuery> linkedHashMap = new LinkedHashMap<Object, TwitterSearchQuery>();
        for (final TwitterSearchQuery twitterSearchQuery : list) {
            linkedHashMap.put(17 + twitterSearchQuery.a.hashCode() + 31 * twitterSearchQuery.b.hashCode(), twitterSearchQuery);
        }
        SQLiteDatabase writableDatabase;
        Cursor query;
        int n2;
        while (true) {
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                long long1 = 0L;
                try {
                    query = writableDatabase.query("search_queries", cb.a, "type=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
                    n2 = 0;
                    if (query == null) {
                        writableDatabase.setTransactionSuccessful();
                        return 0;
                    }
                    try {
                        while (query.moveToNext()) {
                            final int n3 = 17 + query.getString(1).hashCode() + 31 * query.getString(2).hashCode();
                            long1 = query.getLong(0);
                            final TwitterSearchQuery twitterSearchQuery2 = linkedHashMap.remove(n3);
                            if (twitterSearchQuery2 == null) {
                                break;
                            }
                            final ContentValues contentValues = new ContentValues();
                            contentValues.put("name", twitterSearchQuery2.a);
                            contentValues.put("query", twitterSearchQuery2.b);
                            contentValues.put("time", twitterSearchQuery2.h);
                            contentValues.put("latitude", twitterSearchQuery2.c);
                            contentValues.put("longitude", twitterSearchQuery2.d);
                            contentValues.put("radius", twitterSearchQuery2.e);
                            contentValues.put("location", twitterSearchQuery2.f);
                            contentValues.put("query_id", twitterSearchQuery2.g);
                            if (twitterSearchQuery2.j != null) {
                                contentValues.put("pc", com.twitter.util.f.a(twitterSearchQuery2.j));
                            }
                            else {
                                contentValues.putNull("pc");
                            }
                            contentValues.put("cluster_titles", com.twitter.util.f.a(twitterSearchQuery2.k));
                            writableDatabase.update("search_queries", contentValues, "_id=?", new String[] { String.valueOf(long1) });
                            ++n2;
                        }
                    }
                    finally {
                        query.close();
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                writableDatabase.delete("search_queries", "_id=?", new String[] { String.valueOf(long1) });
                continue;
            }
        }
        query.close();
        if (bg.b) {
            Log.d("DatabaseHelper", "Inserting new search queries: " + linkedHashMap.size());
        }
        if (linkedHashMap.size() > 0) {
            final ContentValues contentValues2 = new ContentValues();
            contentValues2.put("type", n);
            for (final TwitterSearchQuery twitterSearchQuery3 : linkedHashMap.values()) {
                contentValues2.put("name", twitterSearchQuery3.a);
                contentValues2.put("time", twitterSearchQuery3.h);
                contentValues2.put("query", twitterSearchQuery3.b);
                contentValues2.put("latitude", twitterSearchQuery3.c);
                contentValues2.put("longitude", twitterSearchQuery3.d);
                contentValues2.put("radius", twitterSearchQuery3.e);
                contentValues2.put("location", twitterSearchQuery3.f);
                contentValues2.put("query_id", twitterSearchQuery3.g);
                if (twitterSearchQuery3.j != null) {
                    contentValues2.put("pc", com.twitter.util.f.a(twitterSearchQuery3.j));
                }
                else {
                    contentValues2.putNull("pc");
                }
                contentValues2.put("cluster_titles", com.twitter.util.f.a(twitterSearchQuery3.k));
                writableDatabase.insert("search_queries", "name", contentValues2);
            }
            if (b != null) {
                switch (n) {
                    case 1:
                    case 6:
                    case 7: {
                        b.a(av.a, ag.a);
                        break;
                    }
                }
            }
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        return n2 + linkedHashMap.size();
    }
    
    public int a(final ArrayList list, final long n, final int n2) {
        return this.a(list, n, n2, "unspecified", false, false, 0L, 0L, false, null, false, null);
    }
    
    public int a(final ArrayList list, final long n, final int n2, final b b) {
        if (list.isEmpty()) {
            return 0;
        }
        switch (n2) {
            default: {
                return 0;
            }
            case 0: {
                throw new IllegalArgumentException("Must specify a valid type!");
            }
            case 1: {
                return this.a(list, n, b);
            }
            case 5: {
                return this.d(list);
            }
        }
    }
    
    public int a(final ArrayList list, final long n, final int n2, final String s, final boolean b, final boolean b2, final long n3, final long n4, final boolean b3, final String s2, final boolean b4, final b b5) {
        return this.a(list, n, n2, s, b, b2, n3, n4, b3, s2, b4, b5, null, null, false, new ac().a(false).a());
    }
    
    public int a(final ArrayList list, final long n, final int n2, final String s, final boolean b, final boolean b2, final long n3, final long n4, final boolean b3, final String s2, final boolean b4, final b b5, final String s3, final String s4, final boolean b6, final aa aa) {
        return this.a(null, list, n, n2, s, b, b2, n3, n4, b3, s2, b4, b5, s3, s4, b6, aa);
    }
    
    public int a(final Collection collection, final long n, final int n2, final long n3, final String s, final String s2, final boolean b, final b b2) {
        if (n < 0L && n2 != -1) {
            throw new IllegalArgumentException("null owner id not allowed for type: " + n2);
        }
        if (bg.b) {
            Log.d("DatabaseHelper", "Merge users: " + collection.size() + ", of type: " + n2 + ", owned by: " + n + ", tag: " + n3 + ", prevCursor: " + s + ", nextCursor: " + s2);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        while (true) {
            if (s != null) {
                while (true) {
                    Label_1441: {
                        HashMap<Long, TwitterUser> hashMap;
                        try {
                            if (s.equals("-1")) {
                                final int delete = writableDatabase.delete("user_groups", "owner_id=? AND type=?", new String[] { String.valueOf(n), String.valueOf(n2) });
                                if (bg.b) {
                                    Log.d("DatabaseHelper", "Removed (due to refresh): " + delete + ", owned by: " + n + ", of type: " + n2);
                                }
                                a(writableDatabase, n, n2, 1, 0L);
                            }
                            if (collection.isEmpty()) {
                                break Label_1441;
                            }
                            hashMap = new HashMap<Long, TwitterUser>();
                            for (final TwitterUser twitterUser : collection) {
                                hashMap.put(twitterUser.userId, twitterUser);
                            }
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                        final Cursor a = a(writableDatabase, "users", cu.a, "user_id", null, null, hashMap.values(), null, null);
                        if (a == null) {
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            return 0;
                        }
                        final HashMap<Long, TwitterUser> hashMap2 = new HashMap<Long, TwitterUser>();
                        final HashMap<Long, String> hashMap3 = new HashMap<Long, String>();
                        final HashSet<Long> set = new HashSet<Long>();
                        final HashSet<Long> set2 = new HashSet<Long>();
                        final HashSet<Long> set3 = new HashSet<Long>();
                        try {
                            while (a.moveToNext()) {
                                final long long1 = a.getLong(0);
                                final TwitterUser twitterUser2 = hashMap.remove(long1);
                                if (twitterUser2 != null && twitterUser2.username != null && twitterUser2.hashCode() != a.getInt(1)) {
                                    final String string = a.getString(2);
                                    if (!bn.c(string, twitterUser2.profileImageUrl)) {
                                        if (bg.b) {
                                            Log.d("DatabaseHelper", "Invalidating avatar for user id: " + twitterUser2.userId);
                                        }
                                        twitterUser2.profileImageUrlChanged = true;
                                        hashMap3.put(long1, string);
                                    }
                                    if (twitterUser2.descriptionEntities == null) {
                                        final TweetEntities tweetEntities = (TweetEntities)com.twitter.util.f.a(a.getBlob(4));
                                        if (tweetEntities != null && !this.a(a.getString(3), tweetEntities, twitterUser2.profileDescription)) {
                                            set.add(long1);
                                        }
                                    }
                                    if (twitterUser2.urlEntities == null) {
                                        final TweetEntities tweetEntities2 = (TweetEntities)com.twitter.util.f.a(a.getBlob(6));
                                        if (tweetEntities2 != null && !this.a(a.getString(5), tweetEntities2, twitterUser2.profileUrl)) {
                                            set2.add(long1);
                                        }
                                    }
                                    if (z.h(a.getInt(7))) {
                                        set3.add(long1);
                                    }
                                    hashMap2.put(long1, twitterUser2);
                                }
                            }
                        }
                        finally {
                            a.close();
                        }
                        a.close();
                        if (bg.b) {
                            Log.d("DatabaseHelper", "Inserting new users: " + hashMap.size() + ", updating users: " + hashMap2.size());
                        }
                        int n4;
                        if (hashMap.size() > 0) {
                            final ContentValues contentValues = new ContentValues();
                            final Iterator<TwitterUser> iterator2 = hashMap.values().iterator();
                            n4 = 0;
                            while (iterator2.hasNext()) {
                                final TwitterUser twitterUser3 = iterator2.next();
                                contentValues.clear();
                                a(twitterUser3, contentValues, n2, true);
                                int n5;
                                if (writableDatabase.insert("users", "user_id", contentValues) > 0L) {
                                    n5 = n4 + 1;
                                }
                                else {
                                    n5 = n4;
                                }
                                n4 = n5;
                            }
                        }
                        else {
                            n4 = 0;
                        }
                        if (b && hashMap2.size() > 0) {
                            int n6 = 0;
                            boolean b3 = false;
                            switch (n2) {
                                default: {
                                    n6 = 0;
                                    b3 = false;
                                    break;
                                }
                                case 15: {
                                    n6 = 1;
                                    b3 = false;
                                    break;
                                }
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 16:
                                case 26:
                                case 29:
                                case 34: {
                                    b3 = true;
                                    n6 = 0;
                                    break;
                                }
                            }
                            final ContentValues contentValues2 = new ContentValues();
                            final Iterator<TwitterUser> iterator3 = hashMap2.values().iterator();
                            int n7 = 0;
                            while (iterator3.hasNext()) {
                                final TwitterUser twitterUser4 = iterator3.next();
                                contentValues2.clear();
                                if (n6 == 0 && set3.contains(twitterUser4.userId)) {
                                    twitterUser4.friendship |= 0x8;
                                }
                                a(twitterUser4, contentValues2, n2, b3);
                                if (twitterUser4.mediaCount == -1) {
                                    contentValues2.remove("media_count");
                                }
                                if (set.contains(twitterUser4.userId)) {
                                    contentValues2.remove("description");
                                    contentValues2.remove("description_entities");
                                }
                                if (set2.contains(twitterUser4.userId)) {
                                    contentValues2.remove("web_url");
                                    contentValues2.remove("url_entities");
                                }
                                n7 += writableDatabase.update("users", contentValues2, "user_id=?", new String[] { String.valueOf(twitterUser4.userId) });
                            }
                            n4 += n7;
                            if (n7 > 0 && hashMap3.size() > 0) {
                                final String[] array = new String[hashMap3.size()];
                                hashMap3.values().toArray(array);
                                this.g.sendOrderedBroadcast(new Intent(ae.b).putExtra("url", array), ae.a);
                            }
                        }
                        if (b2 != null && n4 > 0) {
                            final long userId = collection.iterator().next().userId;
                            b2.a(bf.a);
                            if (n4 == 1) {
                                b2.a(ContentUris.withAppendedId(bf.b, userId));
                            }
                            if (hashMap3.size() > 0) {
                                b2.a(ContentUris.withAppendedId(ay.b, userId));
                            }
                        }
                        final int n8 = n4;
                        if (n2 != -1) {
                            this.a(collection, n, n2, n3, s2, b2);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        return n8;
                    }
                    final int n8 = 0;
                    continue;
                }
            }
            continue;
        }
    }
    
    public int a(final Collection p0, final long p1, final int p2, final boolean p3, final long p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lload_2        
        //     1: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //     4: astore          8
        //     6: iload           4
        //     8: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    11: astore          9
        //    13: lload           6
        //    15: lconst_0       
        //    16: lcmp           
        //    17: ifle            262
        //    20: ldc_w           "owner_id=? AND type=? AND ref_id=? AND page NOT NULL"
        //    23: astore          10
        //    25: iconst_3       
        //    26: anewarray       Ljava/lang/String;
        //    29: astore          11
        //    31: aload           11
        //    33: iconst_0       
        //    34: aload           8
        //    36: aastore        
        //    37: aload           11
        //    39: iconst_1       
        //    40: aload           9
        //    42: aastore        
        //    43: aload           11
        //    45: iconst_2       
        //    46: lload           6
        //    48: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    51: aastore        
        //    52: ldc_w           "page DESC"
        //    55: astore          12
        //    57: aload_0        
        //    58: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    61: astore          13
        //    63: aload           13
        //    65: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    68: aload           13
        //    70: ldc_w           "status_groups_view"
        //    73: iconst_1       
        //    74: anewarray       Ljava/lang/String;
        //    77: dup            
        //    78: iconst_0       
        //    79: ldc_w           "page"
        //    82: aastore        
        //    83: aload           10
        //    85: aload           11
        //    87: aconst_null    
        //    88: aconst_null    
        //    89: aload           12
        //    91: ldc_w           "1"
        //    94: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    97: astore          15
        //    99: aload           15
        //   101: ifnull          380
        //   104: aload           15
        //   106: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   111: ifeq            374
        //   114: lload           6
        //   116: lconst_0       
        //   117: lcmp           
        //   118: ifle            304
        //   121: iconst_1       
        //   122: istore          22
        //   124: iload           22
        //   126: ifeq            310
        //   129: aload           15
        //   131: iconst_0       
        //   132: invokeinterface android/database/Cursor.getInt:(I)I
        //   137: istore          23
        //   139: iload           23
        //   141: istore          24
        //   143: aload           15
        //   145: invokeinterface android/database/Cursor.close:()V
        //   150: iload           24
        //   152: istore          16
        //   154: new             Landroid/content/ContentValues;
        //   157: dup            
        //   158: iconst_1       
        //   159: invokespecial   android/content/ContentValues.<init>:(I)V
        //   162: astore          17
        //   164: aload           17
        //   166: ldc_w           "page"
        //   169: iload           16
        //   171: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   174: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   177: iconst_3       
        //   178: anewarray       Ljava/lang/String;
        //   181: astore          18
        //   183: aload           18
        //   185: iconst_0       
        //   186: aload           8
        //   188: aastore        
        //   189: aload           18
        //   191: iconst_1       
        //   192: aload           9
        //   194: aastore        
        //   195: aload_1        
        //   196: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   201: astore          19
        //   203: aload           19
        //   205: invokeinterface java/util/Iterator.hasNext:()Z
        //   210: ifeq            361
        //   213: aload           18
        //   215: iconst_2       
        //   216: aload           19
        //   218: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   223: checkcast       Lcom/twitter/library/api/bp;
        //   226: getfield        com/twitter/library/api/bp.a:J
        //   229: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   232: aastore        
        //   233: aload           13
        //   235: ldc_w           "status_groups"
        //   238: aload           17
        //   240: ldc_w           "owner_id=? AND type=? AND ref_id=?"
        //   243: aload           18
        //   245: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   248: pop            
        //   249: goto            203
        //   252: astore          14
        //   254: aload           13
        //   256: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   259: aload           14
        //   261: athrow         
        //   262: ldc_w           "owner_id=? AND type=? AND page NOT NULL"
        //   265: astore          10
        //   267: iconst_2       
        //   268: anewarray       Ljava/lang/String;
        //   271: dup            
        //   272: iconst_0       
        //   273: aload           8
        //   275: aastore        
        //   276: dup            
        //   277: iconst_1       
        //   278: aload           9
        //   280: aastore        
        //   281: astore          11
        //   283: iload           5
        //   285: ifeq            296
        //   288: ldc_w           "page DESC"
        //   291: astore          12
        //   293: goto            57
        //   296: ldc_w           "page ASC"
        //   299: astore          12
        //   301: goto            57
        //   304: iconst_0       
        //   305: istore          22
        //   307: goto            124
        //   310: iload           5
        //   312: ifeq            330
        //   315: iconst_1       
        //   316: aload           15
        //   318: iconst_0       
        //   319: invokeinterface android/database/Cursor.getInt:(I)I
        //   324: iadd           
        //   325: istore          24
        //   327: goto            143
        //   330: aload           15
        //   332: iconst_0       
        //   333: invokeinterface android/database/Cursor.getInt:(I)I
        //   338: istore          25
        //   340: iload           25
        //   342: iconst_1       
        //   343: isub           
        //   344: istore          24
        //   346: goto            143
        //   349: astore          21
        //   351: aload           15
        //   353: invokeinterface android/database/Cursor.close:()V
        //   358: aload           21
        //   360: athrow         
        //   361: aload           13
        //   363: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   366: aload           13
        //   368: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   371: iload           16
        //   373: ireturn        
        //   374: iconst_0       
        //   375: istore          24
        //   377: goto            143
        //   380: iconst_0       
        //   381: istore          16
        //   383: goto            154
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  68     99     252    262    Any
        //  104    114    349    361    Any
        //  129    139    349    361    Any
        //  143    150    252    262    Any
        //  154    203    252    262    Any
        //  203    249    252    262    Any
        //  315    327    349    361    Any
        //  330    340    349    361    Any
        //  351    361    252    262    Any
        //  361    366    252    262    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
    
    public int a(final Collection p0, final long p1, final b p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/twitter/library/provider/bg.b:Z
        //     3: ifeq            37
        //     6: ldc             "DatabaseHelper"
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: ldc_w           "Merge prompts: "
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: aload_1        
        //    22: invokeinterface java/util/Collection.size:()I
        //    27: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    30: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    33: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    36: pop            
        //    37: new             Ljava/util/HashMap;
        //    40: dup            
        //    41: invokespecial   java/util/HashMap.<init>:()V
        //    44: astore          5
        //    46: aload_1        
        //    47: invokeinterface java/util/Collection.size:()I
        //    52: ifle            863
        //    55: aload_1        
        //    56: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //    61: astore          6
        //    63: aload           6
        //    65: invokeinterface java/util/Iterator.hasNext:()Z
        //    70: ifeq            101
        //    73: aload           6
        //    75: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    80: checkcast       Lcom/twitter/library/api/Prompt;
        //    83: astore          49
        //    85: aload           5
        //    87: aload           49
        //    89: invokevirtual   com/twitter/library/api/Prompt.b:()Ljava/lang/String;
        //    92: aload           49
        //    94: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    97: pop            
        //    98: goto            63
        //   101: aload_0        
        //   102: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //   105: astore          7
        //   107: aload           7
        //   109: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   112: aload           7
        //   114: ldc_w           "prompts"
        //   117: getstatic       com/twitter/library/provider/by.a:[Ljava/lang/String;
        //   120: ldc_w           "p_id"
        //   123: aconst_null    
        //   124: aconst_null    
        //   125: aload_1        
        //   126: aconst_null    
        //   127: aload           5
        //   129: invokestatic    com/twitter/library/provider/bg.a:(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/util/Collection;Ljava/util/Map;Ljava/util/Map;)Landroid/database/Cursor;
        //   132: astore          9
        //   134: aload           9
        //   136: ifnull          857
        //   139: new             Landroid/content/ContentValues;
        //   142: dup            
        //   143: invokespecial   android/content/ContentValues.<init>:()V
        //   146: astore          39
        //   148: iconst_0       
        //   149: istore          40
        //   151: aload           9
        //   153: invokeinterface android/database/Cursor.moveToNext:()Z
        //   158: ifeq            284
        //   161: aload           39
        //   163: invokevirtual   android/content/ContentValues.clear:()V
        //   166: aload           5
        //   168: aload           9
        //   170: iconst_1       
        //   171: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   176: invokevirtual   java/util/HashMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   179: checkcast       Lcom/twitter/library/api/Prompt;
        //   182: astore          42
        //   184: aload           42
        //   186: ifnull          850
        //   189: aload_0        
        //   190: aload           42
        //   192: aload           39
        //   194: invokespecial   com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/Prompt;Landroid/content/ContentValues;)V
        //   197: aload           9
        //   199: iconst_0       
        //   200: invokeinterface android/database/Cursor.getLong:(I)J
        //   205: lstore          43
        //   207: getstatic       com/twitter/library/provider/bg.b:Z
        //   210: ifeq            240
        //   213: ldc             "DatabaseHelper"
        //   215: new             Ljava/lang/StringBuilder;
        //   218: dup            
        //   219: invokespecial   java/lang/StringBuilder.<init>:()V
        //   222: ldc_w           "Updating prompt at row id: "
        //   225: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   228: lload           43
        //   230: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   233: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   236: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   239: pop            
        //   240: iconst_1       
        //   241: anewarray       Ljava/lang/String;
        //   244: astore          45
        //   246: aload           45
        //   248: iconst_0       
        //   249: lload           43
        //   251: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   254: aastore        
        //   255: aload           7
        //   257: ldc_w           "prompts"
        //   260: aload           39
        //   262: ldc_w           "_id=?"
        //   265: aload           45
        //   267: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   270: pop            
        //   271: iload           40
        //   273: iconst_1       
        //   274: iadd           
        //   275: istore          47
        //   277: iload           47
        //   279: istore          40
        //   281: goto            151
        //   284: aload           9
        //   286: invokeinterface android/database/Cursor.close:()V
        //   291: iload           40
        //   293: istore          10
        //   295: aload           5
        //   297: invokevirtual   java/util/HashMap.isEmpty:()Z
        //   300: ifne            843
        //   303: new             Ljava/util/ArrayList;
        //   306: dup            
        //   307: invokespecial   java/util/ArrayList.<init>:()V
        //   310: astore          11
        //   312: new             Ljava/util/ArrayList;
        //   315: dup            
        //   316: invokespecial   java/util/ArrayList.<init>:()V
        //   319: astore          12
        //   321: new             Landroid/content/ContentValues;
        //   324: dup            
        //   325: invokespecial   android/content/ContentValues.<init>:()V
        //   328: astore          13
        //   330: aload           5
        //   332: invokevirtual   java/util/HashMap.values:()Ljava/util/Collection;
        //   335: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   340: astore          14
        //   342: aload           14
        //   344: invokeinterface java/util/Iterator.hasNext:()Z
        //   349: ifeq            731
        //   352: aload           14
        //   354: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   359: checkcast       Lcom/twitter/library/api/Prompt;
        //   362: astore          17
        //   364: aload           13
        //   366: invokevirtual   android/content/ContentValues.clear:()V
        //   369: aload           17
        //   371: getfield        com/twitter/library/api/Prompt.n:J
        //   374: lstore          18
        //   376: aload_0        
        //   377: aload           17
        //   379: getfield        com/twitter/library/api/Prompt.c:Ljava/lang/String;
        //   382: invokespecial   com/twitter/library/provider/bg.i:(Ljava/lang/String;)I
        //   385: istore          20
        //   387: iload           20
        //   389: iconst_m1      
        //   390: if_icmpeq       342
        //   393: lload           18
        //   395: lconst_0       
        //   396: lcmp           
        //   397: ifgt            836
        //   400: aload           17
        //   402: getfield        com/twitter/library/api/Prompt.o:I
        //   405: ifle            872
        //   408: aload_0        
        //   409: lload_2        
        //   410: iload           20
        //   412: iconst_m1      
        //   413: aload           17
        //   415: getfield        com/twitter/library/api/Prompt.o:I
        //   418: iadd           
        //   419: invokevirtual   com/twitter/library/provider/bg.a:(JII)J
        //   422: lstore          21
        //   424: goto            865
        //   427: lload           23
        //   429: lconst_0       
        //   430: lcmp           
        //   431: ifle            830
        //   434: iconst_2       
        //   435: anewarray       Ljava/lang/String;
        //   438: dup            
        //   439: iconst_0       
        //   440: ldc_w           "updated_at"
        //   443: aastore        
        //   444: dup            
        //   445: iconst_1       
        //   446: ldc_w           "t_sort_index"
        //   449: aastore        
        //   450: astore          25
        //   452: iconst_1       
        //   453: anewarray       Ljava/lang/String;
        //   456: astore          26
        //   458: aload           26
        //   460: iconst_0       
        //   461: lload           23
        //   463: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   466: aastore        
        //   467: aload           7
        //   469: ldc_w           "timeline_view"
        //   472: aload           25
        //   474: ldc_w           "t_data_type=1 AND t_data_id=?"
        //   477: aload           26
        //   479: aconst_null    
        //   480: aconst_null    
        //   481: aconst_null    
        //   482: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   485: astore          27
        //   487: aload           27
        //   489: astore          28
        //   491: lconst_0       
        //   492: lstore          29
        //   494: lconst_0       
        //   495: lstore          31
        //   497: aload           28
        //   499: ifnull          649
        //   502: aload           28
        //   504: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   509: ifeq            562
        //   512: aload_0        
        //   513: aload           17
        //   515: aload           13
        //   517: invokespecial   com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/Prompt;Landroid/content/ContentValues;)V
        //   520: aload           7
        //   522: ldc_w           "prompts"
        //   525: aconst_null    
        //   526: aload           13
        //   528: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   531: lconst_0       
        //   532: lcmp           
        //   533: ifle            562
        //   536: aload           28
        //   538: iconst_0       
        //   539: invokeinterface android/database/Cursor.getLong:(I)J
        //   544: lconst_1       
        //   545: lsub           
        //   546: lstore          29
        //   548: aload           28
        //   550: iconst_1       
        //   551: invokeinterface android/database/Cursor.getLong:(I)J
        //   556: lstore          37
        //   558: lload           37
        //   560: lstore          31
        //   562: aload           28
        //   564: invokeinterface android/database/Cursor.close:()V
        //   569: new             Lcom/twitter/library/api/at;
        //   572: dup            
        //   573: aload           17
        //   575: invokevirtual   com/twitter/library/api/Prompt.b:()Ljava/lang/String;
        //   578: aload           17
        //   580: lload           29
        //   582: lload           31
        //   584: aconst_null    
        //   585: invokespecial   com/twitter/library/api/at.<init>:(Ljava/lang/String;Lcom/twitter/library/api/Prompt;JJLcom/twitter/library/api/TimelineScribeContent;)V
        //   588: astore          33
        //   590: ldc_w           "home_timeline"
        //   593: aload           17
        //   595: getfield        com/twitter/library/api/Prompt.c:Ljava/lang/String;
        //   598: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   601: ifeq            692
        //   604: aload           11
        //   606: aload           33
        //   608: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   611: pop            
        //   612: goto            342
        //   615: astore          8
        //   617: aload           7
        //   619: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   622: aload           8
        //   624: athrow         
        //   625: astore          41
        //   627: aload           9
        //   629: invokeinterface android/database/Cursor.close:()V
        //   634: aload           41
        //   636: athrow         
        //   637: astore          36
        //   639: aload           28
        //   641: invokeinterface android/database/Cursor.close:()V
        //   646: aload           36
        //   648: athrow         
        //   649: aload           17
        //   651: getfield        com/twitter/library/api/Prompt.o:I
        //   654: ifne            342
        //   657: aload_0        
        //   658: aload           17
        //   660: aload           13
        //   662: invokespecial   com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/Prompt;Landroid/content/ContentValues;)V
        //   665: aload           7
        //   667: ldc_w           "prompts"
        //   670: aconst_null    
        //   671: aload           13
        //   673: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   676: lconst_0       
        //   677: lcmp           
        //   678: ifle            569
        //   681: ldc2_w          -1
        //   684: lstore          29
        //   686: lconst_0       
        //   687: lstore          31
        //   689: goto            569
        //   692: ldc_w           "profile_self"
        //   695: aload           17
        //   697: getfield        com/twitter/library/api/Prompt.c:Ljava/lang/String;
        //   700: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   703: ifne            720
        //   706: ldc_w           "profile_other"
        //   709: aload           17
        //   711: getfield        com/twitter/library/api/Prompt.c:Ljava/lang/String;
        //   714: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   717: ifeq            342
        //   720: aload           12
        //   722: aload           33
        //   724: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   727: pop            
        //   728: goto            342
        //   731: aload           11
        //   733: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   736: ifne            823
        //   739: iload           10
        //   741: aload_0        
        //   742: aload           11
        //   744: lload_2        
        //   745: iconst_0       
        //   746: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/ArrayList;JI)I
        //   749: iadd           
        //   750: istore          15
        //   752: aload           12
        //   754: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   757: ifne            773
        //   760: iload           15
        //   762: aload_0        
        //   763: aload           12
        //   765: lload_2        
        //   766: iconst_1       
        //   767: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/ArrayList;JI)I
        //   770: iadd           
        //   771: istore          15
        //   773: aload           7
        //   775: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   778: aload           7
        //   780: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   783: aload           4
        //   785: ifnull          820
        //   788: iload           15
        //   790: ifle            820
        //   793: iconst_2       
        //   794: anewarray       Landroid/net/Uri;
        //   797: astore          16
        //   799: aload           16
        //   801: iconst_0       
        //   802: getstatic       com/twitter/library/provider/bc.a:Landroid/net/Uri;
        //   805: aastore        
        //   806: aload           16
        //   808: iconst_1       
        //   809: getstatic       com/twitter/library/provider/au.a:Landroid/net/Uri;
        //   812: aastore        
        //   813: aload           4
        //   815: aload           16
        //   817: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   820: iload           15
        //   822: ireturn        
        //   823: iload           10
        //   825: istore          15
        //   827: goto            752
        //   830: aconst_null    
        //   831: astore          28
        //   833: goto            491
        //   836: lload           18
        //   838: lstore          23
        //   840: goto            427
        //   843: iload           10
        //   845: istore          15
        //   847: goto            773
        //   850: iload           40
        //   852: istore          47
        //   854: goto            277
        //   857: iconst_0       
        //   858: istore          10
        //   860: goto            295
        //   863: iconst_0       
        //   864: ireturn        
        //   865: lload           21
        //   867: lstore          23
        //   869: goto            427
        //   872: lconst_0       
        //   873: lstore          21
        //   875: goto            865
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  112    134    615    625    Any
        //  139    148    625    637    Any
        //  151    184    625    637    Any
        //  189    240    625    637    Any
        //  240    271    625    637    Any
        //  284    291    615    625    Any
        //  295    342    615    625    Any
        //  342    387    615    625    Any
        //  400    424    615    625    Any
        //  434    487    615    625    Any
        //  502    558    637    649    Any
        //  562    569    615    625    Any
        //  569    612    615    625    Any
        //  627    637    615    625    Any
        //  639    649    615    625    Any
        //  649    681    615    625    Any
        //  692    720    615    625    Any
        //  720    728    615    625    Any
        //  731    752    615    625    Any
        //  752    773    615    625    Any
        //  773    778    615    625    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 391, Size: 391
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
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
    
    public int a(final List list) {
        int n = 0;
        if (list.isEmpty()) {
            return 0;
        }
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                int n2 = 0;
                Label_0172: {
                    try {
                        writableDatabase.delete("locations", (String)null, (String[])null);
                        final ContentValues contentValues = new ContentValues(4);
                        final Iterator<TwitterLocation> iterator = list.iterator();
                        if (!iterator.hasNext()) {
                            writableDatabase.setTransactionSuccessful();
                            return n;
                        }
                        final TwitterLocation twitterLocation = iterator.next();
                        contentValues.put("name", twitterLocation.a());
                        contentValues.put("woeid", twitterLocation.d());
                        contentValues.put("country", twitterLocation.b());
                        contentValues.put("country_code", twitterLocation.c());
                        if (writableDatabase.insert("locations", (String)null, contentValues) > 0L) {
                            n2 = n + 1;
                            break Label_0172;
                        }
                    }
                    finally {
                        writableDatabase.endTransaction();
                    }
                    n2 = n;
                }
                n = n2;
                continue;
            }
        }
    }
    
    public int a(final boolean b, final long n) {
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        final String[] array = { "type_id" };
        final String[] array2 = { String.valueOf(n) };
        final StringBuilder append = new StringBuilder().append("type_id");
        Label_0123: {
            if (!b) {
                break Label_0123;
            }
            String s = " ASC";
            while (true) {
                final Cursor query = readableDatabase.query("search_results", array, "search_id=?", array2, (String)null, (String)null, append.append(s).toString(), "1");
                if (query == null) {
                    return 0;
                }
                try {
                    if (query.moveToFirst()) {
                        return query.getInt(0);
                    }
                    return 0;
                    s = " DESC";
                    continue;
                }
                finally {
                    query.close();
                }
                break;
            }
        }
        return 0;
    }
    
    public int a(final int[] array) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int a = this.a(writableDatabase, "notifications", "notif_id=?", array);
            writableDatabase.setTransactionSuccessful();
            return a;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public long a(final int n, final long n2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues(2);
            contentValues.put("type", n);
            contentValues.put("last_update", n2);
            final long insertWithOnConflict = writableDatabase.insertWithOnConflict("search_suggestion_metadata", (String)null, contentValues, 5);
            writableDatabase.setTransactionSuccessful();
            return insertWithOnConflict;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    long a(final long n, final int n2) {
        final Cursor query = this.getReadableDatabase().query("timeline", co.a, "owner_id=? AND type=? AND data_type=1", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, "updated_at ASC, _id DESC", "1");
        if (query == null) {
            return 0L;
        }
        try {
            if (query.moveToFirst()) {
                return query.getLong(1);
            }
            return 0L;
        }
        finally {
            query.close();
        }
    }
    
    public long a(final long n, final int n2, int n3) {
        if (n3 < 0) {
            n3 = 0;
        }
        final Cursor query = this.getReadableDatabase().query("timeline_view", new String[] { "t_flags", "g_status_id" }, "owner_id=? AND t_type=? AND t_data_type=1 AND timeline=1 AND pc IS NULL", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, "preview_draft_id DESC, t_updated_at DESC, _id ASC", (String)null);
        if (query == null) {
            return 0L;
        }
        int n4 = n3;
        try {
            while (query.moveToNext()) {
                final int int1 = query.getInt(0);
                if (bb.e(int1) || bb.d(int1)) {
                    if (n4 == 0) {
                        return query.getLong(1);
                    }
                    --n4;
                }
            }
            return 0L;
        }
        finally {
            query.close();
        }
    }
    
    public long a(final long n, final long n2, final long n3, final int n4, final boolean b, final int n5) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final long a = this.a(writableDatabase, 2954291678L, 2954391678L);
            final ContentValues contentValues = new ContentValues();
            contentValues.put("status_id", a);
            contentValues.put("created", n3);
            writableDatabase.insert("statuses", "status_id", contentValues);
            contentValues.clear();
            if (b) {
                contentValues.put("page", n5);
            }
            contentValues.put("owner_id", n);
            contentValues.put("type", n4);
            contentValues.put("tag", -1);
            contentValues.put("ref_id", n2);
            contentValues.put("is_read", 1);
            contentValues.put("timeline", false);
            contentValues.put("tweet_type", 2);
            contentValues.put("updated_at", n3);
            contentValues.put("g_status_id", a);
            contentValues.put("is_last", false);
            writableDatabase.insert("status_groups", "g_status_id", contentValues);
            writableDatabase.setTransactionSuccessful();
            return a;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public long a(final TwitterUser twitterUser, final DraftTweet draftTweet) {
        final GeoTag geoTag = draftTweet.geoTag;
        final bq d = new bq().a(-1L).b("Twitter for Android Preview").c("http://twitter.com/download/android").b(bk.a()).a(com.twitter.util.k.a(draftTweet.statusText)).c(0L).d(draftTweet.repliedTweetId);
        while (true) {
            while (true) {
                Coordinate b = null;
                Label_0069: {
                    if (geoTag != null) {
                        b = geoTag.b();
                        break Label_0069;
                    }
                    Label_0206: {
                        break Label_0206;
                        while (true) {
                            final bq a;
                            TwitterPlace a2 = null;
                            final bq b2 = a.a(a2).a(Long.valueOf(draftTweet.draftId)).a(draftTweet.media).b(twitterUser).a(draftTweet.promotedContent).d("en").b((bp)null);
                            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                            writableDatabase.beginTransaction();
                            try {
                                b2.a(this.a(writableDatabase, 2954391679L, 2954491679L));
                                final bp f = b2.f();
                                this.a(f, f.y.userId, null);
                                writableDatabase.setTransactionSuccessful();
                                return f.a;
                                b = null;
                                break;
                                a2 = null;
                            }
                            finally {
                                writableDatabase.endTransaction();
                            }
                        }
                    }
                }
                final bq a = d.a(b);
                if (geoTag != null) {
                    final TwitterPlace a2 = geoTag.a();
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    public long a(final TwitterSearchQuery twitterSearchQuery, final int n) {
        if (bg.b) {
            Log.d("DatabaseHelper", "insertSearchQuery: " + twitterSearchQuery.a + ", of type: " + n);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        while (true) {
            switch (n) {
                default: {
                    break Label_0072;
                }
                case 0: {
                    Label_0218: {
                        break Label_0218;
                        try {
                            final ContentValues contentValues = new ContentValues();
                            contentValues.put("type", n);
                            contentValues.put("query", twitterSearchQuery.b);
                            contentValues.put("name", twitterSearchQuery.a);
                            contentValues.put("time", System.currentTimeMillis());
                            contentValues.put("latitude", twitterSearchQuery.c);
                            contentValues.put("longitude", twitterSearchQuery.d);
                            contentValues.put("radius", twitterSearchQuery.e);
                            contentValues.put("location", twitterSearchQuery.f);
                            contentValues.put("query_id", twitterSearchQuery.g);
                            final long insert = writableDatabase.insert("search_queries", "query", contentValues);
                            writableDatabase.setTransactionSuccessful();
                            return insert;
                            this.a(n);
                            continue;
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                    }
                    break;
                }
            }
            break;
        }
    }
    
    public long a(final TwitterSearchQuery twitterSearchQuery, final int n, final b b) {
        long n2 = this.b(twitterSearchQuery, n);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        Label_0088: {
            if (n2 <= 0L) {
                break Label_0088;
            }
        Block_3_Outer:
            while (true) {
                switch (n) {
                    case 1:
                    case 2:
                    case 6:
                    case 7: {
                        break Label_0075;
                    }
                }
                try {
                    this.a(twitterSearchQuery, n2);
                    writableDatabase.setTransactionSuccessful();
                    return n2;
                    while (true) {
                        b.a(av.a);
                        continue Block_3_Outer;
                        n2 = this.a(twitterSearchQuery, n);
                        continue;
                    }
                }
                // iftrue(Label_0075:, b == null)
                finally {
                    writableDatabase.endTransaction();
                }
                break;
            }
        }
    }
    
    public long a(final String s, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        final ArrayList<String> list = new ArrayList<String>();
        if (s != null) {
            sb.append("conversation_id=?");
            list.add(s);
        }
        if (b) {
            if (s != null) {
                sb.append(" AND ");
            }
            sb.append("entry_type NOT IN (?)");
            list.add(TextUtils.join((CharSequence)",", (Object[])new Integer[] { 1 }));
        }
        final Cursor query = this.getReadableDatabase().query("conversation_entries", com.twitter.library.provider.bm.a, sb.toString(), (String[])list.toArray(new String[0]), (String)null, (String)null, "sort_entry_id DESC", "1");
        if (query == null) {
            return -1L;
        }
        try {
            if (query.moveToNext()) {
                return query.getLong(0);
            }
            return -1L;
        }
        finally {
            query.close();
        }
    }
    
    public TwitterUser a(final long n) {
        final Cursor query = this.getReadableDatabase().query("users", cv.a, "user_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        TwitterUser a = null;
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
    
    public TwitterUser a(final String username) {
        final Cursor query = this.getReadableDatabase().query("users", new String[] { "user_id", "name" }, "LOWER(username)=?", new String[] { username.toLowerCase() }, (String)null, (String)null, (String)null, "1");
        TwitterUser twitterUser = null;
        if (query == null) {
            return twitterUser;
        }
        try {
            if (query.moveToFirst()) {
                twitterUser = new TwitterUser();
                twitterUser.username = username;
                twitterUser.userId = query.getLong(0);
                twitterUser.name = query.getString(1);
                return twitterUser;
            }
            return null;
        }
        finally {
            query.close();
        }
    }
    
    public DMLocalMessageEntry a(final String s, final String s2, final long n, final String s3, final BaseDMAttachment baseDMAttachment, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final DMLocalMessageEntry dmLocalMessageEntry = new DMLocalMessageEntry(1L + this.a((String)null, false), s, s2, System.currentTimeMillis(), n, s3, null, baseDMAttachment);
            this.a((BaseConversationEntry)dmLocalMessageEntry, true, b);
            writableDatabase.setTransactionSuccessful();
            return dmLocalMessageEntry;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public String a(final int n, final int n2, final long n3) {
        return this.a(n, n2, n3, 0L);
    }
    
    public String a(final int n, final int n2, final long n3, final int n4) {
        String a = null;
        switch (n4) {
            default: {
                throw new IllegalArgumentException("Invalid page type: " + n4);
            }
            case 0: {
                if (bg.b) {
                    Log.d("DatabaseHelper", "getCursor(): start cursor for type: " + n2 + ", kind: " + n + ", owner id: " + n3);
                }
                a = "-1";
                break;
            }
            case 1: {
                a = this.a(n, n2, n3);
                if (bg.b) {
                    Log.d("DatabaseHelper", "getCursor(): next cursor for type: " + n2 + ", kind: " + n + ", owner id: " + n3 + " -> " + a);
                    return a;
                }
                break;
            }
        }
        return a;
    }
    
    public String a(final int n, final int n2, final long n3, final long n4) {
        return this.b(n, n2, n3, l(n4));
    }
    
    public String a(final int n, final int n2, final long n3, final String s) {
        if (n2 != 2 && n2 != 3) {
            throw new IllegalArgumentException("Unexpected type: " + n2);
        }
        if (n2 == -1) {
            return null;
        }
        while (true) {
            while (true) {
                String s3 = null;
                Label_0060: {
                    if (n2 == 2) {
                        final String s2 = " DESC";
                        s3 = "<?";
                        break Label_0060;
                    }
                    Label_0216: {
                        break Label_0216;
                        while (true) {
                            String s2 = null;
                            String string = null;
                            String[] array = null;
                            final Cursor query = this.getReadableDatabase().query("cursors", new String[] { "next", "ref_id" }, string, array, (String)null, (String)null, "CAST(ref_id AS INT)" + s2, "1");
                            try {
                                if (query.moveToFirst()) {
                                    return query.getString(0);
                                }
                                return null;
                                string = "owner_id=? AND type=? AND kind=?";
                                array = new String[] { String.valueOf(n3), String.valueOf(n2), String.valueOf(n) };
                                continue;
                                s2 = " ASC";
                                s3 = ">?";
                                break;
                            }
                            finally {
                                query.close();
                            }
                        }
                    }
                }
                if (s != null) {
                    final String string = "owner_id=? AND type=? AND kind=? AND CAST(ref_id AS INT)" + s3;
                    final String[] array = { String.valueOf(n3), String.valueOf(n2), String.valueOf(n), s };
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    public String a(final int n, final long n2, final String s) {
        return this.a(n, 2, n2, s);
    }
    
    public String a(final String s, final String s2, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String a = this.a(s, writableDatabase);
            final ContentValues contentValues = new ContentValues(1);
            contentValues.put("title", s2);
            writableDatabase.update("conversations", contentValues, "conversation_id=?", new String[] { s });
            writableDatabase.setTransactionSuccessful();
            return a;
        }
        finally {
            writableDatabase.endTransaction();
            if (b != null) {
                b.a(com.twitter.library.provider.al.a);
            }
        }
    }
    
    public ArrayList a(final ArrayList list, final long n, final int n2, final boolean b, final boolean b2, final b b3) {
        final ArrayList<Comparable> list2 = new ArrayList<Comparable>();
        if (list.size() == 0) {
            if (b2) {
                this.b(n2, b3);
            }
            return list2;
        }
        final ArrayList a = this.a(list, n2);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        while (true) {
            Label_0363: {
                if (b) {
                    break Label_0363;
                }
                HashMap<Long, TwitterUser> hashMap;
                LinkedHashMap<Object, Object> linkedHashMap;
                HashMap<Long, bp> hashMap2;
                HashMap<Long, be> hashMap3;
                long n3;
                while (true) {
                    bh b4 = null;
                    int size;
                    ContentValues contentValues = null;
                    Iterator<com.twitter.library.api.az> iterator;
                    int n4;
                    com.twitter.library.api.az az = null;
                    int n5 = 0;
                    int n6;
                    boolean b5;
                    int a2 = 0;
                    long insert = 0L;
                    int n7 = 0;
                    Iterator iterator2;
                    int n8;
                    TwitterUser twitterUser;
                    long a3 = 0L;
                    String[] array = null;
                    String[] array2 = null;
                    ContentValues contentValues2;
                    ContentValues contentValues3;
                    long insert2;
                    int n9;
                    bp c;
                    bp bp;
                    Iterator iterator3;
                    long a4;
                    bp bp3;
                    Iterator iterator7;
                    long a5;
                    Label_0167_Outer:Label_0197_Outer:Label_0280_Outer:
                    while (true) {
                    Label_1628:
                        while (true) {
                            Label_1555: {
                                Label_1547: {
                                    Label_0645: {
                                        Label_0387: {
                                        Label_0381:
                                            while (true) {
                                            Label_0375:
                                                while (true) {
                                                    Label_0369: {
                                                        try {
                                                            b4 = b(writableDatabase, n2);
                                                            hashMap = new HashMap<Long, TwitterUser>();
                                                            linkedHashMap = new LinkedHashMap<Object, Object>();
                                                            hashMap2 = new HashMap<Long, bp>();
                                                            hashMap3 = new HashMap<Long, be>();
                                                            n3 = 0L;
                                                            size = list.size();
                                                            contentValues = new ContentValues();
                                                            iterator = list.iterator();
                                                            n4 = 0;
                                                            if (!iterator.hasNext()) {
                                                                break;
                                                            }
                                                            az = iterator.next();
                                                            n5 = n4 + 1;
                                                            if (n5 != size) {
                                                                break Label_0369;
                                                            }
                                                            n6 = 1;
                                                            contentValues.clear();
                                                            contentValues.put("type", n2);
                                                            if (!b2 || n6 == 0) {
                                                                break Label_0375;
                                                            }
                                                            b5 = true;
                                                            contentValues.put("is_last", b5);
                                                            if (n6 == 0) {
                                                                break Label_0645;
                                                            }
                                                            a2 = a(b4, az, n2);
                                                            a(contentValues, a2, b4, az);
                                                            if (a2 != 0) {
                                                                break Label_0387;
                                                            }
                                                            contentValues.put("tag", 1);
                                                            insert = writableDatabase.insert("activities", (String)null, contentValues);
                                                            if (insert > 0L) {
                                                                n7 = 1;
                                                                break Label_1547;
                                                            }
                                                            break Label_0381;
                                                            while (true) {
                                                                Block_44: {
                                                                    Block_46: {
                                                                        break Block_46;
                                                                        break Block_44;
                                                                    }
                                                                    twitterUser = iterator2.next();
                                                                    hashMap.put(twitterUser.userId, twitterUser);
                                                                    continue Label_0280_Outer;
                                                                }
                                                                list2.add(az);
                                                                iterator2 = az.g.iterator();
                                                                continue Label_0280_Outer;
                                                            }
                                                        }
                                                        // iftrue(Label_0692:, !iterator2.hasNext())
                                                        // iftrue(Label_1628:, n8 == 0)
                                                        // iftrue(Label_0709:, az.f != 1)
                                                        finally {
                                                            writableDatabase.endTransaction();
                                                        }
                                                        break Label_0363;
                                                    }
                                                    n6 = 0;
                                                    continue Label_0197_Outer;
                                                }
                                                b5 = false;
                                                continue Label_0280_Outer;
                                            }
                                            n7 = 0;
                                            break Label_1547;
                                        }
                                        a3 = b4.a;
                                        if (writableDatabase.update("activities", contentValues, "_id=?", new String[] { String.valueOf(a3) }) > 0) {
                                            n8 = 1;
                                        }
                                        else {
                                            n8 = 0;
                                        }
                                        if (n8 == 0) {
                                            break Label_1555;
                                        }
                                        switch (a2) {
                                            case 1: {
                                                array = new String[] { String.valueOf(8), String.valueOf(a3) };
                                                array2 = null;
                                                break;
                                            }
                                            case 2: {
                                                array = new String[] { String.valueOf(13), String.valueOf(a3) };
                                                array2 = null;
                                                break;
                                            }
                                            case 3: {
                                                array2 = new String[] { String.valueOf(12), String.valueOf(a3) };
                                                array = null;
                                                break;
                                            }
                                            case 4: {
                                                array2 = new String[] { String.valueOf(14), String.valueOf(a3) };
                                                array = null;
                                                break;
                                            }
                                            default: {
                                                array2 = null;
                                                array = null;
                                                break;
                                            }
                                        }
                                        if (array != null) {
                                            contentValues2 = new ContentValues();
                                            contentValues2.put("tag", a3);
                                            writableDatabase.update("user_groups", contentValues2, "type=? AND tag=?", array);
                                            break Label_1555;
                                        }
                                        if (array2 != null) {
                                            contentValues3 = new ContentValues();
                                            contentValues3.put("tag", a3);
                                            writableDatabase.update("status_groups", contentValues3, "type=? AND tag=?", array2);
                                        }
                                        break Label_1555;
                                    }
                                    a(contentValues, 0, null, az);
                                    contentValues.put("tag", 1);
                                    insert2 = writableDatabase.insert("activities", (String)null, contentValues);
                                    if (insert2 > 0L) {
                                        n9 = 1;
                                    }
                                    else {
                                        n9 = 0;
                                    }
                                    n8 = n9;
                                    continue;
                                    Label_0692: {
                                        this.a(az.g, n, 8, insert2, null, b3);
                                    }
                                    Label_0709:
                                    if (14 == az.a && az.o != null && az.o.size() > 0) {
                                        c = az.o.get(0);
                                    }
                                    else {
                                        c = null;
                                    }
                                    switch (az.i) {
                                        case 2: {
                                            if (af.a(n2) && 3 == az.a) {
                                                bp = null;
                                                iterator3 = az.k.iterator();
                                                while (iterator3.hasNext()) {
                                                    bp = iterator3.next();
                                                    linkedHashMap.put(bp.a, bp);
                                                }
                                                if (bp != null) {
                                                    a4 = bp.a;
                                                }
                                                else {
                                                    a4 = n3;
                                                }
                                                n3 = a4;
                                                break;
                                            }
                                            for (final bp bp2 : az.k) {
                                                if (c != null && bp2.C == null) {
                                                    bp2.C = c;
                                                }
                                                hashMap2.put(bp2.a, bp2);
                                            }
                                            this.a(az.k, n, 12, insert2, false, false, true, null, false);
                                            break;
                                        }
                                        case 1: {
                                            for (final TwitterUser twitterUser2 : az.j) {
                                                hashMap.put(twitterUser2.userId, twitterUser2);
                                            }
                                            this.a(az.j, n, 13, insert2, null, b3);
                                            break;
                                        }
                                        case 3: {
                                            for (final be be : az.l) {
                                                hashMap3.put(be.a(), be);
                                            }
                                            break;
                                        }
                                    }
                                    switch (az.n) {
                                        case 2: {
                                            if (af.a(n2) && 2 == az.a) {
                                                bp3 = null;
                                                iterator7 = az.o.iterator();
                                                while (iterator7.hasNext()) {
                                                    bp3 = iterator7.next();
                                                    linkedHashMap.put(bp3.a, bp3);
                                                }
                                                if (bp3 != null) {
                                                    a5 = bp3.a;
                                                }
                                                else {
                                                    a5 = n3;
                                                }
                                                n3 = a5;
                                                break Label_1628;
                                            }
                                            if (c == null) {
                                                for (final bp bp4 : az.o) {
                                                    hashMap2.put(bp4.a, bp4);
                                                }
                                                this.a(az.o, n, 14, insert2, false, false, true, null, false);
                                            }
                                            break Label_1628;
                                        }
                                        case 3: {
                                            for (final be be2 : az.p) {
                                                hashMap3.put(be2.a(), be2);
                                            }
                                            break Label_1628;
                                        }
                                    }
                                }
                                n8 = n7;
                                a3 = insert;
                            }
                            insert2 = a3;
                            continue;
                        }
                        n4 = n5;
                        continue Label_0167_Outer;
                    }
                }
                if (!hashMap.isEmpty()) {
                    this.a(hashMap.values(), n, -1, -1L, null, null, true, b3);
                }
                if (!hashMap2.isEmpty()) {
                    this.a(hashMap2.values(), n, -1, -1L, false, false, true, null, false, null, true);
                }
                if (!linkedHashMap.isEmpty()) {
                    String value;
                    if (b) {
                        value = String.valueOf(n3);
                    }
                    else {
                        value = null;
                    }
                    this.a(linkedHashMap.values(), n, 5, -1L, b, b, value == null, value, true, b3, true);
                }
                if (!hashMap3.isEmpty()) {
                    this.a(hashMap3.values(), n, 3, null, false, b3);
                }
                if (!list2.isEmpty() && !b) {
                    this.g(n, n2);
                }
                list2.removeAll(a);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                Collections.sort(list2);
                Collections.reverse(list2);
                return list2;
            }
            bh b4 = null;
            continue;
        }
    }
    
    public ArrayList a(final boolean b) {
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        final String[] array = { "ev_id", "ev_title", "ev_subtitle", "ev_content", "is_read" };
        final StringBuilder append = new StringBuilder().append("t_type=6 AND ");
        while (true) {
            Label_0320: {
                if (!b) {
                    break Label_0320;
                }
                final String s = "(t_flags&?)!=0";
                final Cursor query = readableDatabase.query("timeline_view", array, append.append(s).toString(), new String[] { String.valueOf(1048576) }, (String)null, (String)null, "preview_draft_id DESC, t_updated_at DESC, _id ASC", (String)null);
                if (query != null) {
                    final ArrayList<TwitterTopic> list = new ArrayList<TwitterTopic>();
                    String string;
                    String string2;
                    String string3;
                    TwitterTopic$TrendsPlus twitterTopic$TrendsPlus;
                    boolean b2;
                    TwitterTopic$TrendsPlus$ContextInfo contextInfo;
                    TwitterTopic$TrendsPlus$TargetInfo targetInfo;
                    TwitterTopic$Metadata twitterTopic$Metadata;
                    String query2;
                    long count;
                    TwitterTopic twitterTopic;
                    Label_0197_Outer:Label_0259_Outer:
                    while (true) {
                        while (true) {
                        Label_0334:
                            while (true) {
                                Label_0328: {
                                    try {
                                        while (query.moveToNext()) {
                                            string = query.getString(0);
                                            string2 = query.getString(1);
                                            string3 = query.getString(2);
                                            twitterTopic$TrendsPlus = (TwitterTopic$TrendsPlus)com.twitter.util.f.a(query.getBlob(3));
                                            if (query.getInt(4) != 1) {
                                                break Label_0328;
                                            }
                                            b2 = true;
                                            if (twitterTopic$TrendsPlus == null) {
                                                continue Label_0197_Outer;
                                            }
                                            contextInfo = twitterTopic$TrendsPlus.contextInfo;
                                            targetInfo = twitterTopic$TrendsPlus.targetInfo;
                                            twitterTopic$Metadata = new TwitterTopic$Metadata(3, string, false);
                                            query2 = targetInfo.query;
                                            if (contextInfo == null || contextInfo.tweetCount == null) {
                                                break Label_0334;
                                            }
                                            count = contextInfo.tweetCount.count;
                                            twitterTopic = new TwitterTopic(twitterTopic$Metadata, string2, string3, query2, null, null, null, null, count, 0L, 0L, null, null, twitterTopic$TrendsPlus, null, null);
                                            twitterTopic.a(b2);
                                            list.add(twitterTopic);
                                        }
                                        break;
                                    }
                                    finally {
                                        query.close();
                                    }
                                    break Label_0320;
                                }
                                b2 = false;
                                continue Label_0259_Outer;
                            }
                            count = 0L;
                            continue;
                        }
                    }
                    query.close();
                    return list;
                }
                return null;
            }
            final String s = "NOT ((t_flags&?)!=0)";
            continue;
        }
    }
    
    public Collection a(final Collection collection, final long n, final int n2, final long n3, final boolean b, final boolean b2, final boolean b3, final String s, final boolean b4, final b b5, final boolean b6) {
        return this.a(collection, n, n2, n3, b, b2, b3, s, b4, b5, b6, false);
    }
    
    public Collection a(final Collection collection, final long n, final int n2, final long n3, final boolean b, final boolean b2, final boolean b3, final String s, final boolean b4, final b b5, final boolean b6, final boolean b7) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Merge statuses: " + collection.size() + ", of type: " + n2 + ", owned by: " + n + ", last page: " + b2);
        }
        if (n2 != -1 && n < 0L) {
            throw new IllegalArgumentException("null owner id not allowed for type: " + n2);
        }
        SQLiteDatabase writableDatabase;
        HashMap<Object, bp> hashMap;
        Cursor a;
        int n4 = 0;
        while (true) {
            Collections.emptyList();
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                int n6 = 0;
                Label_1576: {
                    Label_1572: {
                        ContentValues contentValues;
                        long long1 = 0L;
                        bp bp = null;
                        try {
                            if (collection.isEmpty()) {
                                if (b2) {
                                    this.d(n, n2, b5);
                                }
                                writableDatabase.setTransactionSuccessful();
                                return Collections.emptySet();
                            }
                            if (s != null) {
                                this.a(3, n2, n, 0L, s);
                            }
                            hashMap = new HashMap<Object, bp>();
                            a = a(writableDatabase, "statuses", ck.a, "status_id", null, null, collection, hashMap, null);
                            if (a == null) {
                                writableDatabase.setTransactionSuccessful();
                                return Collections.emptySet();
                            }
                            n4 = 0;
                            try {
                                contentValues = new ContentValues();
                                while (a.moveToNext()) {
                                    long1 = a.getLong(3);
                                    contentValues.clear();
                                    bp = hashMap.remove(a.getLong(1));
                                    if (bp == null) {
                                        break Label_1572;
                                    }
                                    if ((0x100L & long1) <= 0L) {
                                        break;
                                    }
                                    final Iterator<bp> iterator = collection.iterator();
                                    while (iterator.hasNext()) {
                                        if (iterator.next().a() == bp.a()) {
                                            iterator.remove();
                                            break;
                                        }
                                    }
                                }
                            }
                            finally {
                                a.close();
                            }
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                        final bp c = bp.c();
                        if (n2 == 19) {
                            a(c, contentValues, this.h);
                        }
                        else {
                            contentValues.put("content", c.b);
                            contentValues.put("r_content", c.d);
                            contentValues.put("retweeted", c.z);
                            contentValues.put("favorited", c.A);
                            contentValues.put("retweet_count", c.m);
                            contentValues.put("favorite_count", c.B);
                            contentValues.put("lang", c.o);
                            contentValues.put("entities", com.twitter.util.f.a(c.c));
                            if (c.C == null) {
                                contentValues.putNull("quoted_tweet_data");
                            }
                            else {
                                contentValues.put("quoted_tweet_data", com.twitter.util.f.a(new QuotedTweetData(c.C)));
                            }
                            long n5;
                            if (c.p) {
                                n5 = (0x40L | long1);
                            }
                            else {
                                n5 = (0xFFFFFFFFFFFFFFBFL & long1);
                            }
                            if (c.n > -1) {
                                contentValues.put("view_count", c.n);
                            }
                            if (c.v != null) {
                                if (c.v.cardInstanceData != null) {
                                    n5 |= a(c.v);
                                    contentValues.put("cards", com.twitter.util.f.a(c.v));
                                }
                                else if (c.v.classicCard != null) {
                                    final TwitterStatusCard twitterStatusCard = (TwitterStatusCard)com.twitter.util.f.a(a.getBlob(2));
                                    if (twitterStatusCard != null && twitterStatusCard.cardInstanceData == null) {
                                        n5 |= a(c.v);
                                        contentValues.put("cards", com.twitter.util.f.a(c.v));
                                    }
                                }
                            }
                            if (n5 != long1) {
                                contentValues.put("flags", n5);
                            }
                        }
                        final long long2 = a.getLong(0);
                        if (bg.b) {
                            Log.d("DatabaseHelper", "Updating status at row id: " + long2);
                        }
                        n6 = n4 + writableDatabase.update("statuses", contentValues, "_id=?", new String[] { String.valueOf(long2) });
                        break Label_1576;
                    }
                    n6 = n4;
                }
                n4 = n6;
                continue;
            }
        }
        a.close();
        final HashMap<Long, TwitterUser> hashMap2 = new HashMap<Long, TwitterUser>();
        for (final bp bp2 : collection) {
            final TwitterUser y = bp2.y;
            hashMap2.put(y.userId, y);
            final bp l = bp2.l;
            final bp c2 = bp2.C;
            if (l != null) {
                final TwitterUser y2 = l.y;
                hashMap2.put(y2.userId, y2);
            }
            if (c2 != null) {
                final TwitterUser y3 = c2.y;
                hashMap2.put(y3.userId, y3);
            }
        }
        this.a(hashMap2.values(), -1L, -1, -1L, null, null, b6, b5);
        int n7;
        if (hashMap.size() > 0) {
            final ContentValues contentValues2 = new ContentValues();
            final Iterator<bp> iterator3 = hashMap.values().iterator();
            n7 = 0;
            while (iterator3.hasNext()) {
                final bp bp3 = iterator3.next();
                contentValues2.clear();
                int n9;
                if (a(bp3.c(), contentValues2, this.h)) {
                    int n8;
                    if (writableDatabase.insert("statuses", "status_id", contentValues2) > 0L) {
                        n8 = 1;
                    }
                    else {
                        n8 = 0;
                    }
                    n9 = n8 + n7;
                }
                else {
                    n9 = n7;
                }
                n7 = n9;
            }
        }
        else {
            n7 = 0;
        }
        if (bg.b) {
            Log.d("DatabaseHelper", "Inserted new statuses: " + n7 + ", of type: " + n2);
        }
        while (true) {
            long n10 = 0L;
            Label_1620: {
                Collection<bp> collection2 = null;
                Label_1545: {
                    Label_1417: {
                        if (n2 == -1) {
                            break Label_1417;
                        }
                        collection2 = (Collection<bp>)this.a(collection, n, n2, n3, b, b2, b3, s, b4);
                        if (b5 != null && n7 + n4 + collection2.size() > 0) {
                            b5.a(bg.d);
                            b5.a(bg.e);
                        }
                        while (true) {
                            if (!b7) {
                                break Label_1545;
                            }
                            final ContentValues contentValues3 = new ContentValues();
                            final long currentTimeMillis = System.currentTimeMillis();
                            final Iterator<bp> iterator4 = collection.iterator();
                            if (!iterator4.hasNext()) {
                                break Label_1417;
                            }
                            final bp bp4 = iterator4.next();
                            final Cursor query = writableDatabase.query("category_timestamp", new String[] { "cat_status_id", "cat_tag" }, "cat_status_id=? AND cat_tag=?", new String[] { String.valueOf(bp4.a()), String.valueOf(n3) }, (String)null, (String)null, (String)null);
                            if (query == null) {
                                n10 = currentTimeMillis;
                                break Label_1620;
                            }
                            try {
                                if (query.moveToFirst()) {
                                    contentValues3.clear();
                                    n10 = currentTimeMillis - 1L;
                                    contentValues3.put("cat_timestamp", currentTimeMillis);
                                    writableDatabase.update("category_timestamp", contentValues3, "cat_status_id=? AND cat_tag=?", new String[] { String.valueOf(bp4.a()), String.valueOf(n3) });
                                }
                                else {
                                    contentValues3.clear();
                                    contentValues3.put("cat_status_id", bp4.a());
                                    contentValues3.put("cat_tag", n3);
                                    n10 = currentTimeMillis - 1L;
                                    contentValues3.put("cat_timestamp", currentTimeMillis);
                                    writableDatabase.insert("category_timestamp", (String)null, contentValues3);
                                }
                                break Label_1620;
                                collection2 = hashMap.values();
                                continue;
                            }
                            finally {
                                query.close();
                            }
                            break;
                        }
                    }
                    if (b5 != null && collection.size() > 0) {
                        b5.a(ah.a);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return collection2;
            }
            final long currentTimeMillis = n10;
            continue;
        }
    }
    
    public Collection a(final Collection collection, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Merge topics: " + collection.size());
        }
        final HashMap<Object, TwitterTopic> hashMap = new HashMap<Object, TwitterTopic>();
        if (collection.size() > 0) {
            SQLiteDatabase writableDatabase;
            int n2;
            while (true) {
                writableDatabase = this.getWritableDatabase();
                writableDatabase.beginTransaction();
                int n3 = 0;
            Label_0369:
                while (true) {
                    Label_0423: {
                        try {
                            final Cursor a = a(writableDatabase, "topics", cr.a, "ev_id", null, null, collection, null, hashMap);
                            if (a == null) {
                                break Label_0423;
                            }
                            try {
                                final ContentValues contentValues = new ContentValues();
                                int n = 0;
                                while (a.moveToNext()) {
                                    contentValues.clear();
                                    final TwitterTopic twitterTopic = hashMap.remove(a.getString(1));
                                    if (twitterTopic != null) {
                                        a(twitterTopic, a.getBlob(2));
                                        a(twitterTopic, contentValues);
                                        final long long1 = a.getLong(0);
                                        if (bg.b) {
                                            Log.d("DatabaseHelper", "Updating topic at row id: " + long1);
                                        }
                                        writableDatabase.update("topics", contentValues, "_id=?", new String[] { String.valueOf(long1) });
                                        ++n;
                                        twitterTopic.a(long1);
                                    }
                                }
                                a.close();
                                n2 = n;
                                if (!hashMap.isEmpty()) {
                                    final ContentValues contentValues2 = new ContentValues();
                                    final Iterator<TwitterTopic> iterator = hashMap.values().iterator();
                                    n3 = n2;
                                    while (iterator.hasNext()) {
                                        final TwitterTopic twitterTopic2 = iterator.next();
                                        contentValues2.clear();
                                        a(twitterTopic2, contentValues2);
                                        twitterTopic2.a(writableDatabase.insert("topics", "ev_id", contentValues2));
                                        ++n3;
                                    }
                                    break Label_0369;
                                }
                                break;
                            }
                            finally {
                                a.close();
                            }
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                        break Label_0369;
                    }
                    n2 = 0;
                    continue;
                }
                n2 = n3;
                break;
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null && n2 > 0) {
                b.a(bd.a, aq.a);
            }
        }
        return hashMap.values();
    }
    
    public HashMap a(final SQLiteDatabase sqLiteDatabase, final HashMap hashMap) {
        final HashMap<String, xa> hashMap2 = new HashMap<String, xa>();
        sqLiteDatabase.beginTransaction();
        Label_0299: {
            Label_0197: {
                Cursor a;
                try {
                    if (hashMap.isEmpty()) {
                        break Label_0299;
                    }
                    final HashMap<Object, xa> hashMap3 = new HashMap<Object, xa>();
                    a = a(sqLiteDatabase, "clusters", bl.a, "cl_cluster_id", null, null, hashMap.values(), null, hashMap3);
                    if (a == null) {
                        break Label_0197;
                    }
                    try {
                        final ContentValues contentValues = new ContentValues();
                        while (a.moveToNext()) {
                            final xa xa = hashMap3.remove(a.getString(1));
                            contentValues.clear();
                            a(contentValues, xa);
                            final String b = xa.b();
                            if (sqLiteDatabase.update("clusters", contentValues, "cl_cluster_id=?", new String[] { b }) > 0) {
                                xa.a = a.getLong(0);
                                hashMap2.put(b, xa);
                                hashMap.remove(b);
                            }
                        }
                    }
                    finally {
                        a.close();
                    }
                }
                finally {
                    sqLiteDatabase.endTransaction();
                }
                a.close();
            }
            if (!hashMap.isEmpty()) {
                final ContentValues contentValues2 = new ContentValues();
                for (final xa xa2 : hashMap.values()) {
                    contentValues2.clear();
                    a(contentValues2, xa2);
                    final long insert = sqLiteDatabase.insert("clusters", (String)null, contentValues2);
                    if (insert > 0L) {
                        xa2.a = insert;
                        hashMap2.put(xa2.b, xa2);
                    }
                }
            }
        }
        sqLiteDatabase.setTransactionSuccessful();
        sqLiteDatabase.endTransaction();
        return hashMap2;
    }
    
    public List a(final String s, final int n, final int n2) {
        final String trim = s.trim();
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        final StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty((CharSequence)trim)) {
            final char char1 = trim.charAt(0);
            boolean b = false;
            if (char1 != '@') {
                b = true;
            }
            final String string = com.twitter.library.util.bq.a(trim) + '%';
            final String sqlEscapeString = DatabaseUtils.sqlEscapeString(string);
            sb.append("(username LIKE " + sqlEscapeString);
            if (b) {
                sb.append(" OR name LIKE " + sqlEscapeString + " OR " + "name" + " LIKE " + DatabaseUtils.sqlEscapeString("% " + string));
            }
            sb.append(')');
        }
        if (n != 0) {
            if (sb.length() != 0) {
                sb.append(" AND ");
            }
            sb.append("(friendship&" + n + '=' + n);
            sb.append(')');
        }
        while (true) {
            Label_0353: {
                if (sb.length() <= 0) {
                    break Label_0353;
                }
                final String string2 = sb.toString();
                final Cursor query = readableDatabase.query("weighted_users", cv.a, string2, (String[])null, (String)null, (String)null, "weight DESC, name ASC", String.valueOf(n2));
                final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
                if (query != null) {
                    Label_0359: {
                        try {
                            while (query.moveToNext()) {
                                list.add(a(query));
                            }
                            break Label_0359;
                        }
                        finally {
                            query.close();
                        }
                        break Label_0353;
                    }
                    query.close();
                }
                return list;
            }
            final String string2 = null;
            continue;
        }
    }
    
    public List a(final long[] array) {
        if (array == null || array.length == 0) {
            return new ArrayList();
        }
        final String[] array2 = new String[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = String.valueOf(array[i]);
        }
        return this.d("user_id", array2);
    }
    
    public List a(final String[] array) {
        if (array == null || array.length == 0) {
            return new ArrayList();
        }
        return this.d("username", array);
    }
    
    public void a() {
        a(this.getWritableDatabase());
    }
    
    public void a(final int n) {
        if (bg.b) {
            Log.d("DatabaseHelper", "removeOldSearchQueries of type: " + n);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final Cursor query = writableDatabase.query("search_queries", ca.a, "type=?", new String[] { String.valueOf(n) }, (String)null, (String)null, "time ASC");
            if (query == null) {
                writableDatabase.setTransactionSuccessful();
                return;
            }
            try {
                int n2 = -10 + query.getCount();
                if (n2 <= 0) {
                    writableDatabase.setTransactionSuccessful();
                    return;
                }
                if (bg.b) {
                    Log.d("DatabaseHelper", "Removing old search queries: " + n2);
                }
                while (query.moveToNext() && n2 >= 0) {
                    writableDatabase.delete("search_queries", "_id=?", new String[] { String.valueOf((long)query.getInt(0)) });
                    --n2;
                }
                writableDatabase.setTransactionSuccessful();
            }
            finally {
                query.close();
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final int n, final int n2, final long n3, final long n4, final String s) {
        this.a(n, n2, n3, l(n4), s);
    }
    
    public void a(final int n, final int n2, final long n3, final String s, final String s2) {
        if (s2 != null) {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("kind", n);
            contentValues.put("type", n2);
            contentValues.put("owner_id", n3);
            while (true) {
                while (true) {
                    Label_0064: {
                        if (s != null) {
                            contentValues.put("ref_id", s);
                            break Label_0064;
                        }
                        Label_0253: {
                            break Label_0253;
                            while (true) {
                                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                                writableDatabase.beginTransaction();
                                try {
                                    Label_0178: {
                                        String s3 = null;
                                        String[] array = null;
                                        if (writableDatabase.update("cursors", contentValues, s3, array) != 0) {
                                            break Label_0178;
                                        }
                                        try {
                                            writableDatabase.insertOrThrow("cursors", "owner_id", contentValues);
                                            writableDatabase.setTransactionSuccessful();
                                            writableDatabase.endTransaction();
                                            if (bg.b) {
                                                Log.d("DatabaseHelper", "Saved cursor for type: " + n2 + ", kind: " + n + ", refId " + s + ", next: " + s2);
                                                return;
                                            }
                                            return;
                                            contentValues.putNull("ref_id");
                                            s3 = "owner_id=? AND type=? AND kind=? AND ref_id IS NULL";
                                            array = new String[] { String.valueOf(n3), String.valueOf(n2), String.valueOf(n) };
                                            continue;
                                            contentValues.putNull("ref_id");
                                        }
                                        catch (SQLException ex) {
                                            ErrorReporter.a(new a((Throwable)ex).a("cursor.kind", n).a("cursor.type", n2).a("cursor.ownerId", n3).a("cursor.refId", s).a("cursor.next", s2));
                                        }
                                    }
                                }
                                finally {
                                    writableDatabase.endTransaction();
                                }
                            }
                        }
                    }
                    contentValues.put("next", s2);
                    if (s != null) {
                        contentValues.put("ref_id", s);
                        final String s3 = "owner_id=? AND type=? AND kind=? AND ref_id=?";
                        final String[] array = { String.valueOf(n3), String.valueOf(n2), String.valueOf(n), String.valueOf(s) };
                        continue;
                    }
                    break;
                }
                continue;
            }
        }
    }
    
    public void a(final int p0, final long p1, final long p2, final be p3, final b p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload           6
        //     2: invokevirtual   com/twitter/library/api/be.a:()J
        //     5: lstore          8
        //     7: getstatic       com/twitter/library/provider/bg.b:Z
        //    10: ifeq            61
        //    13: ldc             "DatabaseHelper"
        //    15: new             Ljava/lang/StringBuilder;
        //    18: dup            
        //    19: invokespecial   java/lang/StringBuilder.<init>:()V
        //    22: ldc_w           "Removing list user "
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: lload           4
        //    30: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    33: ldc_w           ", of type: "
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: iload_1        
        //    40: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    43: ldc_w           ", from list id: "
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    49: lload           8
        //    51: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    54: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    57: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    60: pop            
        //    61: aload_0        
        //    62: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    65: astore          10
        //    67: aload           10
        //    69: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    72: iconst_3       
        //    73: anewarray       Ljava/lang/String;
        //    76: astore          12
        //    78: aload           12
        //    80: iconst_0       
        //    81: lload_2        
        //    82: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    85: aastore        
        //    86: aload           12
        //    88: iconst_1       
        //    89: iload_1        
        //    90: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    93: aastore        
        //    94: aload           12
        //    96: iconst_2       
        //    97: lload           4
        //    99: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   102: aastore        
        //   103: aload           10
        //   105: ldc_w           "user_groups"
        //   108: ldc_w           "owner_id=? AND type=? AND user_id=?"
        //   111: aload           12
        //   113: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   116: pop            
        //   117: iload_1        
        //   118: tableswitch {
        //                8: 187
        //                9: 373
        //          default: 140
        //        }
        //   140: iload_1        
        //   141: iconst_5       
        //   142: if_icmpne       151
        //   145: aload_0        
        //   146: aload           6
        //   148: invokevirtual   com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/be;)V
        //   151: aload           10
        //   153: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   156: aload           10
        //   158: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   161: aload           7
        //   163: ifnull          186
        //   166: iconst_1       
        //   167: anewarray       Landroid/net/Uri;
        //   170: astore          17
        //   172: aload           17
        //   174: iconst_0       
        //   175: getstatic       com/twitter/library/provider/be.a:Landroid/net/Uri;
        //   178: aastore        
        //   179: aload           7
        //   181: aload           17
        //   183: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   186: return         
        //   187: getstatic       com/twitter/library/provider/ci.a:[Ljava/lang/String;
        //   190: astore          19
        //   192: iconst_4       
        //   193: anewarray       Ljava/lang/String;
        //   196: astore          20
        //   198: aload           20
        //   200: iconst_0       
        //   201: lload_2        
        //   202: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   205: aastore        
        //   206: aload           20
        //   208: iconst_1       
        //   209: bipush          9
        //   211: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   214: aastore        
        //   215: aload           20
        //   217: iconst_2       
        //   218: lload           8
        //   220: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   223: aastore        
        //   224: aload           20
        //   226: iconst_3       
        //   227: lload           4
        //   229: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   232: aastore        
        //   233: aload           10
        //   235: ldc_w           "status_groups_view"
        //   238: aload           19
        //   240: ldc_w           "owner_id=? AND type=? AND tag=? AND sender_id=?"
        //   243: aload           20
        //   245: aconst_null    
        //   246: aconst_null    
        //   247: aconst_null    
        //   248: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   251: astore          21
        //   253: aload           21
        //   255: ifnull          140
        //   258: aload           21
        //   260: invokeinterface android/database/Cursor.getCount:()I
        //   265: ifle            341
        //   268: iconst_0       
        //   269: istore          23
        //   271: iconst_1       
        //   272: anewarray       Ljava/lang/String;
        //   275: astore          24
        //   277: aload           21
        //   279: invokeinterface android/database/Cursor.moveToNext:()Z
        //   284: ifeq            323
        //   287: aload           24
        //   289: iconst_0       
        //   290: aload           21
        //   292: iconst_0       
        //   293: invokeinterface android/database/Cursor.getLong:(I)J
        //   298: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   301: aastore        
        //   302: iload           23
        //   304: aload           10
        //   306: ldc_w           "status_groups"
        //   309: ldc_w           "_id=?"
        //   312: aload           24
        //   314: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   317: iadd           
        //   318: istore          23
        //   320: goto            277
        //   323: iload           23
        //   325: ifle            341
        //   328: aload           7
        //   330: ifnull          341
        //   333: aload           7
        //   335: getstatic       com/twitter/library/provider/bg.d:[Landroid/net/Uri;
        //   338: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   341: aload           21
        //   343: invokeinterface android/database/Cursor.close:()V
        //   348: goto            140
        //   351: astore          11
        //   353: aload           10
        //   355: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   358: aload           11
        //   360: athrow         
        //   361: astore          22
        //   363: aload           21
        //   365: invokeinterface android/database/Cursor.close:()V
        //   370: aload           22
        //   372: athrow         
        //   373: getstatic       com/twitter/library/provider/bg.b:Z
        //   376: ifeq            417
        //   379: ldc             "DatabaseHelper"
        //   381: new             Ljava/lang/StringBuilder;
        //   384: dup            
        //   385: invokespecial   java/lang/StringBuilder.<init>:()V
        //   388: ldc_w           "Removing subscriber list: "
        //   391: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   394: lload           8
        //   396: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   399: ldc_w           ", owned by: "
        //   402: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   405: lload           4
        //   407: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   410: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   413: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   416: pop            
        //   417: iconst_3       
        //   418: anewarray       Ljava/lang/String;
        //   421: astore          14
        //   423: aload           14
        //   425: iconst_0       
        //   426: lload           8
        //   428: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   431: aastore        
        //   432: aload           14
        //   434: iconst_1       
        //   435: iconst_2       
        //   436: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   439: aastore        
        //   440: aload           14
        //   442: iconst_2       
        //   443: lload_2        
        //   444: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   447: aastore        
        //   448: aload           10
        //   450: ldc_w           "list_mapping"
        //   453: ldc_w           "list_mapping_list_id=? AND list_mapping_type=? AND list_mapping_user_id=?"
        //   456: aload           14
        //   458: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   461: istore          15
        //   463: aload_0        
        //   464: lload           8
        //   466: iconst_0       
        //   467: invokevirtual   com/twitter/library/provider/bg.a:(JZ)V
        //   470: iload           15
        //   472: ifle            140
        //   475: aload           7
        //   477: ifnull          140
        //   480: iconst_1       
        //   481: anewarray       Landroid/net/Uri;
        //   484: astore          16
        //   486: aload           16
        //   488: iconst_0       
        //   489: getstatic       com/twitter/library/provider/aq.a:Landroid/net/Uri;
        //   492: aastore        
        //   493: aload           7
        //   495: aload           16
        //   497: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   500: goto            140
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  72     117    351    361    Any
        //  145    151    351    361    Any
        //  151    156    351    361    Any
        //  187    253    351    361    Any
        //  258    268    361    373    Any
        //  271    277    361    373    Any
        //  277    320    361    373    Any
        //  333    341    361    373    Any
        //  341    348    351    361    Any
        //  363    373    351    361    Any
        //  373    417    351    361    Any
        //  417    470    351    361    Any
        //  480    500    351    361    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0277:
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
    
    public void a(final int n, final long n2, final long n3, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Removing user: " + n3 + ", owned by: " + n2 + ", of type: " + n);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("user_groups", "owner_id=? AND type=? AND user_id=?", new String[] { String.valueOf(n2), String.valueOf(n), String.valueOf(n3) });
            switch (n) {
                case 0: {
                    this.a(writableDatabase, "owner_id=?", "owner_id=? AND type != 13", new String[] { String.valueOf(n2) }, n2, 0, "owner_id=? AND type=? AND sender_id=?", new String[] { String.valueOf(n2), String.valueOf(0), String.valueOf(n3) }, b);
                    break;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                b.a(com.twitter.library.provider.be.a);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final int n, final String s, final long n2, final String s2, final boolean b, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final String s9) {
        this.a(false, n, s, n2, s2, b, s3, s4, s5, s6, s7, s8, s9);
    }
    
    public void a(final long n, final int n2, final int n3, final long n4) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            a(writableDatabase, n, n2, n3, n4);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long n, final int n2, final int n3, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues(2);
            contentValues.put("soc_fav_count", n2);
            contentValues.put("soc_rt_count", n3);
            final int update = writableDatabase.update("status_metadata", contentValues, "status_id=?", new String[] { String.valueOf(n) });
            contentValues.clear();
            contentValues.put("favorite_count", n2);
            contentValues.put("retweet_count", n3);
            final int update2 = writableDatabase.update("statuses", contentValues, "status_id=?", new String[] { String.valueOf(n) });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if ((update > 0 || update2 > 0) && b != null) {
                b.a(bg.d);
                b.a(bg.e);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long p0, final int p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/twitter/library/provider/bg.b:Z
        //     3: ifeq            53
        //     6: ldc             "DatabaseHelper"
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: ldc_w           "deleteOldStatuses: owner id: "
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: lload_1        
        //    22: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    25: ldc_w           ", type: "
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: iload_3        
        //    32: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    35: ldc_w           ", tag: "
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: lload           4
        //    43: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    46: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    49: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    52: pop            
        //    53: aload_0        
        //    54: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    57: astore          6
        //    59: aload           6
        //    61: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    64: iconst_3       
        //    65: anewarray       Ljava/lang/String;
        //    68: astore          8
        //    70: aload           8
        //    72: iconst_0       
        //    73: lload_1        
        //    74: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    77: aastore        
        //    78: aload           8
        //    80: iconst_1       
        //    81: iload_3        
        //    82: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    85: aastore        
        //    86: aload           8
        //    88: iconst_2       
        //    89: lload           4
        //    91: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    94: aastore        
        //    95: aload           6
        //    97: ldc_w           "status_groups"
        //   100: iconst_1       
        //   101: anewarray       Ljava/lang/String;
        //   104: dup            
        //   105: iconst_0       
        //   106: ldc_w           "COUNT(*)"
        //   109: aastore        
        //   110: ldc_w           "owner_id=? AND type=? AND tag=?"
        //   113: aload           8
        //   115: aconst_null    
        //   116: aconst_null    
        //   117: aconst_null    
        //   118: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   121: astore          9
        //   123: aload           9
        //   125: ifnull          362
        //   128: aload           9
        //   130: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   135: ifeq            373
        //   138: aload           9
        //   140: iconst_0       
        //   141: invokeinterface android/database/Cursor.getInt:(I)I
        //   146: istore          18
        //   148: iload           18
        //   150: istore          11
        //   152: aload           9
        //   154: invokeinterface android/database/Cursor.close:()V
        //   159: getstatic       com/twitter/library/provider/bg.b:Z
        //   162: ifeq            192
        //   165: ldc             "DatabaseHelper"
        //   167: new             Ljava/lang/StringBuilder;
        //   170: dup            
        //   171: invokespecial   java/lang/StringBuilder.<init>:()V
        //   174: ldc_w           "deleteOldStatuses: total count: "
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: iload           11
        //   182: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   185: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   188: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   191: pop            
        //   192: iload           11
        //   194: sipush          400
        //   197: if_icmple       362
        //   200: aload           6
        //   202: ldc_w           "status_groups LEFT JOIN statuses ON status_groups.g_status_id=statuses.status_id"
        //   205: getstatic       com/twitter/library/provider/cg.a:[Ljava/lang/String;
        //   208: ldc_w           "owner_id=? AND type=? AND tag=?"
        //   211: aload           8
        //   213: aconst_null    
        //   214: aconst_null    
        //   215: ldc_w           "updated_at ASC"
        //   218: iconst_1       
        //   219: iload           11
        //   221: bipush          100
        //   223: isub           
        //   224: iadd           
        //   225: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   228: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   231: astore          12
        //   233: aload           12
        //   235: ifnull          362
        //   238: aload           12
        //   240: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   245: ifeq            355
        //   248: iconst_0       
        //   249: istore          14
        //   251: iconst_1       
        //   252: anewarray       Ljava/lang/String;
        //   255: astore          15
        //   257: aload           15
        //   259: iconst_0       
        //   260: aload           12
        //   262: iconst_0       
        //   263: invokeinterface android/database/Cursor.getLong:(I)J
        //   268: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   271: aastore        
        //   272: iload           14
        //   274: aload           6
        //   276: ldc_w           "status_groups"
        //   279: ldc_w           "_id=?"
        //   282: aload           15
        //   284: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   287: iadd           
        //   288: istore          14
        //   290: aload           12
        //   292: invokeinterface android/database/Cursor.moveToNext:()Z
        //   297: ifne            257
        //   300: getstatic       com/twitter/library/provider/bg.b:Z
        //   303: ifeq            333
        //   306: ldc             "DatabaseHelper"
        //   308: new             Ljava/lang/StringBuilder;
        //   311: dup            
        //   312: invokespecial   java/lang/StringBuilder.<init>:()V
        //   315: ldc_w           "deleteOldStatuses: Deleted: "
        //   318: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   321: iload           14
        //   323: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   326: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   329: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   332: pop            
        //   333: iload           14
        //   335: ifle            355
        //   338: aload_0        
        //   339: iconst_3       
        //   340: iload_3        
        //   341: lload_1        
        //   342: lconst_0       
        //   343: aload_0        
        //   344: lload_1        
        //   345: iload_3        
        //   346: invokevirtual   com/twitter/library/provider/bg.d:(JI)J
        //   349: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   352: invokevirtual   com/twitter/library/provider/bg.a:(IIJJLjava/lang/String;)V
        //   355: aload           12
        //   357: invokeinterface android/database/Cursor.close:()V
        //   362: aload           6
        //   364: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   367: aload           6
        //   369: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   372: return         
        //   373: iconst_0       
        //   374: istore          11
        //   376: goto            152
        //   379: astore          10
        //   381: aload           9
        //   383: invokeinterface android/database/Cursor.close:()V
        //   388: aload           10
        //   390: athrow         
        //   391: astore          7
        //   393: aload           6
        //   395: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   398: aload           7
        //   400: athrow         
        //   401: astore          13
        //   403: aload           12
        //   405: invokeinterface android/database/Cursor.close:()V
        //   410: aload           13
        //   412: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  64     123    391    401    Any
        //  128    148    379    391    Any
        //  152    192    391    401    Any
        //  200    233    391    401    Any
        //  238    248    401    413    Any
        //  251    257    401    413    Any
        //  257    333    401    413    Any
        //  338    355    401    413    Any
        //  355    362    391    401    Any
        //  362    367    391    401    Any
        //  381    391    391    401    Any
        //  403    413    391    401    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0257:
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
    
    public void a(final long n, final int n2, final long n3, final long n4) {
        if (bg.b) {
            Log.d("DatabaseHelper", "deleteOldStatuses: owner id: " + n + ", type: " + n2 + ", statusId: " + n4);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("status_groups", "owner_id=? AND type=? AND tag=? AND g_status_id<?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3), String.valueOf(n4) });
            if (bg.b) {
                Log.d("DatabaseHelper", "deleteOldStatuses: Deleted: " + delete);
            }
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long n, final int n2, final long n3, final long[] array, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Marking statuses owned by: " + n + ", of type: " + n2 + ", tag: " + n3 + " as read.");
        }
        if (n2 != 0) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            Label_0485: {
                Label_0460: {
                    Label_0435: {
                        Label_0410: {
                            try {
                                final ContentValues contentValues = new ContentValues();
                                contentValues.put("is_read", 1);
                                int update;
                                if (array == null) {
                                    update = writableDatabase.update("status_groups", contentValues, "owner_id=? AND type=? AND tag=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3) });
                                }
                                else {
                                    final int length = array.length;
                                    update = 0;
                                    int n4;
                                    for (int i = 0; i < length; ++i, update = n4) {
                                        n4 = writableDatabase.update("status_groups", contentValues, "_id=?", new String[] { String.valueOf(array[i]) }) + update;
                                    }
                                }
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                if (update == 0 || b == null) {
                                    return;
                                }
                                switch (n2) {
                                    default: {
                                        return;
                                    }
                                    case 1: {
                                        b.a(ContentUris.withAppendedId(az.k, n), ContentUris.withAppendedId(ay.b, n));
                                        return;
                                    }
                                    case 2: {
                                        break;
                                    }
                                    case 3: {
                                        break Label_0410;
                                    }
                                    case 5:
                                    case 23:
                                    case 24:
                                    case 25: {
                                        break Label_0435;
                                    }
                                    case 9: {
                                        break Label_0460;
                                    }
                                    case 8: {
                                        break Label_0485;
                                    }
                                }
                            }
                            finally {
                                writableDatabase.endTransaction();
                            }
                            b.a(ContentUris.withAppendedId(az.j, n));
                            return;
                        }
                        b.a(ContentUris.withAppendedId(az.h, n));
                        return;
                    }
                    b.a(ContentUris.withAppendedId(az.g, n));
                    return;
                }
                b.a(ContentUris.withAppendedId(az.e, n));
                return;
            }
            b.a(ContentUris.withAppendedId(ah.b, n));
            return;
        }
        this.a(n, 0, array, b);
    }
    
    public void a(final long n, final int n2, final b b) {
        this.a(n, n2, b, false, -1L);
    }
    
    public void a(final long n, final int n2, final b b, final boolean b2, final long n3) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final Cursor query = writableDatabase.query("users", bs.a, "user_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
            Label_0076: {
                if (query == null) {
                    break Label_0076;
                }
                try {
                    this.a(query, n2, true, b, b2, n3);
                    query.close();
                    writableDatabase.setTransactionSuccessful();
                }
                finally {
                    query.close();
                }
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    void a(final long n, final int n2, final String s) {
        final long b = this.b(n, n2, s);
        if (b == 0L) {
            return;
        }
        this.c(n, n2, s);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("is_last", 1);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("timeline", contentValues, "_id=?", new String[] { String.valueOf(b) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long n, final long n2, final long n3, final int n4) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("type", n4);
            contentValues.put("event", 8);
            contentValues.put("created_at", n3);
            contentValues.put("hash", 0);
            contentValues.put("max_position", n);
            contentValues.put("min_position", n2);
            contentValues.put("source_type", 0);
            contentValues.put("target_type", 0);
            contentValues.put("target_object_type", 0);
            writableDatabase.insert("activities", (String)null, contentValues);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long n, final long n2, final b b) {
        final bp b2 = this.b(n2);
        if (b2 != null) {
            while (true) {
                final long userId = b2.y.userId;
                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                writableDatabase.beginTransaction();
                long long1 = -1L;
                while (true) {
                    Label_0212: {
                        try {
                            final Cursor query = writableDatabase.query("status_groups_retweets_view", new String[] { "rt_orig_ref_id" }, "rt_orig_status_id=?", new String[] { String.valueOf(n2) }, (String)null, (String)null, (String)null);
                            Label_0121: {
                                if (query == null) {
                                    break Label_0121;
                                }
                                try {
                                    if (query.moveToFirst()) {
                                        long1 = query.getLong(0);
                                    }
                                    query.close();
                                    if (long1 <= 0L) {
                                        break Label_0212;
                                    }
                                    final int n3 = 0 + (int)this.a(writableDatabase, n, n2, userId, long1).first;
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                    if (n3 > 0 && b != null) {
                                        b.a(bg.d);
                                        b.a(bg.e);
                                        return;
                                    }
                                    break;
                                }
                                finally {
                                    query.close();
                                }
                            }
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                    }
                    final int n3 = 0;
                    continue;
                }
            }
        }
    }
    
    public void a(final long n, final long n2, final List list, final Set set, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Delete tagged users: " + set + ", status: " + n);
        }
        final String[] array = { String.valueOf(n) };
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final Cursor query = writableDatabase.query("statuses", cd.a, "status_id=?", array, (String)null, (String)null, (String)null);
            Label_0371: {
                if (query == null) {
                    break Label_0371;
                }
                try {
                    if (query.moveToFirst()) {
                        final TweetEntities tweetEntities = (TweetEntities)com.twitter.util.f.a(query.getBlob(1));
                        if (tweetEntities != null && !tweetEntities.media.c()) {
                            final MediaEntityList a = com.twitter.library.media.util.ag.a(tweetEntities.media, list, set);
                            if (tweetEntities.media != a) {
                                final TweetEntities tweetEntities2 = (TweetEntities)new ax(tweetEntities).a(a).f();
                                final ContentValues contentValues = new ContentValues();
                                contentValues.put("entities", com.twitter.util.f.a(tweetEntities2));
                                final int n3 = 0 + writableDatabase.update("statuses", contentValues, "status_id=?", array);
                                final Iterator<Long> iterator = set.iterator();
                                int n4 = n3;
                                while (iterator.hasNext()) {
                                    n4 += writableDatabase.delete("user_groups", "owner_id=? AND type=? AND tag=? AND user_id=?", new String[] { String.valueOf(n2), String.valueOf(25), String.valueOf(n), String.valueOf(iterator.next()) });
                                }
                                if (n4 > 0 && b != null) {
                                    b.a(bg.d);
                                    b.a(bc.a, ao.a);
                                }
                            }
                        }
                    }
                    query.close();
                    writableDatabase.setTransactionSuccessful();
                }
                finally {
                    query.close();
                }
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long n, final ExtendedProfile extendedProfile) {
        if (bg.b) {
            Log.d("DatabaseHelper", "saveExtendedProfile: " + n + " extendedProfile: " + extendedProfile);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("extended_profile_fields", com.twitter.util.f.a(extendedProfile));
            writableDatabase.update("users", contentValues, "user_id=?", new String[] { String.valueOf(n) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser, final int n2, final be be, final b b) {
        while (true) {
            final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
            list.add(twitterUser);
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                Label_0110: {
                    try {
                        this.a(list, be.h.userId, n2, be.a(), null, null, true, b);
                        switch (n2) {
                            case 4: {
                                this.a(be);
                                break;
                            }
                            case 5: {
                                break Label_0110;
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        return;
                    }
                    finally {
                        writableDatabase.endTransaction();
                    }
                }
                final ArrayList<be> list2 = new ArrayList<be>();
                list2.add(be);
                this.a(list2, n, 2, null, false, b);
                this.a(be.a(), true);
                if (b != null) {
                    b.a(aq.a);
                    continue;
                }
                continue;
            }
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser, final b b) {
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>(1);
        list.add(twitterUser);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            this.a(list, n, 14, -1L, null, null, true, b);
            this.a((Collection)list, 4);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long n, final bp bp, final b b) {
        this.a(n, bp, false, b);
    }
    
    public void a(final long n, final bp bp, final boolean b, final b b2) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Removing status: " + bp.a + ", owned by: " + n);
        }
        SQLiteDatabase writableDatabase;
        String value;
        String[] array;
        bp l;
        int n2;
        TwitterUser y;
        long a;
        String[] array2;
        Pair a2;
        int n3;
        long longValue = 0L;
        String value2;
        int n4;
        ContentValues contentValues;
        int m;
        int n5;
        int n6;
        TwitterUser y2;
        boolean b3 = false;
        boolean b4 = false;
        int n7;
        Label_0465_Outer:Label_0490_Outer:
        while (true) {
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
            Label_0490:
                while (true) {
                Label_0629:
                    while (true) {
                        Label_0623: {
                            try {
                                value = String.valueOf(n);
                                array = new String[] { value, value, String.valueOf(bp.a) };
                                l = bp.l;
                                while (true) {
                                    if (l == null) {
                                        n2 = 0 + this.a("owner_id=? AND sender_id=? AND ref_id=?", "owner_id=? AND sender_id=? AND ref_id=?", array, false);
                                        y = bp.y;
                                        if (y != null && y.a() == n) {
                                            a = bp.a;
                                            array2 = new String[] { String.valueOf(a) };
                                            n2 = n2 + this.c(writableDatabase, a) + writableDatabase.delete("discover", "identifier=?", array2) + writableDatabase.delete("search_results", "data_type=1 AND data_id=?", array2);
                                        }
                                        writableDatabase.setTransactionSuccessful();
                                        writableDatabase.endTransaction();
                                        if (n2 > 0 && b2 != null) {
                                            b2.a(bg.d);
                                            b2.a(bg.e);
                                        }
                                        return;
                                    }
                                    a2 = this.a(writableDatabase, n, l.a, l.y.userId, bp.a);
                                    n3 = 0 + (int)a2.first;
                                    longValue = (long)a2.second;
                                    value2 = String.valueOf(l.a);
                                    n4 = n3 + writableDatabase.delete("timeline", "owner_id=? AND type=? AND data_type=1 AND data_id=?", new String[] { value, String.valueOf(1), value2 });
                                    contentValues = new ContentValues(2);
                                    m = l.m;
                                    if (bp.z) {
                                        n5 = 1;
                                    }
                                    else {
                                        n5 = 0;
                                    }
                                    contentValues.put("retweet_count", Math.max(0, m - n5));
                                    contentValues.put("favorite_count", l.B);
                                    n6 = n4 + writableDatabase.update("statuses", contentValues, "status_id=?", new String[] { value2 });
                                    y2 = l.y;
                                    if (y2 == null) {
                                        break Label_0623;
                                    }
                                    if (z.b(this.e(y2.a()))) {
                                        break Label_0623;
                                    }
                                    b3 = false;
                                    b4 = (longValue > 0L && z.b(this.e(longValue)));
                                    break Label_0629;
                                    Block_17: {
                                        break Block_17;
                                        n7 = 0;
                                        continue Label_0490;
                                    }
                                    n6 += writableDatabase.delete("timeline", "owner_id=? AND type=? AND data_type=1 AND data_id=?", new String[] { value, String.valueOf(0), value2 });
                                    Label_0538: {
                                        n2 = n6 + writableDatabase.delete("status_groups", "owner_id=? AND type=? AND g_status_id=?", new String[] { value, String.valueOf(1), value2 });
                                    }
                                    continue Label_0465_Outer;
                                }
                            }
                            // iftrue(Label_0538:, n7 != 0)
                            finally {
                                writableDatabase.endTransaction();
                            }
                        }
                        b3 = true;
                        continue Label_0490_Outer;
                    }
                    if (b || b3 || (longValue > 0L && b4)) {
                        n7 = 1;
                        continue Label_0490;
                    }
                    break;
                }
                continue;
            }
        }
    }
    
    public void a(final long n, final String s, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Update status language: " + s + ", id: " + n);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String[] array = { String.valueOf(n) };
            final ContentValues contentValues = new ContentValues();
            contentValues.put("lang", s);
            writableDatabase.update("statuses", contentValues, "status_id=?", array);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                b.a(bg.d);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final long n, final List list, final String s, final String s2, final boolean b, final b b2) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Updating news table: " + list.size());
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        while (true) {
            if (b) {
                try {
                    writableDatabase.delete("news", (String)null, (String[])null);
                    final ContentValues contentValues = new ContentValues();
                    for (final wk wk : list) {
                        contentValues.clear();
                        a(wk, contentValues, s, s2);
                        final long insert = writableDatabase.insert("news", (String)null, contentValues);
                        if (wk.h != null) {
                            final ArrayList<TwitterUser> list2 = new ArrayList<TwitterUser>(1);
                            list2.add(wk.h);
                            this.a(list2, n, 35, insert, null, b2);
                        }
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (b2 != null) {
                    b2.a(ar.a);
                }
                return;
            }
            continue;
        }
    }
    
    public void a(final long n, final boolean b) {
        int followStatus = 1;
        if (bg.b) {
            Log.d("DatabaseHelper", "updateFollowList: " + n + " follow: " + b);
        }
        final ContentValues contentValues = new ContentValues();
        final TwitterTopic$TwitterList k = this.k(n);
        Label_0137: {
            if (!b) {
                break Label_0137;
            }
            while (true) {
                k.followStatus = followStatus;
                contentValues.put("ev_content", com.twitter.util.f.a(k));
                final SQLiteDatabase writableDatabase = this.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.update("topics", contentValues, "ev_type=5 AND ev_id=?", new String[] { String.valueOf(n) });
                    writableDatabase.setTransactionSuccessful();
                    return;
                    followStatus = 2;
                }
                finally {
                    writableDatabase.endTransaction();
                }
            }
        }
    }
    
    public void a(final long n, final boolean isSpam, final b b) {
    Label_0074_Outer:
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                Label_0196: {
                    while (true) {
                        try {
                            final Cursor g = this.g(n);
                            if (g == null) {
                                break Label_0196;
                            }
                            try {
                                if (g.moveToFirst()) {
                                    final DMMessageEntry dmMessageEntry = (DMMessageEntry)com.twitter.util.f.a(g.getBlob(5));
                                    final String string = g.getString(1);
                                    g.close();
                                    final String s = string;
                                    if (dmMessageEntry != null) {
                                        dmMessageEntry.isSpam = isSpam;
                                        final ContentValues contentValues = new ContentValues();
                                        contentValues.put("data", com.twitter.util.f.a(dmMessageEntry));
                                        writableDatabase.updateWithOnConflict("conversation_entries", contentValues, "entry_id=?", new String[] { String.valueOf(n) }, 5);
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                    writableDatabase.endTransaction();
                                    if (s != null) {
                                        this.a(Collections.singleton(s), b);
                                    }
                                    return;
                                }
                            }
                            finally {
                                g.close();
                            }
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                        final DMMessageEntry dmMessageEntry = null;
                        final String string = null;
                        continue Label_0074_Outer;
                    }
                }
                final DMMessageEntry dmMessageEntry = null;
                final String s = null;
                continue;
            }
        }
    }
    
    public void a(final long n, final long[] array, final b b) {
        final HashSet<TwitterUser> set = new HashSet<TwitterUser>();
        for (int length = array.length, i = 0; i < length; ++i) {
            final TwitterUser a = this.a(array[i]);
            if (a != null) {
                set.add(a);
            }
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            this.a(set, n, 14, -1L, null, b);
            this.a(set, 4);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    void a(final SQLiteDatabase sqLiteDatabase, final long n, final int n2, final int n3, final int n4) {
        if (n3 > n4) {
            throw new IllegalArgumentException("minCountToMaintain cannot be greater than limit");
        }
    Label_0182_Outer:
        while (true) {
            sqLiteDatabase.beginTransaction();
            while (true) {
                Label_0421: {
                    while (true) {
                        int n6 = 0;
                    Label_0414:
                        while (true) {
                            Pair pair = null;
                            Label_0394: {
                                try {
                                    final Cursor query = sqLiteDatabase.query("timeline", new String[] { "timeline_group_id", "COUNT(*)" }, "owner_id=? AND type=?", new String[] { String.valueOf(n), String.valueOf(n2) }, "timeline_group_id", (String)null, "timeline_group_id");
                                    try {
                                        final ArrayList list = new ArrayList<Object>(query.getCount());
                                        final boolean moveToFirst = query.moveToFirst();
                                        final int n5 = 0;
                                        if (!moveToFirst) {
                                            break Label_0421;
                                        }
                                        final Pair create = Pair.create((Object)query.getLong(0), (Object)query.getInt(1));
                                        list.add(create);
                                        n6 = n5 + (int)create.second;
                                        if (!query.moveToNext()) {
                                            query.close();
                                            if (n6 > n4) {
                                                final Iterator<Pair> iterator = (Iterator<Pair>)list.iterator();
                                                int n7 = n6;
                                                final long longValue = -1L;
                                                if (iterator.hasNext()) {
                                                    pair = iterator.next();
                                                    n7 -= (int)pair.second;
                                                    if (n7 >= n3) {
                                                        break Label_0394;
                                                    }
                                                }
                                                if (longValue != -1L) {
                                                    sqLiteDatabase.delete("timeline", "owner_id=? AND type=? AND timeline_group_id<?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(1L + longValue) });
                                                    sqLiteDatabase.delete("cursors", "owner_id=? AND kind=? AND CAST(ref_id AS INT)<?", new String[] { String.valueOf(n), String.valueOf(ae.c(n2)), String.valueOf(longValue + 1L) });
                                                }
                                            }
                                            sqLiteDatabase.setTransactionSuccessful();
                                            return;
                                        }
                                        break Label_0414;
                                    }
                                    finally {
                                        query.close();
                                    }
                                }
                                finally {
                                    sqLiteDatabase.endTransaction();
                                }
                            }
                            final long longValue = (long)pair.first;
                            continue;
                        }
                        final int n5 = n6;
                        continue Label_0182_Outer;
                    }
                }
                int n6 = 0;
                continue;
            }
        }
    }
    
    public void a(final SQLiteDatabase sqLiteDatabase, final String s, final String s2, final String[] array, final long n, final int n2, final String s3, final String[] array2, final b b) {
    Label_0245_Outer:
        while (true) {
            Label_0024: {
                while (true) {
                    Label_0012: {
                        if (TextUtils.isEmpty((CharSequence)s)) {
                            final String string = "t_data_type=1 AND t_data_id=?";
                            break Label_0012;
                        }
                        Label_0220: {
                            break Label_0220;
                            String string;
                            final Cursor query;
                            String[] array3;
                            int n3 = 0;
                            String string2;
                            Block_8_Outer:Block_12_Outer:
                            while (true) {
                                sqLiteDatabase.beginTransaction();
                                while (true) {
                                    Label_0311: {
                                        try {
                                            if (query.moveToFirst()) {
                                                if (array == null) {
                                                    array3 = new String[] { null };
                                                    break Label_0311;
                                                }
                                                array3 = new String[1 + array.length];
                                                System.arraycopy(array, 0, array3, 1, array.length);
                                                break Label_0311;
                                            }
                                            // iftrue(Label_0204:, n3 <= 0)
                                            // iftrue(Label_0155:, !bg.b)
                                            // iftrue(Label_0171:, n2 == -1)
                                            // iftrue(Label_0076:, query.moveToNext())
                                            while (true) {
                                            Label_0171:
                                                while (true) {
                                                    Block_10: {
                                                        while (true) {
                                                            sqLiteDatabase.setTransactionSuccessful();
                                                            return;
                                                            break Block_10;
                                                            b.a(bg.d);
                                                            b.a(bc.a);
                                                            continue Block_8_Outer;
                                                        }
                                                        string2 = "g_status_id=? AND " + s2;
                                                        break Label_0024;
                                                        string = "t_data_type=1 AND t_data_id=? AND " + s;
                                                        break;
                                                    }
                                                    Log.d("DatabaseHelper", "Deleted old friend statuses: " + n3);
                                                    Label_0155: {
                                                        a(sqLiteDatabase, n, n2, 3, 0L);
                                                    }
                                                    break Label_0171;
                                                    array3[0] = String.valueOf(query.getLong(0));
                                                    n3 += this.a(string, string2, array3, true);
                                                    continue Block_12_Outer;
                                                }
                                                continue Label_0245_Outer;
                                            }
                                        }
                                        // iftrue(Label_0204:, b == null)
                                        finally {
                                            query.close();
                                            sqLiteDatabase.endTransaction();
                                        }
                                    }
                                    n3 = 0;
                                    continue;
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty((CharSequence)s2)) {
                        continue;
                    }
                    break;
                }
                String string2 = "g_status_id=?";
            }
            final Cursor query = sqLiteDatabase.query("status_groups LEFT JOIN statuses ON status_groups.g_status_id=statuses.status_id", cf.a, s3, array2, (String)null, (String)null, (String)null);
            if (query != null) {
                continue Label_0245_Outer;
            }
            break;
        }
    }
    
    public void a(final be be) {
        if (bg.b) {
            Log.d("DatabaseHelper", "updateList: " + be.a() + " follow: " + be.i);
        }
        final TwitterTopic$TwitterList b = this.b(be);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("ev_content", com.twitter.util.f.a(b));
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.update("topics", contentValues, "ev_type=5 AND ev_id=?", new String[] { String.valueOf(be.a()) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final bp p0, final long p1, final b p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        com/twitter/library/api/bp.l:Lcom/twitter/library/api/bp;
        //     4: astore          5
        //     6: aload_1        
        //     7: invokevirtual   com/twitter/library/api/bp.c:()Lcom/twitter/library/api/bp;
        //    10: astore          6
        //    12: aload           6
        //    14: getfield        com/twitter/library/api/bp.a:J
        //    17: lstore          7
        //    19: getstatic       com/twitter/library/provider/bg.b:Z
        //    22: ifeq            52
        //    25: ldc             "DatabaseHelper"
        //    27: new             Ljava/lang/StringBuilder;
        //    30: dup            
        //    31: invokespecial   java/lang/StringBuilder.<init>:()V
        //    34: ldc_w           "insertStatus: "
        //    37: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    40: lload           7
        //    42: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //    45: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    48: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    51: pop            
        //    52: aload_0        
        //    53: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    56: astore          9
        //    58: aload           9
        //    60: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    63: iconst_1       
        //    64: anewarray       Ljava/lang/String;
        //    67: dup            
        //    68: iconst_0       
        //    69: ldc_w           "_id"
        //    72: aastore        
        //    73: astore          10
        //    75: iconst_1       
        //    76: anewarray       Ljava/lang/String;
        //    79: astore          12
        //    81: aload           12
        //    83: iconst_0       
        //    84: lload           7
        //    86: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    89: aastore        
        //    90: aload           9
        //    92: ldc_w           "statuses"
        //    95: aload           10
        //    97: ldc_w           "status_id=?"
        //   100: aload           12
        //   102: aconst_null    
        //   103: aconst_null    
        //   104: aconst_null    
        //   105: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   108: astore          13
        //   110: aload           13
        //   112: ifnull          826
        //   115: aload           13
        //   117: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   122: istore          18
        //   124: iconst_0       
        //   125: istore          19
        //   127: iload           18
        //   129: ifne            252
        //   132: new             Ljava/util/ArrayList;
        //   135: dup            
        //   136: iconst_1       
        //   137: invokespecial   java/util/ArrayList.<init>:(I)V
        //   140: astore          20
        //   142: aload           20
        //   144: aload           6
        //   146: getfield        com/twitter/library/api/bp.y:Lcom/twitter/library/api/TwitterUser;
        //   149: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   154: pop            
        //   155: aload           5
        //   157: ifnull          172
        //   160: aload           20
        //   162: aload_1        
        //   163: getfield        com/twitter/library/api/bp.y:Lcom/twitter/library/api/TwitterUser;
        //   166: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   171: pop            
        //   172: aload_0        
        //   173: aload           20
        //   175: ldc2_w          -1
        //   178: iconst_m1      
        //   179: ldc2_w          -1
        //   182: aconst_null    
        //   183: aconst_null    
        //   184: iconst_1       
        //   185: aload           4
        //   187: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJLjava/lang/String;Ljava/lang/String;ZLcom/twitter/library/provider/b;)I
        //   190: pop            
        //   191: new             Landroid/content/ContentValues;
        //   194: dup            
        //   195: invokespecial   android/content/ContentValues.<init>:()V
        //   198: astore          24
        //   200: aload           6
        //   202: aload           24
        //   204: aload_0        
        //   205: getfield        com/twitter/library/provider/bg.h:J
        //   208: invokestatic    com/twitter/library/provider/bg.a:(Lcom/twitter/library/api/bp;Landroid/content/ContentValues;J)Z
        //   211: istore          25
        //   213: iconst_0       
        //   214: istore          19
        //   216: iload           25
        //   218: ifeq            252
        //   221: aload           9
        //   223: ldc_w           "statuses"
        //   226: ldc_w           "status_id"
        //   229: aload           24
        //   231: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   234: lstore          26
        //   236: lload           26
        //   238: lconst_0       
        //   239: lcmp           
        //   240: ifle            747
        //   243: iconst_1       
        //   244: istore          28
        //   246: iconst_0       
        //   247: iload           28
        //   249: iadd           
        //   250: istore          19
        //   252: aload           13
        //   254: invokeinterface android/database/Cursor.close:()V
        //   259: aload           5
        //   261: ifnull          278
        //   264: aload_1        
        //   265: getfield        com/twitter/library/api/bp.s:Lcom/twitter/library/api/PromotedContent;
        //   268: ifnull          278
        //   271: aload_1        
        //   272: getfield        com/twitter/library/api/bp.s:Lcom/twitter/library/api/PromotedContent;
        //   275: invokevirtual   com/twitter/library/api/PromotedContent.c:()V
        //   278: new             Ljava/util/ArrayList;
        //   281: dup            
        //   282: invokespecial   java/util/ArrayList.<init>:()V
        //   285: astore          29
        //   287: aload           29
        //   289: aload_1        
        //   290: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   293: pop            
        //   294: new             Ljava/util/ArrayList;
        //   297: dup            
        //   298: iconst_1       
        //   299: invokespecial   java/util/ArrayList.<init>:(I)V
        //   302: astore          31
        //   304: aload           31
        //   306: aload_1        
        //   307: invokestatic    com/twitter/library/api/at.a:(Lcom/twitter/library/api/bp;)Lcom/twitter/library/api/at;
        //   310: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   313: pop            
        //   314: iload           19
        //   316: aload_0        
        //   317: aload           31
        //   319: lload_2        
        //   320: iconst_1       
        //   321: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/ArrayList;JI)I
        //   324: iadd           
        //   325: aload_0        
        //   326: aload           29
        //   328: lload_2        
        //   329: iconst_1       
        //   330: ldc2_w          -1
        //   333: iconst_1       
        //   334: iconst_0       
        //   335: iconst_1       
        //   336: aconst_null    
        //   337: iconst_0       
        //   338: invokespecial   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJZZZLjava/lang/String;Z)Ljava/util/Collection;
        //   341: invokeinterface java/util/Collection.size:()I
        //   346: iadd           
        //   347: istore          33
        //   349: aload           5
        //   351: ifnull          816
        //   354: new             Landroid/content/ContentValues;
        //   357: dup            
        //   358: iconst_3       
        //   359: invokespecial   android/content/ContentValues.<init>:(I)V
        //   362: astore          34
        //   364: aload           34
        //   366: ldc_w           "tweet_type"
        //   369: iconst_1       
        //   370: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   373: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   376: aload           34
        //   378: ldc_w           "ref_id"
        //   381: aload_1        
        //   382: getfield        com/twitter/library/api/bp.a:J
        //   385: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   388: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   391: aload           34
        //   393: ldc_w           "sender_id"
        //   396: aload_1        
        //   397: getfield        com/twitter/library/api/bp.y:Lcom/twitter/library/api/TwitterUser;
        //   400: getfield        com/twitter/library/api/TwitterUser.userId:J
        //   403: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   406: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        //   409: iconst_2       
        //   410: anewarray       Ljava/lang/String;
        //   413: astore          35
        //   415: aload           35
        //   417: iconst_0       
        //   418: lload_2        
        //   419: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   422: aastore        
        //   423: aload           35
        //   425: iconst_1       
        //   426: aload           5
        //   428: getfield        com/twitter/library/api/bp.a:J
        //   431: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   434: aastore        
        //   435: iload           33
        //   437: aload           9
        //   439: ldc_w           "status_groups"
        //   442: aload           34
        //   444: ldc_w           "owner_id=? AND g_status_id=? AND type NOT IN (7,0,1,17,18)"
        //   447: aload           35
        //   449: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   452: iadd           
        //   453: istore          36
        //   455: aload           34
        //   457: invokevirtual   android/content/ContentValues.clear:()V
        //   460: aload           34
        //   462: ldc             "type"
        //   464: bipush          7
        //   466: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   469: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   472: iconst_3       
        //   473: anewarray       Ljava/lang/String;
        //   476: astore          37
        //   478: aload           37
        //   480: iconst_0       
        //   481: lload_2        
        //   482: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   485: aastore        
        //   486: aload           37
        //   488: iconst_1       
        //   489: iconst_0       
        //   490: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   493: aastore        
        //   494: aload           37
        //   496: iconst_2       
        //   497: aload           5
        //   499: getfield        com/twitter/library/api/bp.a:J
        //   502: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   505: aastore        
        //   506: aload           9
        //   508: ldc_w           "status_groups"
        //   511: iconst_1       
        //   512: anewarray       Ljava/lang/String;
        //   515: dup            
        //   516: iconst_0       
        //   517: ldc_w           "updated_at"
        //   520: aastore        
        //   521: ldc_w           "owner_id=? AND type=? AND g_status_id=? AND tweet_type=1"
        //   524: aload           37
        //   526: aconst_null    
        //   527: aconst_null    
        //   528: aconst_null    
        //   529: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   532: astore          38
        //   534: aload           38
        //   536: ifnull          606
        //   539: lconst_0       
        //   540: lstore          44
        //   542: aload           38
        //   544: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   549: ifeq            566
        //   552: aload           38
        //   554: iconst_0       
        //   555: invokeinterface android/database/Cursor.getLong:(I)J
        //   560: lstore          47
        //   562: lload           47
        //   564: lstore          44
        //   566: aload           38
        //   568: invokeinterface android/database/Cursor.close:()V
        //   573: lload           44
        //   575: lconst_0       
        //   576: lcmp           
        //   577: ifle            606
        //   580: iload           36
        //   582: aload           9
        //   584: ldc_w           "status_groups"
        //   587: aload           34
        //   589: ldc_w           "owner_id=? AND type=? AND g_status_id=? AND tweet_type=1"
        //   592: aload           37
        //   594: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   597: iadd           
        //   598: istore          36
        //   600: aload_1        
        //   601: lload           44
        //   603: putfield        com/twitter/library/api/bp.G:J
        //   606: iconst_3       
        //   607: anewarray       Ljava/lang/String;
        //   610: astore          39
        //   612: aload           39
        //   614: iconst_0       
        //   615: lload_2        
        //   616: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   619: aastore        
        //   620: aload           39
        //   622: iconst_1       
        //   623: iconst_0       
        //   624: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   627: aastore        
        //   628: aload           39
        //   630: iconst_2       
        //   631: aload           5
        //   633: getfield        com/twitter/library/api/bp.a:J
        //   636: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   639: aastore        
        //   640: aload_0        
        //   641: aload           39
        //   643: invokespecial   com/twitter/library/provider/bg.b:([Ljava/lang/String;)I
        //   646: ifle            847
        //   649: iconst_1       
        //   650: istore          40
        //   652: goto            832
        //   655: iload           42
        //   657: ifne            787
        //   660: iload           14
        //   662: aload_0        
        //   663: aload           31
        //   665: lload_2        
        //   666: iconst_0       
        //   667: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/util/ArrayList;JI)I
        //   670: iadd           
        //   671: istore          14
        //   673: aload           9
        //   675: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   678: aload           9
        //   680: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   683: aload           4
        //   685: ifnull          746
        //   688: iload           14
        //   690: ifle            746
        //   693: aload           4
        //   695: getstatic       com/twitter/library/provider/bg.d:[Landroid/net/Uri;
        //   698: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   701: iconst_1       
        //   702: anewarray       Landroid/net/Uri;
        //   705: astore          15
        //   707: aload           15
        //   709: iconst_0       
        //   710: getstatic       com/twitter/library/provider/bc.a:Landroid/net/Uri;
        //   713: aastore        
        //   714: aload           4
        //   716: aload           15
        //   718: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   721: aload           5
        //   723: ifnull          746
        //   726: iconst_1       
        //   727: anewarray       Landroid/net/Uri;
        //   730: astore          16
        //   732: aload           16
        //   734: iconst_0       
        //   735: getstatic       com/twitter/library/provider/ao.a:Landroid/net/Uri;
        //   738: aastore        
        //   739: aload           4
        //   741: aload           16
        //   743: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   746: return         
        //   747: iconst_0       
        //   748: istore          28
        //   750: goto            246
        //   753: astore          17
        //   755: aload           13
        //   757: invokeinterface android/database/Cursor.close:()V
        //   762: aload           17
        //   764: athrow         
        //   765: astore          11
        //   767: aload           9
        //   769: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   772: aload           11
        //   774: athrow         
        //   775: astore          46
        //   777: aload           38
        //   779: invokeinterface android/database/Cursor.close:()V
        //   784: aload           46
        //   786: athrow         
        //   787: aload           5
        //   789: ifnull          673
        //   792: aload_0        
        //   793: aload           29
        //   795: lload_2        
        //   796: iconst_0       
        //   797: ldc2_w          -1
        //   800: iconst_0       
        //   801: invokespecial   com/twitter/library/provider/bg.a:(Ljava/util/Collection;JIJZ)I
        //   804: istore          43
        //   806: iload           14
        //   808: iload           43
        //   810: iadd           
        //   811: istore          14
        //   813: goto            673
        //   816: iload           33
        //   818: istore          14
        //   820: iconst_0       
        //   821: istore          42
        //   823: goto            655
        //   826: iconst_0       
        //   827: istore          14
        //   829: goto            673
        //   832: iload           40
        //   834: istore          41
        //   836: iload           36
        //   838: istore          14
        //   840: iload           41
        //   842: istore          42
        //   844: goto            655
        //   847: iconst_0       
        //   848: istore          40
        //   850: goto            832
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  63     110    765    775    Any
        //  115    124    753    765    Any
        //  132    155    753    765    Any
        //  160    172    753    765    Any
        //  172    213    753    765    Any
        //  221    236    753    765    Any
        //  252    259    765    775    Any
        //  264    278    765    775    Any
        //  278    349    765    775    Any
        //  354    534    765    775    Any
        //  542    562    775    787    Any
        //  566    573    765    775    Any
        //  580    606    765    775    Any
        //  606    649    765    775    Any
        //  660    673    765    775    Any
        //  673    678    765    775    Any
        //  755    765    765    775    Any
        //  777    787    765    775    Any
        //  792    806    765    775    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0566:
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
    
    public void a(final BaseConversationEntry baseConversationEntry, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            baseConversationEntry.a(writableDatabase, this.h, true, b);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            this.a(Collections.singleton(baseConversationEntry.conversationId), b2);
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final DMLocalMessageEntry dmLocalMessageEntry, final int status, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            dmLocalMessageEntry.status = status;
            final ContentValues contentValues = new ContentValues();
            contentValues.put("data", com.twitter.util.f.a(dmLocalMessageEntry));
            final int updateWithOnConflict = writableDatabase.updateWithOnConflict("conversation_entries", contentValues, "entry_id=?", new String[] { dmLocalMessageEntry.b() }, 5);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (updateWithOnConflict > 0) {
                this.a(Collections.singleton(dmLocalMessageEntry.conversationId), b);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final DMLocalMessageEntry dmLocalMessageEntry, final DMMessageEntry dmMessageEntry, final y y, final b b) {
        while (true) {
            int n = 1;
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                try {
                    writableDatabase.delete("conversation_entries", "request_id=? AND entry_type=1", new String[] { dmLocalMessageEntry.requestId });
                    if (dmMessageEntry != null && !dmMessageEntry.conversationId.equals(dmLocalMessageEntry.conversationId)) {
                        writableDatabase.delete("conversations", "conversation_id=?", new String[] { dmLocalMessageEntry.conversationId });
                        writableDatabase.delete("conversation_participants", "conversation_id=?", new String[] { dmLocalMessageEntry.conversationId });
                        this.a(writableDatabase, y, true, b);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        if (dmMessageEntry != null && n == 0) {
                            this.a(Collections.singleton(dmMessageEntry.conversationId), b);
                        }
                        return;
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                n = 0;
                continue;
            }
        }
    }
    
    public void a(final q q) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            this.a(writableDatabase, q);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final q q, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            this.a(writableDatabase, q);
            this.a(writableDatabase, q, false, b);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final s s, final boolean b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            s.a(writableDatabase, b);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final y y, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            this.a(writableDatabase, y, b, b2);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final TwitterSearchQuery twitterSearchQuery, final long n) {
        if (bg.b) {
            Log.d("DatabaseHelper", "updateSearchQuery: " + twitterSearchQuery.a + ", rowId: " + n);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            if (twitterSearchQuery.b != null && twitterSearchQuery.a != null) {
                contentValues.put("query", twitterSearchQuery.b);
                contentValues.put("name", twitterSearchQuery.a);
                contentValues.put("time", System.currentTimeMillis());
                contentValues.put("latitude", twitterSearchQuery.c);
                contentValues.put("longitude", twitterSearchQuery.d);
                contentValues.put("radius", twitterSearchQuery.e);
                contentValues.put("location", twitterSearchQuery.f);
                writableDatabase.update("search_queries", contentValues, "_id=?", new String[] { String.valueOf(n) });
            }
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final String s, final long n, final int followStatus, final b b) {
        while (true) {
            final String[] array = { s };
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                try {
                    final Cursor query = writableDatabase.query("topics", new String[] { "ev_content" }, "ev_id=?", array, (String)null, (String)null, (String)null);
                    byte[] a = null;
                    Label_0115: {
                        if (query == null) {
                            break Label_0115;
                        }
                        try {
                            final boolean moveToFirst = query.moveToFirst();
                            a = null;
                            if (moveToFirst) {
                                final TwitterTopic$TwitterList list = (TwitterTopic$TwitterList)com.twitter.util.f.a(query.getBlob(0));
                                list.followStatus = followStatus;
                                a = com.twitter.util.f.a(list);
                            }
                            query.close();
                            final ContentValues contentValues = new ContentValues();
                            contentValues.put("ev_content", a);
                            writableDatabase.update("topics", contentValues, "ev_id=?", array);
                            if (followStatus == 1) {
                                this.a(writableDatabase, s, n, 2);
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                if (b != null) {
                                    b.a(aq.a);
                                }
                                return;
                            }
                        }
                        finally {
                            query.close();
                        }
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                this.b(writableDatabase, s, n, 2);
                continue;
            }
        }
    }
    
    public void a(final String s, final long n, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            com.twitter.library.api.conversations.at.a(writableDatabase, s, n);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                b.a(com.twitter.library.provider.al.a);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final String s, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues(1);
            contentValues.put("is_muted", b);
            writableDatabase.update("conversations", contentValues, "conversation_id=?", new String[] { s });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b2 != null) {
                b2.a(com.twitter.library.provider.al.a);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final String s, final long[] array, final b b) {
        final ArrayList<String> list = new ArrayList<String>(array.length);
        final Iterator<TwitterUser> iterator = this.a(array).iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().name);
        }
        if (list.isEmpty()) {
            return;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            this.a(new ParticipantsNotAddedEntry(1L + this.a((String)null, false), s, System.currentTimeMillis(), list, false), true, b);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final Collection collection) {
        synchronized (this) {
            this.i.addAll(collection);
        }
    }
    
    public void a(final Collection collection, final int n) {
        final HashMap<Long, TwitterUser> hashMap = new HashMap<Long, TwitterUser>();
        for (final TwitterUser twitterUser : collection) {
            hashMap.put(twitterUser.userId, twitterUser);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        Label_0157: {
            Cursor query;
            try {
                query = writableDatabase.query("tokens", new String[] { "ref_id" }, "ref_id NOT NULL AND ref_id>0", (String[])null, (String)null, (String)null, (String)null);
                if (query == null) {
                    break Label_0157;
                }
                try {
                    while (query.moveToNext()) {
                        hashMap.remove(query.getLong(0));
                    }
                }
                finally {
                    query.close();
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
            query.close();
        }
        if (hashMap.isEmpty()) {
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return;
        }
        final ContentValues contentValues = new ContentValues();
        for (final TwitterUser twitterUser2 : hashMap.values()) {
            final HashSet<Object> set = new HashSet<Object>();
            set.add('@' + twitterUser2.username);
            set.add(twitterUser2.username);
            Collections.addAll(set, twitterUser2.name.split(" "));
            contentValues.put("type", n);
            contentValues.put("ref_id", twitterUser2.userId);
            final Iterator<String> iterator3 = set.iterator();
            while (iterator3.hasNext()) {
                contentValues.put("text", (String)iterator3.next());
                writableDatabase.insert("tokens", (String)null, contentValues);
            }
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }
    
    public void a(final Collection collection, final int n, final b b) {
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        final ArrayList<Cursor> list = new ArrayList<Cursor>();
        final Iterator<Long> iterator = collection.iterator();
        final int n2 = collection.size() / 10;
        if (n2 > 0) {
            final String[] a = a(10, (String[])null);
            for (int i = 0; i < n2; ++i) {
                for (int j = 0; j < 10; ++j) {
                    a[j] = iterator.next().toString();
                }
                final Cursor query = readableDatabase.query("users", bs.a, "user_id IN (?,?,?,?,?,?,?,?,?,?)", a, (String)null, (String)null, (String)null);
                if (query != null) {
                    list.add(query);
                }
            }
        }
        final String[] array = { null };
        while (iterator.hasNext()) {
            array[0] = iterator.next().toString();
            final Cursor query2 = readableDatabase.query("users", bs.a, "user_id=?", array, (String)null, (String)null, (String)null);
            if (query2 != null) {
                list.add(query2);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        final MergeCursor mergeCursor = new MergeCursor((Cursor[])list.toArray(new Cursor[list.size()]));
        try {
            this.a((Cursor)mergeCursor, n, true, b);
        }
        finally {
            mergeCursor.close();
        }
    }
    
    public void a(final Collection collection, final long n, final int n2, final int n3, final long n4, final String s, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "mergeRankedUserGroups: " + collection.size() + ", owned by: " + n + ", of type: " + n2 + ", of rank: " + n3 + ", next: " + s);
        }
        if (collection == null || n2 == -1 || n < 0L) {
            return;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        LinkedHashMap<Object, TwitterUser> linkedHashMap = null;
        Label_0124: {
            if (s == null) {
                break Label_0124;
            }
            try {
                this.a(1, n2, n, 0L, s);
                if (collection.isEmpty()) {
                    if ("0".equals(s)) {
                        this.c(n, n2, b);
                    }
                    writableDatabase.setTransactionSuccessful();
                    return;
                }
                linkedHashMap = (LinkedHashMap<Object, TwitterUser>)new LinkedHashMap<Long, TwitterUser>();
                for (final TwitterUser twitterUser : collection) {
                    linkedHashMap.put(twitterUser.userId, twitterUser);
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
        final Cursor query = writableDatabase.query("user_groups", cs.a, "owner_id=? AND type=? AND tag=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n4) }, (String)null, (String)null, (String)null);
        if (query == null) {
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return;
        }
        try {
            while (query.moveToNext()) {
                linkedHashMap.remove(query.getLong(0));
            }
        }
        finally {
            query.close();
        }
        query.close();
        if (bg.b) {
            Log.d("DatabaseHelper", "Inserting new user groups: " + linkedHashMap.size());
        }
        final int size = linkedHashMap.size();
        if (size > 0) {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("owner_id", n);
            contentValues.put("type", n2);
            contentValues.put("tag", n4);
            contentValues.put("rank", n3);
            final ContentValues contentValues2 = new ContentValues();
            contentValues2.put("owner_id", n);
            contentValues2.put("user_group_type", n2);
            contentValues2.put("user_group_tag", n4);
            final Iterator<TwitterUser> iterator2 = linkedHashMap.values().iterator();
            int n5 = 0;
            while (iterator2.hasNext()) {
                final TwitterUser twitterUser2 = iterator2.next();
                final int n6 = n5 + 1;
                contentValues.put("is_last", n6 == size && "0".equals(s));
                a(contentValues, twitterUser2);
                if (writableDatabase.insert("user_groups", "user_id", contentValues) > 0L && twitterUser2.metadata != null) {
                    contentValues2.put("user_id", twitterUser2.userId);
                    this.a(contentValues2, twitterUser2.metadata);
                    writableDatabase.insert("user_metadata", "user_id", contentValues2);
                }
                n5 = n6;
            }
            if (b != null) {
                b.a(com.twitter.library.provider.be.a);
            }
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }
    
    public void a(final Collection collection, final long n, final int n2, final long n3, final String s, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "mergeUserGroups: " + collection.size() + ", owned by: " + n + ", of type: " + n2 + ", next: " + s);
        }
        if (collection == null || n2 == -1 || n < 0L) {
            return;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        LinkedHashMap<Object, TwitterUser> linkedHashMap = null;
        Label_0113: {
            if (s == null) {
                break Label_0113;
            }
            try {
                this.a(1, n2, n, 0L, s);
                if (collection.isEmpty()) {
                    if ("0".equals(s) || n2 == 21) {
                        this.c(n, n2, b);
                    }
                    writableDatabase.setTransactionSuccessful();
                    return;
                }
                linkedHashMap = (LinkedHashMap<Object, TwitterUser>)new LinkedHashMap<Long, TwitterUser>();
                for (final TwitterUser twitterUser : collection) {
                    linkedHashMap.put(twitterUser.userId, twitterUser);
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
        final Cursor query = writableDatabase.query("user_groups", cs.a, "owner_id=? AND type=? AND tag=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3) }, (String)null, (String)null, (String)null);
        if (query == null) {
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return;
        }
        try {
            while (query.moveToNext()) {
                linkedHashMap.remove(query.getLong(0));
            }
        }
        finally {
            query.close();
        }
        query.close();
        if (bg.b) {
            Log.d("DatabaseHelper", "Inserting new user groups: " + linkedHashMap.size());
        }
        final int size = linkedHashMap.size();
        if (size > 0) {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("owner_id", n);
            contentValues.put("type", n2);
            contentValues.put("tag", n3);
            final ContentValues contentValues2 = new ContentValues();
            contentValues2.put("owner_id", n);
            contentValues2.put("user_group_type", n2);
            contentValues2.put("user_group_tag", n3);
            final Iterator<TwitterUser> iterator2 = linkedHashMap.values().iterator();
            int n4 = 0;
            while (iterator2.hasNext()) {
                final TwitterUser twitterUser2 = iterator2.next();
                final int n5 = n4 + 1;
                contentValues.put("is_last", n5 == size && "0".equals(s));
                a(contentValues, twitterUser2);
                if (writableDatabase.insert("user_groups", "user_id", contentValues) > 0L && twitterUser2.metadata != null) {
                    contentValues2.put("user_id", twitterUser2.userId);
                    this.a(contentValues2, twitterUser2.metadata);
                    writableDatabase.insert("user_metadata", "user_id", contentValues2);
                }
                n4 = n5;
            }
            if (b != null) {
                b.a(com.twitter.library.provider.be.a);
            }
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }
    
    public void a(final Collection collection, final long n, final int n2, final String s, final boolean b, final b b2) {
        this.a(collection, n, n2, s, b, true, b2);
    }
    
    public void a(final Collection collection, final long n, final int n2, final String s, final boolean b, final boolean b2, final b b3) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Merging lists: " + collection.size() + ", owned by: " + n + ", type: " + n2 + ", next: " + s);
        }
        if (n < 0L) {
            throw new IllegalArgumentException("null owner id not allowed for lists");
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        HashMap<Long, be> hashMap = null;
        Label_0113: {
            if (s == null) {
                break Label_0113;
            }
            try {
                this.a(2, n2, n, 0L, s);
                if (collection.isEmpty()) {
                    if (b2 && "0".equals(s)) {
                        this.g(n, b3);
                    }
                    if (b) {
                        writableDatabase.delete("list_mapping", "list_mapping_user_id = ? AND list_mapping_type = ?", new String[] { String.valueOf(n), String.valueOf(n2) });
                        if (n2 == 0) {
                            writableDatabase.delete("topics", "ev_type=5 AND ev_owner_id=?", new String[] { String.valueOf(n) });
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    return;
                }
                hashMap = new HashMap<Long, be>();
                for (final be be : collection) {
                    hashMap.put(be.a(), be);
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
        final Cursor a = a(writableDatabase, "topics", bu.a, "ev_id", null, null, hashMap.values(), null, null);
        if (a == null) {
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            return;
        }
        final HashMap<Long, be> hashMap2 = new HashMap<Long, be>();
        try {
            while (a.moveToNext()) {
                final long long1 = a.getLong(0);
                final be be2 = hashMap.remove(long1);
                if (be2.hashCode() != a.getInt(1)) {
                    hashMap2.put(long1, be2);
                }
            }
        }
        finally {
            a.close();
        }
        a.close();
        if (bg.b) {
            Log.d("DatabaseHelper", "Inserting new lists: " + hashMap.size() + ", updating lists: " + hashMap2.size());
        }
        long a2;
        if (hashMap.size() > 0) {
            final HashMap<Long, TwitterUser> hashMap3 = new HashMap<Long, TwitterUser>();
            for (final be be3 : hashMap.values()) {
                hashMap3.put(be3.h.userId, be3.h);
            }
            this.a(hashMap3.values(), -1L, -1, -1L, null, null, true, b3);
            final int size = hashMap.size();
            final ContentValues contentValues = new ContentValues();
            final Iterator<be> iterator3 = hashMap.values().iterator();
            int n3 = 0;
            a2 = -1L;
            while (iterator3.hasNext()) {
                final be be4 = iterator3.next();
                ++n3;
                contentValues.put("ev_type", 5);
                contentValues.put("ev_id", be4.a());
                contentValues.put("ev_title", be4.a);
                contentValues.put("ev_query", be4.b);
                contentValues.put("ev_subtitle", be4.c);
                contentValues.put("ev_owner_id", be4.h.userId);
                contentValues.put("ev_hash", be4.hashCode());
                if (size == n3 && "0".equals(s)) {
                    a2 = be4.a();
                }
                final TwitterTopic$TwitterList list = new TwitterTopic$TwitterList();
                list.members = be4.e;
                list.subscribers = be4.f;
                list.mode = be4.g;
                list.followStatus = be4.i;
                contentValues.put("ev_content", com.twitter.util.f.a(list));
                writableDatabase.insert("topics", "ev_id", contentValues);
            }
        }
        else {
            a2 = -1L;
        }
        if (hashMap2.size() > 0) {
            final ContentValues contentValues2 = new ContentValues();
            for (final be be5 : hashMap2.values()) {
                contentValues2.clear();
                contentValues2.put("ev_title", be5.a);
                contentValues2.put("ev_query", be5.b);
                contentValues2.put("ev_subtitle", be5.c);
                contentValues2.put("ev_owner_id", be5.h.userId);
                contentValues2.put("ev_hash", be5.hashCode());
                contentValues2.put("ev_content", com.twitter.util.f.a(this.b(be5)));
                writableDatabase.update("topics", contentValues2, "ev_type=5 AND ev_id=?", new String[] { String.valueOf(be5.a()) });
            }
        }
        if (collection.size() > 0) {
            if (b) {
                writableDatabase.delete("list_mapping", "list_mapping_user_id = ? AND list_mapping_type = ?", new String[] { String.valueOf(n), String.valueOf(n2) });
            }
            final ContentValues contentValues3 = new ContentValues();
            for (final be be6 : collection) {
                contentValues3.clear();
                contentValues3.put("list_mapping_list_id", String.valueOf(be6.a()));
                contentValues3.put("list_mapping_user_id", n);
                contentValues3.put("list_mapping_type", n2);
                contentValues3.put("list_is_last", be6.a() == a2);
                writableDatabase.replace("list_mapping", (String)null, contentValues3);
            }
        }
        if (b3 != null && hashMap.size() + hashMap2.size() > 0) {
            b3.a(aq.a);
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }
    
    public void a(final HashMap hashMap, final b b) {
        SQLiteDatabase writableDatabase;
        ArrayList<Cursor> list;
        while (true) {
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
        Label_0124_Outer:
            while (true) {
                Iterator<Long> iterator;
                int n;
                String[] a;
                int n2 = 0;
                String[] array;
                Cursor query;
                Cursor query2;
                int n3;
                Label_0480:Label_0057_Outer:
                while (true) {
                    while (true) {
                        try {
                            list = new ArrayList<Cursor>();
                            iterator = hashMap.keySet().iterator();
                            n = hashMap.size() / 10;
                            if (n > 0) {
                                a = a(10, (String[])null);
                                n2 = 0;
                                break Label_0467;
                            }
                            array = new String[] { null };
                            while (iterator.hasNext()) {
                                array[0] = iterator.next().toString();
                                query = writableDatabase.query("users", bs.a, "user_id=?", array, (String)null, (String)null, (String)null);
                                if (query != null) {
                                    list.add(query);
                                }
                            }
                            break;
                            Label_0088: {
                                query2 = writableDatabase.query("users", bs.a, "user_id IN (?,?,?,?,?,?,?,?,?,?)", a, (String)null, (String)null, (String)null);
                            }
                            // iftrue(Label_0480:, query2 == null)
                            list.add(query2);
                            break Label_0480;
                            // iftrue(Label_0088:, n3 >= 10)
                            a[n3] = iterator.next().toString();
                            ++n3;
                            continue;
                        }
                        finally {
                            writableDatabase.endTransaction();
                        }
                        break;
                        if (n2 < n) {
                            n3 = 0;
                            continue;
                        }
                        break;
                    }
                    continue Label_0057_Outer;
                }
                ++n2;
                continue Label_0124_Outer;
            }
        }
        Label_0419: {
            if (list.isEmpty()) {
                break Label_0419;
            }
        Label_0383_Outer:
            while (true) {
                final MergeCursor mergeCursor = new MergeCursor((Cursor[])list.toArray(new Cursor[list.size()]));
                while (true) {
                    int n5 = 0;
                Label_0460:
                    while (true) {
                        int n4 = 0;
                        Label_0453: {
                            try {
                                final boolean moveToFirst = mergeCursor.moveToFirst();
                                n4 = 0;
                                if (moveToFirst) {
                                    final ContentValues contentValues = new ContentValues();
                                    final long currentTimeMillis = System.currentTimeMillis();
                                    n5 = 0;
                                    final long long1 = mergeCursor.getLong(0);
                                    final int int1 = mergeCursor.getInt(1);
                                    if (!hashMap.containsKey(long1)) {
                                        break Label_0460;
                                    }
                                    int n6;
                                    if ((0x1 & (int)hashMap.get(long1)) != 0x0) {
                                        n6 = z.a(int1, 1);
                                    }
                                    else {
                                        n6 = z.b(int1, 1);
                                    }
                                    contentValues.put("friendship", n6);
                                    contentValues.put("friendship_time", currentTimeMillis);
                                    n4 = n5 + writableDatabase.update("users", contentValues, "user_id=?", new String[] { String.valueOf(long1) });
                                    if (mergeCursor.moveToNext()) {
                                        break Label_0453;
                                    }
                                }
                                if (n4 > 0 && b != null) {
                                    b.a(bg.d);
                                    b.a(bg.e);
                                }
                                mergeCursor.close();
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                                return;
                            }
                            finally {
                                mergeCursor.close();
                            }
                        }
                        n5 = n4;
                        continue Label_0383_Outer;
                    }
                    int n4 = n5;
                    continue;
                }
            }
        }
    }
    
    public void a(final List list, final long n, final int n2, final boolean b, final b b2) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Merging timeline mappings to ListMapping table: " + list.size() + ", user id: " + n + ", mapping type: " + n2);
        }
        if (n < 0L) {
            throw new IllegalArgumentException("null owner id not allowed");
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        Label_0134: {
            if (!b) {
                break Label_0134;
            }
            Label_0124: {
                if (n2 != 0) {
                    break Label_0124;
                }
                try {
                    writableDatabase.delete("topics", "ev_type=4 AND ev_owner_id=?", new String[] { String.valueOf(n) });
                    this.b(writableDatabase, null, n, n2);
                    if (list.size() > 0) {
                        final Iterator<TwitterTopic> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            this.a(writableDatabase, iterator.next().b(), n, n2);
                        }
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
            }
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        if (b2 != null) {
            b2.a(aq.a);
        }
    }
    
    public void a(final long[] array, final long n, final int n2) {
        int i = 0;
        if (array.length == 0) {
            return;
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String[] array2 = { null, String.valueOf(n), String.valueOf(n2) };
            while (i < array.length) {
                array2[0] = String.valueOf(array[i]);
                writableDatabase.execSQL("UPDATE timeline SET flags=flags|2097152 WHERE timeline_scribe_group_id=? AND owner_id=? AND type=?", (Object[])array2);
                ++i;
            }
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void a(final String[] array, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues(1);
            contentValues.put("story_is_read", 1);
            final int length = array.length;
            int i = 0;
            int n = 0;
            while (i < length) {
                n += writableDatabase.update("stories", contentValues, "story_id=?", new String[] { array[i] });
                ++i;
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (n > 0 && b != null) {
                b.a(ba.b);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public boolean a(final int n, final int n2, final long n3, final String s, final String s2, final b b) {
        final String b2 = this.b(n, n2, n3, s);
        if (b2 == null || Long.parseLong(b2) < Long.parseLong(s2)) {
            this.a(n, n2, n3, s, s2);
            if (b != null && 14 == n) {
                this.a(Collections.EMPTY_SET, b);
            }
            return true;
        }
        return false;
    }
    
    public boolean a(final int n, final long n2, final long n3) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        final Cursor query = writableDatabase.query("timeline", new String[] { "entity_id" }, "owner_id=? AND type=? AND data_type=? AND timeline_group_id=?", new String[] { String.valueOf(n3), String.valueOf(n), String.valueOf(5), String.valueOf(n2) }, (String)null, (String)null, (String)null);
        try {
            writableDatabase.beginTransaction();
            final boolean moveToFirst = query.moveToFirst();
            boolean b = false;
            if (moveToFirst) {
                final int c = ae.c(n);
                this.a(n3, n, query.getLong(0), null);
                this.a(n3, 4, c, n2);
                this.a(n3, 5, c, n2);
                b = true;
                writableDatabase.setTransactionSuccessful();
            }
            return b;
        }
        finally {
            writableDatabase.endTransaction();
            query.close();
        }
    }
    
    public boolean a(final long n, final long n2) {
        return this.a("owner_id=? AND sender_id=? AND ref_id=?", "owner_id=? AND sender_id=? AND ref_id=?", new String[] { String.valueOf(n2), String.valueOf(n2), String.valueOf(n) }, true) > 0;
    }
    
    public boolean a(final long n, final long n2, final int n3, final long n4) {
        final Cursor query = this.getReadableDatabase().query("user_groups", (String[])null, "owner_id=? AND type=? AND tag=? AND user_id=?", new String[] { String.valueOf(n2), String.valueOf(n3), String.valueOf(n4), String.valueOf(n) }, (String)null, (String)null, (String)null, (String)null);
        if (query != null) {
            try {
                return query.moveToFirst();
            }
            finally {
                query.close();
            }
        }
        return false;
    }
    
    public boolean a(final TwitterUser twitterUser, final long n, final int n2, final long n3, final long n4, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final Cursor query = writableDatabase.query("user_groups", new String[] { "_id" }, "owner_id=? AND type=? AND tag=? AND user_id=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3), String.valueOf(twitterUser.userId) }, (String)null, (String)null, (String)null);
            if (query != null) {
                try {
                    final int count = query.getCount();
                    query.close();
                    if (count > 0) {
                        writableDatabase.setTransactionSuccessful();
                        return false;
                    }
                }
                finally {
                    query.close();
                }
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>(1);
        list.add(twitterUser);
        boolean b2;
        if (this.a(list, n, -1, -1L, null, null, true, b) == 1 || this.a(twitterUser.userId, n, n2, n3)) {
            final ContentValues contentValues = new ContentValues();
            a(contentValues, twitterUser);
            b2 = (writableDatabase.update("user_groups", contentValues, "owner_id=? AND type=? AND tag=? AND user_id=?", new String[] { String.valueOf(n), String.valueOf(n2), String.valueOf(n3), String.valueOf(n4) }) == 1);
            if (b2 && twitterUser.metadata != null) {
                contentValues.clear();
                contentValues.put("owner_id", n);
                contentValues.put("user_group_type", n2);
                contentValues.put("user_group_tag", n3);
                contentValues.put("user_id", twitterUser.userId);
                this.a(contentValues, twitterUser.metadata);
                writableDatabase.insert("user_metadata", "user_id", contentValues);
            }
        }
        else {
            b2 = false;
        }
        if (b2 && b != null) {
            b.a(com.twitter.library.provider.be.a);
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        return b2;
    }
    
    public boolean a(final TwitterUser twitterUser, final long n, final long n2, final int n3, final b b) {
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                try {
                    final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>(1);
                    list.add(twitterUser);
                    if (this.a(list, n, 9, -1L, null, null, true, b) == 1) {
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("unread", 0);
                        contentValues.put("identifier", twitterUser.userId);
                        final boolean b2 = writableDatabase.update("discover", contentValues, "type=? AND page=? AND identifier=?", new String[] { String.valueOf(2), String.valueOf(n3), String.valueOf(n2) }) > 0;
                        if (b2 && b != null) {
                            b.a(an.a, ao.a);
                        }
                        writableDatabase.setTransactionSuccessful();
                        return b2;
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                final boolean b2 = false;
                continue;
            }
        }
    }
    
    public long[] a(final int n, final int n2) {
        final Cursor query = this.getReadableDatabase().query("activities", bi.a, "type=?", new String[] { String.valueOf(0) }, (String)null, (String)null, "max_position DESC", (String)null);
        final HashSet<Long> set = new HashSet<Long>();
        Label_0221: {
            if (query == null) {
                break Label_0221;
            }
            int n3 = 0;
            int n4 = 0;
            int int1;
            int int2;
            ArrayList a;
            Iterator<Long> iterator;
            int n5 = 0;
            int n6 = 0;
            Iterator<Long> iterator2;
            int n7 = 0;
            int n8 = 0;
            Label_0151_Outer:Label_0188_Outer:
            while (true) {
            Label_0188:
                while (true) {
                Label_0362:
                    while (true) {
                        Label_0355: {
                            Label_0351: {
                                Label_0340: {
                                Label_0329:
                                    while (true) {
                                        Label_0318: {
                                            try {
                                                if (query.moveToFirst()) {
                                                    n3 = 0;
                                                    n4 = 0;
                                                    int1 = query.getInt(4);
                                                    int2 = query.getInt(1);
                                                    if (int1 == 0) {
                                                        break Label_0340;
                                                    }
                                                    a = a(query.getBlob(5));
                                                    if ((int2 == 2 || int2 == 3 || int2 == 15) && n3 < n2) {
                                                        iterator = a.iterator();
                                                        n5 = n3;
                                                        if (!iterator.hasNext()) {
                                                            break Label_0362;
                                                        }
                                                        if (set.add(iterator.next())) {
                                                            n6 = n5 + 1;
                                                            break Label_0355;
                                                        }
                                                        break Label_0351;
                                                    }
                                                    else {
                                                        if (n4 >= n) {
                                                            break Label_0340;
                                                        }
                                                        iterator2 = a.iterator();
                                                        n7 = n4;
                                                        Block_15: {
                                                            while (iterator2.hasNext()) {
                                                                if (set.add(iterator2.next())) {
                                                                    n8 = n7 + 1;
                                                                    if (n8 >= n) {
                                                                        break Block_15;
                                                                    }
                                                                }
                                                                else {
                                                                    n8 = n7;
                                                                }
                                                                n7 = n8;
                                                            }
                                                            break Label_0329;
                                                        }
                                                        n5 = n3;
                                                        if (query.moveToNext() && (n5 < n2 || n8 < n)) {
                                                            break Label_0318;
                                                        }
                                                    }
                                                }
                                                query.close();
                                                return CollectionUtils.c(set);
                                            }
                                            finally {
                                                query.close();
                                            }
                                        }
                                        n3 = n5;
                                        n4 = n8;
                                        continue Label_0151_Outer;
                                    }
                                    n8 = n7;
                                    n5 = n3;
                                    continue Label_0188;
                                }
                                n5 = n3;
                                n8 = n4;
                                continue Label_0188;
                            }
                            n6 = n5;
                        }
                        n5 = n6;
                        continue Label_0188_Outer;
                    }
                    n8 = n4;
                    continue Label_0188;
                }
            }
        }
    }
    
    public long[] a(final Uri uri, final String s, final String s2, final String[] array) {
        final ArrayList<Long> list = new ArrayList<Long>();
        final Cursor query = this.g.getContentResolver().query(uri, new String[] { s }, s2, array, (String)null);
        if (query != null) {
            try {
                while (query.moveToNext()) {
                    list.add(query.getLong(0));
                }
            }
            finally {
                query.close();
            }
            query.close();
        }
        return CollectionUtils.c(list);
    }
    
    public int b(final long n, final long n2, final boolean b, final b b2) {
        if (bg.b) {
            final StringBuilder sb = new StringBuilder();
            String s;
            if (b) {
                s = "Favorite";
            }
            else {
                s = "Unfavorite";
            }
            Log.d("DatabaseHelper", sb.append(s).append(" status: ").append(n2).append(", owned by: ").append(n).toString());
        }
        final bp b3 = this.b(n2);
        int max;
        if (b3 == null) {
            max = 0;
        }
        else {
            if (b3.A == b) {
                return b3.B;
            }
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                final String[] array = { String.valueOf(n2) };
                final ContentValues contentValues = new ContentValues();
                contentValues.put("favorited", b);
                if (b) {
                    max = 1 + b3.B;
                }
                else {
                    max = Math.max(0, -1 + b3.B);
                }
                contentValues.put("favorite_count", max);
                writableDatabase.update("statuses", contentValues, "status_id=?", array);
                if (!b) {
                    writableDatabase.delete("status_groups", "owner_id=? AND type=? AND g_status_id=?", new String[] { String.valueOf(n), String.valueOf(2), String.valueOf(n2) });
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (b2 != null) {
                    b2.a(bg.d);
                    b2.a(bg.e);
                    return max;
                }
            }
            finally {
                writableDatabase.endTransaction();
            }
        }
        return max;
    }
    
    public int b(final long n, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("search_queries", "query_id=?", new String[] { String.valueOf(n) });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (delete > 0 && b != null) {
                b.a(av.a);
            }
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int b(final long n, final String s, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("timeline", "owner_id=? AND type=? AND data_origin_id=?", new String[] { String.valueOf(n), String.valueOf(0), s });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (delete > 0) {
                this.a(0, b);
            }
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int b(final String s, final long n, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("timeline", "type=5 AND timeline_tag=? AND data_type=1 AND data_id=?", new String[] { s, String.valueOf(n) });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (delete > 0) {
                this.a(5, b);
            }
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    int b(final String s, final String[] array) {
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                try {
                    final Cursor query = writableDatabase.query("timeline_view", cp.a, s, array, (String)null, (String)null, (String)null);
                    if (query != null) {
                        int n = 0;
                        try {
                            while (query.moveToNext()) {
                                if (bb.a(query.getInt(4))) {
                                    n += writableDatabase.delete("timeline", "owner_id=? AND type=? AND entity_id=?", new String[] { String.valueOf(query.getLong(1)), String.valueOf(query.getInt(2)), String.valueOf(query.getLong(3)) });
                                }
                                else {
                                    n += writableDatabase.delete("timeline", "_id=?", new String[] { String.valueOf(query.getLong(0)) });
                                }
                            }
                            query.close();
                            writableDatabase.setTransactionSuccessful();
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
                int n = 0;
                continue;
            }
        }
    }
    
    public int b(final List list) {
        int n = 0;
        if (list.isEmpty()) {
            return 0;
        }
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                int n2 = 0;
                Label_0127: {
                    try {
                        writableDatabase.execSQL("DELETE FROM referral_campaigns");
                        final ContentValues contentValues = new ContentValues();
                        final Iterator<ReferralCampaign> iterator = list.iterator();
                        if (!iterator.hasNext()) {
                            writableDatabase.setTransactionSuccessful();
                            return n;
                        }
                        final ReferralCampaign referralCampaign = iterator.next();
                        contentValues.clear();
                        a(referralCampaign, contentValues);
                        if (writableDatabase.insert("referral_campaigns", "id", contentValues) > 0L) {
                            n2 = n + 1;
                            break Label_0127;
                        }
                    }
                    finally {
                        writableDatabase.endTransaction();
                    }
                    n2 = n;
                }
                n = n2;
                continue;
            }
        }
    }
    
    public int b(final long[] array) {
        final ContentValues contentValues = new ContentValues(1);
        contentValues.put("unread", 1);
        return this.b("discover", contentValues, array);
    }
    
    public long b(final int n) {
        final Cursor query = this.getReadableDatabase().query("activities", bj.a, "type=?", new String[] { String.valueOf(n) }, (String)null, (String)null, "max_position DESC", "1");
        if (query == null) {
            return 0L;
        }
        try {
            if (query.moveToFirst()) {
                return query.getLong(3);
            }
            return 0L;
        }
        finally {
            query.close();
        }
    }
    
    long b(final long n, final int n2, final String s) {
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        Label_0106: {
            if (TextUtils.isEmpty((CharSequence)s)) {
                break Label_0106;
            }
            String s2 = "owner_id=? AND type=? AND timeline_tag=?";
            String[] array = { String.valueOf(n), String.valueOf(n2), s };
            while (true) {
                final Cursor query = readableDatabase.query("timeline", co.a, s2, array, (String)null, (String)null, "sort_index ASC, updated_at ASC, _id DESC", "1");
                if (query == null) {
                    return 0L;
                }
                try {
                    if (query.moveToFirst()) {
                        return query.getLong(0);
                    }
                    return 0L;
                    s2 = "owner_id=? AND type=?";
                    array = new String[] { String.valueOf(n), String.valueOf(n2) };
                    continue;
                }
                finally {
                    query.close();
                }
                break;
            }
        }
    }
    
    public bp b(final long n) {
        return this.b(this.getReadableDatabase(), n);
    }
    
    public Long b(final long n, final long n2) {
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append("g_status_id");
        sb.append(" FROM ");
        sb.append("status_groups");
        sb.append(" WHERE ");
        sb.append("owner_id=? AND preview_draft_id=?");
        final Cursor rawQuery = readableDatabase.rawQuery(sb.toString(), new String[] { Long.toString(n), Long.toString(n2) });
        Label_0150: {
            if (rawQuery == null) {
                break Label_0150;
            }
            try {
                if (rawQuery.moveToFirst()) {
                    return rawQuery.getLong(0);
                }
                return null;
            }
            finally {
                rawQuery.close();
            }
        }
    }
    
    public String b(final int n, final int n2, final long n3, final String s) {
        Label_0113: {
            if (s == null) {
                break Label_0113;
            }
            String s2 = "owner_id=? AND type=? AND kind=? AND ref_id=?";
            String[] array = { String.valueOf(n3), String.valueOf(n2), String.valueOf(n), String.valueOf(s) };
            while (true) {
                final Cursor query = this.getReadableDatabase().query("cursors", com.twitter.library.provider.bp.a, s2, array, (String)null, (String)null, (String)null);
                String string = null;
                if (query == null) {
                    return string;
                }
                try {
                    if (query.moveToFirst()) {
                        string = query.getString(0);
                        return string;
                    }
                    return null;
                    s2 = "owner_id=? AND type=? AND kind=? AND ref_id IS NULL";
                    array = new String[] { String.valueOf(n3), String.valueOf(n2), String.valueOf(n) };
                    continue;
                }
                finally {
                    query.close();
                }
                break;
            }
        }
    }
    
    public String b(final int n, final long n2, final long n3) {
        return this.a(n, n2, l(n3));
    }
    
    public String b(final int n, final long n2, final String s) {
        return this.a(n, 3, n2, s);
    }
    
    public List b(final String s) {
        final Cursor query = this.getReadableDatabase().query("conversation_participants", ak.c, "conversation_id=?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
        final ArrayList<Long> list = new ArrayList<Long>();
        if (query != null) {
            try {
                while (query.moveToNext()) {
                    list.add(query.getLong(1));
                }
            }
            finally {
                query.close();
            }
            query.close();
        }
        return list;
    }
    
    public void b(final int n, final String s, final long n2, final String s2, final boolean b, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8, final String s9) {
        this.a(true, n, s, n2, s2, b, s3, s4, s5, s6, s7, s8, s9);
    }
    
    public void b(final int n, final long[] array, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues(1);
            contentValues.put("tag", 0);
            if (array == null || array.length == 0) {
                writableDatabase.update("activities", contentValues, "type=?", new String[] { String.valueOf(n) });
            }
            else {
                this.b("activities", contentValues, array);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                b.a(af.a);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void b(final long n, final int n2) {
        if (bg.b) {
            Log.d("DatabaseHelper", "saveFriendship: " + n + " friendship: " + n2);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final ContentValues contentValues = new ContentValues();
            contentValues.put("friendship", n2);
            contentValues.put("friendship_time", System.currentTimeMillis());
            writableDatabase.update("users", contentValues, "user_id=?", new String[] { String.valueOf(n) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void b(final long n, final int n2, final b b) {
        this.b(n, n2, b, false, -1L);
    }
    
    public void b(final long n, final int n2, final b b, final boolean b2, final long n3) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final Cursor query = writableDatabase.query("users", bs.a, "user_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
            Label_0076: {
                if (query == null) {
                    break Label_0076;
                }
                try {
                    this.a(query, n2, false, b, b2, n3);
                    query.close();
                    writableDatabase.setTransactionSuccessful();
                }
                finally {
                    query.close();
                }
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void b(final long n, final long n2, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Removing user: " + n2 + ", owned by: " + n);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String value = String.valueOf(n);
            final String value2 = String.valueOf(n2);
            this.a(writableDatabase, n, n2, b);
            a(writableDatabase, n2, b);
            this.a(writableDatabase, null, null, null, -1L, -1, "owner_id=? AND sender_id=? AND type IN (0,12,14,5,2,19)", new String[] { value, value2 }, b);
            this.a(writableDatabase, null, null, null, -1L, -1, "type=1 AND owner_id<>sender_id AND sender_id=?", new String[] { value2 }, b);
            if (writableDatabase.delete("user_groups", "owner_id=? AND user_id=? AND type IN (8,13,11,12,1,29,0,18,19,21,10,20,33)", new String[] { value, value2 }) > 0 && b != null) {
                b.a(com.twitter.library.provider.be.o, com.twitter.library.provider.be.p, com.twitter.library.provider.be.q, com.twitter.library.provider.be.r, com.twitter.library.provider.be.h, com.twitter.library.provider.be.g, com.twitter.library.provider.be.t, com.twitter.library.provider.be.v, com.twitter.library.provider.be.y, com.twitter.library.provider.be.z, com.twitter.library.provider.be.x, com.twitter.library.provider.be.A);
            }
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void b(final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String[] j = this.j();
            for (int length = j.length, i = 0; i < length; ++i) {
                writableDatabase.delete(j[i], (String)null, (String[])null);
            }
            writableDatabase.execSQL("DELETE FROM statuses;");
            writableDatabase.execSQL("DELETE FROM status_groups;");
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                b.a(ae.e);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void b(final String s, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Deleting all timeline mappings from ListMapping table for timelineId: " + s);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            this.b(writableDatabase, s, 0L, -1);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                b.a(aq.a);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void b(final String s, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("is_hidden", b);
        final String[] array = { s, null };
        String s2;
        if (b) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        array[1] = s2;
        if (writableDatabase.update("conversations", contentValues, "conversation_id=? AND is_hidden!=?", array) > 0 && b2 != null) {
            b2.a(com.twitter.library.provider.al.a);
        }
    }
    
    public void b(final Collection collection) {
        synchronized (this) {
            this.i.removeAll(collection);
        }
    }
    
    public void b(final boolean b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("user_metadata", (String)null, (String[])null);
            writableDatabase.delete("user_groups", (String)null, (String[])null);
            writableDatabase.delete("cursors", (String)null, (String[])null);
            if (b) {
                writableDatabase.delete("users", (String)null, (String[])null);
            }
            writableDatabase.delete("status_metadata", (String)null, (String[])null);
            writableDatabase.delete("status_groups", (String)null, (String[])null);
            writableDatabase.delete("statuses", (String)null, (String[])null);
            writableDatabase.delete("search_queries", (String)null, (String[])null);
            writableDatabase.delete("activities", (String)null, (String[])null);
            writableDatabase.delete("discover", (String)null, (String[])null);
            writableDatabase.delete("tokens", (String)null, (String[])null);
            writableDatabase.delete("notifications", (String)null, (String[])null);
            writableDatabase.delete("search_results", (String)null, (String[])null);
            writableDatabase.delete("timeline", (String)null, (String[])null);
            writableDatabase.delete("topics", (String)null, (String[])null);
            writableDatabase.delete("promoted_retry", (String)null, (String[])null);
            writableDatabase.delete("conversations", (String)null, (String[])null);
            writableDatabase.delete("conversation_entries", (String)null, (String[])null);
            writableDatabase.delete("conversation_participants", (String)null, (String[])null);
            writableDatabase.delete("referral_campaigns", (String)null, (String[])null);
            writableDatabase.delete("prompts", (String)null, (String[])null);
            writableDatabase.delete("stories", (String)null, (String[])null);
            writableDatabase.delete("news", (String)null, (String[])null);
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public com.twitter.library.api.al[] b() {
        return this.e(null, (String[])null);
    }
    
    public int c() {
        final Cursor query = this.getReadableDatabase().query("status_groups", new String[] { "COUNT(_id)" }, "preview_draft_id IS NOT NULL", (String[])null, (String)null, (String)null, (String)null);
        if (query == null) {
            return 0;
        }
        try {
            if (query.moveToNext()) {
                return query.getInt(0);
            }
            return 0;
        }
        finally {
            query.close();
        }
    }
    
    public int c(final long n, final b b) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("polled", 0);
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int update = writableDatabase.update("search_results", contentValues, "polled=1 AND search_id=?", new String[] { String.valueOf(n) });
            if (bg.b) {
                Log.d("DatabaseHelper", "Marked all polled search results as normal: " + update);
            }
            if (update > 0 && b != null) {
                b.a(aw.a);
            }
            writableDatabase.setTransactionSuccessful();
            return update;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int c(final String s, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("search_queries", "query=? AND type=?", new String[] { s, String.valueOf(0) });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (delete > 0 && b != null) {
                b.a(av.a);
            }
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int c(final String s, final String[] array) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("notifications", s, array);
            writableDatabase.setTransactionSuccessful();
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public int c(final long[] array) {
        final ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_read", 1);
        return this.a("timeline", contentValues, array);
    }
    
    public long c(final int n) {
        final Cursor query = this.getReadableDatabase().query("activities", bj.a, "type=?", new String[] { String.valueOf(n) }, (String)null, (String)null, "max_position ASC, _id DESC", "1");
        if (query == null) {
            return 0L;
        }
        try {
            if (query.moveToFirst()) {
                return query.getLong(0);
            }
            return 0L;
        }
        finally {
            query.close();
        }
    }
    
    public long c(final long n, final int n2) {
        final Cursor query = this.getReadableDatabase().query("user_groups_view", ct.a, "owner_id=? AND type=?", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, "_id DESC", "1");
        if (query == null) {
            return 0L;
        }
        try {
            if (query.moveToFirst()) {
                return query.getLong(0);
            }
            return 0L;
        }
        finally {
            query.close();
        }
    }
    
    public Tweet c(final long n) {
        final Cursor query = this.getReadableDatabase().query("status_groups_view", Tweet.a, "g_status_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        Tweet a = null;
        if (query == null) {
            return a;
        }
        final boolean moveToFirst = query.moveToFirst();
        a = null;
        if (!moveToFirst) {
            return a;
        }
        try {
            a = new ad(query).a();
            return a;
        }
        finally {
            query.close();
        }
    }
    
    public String c(final int n, final long n2, final long n3) {
        return this.b(n, n2, l(n3));
    }
    
    public List c(final String s) {
        final ArrayList<x> list = new ArrayList<x>();
        final ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(x.a));
        list2.add("max(sort_entry_id)");
        final StringBuilder sb = new StringBuilder("entry_type" + a(0, 19, 1, 10, 8, 17));
        String[] array;
        if (s != null) {
            sb.append(" AND conversation_id=?");
            array = new String[] { s };
        }
        else {
            array = null;
        }
        final Cursor query = this.getReadableDatabase().query("conversation", (String[])list2.toArray(new String[list2.size()]), sb.toString(), array, "conversation_id", (String)null, (String)null, (String)null);
        if (query != null) {
            try {
                while (query.moveToNext()) {
                    list.add(new x(query, this.h, null));
                }
            }
            finally {
                query.close();
            }
            query.close();
        }
        return list;
    }
    
    public void c(final long n, final long n2, final b b) {
        if (bg.b) {
            Log.d("DatabaseHelper", "Removing user: " + n2 + ", owned by: " + n + " From Notifications");
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String value = String.valueOf(n);
            final String value2 = String.valueOf(n2);
            this.a(writableDatabase, n, n2, b);
            if (writableDatabase.delete("status_groups", "owner_id=? AND sender_id=? AND type IN (12,14,5,2)", new String[] { value, value2 }) > 0 && b != null) {
                b.a(az.g);
            }
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void c(final String s, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("has_more", b);
        final String[] array = { s, null };
        String s2;
        if (b) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        array[1] = s2;
        if (writableDatabase.update("conversations", contentValues, "conversation_id=? AND has_more!=?", array) > 0 && b2 != null) {
            b2.a(Uri.withAppendedPath(ai.a, s), Uri.withAppendedPath(ak.a, s));
        }
    }
    
    public int d() {
        SQLiteDatabase writableDatabase = null;
        Cursor query;
        long[] array;
        int n;
        int n2 = 0;
        int n3 = 0;
        long[] array2;
        Label_0092_Outer:Label_0106_Outer:
        while (true) {
            writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                Label_0200: {
                    while (true) {
                        Label_0191: {
                            while (true) {
                                Label_0184: {
                                    try {
                                        query = writableDatabase.query("status_groups", new String[] { "g_status_id" }, "preview_draft_id IS NOT NULL", (String[])null, (String)null, (String)null, (String)null, (String)null);
                                        if (query == null) {
                                            break Label_0200;
                                        }
                                        try {
                                            if (!query.moveToFirst()) {
                                                break Label_0191;
                                            }
                                            array = new long[query.getCount()];
                                            n = 0;
                                            n2 = n + 1;
                                            array[n] = query.getLong(0);
                                            if (query.moveToNext()) {
                                                break Label_0184;
                                            }
                                            query.close();
                                            n3 = n2;
                                            array2 = array;
                                            if (array2 != null) {
                                                for (int length = array2.length, i = 0; i < length; ++i) {
                                                    this.a(array2[i], (b)null);
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        finally {
                                            query.close();
                                        }
                                    }
                                    finally {
                                        writableDatabase.endTransaction();
                                    }
                                    break;
                                }
                                n = n2;
                                continue Label_0092_Outer;
                            }
                        }
                        array = null;
                        n2 = 0;
                        continue Label_0106_Outer;
                    }
                }
                array2 = null;
                n3 = 0;
                continue;
            }
        }
        writableDatabase.delete("status_groups", "preview_draft_id IS NOT NULL", (String[])null);
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        return n3;
    }
    
    public int d(final long n) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("search_results", "search_id=?", new String[] { String.valueOf(n) });
            if (bg.b) {
                Log.d("DatabaseHelper", "Deleted search results: " + delete);
            }
            writableDatabase.setTransactionSuccessful();
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public long d(final int n) {
        final Cursor query = this.getReadableDatabase().query("search_suggestion_metadata", new String[] { "last_update" }, "type=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        if (query == null) {
            return -1L;
        }
        while (true) {
            try {
                if (query.moveToFirst()) {
                    return query.getLong(0);
                }
            }
            finally {
                query.close();
            }
            return -1L;
        }
    }
    
    public long d(final long n, final int n2) {
        final Cursor query = this.getReadableDatabase().query("status_groups_view", ch.a, "owner_id=? AND type=?", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, "preview_draft_id DESC, updated_at ASC, _id DESC", "1");
        if (query == null) {
            return 0L;
        }
        try {
            if (query.moveToFirst()) {
                return query.getLong(0);
            }
            return 0L;
        }
        finally {
            query.close();
        }
    }
    
    public long d(final String s) {
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        final String[] array = { "last_readable_event_id" };
        Label_0087: {
            if (s != null) {
                break Label_0087;
            }
            String s2 = null;
        Label_0030_Outer:
            while (true) {
                Label_0095: {
                    if (s != null) {
                        break Label_0095;
                    }
                    String[] array2 = null;
                    while (true) {
                        final Cursor query = readableDatabase.query("conversations", array, s2, array2, (String)null, (String)null, "last_readable_event_id DESC", "1");
                        if (query == null) {
                            return -1L;
                        }
                        try {
                            if (query.moveToNext()) {
                                return query.getLong(0);
                            }
                            return -1L;
                            s2 = "conversation_id=?";
                            continue Label_0030_Outer;
                            array2 = new String[] { s };
                            continue;
                        }
                        finally {
                            query.close();
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    public void d(final long n, final long n2, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String value = String.valueOf(n2);
            writableDatabase.delete("topics", "ev_type=5 AND ev_id=?", new String[] { value });
            writableDatabase.delete("list_mapping", "list_mapping_list_id=?", new String[] { value });
            final int delete = writableDatabase.delete("user_groups", "type=? AND tag=?", new String[] { String.valueOf(4), value });
            if (delete > 0) {
                a(writableDatabase, n, 4, 1, 0L);
            }
            final int delete2 = writableDatabase.delete("user_groups", "type=? AND tag=?", new String[] { String.valueOf(5), value });
            if (delete2 > 0) {
                a(writableDatabase, n, 5, 1, 0L);
            }
            final int delete3 = writableDatabase.delete("status_groups", "type=? AND tag=?", new String[] { String.valueOf(9), value });
            if (delete3 > 0) {
                a(writableDatabase, n, 9, 3, 0L);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (b != null) {
                if (delete3 > 0) {
                    b.a(bg.d);
                }
                if (delete + delete2 > 0) {
                    b.a(com.twitter.library.provider.be.b);
                }
                b.a(aq.a);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void d(final long n, final b b) {
        final Cursor query = this.getWritableDatabase().query(true, "status_groups", new String[] { "sender_id" }, "owner_id=? AND type IN (0,12,14,5,2,19) AND sender_id IN  (SELECT DISTINCT user_id FROM user_groups WHERE type=2)", new String[] { String.valueOf(n) }, "sender_id", (String)null, (String)null, (String)null);
        if (query == null) {
            return;
        }
        try {
            if (query.moveToFirst()) {
                do {
                    this.b(n, query.getLong(0), b);
                } while (query.moveToNext());
            }
        }
        finally {
            query.close();
        }
    }
    
    public void d(final String s, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final String[] array = { s };
            final int delete = writableDatabase.delete("conversation_entries", "conversation_id=?", array);
            final int delete2 = writableDatabase.delete("conversations", "conversation_id=?", array);
            final int delete3 = writableDatabase.delete("conversation_participants", "conversation_id=?", array);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (delete > 0 || delete2 > 0 || delete3 > 0) {
                this.a(Collections.singleton(s), b);
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void d(final String s, final boolean b, final b b2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("read_only", b);
        final String[] array = { s, null };
        String s2;
        if (b) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        array[1] = s2;
        if (writableDatabase.update("conversations", contentValues, "conversation_id=? AND read_only!=?", array) > 0 && b2 != null) {
            b2.a(Uri.withAppendedPath(com.twitter.library.provider.al.a, s));
        }
    }
    
    public int e(final int n) {
        final Cursor query = this.getReadableDatabase().query("activities", new String[] { "_id" }, "type=? AND tag=1", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
        if (query != null) {
            try {
                return query.getCount();
            }
            finally {
                query.close();
            }
        }
        return 0;
    }
    
    public int e(final long n) {
        final Cursor query = this.getReadableDatabase().query("users", new String[] { "friendship" }, "user_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null);
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
    
    public long e(final long n, final int n2) {
        final SQLiteDatabase readableDatabase = this.getReadableDatabase();
        Label_0103: {
            if (n2 != 19) {
                break Label_0103;
            }
            String s = "page DESC,_id DESC";
            while (true) {
                final Cursor query = readableDatabase.query("status_groups_view", ci.a, "owner_id=? AND type=?", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, s, "1");
                if (query == null) {
                    return 0L;
                }
                try {
                    if (query.moveToFirst()) {
                        return query.getLong(0);
                    }
                    return 0L;
                    s = "preview_draft_id DESC, updated_at ASC, _id DESC";
                    continue;
                }
                finally {
                    query.close();
                }
                break;
            }
        }
    }
    
    public Cursor e(final String s) {
        return this.getReadableDatabase().query("conversations", com.twitter.library.provider.bo.a, "conversation_id=?", new String[] { s }, (String)null, (String)null, (String)null, "1");
    }
    
    public void e() {
        this.b(true);
    }
    
    public void e(final long n, final long n2, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL("UPDATE timeline SET flags = flags & -67371009 WHERE entity_type = 1 AND owner_id=? AND type=? AND entity_id IN (SELECT status_id FROM statuses WHERE author_id = ?)", (Object[])new String[] { String.valueOf(n), String.valueOf(0), String.valueOf(n2) });
            writableDatabase.setTransactionSuccessful();
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void e(final long n, final b b) {
        while (true) {
            final SQLiteDatabase writableDatabase = this.getWritableDatabase();
            writableDatabase.beginTransaction();
            while (true) {
                String string;
                try {
                    final Cursor g = this.g(n);
                    string = null;
                    Label_0064: {
                        if (g == null) {
                            break Label_0064;
                        }
                        try {
                            final boolean moveToFirst = g.moveToFirst();
                            string = null;
                            if (moveToFirst) {
                                string = g.getString(1);
                            }
                            g.close();
                            writableDatabase.delete("conversation_entries", "entry_id=?", new String[] { String.valueOf(n) });
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            if (string == null) {
                                final Object o = Collections.emptySet();
                                this.a((Set)o, b);
                                return;
                            }
                        }
                        finally {
                            g.close();
                        }
                    }
                }
                finally {
                    writableDatabase.endTransaction();
                }
                final Object o = Collections.singleton(string);
                continue;
            }
        }
    }
    
    public void e(final String p0, final b p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //     4: astore_3       
        //     5: aload_3        
        //     6: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //     9: iconst_1       
        //    10: anewarray       Ljava/lang/String;
        //    13: dup            
        //    14: iconst_0       
        //    15: ldc_w           "story_order"
        //    18: aastore        
        //    19: astore          4
        //    21: iconst_1       
        //    22: anewarray       Ljava/lang/String;
        //    25: astore          6
        //    27: aload           6
        //    29: iconst_0       
        //    30: iconst_1       
        //    31: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    34: aastore        
        //    35: aload_3        
        //    36: ldc_w           "stories"
        //    39: aload           4
        //    41: ldc_w           "data_type=?"
        //    44: aload           6
        //    46: aconst_null    
        //    47: aconst_null    
        //    48: ldc_w           "story_order DESC"
        //    51: ldc_w           "1"
        //    54: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    57: astore          7
        //    59: aload           7
        //    61: ifnull          590
        //    64: aload           7
        //    66: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    71: ifeq            584
        //    74: aload           7
        //    76: iconst_0       
        //    77: invokeinterface android/database/Cursor.getInt:(I)I
        //    82: istore          34
        //    84: iload           34
        //    86: iconst_1       
        //    87: iadd           
        //    88: istore          8
        //    90: aload           7
        //    92: invokeinterface android/database/Cursor.close:()V
        //    97: iconst_2       
        //    98: anewarray       Ljava/lang/String;
        //   101: dup            
        //   102: iconst_0       
        //   103: ldc_w           "story_id"
        //   106: aastore        
        //   107: dup            
        //   108: iconst_1       
        //   109: ldc_w           "story_order"
        //   112: aastore        
        //   113: astore          9
        //   115: iconst_1       
        //   116: anewarray       Ljava/lang/String;
        //   119: astore          10
        //   121: aload           10
        //   123: iconst_0       
        //   124: iconst_1       
        //   125: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   128: aastore        
        //   129: aload_3        
        //   130: ldc_w           "stories"
        //   133: aload           9
        //   135: ldc_w           "data_type=?"
        //   138: aload           10
        //   140: aconst_null    
        //   141: aconst_null    
        //   142: ldc_w           "story_order DESC"
        //   145: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   148: astore          11
        //   150: new             Ljava/util/ArrayList;
        //   153: dup            
        //   154: invokespecial   java/util/ArrayList.<init>:()V
        //   157: astore          12
        //   159: iconst_0       
        //   160: istore          13
        //   162: aload           11
        //   164: ifnull          578
        //   167: aload           11
        //   169: invokeinterface android/database/Cursor.moveToNext:()Z
        //   174: ifeq            271
        //   177: aload           11
        //   179: iconst_0       
        //   180: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   185: astore          30
        //   187: aload           11
        //   189: iconst_1       
        //   190: invokeinterface android/database/Cursor.getInt:(I)I
        //   195: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   198: astore          31
        //   200: aload           30
        //   202: aload_1        
        //   203: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   206: ifeq            216
        //   209: aload           31
        //   211: invokevirtual   java/lang/Integer.intValue:()I
        //   214: istore          13
        //   216: aload           12
        //   218: new             Landroid/util/Pair;
        //   221: dup            
        //   222: aload           30
        //   224: aload           31
        //   226: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   229: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   234: pop            
        //   235: goto            167
        //   238: astore          29
        //   240: aload           11
        //   242: invokeinterface android/database/Cursor.close:()V
        //   247: aload           29
        //   249: athrow         
        //   250: astore          5
        //   252: aload_3        
        //   253: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   256: aload           5
        //   258: athrow         
        //   259: astore          33
        //   261: aload           7
        //   263: invokeinterface android/database/Cursor.close:()V
        //   268: aload           33
        //   270: athrow         
        //   271: aload           11
        //   273: invokeinterface android/database/Cursor.close:()V
        //   278: iload           13
        //   280: istore          14
        //   282: aload           12
        //   284: invokeinterface java/util/List.size:()I
        //   289: ifle            572
        //   292: new             Landroid/content/ContentValues;
        //   295: dup            
        //   296: iconst_1       
        //   297: invokespecial   android/content/ContentValues.<init>:(I)V
        //   300: astore          15
        //   302: new             Landroid/content/ContentValues;
        //   305: dup            
        //   306: iconst_1       
        //   307: invokespecial   android/content/ContentValues.<init>:(I)V
        //   310: astore          16
        //   312: aload           12
        //   314: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   319: astore          17
        //   321: iconst_0       
        //   322: istore          18
        //   324: aload           17
        //   326: invokeinterface java/util/Iterator.hasNext:()Z
        //   331: ifeq            596
        //   334: aload           17
        //   336: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   341: checkcast       Landroid/util/Pair;
        //   344: astore          21
        //   346: aload           21
        //   348: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   351: checkcast       Ljava/lang/String;
        //   354: astore          22
        //   356: aload           21
        //   358: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   361: checkcast       Ljava/lang/Integer;
        //   364: astore          23
        //   366: aload           23
        //   368: invokevirtual   java/lang/Integer.intValue:()I
        //   371: iload           14
        //   373: if_icmpne       513
        //   376: iload           8
        //   378: istore          24
        //   380: aload           15
        //   382: ldc_w           "story_order"
        //   385: iload           24
        //   387: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   390: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   393: aload           16
        //   395: ldc_w           "tag"
        //   398: iload           24
        //   400: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   403: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //   406: iload           18
        //   408: aload_3        
        //   409: ldc_w           "stories"
        //   412: aload           15
        //   414: ldc_w           "story_id=?"
        //   417: iconst_1       
        //   418: anewarray       Ljava/lang/String;
        //   421: dup            
        //   422: iconst_0       
        //   423: aload           22
        //   425: aastore        
        //   426: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   429: iadd           
        //   430: istore          18
        //   432: iconst_2       
        //   433: anewarray       Ljava/lang/String;
        //   436: astore          25
        //   438: aload           25
        //   440: iconst_0       
        //   441: bipush          29
        //   443: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   446: aastore        
        //   447: aload           25
        //   449: iconst_1       
        //   450: aload           23
        //   452: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   455: aastore        
        //   456: aload_3        
        //   457: ldc_w           "status_groups"
        //   460: aload           16
        //   462: ldc_w           "type=? AND tag=?"
        //   465: aload           25
        //   467: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   470: pop            
        //   471: iconst_2       
        //   472: anewarray       Ljava/lang/String;
        //   475: astore          27
        //   477: aload           27
        //   479: iconst_0       
        //   480: bipush          34
        //   482: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   485: aastore        
        //   486: aload           27
        //   488: iconst_1       
        //   489: aload           23
        //   491: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   494: aastore        
        //   495: aload_3        
        //   496: ldc_w           "user_groups"
        //   499: aload           16
        //   501: ldc_w           "type=? AND tag=?"
        //   504: aload           27
        //   506: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   509: pop            
        //   510: goto            324
        //   513: aload           23
        //   515: invokevirtual   java/lang/Integer.intValue:()I
        //   518: iload           14
        //   520: if_icmpge       324
        //   523: iconst_1       
        //   524: aload           23
        //   526: invokevirtual   java/lang/Integer.intValue:()I
        //   529: iadd           
        //   530: istore          24
        //   532: goto            380
        //   535: aload_3        
        //   536: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   539: aload_3        
        //   540: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   543: iload           19
        //   545: ifle            571
        //   548: aload_2        
        //   549: ifnull          571
        //   552: iconst_1       
        //   553: anewarray       Landroid/net/Uri;
        //   556: astore          20
        //   558: aload           20
        //   560: iconst_0       
        //   561: getstatic       com/twitter/library/provider/ba.a:Landroid/net/Uri;
        //   564: aastore        
        //   565: aload_2        
        //   566: aload           20
        //   568: invokevirtual   com/twitter/library/provider/b.a:([Landroid/net/Uri;)V
        //   571: return         
        //   572: iconst_0       
        //   573: istore          19
        //   575: goto            535
        //   578: iconst_0       
        //   579: istore          14
        //   581: goto            282
        //   584: iconst_0       
        //   585: istore          8
        //   587: goto            90
        //   590: iconst_0       
        //   591: istore          8
        //   593: goto            97
        //   596: iload           18
        //   598: istore          19
        //   600: goto            535
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      59     250    259    Any
        //  64     84     259    271    Any
        //  90     97     250    259    Any
        //  97     159    250    259    Any
        //  167    216    238    250    Any
        //  216    235    238    250    Any
        //  240    250    250    259    Any
        //  261    271    250    259    Any
        //  271    278    250    259    Any
        //  282    321    250    259    Any
        //  324    376    250    259    Any
        //  380    510    250    259    Any
        //  513    532    250    259    Any
        //  535    539    250    259    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
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
    
    public int f() {
        final Cursor query = this.getReadableDatabase().query("conversation_entries", new String[] { "COUNT(_id)" }, (String)null, (String[])null, (String)null, (String)null, (String)null);
        if (query == null) {
            return 0;
        }
        try {
            if (query.moveToNext()) {
                return query.getInt(0);
            }
            return 0;
        }
        finally {
            query.close();
        }
    }
    
    public int f(final long n, final int n2) {
        final Cursor query = this.getReadableDatabase().query("status_groups_view", ci.a, "owner_id=? AND type=? AND is_read=0", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, (String)null, (String)null);
        if (query != null) {
            try {
                return query.getCount();
            }
            finally {
                query.close();
            }
        }
        return 0;
    }
    
    public int f(final long n, final b b) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int a = this.a(writableDatabase, "timeline", "entity_id=?", new long[] { n });
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (a > 0 && b != null) {
                b.a(bc.b);
            }
            return a;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public void f(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: anewarray       Ljava/lang/String;
        //     4: astore_3       
        //     5: aload_3        
        //     6: iconst_0       
        //     7: lload_1        
        //     8: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    11: aastore        
        //    12: aload_0        
        //    13: invokevirtual   com/twitter/library/provider/bg.getWritableDatabase:()Landroid/database/sqlite/SQLiteDatabase;
        //    16: astore          4
        //    18: aload           4
        //    20: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    23: aload_0        
        //    24: getfield        com/twitter/library/provider/bg.i:Ljava/util/ArrayList;
        //    27: astore          6
        //    29: aload           6
        //    31: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    34: ifeq            161
        //    37: aload           4
        //    39: ldc_w           "search_results"
        //    42: aconst_null    
        //    43: aconst_null    
        //    44: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //    47: pop            
        //    48: aload           4
        //    50: ldc_w           "status_groups"
        //    53: ldc_w           "type IN (9,2,10,21,7) AND owner_id=?"
        //    56: aload_3        
        //    57: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //    60: pop            
        //    61: aload           4
        //    63: ldc             "timeline"
        //    65: ldc_w           "owner_id!=?"
        //    68: aload_3        
        //    69: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //    72: pop            
        //    73: aload           4
        //    75: ldc_w           "status_groups"
        //    78: ldc_w           "owner_id!=?"
        //    81: aload_3        
        //    82: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //    85: pop            
        //    86: aload           4
        //    88: ldc_w           "user_groups"
        //    91: ldc_w           "owner_id!=?"
        //    94: aload_3        
        //    95: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //    98: pop            
        //    99: getstatic       com/twitter/library/provider/bg.c:[I
        //   102: astore          18
        //   104: aload           18
        //   106: arraylength    
        //   107: istore          19
        //   109: iconst_0       
        //   110: istore          20
        //   112: iload           20
        //   114: iload           19
        //   116: if_icmpge       277
        //   119: aload           18
        //   121: iload           20
        //   123: iaload         
        //   124: istore          21
        //   126: iconst_1       
        //   127: anewarray       Ljava/lang/String;
        //   130: astore          22
        //   132: aload           22
        //   134: iconst_0       
        //   135: iload           21
        //   137: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   140: aastore        
        //   141: aload           4
        //   143: ldc_w           "user_groups"
        //   146: ldc_w           "type=?"
        //   149: aload           22
        //   151: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   154: pop            
        //   155: iinc            20, 1
        //   158: goto            112
        //   161: aload           6
        //   163: invokevirtual   java/util/ArrayList.size:()I
        //   166: istore          7
        //   168: iload           7
        //   170: anewarray       Ljava/lang/String;
        //   173: astore          8
        //   175: new             Ljava/lang/StringBuilder;
        //   178: dup            
        //   179: ldc_w           "search_id NOT IN (?"
        //   182: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   185: astore          9
        //   187: aload           8
        //   189: iconst_0       
        //   190: aload           6
        //   192: iconst_0       
        //   193: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   196: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   199: aastore        
        //   200: iconst_1       
        //   201: istore          10
        //   203: iload           10
        //   205: iload           7
        //   207: if_icmpge       240
        //   210: aload           9
        //   212: ldc_w           ",?"
        //   215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   218: pop            
        //   219: aload           8
        //   221: iload           10
        //   223: aload           6
        //   225: iload           10
        //   227: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   230: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   233: aastore        
        //   234: iinc            10, 1
        //   237: goto            203
        //   240: aload           9
        //   242: bipush          41
        //   244: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   247: pop            
        //   248: aload           4
        //   250: ldc_w           "search_results"
        //   253: aload           9
        //   255: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   258: aload           8
        //   260: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   263: pop            
        //   264: goto            48
        //   267: astore          5
        //   269: aload           4
        //   271: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   274: aload           5
        //   276: athrow         
        //   277: iconst_3       
        //   278: anewarray       Ljava/lang/String;
        //   281: astore          24
        //   283: aload           24
        //   285: iconst_0       
        //   286: bipush          9
        //   288: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   291: aastore        
        //   292: aload           24
        //   294: iconst_1       
        //   295: iconst_m1      
        //   296: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   299: aastore        
        //   300: aload           24
        //   302: iconst_2       
        //   303: iconst_2       
        //   304: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   307: aastore        
        //   308: aload           4
        //   310: ldc_w           "user_groups"
        //   313: ldc_w           "type=? AND tag=? AND user_id NOT IN (SELECT DISTINCT identifier FROM discover WHERE type=?)"
        //   316: aload           24
        //   318: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   321: pop            
        //   322: iconst_1       
        //   323: anewarray       Ljava/lang/String;
        //   326: astore          26
        //   328: aload           26
        //   330: iconst_0       
        //   331: bipush          7
        //   333: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   336: aastore        
        //   337: aload           4
        //   339: ldc_w           "search_queries"
        //   342: ldc_w           "type=?"
        //   345: aload           26
        //   347: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   350: pop            
        //   351: aload           4
        //   353: ldc_w           "cursors"
        //   356: ldc_w           "owner_id!=?"
        //   359: aload_3        
        //   360: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   363: pop            
        //   364: aload           4
        //   366: ldc_w           "topics"
        //   369: ldc_w           "ev_type=5 AND ev_owner_id!=?"
        //   372: aload_3        
        //   373: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   376: pop            
        //   377: iconst_4       
        //   378: newarray        I
        //   380: dup            
        //   381: iconst_0       
        //   382: iconst_0       
        //   383: iastore        
        //   384: dup            
        //   385: iconst_1       
        //   386: bipush          16
        //   388: iastore        
        //   389: dup            
        //   390: iconst_2       
        //   391: bipush          28
        //   393: iastore        
        //   394: dup            
        //   395: iconst_3       
        //   396: bipush          27
        //   398: iastore        
        //   399: astore          30
        //   401: aload           30
        //   403: arraylength    
        //   404: istore          31
        //   406: iconst_0       
        //   407: istore          32
        //   409: iload           32
        //   411: iload           31
        //   413: if_icmpge       756
        //   416: aload           30
        //   418: iload           32
        //   420: iaload         
        //   421: istore          33
        //   423: new             Ljava/lang/StringBuilder;
        //   426: dup            
        //   427: invokespecial   java/lang/StringBuilder.<init>:()V
        //   430: ldc_w           "type=? AND tag=? AND g_status_id NOT IN (SELECT DISTINCT data_id FROM timeline WHERE data_type=1 AND data_type_group="
        //   433: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   436: iload           33
        //   438: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   441: ldc             " AND "
        //   443: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   446: ldc_w           "data_type_tag"
        //   449: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   452: bipush          61
        //   454: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   457: iconst_m1      
        //   458: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   461: bipush          41
        //   463: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   466: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   469: astore          34
        //   471: iconst_2       
        //   472: anewarray       Ljava/lang/String;
        //   475: astore          35
        //   477: aload           35
        //   479: iconst_0       
        //   480: iload           33
        //   482: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   485: aastore        
        //   486: aload           35
        //   488: iconst_1       
        //   489: iconst_m1      
        //   490: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   493: aastore        
        //   494: aload           4
        //   496: ldc_w           "status_groups"
        //   499: aload           34
        //   501: aload           35
        //   503: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   506: pop            
        //   507: iconst_3       
        //   508: anewarray       Ljava/lang/String;
        //   511: dup            
        //   512: iconst_0       
        //   513: ldc_w           "tag"
        //   516: aastore        
        //   517: dup            
        //   518: iconst_1       
        //   519: ldc_w           "g_status_id"
        //   522: aastore        
        //   523: dup            
        //   524: iconst_2       
        //   525: ldc_w           "_id"
        //   528: aastore        
        //   529: astore          37
        //   531: iconst_1       
        //   532: anewarray       Ljava/lang/String;
        //   535: astore          38
        //   537: aload           38
        //   539: iconst_0       
        //   540: iload           33
        //   542: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   545: aastore        
        //   546: aload           4
        //   548: ldc_w           "status_groups"
        //   551: aload           37
        //   553: ldc_w           "type=? AND pc NOT NULL"
        //   556: aload           38
        //   558: aconst_null    
        //   559: aconst_null    
        //   560: aconst_null    
        //   561: aconst_null    
        //   562: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   565: astore          39
        //   567: aload           39
        //   569: ifnull          819
        //   572: iconst_4       
        //   573: anewarray       Ljava/lang/String;
        //   576: astore          40
        //   578: aload           40
        //   580: iconst_0       
        //   581: iconst_1       
        //   582: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   585: aastore        
        //   586: aload           40
        //   588: iconst_1       
        //   589: iload           33
        //   591: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   594: aastore        
        //   595: aload           39
        //   597: invokeinterface android/database/Cursor.moveToNext:()Z
        //   602: ifeq            746
        //   605: aload           40
        //   607: iconst_2       
        //   608: aload           39
        //   610: iconst_0       
        //   611: invokeinterface android/database/Cursor.getLong:(I)J
        //   616: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   619: aastore        
        //   620: aload           40
        //   622: iconst_3       
        //   623: aload           39
        //   625: iconst_1       
        //   626: invokeinterface android/database/Cursor.getLong:(I)J
        //   631: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   634: aastore        
        //   635: aload           4
        //   637: ldc             "timeline"
        //   639: iconst_1       
        //   640: anewarray       Ljava/lang/String;
        //   643: dup            
        //   644: iconst_0       
        //   645: ldc_w           "_id"
        //   648: aastore        
        //   649: ldc_w           "data_type=? AND data_type_group=? AND data_type_tag=? AND data_id=?"
        //   652: aload           40
        //   654: aconst_null    
        //   655: aconst_null    
        //   656: aconst_null    
        //   657: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   660: astore          42
        //   662: aload           42
        //   664: ifnull          595
        //   667: aload           42
        //   669: invokeinterface android/database/Cursor.getCount:()I
        //   674: ifne            712
        //   677: iconst_1       
        //   678: anewarray       Ljava/lang/String;
        //   681: astore          44
        //   683: aload           44
        //   685: iconst_0       
        //   686: aload           39
        //   688: iconst_2       
        //   689: invokeinterface android/database/Cursor.getLong:(I)J
        //   694: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   697: aastore        
        //   698: aload           4
        //   700: ldc_w           "status_groups"
        //   703: ldc_w           "_id=?"
        //   706: aload           44
        //   708: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   711: pop            
        //   712: aload           42
        //   714: invokeinterface android/database/Cursor.close:()V
        //   719: goto            595
        //   722: astore          41
        //   724: aload           39
        //   726: invokeinterface android/database/Cursor.close:()V
        //   731: aload           41
        //   733: athrow         
        //   734: astore          43
        //   736: aload           42
        //   738: invokeinterface android/database/Cursor.close:()V
        //   743: aload           43
        //   745: athrow         
        //   746: aload           39
        //   748: invokeinterface android/database/Cursor.close:()V
        //   753: goto            819
        //   756: aload           4
        //   758: ldc_w           "statuses"
        //   761: ldc_w           "status_id NOT IN (SELECT DISTINCT g_status_id FROM status_groups)"
        //   764: aconst_null    
        //   765: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   768: pop            
        //   769: aload           4
        //   771: ldc_w           "users"
        //   774: ldc_w           "user_id NOT IN (SELECT DISTINCT author_id FROM statuses) AND user_id NOT IN (SELECT DISTINCT sender_id FROM status_groups) AND user_id NOT IN (SELECT DISTINCT user_id FROM user_groups) AND user_id NOT IN (SELECT DISTINCT user_id FROM conversation_participants) AND user_id NOT IN (SELECT DISTINCT user_id FROM conversation_entries) AND user_id NOT IN (SELECT DISTINCT ev_owner_id FROM topics)"
        //   777: aconst_null    
        //   778: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   781: pop            
        //   782: aload           4
        //   784: ldc_w           "topics"
        //   787: ldc_w           "_id NOT IN (SELECT DISTINCT data_id FROM timeline WHERE (data_type=3 OR data_type=7)) AND _id NOT IN (SELECT DISTINCT data_id FROM search_results WHERE data_type=3)"
        //   790: aconst_null    
        //   791: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   794: pop            
        //   795: aload           4
        //   797: ldc_w           "category_timestamp"
        //   800: ldc_w           "cat_status_id NOT IN (SELECT DISTINCT status_id FROM statuses)"
        //   803: aconst_null    
        //   804: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   807: pop            
        //   808: aload           4
        //   810: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   813: aload           4
        //   815: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   818: return         
        //   819: iinc            32, 1
        //   822: goto            409
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  23     48     267    277    Any
        //  48     109    267    277    Any
        //  119    155    267    277    Any
        //  161    200    267    277    Any
        //  210    234    267    277    Any
        //  240    264    267    277    Any
        //  277    406    267    277    Any
        //  416    567    267    277    Any
        //  572    595    267    277    Any
        //  595    662    722    734    Any
        //  667    712    734    746    Any
        //  712    719    722    734    Any
        //  724    734    267    277    Any
        //  736    746    722    734    Any
        //  746    753    267    277    Any
        //  756    813    267    277    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0712:
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
    
    public boolean f(final String s) {
        final Cursor query = this.getReadableDatabase().query("conversations", com.twitter.library.provider.bn.a, "conversation_id=?", new String[] { s }, (String)null, (String)null, (String)null, (String)null);
        if (query == null) {
            return false;
        }
        try {
            if (query.moveToFirst()) {
                return query.getInt(0) > 0;
            }
            return false;
        }
        finally {
            query.close();
        }
    }
    
    public Cursor g(final long n) {
        return this.getReadableDatabase().query("conversation_entries", com.twitter.library.provider.bm.a, "entry_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, (String)null, (String)null);
    }
    
    public Set g() {
        final Cursor query = this.getReadableDatabase().query("stories", new String[] { "story_id" }, "story_is_read = ?", new String[] { String.valueOf(1) }, (String)null, (String)null, (String)null);
        final HashSet<String> set = new HashSet<String>();
        if (query != null) {
            try {
                while (query.moveToNext()) {
                    set.add(query.getString(0));
                }
            }
            finally {
                query.close();
            }
            query.close();
        }
        return set;
    }
    
    public void g(final long n, final int n2) {
        if (bg.b) {
            Log.d("DatabaseHelper", "deleteOldActivities: owner id: " + n + " type: " + n2);
        }
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        String[] array;
        int n3;
        try {
            array = new String[] { String.valueOf(n2) };
            final Cursor query = writableDatabase.query("activities", new String[] { "COUNT(*)" }, "type=?", array, (String)null, (String)null, (String)null);
            n3 = 0;
            Label_0138: {
                if (query == null) {
                    break Label_0138;
                }
                try {
                    int int1;
                    if (query.moveToFirst()) {
                        int1 = query.getInt(0);
                    }
                    else {
                        int1 = 0;
                    }
                    query.close();
                    n3 = int1;
                    if (bg.b) {
                        Log.d("DatabaseHelper", "deleteOldActivities: Have count: " + n3);
                    }
                    if (n3 <= 800) {
                        writableDatabase.setTransactionSuccessful();
                        return;
                    }
                }
                finally {
                    query.close();
                }
            }
        }
        finally {
            writableDatabase.endTransaction();
        }
        final Cursor query2 = writableDatabase.query("activities", bj.a, "type=?", array, (String)null, (String)null, "created_at ASC ", String.valueOf(1 + (n3 - 400)));
        Label_0362: {
            if (query2 == null) {
                break Label_0362;
            }
            try {
                long long1;
                if (query2.moveToLast()) {
                    long1 = query2.getLong(1);
                }
                else {
                    long1 = 0L;
                }
                if (long1 > 0L) {
                    final int delete = writableDatabase.delete("activities", "type=? AND created_at<=?", new String[] { String.valueOf(n2), String.valueOf(long1) });
                    if (bg.b) {
                        Log.d("DatabaseHelper", "deleteOldActivities: Deleted activities " + delete);
                    }
                }
                query2.close();
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            finally {
                query2.close();
            }
        }
    }
    
    public c[] g(final String s) {
        return this.f("type=13 AND aggregation_data=?", new String[] { s });
    }
    
    public SQLiteDatabase getReadableDatabase() {
        synchronized (this) {
            try {
                return super.getReadableDatabase();
            }
            catch (SQLiteDatabaseCorruptException ex) {
                this.a(ex);
                return super.getReadableDatabase();
            }
        }
    }
    
    public SQLiteDatabase getWritableDatabase() {
        synchronized (this) {
            try {
                return super.getWritableDatabase();
            }
            catch (SQLiteDatabaseCorruptException ex) {
                this.a(ex);
                return super.getWritableDatabase();
            }
        }
    }
    
    public int h(final long n, final int n2) {
        final SQLiteDatabase writableDatabase = this.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            final int delete = writableDatabase.delete("activities", "type=" + n2 + " AND " + "event" + "=" + 8 + " AND " + "max_position" + "=?", new String[] { String.valueOf(n) });
            writableDatabase.setTransactionSuccessful();
            return delete;
        }
        finally {
            writableDatabase.endTransaction();
        }
    }
    
    public long h(final long n) {
        final Cursor query = this.getReadableDatabase().query("lists_view", bt.a, "list_mapping_user_id=?", new String[] { String.valueOf(n) }, (String)null, (String)null, "ev_query DESC", "1");
        if (query == null) {
            return 0L;
        }
        try {
            if (query.moveToFirst()) {
                return query.getLong(0);
            }
            return 0L;
        }
        finally {
            query.close();
        }
    }
    
    public ReferralCampaign h(final String s) {
        final Cursor query = this.getReadableDatabase().query("referral_campaigns", bz.a, "id=?", new String[] { String.valueOf(s) }, (String)null, (String)null, (String)null);
        ReferralCampaign referralCampaign = null;
        if (query == null) {
            return referralCampaign;
        }
        try {
            if (query.moveToFirst()) {
                referralCampaign = new ReferralCampaign();
                referralCampaign.a(query.getString(1));
                referralCampaign.b(query.getLong(2));
                referralCampaign.a(query.getLong(3));
                referralCampaign.b(query.getString(4));
                referralCampaign.c(query.getString(5));
                return referralCampaign;
            }
            return null;
        }
        finally {
            query.close();
        }
    }
    
    public c[] h() {
        return this.j("type IN(4,3,5,2,12,6)");
    }
    
    long i(final long n, final int n2) {
        final Cursor query = this.getReadableDatabase().query("timeline", new String[] { "MAX(sort_index)" }, "owner_id=? AND type=?", new String[] { String.valueOf(n), String.valueOf(n2) }, (String)null, (String)null, (String)null);
        if (query == null) {
            return 0L;
        }
        while (true) {
            try {
                if (query.moveToFirst()) {
                    return query.getLong(0);
                }
            }
            finally {
                query.close();
            }
            return 0L;
        }
    }
    
    public void i(final long n) {
        synchronized (this) {
            this.i.add(n);
        }
    }
    
    public c[] i() {
        return this.j("type=1 ");
    }
    
    public void j(final long n) {
        synchronized (this) {
            this.i.remove(n);
        }
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        int i = 0;
        final String[] k = k();
        for (int length = k.length, j = 0; j < length; ++j) {
            sqLiteDatabase.execSQL(k[j]);
        }
        final String[] l = l();
        for (int length2 = l.length, n = 0; n < length2; ++n) {
            sqLiteDatabase.execSQL(l[n]);
        }
        final String[] m = m();
        for (int length3 = m.length, n2 = 0; n2 < length3; ++n2) {
            sqLiteDatabase.execSQL(m[n2]);
        }
        for (String[] n3 = n(); i < n3.length; ++i) {
            sqLiteDatabase.execSQL(n3[i]);
        }
        this.b(sqLiteDatabase);
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        final HashMap hashMap = new HashMap();
        a(new TwitterDatabaseHelperMigration(sqLiteDatabase, hashMap, this.h), n, 24);
        b(sqLiteDatabase, hashMap);
    }
}
