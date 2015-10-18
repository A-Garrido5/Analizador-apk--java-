// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;
import com.whatsapp.protocol.bt;
import com.google.android.maps.GeoPoint;

class aor extends ao2
{
    boolean p;
    final GroupChatLiveLocationsActivity q;
    
    aor(final GroupChatLiveLocationsActivity q) {
        this.q = q;
    }
    
    @Override
    public void a() {
        GroupChatLiveLocationsActivity.d(this.q);
        GroupChatLiveLocationsActivity.a(this.q).a();
        if (!this.p && !GroupChatLiveLocationsActivity.h(this.q).g.isEmpty()) {
            this.p = true;
            GroupChatLiveLocationsActivity.f(this.q);
        }
        if (GroupChatLiveLocationsActivity.c(this.q) != null) {
            GroupChatLiveLocationsActivity.b(this.q).getController().animateTo(new GeoPoint((int)(1000000.0 * GroupChatLiveLocationsActivity.c(this.q).f), (int)(1000000.0 * GroupChatLiveLocationsActivity.c(this.q).c)));
        }
    }
    
    @Override
    public void a(final bt bt, final boolean b) {
        GroupChatLiveLocationsActivity.a(this.q, bt);
        GroupChatLiveLocationsActivity.b(this.q).getController().animateTo(new GeoPoint((int)(1000000.0 * bt.f), (int)(1000000.0 * bt.c)));
        if (b && GroupChatLiveLocationsActivity.b(this.q).getZoomLevel() < 17) {
            GroupChatLiveLocationsActivity.b(this.q).getController().setZoom(17);
        }
        GroupChatLiveLocationsActivity.d(this.q);
    }
    
    @Override
    public Location e() {
        final Location location = new Location("");
        final GeoPoint myLocation = GroupChatLiveLocationsActivity.g(this.q).getMyLocation();
        if (myLocation != null) {
            location.setLatitude(myLocation.getLatitudeE6() / 1000000.0);
            location.setLongitude(myLocation.getLongitudeE6() / 1000000.0);
        }
        return location;
    }
}
