// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Rect;
import android.graphics.Point;
import com.twitter.library.av.l;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.av.playback.AVPlayer;
import android.graphics.PointF;
import com.twitter.android.av.audio.h;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.av.playback.au;
import com.twitter.library.av.playback.p;
import android.content.Context;

public class m extends a
{
    private o h;
    private n i;
    
    public m(final Context context) {
        this(context, null);
    }
    
    public m(final Context context, final bi bi) {
        this(context, bi, new ay(), p.a(), new n());
    }
    
    m(final Context context, final bi bi, final ay ay, final p e, final n i) {
        super(context, bi, ay);
        this.e = e;
        (this.i = i).a(this);
    }
    
    private void a(final Context context, final au au, final TwitterScribeAssociation twitterScribeAssociation) {
        if (this.i() == null) {
            return;
        }
        final bi e = this.e();
        new h().a(au.g()).a(au.d()).a(au.b()).a(au.c()).a(twitterScribeAssociation).a(e.a(this.i()), new PointF((float)e.a.x, (float)e.a.y)).a(false).b(context);
    }
    
    @Override
    protected az a(final Context context) {
        return this.h = new o(context, this);
    }
    
    public void a(final az az) {
        super.a(az);
        if (this.a != null) {
            this.d.a("undock");
            this.c = false;
            this.a(az.d(), this.a, this.b);
        }
    }
    
    public void a(final AVPlayer d) {
        this.d = d;
        this.h.a(this.d);
        this.d.a(this.i, PlaybackMode.c);
        this.c = true;
        this.a = d.e();
        if (this.a != null) {
            this.e.a(this.a, this.b());
        }
    }
    
    @Override
    public bi b(final Context context) {
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131558638);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131558638);
        final int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131558637);
        final bi bi = new bi(dimensionPixelSize, dimensionPixelSize);
        bi.j = true;
        bi.i = true;
        bi.e = 2130968734;
        bi.b = new Point(dimensionPixelSize2, dimensionPixelSize2);
        bi.f = new Rect(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        bi.g = new Rect(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        return bi;
    }
}
