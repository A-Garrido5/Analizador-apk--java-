// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;

public class ErrorTextView extends TextView
{
    public ErrorTextView(final Context context) {
        super(context);
    }
    
    public ErrorTextView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CharSequence getError() {
        return super.getText();
    }
    
    public void setError(final CharSequence text) {
        int visibility;
        if (text == null) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        this.setVisibility(visibility);
        this.setText(text);
    }
}
