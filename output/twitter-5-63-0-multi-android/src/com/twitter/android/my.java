// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.widget.SlidingPanel;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;

class my
{
    public final RadioGroup a;
    public final RadioButton b;
    public final RadioButton c;
    public final RadioButton d;
    public final RadioButton e;
    public final RadioGroup$OnCheckedChangeListener f;
    
    my(final SlidingPanel slidingPanel, final RadioGroup$OnCheckedChangeListener radioGroup$OnCheckedChangeListener) {
        this.a = (RadioGroup)slidingPanel.findViewById(2131887067);
        this.b = (RadioButton)slidingPanel.findViewById(2131887068);
        this.c = (RadioButton)slidingPanel.findViewById(2131887069);
        this.d = (RadioButton)slidingPanel.findViewById(2131887070);
        this.e = (RadioButton)slidingPanel.findViewById(2131887071);
        this.a.setOnCheckedChangeListener(radioGroup$OnCheckedChangeListener);
        this.f = radioGroup$OnCheckedChangeListener;
    }
    
    public void a(final int n) {
        this.a.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)null);
        switch (n) {
            default: {
                this.b.setChecked(true);
                break;
            }
            case 1: {
                this.c.setChecked(true);
                break;
            }
            case 2: {
                this.d.setChecked(true);
                break;
            }
            case 3: {
                this.e.setChecked(true);
                break;
            }
        }
        this.a.setOnCheckedChangeListener(this.f);
    }
}
