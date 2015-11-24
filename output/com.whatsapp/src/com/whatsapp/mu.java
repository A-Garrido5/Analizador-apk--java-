// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.o;

class mu implements Runnable
{
    final Conversation a;
    
    mu(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (al5.d()) {
            a5.a((Context)App.aq, o.IS_MONKEYRUNNER_RUNNING, Boolean.valueOf(true));
        }
    }
}
