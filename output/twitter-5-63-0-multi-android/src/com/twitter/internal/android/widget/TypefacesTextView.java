// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.Typeface;
import android.content.res.TypedArray;
import com.twitter.ui.widget.ag;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;

public class TypefacesTextView extends TextView
{
    public TypefacesTextView(final Context context) {
        super(context);
    }
    
    public TypefacesTextView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context, set);
    }
    
    public TypefacesTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context, set);
    }
    
    private void a(final Context context, final AttributeSet set) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.TypefacesTextView);
        final String string = obtainStyledAttributes.getString(li.TypefacesTextView_font_name);
        final int int1 = obtainStyledAttributes.getInt(li.TypefacesTextView_fallback_style, 0);
        obtainStyledAttributes.recycle();
        if (string != null && !this.isInEditMode()) {
            super.setTypeface(ag.a(context).a(string, int1));
            this.setPaintFlags(0x80 | this.getPaintFlags());
        }
    }
    
    public void setTypeface(final Typeface typeface) {
        int style;
        if (typeface != null) {
            style = typeface.getStyle();
        }
        else {
            style = 0;
        }
        final Context context = this.getContext();
        if (this.isInEditMode() || !ag.a(context).f) {
            super.setTypeface(typeface);
            return;
        }
        if (style == 3) {
            super.setTypeface(ag.a(context).d);
            return;
        }
        if (style == 1) {
            super.setTypeface(ag.a(context).c);
            return;
        }
        if (style == 2) {
            super.setTypeface(ag.a(context).b);
            return;
        }
        super.setTypeface(ag.a(context).a);
    }
}
