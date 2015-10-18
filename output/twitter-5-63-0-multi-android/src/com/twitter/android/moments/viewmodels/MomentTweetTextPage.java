// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import java.io.Serializable;
import com.twitter.library.provider.Tweet;
import android.os.Parcel;
import com.twitter.library.api.moments.ThemeData;
import android.os.Parcelable$Creator;

public class MomentTweetTextPage extends MomentTweetPage
{
    public static final Parcelable$Creator CREATOR;
    private final ThemeData a;
    
    static {
        CREATOR = (Parcelable$Creator)new f();
    }
    
    public MomentTweetTextPage(final Parcel parcel) {
        super(parcel);
        this.a = (ThemeData)parcel.readSerializable();
    }
    
    public MomentTweetTextPage(final Tweet tweet, final boolean b, final ThemeData a) {
        super(tweet, b);
        this.a = a;
    }
    
    @Override
    public MomentPage$Type b() {
        return MomentPage$Type.a;
    }
    
    public ThemeData f() {
        return this.a;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeSerializable((Serializable)this.a);
    }
}
