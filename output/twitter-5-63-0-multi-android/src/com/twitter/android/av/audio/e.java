// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import android.graphics.PointF;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.android.widget.m;
import com.twitter.android.av.af;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import com.twitter.library.card.Card;
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
import com.twitter.library.provider.Tweet;
import com.twitter.android.widget.a;
import com.twitter.android.widget.bg;

class e implements Runnable
{
    final /* synthetic */ AudioCardViewerActivity a;
    
    e(final AudioCardViewerActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final Tweet b = this.a.m.b();
        final bg a = bg.a();
        if (b != null) {
            com.twitter.android.widget.a.a(a, b);
            a.a(com.twitter.android.widget.a.a(b), 0);
            a.a(2);
        }
    }
}
