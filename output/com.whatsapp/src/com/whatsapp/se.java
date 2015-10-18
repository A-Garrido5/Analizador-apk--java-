// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.ax;
import com.whatsapp.protocol.bi;

class se extends sj
{
    final BroadcastDetails a;
    
    se(final BroadcastDetails a) {
        this.a = a;
    }
    
    @Override
    public void b(final bi bi, final int n) {
        if (bi != null && bi.a.c.equals(BroadcastDetails.b(this.a).a.c) && ax.a(BroadcastDetails.d(this.a), bi.a.a) && bi.a.b) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }
}
