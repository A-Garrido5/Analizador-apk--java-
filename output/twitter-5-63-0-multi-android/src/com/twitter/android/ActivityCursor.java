// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.ContentResolver;
import android.database.DataSetObserver;
import android.database.ContentObserver;
import android.annotation.TargetApi;
import android.os.Bundle;
import android.database.CharArrayBuffer;
import com.twitter.library.provider.ad;
import com.twitter.library.provider.bg;
import com.twitter.library.provider.ay;
import com.twitter.library.provider.be;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.twitter.util.f;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.api.TwitterUser;
import com.twitter.errorreporter.ErrorReporter;
import java.util.Map;
import com.twitter.library.provider.Tweet;
import java.util.Collection;
import com.twitter.library.provider.cw;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import android.database.Cursor;

public class ActivityCursor implements Cursor
{
    private final Context a;
    private final Cursor b;
    private final long c;
    private final int d;
    private final int e;
    private final boolean f;
    private final HashSet g;
    private final HashSet h;
    private final HashSet i;
    private final HashSet j;
    private final HashSet k;
    private final HashSet l;
    private Cursor[] m;
    private HashMap[] n;
    private Cursor[] o;
    private HashMap[] p;
    private Cursor[] q;
    private HashMap[] r;
    private HashSet s;
    private HashSet t;
    private HashSet u;
    private ArrayList v;
    private int w;
    
    ActivityCursor(final Cursor b, final long c, final Context a, final int d, final int e, final boolean f) {
        this.g = new HashSet();
        this.h = new HashSet();
        this.i = new HashSet();
        this.j = new HashSet();
        this.k = new HashSet();
        this.l = new HashSet();
        this.s = new HashSet();
        this.t = new HashSet();
        this.u = new HashSet();
        this.w = -1;
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.c();
    }
    
    private static Cursor a(final long n, final Cursor cursor, final HashMap hashMap) {
        if (hashMap.containsKey(n) && cursor.moveToPosition((int)hashMap.get(n))) {
            return cursor;
        }
        return null;
    }
    
    private Cursor a(final Uri uri, final HashMap hashMap, final HashSet set) {
        final Cursor a = this.a(ae.a(ContentUris.withAppendedId(uri, this.c), this.c), cw.e, "owner_id=" + this.c + " AND " + this.a("user_id", set));
        if (a.moveToFirst()) {
            do {
                hashMap.put(a.getLong(2), a.getPosition());
            } while (a.moveToNext());
        }
        if (set.size() != hashMap.size()) {
            final HashSet set2 = new HashSet(set);
            set2.removeAll(hashMap.keySet());
            this.s.addAll(set2);
        }
        return a;
    }
    
    private Cursor a(final Uri uri, final HashMap hashMap, final HashSet set, final String s, final int n, final HashSet set2, final boolean b) {
        final Uri a = ae.a(ContentUris.withAppendedId(uri, this.c), this.c);
        final String string = "owner_id=" + this.c + " AND " + this.a(s, set);
        final HashMap<Long, Integer> hashMap2 = new HashMap<Long, Integer>();
        final Cursor a2 = this.a(a, Tweet.b, string);
        Label_0130: {
            if (!a2.moveToFirst()) {
                break Label_0130;
            }
            try {
                do {
                    hashMap2.put(a2.getLong(n), a2.getPosition());
                } while (a2.moveToNext());
                hashMap.putAll(hashMap2);
                if (set.size() != hashMap.size()) {
                    final HashSet set3 = new HashSet(set);
                    set3.removeAll(hashMap.keySet());
                    set2.addAll(set3);
                }
                return a2;
            }
            catch (IllegalStateException ex) {
                a2.close();
                if (!this.f && b) {
                    ErrorReporter.a(ex);
                    return this.a(uri, hashMap, set, s, n, set2, false);
                }
                throw ex;
            }
        }
    }
    
    private Cursor a(final Uri uri, final String[] array, final String s) {
        return this.a.getContentResolver().query(uri, array, s, (String[])null, (String)null);
    }
    
    public static TwitterUser a(final Cursor cursor) {
        final TwitterUser twitterUser = new TwitterUser();
        twitterUser.userId = cursor.getLong(2);
        twitterUser.username = cursor.getString(4);
        twitterUser.name = cursor.getString(3);
        twitterUser.profileImageUrl = cursor.getString(5);
        twitterUser.profileDescription = cursor.getString(8);
        twitterUser.descriptionEntities = (TweetEntities)f.a(cursor.getBlob(9));
        twitterUser.friendship = cursor.getInt(7);
        return twitterUser;
    }
    
    private String a(final String s, final HashSet set) {
        final StringBuilder sb = new StringBuilder(20 * set.size());
        sb.append(s).append(" IN (");
        final int size = set.size();
        final Iterator<Long> iterator = set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (n != size - 1) {
                sb.append(",");
            }
            ++n;
        }
        sb.append(")");
        return sb.toString();
    }
    
    private void a(final Cursor cursor, final int n, final HashSet set, final int n2) {
        int i = 0;
        final byte[] blob = cursor.getBlob(n);
        final int min = Math.min(n2, blob.length / 8);
        final ByteBuffer wrap = ByteBuffer.wrap(blob, 0, min * 8);
        while (i < min) {
            set.add(wrap.getLong());
            ++i;
        }
    }
    
    private void a(final Cursor cursor, final HashSet set, final HashSet set2, final HashSet set3, final HashSet set4, final HashSet set5) {
        switch (cursor.getInt(1)) {
            default: {}
            case 2:
            case 4: {
                this.a(cursor, 5, set, this.d);
                this.a(cursor, 11, set4, this.d);
            }
            case 5:
            case 6:
            case 13: {
                this.a(cursor, 5, set, this.e);
                this.a(this.b, 8, set2, this.e);
            }
            case 1:
            case 3:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20: {
                this.a(cursor, 5, set, this.e);
                this.a(cursor, 8, set3, this.d);
            }
            case 19: {
                this.a(cursor, 5, set, this.e);
                this.a(cursor, 8, set2, this.e);
            }
            case 9:
            case 10: {
                this.a(cursor, 5, set, this.e);
                this.a(cursor, 8, set5, this.d);
            }
        }
    }
    
    private void b() {
        if (this.a()) {
            this.v = new ArrayList();
            final HashSet set = new HashSet();
            final HashSet set2 = new HashSet();
            final HashSet set3 = new HashSet();
            if (this.b.moveToFirst()) {
                do {
                    set.clear();
                    set2.clear();
                    set3.clear();
                    this.a(this.b, set, set, set2, set2, set3);
                    set.retainAll(this.s);
                    set2.retainAll(this.t);
                    set3.retainAll(this.u);
                    if (set.isEmpty() && set2.isEmpty() && set3.isEmpty()) {
                        this.v.add(this.b.getPosition());
                    }
                } while (this.b.moveToNext());
            }
            return;
        }
        this.v = null;
    }
    
    private void c() {
        this.d();
        this.e();
        if (this.b.moveToFirst()) {
            do {
                this.a(this.b, this.g, this.h, this.i, this.j, this.k);
            } while (this.b.moveToNext());
        }
        this.q = new Cursor[3];
        this.r = new HashMap[3];
        this.m = new Cursor[3];
        this.n = new HashMap[3];
        this.o = new Cursor[3];
        this.p = new HashMap[3];
        final int ordinal = ActivityCursor$ObjectField.a.ordinal();
        final int ordinal2 = ActivityCursor$ObjectField.b.ordinal();
        final int ordinal3 = ActivityCursor$ObjectField.c.ordinal();
        this.r[ordinal] = new HashMap();
        this.q[ordinal] = this.a(be.a, this.r[ordinal], this.g);
        this.r[ordinal2] = new HashMap();
        this.q[ordinal2] = this.a(be.a, this.r[ordinal2], this.h);
        this.n[ordinal2] = new HashMap();
        this.m[ordinal2] = this.a(ay.d, this.n[ordinal2], this.i, "g_status_id", 1, this.t, true);
        this.p[ordinal2] = new HashMap();
        this.o[ordinal2] = this.a(ay.d, this.p[ordinal2], this.k, "ref_id", 21, this.u, true);
        this.n[ordinal3] = new HashMap();
        this.m[ordinal3] = this.a(ay.d, this.n[ordinal3], this.j, "g_status_id", 1, this.t, true);
        this.p[ordinal3] = new HashMap();
        this.o[ordinal3] = this.a(ay.d, this.p[ordinal3], this.l, "ref_id", 21, this.u, true);
        this.b();
        this.moveToPosition(-1);
    }
    
    private void d() {
        int i = 0;
        if (this.q != null) {
            for (final Cursor cursor : this.q) {
                if (cursor != null) {
                    cursor.close();
                }
            }
            this.q = null;
        }
        if (this.m != null) {
            for (final Cursor cursor2 : this.m) {
                if (cursor2 != null) {
                    cursor2.close();
                }
            }
            this.m = null;
        }
        if (this.o != null) {
            for (Cursor[] o = this.o; i < o.length; ++i) {
                final Cursor cursor3 = o[i];
                if (cursor3 != null) {
                    cursor3.close();
                }
            }
        }
        this.r = null;
        this.n = null;
        this.p = null;
    }
    
    private void e() {
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.k.clear();
        this.j.clear();
        this.t.clear();
        this.u.clear();
        this.s.clear();
    }
    
    public ArrayList a(final ActivityCursor$ObjectField activityCursor$ObjectField, final byte[] array) {
        final long[] a = bg.a(array, this.e);
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        for (int length = a.length, i = 0; i < length; ++i) {
            final Cursor a2 = a(a[i], this.q[activityCursor$ObjectField.ordinal()], this.r[activityCursor$ObjectField.ordinal()]);
            if (a2 != null) {
                list.add(a(a2));
            }
        }
        return list;
    }
    
    public ArrayList a(final ActivityCursor$ObjectField activityCursor$ObjectField, final byte[] array, final ActivityCursor$IdType activityCursor$IdType) {
        final long[] a = bg.a(array, this.d);
        final ArrayList<Tweet> list = new ArrayList<Tweet>();
        final int ordinal = activityCursor$ObjectField.ordinal();
        Cursor cursor = null;
        HashMap hashMap = null;
        switch (com.twitter.android.w.a[activityCursor$IdType.ordinal()]) {
            default: {
                cursor = this.m[ordinal];
                hashMap = this.n[ordinal];
                break;
            }
            case 1: {
                cursor = this.o[ordinal];
                hashMap = this.p[ordinal];
                break;
            }
        }
        for (int length = a.length, i = 0; i < length; ++i) {
            final Cursor a2 = a(a[i], cursor, hashMap);
            if (a2 != null) {
                list.add(new ad(a2).a());
            }
        }
        return list;
    }
    
    public boolean a() {
        return this.s.size() > 0 || this.t.size() > 0 || this.u.size() > 0;
    }
    
    public void close() {
        this.d();
        this.b.close();
    }
    
    public void copyStringToBuffer(final int n, final CharArrayBuffer charArrayBuffer) {
        this.b.copyStringToBuffer(n, charArrayBuffer);
    }
    
    @Deprecated
    public void deactivate() {
        this.b.deactivate();
    }
    
    public byte[] getBlob(final int n) {
        return this.b.getBlob(n);
    }
    
    public int getColumnCount() {
        return this.b.getColumnCount();
    }
    
    public int getColumnIndex(final String s) {
        return this.b.getColumnIndex(s);
    }
    
    public int getColumnIndexOrThrow(final String s) {
        return this.b.getColumnIndexOrThrow(s);
    }
    
    public String getColumnName(final int n) {
        return this.b.getColumnName(n);
    }
    
    public String[] getColumnNames() {
        return this.b.getColumnNames();
    }
    
    public int getCount() {
        if (this.v != null) {
            return this.v.size();
        }
        return this.b.getCount();
    }
    
    public double getDouble(final int n) {
        return this.b.getDouble(n);
    }
    
    public Bundle getExtras() {
        return this.b.getExtras();
    }
    
    public float getFloat(final int n) {
        return this.b.getFloat(n);
    }
    
    public int getInt(final int n) {
        return this.b.getInt(n);
    }
    
    public long getLong(final int n) {
        return this.b.getLong(n);
    }
    
    @TargetApi(19)
    public Uri getNotificationUri() {
        return this.b.getNotificationUri();
    }
    
    public int getPosition() {
        return this.w;
    }
    
    public short getShort(final int n) {
        return this.b.getShort(n);
    }
    
    public String getString(final int n) {
        return this.b.getString(n);
    }
    
    public int getType(final int n) {
        return this.b.getType(n);
    }
    
    public boolean getWantsAllOnMoveCalls() {
        return this.b.getWantsAllOnMoveCalls();
    }
    
    public final boolean isAfterLast() {
        return this.getCount() == 0 || this.w == this.getCount();
    }
    
    public final boolean isBeforeFirst() {
        return this.getCount() == 0 || this.w == -1;
    }
    
    public boolean isClosed() {
        return this.b.isClosed();
    }
    
    public final boolean isFirst() {
        return this.w == 0 && this.getCount() != 0;
    }
    
    public final boolean isLast() {
        final int count = this.getCount();
        return this.w == count - 1 && count != 0;
    }
    
    public boolean isNull(final int n) {
        return this.b.isNull(n);
    }
    
    public boolean move(final int n) {
        return this.moveToPosition(n + this.w);
    }
    
    public boolean moveToFirst() {
        return this.moveToPosition(0);
    }
    
    public boolean moveToLast() {
        return this.moveToPosition(-1 + this.getCount());
    }
    
    public boolean moveToNext() {
        return this.moveToPosition(1 + this.w);
    }
    
    public boolean moveToPosition(final int w) {
        boolean moveToPosition = false;
        final int count = this.getCount();
        if (w >= count) {
            this.w = count;
        }
        else {
            if (w < 0) {
                this.w = -1;
                return false;
            }
            int intValue;
            if (this.v != null) {
                intValue = this.v.get(w);
            }
            else {
                intValue = w;
            }
            moveToPosition = this.b.moveToPosition(intValue);
            if (moveToPosition) {
                this.w = w;
                return moveToPosition;
            }
        }
        return moveToPosition;
    }
    
    public boolean moveToPrevious() {
        return this.moveToPosition(-1 + this.w);
    }
    
    public void registerContentObserver(final ContentObserver contentObserver) {
        this.b.registerContentObserver(contentObserver);
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        this.b.registerDataSetObserver(dataSetObserver);
    }
    
    @Deprecated
    public boolean requery() {
        final boolean requery = this.b.requery();
        if (requery) {
            this.c();
        }
        return requery;
    }
    
    public Bundle respond(final Bundle bundle) {
        return this.b.respond(bundle);
    }
    
    public void setNotificationUri(final ContentResolver contentResolver, final Uri uri) {
        this.b.setNotificationUri(contentResolver, uri);
    }
    
    public void unregisterContentObserver(final ContentObserver contentObserver) {
        this.b.unregisterContentObserver(contentObserver);
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        this.b.unregisterDataSetObserver(dataSetObserver);
    }
}
