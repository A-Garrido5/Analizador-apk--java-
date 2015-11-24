// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import com.twitter.library.widget.TightTextView;
import android.widget.LinearLayout;

public class AutoPlayBadgeView extends LinearLayout
{
    private TightTextView a;
    private ImageView b;
    private u c;
    private w d;
    
    public AutoPlayBadgeView(final Context context) {
        this(context, null);
    }
    
    public AutoPlayBadgeView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AutoPlayBadgeView(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, new w());
    }
    
    AutoPlayBadgeView(final Context context, final AttributeSet set, final int n, final w d) {
        super(context, set, n);
        this.d = d;
    }
    
    public void a() {
        if (this.b != null) {
            this.b.setVisibility(0);
        }
        if (this.c != null) {
            this.c.a(2);
        }
    }
    
    public void b() {
        if (this.b != null) {
            this.b.setVisibility(8);
        }
        if (this.c != null) {
            this.c.a(0);
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.a(0);
        }
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TightTextView)this.findViewById(2131886296);
        this.b = (ImageView)this.findViewById(2131886297);
        if (this.b != null) {
            this.c = this.d.a();
            this.b.setImageDrawable((Drawable)this.c);
        }
    }
    
    public void setDurationText(final String text) {
        this.a.setText(text);
        int visibility;
        if (text != null) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
    }
}
