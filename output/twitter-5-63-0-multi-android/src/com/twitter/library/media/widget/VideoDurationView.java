// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.widget.TightTextView;

public class VideoDurationView extends TightTextView
{
    private final int a;
    
    public VideoDurationView(final Context context) {
        this(context, null, 0);
    }
    
    public VideoDurationView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VideoDurationView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.VideoDurationView, n, 0);
        this.a = obtainStyledAttributes.getInt(li.VideoDurationView_time_format, 1);
        obtainStyledAttributes.recycle();
    }
    
    public void setDuration(final int n) {
        final int n2 = (n + 500) / 1000;
        String text;
        if (this.a == 2) {
            text = this.getResources().getString(lg.video_duration, new Object[] { Math.max(1, n2) });
        }
        else {
            text = String.format("%d:%02d", n2 / 60, n2 % 60);
        }
        this.setText(text);
    }
}
