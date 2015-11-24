// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.Context;
import android.os.Handler;

class ac implements Runnable
{
    final /* synthetic */ ab a;
    
    ac(final ab a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(true);
    }
}
