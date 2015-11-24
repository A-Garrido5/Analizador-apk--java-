// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import com.google.android.maps.MapView;
import android.graphics.Canvas;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;
import com.google.android.maps.ItemizedOverlay$OnFocusChangeListener;
import com.google.android.maps.ItemizedOverlay;

class aso extends ItemizedOverlay
{
    final LocationPicker a;
    
    public aso(final LocationPicker a) {
        this.a = a;
        super(boundCenter(App.aq.getResources().getDrawable(2130839069)));
        this.setOnFocusChangeListener((ItemizedOverlay$OnFocusChangeListener)new asx(this, a));
    }
    
    public void a() {
        this.setLastFocusedIndex(-1);
        this.populate();
    }
    
    protected OverlayItem createItem(final int n) {
        final PlaceInfo a = LocationPicker.a(this.a).a(n);
        final OverlayItem overlayItem = new OverlayItem(new GeoPoint((int)(1000000.0 * a.lat), (int)(1000000.0 * a.lon)), "", "");
        overlayItem.setMarker(boundCenter(App.aq.getResources().getDrawable(2130839069)));
        return overlayItem;
    }
    
    public void draw(final Canvas canvas, final MapView mapView, final boolean b) {
        if (b) {
            return;
        }
        super.draw(canvas, mapView, b);
    }
    
    protected boolean onTap(final int selection) {
        LocationPicker.a(this.a, LocationPicker.a(this.a).a(selection));
        LocationPicker.b(this.a).notifyDataSetChanged();
        if (Build$VERSION.SDK_INT >= 8) {
            LocationPicker.i(this.a).smoothScrollToPosition(selection);
            if (!App.I) {
                return true;
            }
        }
        LocationPicker.i(this.a).setSelection(selection);
        return true;
    }
    
    public int size() {
        if (LocationPicker.a(this.a) == null) {
            return 0;
        }
        return LocationPicker.a(this.a).e();
    }
}
