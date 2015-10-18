// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.BaseAdapter;

public class cj extends BaseAdapter
{
    final LocationPicker a;
    
    public cj(final LocationPicker a, final Context context) {
        this.a = a;
    }
    
    public int getCount() {
        if (LocationPicker.a(this.a) == null) {
            return 0;
        }
        return LocationPicker.a(this.a).e();
    }
    
    public Object getItem(final int n) {
        if (LocationPicker.a(this.a) == null || n >= LocationPicker.a(this.a).e()) {
            return null;
        }
        return LocationPicker.a(this.a).a(n);
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    public int getItemViewType(final int n) {
        return 0;
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (a == null) {
            a = alm.a(this.a.getLayoutInflater(), 2130903177, null);
        }
        final TextView textView = (TextView)a.findViewById(2131755645);
        final TextView textView2 = (TextView)a.findViewById(2131755646);
        final ImageView imageView = (ImageView)a.findViewById(2131755640);
        final PlaceInfo a2 = LocationPicker.a(this.a).a(n);
        textView.setText((CharSequence)a2.name);
        Label_0134: {
            if (a2.vicinity != null && !"".equals(a2.vicinity)) {
                textView2.setVisibility(0);
                textView2.setText((CharSequence)a2.vicinity);
                textView2.setSingleLine(true);
                if (!i) {
                    break Label_0134;
                }
            }
            textView2.setVisibility(8);
        }
        Label_0170: {
            if (a2 == LocationPicker.d(this.a)) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2130838894, 0);
                if (!i) {
                    break Label_0170;
                }
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        int n2 = 0;
        Label_0292: {
            switch (a2.source) {
                default: {
                    n2 = 0;
                    break;
                }
                case 3: {
                    n2 = this.a.getResources().getDimensionPixelSize(2131361939);
                    if (i) {
                        break Label_0292;
                    }
                    break;
                }
                case 1: {
                    n2 = this.a.getResources().getDimensionPixelSize(2131361941);
                    if (i) {
                        break Label_0292;
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
            LocationPicker.e(this.a).b(a2.icon, imageView);
            if (!i) {
                return a;
            }
        }
        imageView.setImageResource(0);
        return a;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
}
