// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class awv implements Runnable
{
    final i1 a;
    
    awv(final i1 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        GroupChatLiveLocationsActivity.b(this.a.a).getController().animateTo(GroupChatLiveLocationsActivity.g(this.a.a).getMyLocation());
        if (GroupChatLiveLocationsActivity.b(this.a.a).getZoomLevel() < 17) {
            GroupChatLiveLocationsActivity.b(this.a.a).getController().setZoom(17);
        }
    }
}
