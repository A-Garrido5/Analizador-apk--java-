// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import java.io.Serializable;
import java.util.List;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.TwitterUser;
import android.os.Parcel;
import com.twitter.library.api.PromotedContent;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TwitterSearchQuery implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final String f;
    public final long g;
    public long h;
    public final ArrayList i;
    public final PromotedContent j;
    public final ArrayList k;
    public final boolean l;
    public final String m;
    
    static {
        CREATOR = (Parcelable$Creator)new k();
    }
    
    public TwitterSearchQuery(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readString();
        this.h = parcel.readLong();
        this.g = parcel.readLong();
        this.i = parcel.createTypedArrayList(TwitterUser.CREATOR);
        this.j = (PromotedContent)parcel.readSerializable();
        this.k = parcel.createStringArrayList();
        this.l = (parcel.readInt() == 1);
        this.m = parcel.readString();
    }
    
    public TwitterSearchQuery(final String s, final String s2, final long n, final long n2, final PromotedContent promotedContent, final ArrayList list) {
        this(s, s2, n, n2, null, null, null, null, null, promotedContent, list, false, null);
    }
    
    public TwitterSearchQuery(final String s, final String s2, final long n, final long n2, final PromotedContent promotedContent, final ArrayList list, final String s3, final boolean b, final String s4) {
        this(s, s2, n, n2, null, null, null, s3, null, promotedContent, list, b, s4);
    }
    
    public TwitterSearchQuery(final String s, final String s2, final long n, final long n2, final Float n3, final Float n4, final Float n5, final String s3, final ArrayList list, final PromotedContent promotedContent, final ArrayList list2) {
        this(s, s2, n, n2, n3, n4, n5, s3, list, promotedContent, list2, false, null);
    }
    
    public TwitterSearchQuery(final String a, final String b, final long h, final long g, final Float c, final Float d, final Float e, final String f, final ArrayList i, final PromotedContent j, final ArrayList k, final boolean l, final String m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public TwitterSearchQuery(final String s, final String s2, final long n, final ArrayList list) {
        this(s, s2, 0L, n, null, null, null, null, list, null, CollectionUtils.a(), false, null);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeFloat((float)this.c);
        parcel.writeFloat((float)this.d);
        parcel.writeFloat((float)this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.h);
        parcel.writeLong(this.g);
        parcel.writeTypedList((List)this.i);
        parcel.writeSerializable((Serializable)this.j);
        parcel.writeStringList((List)this.k);
        int n2;
        if (this.l) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeString(this.m);
    }
}
