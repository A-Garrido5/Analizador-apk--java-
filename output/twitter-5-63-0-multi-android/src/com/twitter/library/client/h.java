// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;

class h implements CompoundButton$OnCheckedChangeListener
{
    final /* synthetic */ AbsPreferenceActivity a;
    final /* synthetic */ g b;
    
    h(final g b, final AbsPreferenceActivity a) {
        this.b = b;
        this.a = a;
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        boolean b2 = true;
        if (!this.b.b.a(b, b2)) {
            final g b3 = this.b;
            if (b) {
                b2 = false;
            }
            b3.b(b2);
        }
    }
}
