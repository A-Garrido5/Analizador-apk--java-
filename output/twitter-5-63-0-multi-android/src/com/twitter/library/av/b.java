// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.api.PromotedContent;
import java.util.LinkedList;
import java.util.Iterator;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import android.database.Cursor;
import android.content.Context;
import java.util.HashMap;

public class b implements h
{
    private static int a;
    private final f b;
    private int c;
    private int d;
    private int e;
    private long f;
    private final HashMap g;
    private int h;
    
    static {
        b.a = 12;
    }
    
    public b(final Context context) {
        this(com.twitter.library.av.f.a(context));
    }
    
    public b(final f b) {
        this.c = com.twitter.library.av.b.a;
        this.f = 30000L;
        this.g = new HashMap(256);
        (this.b = b).a(this);
        this.d = 1;
        this.e = 26;
        this.h = 25;
    }
    
    private void a(final int n, final Cursor cursor, final Map map, final List list) {
        if (n < cursor.getCount() && n >= 0) {
            cursor.moveToPosition(n);
            final long a = this.a(cursor);
            if (!this.a(a) && this.c(cursor)) {
                list.add(new a(a, this.b(cursor)));
                map.put(a, SystemClock.elapsedRealtime());
            }
        }
    }
    
    private void a(final List list) {
        final Iterator<a> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.g.remove(iterator.next().a);
        }
    }
    
    private boolean a(final long n) {
        final Long n2 = this.g.get(n);
        return n2 != null && SystemClock.elapsedRealtime() - n2 < this.f;
    }
    
    private void c() {
        final Iterator<Map.Entry<K, Long>> iterator = this.g.entrySet().iterator();
        while (iterator.hasNext()) {
            if (SystemClock.elapsedRealtime() - iterator.next().getValue() > this.f) {
                iterator.remove();
            }
        }
    }
    
    private boolean d(final Cursor cursor) {
        return !cursor.isClosed() && cursor.getColumnCount() > Math.max(this.h, Math.max(this.d, this.e)) && cursor.getColumnName(this.h).equals("flags") && cursor.getColumnName(this.d).equals("g_status_id") && cursor.getColumnName(this.e).equals("pc");
    }
    
    long a(final Cursor cursor) {
        try {
            return cursor.getLong(this.d);
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    public void a() {
        this.b.b(this);
    }
    
    @Override
    public void a(final long n, final mc mc) {
    }
    
    public void a(final Cursor cursor, final int n) {
        if (!this.d(cursor)) {
            return;
        }
        SystemClock.elapsedRealtime();
        final LinkedList list = new LinkedList();
        final int position = cursor.getPosition();
        this.a(this.b.a());
        this.a(n, cursor, this.g, list);
        for (int i = 1; i <= this.c; ++i) {
            this.a(n + i, cursor, this.g, list);
            this.a(n - i, cursor, this.g, list);
        }
        cursor.moveToPosition(position);
        this.c();
        this.b.a(list);
    }
    
    @Override
    public void aA_() {
        this.g.clear();
    }
    
    PromotedContent b(final Cursor cursor) {
        final byte[] blob = cursor.getBlob(this.e);
        PromotedContent promotedContent;
        if (blob == null) {
            promotedContent = null;
        }
        else {
            try {
                promotedContent = (PromotedContent)com.twitter.util.f.a(blob);
            }
            catch (ClassCastException ex) {
                return null;
            }
        }
        return promotedContent;
    }
    
    boolean c(final Cursor cursor) {
        return (0x1000 & cursor.getInt(this.h)) != 0x0;
    }
}
