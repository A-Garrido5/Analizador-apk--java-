// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import android.widget.CheckBox;
import com.whatsapp.util.cq;
import android.text.SpannableStringBuilder;
import com.whatsapp.util.aa;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;

class tv extends ArrayAdapter
{
    private static final String[] z;
    final MultipleContactPicker a;
    
    static {
        final String[] z2 = new String[4];
        String s = "9!";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\n';
                        break;
                    }
                    case 0: {
                        c2 = '\u0019';
                        break;
                    }
                    case 1: {
                        c2 = '\u0001';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = ']';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "9!";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "9!";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "9!";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public tv(final MultipleContactPicker a, final Context context, final int n, final List list) {
        this.a = a;
        super(context, n, list);
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        final a_9 tag = (a_9)this.getItem(n);
        if (MultipleContactPicker.a(tag)) {
            final View a = alm.a(this.a.getLayoutInflater(), 2130903193, viewGroup, false);
            a.setTag((Object)2);
            return a;
        }
        if (view == null || (int)view.getTag() != 1) {
            final View a2 = alm.a(this.a.getLayoutInflater(), 2130903192, viewGroup, false);
            if (!i) {
                view = a2;
            }
        }
        view.setTag((Object)1);
        MultipleContactPicker.a(this.a).b(tag, (ImageView)view.findViewById(2131755295));
        final TextView textView = (TextView)view.findViewById(2131755678);
        vc.b(textView);
        final String a3 = tag.a(this.getContext());
        MultipleContactPicker.e(this.a).getText().toString().toLowerCase();
        textView.setText(aa.a(this.getContext(), null, a3, MultipleContactPicker.f(this.a)));
        final TextView textView2 = (TextView)view.findViewById(2131755679);
        String string;
        if (tag.d != null) {
            string = tag.d + tv.z[1];
        }
        else {
            string = tv.z[2];
        }
        textView2.setText((CharSequence)string);
        Label_0367: {
            if (App.p(tag.u)) {
                textView2.setText(2131231842);
                textView.setTextColor(-7829368);
                view.setLongClickable(true);
                view.findViewById(2131755677).setVisibility(8);
                if (!i) {
                    break Label_0367;
                }
            }
            String string2;
            if (tag.d != null) {
                string2 = tag.d + tv.z[0];
            }
            else {
                string2 = tv.z[3];
            }
            textView2.setText(cq.b(string2, this.a.getBaseContext()));
            textView.setTextColor(-16777216);
            view.setLongClickable(false);
            view.findViewById(2131755677).setVisibility(0);
        }
        final CheckBox checkBox = (CheckBox)view.findViewById(2131755677);
        checkBox.setFocusable(false);
        checkBox.setOnClickListener((View$OnClickListener)new ahn(this));
        checkBox.setChecked(tag.g);
        checkBox.setTag((Object)tag);
        return view;
    }
}
