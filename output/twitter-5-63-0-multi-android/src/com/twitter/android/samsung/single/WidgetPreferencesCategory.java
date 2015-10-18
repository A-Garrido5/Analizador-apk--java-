// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.PreferenceCategory;

@Deprecated
public class WidgetPreferencesCategory extends PreferenceCategory
{
    public WidgetPreferencesCategory(final Context context) {
        super(context);
    }
    
    public WidgetPreferencesCategory(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public WidgetPreferencesCategory(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        final TextView textView = (TextView)super.onCreateView(viewGroup);
        textView.setTextColor(this.getContext().getResources().getColor(2131689620));
        return (View)textView;
    }
}
