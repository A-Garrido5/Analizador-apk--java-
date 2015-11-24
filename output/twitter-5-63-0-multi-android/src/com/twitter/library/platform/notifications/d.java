// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform.notifications;

import java.io.Serializable;
import android.os.Parcel;
import com.twitter.library.api.EntityList;

public class d
{
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final EntityList g;
    
    public d(long n, final long n2, final long c, final String d, final String e, final boolean f, final EntityList g) {
        this.a = n;
        if (n2 != 0L) {
            n = n2;
        }
        this.b = n;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public d(final Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = (parcel.readInt() != 0);
        this.g = (EntityList)parcel.readSerializable();
    }
    
    public void a(final Parcel parcel) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        int n;
        if (this.f) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeSerializable((Serializable)this.g);
    }
}
