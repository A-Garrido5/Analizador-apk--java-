// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.control;

import com.twitter.library.av.playback.aw;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.view.View;
import com.twitter.library.av.playback.AVPlayer;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import android.content.res.Resources$NotFoundException;
import android.widget.TextView;
import android.content.Context;

class c implements Runnable
{
    final /* synthetic */ Context a;
    final /* synthetic */ int b;
    final /* synthetic */ VideoControlView c;
    
    c(final VideoControlView c, final Context a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.e();
        final TextView textView = (TextView)this.c.e.findViewById(la.msg);
        while (true) {
            try {
                final String text = this.a.getString(this.b);
                textView.setText((CharSequence)text);
                textView.setVisibility(0);
                this.c.e.setVisibility(0);
                this.c.bringChildToFront(this.c.e);
            }
            catch (Resources$NotFoundException ex) {
                final String text = this.a.getString(lg.av_playlist_download_failed);
                continue;
            }
            break;
        }
    }
}
