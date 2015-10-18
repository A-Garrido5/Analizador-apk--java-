// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import java.util.Iterator;
import com.twitter.library.platform.notifications.a;
import java.util.ArrayList;
import com.twitter.library.platform.notifications.f;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class DataSyncResult implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final long b;
    public final boolean c;
    public int d;
    public int e;
    public String f;
    public d g;
    public d h;
    public d i;
    public d j;
    public d k;
    public d l;
    public d m;
    public d n;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    public DataSyncResult(final Parcel parcel) {
        boolean c = true;
        this.a = parcel.readString();
        this.b = parcel.readLong();
        if (parcel.readInt() != (c ? 1 : 0)) {
            c = false;
        }
        this.c = c;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = this.b(parcel);
        this.h = this.b(parcel);
        this.j = this.b(parcel);
        this.i = this.b(parcel);
        this.k = this.b(parcel);
        this.l = this.b(parcel);
        this.m = this.b(parcel);
        this.n = this.b(parcel);
    }
    
    public DataSyncResult(final String a, final long b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static d a(final Parcel parcel) {
        int i = 0;
        final d d = new d();
        d.c = parcel.readInt();
        d.b = parcel.readInt();
        d.d = parcel.readString();
        d.e = parcel.readString();
        d.f = parcel.readLong();
        d.g = parcel.readLong();
        d.h = parcel.readString();
        d.i = parcel.readString();
        d.j = parcel.readString();
        d.k = parcel.readString();
        d.l = parcel.readString();
        d.m = (parcel.readInt() != 0);
        d.n = (parcel.readInt() != 0);
        d.p = parcel.readInt();
        d.x = parcel.readString();
        d.o = parcel.readString();
        if (parcel.readInt() == 1) {
            d.u = new com.twitter.library.platform.notifications.d(parcel);
        }
        if (parcel.readInt() == 1) {
            d.v = new f(parcel);
        }
        final int int1 = parcel.readInt();
        ArrayList<a> w;
        if (int1 == -1) {
            w = null;
        }
        else {
            w = new ArrayList<a>(int1);
            for (int j = 0; j < int1; ++j) {
                w.add(new a(parcel));
            }
        }
        d.w = w;
        final int int2 = parcel.readInt();
        if (int2 > 0) {
            d.t = new c[int2];
            while (i < int2) {
                final c c = new c();
                c.a = parcel.readInt();
                c.b = parcel.readInt();
                c.c = parcel.readString();
                c.d = parcel.readString();
                c.e = parcel.readString();
                c.f = parcel.readLong();
                c.g = parcel.readString();
                final int int3 = parcel.readInt();
                if (int3 > 0) {
                    parcel.readByteArray(c.h = new byte[int3]);
                }
                d.t[i] = c;
                ++i;
            }
        }
        else {
            d.t = com.twitter.library.platform.d.a;
        }
        d.q = parcel.readInt();
        d.r = parcel.readString();
        return d;
    }
    
    public static void a(final Parcel parcel, final d d) {
        int n = 1;
        int i = 0;
        parcel.writeInt(d.c);
        parcel.writeInt(d.b);
        parcel.writeString(d.d);
        parcel.writeString(d.e);
        parcel.writeLong(d.f);
        parcel.writeLong(d.g);
        parcel.writeString(d.h);
        parcel.writeString(d.i);
        parcel.writeString(d.j);
        parcel.writeString(d.k);
        parcel.writeString(d.l);
        int n2;
        if (d.m) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        int n3;
        if (d.n) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        parcel.writeInt(d.p);
        parcel.writeString(d.x);
        parcel.writeString(d.o);
        int n4;
        if (d.u == null) {
            n4 = 0;
        }
        else {
            n4 = n;
        }
        parcel.writeInt(n4);
        if (d.u != null) {
            d.u.a(parcel);
        }
        if (d.v == null) {
            n = 0;
        }
        parcel.writeInt(n);
        if (d.v != null) {
            d.v.a(parcel);
        }
        int size;
        if (d.w == null) {
            size = -1;
        }
        else {
            size = d.w.size();
        }
        parcel.writeInt(size);
        if (d.w != null && !d.w.isEmpty()) {
            final Iterator<a> iterator = (Iterator<a>)d.w.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(parcel);
            }
        }
        final int length = d.t.length;
        parcel.writeInt(length);
        while (i < length) {
            final c c = d.t[i];
            parcel.writeInt(c.a);
            parcel.writeInt(c.b);
            parcel.writeString(c.c);
            parcel.writeString(c.d);
            parcel.writeString(c.e);
            parcel.writeLong(c.f);
            parcel.writeString(c.g);
            if (c.h != null) {
                parcel.writeInt(c.h.length);
                parcel.writeByteArray(c.h);
            }
            else {
                parcel.writeInt(-1);
            }
            ++i;
        }
        parcel.writeInt(d.q);
        parcel.writeString(d.r);
    }
    
    private d b(final Parcel parcel) {
        int n = 1;
        if (parcel.readInt() != n) {
            n = 0;
        }
        if (n != 0) {
            return a(parcel);
        }
        return null;
    }
    
    private void b(final Parcel parcel, final d d) {
        int n = 1;
        int n2;
        if (d != null) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            n = 0;
        }
        parcel.writeInt(n);
        if (n2 != 0) {
            a(parcel, d);
        }
    }
    
    public boolean a() {
        int n;
        if (this.g != null) {
            n = 0 + this.g.c;
        }
        else {
            n = 0;
        }
        if (this.h != null) {
            n += this.h.c;
        }
        if (this.j != null) {
            n += this.j.c;
        }
        if (this.i != null) {
            n += this.i.c;
        }
        boolean b = false;
        if (n > 0) {
            b = true;
        }
        return b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        int n2;
        if (this.c) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        this.b(parcel, this.g);
        this.b(parcel, this.h);
        this.b(parcel, this.j);
        this.b(parcel, this.i);
        this.b(parcel, this.k);
        this.b(parcel, this.l);
        this.b(parcel, this.m);
        this.b(parcel, this.n);
    }
}
