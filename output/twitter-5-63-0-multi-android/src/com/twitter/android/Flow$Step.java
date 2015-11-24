// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.AbsFragment;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

class Flow$Step implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    protected WeakReference a;
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    
    static {
        CREATOR = (Parcelable$Creator)new hr();
    }
    
    public Flow$Step() {
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = this.getClass().getCanonicalName();
    }
    
    private Flow$Step(final Parcel parcel) {
        boolean d = true;
        this.b = false;
        this.c = false;
        this.d = false;
        this.b = (parcel.readInt() == (d ? 1 : 0) && d);
        this.c = (parcel.readInt() == (d ? 1 : 0) && d);
        if (parcel.readInt() != (d ? 1 : 0)) {
            d = false;
        }
        this.d = d;
        this.e = parcel.readString();
    }
    
    AbsFragment a(final Bundle bundle) {
        throw new RuntimeException("You must override createView in subclass.");
    }
    
    public boolean a() {
        return false;
    }
    
    public boolean a(final ht ht) {
        return false;
    }
    
    public Flow$Step b() {
        return null;
    }
    
    public AbsFragment b(final Bundle bundle) {
        if (this.a == null || this.a.get() == null) {
            this.a = new WeakReference((T)this.a(bundle));
        }
        this.d = true;
        return (AbsFragment)this.a.get();
    }
    
    public boolean b(final ht ht) {
        return false;
    }
    
    public boolean c() {
        return this.c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass());
    }
    
    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        int n3;
        if (this.b) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        int n4;
        if (this.c) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeInt(n4);
        if (!this.d) {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeString(this.e);
    }
}
