// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class _v implements Runnable
{
    final WebSessionsActivity a;
    
    _v(final WebSessionsActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        WebSessionsActivity.c(this.a).notifyDataSetChanged();
        App.aq.a5().postDelayed(WebSessionsActivity.e(this.a), 30000L);
    }
}
