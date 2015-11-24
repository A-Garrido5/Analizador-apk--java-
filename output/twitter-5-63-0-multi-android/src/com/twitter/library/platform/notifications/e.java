// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform.notifications;

import android.os.Parcel;

public class e
{
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    
    public e(final long a, final String b, final String c, final String d, final String e, final String f, final boolean g, final boolean h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public e(final Parcel parcel) {
        boolean h = true;
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = (parcel.readInt() == (h ? 1 : 0) && h);
        if (parcel.readInt() != (h ? 1 : 0)) {
            h = false;
        }
        this.h = h;
    }
    
    public void a(final Parcel parcel) {
        int n = 1;
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        int n2;
        if (this.g) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        if (!this.h) {
            n = 0;
        }
        parcel.writeInt(n);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("id=").append(this.a).append(", ");
        sb.append("screenName=").append(this.b).append(", ");
        if (this.c != null) {
            sb.append("fullName=").append(this.c).append(", ");
        }
        if (this.d != null) {
            sb.append("bio=").append(this.d).append(", ");
        }
        sb.append("avatarUrl=").append(this.e).append(", ");
        sb.append("bannerUrl=").append(this.f).append(", ");
        sb.append("isProtected=").append(this.g).append(", ");
        sb.append("following=").append(this.h);
        return sb.toString();
    }
}
