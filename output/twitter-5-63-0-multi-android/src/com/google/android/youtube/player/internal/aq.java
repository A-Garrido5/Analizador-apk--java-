// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.content.Intent;
import com.google.android.youtube.player.a;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import com.google.android.youtube.player.YouTubeInitializationResult;
import android.os.Looper;
import android.content.ServiceConnection;
import java.util.ArrayList;
import android.os.IInterface;
import android.content.Context;
import android.os.Handler;

public abstract class aq implements ay
{
    final Handler a;
    private final Context b;
    private IInterface c;
    private ArrayList d;
    private final ArrayList e;
    private boolean f;
    private ArrayList g;
    private boolean h;
    private final ArrayList i;
    private ServiceConnection j;
    private boolean k;
    
    protected aq(final Context context, final az az, final ba ba) {
        this.e = new ArrayList();
        this.f = false;
        this.h = false;
        this.i = new ArrayList();
        this.k = false;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Clients must be created on the UI thread.");
        }
        this.b = (Context)com.google.android.youtube.player.internal.c.a(context);
        (this.d = new ArrayList()).add(com.google.android.youtube.player.internal.c.a(az));
        (this.g = new ArrayList()).add(com.google.android.youtube.player.internal.c.a(ba));
        this.a = new as(this);
    }
    
    private static YouTubeInitializationResult b(final String s) {
        try {
            return YouTubeInitializationResult.valueOf(s);
        }
        catch (IllegalArgumentException ex) {
            return YouTubeInitializationResult.c;
        }
        catch (NullPointerException ex2) {
            return YouTubeInitializationResult.c;
        }
    }
    
    protected abstract IInterface a(final IBinder p0);
    
    protected final void a(final YouTubeInitializationResult youTubeInitializationResult) {
        while (true) {
            this.a.removeMessages(4);
            while (true) {
                int n;
                synchronized (this.g) {
                    this.h = true;
                    final ArrayList g = this.g;
                    final int size = g.size();
                    n = 0;
                    if (n >= size) {
                        this.h = false;
                        return;
                    }
                    if (!this.k) {
                        return;
                    }
                    if (this.g.contains(g.get(n))) {
                        g.get(n).a(youTubeInitializationResult);
                    }
                }
                ++n;
                continue;
            }
        }
    }
    
    protected abstract void a(final ac p0, final av p1);
    
    protected abstract String b();
    
    protected final void b(final IBinder binder) {
        try {
            this.a(ad.a(binder), new av(this));
        }
        catch (RemoteException ex) {
            Log.w("YouTubeClient", "service died");
        }
    }
    
    protected abstract String c();
    
    @Override
    public void d() {
        this.h();
        this.k = false;
        synchronized (this.i) {
            for (int size = this.i.size(), i = 0; i < size; ++i) {
                ((at)this.i.get(i)).b();
            }
            this.i.clear();
            // monitorexit(this.i)
            this.c = null;
            if (this.j != null) {
                this.b.unbindService(this.j);
                this.j = null;
            }
        }
    }
    
    @Override
    public final void e() {
        this.k = true;
        final YouTubeInitializationResult a = com.google.android.youtube.player.a.a(this.b);
        if (a != YouTubeInitializationResult.a) {
            this.a.sendMessage(this.a.obtainMessage(3, (Object)a));
        }
        else {
            final Intent intent = new Intent(this.c());
            if (this.j != null) {
                Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
                this.c = null;
                this.b.unbindService(this.j);
            }
            this.j = (ServiceConnection)new aw(this);
            if (!this.b.bindService(intent, this.j, 129)) {
                this.a.sendMessage(this.a.obtainMessage(3, (Object)YouTubeInitializationResult.h));
            }
        }
    }
    
    public final boolean f() {
        return this.c != null;
    }
    
    protected final void g() {
    Label_0047_Outer:
        while (true) {
            boolean b = true;
            while (true) {
            Label_0163:
                while (true) {
                    Label_0157: {
                        while (true) {
                            int n;
                            synchronized (this.d) {
                                if (this.f) {
                                    break Label_0157;
                                }
                                final boolean b2 = b;
                                com.google.android.youtube.player.internal.c.a(b2);
                                this.a.removeMessages(4);
                                this.f = true;
                                if (this.e.size() != 0) {
                                    break Label_0163;
                                }
                                com.google.android.youtube.player.internal.c.a(b);
                                final ArrayList d = this.d;
                                final int size = d.size();
                                n = 0;
                                if (n >= size || !this.k || !this.f()) {
                                    this.e.clear();
                                    this.f = false;
                                    return;
                                }
                                this.e.size();
                                if (!this.e.contains(d.get(n))) {
                                    d.get(n).a();
                                }
                            }
                            ++n;
                            continue;
                        }
                    }
                    final boolean b2 = false;
                    continue Label_0047_Outer;
                }
                b = false;
                continue;
            }
        }
    }
    
    protected final void h() {
        while (true) {
            this.a.removeMessages(4);
            while (true) {
                int n;
                synchronized (this.d) {
                    this.f = true;
                    final ArrayList d = this.d;
                    final int size = d.size();
                    n = 0;
                    if (n >= size || !this.k) {
                        this.f = false;
                        return;
                    }
                    if (this.d.contains(d.get(n))) {
                        d.get(n).b();
                    }
                }
                ++n;
                continue;
            }
        }
    }
    
    protected final void i() {
        if (!this.f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
    
    protected final IInterface j() {
        this.i();
        return this.c;
    }
}
