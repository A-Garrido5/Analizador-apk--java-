// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class VineLoopAggregator$Record implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public int b;
    public long c;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    private VineLoopAggregator$Record() {
    }
    
    private VineLoopAggregator$Record(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readLong();
    }
    
    public VineLoopAggregator$Record(final String a) {
        this.a = a;
        this.b = 0;
    }
    
    public static VineLoopAggregator$Record a(final String s) {
        final String[] split = s.split("@");
        if (split.length != 3) {
            return null;
        }
        final VineLoopAggregator$Record vineLoopAggregator$Record = new VineLoopAggregator$Record();
        vineLoopAggregator$Record.a = split[0];
        vineLoopAggregator$Record.b = Integer.parseInt(split[1]);
        vineLoopAggregator$Record.c = Long.parseLong(split[2]);
        return vineLoopAggregator$Record;
    }
    
    public String a() {
        return String.format("%s%s%d%s%d", this.a, "@", this.b, "@", this.c);
    }
    
    public void a(final int n) {
        this.b += n;
        this.c = System.currentTimeMillis();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        return this.a();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
    }
}
