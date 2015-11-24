// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.List;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class UrlConfiguration implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final ArrayList c;
    
    static {
        CREATOR = (Parcelable$Creator)new bz();
    }
    
    public UrlConfiguration(final int a, final String b, final ArrayList c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public UrlConfiguration(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.createStringArrayList();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList((List)this.c);
    }
}
