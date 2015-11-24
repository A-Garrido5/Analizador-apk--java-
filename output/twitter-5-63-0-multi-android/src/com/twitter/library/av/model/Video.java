// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import com.twitter.util.k;
import java.util.List;
import android.os.Parcel;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Video implements Parcelable, a
{
    public static final Parcelable$Creator CREATOR;
    protected final String b;
    protected final String c;
    protected final String d;
    protected final long e;
    protected final boolean f;
    protected final Map g;
    protected final VideoCta h;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    protected Video(final Parcel parcel) {
        boolean f = true;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
        if (parcel.readByte() != (f ? 1 : 0)) {
            f = false;
        }
        this.f = f;
        this.g = wv.b(parcel);
        this.h = (VideoCta)parcel.readParcelable(VideoCta.class.getClassLoader());
    }
    
    public Video(final String c, final String d, final long e, final String b, final boolean f, final Map g, final VideoCta h) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public String a() {
        return this.b;
    }
    
    public List a(final String s) {
        if (this.g == null) {
            return null;
        }
        return this.g.get(s);
    }
    
    public String b() {
        return k.a(this.d);
    }
    
    public String c() {
        return this.c;
    }
    
    public boolean d() {
        return this.f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Video video = (Video)o;
            if (this.f != video.f) {
                return false;
            }
            if (this.e != video.e) {
                return false;
            }
            Label_0088: {
                if (this.g != null) {
                    if (this.g.equals(video.g)) {
                        break Label_0088;
                    }
                }
                else if (video.g == null) {
                    break Label_0088;
                }
                return false;
            }
            Label_0118: {
                if (this.b != null) {
                    if (this.b.equals(video.b)) {
                        break Label_0118;
                    }
                }
                else if (video.b == null) {
                    break Label_0118;
                }
                return false;
            }
            Label_0148: {
                if (this.c != null) {
                    if (this.c.equals(video.c)) {
                        break Label_0148;
                    }
                }
                else if (video.c == null) {
                    break Label_0148;
                }
                return false;
            }
            Label_0178: {
                if (this.d != null) {
                    if (this.d.equals(video.d)) {
                        break Label_0178;
                    }
                }
                else if (video.d == null) {
                    break Label_0178;
                }
                return false;
            }
            if (this.h != null) {
                if (this.h.equals(video.h)) {
                    return true;
                }
            }
            else if (video.h == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public VideoCta f() {
        return this.h;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        int hashCode2;
        if (this.c != null) {
            hashCode2 = this.c.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.d != null) {
            hashCode3 = this.d.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (31 * (hashCode3 + n2) + (int)(this.e ^ this.e >>> 32));
        int n4;
        if (this.f) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        final int n5 = 31 * (n4 + n3);
        int hashCode4;
        if (this.g != null) {
            hashCode4 = this.g.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n6 = 31 * (hashCode4 + n5);
        final VideoCta h = this.h;
        int hashCode5 = 0;
        if (h != null) {
            hashCode5 = this.h.hashCode();
        }
        return n6 + hashCode5;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        byte b;
        if (this.f) {
            b = 1;
        }
        else {
            b = 0;
        }
        parcel.writeByte(b);
        wv.b(this.g, parcel);
        parcel.writeParcelable((Parcelable)this.h, n);
    }
}
