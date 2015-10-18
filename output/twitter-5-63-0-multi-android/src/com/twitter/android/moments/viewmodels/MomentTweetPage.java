// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import android.os.Parcelable;
import android.os.Parcel;
import com.twitter.library.provider.Tweet;

public abstract class MomentTweetPage extends HydratableMomentPage
{
    private final long a;
    private Tweet b;
    
    public MomentTweetPage(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.b = (Tweet)parcel.readParcelable(Tweet.class.getClassLoader());
    }
    
    public MomentTweetPage(final Tweet b, final boolean b2) {
        super(b2);
        this.b = b;
        this.a = b.Q;
    }
    
    @Override
    public boolean a() {
        return this.b != null;
    }
    
    public long d() {
        return this.a;
    }
    
    @Override
    public int describeContents() {
        return 0;
    }
    
    public Tweet e() {
        return this.b;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeLong(this.a);
        parcel.writeParcelable((Parcelable)this.b, n);
    }
}
