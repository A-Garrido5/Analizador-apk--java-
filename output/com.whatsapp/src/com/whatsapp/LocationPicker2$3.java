// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.GoogleMapOptions;
import android.content.Context;

class LocationPicker2$3 extends GoogleMapView2
{
    final LocationPicker2 n;
    
    LocationPicker2$3(final LocationPicker2 n, final Context context, final GoogleMapOptions googleMapOptions) {
        this.n = n;
        super(context, googleMapOptions);
    }
    
    @Override
    public void a(final int n) {
        final boolean i = App.I;
        Label_0065: {
            switch (n) {
                case 0: {
                    LocationPicker2.e(this.n).setImageResource(2130837627);
                    if (i) {
                        break Label_0065;
                    }
                    break;
                }
                case 1: {
                    LocationPicker2.e(this.n).setImageResource(2130837668);
                    if (i) {
                        break Label_0065;
                    }
                    break;
                }
                case 2: {
                    LocationPicker2.e(this.n).setImageResource(2130837667);
                }
            }
        }
    }
}
