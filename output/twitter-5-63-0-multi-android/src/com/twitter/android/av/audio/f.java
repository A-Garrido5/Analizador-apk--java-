// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import android.graphics.PointF;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.android.av.af;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import com.twitter.library.card.Card;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.av.model.factory.b;
import com.twitter.library.av.playback.av;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.library.av.playback.au;
import android.content.res.Configuration;
import com.twitter.android.widget.ExpandableViewHost;
import java.util.Collections;
import android.os.Handler;
import com.twitter.library.av.model.Partner;
import java.util.Map;
import com.twitter.library.card.element.l;
import com.twitter.android.av.AVCardCanvasActivity;
import com.twitter.android.widget.ap;
import com.twitter.android.widget.bg;
import com.twitter.android.widget.m;

class f implements Runnable
{
    final /* synthetic */ m a;
    final /* synthetic */ AudioCardViewerActivity b;
    
    f(final AudioCardViewerActivity b, final m a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        bg.a().a(this.a, 0);
        this.b.d.postDelayed((Runnable)new g(this), 68L);
    }
}
