// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class at
{
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    
    public at(final View view) {
        this.a = (TextView)view.findViewById(la.overflow_item_title);
        this.b = (TextView)view.findViewById(la.overflow_item_subtitle);
        this.c = (ImageView)view.findViewById(la.overflow_item_icon);
    }
}
