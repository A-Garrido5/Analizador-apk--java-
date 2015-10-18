// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;

class k9 extends BaseAdapter
{
    final MessageDetailsActivity a;
    
    private k9(final MessageDetailsActivity a) {
        this.a = a;
    }
    
    k9(final MessageDetailsActivity messageDetailsActivity, final si si) {
        this(messageDetailsActivity);
    }
    
    public int getCount() {
        return 1;
    }
    
    public Object getItem(final int n) {
        return null;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (view == null) {
            final View a = alm.a(this.a.getLayoutInflater(), 2130903188, viewGroup, false);
            if (!i) {
                view = a;
            }
        }
        final wg b = MessageDetailsActivity.a(this.a).get(0).b;
        final View viewById = view.findViewById(2131755659);
        Label_0103: {
            if (MessageDetailsActivity.e(this.a).I == 2 && MessageDetailsActivity.e(this.a).E == 1) {
                viewById.setVisibility(0);
                if (!i) {
                    break Label_0103;
                }
            }
            viewById.setVisibility(8);
        }
        final TextView textView = (TextView)view.findViewById(2131755661);
        int text;
        if (MessageDetailsActivity.e(this.a).I == 0) {
            text = 2131231328;
        }
        else {
            text = 2131231330;
        }
        textView.setText(text);
        final TextView textView2 = (TextView)view.findViewById(2131755664);
        final TextView textView3 = (TextView)view.findViewById(2131755663);
        final TextView textView4 = (TextView)view.findViewById(2131755662);
        final TextView textView5 = (TextView)view.findViewById(2131755660);
        textView2.setText(MessageDetailsActivity.a(this.a, MessageDetailsActivity.e(this.a).u));
        Label_0245: {
            if (b.a(5) > 0L) {
                textView3.setText(MessageDetailsActivity.a(this.a, b.a(5)));
                if (!i) {
                    break Label_0245;
                }
            }
            textView3.setText((CharSequence)"\u2014");
        }
        Label_0288: {
            if (b.a(13) > 0L) {
                textView4.setText(MessageDetailsActivity.a(this.a, b.a(13)));
                if (!i) {
                    break Label_0288;
                }
            }
            textView4.setText((CharSequence)"\u2014");
        }
        if (b.a(8) > 0L) {
            textView5.setText(MessageDetailsActivity.a(this.a, b.a(8)));
            if (!i) {
                return view;
            }
        }
        textView5.setText((CharSequence)"\u2014");
        return view;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
}
