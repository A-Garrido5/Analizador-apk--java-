// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;

class j implements Runnable
{
    final String a;
    final a2 b;
    
    j(final a2 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        NotificationManagerCompat.from((Context)App.aq).cancel(this.a, 1);
    }
}
