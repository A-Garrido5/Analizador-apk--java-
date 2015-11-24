// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.d;
import com.google.android.gms.common.a;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Collection;
import android.content.Context;
import java.util.ArrayList;
import android.util.Log;
import com.google.android.gms.common.api.p;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class v extends Handler
{
    final /* synthetic */ u a;
    
    public v(final u a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public void handleMessage(final Message message) {
        if (message.what == 1) {
            synchronized (this.a.c) {
                if (this.a.b.b_() && this.a.b.c() && this.a.c.contains(message.obj)) {
                    ((p)message.obj).a(this.a.b.a_());
                }
                return;
            }
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
    }
}
