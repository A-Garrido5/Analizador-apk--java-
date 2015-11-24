// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcel;
import com.twitter.library.api.TwitterUser;
import android.accounts.Account;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class UserAccount implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Account a;
    public final TwitterUser b;
    
    static {
        CREATOR = (Parcelable$Creator)new xp();
    }
    
    public UserAccount(final Account a, final TwitterUser b) {
        this.a = a;
        this.b = b;
    }
    
    public UserAccount(final Parcel parcel) {
        final ClassLoader classLoader = this.getClass().getClassLoader();
        this.a = (Account)parcel.readParcelable(classLoader);
        this.b = (TwitterUser)parcel.readParcelable(classLoader);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, 0);
        parcel.writeParcelable((Parcelable)this.b, 0);
    }
}
