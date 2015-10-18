// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.HashMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class kr$a implements SafeParcelable
{
    public static final ax CREATOR;
    protected final int a;
    protected final boolean b;
    protected final int c;
    protected final boolean d;
    protected final String e;
    protected final int f;
    protected final Class g;
    protected final String h;
    private final int i;
    private kv j;
    private aw k;
    
    static {
        CREATOR = new ax();
    }
    
    kr$a(final int i, final int a, final boolean b, final int c, final boolean d, final String e, final int f, final String h, final km km) {
        this.i = i;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (h == null) {
            this.g = null;
            this.h = null;
        }
        else {
            this.g = ky.class;
            this.h = h;
        }
        if (km == null) {
            this.k = null;
            return;
        }
        this.k = km.c();
    }
    
    public int a() {
        return this.i;
    }
    
    public Object a(final Object o) {
        return this.k.a(o);
    }
    
    public void a(final kv j) {
        this.j = j;
    }
    
    public int b() {
        return this.a;
    }
    
    public boolean c() {
        return this.b;
    }
    
    public int d() {
        return this.c;
    }
    
    public int describeContents() {
        final ax creator = kr$a.CREATOR;
        return 0;
    }
    
    public boolean e() {
        return this.d;
    }
    
    public String f() {
        return this.e;
    }
    
    public int g() {
        return this.f;
    }
    
    public Class h() {
        return this.g;
    }
    
    String i() {
        if (this.h == null) {
            return null;
        }
        return this.h;
    }
    
    public boolean j() {
        return this.k != null;
    }
    
    km k() {
        if (this.k == null) {
            return null;
        }
        return km.a(this.k);
    }
    
    public HashMap l() {
        ap.a((Object)this.h);
        ap.a(this.j);
        return this.j.a(this.h);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Field\n");
        sb.append("            versionCode=").append(this.i).append('\n');
        sb.append("                 typeIn=").append(this.a).append('\n');
        sb.append("            typeInArray=").append(this.b).append('\n');
        sb.append("                typeOut=").append(this.c).append('\n');
        sb.append("           typeOutArray=").append(this.d).append('\n');
        sb.append("        outputFieldName=").append(this.e).append('\n');
        sb.append("      safeParcelFieldId=").append(this.f).append('\n');
        sb.append("       concreteTypeName=").append(this.i()).append('\n');
        if (this.h() != null) {
            sb.append("     concreteType.class=").append(this.h().getCanonicalName()).append('\n');
        }
        final StringBuilder append = sb.append("          converterName=");
        String canonicalName;
        if (this.k == null) {
            canonicalName = "null";
        }
        else {
            canonicalName = this.k.getClass().getCanonicalName();
        }
        append.append(canonicalName).append('\n');
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ax creator = kr$a.CREATOR;
        ax.a(this, parcel, n);
    }
}
