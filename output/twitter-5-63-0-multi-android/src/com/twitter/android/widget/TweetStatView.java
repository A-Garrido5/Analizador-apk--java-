// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Typeface;
import java.util.Locale;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class TweetStatView extends RelativeLayout
{
    private final TextView a;
    private final TextView b;
    private ColorStateList c;
    private ColorStateList d;
    
    public TweetStatView(final Context context) {
        this(context, null);
    }
    
    public TweetStatView(final Context context, final AttributeSet set) {
        this(context, set, 2130772129);
    }
    
    public TweetStatView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        LayoutInflater.from(context).inflate(2130969168, (ViewGroup)this, true);
        this.a = (TextView)this.findViewById(2131886307);
        this.b = (TextView)this.findViewById(2131887255);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.TweetStatView, n, 0);
        this.c = obtainStyledAttributes.getColorStateList(1);
        this.d = obtainStyledAttributes.getColorStateList(3);
        this.a.setTextColor(this.c.getDefaultColor());
        this.b.setTextColor(this.d.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        this.a.setTextColor(this.c.getColorForState(drawableState, this.c.getDefaultColor()));
        this.b.setTextColor(this.d.getColorForState(drawableState, this.d.getDefaultColor()));
    }
    
    public void setName(final CharSequence text) {
        this.a.setText(text);
        this.a.setContentDescription((CharSequence)this.a.getText().toString().toLowerCase(Locale.getDefault()));
    }
    
    public void setTypeface(final Typeface typeface) {
        this.a.setTypeface(typeface);
        this.b.setTypeface(typeface);
    }
    
    public void setValue(final CharSequence text) {
        this.b.setText(text);
    }
}
