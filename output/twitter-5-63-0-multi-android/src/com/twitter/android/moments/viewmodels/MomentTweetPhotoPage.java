// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.viewmodels;

import java.io.Serializable;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.provider.Tweet;
import android.os.Parcel;
import com.twitter.library.api.moments.CropData;
import android.os.Parcelable$Creator;

public class MomentTweetPhotoPage extends MomentTweetPage
{
    public static final Parcelable$Creator CREATOR;
    static final /* synthetic */ boolean a;
    private final long b;
    private final CropData c;
    
    static {
        a = !MomentTweetPhotoPage.class.desiredAssertionStatus();
        CREATOR = (Parcelable$Creator)new e();
    }
    
    public MomentTweetPhotoPage(final Parcel parcel) {
        super(parcel);
        this.b = parcel.readLong();
        this.c = (CropData)parcel.readSerializable();
    }
    
    public MomentTweetPhotoPage(final Tweet tweet, final boolean b, final long b2, final CropData c) {
        super(tweet, b);
        this.b = b2;
        this.c = c;
    }
    
    @Override
    public MomentPage$Type b() {
        return MomentPage$Type.b;
    }
    
    public CropData f() {
        return this.c;
    }
    
    public MediaEntity g() {
        if (!this.a()) {
            return null;
        }
        final Tweet e = this.e();
        if (!MomentTweetPhotoPage.a && e == null) {
            throw new AssertionError();
        }
        return this.e().G.media.a(this.b);
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeLong(this.b);
        parcel.writeSerializable((Serializable)this.c);
    }
}
