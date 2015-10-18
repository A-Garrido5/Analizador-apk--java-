// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import java.util.Collections;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TwitterTypeAheadGroup implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    
    static {
        CREATOR = (Parcelable$Creator)new x();
    }
    
    public TwitterTypeAheadGroup(final Parcel parcel) {
        final ClassLoader classLoader = this.getClass().getClassLoader();
        parcel.readList(this.a = new ArrayList(), classLoader);
        parcel.readList(this.b = new ArrayList(), classLoader);
        parcel.readList(this.c = new ArrayList(), classLoader);
        parcel.readList(this.d = new ArrayList(), classLoader);
    }
    
    public TwitterTypeAheadGroup(List empty_LIST, List empty_LIST2, List empty_LIST3, List empty_LIST4) {
        if (empty_LIST == null) {
            empty_LIST = Collections.EMPTY_LIST;
        }
        this.a = empty_LIST;
        if (empty_LIST2 == null) {
            empty_LIST2 = Collections.EMPTY_LIST;
        }
        this.b = empty_LIST2;
        if (empty_LIST3 == null) {
            empty_LIST3 = Collections.EMPTY_LIST;
        }
        this.c = empty_LIST3;
        if (empty_LIST4 == null) {
            empty_LIST4 = Collections.EMPTY_LIST;
        }
        this.d = empty_LIST4;
    }
    
    public boolean a() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeList(this.a);
        parcel.writeList(this.b);
        parcel.writeList(this.c);
        parcel.writeList(this.d);
    }
}
