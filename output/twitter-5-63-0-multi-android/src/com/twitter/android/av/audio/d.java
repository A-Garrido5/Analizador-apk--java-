// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import android.graphics.PointF;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.android.widget.m;
import com.twitter.android.av.af;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.card.Card;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.av.model.factory.b;
import com.twitter.library.av.playback.av;
import com.twitter.android.widget.bg;
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
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout$LayoutParams;

class d implements Runnable
{
    final /* synthetic */ AudioCardViewerActivity a;
    
    d(final AudioCardViewerActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(this.a.getResources().getConfiguration());
        this.a.d.a();
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-2, -2);
        relativeLayout$LayoutParams.addRule(13, -1);
        this.a.r = true;
        this.a.q.a((ViewGroup)this.a.d, (Context)this.a, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
    }
}
