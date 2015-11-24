// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;
import android.content.res.Resources;
import com.twitter.library.card.i;
import com.twitter.library.card.CardDebugLog;
import com.twitter.library.card.CardDebugLog$Severity;
import java.text.SimpleDateFormat;
import android.content.Context;
import android.os.Handler;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.text.DateFormat;
import com.twitter.library.card.h;
import android.widget.ArrayAdapter;

class bl extends ArrayAdapter implements h
{
    final DateFormat a;
    final HashMap b;
    final Drawable c;
    final Handler d;
    final Runnable e;
    final /* synthetic */ CardDebugFragment f;
    
    public bl(final CardDebugFragment f, final Context context) {
        this.f = f;
        super(context, 2130968628);
        this.e = new bm(this);
        this.a = new SimpleDateFormat("HH:mm:ss.SSS");
        final Resources resources = context.getResources();
        this.c = resources.getDrawable(2130838757);
        final bp bp = new bp(resources.getDrawable(2130838758), resources.getColor(2131689533), 2131492964);
        final bp bp2 = new bp(resources.getDrawable(2130838760), resources.getColor(2131689537), 2131492966);
        final bp bp3 = new bp(resources.getDrawable(2130838759), resources.getColor(2131689535), 2131492965);
        final bp bp4 = new bp(resources.getDrawable(2130838756), resources.getColor(2131689529), 2131492963);
        (this.b = new HashMap()).put(CardDebugLog$Severity.d, bp);
        this.b.put(CardDebugLog$Severity.c, bp2);
        this.b.put(CardDebugLog$Severity.b, bp3);
        this.b.put(CardDebugLog$Severity.a, bp4);
        this.d = new Handler();
        final Iterator<i> iterator = (Iterator<i>)CardDebugLog.h().iterator();
        while (iterator.hasNext()) {
            this.add((Object)iterator.next());
        }
    }
    
    public void a() {
        this.d.post((Runnable)new bo(this));
    }
    
    public void a(final i i) {
        this.d.post((Runnable)new bn(this, i));
    }
    
    void b() {
        this.notifyDataSetChanged();
    }
    
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        if (inflate == null) {
            inflate = ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2130968628, (ViewGroup)null);
            inflate.setTag((Object)new bq((TextView)inflate.findViewById(2131886361), (TextView)inflate.findViewById(2131886362)));
        }
        final bq bq = (bq)inflate.getTag();
        final i i = (i)this.getItem(n);
        long n2 = 101L;
        if (n > 0) {
            n2 = i.d.getTime() - ((i)this.getItem(n - 1)).d.getTime();
        }
        if (n == 0 || n2 > 100L) {
            bq.a.setText((CharSequence)this.a.format(i.d));
            bq.a.setVisibility(0);
        }
        else {
            bq.a.setVisibility(8);
        }
        final bp bp = this.b.get(i.a);
        bq.b.setText((CharSequence)i.b);
        bq.b.setTextAppearance((Context)this.f.getActivity(), bp.b);
        final TextView b = bq.b;
        final Drawable a = bp.a;
        Drawable c;
        if (TextUtils.isEmpty((CharSequence)i.c)) {
            c = null;
        }
        else {
            c = this.c;
        }
        b.setCompoundDrawablesWithIntrinsicBounds(a, (Drawable)null, c, (Drawable)null);
        return inflate;
    }
}
