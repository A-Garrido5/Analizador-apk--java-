// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.graphics.Paint;
import com.whatsapp.util.cq;
import android.widget.TextView;
import com.whatsapp.protocol.c6;
import com.whatsapp.protocol.b7;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

class wf extends BaseAdapter
{
    public LayoutInflater a;
    final BroadcastDetails b;
    
    public wf(final BroadcastDetails b, final Context context) {
        this.b = b;
        this.a = LayoutInflater.from(context);
    }
    
    public int getCount() {
        return BroadcastDetails.d(this.b).length;
    }
    
    public Object getItem(final int n) {
        return BroadcastDetails.d(this.b)[n];
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        int imageResource = 2130838939;
        final boolean i = App.I;
        if (view == null) {
            final View a = alm.a(this.a, 2130903083, viewGroup, false);
            if (!i) {
                view = a;
            }
        }
        final ImageView imageView = (ImageView)view.findViewById(2131755296);
        Label_0142: {
            if (b7.a(BroadcastDetails.b(this.b).c, 5) < 0 || i) {
                if (BroadcastDetails.b(this.b).c == 4) {
                    final bi a2 = App.ak.a(new c6(BroadcastDetails.d(this.b)[n], true, BroadcastDetails.b(this.b).a.c));
                    if (a2 == null || b7.a(a2.c, 5) < 0) {
                        imageResource = 2130838946;
                    }
                    if (!i) {
                        break Label_0142;
                    }
                }
                imageResource = 2130838940;
            }
        }
        imageView.setImageResource(imageResource);
        final a_9 e = App.S.e(BroadcastDetails.d(this.b)[n]);
        BroadcastDetails.a(this.b).b(e, (ImageView)view.findViewById(2131755295));
        final TextView textView = (TextView)view.findViewById(2131755297);
        textView.setText((CharSequence)e.a((Context)this.b));
        textView.setTextColor(this.b.getResources().getColor(2131623957));
        final TextView textView2 = (TextView)view.findViewById(2131755298);
        if (textView2 != null) {
            textView2.setTextColor(this.b.getResources().getColor(2131623985));
            textView2.setText(cq.b(e.d, this.b.getBaseContext(), (Paint)textView2.getPaint()));
        }
        view.setTag((Object)e);
        return view;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
}
