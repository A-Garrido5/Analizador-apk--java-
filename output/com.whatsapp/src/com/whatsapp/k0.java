// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Messenger;
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

class k0 extends ArrayAdapter
{
    private static final String z;
    public LayoutInflater a;
    final GroupChatInfo b;
    
    static {
        final char[] charArray = "M\u0013\u007fNdl\u0014\"X|}N?\\x".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\f';
                    break;
                }
                case 0: {
                    c2 = '\r';
                    break;
                }
                case 1: {
                    c2 = '`';
                    break;
                }
                case 2: {
                    c2 = 'Q';
                    break;
                }
                case 3: {
                    c2 = '9';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public k0(final GroupChatInfo b, final Context context, final List list) {
        this.b = b;
        super(context, 2130903163, list);
        this.a = LayoutInflater.from(context);
    }
    
    private void a(final TextView textView, final String s) {
        textView.setText(cq.b(s, this.b.getBaseContext(), (Paint)textView.getPaint()));
    }
    
    private boolean a(final int n) {
        return App.S.f(GroupChatInfo.h(this.b).get(n).u);
    }
    
    public int getCount() {
        return GroupChatInfo.h(this.b).size();
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (view == null) {
            final View a = alm.a(this.a, 2130903163, viewGroup, false);
            if (!i) {
                view = a;
            }
        }
        Label_0088: {
            if (n == -1 + this.getCount() && !adc.e(GroupChatInfo.l(this.b))) {
                view.setBackgroundResource(2130838967);
                view.findViewById(2131755309).setVisibility(8);
                if (!i) {
                    break Label_0088;
                }
            }
            view.setBackgroundResource(2130838971);
            view.findViewById(2131755309).setVisibility(0);
        }
        final TextView textView = (TextView)view.findViewById(2131755405);
        final TextView textView2 = (TextView)view.findViewById(2131755296);
        final ImageView imageView = (ImageView)view.findViewById(2131755583);
        final TextView textView3 = (TextView)view.findViewById(2131755584);
        final TextView textView4 = (TextView)view.findViewById(2131755585);
        textView.setText((CharSequence)null);
        textView.setTextColor(this.b.getResources().getColor(2131624012));
        textView2.setText((CharSequence)null);
        textView2.setTextColor(this.b.getResources().getColor(2131624011));
        textView3.setVisibility(8);
        textView4.setVisibility(8);
        if (this.a(n)) {
            view.setTag((Object)null);
            textView.setText((CharSequence)this.b.getString(2131231980));
            Label_0291: {
                if (!App.ba) {
                    App.a(App.au() + k0.z, 0L, new Messenger(GroupChatInfo.a(this.b)));
                    if (!i) {
                        break Label_0291;
                    }
                }
                this.a(textView2, App.aB);
            }
            if (adc.e(GroupChatInfo.l(this.b))) {
                textView3.setVisibility(0);
            }
            GroupChatInfo.t(this.b).b(App.S.e(), imageView);
            if (!i) {
                return view;
            }
        }
        final a_9 tag = (a_9)this.getItem(n);
        view.setTag((Object)tag);
        textView.setText((CharSequence)tag.a((Context)this.b));
        if (GroupChatInfo.r(this.b).containsKey(tag.u)) {
            imageView.setImageResource(2130838790);
            textView.setTextColor(this.b.getResources().getColor(2131623984));
            textView2.setTextColor(this.b.getResources().getColor(2131623984));
            textView2.setText(2131231839);
            if (!i) {
                return view;
            }
        }
        if (adc.b(GroupChatInfo.l(this.b), tag.u)) {
            textView3.setVisibility(0);
        }
        GroupChatInfo.t(this.b).b(tag, imageView);
        if (tag.r()) {
            textView4.setVisibility(0);
            String string;
            if (tag.o != null) {
                string = "~" + tag.o;
            }
            else {
                string = null;
            }
            this.a(textView4, string);
        }
        this.a(textView2, tag.d);
        return view;
    }
}
