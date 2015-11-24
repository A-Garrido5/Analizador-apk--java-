// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.preference.Preference;

public class MessagePreference extends Preference
{
    public MessagePreference(final Context context) {
        super(context);
    }
    
    protected View onCreateView(final ViewGroup viewGroup) {
        final View onCreateView = super.onCreateView(viewGroup);
        final View viewById = onCreateView.findViewById(16908310);
        if (viewById != null) {
            viewById.setVisibility(8);
        }
        final TextView textView = (TextView)onCreateView.findViewById(16908304);
        if (textView != null) {
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        return onCreateView;
    }
}
