// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.preference;

import com.whatsapp.ConversationRow;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;

class c extends BaseAdapter
{
    final CharSequence[] a;
    final WaFontListPreference b;
    final CharSequence[] c;
    
    c(final WaFontListPreference b, final CharSequence[] c, final CharSequence[] a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public int getCount() {
        return this.c.length;
    }
    
    public Object getItem(final int n) {
        return this.a[n];
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final boolean a = WaListPreference.a;
        final View inflate = LayoutInflater.from(this.b.getContext()).inflate(17367043, (ViewGroup)null, false);
        final TextView textView = (TextView)inflate.findViewById(16908308);
        int n2 = 0;
        Label_0067: {
            Label_0109: {
                switch (n) {
                    case 0: {
                        n2 = -1;
                        if (a) {
                            break Label_0109;
                        }
                        break Label_0067;
                    }
                    case 2: {
                        n2 = 1;
                        if (a) {
                            break;
                        }
                        break Label_0067;
                    }
                }
            }
            n2 = 0;
        }
        textView.setTextSize(ConversationRow.a(this.b.getContext().getResources(), n2));
        textView.setText(this.c[n]);
        return inflate;
    }
}
