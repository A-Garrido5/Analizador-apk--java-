// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.control;

import com.twitter.library.util.bk;
import com.twitter.library.av.playback.aw;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.os.Handler;
import com.twitter.library.av.playback.AVPlayer;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar$OnSeekBarChangeListener;

public class a implements SeekBar$OnSeekBarChangeListener
{
    final b a;
    long b;
    private TextView c;
    private TextView d;
    private TextView e;
    private SeekBar f;
    private String g;
    private boolean h;
    private boolean i;
    private AVPlayer j;
    private final Handler k;
    
    public a(final View view, final AVPlayer avPlayer, final b b) {
        this(view, avPlayer, b, view.getContext(), new Handler(Looper.getMainLooper()));
    }
    
    a(final View view, final AVPlayer j, final b a, final Context context, final Handler k) {
        this.b = -1L;
        this.k = k;
        this.a = a;
        this.j = j;
        (this.f = (SeekBar)view.findViewById(la.mediacontroller_progress)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
        this.f.setMax(1000);
        this.d = (TextView)view.findViewById(la.time_current);
        this.c = (TextView)view.findViewById(la.time);
        this.e = (TextView)view.findViewById(la.countdown);
        this.g = context.getString(lg.av_preroll_countdown);
    }
    
    public void a() {
        this.f.setProgress(0);
    }
    
    public void a(final aw aw) {
        if (!this.h && this.b() && this.j.u()) {
            this.b(aw);
            this.a.c();
        }
    }
    
    public void a(final Runnable runnable) {
        this.k.post(runnable);
    }
    
    public void b(final aw aw) {
        if (this.j.t() && !this.h) {
            if (this.f != null && aw.b > 0L) {
                this.f.setProgress((int)(1000L * aw.a / aw.b));
            }
            this.c.setText((CharSequence)bk.a(aw.b));
            this.d.setText((CharSequence)bk.a(aw.a));
            if (this.e != null) {
                this.e.setText((CharSequence)String.format(this.g, bk.a(aw.b - aw.a)));
            }
        }
    }
    
    boolean b() {
        return this.f.getParent() != null;
    }
    
    public void c() {
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
        if (this.e != null) {
            this.e.setVisibility(0);
        }
    }
    
    public void d() {
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.f.setVisibility(0);
        if (this.e != null) {
            this.e.setVisibility(8);
        }
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            final aw x = this.j.x();
            if (this.j.z() != null) {
                final long b2 = x.b * n / 1000L;
                this.i = (b2 < x.a);
                this.b = b2;
                if (this.d != null) {
                    this.d.setText((CharSequence)bk.a((int)b2));
                }
            }
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        this.h = true;
        this.i = false;
        this.j.F();
        this.a.d();
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        this.h = false;
        if (this.b != -1L) {
            this.j.a((int)this.b);
            this.b = -1L;
        }
        this.b(this.j.x());
        this.j.G();
        this.a.a(this.i);
        if (this.i) {
            this.j.y();
        }
    }
}
