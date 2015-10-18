// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Paint;
import android.content.Context;
import com.whatsapp.util.cq;
import java.text.NumberFormat;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.alm;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.ArrayList;
import android.view.View;
import android.widget.BaseAdapter;

class aw extends BaseAdapter
{
    private View a;
    ArrayList b;
    LayoutInflater c;
    final GalleryPickerFragment d;
    
    aw(final GalleryPickerFragment d, final LayoutInflater c) {
        this.d = d;
        this.b = new ArrayList();
        this.c = c;
    }
    
    public void a() {
        this.b.clear();
        this.a = null;
    }
    
    public void a(final n n) {
        this.b.add(n);
    }
    
    public void b() {
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        return this.b.size();
    }
    
    public Object getItem(final int n) {
        return n;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public int getItemViewType(final int n) {
        if (n == 0) {
            return 0;
        }
        return 1;
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        final int v = MediaGalleryBase.v;
        final n n2 = this.b.get(n);
        if (n == 0 && this.a != null) {
            a = this.a;
        }
        else {
            Label_0067: {
                if (a == null) {
                    final View a2 = alm.a(this.c, 2130903159, null);
                    if (n == 0) {
                        this.a = a2;
                        if (v != 0) {
                            break Label_0067;
                        }
                    }
                    a = a2;
                }
            }
            if (GalleryPickerFragment.i() && !App.ak()) {
                a.setPadding(this.d.getResources().getDimensionPixelSize(2131361912), 0, 0, 0);
            }
            final TextView textView = (TextView)a.findViewById(2131755086);
            final ImageView imageView = (ImageView)a.findViewById(2131755085);
            final TextView textView2 = (TextView)a.findViewById(2131755318);
            final ImageView imageView2 = (ImageView)a.findViewById(2131755473);
            textView2.setText((CharSequence)NumberFormat.getInstance().format(n2.e));
            Label_0209: {
                if (n2.f == 6) {
                    textView.setText(cq.b(n2.a, (Context)this.d.getActivity(), (Paint)textView.getPaint()));
                    if (v == 0) {
                        break Label_0209;
                    }
                }
                textView.setText((CharSequence)n2.a);
            }
            imageView.setImageResource(n2.c());
            final b8 b8 = (b8)imageView2.getTag();
            if (b8 == null || !b8.a().equals(n2.a())) {
                GalleryPickerFragment.f(this.d).a(b8);
                final bj d = n2.d;
                final b tag = new b(this, imageView2, d, n2);
                final al al = new al(this, imageView2, tag, d);
                imageView2.setTag((Object)tag);
                GalleryPickerFragment.f(this.d).a(tag, al);
                return a;
            }
        }
        return a;
    }
    
    public int getViewTypeCount() {
        return 2;
    }
    
    public boolean hasStableIds() {
        return true;
    }
}
