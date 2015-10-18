// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.library.card.i;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class bk implements AdapterView$OnItemClickListener
{
    final /* synthetic */ CardDebugFragment a;
    
    bk(final CardDebugFragment a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final i i = (i)adapterView.getItemAtPosition(n);
        if (i != null && !TextUtils.isEmpty((CharSequence)i.c)) {
            final Intent intent = new Intent((Context)this.a.getActivity(), (Class)CardDebugDetailActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putString("detail_text", i.c.toString());
            intent.putExtras(bundle);
            this.a.getActivity().startActivity(intent);
        }
    }
}
