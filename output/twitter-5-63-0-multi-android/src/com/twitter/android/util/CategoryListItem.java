// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class CategoryListItem implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final String a;
    private final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
    }
    
    public CategoryListItem(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
    
    public CategoryListItem(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
