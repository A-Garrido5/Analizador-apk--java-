// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public abstract class ClassLoaderSavedState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final ClassLoaderSavedState a;
    private Parcelable b;
    private ClassLoader c;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
        a = new ClassLoaderSavedState$2();
    }
    
    private ClassLoaderSavedState() {
        this.b = (Parcelable)ClassLoaderSavedState.a;
        this.b = null;
        this.c = null;
    }
    
    protected ClassLoaderSavedState(final Parcel parcel) {
        this.b = (Parcelable)ClassLoaderSavedState.a;
        Object b = parcel.readParcelable(this.c);
        if (b == null) {
            b = ClassLoaderSavedState.a;
        }
        this.b = (Parcelable)b;
    }
    
    protected ClassLoaderSavedState(Parcelable b, final ClassLoader c) {
        this.b = (Parcelable)ClassLoaderSavedState.a;
        this.c = c;
        if (b == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (b == ClassLoaderSavedState.a) {
            b = null;
        }
        this.b = b;
    }
    
    public final Parcelable a() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.b, n);
    }
}
