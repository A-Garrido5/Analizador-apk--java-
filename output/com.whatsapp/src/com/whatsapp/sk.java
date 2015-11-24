// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.fieldstats.aa;
import java.io.Serializable;
import android.content.Intent;
import android.content.Context;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.GoogleMap$OnInfoWindowClickListener;

class sk implements GoogleMap$OnInfoWindowClickListener
{
    private static final String z;
    final LocationPicker2 a;
    
    static {
        final char[] charArray = "\u0006-{\u0019_".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ':';
                    break;
                }
                case 0: {
                    c2 = 'v';
                    break;
                }
                case 1: {
                    c2 = 'A';
                    break;
                }
                case 2: {
                    c2 = '\u001a';
                    break;
                }
                case 3: {
                    c2 = 'z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    sk(final LocationPicker2 a) {
        this.a = a;
    }
    
    @Override
    public void onInfoWindowClick(final Marker marker) {
        final boolean i = App.I;
        if (marker.getId() != null) {
            while (true) {
                for (final PlaceInfo placeInfo : LocationPicker2.k(this.a).d()) {
                    if (marker.equals(placeInfo.tag)) {
                        if (placeInfo != null) {
                            Label_0125: {
                                if (LocationPicker2.t(this.a) != null) {
                                    App.a((Context)this.a, LocationPicker2.t(this.a), placeInfo);
                                    if (!i) {
                                        break Label_0125;
                                    }
                                }
                                final Intent intent = new Intent();
                                intent.putExtra(sk.z, (Serializable)placeInfo);
                                this.a.setResult(-1, intent);
                            }
                            LocationPicker2.a(this.a, aa.PLACE);
                            this.a.finish();
                        }
                        return;
                    }
                }
                PlaceInfo placeInfo = null;
                continue;
            }
        }
    }
}
