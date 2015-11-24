// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class jg$a implements SafeParcelable
{
    public static final ao CREATOR;
    private final int a;
    private final String b;
    private final List c;
    private final int d;
    private final String e;
    
    static {
        CREATOR = new ao();
    }
    
    jg$a(final int a, final String b, final List list, final int d, final String e) {
        this.c = new ArrayList();
        this.a = a;
        this.b = b;
        this.c.addAll(list);
        this.d = d;
        this.e = e;
    }
    
    public jg$a(final String s, final Collection collection, final int n, final String s2) {
        this(3, s, new ArrayList(collection), n, s2);
    }
    
    public String a() {
        return this.b;
    }
    
    public int b() {
        return this.d;
    }
    
    public String c() {
        return this.e;
    }
    
    public List d() {
        return new ArrayList(this.c);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public int e() {
        return this.a;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        ao.a(this, parcel, n);
    }
}
