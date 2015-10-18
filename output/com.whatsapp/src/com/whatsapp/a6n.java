// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import android.os.AsyncTask;

class a6n extends AsyncTask
{
    final ContactsFragment a;
    
    private a6n(final ContactsFragment a) {
        this.a = a;
    }
    
    a6n(final ContactsFragment contactsFragment, final a0t a0t) {
        this(contactsFragment);
    }
    
    protected ArrayList a(final Void[] array) {
        final boolean i = App.I;
        final ArrayList<Object> list = new ArrayList<Object>();
        App.S.e(list);
        final HashSet set = new HashSet<String>(list.size(), 1.0f);
        final Iterator<a_9> iterator = list.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().t);
            if (i) {
                break;
            }
        }
        App.S.a(list, set);
        Collections.sort(list, new mb(this, this.a.getActivity().getApplicationContext()));
        return list;
    }
    
    protected void a(final ArrayList list) {
        ContactsFragment.d(this.a).clear();
        ContactsFragment.d(this.a).addAll(list);
        ContactsFragment.f(this.a).clear();
        Label_0139: {
            if (!list.isEmpty()) {
                if (TextUtils.isEmpty(ContactsFragment.c(this.a))) {
                    ContactsFragment.f(this.a).addAll(list);
                    if (ContactsFragment.f(this.a).size() == 0) {
                        ContactsFragment.f(this.a).add(ContactsFragment.d());
                    }
                    ContactsFragment.f(this.a).add(ContactsFragment.g());
                    ContactsFragment.f(this.a).add(ContactsFragment.i());
                    if (!App.I) {
                        break Label_0139;
                    }
                }
                this.a.a(ContactsFragment.c(this.a));
            }
        }
        ContactsFragment.a(this.a).notifyDataSetChanged();
        final View view = this.a.getView();
        if (view != null) {
            view.findViewById(2131755408).setVisibility(8);
            final View viewById = view.findViewById(2131755407);
            viewById.setVisibility(8);
            this.a.getListView().setEmptyView(viewById);
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((ArrayList)o);
    }
}
