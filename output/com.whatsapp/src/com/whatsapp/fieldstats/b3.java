// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class b3 extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.LOCATION_PICKER.getCode()));
        a5.a(context, o.LOCATION_PICKER_FULL_SCREEN, this.b);
        a5.a(context, o.LOCATION_PICKER_OUT_OF_QUOTA, this.g);
        a5.a(context, o.LOCATION_PICKER_PLACES_RESPONSE, this.e);
        a5.a(context, o.LOCATION_PICKER_PLACES_SOURCE, this.c);
        a5.a(context, o.LOCATION_PICKER_RESULT_TYPE, this.h);
        if (this.a != null) {
            a5.a(context, a1.LOCATION_PICKER_PLACES_COUNT, this.a);
        }
        if (this.f != null) {
            a5.a(context, a1.LOCATION_PICKER_SELECTED_PLACE_INDEX, this.f);
        }
        if (this.d != null) {
            a5.a(context, a1.LOCATION_PICKER_SPEND_T, this.d);
        }
        a5.a(context, o.EVENT);
    }
}
