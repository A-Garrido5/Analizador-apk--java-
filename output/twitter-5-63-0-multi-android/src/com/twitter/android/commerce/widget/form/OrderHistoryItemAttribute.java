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

public class OrderHistoryItemAttribute extends LinearLayout
{
    public final View a;
    public final TextView b;
    public final TextView c;
    
    public OrderHistoryItemAttribute(final Context context) {
        this(context, null);
    }
    
    public OrderHistoryItemAttribute(final Context context, final AttributeSet set) {
        super(context, set);
        View.inflate(context, 2130968659, (ViewGroup)this);
        this.a = this.findViewById(2131886444);
        this.b = (TextView)this.findViewById(2131886441);
        this.c = (TextView)this.findViewById(2131886442);
        this.findViewById(2131886443).setVisibility(4);
    }
}
