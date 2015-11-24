// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.cq;
import java.util.List;
import android.text.SpannableStringBuilder;
import com.whatsapp.util.aa;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.BaseAdapter;

class o4 extends BaseAdapter implements Filterable
{
    private static final String[] z;
    private Filter a;
    private ArrayList b;
    final MultipleContactsSelector c;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u0001e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'U';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = '\b';
                        break;
                    }
                    case 3: {
                        c2 = ',';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0001e";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public o4(final MultipleContactsSelector c) {
        this.c = c;
        this.a = new tl(this, null);
    }
    
    static ArrayList a(final o4 o4, final ArrayList b) {
        return o4.b = b;
    }
    
    public a_9 a(final int n) {
        return this.b.get(n);
    }
    
    public int getCount() {
        if (this.b != null) {
            return this.b.size();
        }
        return 0;
    }
    
    public Filter getFilter() {
        return this.a;
    }
    
    public Object getItem(final int n) {
        return this.a(n);
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        final a_9 a2 = this.a(n);
        if (a == null) {
            a = alm.a(this.c.getLayoutInflater(), 2130903079, null);
        }
        MultipleContactsSelector.c(this.c).b(a2, (ImageView)a.findViewById(2131755275));
        final TextView textView = (TextView)a.findViewById(2131755277);
        vc.b(textView);
        final String a3 = a2.a((Context)this.c);
        this.c.t.getText().toString().toLowerCase();
        textView.setText(aa.a((Context)this.c, null, a3, MultipleContactsSelector.d(this.c)));
        final TextView textView2 = (TextView)a.findViewById(2131755279);
        Label_0228: {
            if (App.p(a2.u)) {
                textView2.setText(2131231868);
                textView.setTextColor(-7829368);
                a.setLongClickable(true);
                if (!App.I) {
                    break Label_0228;
                }
            }
            String string;
            if (a2.d != null) {
                string = a2.d + o4.z[0];
            }
            else {
                string = o4.z[1];
            }
            textView.setTextColor(-16777216);
            textView2.setText(cq.b(string, this.c.getBaseContext()));
            a.setLongClickable(false);
        }
        final CharSequence a4 = a2.a(this.c.getResources());
        if (a4 != null) {
            ((TextView)a.findViewById(2131755278)).setText(a4);
        }
        a.setTag((Object)a2);
        return a;
    }
    
    public boolean hasStableIds() {
        return true;
    }
}
