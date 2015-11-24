// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.b6;
import java.util.List;
import android.text.SpannableStringBuilder;
import com.whatsapp.util.aa;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.content.Context;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.BaseAdapter;

class ask extends BaseAdapter implements Filterable
{
    private Filter a;
    final CallsFragment b;
    
    private ask(final CallsFragment b) {
        this.b = b;
    }
    
    ask(final CallsFragment callsFragment, final a83 a83) {
        this(callsFragment);
    }
    
    public e_ a(final int n) {
        return CallsFragment.a(this.b).get(n);
    }
    
    public int getCount() {
        return CallsFragment.a(this.b).size();
    }
    
    public Filter getFilter() {
        if (this.a == null) {
            this.a = new aw0(this.b, null);
        }
        return this.a;
    }
    
    public Object getItem(final int n) {
        return this.a(n);
    }
    
    public long getItemId(final int n) {
        return CallsFragment.a(this.b).get(n).hashCode();
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        final e_ a2 = this.a(n);
        if (a == null) {
            a = alm.a(this.b.getLayoutInflater(null), 2130903088, viewGroup, false);
        }
        final a_9 e = a2.e();
        final ImageView imageView = (ImageView)a.findViewById(2131755295);
        final View viewById = a.findViewById(2131755316);
        final a0e a0e = new a0e(e.u, (Context)this.b.getActivity());
        imageView.setOnClickListener((View$OnClickListener)a0e);
        viewById.setOnClickListener((View$OnClickListener)a0e);
        CallsFragment.h(this.b).b(e, imageView);
        final TextEmojiLabel textEmojiLabel = (TextEmojiLabel)a.findViewById(2131755277);
        vc.b(textEmojiLabel);
        CharSequence text = e.a((Context)this.b.getActivity());
        if (!TextUtils.isEmpty(CallsFragment.e(this.b))) {
            text = aa.a((Context)this.b.getActivity(), null, text.toString(), CallsFragment.b(this.b));
        }
        textEmojiLabel.setText(text);
        ((TextView)a.findViewById(2131755319)).setText(b6.b((Context)this.b.getActivity(), a2.a()));
        final TextView textView = (TextView)a.findViewById(2131755318);
        final int c = a2.c();
        Label_0282: {
            if (c > 1) {
                textView.setText((CharSequence)("(" + Integer.toString(c) + ")"));
                textView.setVisibility(0);
                if (!App.I) {
                    break Label_0282;
                }
            }
            textView.setVisibility(8);
        }
        ((ImageView)a.findViewById(2131755305)).setImageResource(a2.d());
        final View viewById2 = a.findViewById(2131755317);
        viewById2.setOnClickListener((View$OnClickListener)this.b.f);
        viewById2.setTag((Object)a2);
        a.setTag((Object)a2);
        return a;
    }
    
    public boolean hasStableIds() {
        return true;
    }
}
