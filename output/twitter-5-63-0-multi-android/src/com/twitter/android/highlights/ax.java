// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;

class ax extends ag
{
    public final MediaImageView g;
    public final TextView h;
    public final View i;
    public final TextView j;
    public final TextView k;
    
    public ax(final int n, final View view) {
        super(n, view);
        this.g = (MediaImageView)view.findViewById(2131886306);
        this.h = (TextView)view.findViewById(2131886307);
        this.i = view.findViewById(2131886857);
        this.j = (TextView)view.findViewById(2131886145);
        (this.k = (TextView)view.findViewById(2131886826)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
