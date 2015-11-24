// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.cr;
import android.graphics.Bitmap;
import com.google.android.gms.maps.internal.bn;
import com.google.android.gms.maps.internal.bk;
import com.google.android.gms.maps.internal.bb;
import com.google.android.gms.maps.internal.av;
import com.google.android.gms.maps.internal.aj;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.internal.w;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.MarkerOptions;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.internal.ap;
import com.google.android.gms.maps.internal.d;

public final class c
{
    private final d a;
    private af b;
    
    protected c(final d d) {
        this.a = (d)ap.a(d);
    }
    
    d a() {
        return this.a;
    }
    
    public final com.google.android.gms.maps.model.d a(final CircleOptions circleOptions) {
        try {
            return new com.google.android.gms.maps.model.d(this.a.a(circleOptions));
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final f a(final MarkerOptions markerOptions) {
        try {
            final w a = this.a.a(markerOptions);
            if (a != null) {
                return new f(a);
            }
            return null;
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void a(final int n, final int n2, final int n3, final int n4) {
        try {
            this.a.a(n, n2, n3, n4);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void a(final a a) {
        try {
            this.a.a(a.a());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void a(final a a, final int n, final i i) {
        try {
            final d a2 = this.a;
            final k a3 = a.a();
            aj aj;
            if (i == null) {
                aj = null;
            }
            else {
                aj = new o(i);
            }
            a2.a(a3, n, aj);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void a(final j j) {
        Label_0015: {
            if (j != null) {
                break Label_0015;
            }
            try {
                this.a.a((av)null);
                return;
                this.a.a(new g(this, j));
            }
            catch (RemoteException ex) {
                throw new RuntimeRemoteException(ex);
            }
        }
    }
    
    public final void a(final com.google.android.gms.maps.k k) {
        Label_0015: {
            if (k != null) {
                break Label_0015;
            }
            try {
                this.a.a((bb)null);
                return;
                this.a.a(new com.google.android.gms.maps.d(this, k));
            }
            catch (RemoteException ex) {
                throw new RuntimeRemoteException(ex);
            }
        }
    }
    
    public void a(final l l) {
        Label_0015: {
            if (l != null) {
                break Label_0015;
            }
            try {
                this.a.a((bk)null);
                return;
                this.a.a(new e(this, l));
            }
            catch (RemoteException ex) {
                throw new RuntimeRemoteException(ex);
            }
        }
    }
    
    public final void a(final m m) {
        Label_0015: {
            if (m != null) {
                break Label_0015;
            }
            try {
                this.a.a((bn)null);
                return;
                this.a.a(new h(this, m));
            }
            catch (RemoteException ex) {
                throw new RuntimeRemoteException(ex);
            }
        }
    }
    
    public final void a(final n n) {
        this.a(n, null);
    }
    
    public final void a(final n n, final Bitmap bitmap) {
        Label_0039: {
            if (bitmap == null) {
                break Label_0039;
            }
            k a = com.google.android.gms.dynamic.n.a(bitmap);
            while (true) {
                final com.google.android.gms.dynamic.n n2 = (com.google.android.gms.dynamic.n)a;
                try {
                    this.a.a(new com.google.android.gms.maps.f(this, n), n2);
                    return;
                    a = null;
                }
                catch (RemoteException ex) {
                    throw new RuntimeRemoteException(ex);
                }
            }
        }
    }
    
    public final void a(final boolean b) {
        try {
            this.a.c(b);
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void b() {
        try {
            this.a.e();
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final void b(final a a) {
        try {
            this.a.b(a.a());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
    
    public final af c() {
        try {
            if (this.b == null) {
                this.b = new af(this.a.k());
            }
            return this.b;
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
