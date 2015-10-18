// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.internal.ap;

public abstract class l extends j implements af
{
    private final h b;
    private final n c;
    private ad d;
    
    protected l(final h h, final n c) {
        super(c.a());
        this.b = (h)ap.a(h);
        this.c = c;
    }
    
    private void a(final RemoteException ex) {
        this.b(new Status(8, ex.getLocalizedMessage(), null));
    }
    
    @Override
    public void a(final ad d) {
        this.d = d;
    }
    
    @Override
    public final void a(final e e) {
        try {
            this.b(e);
        }
        catch (DeadObjectException ex) {
            this.a((RemoteException)ex);
            throw ex;
        }
        catch (RemoteException ex2) {
            this.a(ex2);
        }
    }
    
    @Override
    public final void b(final Status status) {
        ap.b(!status.e(), (Object)"Failed result must not be success");
        this.a(this.a(status));
    }
    
    protected abstract void b(final e p0);
    
    @Override
    protected void c() {
        super.c();
        if (this.d != null) {
            this.d.a(this);
            this.d = null;
        }
    }
    
    @Override
    public final h d() {
        return this.b;
    }
    
    @Override
    public int e() {
        return 0;
    }
}
