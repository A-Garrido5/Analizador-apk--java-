// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.content.Context;
import android.support.v4.app.NotificationManagerCompat;
import com.whatsapp.App;

class a_ implements Runnable
{
    final a2 a;
    
    a_(final a2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        NotificationManagerCompat.from((Context)App.aq).cancel(1);
    }
}
