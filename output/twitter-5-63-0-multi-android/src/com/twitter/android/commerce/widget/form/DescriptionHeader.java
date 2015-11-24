// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.form;

import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.view.View;
import android.widget.LinearLayout;

public class DescriptionHeader extends LinearLayout
{
    public final View a;
    public final TextView b;
    public final ExpandableTextView c;
    
    public DescriptionHeader(final Context context) {
        this(context, null);
    }
    
    public DescriptionHeader(final Context context, final AttributeSet set) {
        super(context, set);
        View.inflate(context, 2130968658, (ViewGroup)this);
        this.a = this.findViewById(2131886438);
        this.b = (TextView)this.findViewById(2131886439);
        this.c = (ExpandableTextView)this.findViewById(2131886440);
    }
}
