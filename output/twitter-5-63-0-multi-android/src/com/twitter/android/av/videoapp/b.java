// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.videoapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.ui.widget.TwitterButton;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import com.twitter.android.card.t;
import com.twitter.android.card.v;
import android.app.Activity;
import com.twitter.android.card.h;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.util.g;
import android.content.Context;
import com.twitter.library.card.Card;
import java.util.Map;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.av.model.Partner;
import java.util.Collections;
import com.twitter.library.av.playback.av;
import com.twitter.library.av.model.factory.VideoPlaylistFactory;
import com.twitter.library.av.playback.au;
import com.twitter.android.widget.bg;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.util.c;
import android.widget.FrameLayout$LayoutParams;
import com.twitter.library.scribe.NativeCardUserAction;
import com.twitter.android.media.camera.z;
import android.widget.Button;
import com.twitter.android.card.CardActionHelper;
import com.twitter.android.media.camera.ab;
import com.twitter.android.av.AVCardCanvasActivity;
import android.view.MotionEvent;
import android.view.View;
import com.twitter.library.util.ao;

class b extends ao
{
    final /* synthetic */ VideoCardCanvasActivity a;
    
    b(final VideoCardCanvasActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final View view, final MotionEvent motionEvent) {
        this.a.a(view, motionEvent);
    }
}
