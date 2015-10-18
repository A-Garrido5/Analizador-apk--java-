// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;

class v9 implements Runnable
{
    final AlarmService a;
    
    v9(final AlarmService a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        AlarmService.a(this.a, null);
    }
}
