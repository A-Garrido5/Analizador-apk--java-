// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform.notifications;

import android.os.Parcel;
import java.util.List;

public class f
{
    public final e a;
    public final e b;
    public final e c;
    public final List d;
    
    public f(final Parcel parcel) {
        this.a = new e(parcel);
        if (parcel.readInt() == 1) {
            this.b = new e(parcel);
            this.c = new e(parcel);
        }
        else {
            this.b = null;
            this.c = null;
        }
        this.d = parcel.readArrayList(NotificationContextUser.class.getClassLoader());
    }
    
    public f(final e a, e e, final e e2, final List d) {
        this.a = a;
        this.b = e;
        if (e2 != null) {
            e = e2;
        }
        this.c = e;
        this.d = d;
    }
    
    public String a() {
        if (this.c != null) {
            return this.c.e;
        }
        return null;
    }
    
    public void a(final Parcel parcel) {
        this.a.a(parcel);
        int n;
        if (this.b == null) {
            n = 0;
        }
        else {
            n = 1;
        }
        parcel.writeInt(n);
        if (this.b != null) {
            this.b.a(parcel);
            this.c.a(parcel);
        }
        parcel.writeList(this.d);
    }
}
