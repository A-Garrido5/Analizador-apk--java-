// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.model.b;
import com.twitter.library.client.az;
import com.twitter.library.client.d;
import android.content.res.Configuration;
import com.twitter.android.widget.bd;
import com.twitter.android.widget.bc;
import android.view.View;
import com.twitter.android.widget.bg;
import android.content.Context;
import com.twitter.android.kg;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.av.playback.p;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.playback.au;
import android.graphics.PointF;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.widget.ExpandableViewHost;
import com.twitter.library.av.playback.w;
import com.twitter.android.widget.by;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.android.client.TwitterFragmentActivity;

class h implements Runnable
{
    final /* synthetic */ AVCardCanvasActivity a;
    
    h(final AVCardCanvasActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.finish();
        this.a.overridePendingTransition(0, 0);
    }
}
