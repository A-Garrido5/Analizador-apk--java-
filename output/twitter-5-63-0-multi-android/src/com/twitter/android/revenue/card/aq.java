// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.graphics.RectF;
import android.app.Activity;
import com.twitter.android.client.bh;
import com.twitter.android.av.videoapp.e;
import android.graphics.PointF;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import com.twitter.library.provider.Tweet;
import com.twitter.android.av.videoapp.VideoCardData;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.nativecards.j;
import com.twitter.android.card.t;
import android.view.View;
import com.twitter.library.util.ao;

final class aq extends ao
{
    final /* synthetic */ View a;
    final /* synthetic */ t b;
    final /* synthetic */ j c;
    final /* synthetic */ String d;
    final /* synthetic */ MediaImageView e;
    final /* synthetic */ VideoCardData f;
    final /* synthetic */ Tweet g;
    
    aq(final View a, final t b, final j c, final String d, final MediaImageView e, final VideoCardData f, final Tweet g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public void a(final View view, final MotionEvent motionEvent) {
        final NativeCardUserAction a = NativeCardUserAction.a(this.a, view, motionEvent, 0);
        this.b.b("card_click", this.c.l(), a);
        this.b.a(PromotedEvent.p, a);
        final Activity k = this.c.k();
        if (k == null) {
            return;
        }
        if (this.d == null) {
            Toast.makeText((Context)k, 2131296370, 0).show();
            return;
        }
        final RectF a2 = com.twitter.util.t.a(k, (View)this.e);
        PointF pointF;
        PointF pointF2;
        if (a2 != null) {
            pointF = new PointF(a2.left, a2.top);
            pointF2 = new PointF(a2.width(), a2.height());
        }
        else {
            pointF2 = null;
            pointF = null;
        }
        new e(this.f).a(this.g).a(this.d).a(this.b.a()).a(pointF, pointF2).a(bh.a((Context)k).i()).b((Context)k);
    }
}
