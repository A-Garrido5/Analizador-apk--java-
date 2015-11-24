// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import java.util.Iterator;
import java.util.ArrayList;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;

public class ArchivedConversationsFragment extends ConversationsFragment
{
    @Override
    public void b() {
        super.b();
        if (z8.c() == 0) {
            this.getActivity().finish();
        }
    }
    
    @Override
    protected void b(final View view) {
        super.b(view);
        if (z8.c() != 0) {
            this.getListView().getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new mp(this, view.getTop()));
        }
    }
    
    @Override
    protected void d() {
        this.i.setVisibility(8);
        this.l.setVisibility(8);
        this.f.setVisibility(8);
    }
    
    @Override
    protected ArrayList f() {
        final boolean i = App.I;
        final ArrayList d = z8.d();
        final ArrayList list = new ArrayList<al_>(d.size());
        final Iterator<String> iterator = d.iterator();
        while (iterator.hasNext()) {
            list.add(new al_(iterator.next()));
            if (i) {
                break;
            }
        }
        return list;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
    }
}
