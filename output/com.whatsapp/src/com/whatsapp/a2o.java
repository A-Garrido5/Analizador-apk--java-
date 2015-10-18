// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.io.Serializable;
import com.whatsapp.protocol.bi;
import java.util.ArrayList;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class a2o implements AdapterView$OnItemClickListener
{
    private static final String[] z;
    final CallsFragment a;
    
    static {
        final String[] z2 = new String[3];
        String s = "{R]\u001b#";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'P';
                        break;
                    }
                    case 0: {
                        c2 = '\u0018';
                        break;
                    }
                    case 1: {
                        c2 = '3';
                        break;
                    }
                    case 2: {
                        c2 = '1';
                        break;
                    }
                    case 3: {
                        c2 = 'w';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "rZU";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "{R]\u001b#7\\_>$}^r\u001b9{X\u001e\u0012=hGH";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a2o(final CallsFragment a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final boolean i = App.I;
        final e_ e_ = (e_)view.getTag();
        if (e_ == null || e_.f()) {
            Log.e(a2o.z[2]);
            return;
        }
        final Intent intent = new Intent(App.aq.getApplicationContext(), (Class)CallLogActivity.class);
        intent.putExtra(a2o.z[1], e_.e().u);
        final ArrayList<d6> list = new ArrayList<d6>();
        final Iterator iterator = com.whatsapp.e_.a(e_).iterator();
        while (iterator.hasNext()) {
            list.add(new d6(iterator.next().a));
            if (i) {
                break;
            }
        }
        intent.putExtra(a2o.z[0], (Serializable)list);
        this.a.startActivity(intent);
    }
}
