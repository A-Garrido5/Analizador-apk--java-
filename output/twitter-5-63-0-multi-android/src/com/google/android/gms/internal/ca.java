// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import java.util.Iterator;
import com.google.android.gms.location.l;
import com.google.android.gms.location.LocationRequest;
import android.os.RemoteException;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.g;
import java.util.HashMap;
import android.content.ContentProviderClient;
import android.content.Context;

public class ca
{
    private final cg a;
    private final Context b;
    private ContentProviderClient c;
    private boolean d;
    private HashMap e;
    
    public ca(final Context b, final cg a) {
        this.c = null;
        this.d = false;
        this.e = new HashMap();
        this.b = b;
        this.a = a;
    }
    
    private cc a(final g g, final Looper looper) {
        if (looper == null) {
            ap.a(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
        }
        synchronized (this.e) {
            cc cc = this.e.get(g);
            if (cc == null) {
                cc = new cc(g, looper);
            }
            this.e.put(g, cc);
            return cc;
        }
    }
    
    public Location a() {
        this.a.a();
        try {
            return ((bx)this.a.c()).a(this.b.getPackageName());
        }
        catch (RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
    
    public void a(final LocationRequest locationRequest, final g g, final Looper looper) {
        this.a.a();
        ((bx)this.a.c()).a(locationRequest, this.a(g, looper));
    }
    
    public void a(final g g) {
        this.a.a();
        ap.a(g, "Invalid null listener");
        synchronized (this.e) {
            final cc cc = this.e.remove(g);
            if (this.c != null && this.e.isEmpty()) {
                this.c.release();
                this.c = null;
            }
            if (cc != null) {
                cc.a();
                ((bx)this.a.c()).a(cc);
            }
        }
    }
    
    public void a(final boolean d) {
        this.a.a();
        ((bx)this.a.c()).a(d);
        this.d = d;
    }
    
    public void b() {
        try {
            synchronized (this.e) {
                for (final cc cc : this.e.values()) {
                    if (cc != null) {
                        ((bx)this.a.c()).a(cc);
                    }
                }
            }
        }
        catch (RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
        this.e.clear();
    }
    // monitorexit(hashMap)
    
    public void c() {
        if (!this.d) {
            return;
        }
        try {
            this.a(false);
        }
        catch (RemoteException ex) {
            throw new IllegalStateException((Throwable)ex);
        }
    }
}
