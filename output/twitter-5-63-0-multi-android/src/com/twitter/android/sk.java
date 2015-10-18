// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.widget.TypefacesTextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

class sk extends ArrayAdapter
{
    public sk(final Context context, final String[] array) {
        super(context, 0, (Object[])array);
    }
    
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        if (inflate == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2130969103, viewGroup, false);
        }
        ((TypefacesTextView)inflate.findViewById(2131887273)).setText((CharSequence)this.getItem(n));
        return inflate;
    }
}
