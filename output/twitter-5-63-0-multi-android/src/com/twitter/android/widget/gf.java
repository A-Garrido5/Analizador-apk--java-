// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Rect;
import android.graphics.Point;
import com.twitter.library.av.l;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.playback.p;
import android.content.Context;
import android.os.Handler;

public class gf extends a
{
    private final int h;
    private gh i;
    private float j;
    private gg k;
    private Handler l;
    
    public gf(final Context context) {
        this(context, null);
    }
    
    public gf(final Context context, final bi bi) {
        this(context, bi, new ay(), p.a(), new gg(), new Handler());
    }
    
    gf(final Context context, final bi bi, final ay ay, final p e, final gg k, final Handler l) {
        super(context, bi, ay);
        this.e = e;
        (this.k = k).a(this);
        this.l = l;
        this.h = context.getResources().getDimensionPixelSize(2131558990);
    }
    
    @Override
    protected az a(final Context context) {
        return this.i = new gh(context, this);
    }
    
    public void a(final float j) {
        this.j = j;
        final bi e = this.e();
        if (j >= 1.0f) {
            e.a.y = this.h;
            e.a.x = (int)(e.a.y * this.j);
        }
        else {
            e.a.x = this.h;
            e.a.y = (int)(e.a.x / this.j);
        }
        this.j();
    }
    
    public void a(final az az) {
        if (this.a != null) {
            this.c();
            new com.twitter.android.a().a(this.b).a(this.a.c()).a(this.a.b()).a(true).a(99, this.l).d(false).a(az.d());
        }
        this.d.a("undock");
        super.a(az);
    }
    
    public void a(final AVPlayer d) {
        this.d = d;
        this.i.a(d);
        this.d.a(this.k, PlaybackMode.c);
        this.a = d.e();
        if (this.a != null) {
            this.e.a(this.a, this.b());
            this.c = true;
        }
    }
    
    @Override
    public bi b(final Context context) {
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131558638);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131558637);
        final bi bi = new bi((int)(this.j * this.h), this.h);
        bi.j = true;
        bi.i = true;
        bi.e = 2130968734;
        bi.b = new Point(dimensionPixelSize, dimensionPixelSize);
        bi.f = new Rect(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        bi.g = new Rect(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        return bi;
    }
}
