// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.text.TextUtils;
import android.widget.Toast;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.client.c;
import com.twitter.ui.widget.TwitterButton;
import android.view.View$OnTouchListener;
import com.twitter.library.media.manager.j;
import com.twitter.library.scribe.NativeCardUserAction;
import com.twitter.library.provider.Tweet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.twitter.library.util.ao;

class t extends ao
{
    final /* synthetic */ p a;
    
    t(final p a) {
        this.a = a;
    }
    
    @Override
    public void a(final View view, final MotionEvent motionEvent) {
        this.a.a(view, motionEvent, this.a.x);
    }
}
