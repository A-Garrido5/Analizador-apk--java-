// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class ahm implements Runnable
{
    final GroupChatLiveLocationsActivity a;
    
    ahm(final GroupChatLiveLocationsActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (GroupChatLiveLocationsActivity.h(this.a).g.size() == 0) {
            GroupChatLiveLocationsActivity.b(this.a).a(GroupChatLiveLocationsActivity.g(this.a).getMyLocation());
        }
    }
}
