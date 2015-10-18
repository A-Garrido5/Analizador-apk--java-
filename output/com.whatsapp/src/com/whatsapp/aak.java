// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Locale;
import android.text.format.DateUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import com.whatsapp.protocol.bt;
import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;

class aak extends ArrayAdapter
{
    private static final String[] z;
    final ao2 a;
    
    static {
        final String[] z2 = new String[4];
        String s = "'\rW&93Z";
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
                        c2 = '\u0017';
                        break;
                    }
                    case 0: {
                        c2 = '\u0002';
                        break;
                    }
                    case 1: {
                        c2 = '<';
                        break;
                    }
                    case 2: {
                        c2 = 's';
                        break;
                    }
                    case 3: {
                        c2 = '\n';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ".\u001c";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "'\rW&93Z";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = ".\u001c";
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
    
    public aak(final ao2 a, final Context context, final List list) {
        this.a = a;
        super(context, 2130903201, list);
    }
    
    public bt a(final int n) {
        return this.a.g.get(n);
    }
    
    public int getCount() {
        return this.a.g.size();
    }
    
    public Object getItem(final int n) {
        return this.a(n);
    }
    
    public int getItemViewType(final int n) {
        return 0;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (view == null) {
            final View a = alm.a(ao2.h(this.a).getLayoutInflater(), 2130903201, viewGroup, false);
            if (!i) {
                view = a;
            }
        }
        view.setBackgroundResource(2130839068);
        view.setSelected(true);
        final TextView textView = (TextView)view.findViewById(2131755405);
        final TextView textView2 = (TextView)view.findViewById(2131755296);
        final ImageView imageView = (ImageView)view.findViewById(2131755583);
        final bt a2 = this.a(n);
        final a_9 e = App.S.e(a2.e);
        Label_0128: {
            if (this.a.k.contains(a2)) {
                view.setBackgroundColor(-3151373);
                if (!i) {
                    break Label_0128;
                }
            }
            view.setBackgroundResource(0);
        }
        view.setTag((Object)a2);
        textView.setText((CharSequence)e.a(this.getContext()));
        ao2.i(this.a).b(e, imageView);
        String text = null;
        Label_0219: {
            if (System.currentTimeMillis() - a2.d < 60000L) {
                text = ao2.h(this.a).getString(2131231280);
                if (!i) {
                    break Label_0219;
                }
            }
            text = DateUtils.getRelativeTimeSpanString(a2.d, System.currentTimeMillis(), 60000L, 0).toString();
        }
        if (a2.a != 0) {
            text = text + aak.z[3] + ao2.h(this.a).getString(2131231277, new Object[] { a2.a });
        }
        Label_0528: {
            if (a2.h > 0.44704) {
                text += aak.z[1];
                if (Locale.US.equals(Locale.getDefault())) {
                    text += ao2.h(this.a).getString(2131231285, new Object[] { String.format(aak.z[2], 2.23694 * a2.h) });
                    if (!i) {
                        break Label_0528;
                    }
                }
                text += ao2.h(this.a).getString(2131231284, new Object[] { String.format(aak.z[0], 3.6 * a2.h) });
            }
        }
        textView2.setText((CharSequence)text);
        return view;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
}
