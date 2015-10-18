// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$OnClickListener;
import android.app.Activity;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class LoggedOutBar extends LinearLayout
{
    public LoggedOutBar(final Context context) {
        super(context);
    }
    
    public LoggedOutBar(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public LoggedOutBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public void setDefaultOnClickListener(final Activity activity) {
        this.setOnClickListener((View$OnClickListener)new dd(this, activity));
    }
    
    public void setOnClickListener(final View$OnClickListener view$OnClickListener) {
        this.findViewById(2131886903).setOnClickListener(view$OnClickListener);
        this.findViewById(2131886902).setOnClickListener(view$OnClickListener);
    }
}
