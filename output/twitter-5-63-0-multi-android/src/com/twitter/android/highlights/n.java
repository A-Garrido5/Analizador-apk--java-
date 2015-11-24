// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.View;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.player.InlineVideoView;

public class n extends ax
{
    public final InlineVideoView a;
    public final MediaImageView b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    
    public n(final int n, final View view) {
        super(n, view);
        this.a = (InlineVideoView)view.findViewById(2131886845);
        this.b = (MediaImageView)view.findViewById(2131886846);
        this.c = view.findViewById(2131886847);
        (this.d = view.findViewById(2131886843)).setTag((Object)this);
        (this.e = view.findViewById(2131886842)).setTag((Object)this);
        (this.f = view.findViewById(2131886844)).setTag((Object)this);
    }
}
