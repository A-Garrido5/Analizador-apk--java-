// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class gk implements View$OnClickListener
{
    final VoipActivity a;
    
    gk(final VoipActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final View viewById = this.a.findViewById(2131755827);
        final View viewById2 = this.a.findViewById(2131755824);
        if (viewById != null) {
            if (viewById.getVisibility() == 0) {
                viewById.setVisibility(8);
                viewById2.setVisibility(0);
                if (!App.I) {
                    return;
                }
            }
            viewById.setVisibility(0);
            viewById2.setVisibility(8);
        }
    }
}
