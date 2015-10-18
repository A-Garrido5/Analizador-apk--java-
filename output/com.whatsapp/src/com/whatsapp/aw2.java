// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.BaseAdapter;

public class aw2 extends BaseAdapter
{
    final LocationPicker2 a;
    
    public aw2(final LocationPicker2 a, final Context context) {
        this.a = a;
    }
    
    public int getCount() {
        if (LocationPicker2.k(this.a) == null) {
            return 0;
        }
        return LocationPicker2.k(this.a).e();
    }
    
    public Object getItem(final int n) {
        if (LocationPicker2.k(this.a) == null || n >= LocationPicker2.k(this.a).e()) {
            return null;
        }
        return LocationPicker2.k(this.a).a(n);
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    public int getItemViewType(final int n) {
        return 0;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (view == null) {
            final View a = alm.a(this.a.getLayoutInflater(), 2130903177, null);
            if (!i) {
                view = a;
            }
        }
        final TextView textView = (TextView)view.findViewById(2131755645);
        final TextView textView2 = (TextView)view.findViewById(2131755646);
        final ImageView imageView = (ImageView)view.findViewById(2131755640);
        final PlaceInfo a2 = LocationPicker2.k(this.a).a(n);
        textView.setText((CharSequence)a2.name);
        Label_0130: {
            if (!TextUtils.isEmpty((CharSequence)a2.vicinity)) {
                textView2.setVisibility(0);
                textView2.setText((CharSequence)a2.vicinity);
                textView2.setSingleLine(true);
                if (!i) {
                    break Label_0130;
                }
            }
            textView2.setVisibility(8);
        }
        Label_0185: {
            if (a2 == LocationPicker2.o(this.a)) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)new BitmapDrawable(this.a.getResources(), LocationPicker2.q(this.a)), (Drawable)null);
                if (!i) {
                    break Label_0185;
                }
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        int n2 = 0;
        Label_0308: {
            switch (a2.source) {
                default: {
                    n2 = 0;
                    break;
                }
                case 3: {
                    n2 = this.a.getResources().getDimensionPixelSize(2131361939);
                    if (i) {
                        break Label_0308;
                    }
                    break;
                }
                case 1: {
                    n2 = this.a.getResources().getDimensionPixelSize(2131361941);
                    if (i) {
                        break Label_0308;
                    }
                    break;
                }
                case 2: {
                    n2 = this.a.getResources().getDimensionPixelSize(2131361940);
                    break;
                }
            }
        }
        imageView.setPadding(n2, n2, n2, n2);
        if (a2.icon != null) {
            LocationPicker2.h(this.a).b(a2.icon, imageView);
            if (!i) {
                return view;
            }
        }
        imageView.setImageDrawable((Drawable)null);
        return view;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
}
