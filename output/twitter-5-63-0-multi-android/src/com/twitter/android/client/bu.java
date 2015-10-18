// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.Handler;
import android.database.ContentObserver;

public final class bu extends ContentObserver
{
    final /* synthetic */ TwitterListFragment a;
    
    public bu(final TwitterListFragment a, final Handler handler) {
        this.a = a;
        super(handler);
    }
    
    public boolean deliverSelfNotifications() {
        return true;
    }
    
    public void onChange(final boolean b) {
        if (!this.a.at()) {
            this.a.h();
        }
    }
}
