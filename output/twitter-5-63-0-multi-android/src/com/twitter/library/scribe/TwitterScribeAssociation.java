// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public class TwitterScribeAssociation extends ScribeAssociation
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new v();
    }
    
    public TwitterScribeAssociation() {
    }
    
    private TwitterScribeAssociation(final Parcel parcel) {
        super(parcel);
    }
    
    public TwitterScribeAssociation(final TwitterScribeAssociation twitterScribeAssociation) {
        this.a(twitterScribeAssociation.e());
        this.a(twitterScribeAssociation.d());
        this.b(twitterScribeAssociation.a());
        this.c(twitterScribeAssociation.b());
        this.d(twitterScribeAssociation.c());
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean f() {
        return "discover".equals(this.a());
    }
}
