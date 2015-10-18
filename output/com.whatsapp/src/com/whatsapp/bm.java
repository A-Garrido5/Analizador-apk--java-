// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class bm implements Runnable
{
    final _1 a;
    
    bm(final _1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GroupChatRecentLocationsActivity.i(this.a.a.a).setText((CharSequence)this.a.a.a.getString(2131231382));
    }
}
