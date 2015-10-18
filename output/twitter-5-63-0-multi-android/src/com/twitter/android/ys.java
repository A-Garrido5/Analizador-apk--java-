// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.CompoundButton;
import android.widget.CheckBox;
import android.widget.CompoundButton$OnCheckedChangeListener;

class ys implements CompoundButton$OnCheckedChangeListener
{
    final /* synthetic */ CheckBox a;
    final /* synthetic */ UsersFragment b;
    
    ys(final UsersFragment b, final CheckBox a) {
        this.b = b;
        this.a = a;
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean checked) {
        if (checked != this.a.isChecked()) {
            this.a.setChecked(checked);
        }
    }
}
