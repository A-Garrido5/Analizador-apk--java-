// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.widget.SlidingPanel;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

class qz
{
    public final RadioGroup a;
    public final RadioButton b;
    public final RadioButton c;
    public final RadioButton d;
    public final RadioButton e;
    public final RadioButton f;
    public final RadioGroup g;
    public final RadioButton h;
    public final RadioButton i;
    public final RadioGroup j;
    public final RadioButton k;
    public final RadioButton l;
    public final View m;
    public final View n;
    public final View o;
    private final RadioGroup$OnCheckedChangeListener p;
    
    public qz(final SlidingPanel slidingPanel, final RadioGroup$OnCheckedChangeListener radioGroup$OnCheckedChangeListener) {
        this.a = (RadioGroup)slidingPanel.findViewById(2131887236);
        this.b = (RadioButton)slidingPanel.findViewById(2131887237);
        this.c = (RadioButton)slidingPanel.findViewById(2131887238);
        this.d = (RadioButton)slidingPanel.findViewById(2131887239);
        this.e = (RadioButton)slidingPanel.findViewById(2131887240);
        this.f = (RadioButton)slidingPanel.findViewById(2131887241);
        this.g = (RadioGroup)slidingPanel.findViewById(2131887242);
        this.h = (RadioButton)slidingPanel.findViewById(2131887243);
        this.i = (RadioButton)slidingPanel.findViewById(2131887244);
        this.j = (RadioGroup)slidingPanel.findViewById(2131887245);
        this.k = (RadioButton)slidingPanel.findViewById(2131887246);
        this.l = (RadioButton)slidingPanel.findViewById(2131887247);
        this.m = slidingPanel.findViewById(2131887248);
        this.n = slidingPanel.findViewById(2131887251);
        this.o = slidingPanel.findViewById(2131887250);
        this.a.setOnCheckedChangeListener(radioGroup$OnCheckedChangeListener);
        this.g.setOnCheckedChangeListener(radioGroup$OnCheckedChangeListener);
        this.j.setOnCheckedChangeListener(radioGroup$OnCheckedChangeListener);
        this.p = radioGroup$OnCheckedChangeListener;
    }
    
    public void a(final int n, final boolean b, final boolean b2) {
        this.a.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)null);
        this.g.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)null);
        this.j.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)null);
        switch (n) {
            default: {
                this.b.setChecked(true);
                break;
            }
            case 3: {
                this.c.setChecked(true);
                break;
            }
            case 4:
            case 5: {
                this.d.setChecked(true);
                break;
            }
            case 6: {
                this.e.setChecked(true);
                break;
            }
            case 2: {
                this.f.setChecked(true);
                break;
            }
        }
        if (b) {
            this.i.setChecked(true);
        }
        else {
            this.h.setChecked(true);
        }
        if (b2) {
            this.l.setChecked(true);
        }
        else {
            this.k.setChecked(true);
        }
        this.a.setOnCheckedChangeListener(this.p);
        this.g.setOnCheckedChangeListener(this.p);
        this.j.setOnCheckedChangeListener(this.p);
    }
    
    public void a(final boolean b) {
        if (b) {
            this.m.setVisibility(8);
            if (az.a((Context)this.p).b().d()) {
                this.g.setVisibility(0);
            }
            this.j.setVisibility(0);
            this.n.setVisibility(0);
            this.o.setVisibility(0);
            return;
        }
        this.m.setVisibility(0);
        this.g.setVisibility(8);
        this.j.setVisibility(8);
        this.n.setVisibility(8);
        this.o.setVisibility(8);
    }
}
