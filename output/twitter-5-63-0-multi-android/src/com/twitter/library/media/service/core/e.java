// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import android.os.Looper;
import android.os.HandlerThread;
import android.content.Context;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Intent;
import java.util.HashMap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import android.os.Messenger;
import android.content.ServiceConnection;

class e implements ServiceConnection
{
    final /* synthetic */ MediaServiceClient a;
    private Messenger b;
    private final SparseArray c;
    
    private e(final MediaServiceClient a) {
        this.a = a;
        this.c = new SparseArray();
    }
    
    private void c(final g g) {
        final HashMap c = this.a.c;
        final Message obtain;
        synchronized (c) {
            this.a.c.put(g.a, g);
            // monitorexit(c)
            obtain = Message.obtain((Handler)null, g.b, g.a, 0, (Object)null);
            obtain.setData(g.c);
            obtain.replyTo = this.a.c();
            final e e = this;
            final Messenger messenger = e.b;
            final Message message = obtain;
            messenger.send(message);
            return;
        }
        try {
            final e e = this;
            final Messenger messenger = e.b;
            final Message message = obtain;
            messenger.send(message);
        }
        catch (Exception ex) {
            synchronized (this.a.c) {
                this.a.c.remove(g.a);
                // monitorexit(MediaServiceClient.c(this.a))
                b(g, null);
            }
        }
    }
    
    public void a() {
        this.a.b.bindService(new Intent(this.a.b, (Class)MediaService.class), (ServiceConnection)this, 1);
    }
    
    public void a(final g g) {
        synchronized (this) {
            if (this.b != null) {
                this.c(g);
            }
            else {
                this.c.put(g.a, (Object)g);
            }
        }
    }
    
    public void b(final g g) {
        synchronized (this) {
            this.c.remove(g.a);
        }
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        synchronized (this) {
            this.b = new Messenger(binder);
            if (this.c.size() > 0) {
                for (int i = 0; i < this.c.size(); ++i) {
                    this.c((g)this.c.valueAt(i));
                }
                this.c.clear();
            }
            this.a.a();
        }
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        while (true) {
            while (true) {
                Label_0119: {
                    synchronized (this) {
                        this.b = null;
                        synchronized (this.a.c) {
                            if (this.a.c.size() <= 0) {
                                break Label_0119;
                            }
                            final ArrayList<g> list = new ArrayList<g>(this.a.c.values());
                            this.a.c.clear();
                            // monitorexit(MediaServiceClient.c(this.a))
                            // monitorexit(this)
                            if (list != null) {
                                final Iterator<g> iterator = list.iterator();
                                while (iterator.hasNext()) {
                                    b(iterator.next(), null);
                                }
                                break;
                            }
                            break;
                        }
                    }
                    break;
                }
                final ArrayList<g> list = null;
                continue;
            }
        }
        this.a();
    }
}
