// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.moments;

import com.twitter.model.common.a;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Moment implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final long a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final int i;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    public Moment(final Parcel parcel) {
        boolean g = true;
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = (parcel.readInt() == (g ? 1 : 0) && g);
        this.d = (parcel.readInt() == (g ? 1 : 0) && g);
        this.e = parcel.readString();
        this.f = parcel.readString();
        if (parcel.readInt() != (g ? 1 : 0)) {
            g = false;
        }
        this.g = g;
        this.h = parcel.readString();
        this.i = parcel.readInt();
    }
    
    private Moment(final d d) {
        this.a = d.a;
        this.b = d.b;
        this.c = d.c;
        this.d = d.d;
        this.e = d.e;
        this.f = d.f;
        this.g = d.g;
        this.h = d.h;
        this.i = d.i;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        int n3;
        if (this.c) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        int n4;
        if (this.d) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeInt(n4);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        if (!this.g) {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
    }
}
