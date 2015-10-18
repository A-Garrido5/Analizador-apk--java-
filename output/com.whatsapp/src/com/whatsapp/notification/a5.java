// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.View;
import android.text.format.DateUtils;
import android.widget.TextView;
import com.whatsapp.up;
import android.widget.ProgressBar;
import android.widget.ImageButton;
import com.whatsapp.r7;

class a5 implements r7
{
    final ImageButton a;
    final ProgressBar b;
    final up c;
    final PopupNotification d;
    int e;
    final TextView f;
    
    a5(final PopupNotification d, final ImageButton a, final ProgressBar b, final up c, final TextView f) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        this.e = -1;
    }
    
    @Override
    public void a() {
        this.a.setImageResource(2130838859);
        this.b.setMax(this.c.r());
        this.e = -1;
    }
    
    @Override
    public void a(final int n) {
        final int min = Math.min(n, this.b.getMax());
        if (this.e != min / 1000) {
            this.e = min / 1000;
            this.f.setText((CharSequence)DateUtils.formatElapsedTime((long)this.e));
        }
        if (this.b.getProgress() < min) {
            this.b.setProgress(min);
        }
    }
    
    @Override
    public void a(final boolean b) {
        final View viewById = this.d.findViewById(2131755426);
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        viewById.setVisibility(visibility);
    }
    
    @Override
    public void b() {
        this.a.setImageResource(2130838862);
    }
    
    @Override
    public void c() {
        this.a.setImageResource(2130838859);
    }
    
    @Override
    public void d() {
        this.a.setImageResource(2130838862);
        this.b.setProgress(0);
        this.f.setText((CharSequence)DateUtils.formatElapsedTime((long)(this.c.r() / 1000)));
    }
}
