// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.geo.TwitterPlace;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

class gs extends ArrayAdapter
{
    public gs(final Context context, final int n) {
        super(context, n);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final TextView textView = (TextView)super.getView(n, view, viewGroup);
        textView.setText((CharSequence)((TwitterPlace)this.getItem(n)).fullName);
        return (View)textView;
    }
}
