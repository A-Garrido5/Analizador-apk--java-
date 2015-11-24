// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;
import com.google.android.maps.MapView;
import android.content.Context;

class aw6 extends awq
{
    final LocationPicker h;
    private int i;
    
    aw6(final LocationPicker h, final Context context, final MapView mapView) {
        this.h = h;
        super(context, mapView);
        this.i = -1;
    }
    
    public void onLocationChanged(final Location location) {
        final boolean i = App.I;
        super.onLocationChanged(location);
        if (location != null) {
            int max = 0;
            Label_0036: {
                if (location.hasAccuracy()) {
                    max = Math.max(1, (int)location.getAccuracy());
                    if (!i) {
                        break Label_0036;
                    }
                }
                max = -1;
            }
            Label_0126: {
                if (max != this.i) {
                    if ((this.i = max) > 0) {
                        LocationPicker.m(this.h).setVisibility(0);
                        LocationPicker.m(this.h).setText((CharSequence)String.format(App.C.a(2131296275, max), max));
                        if (!i) {
                            break Label_0126;
                        }
                    }
                    LocationPicker.m(this.h).setVisibility(8);
                }
            }
            boolean b;
            if (LocationPicker.a(this.h) != null && LocationPicker.a(this.h).h() != null && LocationPicker.o(this.h) && location.getAccuracy() < 200.0f && LocationPicker.a(this.h).h().distanceTo(location) > 1000.0f) {
                LocationPicker.a(this.h, false);
                b = true;
            }
            else {
                b = false;
            }
            LocationPicker.a(this.h, location);
            if ((LocationPicker.a(this.h) == null || b) && ((location.getAccuracy() < 200.0f && 60000L + location.getTime() > System.currentTimeMillis()) || LocationPicker.l(this.h))) {
                this.h.runOnUiThread((Runnable)new p6(this, b, location));
            }
        }
    }
}
