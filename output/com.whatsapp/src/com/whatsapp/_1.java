// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class _1 implements Runnable
{
    final r3 a;
    
    _1(final r3 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GroupChatRecentLocationsActivity.f(this.a.a).getController().animateTo(GroupChatRecentLocationsActivity.k(this.a.a).getMyLocation());
        GroupChatRecentLocationsActivity.f(this.a.a).getController().setZoom(17);
        this.a.a.runOnUiThread((Runnable)new bm(this));
    }
}
