// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import com.twitter.android.pa;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.android.av.ExternalActionButton;

public class ExternalActionButtonImpl extends ExternalActionButton
{
    public ExternalActionButtonImpl(final Context context) {
        super(context);
    }
    
    public ExternalActionButtonImpl(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ExternalActionButtonImpl(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    protected void a(final Context context, final AttributeSet set, final int n) {
        final View inflate = View.inflate(context, 2130968766, (ViewGroup)this);
        this.a = (TextView)inflate.findViewById(2131886199);
        this.b = (ProgressBar)inflate.findViewById(2131886235);
        if (set == null) {
            return;
        }
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, pa.ExternalActionButton, n, 0);
        try {
            final String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                this.setExternalUri(Uri.parse(string));
            }
            final float dimension = obtainStyledAttributes.getDimension(1, context.getResources().getDimension(2131558491));
            final ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
            else {
                this.a.setTextColor(context.getResources().getColor(2131689647));
            }
            this.a.setTextSize(0, dimension);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
}
