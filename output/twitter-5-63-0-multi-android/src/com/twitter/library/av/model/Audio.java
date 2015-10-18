// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model;

import java.util.List;
import android.os.Parcel;
import java.util.Map;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Audio implements Parcelable, a
{
    public static final Parcelable$Creator CREATOR;
    protected final String a;
    protected final String b;
    protected final String c;
    protected final Map d;
    protected final String e;
    protected final String f;
    protected final String g;
    protected final String h;
    protected final String i;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    protected Audio(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = wv.b(parcel);
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
    }
    
    public Audio(final String a, final String b, final String c, final Map d, final String e, final String f, final String g, final String h, final String i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public String a() {
        return this.h;
    }
    
    public List a(final String s) {
        if (this.d == null) {
            return null;
        }
        return this.d.get(s);
    }
    
    public String b() {
        return "audio";
    }
    
    public String c() {
        return this.g;
    }
    
    public boolean d() {
        return true;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public long e() {
        return -1L;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Audio audio = (Audio)o;
            Label_0059: {
                if (this.b != null) {
                    if (this.b.equals(audio.b)) {
                        break Label_0059;
                    }
                }
                else if (audio.b == null) {
                    break Label_0059;
                }
                return false;
            }
            Label_0089: {
                if (this.c != null) {
                    if (this.c.equals(audio.c)) {
                        break Label_0089;
                    }
                }
                else if (audio.c == null) {
                    break Label_0089;
                }
                return false;
            }
            Label_0119: {
                if (this.e != null) {
                    if (this.e.equals(audio.e)) {
                        break Label_0119;
                    }
                }
                else if (audio.e == null) {
                    break Label_0119;
                }
                return false;
            }
            Label_0149: {
                if (this.f != null) {
                    if (this.f.equals(audio.f)) {
                        break Label_0149;
                    }
                }
                else if (audio.f == null) {
                    break Label_0149;
                }
                return false;
            }
            Label_0179: {
                if (this.i != null) {
                    if (this.i.equals(audio.i)) {
                        break Label_0179;
                    }
                }
                else if (audio.i == null) {
                    break Label_0179;
                }
                return false;
            }
            Label_0211: {
                if (this.d != null) {
                    if (this.d.equals(audio.d)) {
                        break Label_0211;
                    }
                }
                else if (audio.d == null) {
                    break Label_0211;
                }
                return false;
            }
            Label_0241: {
                if (this.h != null) {
                    if (this.h.equals(audio.h)) {
                        break Label_0241;
                    }
                }
                else if (audio.h == null) {
                    break Label_0241;
                }
                return false;
            }
            Label_0271: {
                if (this.a != null) {
                    if (this.a.equals(audio.a)) {
                        break Label_0271;
                    }
                }
                else if (audio.a == null) {
                    break Label_0271;
                }
                return false;
            }
            if (this.g != null) {
                if (this.g.equals(audio.g)) {
                    return true;
                }
            }
            else if (audio.g == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public String f() {
        return this.a;
    }
    
    public String g() {
        return this.b;
    }
    
    public String h() {
        return this.c;
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
        int hashCode4;
        if (this.d != null) {
            hashCode4 = this.d.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (hashCode4 + n3);
        int hashCode5;
        if (this.e != null) {
            hashCode5 = this.e.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n5 = 31 * (hashCode5 + n4);
        int hashCode6;
        if (this.f != null) {
            hashCode6 = this.f.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n6 = 31 * (hashCode6 + n5);
        int hashCode7;
        if (this.g != null) {
            hashCode7 = this.g.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n7 = 31 * (hashCode7 + n6);
        int hashCode8;
        if (this.h != null) {
            hashCode8 = this.h.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n8 = 31 * (hashCode8 + n7);
        final String i = this.i;
        int hashCode9 = 0;
        if (i != null) {
            hashCode9 = this.i.hashCode();
        }
        return n8 + hashCode9;
    }
    
    public String i() {
        return this.e;
    }
    
    public String j() {
        return this.f;
    }
    
    public String k() {
        return this.i;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        wv.b(this.d, parcel);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
