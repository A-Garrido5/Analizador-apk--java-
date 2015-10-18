// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.SpannableStringBuilder;
import com.whatsapp.util.aa;
import com.whatsapp.util.cq;
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
import android.widget.Filter;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

class fh extends ArrayAdapter
{
    private static final String[] z;
    private LayoutInflater a;
    final ContactPicker b;
    protected ArrayList c;
    private Filter d;
    
    static {
        final String[] z2 = new String[5];
        String s = "s\u0016\u0003\u000fws\r\u001d\u0012u{\u001c\u001fT\u007fc\u0011\b\u0017fb\u0016\u001aTtq\u001d2\u000byc\u0010\u0019\u0012y~Y";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0016';
                        break;
                    }
                    case 0: {
                        c2 = '\u0010';
                        break;
                    }
                    case 1: {
                        c2 = 'y';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = '{';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "s\u0016\u0003\u000fws\r\u001d\u0012u{\u001c\u001fT\u007fc\r\b\u0017zq\u001f\u001f\u0012s~\u001d\u001f\u0014a?\u001b\f\u001fI`\u0016\u001e\u0012by\u0016\u0003[";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "0Y";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "0Y";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "s\u0016\u0003\u000fws\r\u001d\u0012u{\u001c\u001fTx\u007f&\u000e\u0014xd\u0018\u000e\u000fe?\u001b\f\u001fI`\u0016\u001e\u0012by\u0016\u0003[";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public fh(final ContactPicker b, final Context context, final ArrayList c) {
        this.b = b;
        super(context, 2130903104, (List)c);
        this.d = new adn(this, null);
        this.c = c;
        this.a = LayoutInflater.from(context);
    }
    
    private boolean a(final int n) {
        if (n >= this.c.size() || n < 0) {
            Log.e(fh.z[0] + n);
        }
        else if (ContactPicker.j() == this.c.get(n)) {
            return true;
        }
        return false;
    }
    
    static boolean a(final fh fh, final int n) {
        return fh.a(n);
    }
    
    static boolean b(final fh fh, final int n) {
        return fh.c(n);
    }
    
    private boolean c(final int n) {
        int n2 = 1;
        if (n >= this.c.size() || n < 0) {
            Log.e(fh.z[n2] + n);
            n2 = 0;
        }
        else if (ContactPicker.i() != this.c.get(n)) {
            return false;
        }
        return n2 != 0;
    }
    
    static boolean c(final fh fh, final int n) {
        return fh.d(n);
    }
    
    private boolean d(final int n) {
        if (n >= this.c.size() || n < 0) {
            Log.e(fh.z[4] + n);
        }
        else if (ContactPicker.n() == this.c.get(n)) {
            return true;
        }
        return false;
    }
    
    public a_9 b(final int n) {
        return this.c.get(n);
    }
    
    public int getCount() {
        return this.c.size();
    }
    
    public Filter getFilter() {
        return this.d;
    }
    
    public Object getItem(final int n) {
        return this.b(n);
    }
    
    public long getItemId(final int n) {
        return n * 1024;
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        final boolean i = App.I;
        final a_9 b = this.b(n);
        if (ContactPicker.c(b)) {
            final LinearLayout linearLayout = new LinearLayout(this.getContext());
            alm.a(this.a, 2130903193, (ViewGroup)linearLayout, true);
            linearLayout.setTag((Object)3);
            linearLayout.findViewById(2131755680).setClickable(true);
            return (View)linearLayout;
        }
        final boolean c = this.c(n);
        final boolean d = this.d(n);
        final boolean a2 = this.a(n);
        while (true) {
            Label_1179: {
                View view = null;
                Label_0726: {
                    if (a == null) {
                        if (c || a2) {
                            view = alm.a(this.a, 2130903105, null);
                            if (c) {
                                view.setTag((Object)2);
                                if (!i) {
                                    break Label_0726;
                                }
                            }
                            view.findViewById(2131755416).setVisibility(8);
                            ((TextView)view.findViewById(2131755417)).setText(2131230941);
                            ((ImageView)view.findViewById(2131755082)).setImageResource(2130838774);
                            view.setTag((Object)4);
                            if (!i) {
                                break Label_0726;
                            }
                        }
                        if (d) {
                            view = alm.a(this.a, 2130903103, null);
                            view.findViewById(2131755409).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-2, (int)this.b.getResources().getDimension(2131361905)));
                            view.findViewById(2131755411).setClickable(true);
                            Label_0347: {
                                if (this.c == ContactPicker.t(this.b)) {
                                    ((TextView)view.findViewById(2131755411)).setText(2131230934);
                                    if (!i) {
                                        break Label_0347;
                                    }
                                }
                                if (this.c == ContactPicker.g(this.b)) {
                                    ((TextView)view.findViewById(2131755411)).setText(2131230935);
                                    if (!i) {
                                        break Label_0347;
                                    }
                                }
                                ((TextView)view.findViewById(2131755411)).setText(2131230936);
                            }
                            view.setTag((Object)5);
                            if (!i) {
                                break Label_0726;
                            }
                        }
                        a = alm.a(this.a, 2130903104, viewGroup, false);
                        a.setTag((Object)1);
                        if (!i) {
                            break Label_1179;
                        }
                    }
                    final int intValue = (int)a.getTag();
                    if (c) {
                        if (intValue == 2) {
                            break Label_1179;
                        }
                        view = alm.a(this.a, 2130903105, null);
                        view.setTag((Object)2);
                        if (!i) {
                            break Label_0726;
                        }
                    }
                    else {
                        view = a;
                    }
                    if (a2) {
                        if (intValue == 4) {
                            break Label_0726;
                        }
                        view = alm.a(this.a, 2130903105, null);
                        ((ImageView)view.findViewById(2131755082)).setImageResource(2130838774);
                        view.findViewById(2131755416).setVisibility(8);
                        ((TextView)view.findViewById(2131755417)).setText(2131230941);
                        view.setTag((Object)4);
                        if (!i) {
                            break Label_0726;
                        }
                    }
                    View a3 = view;
                    if (d) {
                        if (intValue != 5) {
                            a3 = alm.a(this.a, 2130903103, null);
                            a3.findViewById(2131755409).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-2, (int)this.b.getResources().getDimension(2131361905)));
                            a3.findViewById(2131755411).setClickable(true);
                            a3.setTag((Object)5);
                        }
                        view = a3;
                        if (this.c == ContactPicker.t(this.b)) {
                            ((TextView)view.findViewById(2131755411)).setText(2131230934);
                            if (!i) {
                                break Label_0726;
                            }
                        }
                        if (this.c == ContactPicker.g(this.b)) {
                            ((TextView)view.findViewById(2131755411)).setText(2131230935);
                            if (!i) {
                                break Label_0726;
                            }
                        }
                        ((TextView)view.findViewById(2131755411)).setText(2131230936);
                        if (!i) {
                            break Label_0726;
                        }
                    }
                    else {
                        view = a3;
                    }
                    if (intValue != 1) {
                        view = alm.a(this.a, 2130903104, viewGroup, false);
                        view.setTag((Object)1);
                    }
                }
                final View view2 = view;
                if (!c && !a2 && !d) {
                    ContactPicker.s(this.b).b(b, (ImageView)view2.findViewById(2131755275));
                    final TextView textView = (TextView)view2.findViewById(2131755413);
                    vc.b(textView);
                    final TextView textView2 = (TextView)view2.findViewById(2131755415);
                    final TextView textView3 = (TextView)view2.findViewById(2131755414);
                    final String a4 = b.a((Context)this.b);
                    SpannableStringBuilder a5 = null;
                    Label_0860: {
                        if (!b.m()) {
                            final boolean k = b.k();
                            a5 = null;
                            if (!k) {
                                break Label_0860;
                            }
                        }
                        a5 = cq.a(a4, (Context)this.b);
                    }
                    textView.setText(aa.a(this.getContext(), a5, a4, ContactPicker.p(this.b)));
                    Label_1104: {
                        if (b.m() || b.k()) {
                            textView2.setText((CharSequence)adc.h(b.u));
                            textView3.setText((CharSequence)"");
                            textView.setTextColor(this.b.getResources().getColor(2131624012));
                            view2.setLongClickable(false);
                            if (!i) {
                                break Label_1104;
                            }
                        }
                        Label_1078: {
                            if (App.p(b.u)) {
                                int text;
                                if (ContactPicker.e(this.b)) {
                                    text = 2131231841;
                                }
                                else {
                                    text = 2131231842;
                                }
                                textView2.setText(text);
                                textView.setTextColor(-7829368);
                                view2.setLongClickable(true);
                                if (!i) {
                                    break Label_1078;
                                }
                            }
                            String string;
                            if (b.d != null) {
                                string = b.d + fh.z[2];
                            }
                            else {
                                string = fh.z[3];
                            }
                            textView2.setText(cq.b(string, this.b.getBaseContext()));
                            textView.setTextColor(this.b.getResources().getColor(2131624012));
                            view2.setLongClickable(false);
                        }
                        final CharSequence a6 = b.a(this.b.getResources());
                        if (a6 != null) {
                            textView3.setText(a6);
                        }
                    }
                    if (ContactPicker.b(this.b) != null && ContactPicker.b(this.b).containsKey(b.u)) {
                        view2.setBackgroundResource(2130837749);
                        if (!i) {
                            return view2;
                        }
                    }
                    view2.setBackgroundResource(0);
                }
                return view2;
            }
            final View view2 = a;
            continue;
        }
    }
    
    public boolean hasStableIds() {
        return true;
    }
}
