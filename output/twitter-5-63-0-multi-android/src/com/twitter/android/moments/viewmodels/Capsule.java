// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import com.twitter.library.api.moments.Moment;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Capsule implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final Moment a;
    private final List b;
    private final int c;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
    }
    
    public Capsule(final Parcel parcel) {
        this.a = (Moment)parcel.readParcelable(Moment.class.getClassLoader());
        this.b = new ArrayList();
        final Parcelable[] parcelableArray = parcel.readParcelableArray(MomentPage.class.getClassLoader());
        for (int length = parcelableArray.length, i = 0; i < length; ++i) {
            this.b.add(parcelableArray[i]);
        }
        this.c = parcel.readInt();
    }
    
    private Capsule(final Moment a, final List b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Moment a() {
        return this.a;
    }
    
    public List b() {
        return this.b;
    }
    
    public int c() {
        return this.c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeParcelableArray((Parcelable[])this.b.toArray(new Parcelable[this.b.size()]), n);
        parcel.writeInt(this.c);
    }
}
