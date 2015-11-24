// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.twitter.library.card.h;
import com.twitter.library.card.CardDebugLog;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;

public class CardDebugFragment extends Fragment
{
    private bl a;
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        final View inflate = layoutInflater.inflate(2130968627, viewGroup, false);
        ((Button)inflate.findViewById(2131886359)).setOnClickListener((View$OnClickListener)new bj(this));
        CardDebugLog.a(this.a = new bl(this, (Context)this.getActivity()));
        final ListView listView = (ListView)inflate.findViewById(2131886360);
        listView.setAdapter((ListAdapter)this.a);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new bk(this));
        return inflate;
    }
    
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        CardDebugLog.b(this.a);
        this.a = null;
    }
}
