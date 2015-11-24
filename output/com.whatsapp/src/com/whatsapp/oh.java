// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.aq;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class oh implements AdapterView$OnItemClickListener
{
    final ContactsFragment a;
    
    oh(final ContactsFragment a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final boolean i = App.I;
        final int n3 = n - 1;
        Label_0155: {
            if (ContactsFragment.b(this.a) != null) {
                break Label_0155;
            }
            if (aqw.a(ContactsFragment.a(this.a), n3)) {
                aam.a(aq.TELL_A_FRIEND, ag.CONTACTS_LIST);
                App.a(this.a.getActivity());
                if (!i) {
                    return;
                }
            }
            if (aqw.c(ContactsFragment.a(this.a), n3)) {
                ContactsFragment.j(this.a);
                if (!i) {
                    return;
                }
            }
            if (!aqw.b(ContactsFragment.a(this.a), n3)) {
                final a_9 b = ContactsFragment.a(this.a).b(n3);
                Label_0150: {
                    if (b.b) {
                        this.a.startActivity(Conversation.a(b));
                        if (!i) {
                            break Label_0150;
                        }
                    }
                    ContactsFragment.a(this.a, b);
                }
                if (i) {
                    break Label_0155;
                }
            }
            return;
        }
        if (aqw.a(ContactsFragment.a(this.a), n3) || aqw.c(ContactsFragment.a(this.a), n3) || aqw.b(ContactsFragment.a(this.a), n3)) {
            return;
        }
        final a_9 b2 = ContactsFragment.a(this.a).b(n3);
        if (b2.b) {
            Label_0370: {
                if (ContactsFragment.b(this.a).containsKey(b2.u)) {
                    ContactsFragment.b(this.a).remove(b2.u);
                    view.setBackgroundResource(0);
                    if (!i) {
                        break Label_0370;
                    }
                }
                if (ym.b > 0 && ContactsFragment.b(this.a).size() >= ym.b) {
                    ((gu)this.a.getActivity()).f(String.format(this.a.getString(2131230846), ym.b));
                    if (!i) {
                        break Label_0370;
                    }
                }
                ContactsFragment.b(this.a).put(b2.u, b2);
                view.setBackgroundResource(2130837749);
            }
            ContactsFragment.h(this.a);
        }
    }
}
