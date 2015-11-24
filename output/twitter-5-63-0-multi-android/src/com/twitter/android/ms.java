// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

class ms implements Runnable
{
    final /* synthetic */ NotificationSettingsActivity a;
    
    ms(final NotificationSettingsActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(true);
    }
}
