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

public class nq implements SafeParcelable
{
    public static final ch CREATOR;
    final int a;
    final boolean b;
    final List c;
    private final Set d;
    
    static {
        CREATOR = new ch();
    }
    
    nq(final int a, final boolean b, final List list) {
        this.a = a;
        this.b = b;
        List<Object> c;
        if (list == null) {
            c = Collections.emptyList();
        }
        else {
            c = Collections.unmodifiableList((List<?>)list);
        }
        this.c = c;
        if (this.c.isEmpty()) {
            this.d = Collections.emptySet();
            return;
        }
        this.d = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(this.c));
    }
    
    public boolean a() {
        return this.b;
    }
    
    public int describeContents() {
        final ch creator = nq.CREATOR;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof nq)) {
                return false;
            }
            final nq nq = (nq)o;
            if (!this.d.equals(nq.d) || this.b != nq.b) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return al.a(new Object[] { this.d, this.b });
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ch creator = nq.CREATOR;
        ch.a(this, parcel, n);
    }
}
