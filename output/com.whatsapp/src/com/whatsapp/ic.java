// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.view.View;
import android.view.View$OnClickListener;

class ic implements View$OnClickListener
{
    final WebImagePicker a;
    
    ic(final WebImagePicker a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        final String s = (String)view.getTag();
        if (s != null && WebImagePicker.a(this.a) != null) {
            for (final u0 u0 : WebImagePicker.d(this.a)) {
                if (s.equals(u0.c)) {
                    WebImagePicker.a(this.a, u0);
                    if (!i) {
                        break;
                    }
                }
                if (i) {
                    return;
                }
            }
        }
    }
}
