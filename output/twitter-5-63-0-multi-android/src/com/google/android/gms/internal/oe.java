// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class oe implements SafeParcelable
{
    public static final co CREATOR;
    public static final oe a;
    public static final oe b;
    public static final Set c;
    final int d;
    final String e;
    final int f;
    
    static {
        a = a("test_type", 1);
        b = a("labeled_place", 6);
        c = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(oe.a, oe.b)));
        CREATOR = new co();
    }
    
    oe(final int d, final String e, final int f) {
        ap.a(e);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private static oe a(final String s, final int n) {
        return new oe(0, s, n);
    }
    
    public int describeContents() {
        final co creator = oe.CREATOR;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof oe)) {
                return false;
            }
            final oe oe = (oe)o;
            if (!this.e.equals(oe.e) || this.f != oe.f) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return this.e.hashCode();
    }
    
    @Override
    public String toString() {
        return this.e;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final co creator = oe.CREATOR;
        co.a(this, parcel, n);
    }
}
