// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import android.widget.CompoundButton;
import com.twitter.library.api.geo.Coordinate;
import android.animation.TimeInterpolator;
import android.widget.Switch;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.CompoundButton$OnCheckedChangeListener;

public class k implements CompoundButton$OnCheckedChangeListener
{
    private final ViewGroup a;
    private final l b;
    private final TextView c;
    private boolean d;
    private boolean e;
    private final Interpolator f;
    
    public k(final ViewGroup a, final l b) {
        this.f = (Interpolator)new DecelerateInterpolator();
        this.a = a;
        this.b = b;
        this.c = (TextView)a.findViewById(2131887155);
        ((Switch)a.findViewById(2131887156)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this);
    }
    
    private String a(final double n) {
        return String.format("%.2f", n);
    }
    
    public void a() {
        if (!this.d) {
            this.a.animate().translationY(0.0f).setDuration(350L).setInterpolator((TimeInterpolator)this.f).start();
            this.d = true;
        }
    }
    
    public void a(final Coordinate coordinate) {
        this.c.setText((CharSequence)this.c.getResources().getString(2131298221, new Object[] { this.a(coordinate.a()), this.a(coordinate.b()) }));
        this.a.setVisibility(0);
    }
    
    public void b() {
        if (this.d) {
            this.a.animate().translationY((float)this.a.getHeight()).setDuration(350L).setInterpolator((TimeInterpolator)this.f).start();
            this.d = false;
        }
    }
    
    public boolean c() {
        return this.e;
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean e) {
        this.b.a(e);
        this.e = e;
    }
}
