// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class kv$a implements SafeParcelable
{
    public static final ba CREATOR;
    final int a;
    final String b;
    final ArrayList c;
    
    static {
        CREATOR = new ba();
    }
    
    kv$a(final int a, final String b, final ArrayList c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    kv$a(final String b, final HashMap hashMap) {
        this.a = 1;
        this.b = b;
        this.c = a(hashMap);
    }
    
    private static ArrayList a(final HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        final ArrayList<kv$b> list = new ArrayList<kv$b>();
        for (final String s : hashMap.keySet()) {
            list.add(new kv$b(s, (kr$a)hashMap.get(s)));
        }
        return list;
    }
    
    HashMap a() {
        final HashMap<String, kr$a> hashMap = new HashMap<String, kr$a>();
        for (int size = this.c.size(), i = 0; i < size; ++i) {
            final kv$b kv$b = this.c.get(i);
            hashMap.put(kv$b.b, kv$b.c);
        }
        return hashMap;
    }
    
    public int describeContents() {
        final ba creator = kv$a.CREATOR;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ba creator = kv$a.CREATOR;
        ba.a(this, parcel, n);
    }
}
