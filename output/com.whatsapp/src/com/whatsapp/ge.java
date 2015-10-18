// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.format.DateUtils;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import com.whatsapp.protocol.bi;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;
import android.widget.ArrayAdapter;

class ge extends ArrayAdapter
{
    protected List a;
    final CallLogActivity b;
    
    public ge(final CallLogActivity b, final Context context) {
        this.b = b;
        super(context, 2130903086, (List)null);
        this.a = new ArrayList();
    }
    
    public bi a(final int n) {
        return this.a.get(n);
    }
    
    public void a(final List a) {
        this.a = a;
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }
    
    public Object getItem(final int n) {
        return this.a(n);
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (view == null) {
            final View a = alm.a(this.b.getLayoutInflater(), 2130903086, viewGroup, false);
            if (!i) {
                view = a;
            }
        }
        final View viewById = view.findViewById(2131755309);
        Label_0078: {
            if (n == -1 + this.getCount()) {
                view.setBackgroundResource(2130838967);
                viewById.setVisibility(8);
                if (!i) {
                    break Label_0078;
                }
            }
            view.setBackgroundResource(2130838971);
            viewById.setVisibility(0);
        }
        final bi a2 = this.a(n);
        final ImageView imageView = (ImageView)view.findViewById(2131755305);
        final TextView textView = (TextView)view.findViewById(2131755307);
        final TextView textView2 = (TextView)view.findViewById(2131755308);
        final TextView textView3 = (TextView)view.findViewById(2131755306);
        imageView.setImageResource(CallLogActivity.b(a2));
        textView.setText(CallLogActivity.a(a2));
        textView2.setText((CharSequence)DateUtils.formatDateTime(this.b.getBaseContext(), App.i(a2), 1));
        Label_0239: {
            if (a2.D > 0) {
                textView3.setText((CharSequence)DateUtils.formatElapsedTime((long)a2.D));
                textView3.setVisibility(0);
                if (!i) {
                    break Label_0239;
                }
            }
            if (a2.a.b) {
                textView3.setText(2131230857);
                textView3.setVisibility(0);
                if (!i) {
                    break Label_0239;
                }
            }
            textView3.setVisibility(8);
        }
        vc.a(textView3);
        return view;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
}
