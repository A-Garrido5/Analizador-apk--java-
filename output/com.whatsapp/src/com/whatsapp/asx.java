// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.maps.OverlayItem;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.ItemizedOverlay$OnFocusChangeListener;

class asx implements ItemizedOverlay$OnFocusChangeListener
{
    final aso a;
    final LocationPicker b;
    
    asx(final aso a, final LocationPicker b) {
        this.a = a;
        this.b = b;
    }
    
    public void onFocusChanged(final ItemizedOverlay itemizedOverlay, final OverlayItem overlayItem) {
        if (overlayItem == null) {
            LocationPicker.a(this.a.a, (PlaceInfo)null);
            LocationPicker.b(this.a.a).notifyDataSetChanged();
        }
    }
}
