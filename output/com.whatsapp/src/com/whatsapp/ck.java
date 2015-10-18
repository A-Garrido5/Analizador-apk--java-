// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.maps.MapView;
import android.graphics.Canvas;
import com.google.android.maps.GeoPoint;
import com.whatsapp.protocol.bt;
import com.google.android.maps.OverlayItem;
import com.google.android.maps.ItemizedOverlay;

class ck extends ItemizedOverlay
{
    final GroupChatLiveLocationsActivity a;
    
    public ck(final GroupChatLiveLocationsActivity a) {
        this.a = a;
        super(boundCenter(App.aq.getResources().getDrawable(2130838892)));
    }
    
    public void a() {
        this.populate();
    }
    
    protected OverlayItem createItem(final int n) {
        final bt bt = GroupChatLiveLocationsActivity.h(this.a).g.get(n);
        final OverlayItem overlayItem = new OverlayItem(new GeoPoint((int)(1000000.0 * bt.f), (int)(1000000.0 * bt.c)), "", "");
        if (1800000L + bt.d > System.currentTimeMillis()) {
            overlayItem.setMarker(boundCenter(App.aq.getResources().getDrawable(2130838892)));
            if (!App.I) {
                return overlayItem;
            }
        }
        overlayItem.setMarker(boundCenter(App.aq.getResources().getDrawable(2130838893)));
        return overlayItem;
    }
    
    public void draw(final Canvas canvas, final MapView mapView, final boolean b) {
        if (b) {
            return;
        }
        super.draw(canvas, mapView, b);
    }
    
    public int size() {
        return GroupChatLiveLocationsActivity.h(this.a).g.size();
    }
}
