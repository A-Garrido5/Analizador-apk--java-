// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.appwidget.WidgetProvider;

final class cu implements Runnable
{
    final a_9 a;
    
    cu(final a_9 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.b(new pq(this));
        App.d(this.a.u);
        WidgetProvider.a((Context)App.aq);
        App.s();
    }
}
