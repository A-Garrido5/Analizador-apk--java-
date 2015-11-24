// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.bq;
import android.view.View;
import com.whatsapp.util.co;

class a0_ extends co
{
    final CallLogActivity b;
    
    a0_(final CallLogActivity b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        if (App.a(CallLogActivity.b(this.b), this.b, bq.CALL_INFO)) {
            this.b.finish();
        }
    }
}
