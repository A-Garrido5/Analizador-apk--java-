// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.card.element.l;
import com.twitter.library.av.control.VideoControlView;
import com.twitter.library.av.playback.AVPlayer;
import android.view.View;
import com.twitter.library.av.control.e;
import android.content.Context;

public class ViewMoreThumbPlayerChromeView extends BaseVideoPlayerChromeView
{
    public ViewMoreThumbPlayerChromeView(final Context context) {
        this(context, new e());
    }
    
    public ViewMoreThumbPlayerChromeView(final Context context, final e e) {
        super(context, e);
    }
    
    @Override
    protected View b(final Context context) {
        return null;
    }
    
    @Override
    protected VideoControlView c(final Context context, final AVPlayer avPlayer) {
        return null;
    }
    
    @Override
    protected l m() {
        return null;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
    }
    
    @Override
    public void q() {
    }
}
