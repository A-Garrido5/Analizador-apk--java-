// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.util.Log;
import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class DataHolder implements SafeParcelable
{
    public static final e CREATOR;
    private static final c l;
    Bundle a;
    int[] b;
    int c;
    boolean d;
    private final int e;
    private final String[] f;
    private final CursorWindow[] g;
    private final int h;
    private final Bundle i;
    private Object j;
    private boolean k;
    
    static {
        CREATOR = new e();
        l = new b(new String[0], null);
    }
    
    DataHolder(final int e, final String[] f, final CursorWindow[] g, final int h, final Bundle i) {
        this.d = false;
        this.k = true;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public void a() {
        int i = 0;
        this.a = new Bundle();
        for (int j = 0; j < this.f.length; ++j) {
            this.a.putInt(this.f[j], j);
        }
        this.b = new int[this.g.length];
        int c = 0;
        while (i < this.g.length) {
            this.b[i] = c;
            c += this.g[i].getNumRows() - (c - this.g[i].getStartPosition());
            ++i;
        }
        this.c = c;
    }
    
    int b() {
        return this.e;
    }
    
    String[] c() {
        return this.f;
    }
    
    CursorWindow[] d() {
        return this.g;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public int e() {
        return this.h;
    }
    
    public Bundle f() {
        return this.i;
    }
    
    @Override
    protected void finalize() {
        try {
            if (this.k && this.g.length > 0 && !this.g()) {
                String s;
                if (this.j == null) {
                    s = "internal object: " + this.toString();
                }
                else {
                    s = this.j.toString();
                }
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + s + ")");
                this.h();
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public boolean g() {
        synchronized (this) {
            return this.d;
        }
    }
    
    public void h() {
        synchronized (this) {
            if (!this.d) {
                this.d = true;
                for (int i = 0; i < this.g.length; ++i) {
                    this.g[i].close();
                }
            }
        }
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.common.data.e.a(this, parcel, n);
    }
}
