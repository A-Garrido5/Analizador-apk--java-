// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.SpannableStringBuilder;
import com.whatsapp.util.aa;
import com.whatsapp.util.cq;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.List;
import android.content.Context;
import java.util.ArrayList;
import android.widget.Filter;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

class aqw extends ArrayAdapter
{
    private static final String[] z;
    private final LayoutInflater a;
    private final Filter b;
    final ContactsFragment c;
    protected final ArrayList d;
    
    static {
        final String[] z2 = new String[3];
        String s = "\t*q\u0002\u000f\t1o\u001f\r\u0001 mY\u0007\u0019-z\u001a\u001e\u0018*hY\f\u000b!@\u0006\u0001\u0019,k\u001f\u0001\u0004e";
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
                        c2 = 'n';
                        break;
                    }
                    case 0: {
                        c2 = 'j';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = '\u001f';
                        break;
                    }
                    case 3: {
                        c2 = 'v';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\t*q\u0002\u000f\t1o\u001f\r\u0001 mY\u0007\u00191z\u001a\u0002\u000b#m\u001f\u000b\u0004!m\u0019\u0019E'~\u00121\u001a*l\u001f\u001a\u0003*qV";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\t*q\u0002\u000f\t1o\u001f\r\u0001 mY\u0000\u0005\u001a|\u0019\u0000\u001e$|\u0002\u001dE'~\u00121\u001a*l\u001f\u001a\u0003*qV";
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
    
    public aqw(final ContactsFragment c, final Context context, final ArrayList d) {
        this.c = c;
        super(context, 2130903104, (List)d);
        this.b = new xq(this, null);
        this.d = d;
        this.a = LayoutInflater.from(context);
    }
    
    private boolean a(final int n) {
        if (n >= this.d.size() || n < 0) {
            Log.e(aqw.z[0] + n);
        }
        else if (ContactsFragment.i() == this.d.get(n)) {
            return true;
        }
        return false;
    }
    
    static boolean a(final aqw aqw, final int n) {
        return aqw.c(n);
    }
    
    static boolean b(final aqw aqw, final int n) {
        return aqw.d(n);
    }
    
    private boolean c(final int n) {
        int n2 = 1;
        if (n >= this.d.size() || n < 0) {
            Log.e(aqw.z[n2] + n);
            n2 = 0;
        }
        else if (ContactsFragment.g() != this.d.get(n)) {
            return false;
        }
        return n2 != 0;
    }
    
    static boolean c(final aqw aqw, final int n) {
        return aqw.a(n);
    }
    
    private boolean d(final int n) {
        if (n >= this.d.size() || n < 0) {
            Log.e(aqw.z[2] + n);
        }
        else if (ContactsFragment.d() == this.d.get(n)) {
            return true;
        }
        return false;
    }
    
    public a_9 b(final int n) {
        return this.d.get(n);
    }
    
    public int getCount() {
        return this.d.size();
    }
    
    public Filter getFilter() {
        return this.b;
    }
    
    public Object getItem(final int n) {
        return this.b(n);
    }
    
    public long getItemId(final int n) {
        return n * 1024;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        final a_9 b = this.b(n);
        if (ContactsFragment.b(b)) {
            final LinearLayout linearLayout = new LinearLayout(this.getContext());
            alm.a(this.a, 2130903193, (ViewGroup)linearLayout, true);
            linearLayout.setTag((Object)3);
            linearLayout.findViewById(2131755680).setClickable(true);
            return (View)linearLayout;
        }
        final boolean c = this.c(n);
        final boolean d = this.d(n);
        final boolean a = this.a(n);
        View view3 = null;
        Label_0563: {
            Label_0560: {
                if (view == null) {
                    if (c || a) {
                        view = alm.a(this.a, 2130903105, null);
                        if (c) {
                            view.setTag((Object)2);
                            if (!i) {
                                break Label_0560;
                            }
                        }
                        view.findViewById(2131755416).setVisibility(8);
                        ((TextView)view.findViewById(2131755417)).setText(2131230941);
                        ((ImageView)view.findViewById(2131755082)).setImageResource(2130838774);
                        view.setTag((Object)4);
                        if (!i) {
                            break Label_0560;
                        }
                    }
                    if (d) {
                        view = alm.a(this.a, 2130903103, null);
                        view.findViewById(2131755409).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-2, (int)this.c.getResources().getDimension(2131361905)));
                        view.findViewById(2131755411).setClickable(true);
                        ((TextView)view.findViewById(2131755411)).setText(2131230934);
                        view.setTag((Object)5);
                        if (!i) {
                            break Label_0560;
                        }
                    }
                    view = alm.a(this.a, 2130903104, viewGroup, false);
                    view.setTag((Object)1);
                    if (!i) {
                        break Label_0560;
                    }
                }
                final int intValue = (int)view.getTag();
                if (c) {
                    if (intValue == 2) {
                        break Label_0560;
                    }
                    view = alm.a(this.a, 2130903105, null);
                    view.setTag((Object)2);
                    if (!i) {
                        break Label_0560;
                    }
                }
                if (a) {
                    if (intValue == 4) {
                        break Label_0560;
                    }
                    view = alm.a(this.a, 2130903105, null);
                    ((ImageView)view.findViewById(2131755082)).setImageResource(2130838774);
                    view.findViewById(2131755416).setVisibility(8);
                    ((TextView)view.findViewById(2131755417)).setText(2131230941);
                    view.setTag((Object)4);
                    if (!i) {
                        break Label_0560;
                    }
                }
                View a2 = view;
                if (d) {
                    if (intValue != 5) {
                        a2 = alm.a(this.a, 2130903103, null);
                        a2.findViewById(2131755409).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-2, (int)this.c.getResources().getDimension(2131361905)));
                        a2.findViewById(2131755411).setClickable(true);
                        a2.setTag((Object)5);
                    }
                    final View view2 = a2;
                    ((TextView)view2.findViewById(2131755411)).setText(2131230934);
                    if (!i) {
                        view3 = view2;
                        break Label_0563;
                    }
                    view = view2;
                }
                else {
                    view = a2;
                }
                if (intValue != 1) {
                    view = alm.a(this.a, 2130903104, viewGroup, false);
                    view.setTag((Object)1);
                }
            }
            view3 = view;
        }
        if (!c && !a && !d) {
            final ImageView imageView = (ImageView)view3.findViewById(2131755275);
            imageView.setEnabled(true);
            ContactsFragment.g(this.c).b(b, imageView);
            final View viewById = view3.findViewById(2131755316);
            final a0e a0e = new a0e(b.u, this.getContext());
            viewById.setOnClickListener((View$OnClickListener)a0e);
            imageView.setOnClickListener((View$OnClickListener)a0e);
            final TextView textView = (TextView)view3.findViewById(2131755413);
            vc.b(textView);
            final TextView textView2 = (TextView)view3.findViewById(2131755415);
            final TextView textView3 = (TextView)view3.findViewById(2131755414);
            Label_1028: {
                if (b.m()) {
                    final String a3 = b.a(this.getContext());
                    textView.setText(aa.a(this.getContext(), cq.a(a3, (Context)this.c.getActivity()), a3, ContactsFragment.i(this.c)));
                    textView2.setText((CharSequence)adc.h(b.u));
                    textView3.setText((CharSequence)"");
                    textView.setTextColor(-16777216);
                    view3.setLongClickable(false);
                    if (!i) {
                        break Label_1028;
                    }
                }
                textView.setText(aa.a(this.getContext(), null, b.a(this.getContext()), ContactsFragment.i(this.c)));
                Label_1002: {
                    if (App.p(b.u)) {
                        textView2.setText(2131231842);
                        textView.setTextColor(-7829368);
                        view3.setLongClickable(true);
                        if (!i) {
                            break Label_1002;
                        }
                    }
                    view3.setLongClickable(false);
                    final View viewById2 = view3.findViewById(2131755412);
                    if (b.b) {
                        textView.setTextColor(this.c.getResources().getColor(2131624012));
                        String d2;
                        if (b.d != null) {
                            d2 = b.d;
                        }
                        else {
                            d2 = "";
                        }
                        textView2.setText(cq.b(d2, (Context)this.c.getActivity()));
                        viewById2.setVisibility(8);
                        textView3.setVisibility(0);
                        if (!i) {
                            break Label_1002;
                        }
                    }
                    textView.setTextColor(-13679548);
                    viewById2.setVisibility(0);
                    textView3.setVisibility(8);
                    textView2.setText((CharSequence)b.f());
                    viewById2.setOnClickListener((View$OnClickListener)new a0d(this, b));
                }
                final CharSequence a4 = b.a(this.c.getResources());
                if (a4 != null) {
                    textView3.setText(a4);
                }
            }
            if (ContactsFragment.b(this.c) != null && ContactsFragment.b(this.c).containsKey(b.u)) {
                view3.setBackgroundResource(2130837749);
                if (!i) {
                    return view3;
                }
            }
            view3.setBackgroundResource(0);
        }
        return view3;
    }
    
    public boolean hasStableIds() {
        return true;
    }
}
