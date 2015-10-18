// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;

public class w
{
    final /* synthetic */ ParcelableMatrixCursor a;
    private int b;
    private final int c;
    
    w(final ParcelableMatrixCursor a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public w a(final Object o) {
        if (this.b == this.c) {
            throw new CursorIndexOutOfBoundsException("No more columns left.");
        }
        this.a.b[this.b++] = o;
        return this;
    }
}
