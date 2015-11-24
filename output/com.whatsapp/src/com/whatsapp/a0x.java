// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.view.inputmethod.InputMethodManager;
import android.content.Intent;
import android.content.Context;
import com.whatsapp.util.bm;
import java.util.Vector;
import com.whatsapp.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class a0x implements AdapterView$OnItemClickListener
{
    private static final String[] z;
    final ConversationsFragment a;
    
    static {
        final String[] z2 = new String[7];
        String s = "|BH/V}QT:";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '2';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = '0';
                        break;
                    }
                    case 2: {
                        c2 = '\'';
                        break;
                    }
                    case 3: {
                        c2 = 'N';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "w^W;FA]B:ZqT";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "}_I8WlCF:[q^TaQrYD%\u001dtYCn";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ">@H=\u000f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "l_P\u0011[z";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "}_I8WlCF:[q^TaQrYD%\u001dpEK\"\u001dn_Tn";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "oEB<K";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a0x(final ConversationsFragment a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final boolean i = App.I;
        final ef ef = (ef)view.getTag();
        if (ef == null) {
            Log.i(a0x.z[5] + n);
        }
        else {
            final String a = ef.c.a();
            if (a != null) {
                Log.i(a0x.z[2] + a + a0x.z[3] + n);
                final a_9 a2 = z8.a(a);
                if (ef.e.getVisibility() != 0) {
                    if (a_9.c(a)) {
                        if (App.O()) {
                            final bi c = App.ak.C(a);
                            if (c == null) {
                                return;
                            }
                            App.ak.g(adc.a(a, c.c(), (Vector)c.N, 2));
                            bm.a(new a29(this, a, c));
                            if (!i) {
                                return;
                            }
                        }
                        App.a((Context)this.a.getActivity(), 2131231385, 0);
                        if (!i) {
                            return;
                        }
                    }
                    if (a0x.z[0].equals(a)) {
                        this.a.startActivity(new Intent((Context)this.a.getActivity(), (Class)Broadcasts.class));
                        if (!i) {
                            return;
                        }
                    }
                    if (!a2.o()) {
                        final Intent a3 = Conversation.a(a2);
                        if (ef.c instanceof ce) {
                            a3.putExtra(a0x.z[4], ((ce)ef.c).a);
                            a3.putExtra(a0x.z[6], zb.a(ConversationsFragment.g(this.a)));
                            final View currentFocus = this.a.getActivity().getCurrentFocus();
                            if (currentFocus != null) {
                                ((InputMethodManager)App.aq.getSystemService(a0x.z[1])).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                            }
                        }
                        this.a.startActivity(a3);
                    }
                }
            }
        }
    }
}
