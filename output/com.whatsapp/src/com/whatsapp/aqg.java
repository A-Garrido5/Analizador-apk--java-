// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup;
import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import android.text.TextUtils;
import java.util.ArrayList;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import com.whatsapp.protocol.b7;
import com.whatsapp.protocol.c6;
import com.whatsapp.util.Log;
import com.whatsapp.util.b6;
import android.widget.ImageView;
import com.whatsapp.util.cq;
import android.widget.TextView;
import android.database.Cursor;
import android.view.View;
import android.content.Context;
import android.widget.CursorAdapter;

class aqg extends CursorAdapter
{
    private static final String[] z;
    final Broadcasts a;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0011SAwN\u0010@]bY\\CGxN\u0005HKa\u0005\u0001DCy^\u0016~\\sY\u001cT\\uOSO[zF";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '*';
                        break;
                    }
                    case 0: {
                        c2 = 's';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = '.';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "_\u0001";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0011SAwN\u0010@]b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "_\u0001";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public aqg(final Broadcasts a) {
        super((Context)(this.a = a), App.ak.u());
    }
    
    public void a() {
        this.changeCursor(App.ak.u());
    }
    
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final boolean i = App.I;
        final bi a = App.ak.a(cursor, aqg.z[2]);
        view.setTag((Object)a);
        final TextView textView = (TextView)view.findViewById(2131755518);
        String s = "";
        Label_1046: {
            switch (a.I) {
                case 0: {
                    s = a.c();
                    if (i) {
                        break Label_1046;
                    }
                    break;
                }
                case 1: {
                    s = this.a.getString(2131230976);
                    if (i) {
                        break Label_1046;
                    }
                    break;
                }
                case 2: {
                    s = this.a.getString(2131230970);
                    if (i) {
                        break Label_1046;
                    }
                    break;
                }
                case 3: {
                    s = this.a.getString(2131230979);
                    if (i) {
                        break Label_1046;
                    }
                    break;
                }
                case 5: {
                    s = this.a.getString(2131230977);
                    if (i) {
                        break Label_1046;
                    }
                    break;
                }
                case 4: {
                    s = this.a.getString(2131230975);
                    break;
                }
            }
        }
        textView.setText(cq.b(s, this.a.getBaseContext()));
        ((ImageView)view.findViewById(2131755516)).setVisibility(8);
        ((TextView)view.findViewById(2131755515)).setText((CharSequence)(b6.k((Context)this.a, App.i(a)) + " "));
        String[] split = null;
        Label_0196: {
            if (a.t != null) {
                split = a.t.split(",");
                if (!i) {
                    break Label_0196;
                }
            }
            split = new String[0];
            Log.e(aqg.z[0]);
        }
        final String[] array = split;
        final int length = array.length;
        int n = 0;
        int j = 0;
        while (j < length) {
            final bi a2 = App.ak.a(new c6(array[j], true, a.a.c));
            if (a2 != null && b7.a(a2.c, 5) >= 0) {
                ++n;
            }
            ++j;
            if (i) {
                break;
            }
        }
        final int n2 = n;
        final ImageView imageView = (ImageView)view.findViewById(2131755295);
        final Broadcasts a3 = this.a;
        int n3;
        if (a.j == 0) {
            n3 = array.length;
        }
        else {
            n3 = a.j;
        }
        imageView.setImageDrawable((Drawable)new bs(a3, n2, n3));
        view.measure(View$MeasureSpec.makeMeasureSpec(this.a.getWindow().getDecorView().getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(-2, 0));
        final View viewById = view.findViewById(2131755514);
        final int n4 = viewById.getMeasuredWidth() - viewById.getPaddingRight() + viewById.getPaddingLeft();
        final ArrayList<Comparable> list = new ArrayList<Comparable>();
        final ArrayList<String> list2 = (ArrayList<String>)new ArrayList<Comparable>();
        final ArrayList<a_9> list3 = new ArrayList<a_9>();
        final int length2 = array.length;
        int k = 0;
        while (k < length2) {
            final a_9 e = App.S.e(array[k]);
            list3.add(e);
            Label_0542: {
                if (e.e == null) {
                    list2.add(e.f());
                    if (!i) {
                        break Label_0542;
                    }
                }
                if (!TextUtils.isEmpty((CharSequence)e.c)) {
                    list.add(e.c);
                    if (!i) {
                        break Label_0542;
                    }
                }
                if (!TextUtils.isEmpty((CharSequence)e.t)) {
                    list.add(e.t);
                    if (!i) {
                        break Label_0542;
                    }
                }
                list2.add(e.f());
            }
            ++k;
            if (i) {
                break;
            }
        }
        Collections.sort(list);
        Collections.sort((List<Comparable>)list2);
        list.addAll(list2);
        final TextView textView2 = (TextView)view.findViewById(2131755507);
        final Iterator<String> iterator = list.iterator();
        int n5 = 0;
        String text = "";
        String s2 = "";
        while (iterator.hasNext()) {
            final String s3 = iterator.next();
            final float measureText = textView2.getPaint().measureText(text + aqg.z[3] + s3);
            if (text.length() != 0) {
                final int n6 = list.size() - n5;
                final String format = String.format(App.C.a(2131296262, n6), text, n6);
                if (textView2.getPaint().measureText(format) < n4) {
                    s2 = format;
                }
            }
            if (measureText > n4) {
                if (text.length() == 0) {
                    if (list.size() == 1 && !i) {
                        text = s3;
                        break;
                    }
                    text = String.format(App.C.a(2131296261, list.size()), list.size());
                    if (!i) {
                        break;
                    }
                }
                if (s2.length() > 0 && !i) {
                    text = s2;
                    break;
                }
                text = String.format(App.C.a(2131296261, list.size()), list.size());
                if (!i) {
                    break;
                }
            }
            if (text.length() > 0) {
                text += aqg.z[1];
            }
            text += s3;
            final int n7 = n5 + 1;
            if (i) {
                break;
            }
            n5 = n7;
        }
        textView2.setText((CharSequence)text);
        view.findViewById(2131755522).setVisibility(8);
    }
    
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return alm.a(this.a.getLayoutInflater(), 2130903139, viewGroup, false);
    }
}
