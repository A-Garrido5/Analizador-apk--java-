// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TwitterUserMetadata implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final TwitterSocialProof a;
    public final String b;
    public final String c;
    public final boolean d;
    
    static {
        CREATOR = (Parcelable$Creator)new bx();
    }
    
    public TwitterUserMetadata(final Parcel parcel) {
        this.a = (TwitterSocialProof)parcel.readParcelable(this.getClass().getClassLoader());
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (parcel.readInt() == 1);
    }
    
    public TwitterUserMetadata(final TwitterSocialProof a, final String b, final String c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final TwitterUserMetadata twitterUserMetadata = (TwitterUserMetadata)o;
            if (this.d != twitterUserMetadata.d) {
                return false;
            }
            Label_0072: {
                if (this.a != null) {
                    if (this.a.a(twitterUserMetadata.a)) {
                        break Label_0072;
                    }
                }
                else if (twitterUserMetadata.a == null) {
                    break Label_0072;
                }
                return false;
            }
            Label_0102: {
                if (this.b != null) {
                    if (this.b.equals(twitterUserMetadata.b)) {
                        break Label_0102;
                    }
                }
                else if (twitterUserMetadata.b == null) {
                    break Label_0102;
                }
                return false;
            }
            if (this.c != null) {
                if (this.c.equals(twitterUserMetadata.c)) {
                    return true;
                }
            }
            else if (twitterUserMetadata.c == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        int hashCode2;
        if (this.b != null) {
            hashCode2 = this.b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.c != null) {
            hashCode3 = this.c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (hashCode3 + n2);
        final boolean d = this.d;
        int n4 = 0;
        if (d) {
            n4 = 1;
        }
        return n3 + n4;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        int n2;
        if (this.d) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
    }
}
