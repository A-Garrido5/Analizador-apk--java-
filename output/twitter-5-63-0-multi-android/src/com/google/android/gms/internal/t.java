// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.d;
import android.util.Log;
import com.google.android.gms.common.api.p;
import java.util.ArrayList;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.e;
import android.os.RemoteException;
import com.google.android.gms.common.a;
import android.app.PendingIntent;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Bundle;

public final class t extends q
{
    public final int b;
    public final Bundle c;
    public final IBinder d;
    final /* synthetic */ o e;
    
    public t(final o e, final int b, final IBinder d, final Bundle c) {
        this.e = e;
        super(e, true);
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    protected void a() {
    }
    
    protected void a(final Boolean b) {
        if (b == null) {
            this.e.a(1, null);
            return;
        }
        switch (this.b) {
            default: {
                PendingIntent pendingIntent;
                if (this.c != null) {
                    pendingIntent = (PendingIntent)this.c.getParcelable("pendingIntent");
                }
                else {
                    pendingIntent = null;
                }
                if (this.e.i != null) {
                    x.a(this.e.d).b(this.e.d(), this.e.i);
                    this.e.i = null;
                }
                this.e.a(1, null);
                this.e.l.a(new a(this.b, pendingIntent));
            }
            case 0: {
                try {
                    if (this.e.e().equals(this.d.getInterfaceDescriptor())) {
                        final IInterface a = this.e.a(this.d);
                        if (a != null) {
                            this.e.a(3, a);
                            this.e.l.a();
                            return;
                        }
                    }
                }
                catch (RemoteException ex) {}
                x.a(this.e.d).b(this.e.d(), this.e.i);
                this.e.i = null;
                this.e.a(1, null);
                this.e.l.a(new a(8, null));
            }
            case 10: {
                this.e.a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
        }
    }
}
