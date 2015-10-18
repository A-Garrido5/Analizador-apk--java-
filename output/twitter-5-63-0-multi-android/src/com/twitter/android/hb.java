// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import com.twitter.library.util.ReferenceMap;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import com.twitter.library.media.widget.e;
import java.util.List;
import android.widget.TextView;
import android.content.res.Resources;
import android.view.View;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.manager.k;

public class hb
{
    public k a;
    public MediaImageView b;
    public View c;
    public String d;
    private final View e;
    
    public hb(final View c, final k a, final String d, final Resources resources, final TextView textView, final List list) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = (MediaImageView)this.c.findViewById(2131886627);
        this.e = this.c.findViewById(2131886628);
        this.b.setOnImageLoadedListener(new hc(this, list, textView, resources));
    }
    
    public static View a(final LayoutInflater layoutInflater, final View$OnClickListener onClickListener, final ReferenceMap referenceMap, final k k, final String contentDescription, final Resources resources, final TextView textView, final List list) {
        final View inflate = layoutInflater.inflate(2130968711, (ViewGroup)null);
        final hb tag = new hb(inflate, k, contentDescription, resources, textView, list);
        tag.c.setOnClickListener(onClickListener);
        inflate.setTag((Object)tag);
        inflate.setContentDescription((CharSequence)contentDescription);
        tag.b.a(k);
        referenceMap.a(contentDescription, tag);
        return inflate;
    }
    
    void a() {
        this.e.setVisibility(0);
    }
    
    void b() {
        this.e.setVisibility(4);
    }
}
