// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public final class YouTubeThumbnailView extends ImageView
{
    public YouTubeThumbnailView(final Context context) {
        this(context, null);
    }
    
    public YouTubeThumbnailView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public YouTubeThumbnailView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
}
