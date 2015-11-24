// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Set;
import com.google.android.gms.common.internal.safeparcel.a$a;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ky extends kr implements SafeParcelable
{
    public static final bb CREATOR;
    private final int a;
    private final Parcel b;
    private final int c;
    private final kv d;
    private final String e;
    private int f;
    private int g;
    
    static {
        CREATOR = new bb();
    }
    
    ky(final int a, final Parcel parcel, final kv d) {
        this.a = a;
        this.b = (Parcel)ap.a(parcel);
        this.c = 2;
        this.d = d;
        if (this.d == null) {
            this.e = null;
        }
        else {
            this.e = this.d.d();
        }
        this.f = 2;
    }
    
    public static HashMap a(final Bundle bundle) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final String s : bundle.keySet()) {
            hashMap.put(s, bundle.getString(s));
        }
        return hashMap;
    }
    
    private static HashMap a(final HashMap hashMap) {
        final HashMap<Integer, Map.Entry<K, kr$a>> hashMap2 = new HashMap<Integer, Map.Entry<K, kr$a>>();
        for (final Map.Entry<K, kr$a> entry : hashMap.entrySet()) {
            hashMap2.put(entry.getValue().g(), entry);
        }
        return hashMap2;
    }
    
    private void a(final StringBuilder sb, final int n, final Object o) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("Unknown type = " + n);
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                sb.append(o);
            }
            case 7: {
                sb.append("\"").append(bh.a(o.toString())).append("\"");
            }
            case 8: {
                sb.append("\"").append(bd.a((byte[])o)).append("\"");
            }
            case 9: {
                sb.append("\"").append(bd.b((byte[])o));
                sb.append("\"");
            }
            case 10: {
                bi.a(sb, (HashMap)o);
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
        }
    }
    
    private void a(final StringBuilder sb, final kr$a kr$a, final Parcel parcel, final int n) {
        switch (kr$a.d()) {
            default: {
                throw new IllegalArgumentException("Unknown field out type = " + kr$a.d());
            }
            case 0: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.f(parcel, n)));
            }
            case 1: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.i(parcel, n)));
            }
            case 2: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.h(parcel, n)));
            }
            case 3: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.j(parcel, n)));
            }
            case 4: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.k(parcel, n)));
            }
            case 5: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.l(parcel, n)));
            }
            case 6: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.c(parcel, n)));
            }
            case 7: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.m(parcel, n)));
            }
            case 8:
            case 9: {
                this.a(sb, kr$a, this.a(kr$a, com.google.android.gms.common.internal.safeparcel.a.p(parcel, n)));
            }
            case 10: {
                this.a(sb, kr$a, this.a(kr$a, a(com.google.android.gms.common.internal.safeparcel.a.o(parcel, n))));
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
        }
    }
    
    private void a(final StringBuilder sb, final kr$a kr$a, final Object o) {
        if (kr$a.c()) {
            this.a(sb, kr$a, (ArrayList)o);
            return;
        }
        this.a(sb, kr$a.b(), o);
    }
    
    private void a(final StringBuilder sb, final kr$a kr$a, final ArrayList list) {
        sb.append("[");
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            this.a(sb, kr$a.b(), list.get(i));
        }
        sb.append("]");
    }
    
    private void a(final StringBuilder sb, final String s, final kr$a kr$a, final Parcel parcel, final int n) {
        sb.append("\"").append(s).append("\":");
        if (kr$a.j()) {
            this.a(sb, kr$a, parcel, n);
            return;
        }
        this.b(sb, kr$a, parcel, n);
    }
    
    private void a(final StringBuilder sb, final HashMap hashMap, final Parcel parcel) {
        final HashMap a = a(hashMap);
        sb.append('{');
        final int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int n = 0;
        while (parcel.dataPosition() < b) {
            final int a2 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            final Map.Entry<String, V> entry = a.get(com.google.android.gms.common.internal.safeparcel.a.a(a2));
            if (entry != null) {
                if (n != 0) {
                    sb.append(",");
                }
                this.a(sb, entry.getKey(), (kr$a)entry.getValue(), parcel, a2);
                n = 1;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new a$a("Overread allowed size end=" + b, parcel);
        }
        sb.append('}');
    }
    
    private void b(final StringBuilder sb, final kr$a kr$a, final Parcel parcel, final int n) {
        if (kr$a.e()) {
            sb.append("[");
            switch (kr$a.d()) {
                default: {
                    throw new IllegalStateException("Unknown field type out.");
                }
                case 0: {
                    bc.a(sb, com.google.android.gms.common.internal.safeparcel.a.r(parcel, n));
                    break;
                }
                case 1: {
                    bc.a(sb, com.google.android.gms.common.internal.safeparcel.a.t(parcel, n));
                    break;
                }
                case 2: {
                    bc.a(sb, com.google.android.gms.common.internal.safeparcel.a.s(parcel, n));
                    break;
                }
                case 3: {
                    bc.a(sb, com.google.android.gms.common.internal.safeparcel.a.u(parcel, n));
                    break;
                }
                case 4: {
                    bc.a(sb, com.google.android.gms.common.internal.safeparcel.a.v(parcel, n));
                    break;
                }
                case 5: {
                    bc.a(sb, com.google.android.gms.common.internal.safeparcel.a.w(parcel, n));
                    break;
                }
                case 6: {
                    bc.a(sb, com.google.android.gms.common.internal.safeparcel.a.q(parcel, n));
                    break;
                }
                case 7: {
                    bc.a(sb, com.google.android.gms.common.internal.safeparcel.a.x(parcel, n));
                    break;
                }
                case 8:
                case 9:
                case 10: {
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                }
                case 11: {
                    final Parcel[] a = com.google.android.gms.common.internal.safeparcel.a.A(parcel, n);
                    for (int length = a.length, i = 0; i < length; ++i) {
                        if (i > 0) {
                            sb.append(",");
                        }
                        a[i].setDataPosition(0);
                        this.a(sb, kr$a.l(), a[i]);
                    }
                    break;
                }
            }
            sb.append("]");
            return;
        }
        switch (kr$a.d()) {
            default: {
                throw new IllegalStateException("Unknown field type out");
            }
            case 0: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.f(parcel, n));
            }
            case 1: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, n));
            }
            case 2: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.h(parcel, n));
            }
            case 3: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.j(parcel, n));
            }
            case 4: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, n));
            }
            case 5: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.l(parcel, n));
            }
            case 6: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, n));
            }
            case 7: {
                sb.append("\"").append(bh.a(com.google.android.gms.common.internal.safeparcel.a.m(parcel, n))).append("\"");
            }
            case 8: {
                sb.append("\"").append(bd.a(com.google.android.gms.common.internal.safeparcel.a.p(parcel, n))).append("\"");
            }
            case 9: {
                sb.append("\"").append(bd.b(com.google.android.gms.common.internal.safeparcel.a.p(parcel, n)));
                sb.append("\"");
            }
            case 10: {
                final Bundle o = com.google.android.gms.common.internal.safeparcel.a.o(parcel, n);
                final Set keySet = o.keySet();
                keySet.size();
                sb.append("{");
                final Iterator<String> iterator = keySet.iterator();
                int n2 = 1;
                while (iterator.hasNext()) {
                    final String s = iterator.next();
                    if (n2 == 0) {
                        sb.append(",");
                    }
                    sb.append("\"").append(s).append("\"");
                    sb.append(":");
                    sb.append("\"").append(bh.a(o.getString(s))).append("\"");
                    n2 = 0;
                }
                sb.append("}");
            }
            case 11: {
                final Parcel z = com.google.android.gms.common.internal.safeparcel.a.z(parcel, n);
                z.setDataPosition(0);
                this.a(sb, kr$a.l(), z);
            }
        }
    }
    
    @Override
    protected Object a(final String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
    
    @Override
    public HashMap a() {
        if (this.d == null) {
            return null;
        }
        return this.d.a(this.e);
    }
    
    @Override
    protected boolean b(final String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
    
    public int d() {
        return this.a;
    }
    
    public int describeContents() {
        final bb creator = ky.CREATOR;
        return 0;
    }
    
    public Parcel e() {
        switch (this.f) {
            case 0: {
                this.g = com.google.android.gms.common.internal.safeparcel.b.a(this.b);
                com.google.android.gms.common.internal.safeparcel.b.a(this.b, this.g);
                this.f = 2;
                break;
            }
            case 1: {
                com.google.android.gms.common.internal.safeparcel.b.a(this.b, this.g);
                this.f = 2;
                break;
            }
        }
        return this.b;
    }
    
    kv f() {
        switch (this.c) {
            default: {
                throw new IllegalStateException("Invalid creation type: " + this.c);
            }
            case 0: {
                return null;
            }
            case 1: {
                return this.d;
            }
            case 2: {
                return this.d;
            }
        }
    }
    
    @Override
    public String toString() {
        ap.a(this.d, "Cannot convert to JSON on client side.");
        final Parcel e = this.e();
        e.setDataPosition(0);
        final StringBuilder sb = new StringBuilder(100);
        this.a(sb, this.d.a(this.e), e);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final bb creator = ky.CREATOR;
        bb.a(this, parcel, n);
    }
}
