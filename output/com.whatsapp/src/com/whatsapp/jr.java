// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.location.Address;

class jr implements Runnable
{
    final Address a;
    final aog b;
    final StringBuilder c;
    final TextView d;
    
    jr(final aog b, final Address a, final StringBuilder c, final TextView d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        if (this.a.getMaxAddressLineIndex() > 0) {
            LocationPicker2.p(this.b.c).name = this.a.getAddressLine(0);
        }
        LocationPicker2.p(this.b.c).address = this.c.toString();
        this.d.setText((CharSequence)this.c.toString());
    }
}
