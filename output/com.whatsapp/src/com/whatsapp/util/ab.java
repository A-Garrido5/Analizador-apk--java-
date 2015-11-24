// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewParent;
import android.view.View;

class ab implements Runnable
{
    private static final String[] z;
    final bo a;
    final View[] b;
    final String c;
    
    static {
        final String[] z2 = new String[7];
        String s = "u\u001coWp`\u001asV}T\u001asU`.\bsWwL\u000btLGs\u001btZru\u0007uW`!\u001ar\\adNsJ3o\u0001:Mvy\u001a \u0019";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = 'n';
                        break;
                    }
                    case 2: {
                        c2 = '\u001a';
                        break;
                    }
                    case 3: {
                        c2 = '9';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u\u001coWp`\u001asV}T\u001asU`.\bsWwL\u000btLGs\u001btZru\u0007uW`!\u001dqPcq\u000b~\u0019gd\u0016n\u00033";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "U\u000bbMEh\u000bm";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "M\u0007iM^d\u0000opgd\u0003";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "u\u001coWp`\u001asV}T\u001asU`.\bsWwL\u000btLGs\u001btZru\u0007uW`!\u001ar\\adNsJ3u\u000bbM)!";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "u\u001coWp`\u001asV}T\u001asU`!\u001a\u007fAg;N";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "@\rnP|o,{KPn\u0000n\\ku8s\\d";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ab(final bo a, final View[] b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private boolean a(View view, final String s) {
        while (view != null) {
            final ViewParent parent = view.getParent();
            if (parent == null) {
                return false;
            }
            if (parent.getClass().toString().contains(s)) {
                return true;
            }
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View)parent;
        }
        return false;
    }
    
    @Override
    public void run() {
        final View view = this.b[0];
        if (view instanceof TextView) {
            final TextView textView = (TextView)view;
            Log.i(ab.z[5] + (Object)textView.getText());
            final View rootView = view.getRootView();
            if (!this.c.equalsIgnoreCase(ab.z[2]) || this.a((View)textView, ab.z[3]) || this.a((View)textView, ab.z[6]) || b_.e().contains(rootView)) {
                final String string = textView.getText().toString();
                Label_0220: {
                    if (TextUtils.isEmpty((CharSequence)string)) {
                        Log.i(ab.z[0] + string);
                        if (!Log.l) {
                            break Label_0220;
                        }
                    }
                    Log.i(ab.z[4] + string);
                    b_.m = false;
                }
                b_.e().add(rootView);
                textView.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new a6(this, rootView, textView));
                return;
            }
            Log.i(ab.z[1] + (Object)textView.getText());
            b_.m = true;
        }
    }
}
