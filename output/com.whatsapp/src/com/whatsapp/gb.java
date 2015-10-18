// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;
import com.whatsapp.util.ax;

class gb implements aws
{
    final BroadcastDetails a;
    
    gb(final BroadcastDetails a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        BroadcastDetails.c(this.a).notifyDataSetChanged();
    }
    
    @Override
    public void a(final String s) {
        if (ax.a(BroadcastDetails.d(this.a), s)) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        if (ax.a(BroadcastDetails.d(this.a), s)) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }
    
    @Override
    public void c(final String s) {
        if (ax.a(BroadcastDetails.d(this.a), s)) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }
    
    @Override
    public void d(final String s) {
        if (ax.a(BroadcastDetails.d(this.a), s)) {
            BroadcastDetails.c(this.a).notifyDataSetChanged();
        }
    }
}
