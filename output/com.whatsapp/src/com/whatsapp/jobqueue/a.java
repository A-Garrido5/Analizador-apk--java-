// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue;

import com.whatsapp.messaging.by;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Intent;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.aol;
import android.content.Context;
import com.whatsapp.messaging.MessageService;
import android.content.ServiceConnection;

public final class a implements ServiceConnection
{
    public static int d;
    private boolean a;
    private MessageService b;
    private final Context c;
    
    public a(final Context c) {
        this.c = c;
    }
    
    public MessageService a() {
        synchronized (this) {
            final int d = com.whatsapp.jobqueue.a.d;
            aol.b();
            this.c();
            MessageService messageService = this.b;
            while (messageService == null) {
                this.wait();
                messageService = this.b;
                if (d != 0) {
                    DialogToastActivity.h = !DialogToastActivity.h;
                    break;
                }
            }
            return messageService;
        }
    }
    
    public void b() {
        synchronized (this) {
            if (this.a) {
                this.c.unbindService((ServiceConnection)this);
                this.a = false;
            }
        }
    }
    
    public void c() {
        synchronized (this) {
            if (!this.a) {
                this.c.bindService(new Intent(this.c, (Class)MessageService.class), (ServiceConnection)this, 1);
                this.a = true;
            }
        }
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        synchronized (this) {
            final int d = com.whatsapp.jobqueue.a.d;
            this.b = ((by)binder).a();
            this.notifyAll();
            if (DialogToastActivity.h) {
                com.whatsapp.jobqueue.a.d = d + 1;
            }
        }
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        synchronized (this) {
            this.b = null;
        }
    }
}
