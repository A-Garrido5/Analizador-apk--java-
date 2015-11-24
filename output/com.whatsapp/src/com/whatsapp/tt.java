// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Paint;
import com.whatsapp.util.cq;
import android.widget.TextView;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

class tt extends ArrayAdapter
{
    public LayoutInflater a;
    final ListChatInfo b;
    
    public tt(final ListChatInfo b, final Context context, final int n, final List list) {
        this.b = b;
        super(context, n, list);
        this.a = LayoutInflater.from(context);
    }
    
    private void a(final TextView textView, final String s) {
        textView.setText(cq.b(s, this.b.getBaseContext(), (Paint)textView.getPaint()));
    }
    
    public int getCount() {
        return ListChatInfo.f(this.b).size();
    }
    
    public int getItemViewType(final int n) {
        if (((a_9)this.getItem(n)).r()) {
            return 1;
        }
        return 0;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        Label_0045: {
            if (view == null) {
                int n2;
                if (this.getItemViewType(n) == 0) {
                    n2 = 2130903163;
                }
                else {
                    n2 = 2130903164;
                }
                final View a = alm.a(this.a, n2, viewGroup, false);
                if (!i) {
                    view = a;
                    break Label_0045;
                }
            }
            view.setBackgroundResource(2130839068);
        }
        view.setBackgroundResource(2130838971);
        view.findViewById(2131755309).setVisibility(0);
        final TextView textView = (TextView)view.findViewById(2131755405);
        final TextView textView2 = (TextView)view.findViewById(2131755296);
        final ImageView imageView = (ImageView)view.findViewById(2131755583);
        final a_9 tag = (a_9)this.getItem(n);
        view.setTag((Object)tag);
        textView.setText((CharSequence)tag.a(this.getContext()));
        ListChatInfo.b(this.b).b(tag, imageView);
        if (tag.r()) {
            String string;
            if (tag.o != null) {
                string = "~" + tag.o;
            }
            else {
                string = null;
            }
            this.a(textView2, string);
            if (!i) {
                return view;
            }
        }
        this.a(textView2, tag.d);
        return view;
    }
    
    public int getViewTypeCount() {
        return 2;
    }
}
