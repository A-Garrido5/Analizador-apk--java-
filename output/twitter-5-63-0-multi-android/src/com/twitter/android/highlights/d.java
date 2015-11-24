// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;

public class d extends ag
{
    public final MediaImageView a;
    public final MediaImageView b;
    public final TextView c;
    public final TextView d;
    public final View e;
    public final TextView f;
    public final TextView g;
    
    public d(final View view) {
        super(5, view);
        this.a = (MediaImageView)view.findViewById(2131886306);
        this.b = (MediaImageView)view.findViewById(2131886856);
        this.c = (TextView)view.findViewById(2131886307);
        this.d = (TextView)view.findViewById(2131886858);
        this.e = view.findViewById(2131886857);
        (this.f = (TextView)view.findViewById(2131886102)).setMovementMethod(LinkMovementMethod.getInstance());
        (this.g = (TextView)view.findViewById(2131886647)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
