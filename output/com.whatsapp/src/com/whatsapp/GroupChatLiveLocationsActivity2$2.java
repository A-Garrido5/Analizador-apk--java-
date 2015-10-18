// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;
import android.view.MotionEvent;
import com.google.android.gms.maps.GoogleMapOptions;
import android.content.Context;

class GroupChatLiveLocationsActivity2$2 extends GoogleMapView2
{
    final GroupChatLiveLocationsActivity2 n;
    
    GroupChatLiveLocationsActivity2$2(final GroupChatLiveLocationsActivity2 n, final Context context, final GoogleMapOptions googleMapOptions) {
        this.n = n;
        super(context, googleMapOptions);
    }
    
    @Override
    public void a(final int n) {
        final boolean i = App.I;
        GroupChatLiveLocationsActivity2.b(this.n, true);
        Label_0073: {
            switch (n) {
                case 0: {
                    GroupChatLiveLocationsActivity2.c(this.n).setImageResource(2130837627);
                    if (i) {
                        break Label_0073;
                    }
                    break;
                }
                case 1: {
                    GroupChatLiveLocationsActivity2.c(this.n).setImageResource(2130837668);
                    if (i) {
                        break Label_0073;
                    }
                    break;
                }
                case 2: {
                    GroupChatLiveLocationsActivity2.c(this.n).setImageResource(2130837667);
                }
            }
        }
    }
    
    @Override
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        GroupChatLiveLocationsActivity2.b(this.n, true);
        GroupChatLiveLocationsActivity2.a(this.n, null);
        return super.dispatchTouchEvent(motionEvent);
    }
}
