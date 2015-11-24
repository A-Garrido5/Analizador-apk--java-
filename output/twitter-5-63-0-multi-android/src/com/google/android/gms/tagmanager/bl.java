// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.os.Message;
import android.os.Handler;

class bl extends Handler
{
    final /* synthetic */ bj a;
    private final c b;
    
    protected void a(final String s) {
        this.b.a(this.a, s);
    }
    
    public void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                z.a("Don't know how to handle this message.");
            }
            case 1: {
                this.a((String)message.obj);
            }
        }
    }
}
