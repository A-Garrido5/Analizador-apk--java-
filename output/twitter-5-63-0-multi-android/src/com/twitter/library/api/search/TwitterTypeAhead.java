// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import java.util.List;
import android.os.Parcel;
import com.twitter.library.api.TwitterUser;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TwitterTypeAhead implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final ArrayList d;
    public final TwitterUser e;
    public final TwitterSearchQuery f;
    public final String g;
    
    static {
        CREATOR = (Parcelable$Creator)new w();
    }
    
    public TwitterTypeAhead(final int a, final int b, final int c, final ArrayList d, final TwitterUser e, final TwitterSearchQuery f, final String g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public TwitterTypeAhead(final Parcel parcel) {
        final ClassLoader classLoader = this.getClass().getClassLoader();
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.createStringArrayList();
        this.e = (TwitterUser)parcel.readParcelable(classLoader);
        this.f = (TwitterSearchQuery)parcel.readParcelable(classLoader);
        this.g = parcel.readString();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeStringList((List)this.d);
        parcel.writeParcelable((Parcelable)this.e, n);
        parcel.writeParcelable((Parcelable)this.f, n);
        parcel.writeString(this.g);
    }
}
