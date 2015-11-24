// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class sg extends sj
{
    final Broadcasts a;
    
    sg(final Broadcasts a) {
        this.a = a;
    }
    
    @Override
    public void a(final bi bi, final int n) {
        if (bi != null && bi.x && bi.a.b) {
            Broadcasts.a(this.a).a();
        }
    }
    
    @Override
    public void a(final String s) {
        if (a_9.d(s)) {
            Broadcasts.a(this.a).a();
        }
    }
    
    @Override
    public void b(final bi bi, final int n) {
        if (bi != null && bi.x && bi.a.b) {
            Broadcasts.a(this.a).notifyDataSetChanged();
        }
    }
}
