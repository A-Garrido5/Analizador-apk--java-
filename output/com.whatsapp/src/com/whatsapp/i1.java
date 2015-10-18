// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.view.ViewGroup;
import com.whatsapp.protocol.bt;
import android.view.View;
import android.view.View$OnClickListener;

class i1 implements View$OnClickListener
{
    final GroupChatLiveLocationsActivity a;
    
    i1(final GroupChatLiveLocationsActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        GroupChatLiveLocationsActivity.a(this.a, null);
        GroupChatLiveLocationsActivity.h(this.a).f();
        final Iterator<View> iterator = GroupChatLiveLocationsActivity.e(this.a).iterator();
        while (iterator.hasNext()) {
            ((ViewGroup)iterator.next()).getChildAt(0).setSelected(false);
            if (i) {
                break;
            }
        }
        GroupChatLiveLocationsActivity.g(this.a).runOnFirstFix((Runnable)new awv(this));
    }
}
