// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Message;
import android.os.Handler;
import java.util.HashMap;
import android.content.Context;
import android.os.Handler$Callback;

public final class x implements Handler$Callback
{
    private static final Object a;
    private static x b;
    private final Context c;
    private final HashMap d;
    private final Handler e;
    
    static {
        a = new Object();
    }
    
    private x(final Context context) {
        this.e = new Handler(context.getMainLooper(), (Handler$Callback)this);
        this.d = new HashMap();
        this.c = context.getApplicationContext();
    }
    
    public static x a(final Context context) {
        synchronized (x.a) {
            if (x.b == null) {
                x.b = new x(context.getApplicationContext());
            }
            return x.b;
        }
    }
    
    public boolean a(final String s, final s s2) {
        while (true) {
            while (true) {
                y y;
                synchronized (this.d) {
                    y = this.d.get(s);
                    if (y == null) {
                        y = new y(this, s);
                        y.a(s2);
                        y.a();
                        this.d.put(s, y);
                        return y.d();
                    }
                    this.e.removeMessages(0, (Object)y);
                    if (y.c(s2)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=" + s);
                    }
                }
                y.a(s2);
                switch (y.e()) {
                    case 1: {
                        s2.onServiceConnected(y.h(), y.g());
                        continue;
                    }
                    case 2: {
                        y.a();
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public void b(final String s, final s s2) {
        final y y;
        synchronized (this.d) {
            y = this.d.get(s);
            if (y == null) {
                throw new IllegalStateException("Nonexistent connection status for service action: " + s);
            }
        }
        if (!y.c(s2)) {
            throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=" + s);
        }
        y.b(s2);
        if (y.f()) {
            this.e.sendMessageDelayed(this.e.obtainMessage(0, (Object)y), 5000L);
        }
    }
    // monitorexit(hashMap)
    
    public boolean handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return false;
            }
            case 0: {
                final y y = (y)message.obj;
                synchronized (this.d) {
                    if (y.f()) {
                        y.b();
                        this.d.remove(y.c());
                    }
                    return true;
                }
                break;
            }
        }
    }
}
