// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.maps.MapView;
import android.graphics.Canvas;
import com.google.android.maps.GeoPoint;
import com.whatsapp.protocol.bi;
import com.google.android.maps.OverlayItem;
import com.google.android.maps.ItemizedOverlay;

class h2 extends ItemizedOverlay
{
    final GroupChatRecentLocationsActivity a;
    
    public h2(final GroupChatRecentLocationsActivity a) {
        this.a = a;
        super(boundCenter(App.aq.getResources().getDrawable(2130838892)));
    }
    
    public void a() {
        this.populate();
    }
    
    protected OverlayItem createItem(final int n) {
        final boolean i = App.I;
        final bi bi = GroupChatRecentLocationsActivity.d(this.a).get(n);
        final OverlayItem overlayItem = new OverlayItem(new GeoPoint((int)(1000000.0 * bi.p), (int)(1000000.0 * bi.G)), "", "");
        if (3600000L + bi.u > System.currentTimeMillis()) {
            overlayItem.setMarker(boundCenter(App.aq.getResources().getDrawable(2130838892)));
            if (!i) {
                return overlayItem;
            }
        }
        if (43200000L + bi.u > System.currentTimeMillis()) {
            overlayItem.setMarker(boundCenter(App.aq.getResources().getDrawable(2130838893)));
            if (!i) {
                return overlayItem;
            }
        }
        overlayItem.setMarker(boundCenter(App.aq.getResources().getDrawable(2130838894)));
        return overlayItem;
    }
    
    public void draw(final Canvas canvas, final MapView mapView, final boolean b) {
        if (b) {
            return;
        }
        super.draw(canvas, mapView, b);
    }
    
    public int size() {
        return GroupChatRecentLocationsActivity.d(this.a).size();
    }
}
