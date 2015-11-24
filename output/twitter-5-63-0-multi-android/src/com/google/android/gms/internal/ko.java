// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ko implements SafeParcelable, aw
{
    public static final au CREATOR;
    private final int a;
    private final HashMap b;
    private final HashMap c;
    private final ArrayList d;
    
    static {
        CREATOR = new au();
    }
    
    public ko() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = null;
    }
    
    ko(final int a, final ArrayList list) {
        this.a = a;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = null;
        this.a(list);
    }
    
    private void a(final ArrayList list) {
        for (final ko$a ko$a : list) {
            this.a(ko$a.b, ko$a.c);
        }
    }
    
    int a() {
        return this.a;
    }
    
    public ko a(final String s, final int n) {
        this.b.put(s, n);
        this.c.put(n, s);
        return this;
    }
    
    public String a(final Integer n) {
        String s = this.c.get(n);
        if (s == null && this.b.containsKey("gms_unknown")) {
            s = "gms_unknown";
        }
        return s;
    }
    
    ArrayList b() {
        final ArrayList<ko$a> list = new ArrayList<ko$a>();
        for (final String s : this.b.keySet()) {
            list.add(new ko$a(s, (int)this.b.get(s)));
        }
        return list;
    }
    
    public int describeContents() {
        final au creator = ko.CREATOR;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final au creator = ko.CREATOR;
        au.a(this, parcel, n);
    }
}
