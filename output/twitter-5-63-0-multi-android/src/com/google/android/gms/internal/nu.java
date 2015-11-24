// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class nu implements SafeParcelable
{
    public static final cj CREATOR;
    final int a;
    final List b;
    final List c;
    final List d;
    private final String e;
    private final boolean f;
    private final Set g;
    private final Set h;
    private final Set i;
    
    static {
        CREATOR = new cj();
    }
    
    nu(final int a, final List list, String e, final boolean f, final List list2, final List list3) {
        this.a = a;
        List<Object> b;
        if (list == null) {
            b = Collections.emptyList();
        }
        else {
            b = Collections.unmodifiableList((List<?>)list);
        }
        this.b = b;
        if (e == null) {
            e = "";
        }
        this.e = e;
        this.f = f;
        List<Object> c;
        if (list2 == null) {
            c = Collections.emptyList();
        }
        else {
            c = Collections.unmodifiableList((List<?>)list2);
        }
        this.c = c;
        List<Object> d;
        if (list3 == null) {
            d = Collections.emptyList();
        }
        else {
            d = Collections.unmodifiableList((List<?>)list3);
        }
        this.d = d;
        this.g = a(this.b);
        this.h = a(this.c);
        this.i = a(this.d);
    }
    
    private static Set a(final List list) {
        if (list.isEmpty()) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet((Set<?>)new HashSet<Object>(list));
    }
    
    @Deprecated
    public String a() {
        return this.e;
    }
    
    public boolean b() {
        return this.f;
    }
    
    public int describeContents() {
        final cj creator = nu.CREATOR;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof nu)) {
                return false;
            }
            final nu nu = (nu)o;
            if (!this.g.equals(nu.g) || this.f != nu.f || !this.h.equals(nu.h) || !this.i.equals(nu.i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(this.g, this.f, this.h, this.i);
    }
    
    @Override
    public String toString() {
        return al.a(this).a("types", this.g).a("placeIds", this.i).a("requireOpenNow", this.f).a("requestedUserDataTypes", this.h).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final cj creator = nu.CREATOR;
        cj.a(this, parcel, n);
    }
}
