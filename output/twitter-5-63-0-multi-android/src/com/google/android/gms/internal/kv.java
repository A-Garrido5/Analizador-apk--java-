// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class kv implements SafeParcelable
{
    public static final az CREATOR;
    private final int a;
    private final HashMap b;
    private final ArrayList c;
    private final String d;
    
    static {
        CREATOR = new az();
    }
    
    kv(final int a, final ArrayList list, final String s) {
        this.a = a;
        this.c = null;
        this.b = a(list);
        this.d = (String)ap.a((Object)s);
        this.a();
    }
    
    private static HashMap a(final ArrayList list) {
        final HashMap<String, HashMap> hashMap = new HashMap<String, HashMap>();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final kv$a kv$a = list.get(i);
            hashMap.put(kv$a.b, kv$a.a());
        }
        return hashMap;
    }
    
    public HashMap a(final String s) {
        return this.b.get(s);
    }
    
    public void a() {
        final Iterator<String> iterator = this.b.keySet().iterator();
        while (iterator.hasNext()) {
            final HashMap<String, HashMap<String, HashMap<String, HashMap>>> hashMap = this.b.get(iterator.next());
            final Iterator<String> iterator2 = hashMap.keySet().iterator();
            while (iterator2.hasNext()) {
                ((kr$a)hashMap.get(iterator2.next())).a(this);
            }
        }
    }
    
    int b() {
        return this.a;
    }
    
    ArrayList c() {
        final ArrayList<kv$a> list = new ArrayList<kv$a>();
        for (final String s : this.b.keySet()) {
            list.add(new kv$a(s, (HashMap)this.b.get(s)));
        }
        return list;
    }
    
    public String d() {
        return this.d;
    }
    
    public int describeContents() {
        final az creator = kv.CREATOR;
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (final String s : this.b.keySet()) {
            sb.append(s).append(":\n");
            final HashMap<String, HashMap<String, HashMap<String, HashMap>>> hashMap = this.b.get(s);
            for (final String s2 : hashMap.keySet()) {
                sb.append("  ").append(s2).append(": ");
                sb.append(hashMap.get(s2));
            }
        }
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final az creator = kv.CREATOR;
        az.a(this, parcel, n);
    }
}
