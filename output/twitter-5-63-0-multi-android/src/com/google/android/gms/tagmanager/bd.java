// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.content.SharedPreferences$Editor;

final class bd implements Runnable
{
    final /* synthetic */ SharedPreferences$Editor a;
    
    bd(final SharedPreferences$Editor a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.commit();
    }
}
