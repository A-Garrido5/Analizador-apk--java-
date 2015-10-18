// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.ArrayAdapter;

class iv extends ArrayAdapter
{
    public iv(final Context context, final iu[] array) {
        super(context, 0, (Object[])array);
    }
    
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        if (inflate == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2130968809, viewGroup, false);
        }
        ((TypefacesTextView)inflate.findViewById(2131886795)).setText((CharSequence)((iu)this.getItem(n)).a);
        ((MediaImageView)inflate.findViewById(2131886796)).a(j.a(((iu)this.getItem(n)).b));
        return inflate;
    }
}
