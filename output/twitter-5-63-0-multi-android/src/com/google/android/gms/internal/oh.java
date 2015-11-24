// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Locale;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class oh implements SafeParcelable
{
    public static final cs CREATOR;
    public static final oh a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    
    static {
        a = new oh("com.google.android.gms", Locale.ENGLISH, null);
        CREATOR = new cs();
    }
    
    public oh(final int b, final String c, final String d, final String e, final String f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public oh(final String s, final Locale locale, final String s2) {
        this(1, s, locale.toString(), s2, null);
    }
    
    public int describeContents() {
        final cs creator = oh.CREATOR;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || !(o instanceof oh)) {
                return false;
            }
            final oh oh = (oh)o;
            if (!this.d.equals(oh.d) || !this.c.equals(oh.c) || !al.a(this.e, oh.e) || !al.a(this.f, oh.f)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.c, this.d, this.e);
    }
    
    @Override
    public String toString() {
        return al.a(this).a("clientPackageName", this.c).a("locale", this.d).a("accountName", this.e).a("gCoreClientName", this.f).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final cs creator = oh.CREATOR;
        cs.a(this, parcel, n);
    }
}
