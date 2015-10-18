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
import android.content.Context;
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
import android.view.View$OnClickListener;

class df implements View$OnClickListener
{
    final /* synthetic */ MediaPlayerView a;
    
    df(final MediaPlayerView a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.j--;
        if (this.a.a != null) {
            this.a.a.seekTo(0);
            this.a.h();
            this.a.start();
        }
    }
}
