// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.database.ContentObservable;
import android.database.Cursor;
import java.util.List;
import android.database.CursorWrapper;

public abstract class r extends CursorWrapper
{
    protected final t a;
    protected final int b;
    protected List c;
    protected int d;
    protected Cursor e;
    volatile boolean f;
    volatile boolean g;
    volatile boolean h;
    private final ContentObservable i;
    
    public r(final Cursor cursor) {
        this(cursor, 400);
    }
    
    public r(final Cursor e, final int b) {
        super(e);
        this.d = -1;
        if (b <= 0) {
            throw new IllegalArgumentException("Limit must be greater than 0");
        }
        this.a = new t(this);
        this.i = new ContentObservable();
        this.e = e;
        this.b = b;
        if (e != null && !e.isClosed()) {
            e.registerDataSetObserver((DataSetObserver)new u(this));
            e.registerContentObserver((ContentObserver)new s(this));
        }
    }
    
    public static Cursor a(final Cursor cursor) {
        Cursor wrappedCursor;
        for (wrappedCursor = cursor; wrappedCursor instanceof CursorWrapper; wrappedCursor = ((CursorWrapper)wrappedCursor).getWrappedCursor()) {}
        return wrappedCursor;
    }
    
    public abstract void a();
    
    public final void b() {
        this.f = true;
        this.a();
        this.f = false;
        if (this.g) {
            this.g = false;
            this.i.dispatchChange(this.h);
        }
    }
    
    public Object c() {
        if (this.c == null) {
            return null;
        }
        return this.c.get(this.d);
    }
    
    public int getCount() {
        if (this.c != null) {
            return this.c.size();
        }
        return 0;
    }
    
    public int getPosition() {
        return this.d;
    }
    
    public boolean moveToFirst() {
        return this.moveToPosition(0);
    }
    
    public boolean moveToLast() {
        return this.moveToPosition(-1 + this.c.size());
    }
    
    public boolean moveToNext() {
        return this.moveToPosition(1 + this.d);
    }
    
    public boolean moveToPosition(final int d) {
        final int count = this.getCount();
        if (d <= -1) {
            this.d = -1;
            return false;
        }
        if (d >= count) {
            this.d = count;
            return false;
        }
        this.d = d;
        return true;
    }
    
    public boolean moveToPrevious() {
        return this.moveToPosition(-1 + this.d);
    }
    
    public void registerContentObserver(final ContentObserver contentObserver) {
        this.i.registerObserver(contentObserver);
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        this.a.registerObserver((Object)dataSetObserver);
    }
    
    public boolean requery() {
        final t a = this.a;
        a.a(false);
        final boolean closed = this.e.isClosed();
        boolean b = false;
        if (!closed) {
            final boolean requery = this.e.requery();
            b = false;
            if (requery) {
                b = true;
            }
        }
        this.b();
        a.a(true);
        a.notifyChanged();
        return b;
    }
    
    public void unregisterContentObserver(final ContentObserver contentObserver) {
        this.i.unregisterObserver((Object)contentObserver);
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        this.a.unregisterObserver((Object)dataSetObserver);
    }
}
