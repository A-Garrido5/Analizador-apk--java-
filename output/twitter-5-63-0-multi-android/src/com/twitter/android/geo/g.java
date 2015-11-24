// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import java.util.Iterator;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import com.twitter.util.e;
import android.widget.ImageView;
import com.twitter.library.api.geo.PlaceAttribution;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.view.View;
import java.util.List;
import android.widget.LinearLayout;

public class g
{
    private final LinearLayout a;
    private final List b;
    private final View c;
    private final TextView d;
    private final Context e;
    
    public g(final Context e, final ViewGroup viewGroup) {
        this.e = e;
        final LinearLayout a = (LinearLayout)LayoutInflater.from(e).inflate(2130968981, viewGroup, false);
        this.a = a;
        this.b = new ArrayList();
        this.c = a.findViewById(2131886109);
        (this.d = (TextView)a.findViewById(2131887148)).setTag((Object)"footer_text_tag");
        this.a(8);
    }
    
    private View a(final PlaceAttribution placeAttribution) {
        final ImageView imageView = (ImageView)LayoutInflater.from(this.e).inflate(2130968979, (ViewGroup)this.a, false);
        switch (h.a[placeAttribution.ordinal()]) {
            default: {
                com.twitter.util.e.a(new IllegalArgumentException("Illegal attribution " + placeAttribution));
                return (View)imageView;
            }
            case 1: {
                imageView.setImageResource(2130839086);
                return (View)imageView;
            }
        }
    }
    
    private void a(final int n) {
        this.d.setVisibility(n);
        this.c.setVisibility(n);
    }
    
    public void a() {
        this.a((CharSequence)null);
    }
    
    public void a(final View$OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }
    
    public void a(final CharSequence text) {
        this.d.setText(text);
        if (!TextUtils.isEmpty(text)) {
            this.a(0);
            return;
        }
        this.a(8);
    }
    
    public void a(final List list) {
        final Iterator<View> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            this.a.removeView((View)iterator.next());
        }
        this.b.clear();
        final Iterator<PlaceAttribution> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final View a = this.a(iterator2.next());
            this.b.add(a);
            this.a.addView(a);
        }
    }
    
    public View b() {
        return (View)this.a;
    }
}
