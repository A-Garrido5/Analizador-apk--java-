// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.util.Log;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;

final class alo extends ArrayAdapter
{
    private static final String[] z;
    private final String a;
    private final String b;
    
    static {
        final String[] z2 = new String[5];
        String s = "GWsU]_icTNGW~_Z";
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
                        c2 = '(';
                        break;
                    }
                    case 0: {
                        c2 = '+';
                        break;
                    }
                    case 1: {
                        c2 = '6';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = ':';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "GWsU]_icTNGW~_Z";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0001\u001c YG^X~HQ\u0004ZkCG^B*S[\u000bX\u007fVD\n";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0001\u001c YG^X~HQHYn_\u0007_SrN^BS}\u001aAX\u0016dODG\u0017";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u0001\u001c YG^X~HQ\u0004BoB\\]_oM\bBE*T]GZ+";
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
    
    public alo(final Context context, final int n, final List list, final String b, final String a) {
        super(context, n, list);
        this.b = b;
        this.a = a;
    }
    
    public int getCount() {
        return Math.max(1, super.getCount());
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (super.getCount() != 0) {
            final t6 t6 = (t6)this.getItem(n);
            Label_0162: {
                if (view == null || (view != null && view.findViewById(2131755524) == null)) {
                    final Context context = this.getContext();
                    final String s = alo.z[1];
                    final Object o = new LinearLayout(context);
                    alm.a((LayoutInflater)context.getSystemService(s), 2130903143, (ViewGroup)o, true);
                    if (!i) {
                        view = (View)o;
                        break Label_0162;
                    }
                }
                view = view;
            }
            if (view == null) {
                Log.w(alo.z[2]);
            }
            final TextView textView = (TextView)((LinearLayout)view).findViewById(2131755524);
            if (textView == null) {
                Log.w(alo.z[4]);
            }
            textView.setText((CharSequence)t6.b);
            final TextView textView2 = (TextView)((LinearLayout)view).findViewById(2131755525);
            Label_0269: {
                if (!TextUtils.equals((CharSequence)t6.b, (CharSequence)t6.c)) {
                    textView2.setText((CharSequence)t6.c);
                    textView2.setVisibility(0);
                    if (!i) {
                        break Label_0269;
                    }
                }
                textView2.setVisibility(8);
                textView2.setText((CharSequence)null);
            }
            vc.b(textView);
            final TextView textView3 = (TextView)((LinearLayout)view).findViewById(2131755526);
            if (textView3 == null) {
                Log.w(alo.z[3]);
            }
            textView3.setText((CharSequence)("+" + t6.a));
            final ImageView imageView = (ImageView)((LinearLayout)view).findViewById(2131755527);
            if (TextUtils.equals((CharSequence)t6.d, (CharSequence)this.b) || TextUtils.equals((CharSequence)t6.b, (CharSequence)this.a)) {
                textView.setTextColor(this.getContext().getResources().getColor(2131624022));
                imageView.setBackgroundDrawable(this.getContext().getResources().getDrawable(2130837754));
                if (!i) {
                    return view;
                }
            }
            textView.setTextColor(-16777216);
            imageView.setBackgroundDrawable((Drawable)null);
            return view;
        }
        if (view == null || (view != null && view.findViewById(2131755411) == null)) {
            final Context context2 = this.getContext();
            final String s2 = alo.z[0];
            view = (View)new LinearLayout(context2);
            alm.a((LayoutInflater)context2.getSystemService(s2), 2130903193, (ViewGroup)view, true);
            ((LinearLayout)view).findViewById(2131755680).setClickable(true);
        }
        return view;
    }
}
