// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.av.playback.au;
import android.view.View;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.av.model.Audio;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;
import com.twitter.android.av.s;

public class o extends az
{
    private final s a;
    
    public o(final Context context, final ap ap) {
        this(context, ap, new s());
    }
    
    o(final Context context, final ap ap, final s a) {
        super(context, ap);
        this.a = a;
    }
    
    public void a(final AVPlayer avPlayer) {
        if (!(avPlayer.z() instanceof Audio)) {
            return;
        }
        final View a = this.a.a(this.g());
        final MediaImageView mediaImageView = (MediaImageView)a.findViewById(2131886658);
        final MediaImageView mediaImageView2 = (MediaImageView)a.findViewById(2131886659);
        if (mediaImageView != null) {
            mediaImageView.a(j.a(((Audio)avPlayer.z()).k()));
            final au e = avPlayer.e();
            if (mediaImageView2 != null && e != null && e.g() != null) {
                mediaImageView2.a(j.a(e.g().c()));
            }
        }
        this.a(a);
    }
}
