// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import android.content.Context;

final class a implements Runnable
{
    final Context a;
    
    a(final Context a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        PerformSyncManager.e(this.a);
    }
}
