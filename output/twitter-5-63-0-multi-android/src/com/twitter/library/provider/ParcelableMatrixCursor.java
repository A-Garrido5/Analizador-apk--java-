// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.database.CursorIndexOutOfBoundsException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.database.AbstractCursor;

public class ParcelableMatrixCursor extends AbstractCursor implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final String[] a;
    private Object[] b;
    private int c;
    private final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new v();
    }
    
    public ParcelableMatrixCursor(final Parcel parcel) {
        this.c = 0;
        this.d = parcel.readInt();
        parcel.readStringArray(this.a = new String[this.d]);
        this.c = parcel.readInt();
        this.b = parcel.readArray(this.getClass().getClassLoader());
    }
    
    public ParcelableMatrixCursor(final String[] array) {
        this(array, 16);
    }
    
    public ParcelableMatrixCursor(final String[] a, int n) {
        this.c = 0;
        this.a = a;
        this.d = a.length;
        if (n < 1) {
            n = 1;
        }
        this.b = new Object[n * this.d];
    }
    
    private Object a(final int n) {
        if (n < 0 || n >= this.d) {
            throw new CursorIndexOutOfBoundsException("Requested column: " + n + ", # of columns: " + this.d);
        }
        if (this.mPos < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        }
        if (this.mPos >= this.c) {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
        return this.b[n + this.mPos * this.d];
    }
    
    private void b(int n) {
        if (n > this.b.length) {
            final Object[] b = this.b;
            final int n2 = 2 * this.b.length;
            if (n2 >= n) {
                n = n2;
            }
            System.arraycopy(b, 0, this.b = new Object[n], 0, b.length);
        }
    }
    
    public w a() {
        ++this.c;
        final int n = this.c * this.d;
        this.b(n);
        return new w(this, n - this.d, n);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public byte[] getBlob(final int n) {
        return (byte[])this.a(n);
    }
    
    public String[] getColumnNames() {
        return this.a;
    }
    
    public int getCount() {
        return this.c;
    }
    
    public double getDouble(final int n) {
        final Object a = this.a(n);
        if (a == null) {
            return 0.0;
        }
        if (a instanceof Number) {
            return ((Number)a).doubleValue();
        }
        return Double.parseDouble(a.toString());
    }
    
    public float getFloat(final int n) {
        final Object a = this.a(n);
        if (a == null) {
            return 0.0f;
        }
        if (a instanceof Number) {
            return ((Number)a).floatValue();
        }
        return Float.parseFloat(a.toString());
    }
    
    public int getInt(final int n) {
        final Object a = this.a(n);
        if (a == null) {
            return 0;
        }
        if (a instanceof Number) {
            return ((Number)a).intValue();
        }
        return Integer.parseInt(a.toString());
    }
    
    public long getLong(final int n) {
        final Object a = this.a(n);
        if (a == null) {
            return 0L;
        }
        if (a instanceof Number) {
            return ((Number)a).longValue();
        }
        return Long.parseLong(a.toString());
    }
    
    public short getShort(final int n) {
        final Object a = this.a(n);
        if (a == null) {
            return 0;
        }
        if (a instanceof Number) {
            return ((Number)a).shortValue();
        }
        return Short.parseShort(a.toString());
    }
    
    public String getString(final int n) {
        final Object a = this.a(n);
        if (a == null) {
            return null;
        }
        return a.toString();
    }
    
    public int getType(final int n) {
        return 0;
    }
    
    public boolean isNull(final int n) {
        return this.a(n) == null;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.d);
        parcel.writeStringArray(this.a);
        parcel.writeInt(this.c);
        parcel.writeArray(this.b);
    }
}
