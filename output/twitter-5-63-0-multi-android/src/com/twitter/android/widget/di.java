// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.MotionEvent;
import android.view.KeyEvent;
import java.io.IOException;
import android.net.Uri;
import com.twitter.library.media.model.MediaDescriptor;
import android.util.AttributeSet;
import android.view.View$OnClickListener;
import com.twitter.library.media.util.d;
import com.twitter.library.media.util.b;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import java.util.ArrayList;
import android.view.SurfaceHolder;
import android.media.MediaPlayer;
import android.widget.MediaController$MediaPlayerControl;
import android.view.SurfaceHolder$Callback;
import android.media.MediaPlayer$OnVideoSizeChangedListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnInfoListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import android.view.SurfaceView;
import android.view.View;
import android.content.Context;
import android.widget.MediaController;

class di extends MediaController implements dh
{
    final /* synthetic */ MediaPlayerView a;
    
    public di(final MediaPlayerView a, final Context context) {
        this.a = a;
        super(context);
    }
    
    public void a() {
    }
    
    public void a(final View view) {
        this.setAnchorView((View)view.getParent());
    }
    
    public void hide() {
        super.hide();
        if (this.a.m != null) {
            this.a.m.f();
        }
    }
    
    public void show(final int n) {
        super.show(n);
        if (this.a.m != null) {
            this.a.m.b(n);
        }
    }
}
