// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.database.DataSetObserver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWrapper;

public class z extends CursorWrapper
{
    private final Cursor a;
    private final int b;
    private final int c;
    
    public z(final Cursor a, final int b, final int c) {
        super(a);
        if (a == null) {
            throw new IllegalArgumentException("Cursor cannot be null.");
        }
        if (c < b) {
            throw new IllegalArgumentException("End position must be greater than or equal start.");
        }
        if (b < 0) {
            throw new IllegalArgumentException("Start position must be greater than or equal 0.");
        }
        if (c >= a.getCount()) {
            throw new IllegalArgumentException("End position must be less than size.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.c;
    }
    
    public int b() {
        return this.b;
    }
    
    public void close() {
    }
    
    public void deactivate() {
    }
    
    public int getCount() {
        return 1 + (this.c - this.b);
    }
    
    public int getPosition() {
        return this.a.getPosition() - this.b;
    }
    
    public boolean isAfterLast() {
        return this.a.getPosition() > this.c;
    }
    
    public boolean isBeforeFirst() {
        return this.a.getPosition() < this.b;
    }
    
    public boolean isClosed() {
        return this.a.isClosed();
    }
    
    public boolean isFirst() {
        return this.a.getPosition() == this.b;
    }
    
    public boolean isLast() {
        return this.a.getPosition() == this.c;
    }
    
    public boolean moveToFirst() {
        return this.a.moveToPosition(this.b);
    }
    
    public boolean moveToLast() {
        return this.a.moveToPosition(this.c);
    }
    
    public boolean moveToNext() {
        return this.a.moveToNext() && !this.isAfterLast();
    }
    
    public boolean moveToPosition(final int n) {
        return this.a.moveToPosition(n + this.b);
    }
    
    public boolean moveToPrevious() {
        return this.a.moveToPrevious() && !this.isBeforeFirst();
    }
    
    public void registerContentObserver(final ContentObserver contentObserver) {
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
    }
    
    public boolean requery() {
        return true;
    }
    
    public void unregisterContentObserver(final ContentObserver contentObserver) {
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
    }
}
