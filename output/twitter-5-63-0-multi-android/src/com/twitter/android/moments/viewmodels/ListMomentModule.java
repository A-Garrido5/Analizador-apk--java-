// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcelable;
import com.twitter.library.api.moments.Moment;
import android.os.Parcel;
import com.twitter.internal.android.util.Size;
import android.os.Parcelable$Creator;

public class ListMomentModule extends MomentModule
{
    public static final Parcelable$Creator CREATOR;
    String a;
    Size b;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    public ListMomentModule(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = (Size)parcel.readParcelable(Size.class.getClassLoader());
    }
    
    public ListMomentModule(final Moment moment, final String a, final Size b) {
        super(moment);
        this.a = a;
        this.b = b;
    }
    
    public String a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a);
        parcel.writeParcelable((Parcelable)this.b, n);
    }
}
