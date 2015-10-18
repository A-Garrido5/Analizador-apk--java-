// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;
import android.view.View;
import com.google.android.maps.GeoPoint;
import java.util.ArrayList;
import android.view.View$OnClickListener;

class a implements View$OnClickListener
{
    final ArrayList a;
    final GroupChatLiveLocationsActivity b;
    final GeoPoint c;
    
    a(final GroupChatLiveLocationsActivity b, final ArrayList a, final GeoPoint c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public void onClick(final View view) {
        GroupChatLiveLocationsActivity.h(this.b).a(this.a);
        if (this.a.size() == 1) {
            GroupChatLiveLocationsActivity.a(this.b, this.a.get(0));
        }
        GroupChatLiveLocationsActivity.b(this.b).getController().animateTo(this.c);
        GroupChatLiveLocationsActivity.d(this.b);
    }
}
