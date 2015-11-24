// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

import com.twitter.library.av.l;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class r extends BroadcastReceiver
{
    final /* synthetic */ AVPlayer a;
    
    r(final AVPlayer a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            final l m = this.a.m();
            if (m != null) {
                m.b(false);
            }
            if (this.a.u()) {
                this.a.s();
            }
        }
        else if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            final l i = this.a.m();
            if (i != null) {
                i.b(true);
            }
        }
    }
}
