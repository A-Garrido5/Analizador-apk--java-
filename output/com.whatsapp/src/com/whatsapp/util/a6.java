// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.text.TextPaint;
import android.text.Layout;
import org.json.JSONArray;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class a6 implements ViewTreeObserver$OnGlobalLayoutListener
{
    private static final String[] z;
    final TextView a;
    final View b;
    final ab c;
    
    static {
        final String[] z2 = new String[5];
        String s = "f\u0010O^\u0011s\u0016S_\u001cG\u0016S\\\u0001=\u0004S^\u0016_\u0007TE&`\u0017TS\u0013f\u000bU^\u00012\u0016_H\u0006(B";
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
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = '\u0012';
                        break;
                    }
                    case 1: {
                        c2 = 'b';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = '0';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "f\u0010O^\u0011s\u0016S_\u001cG\u0016S\\\u0001=\u0004S^\u0016_\u0007TE&`\u0017TS\u0013f\u000bU^\u00012\u0011QY\u0002b\u0007^";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "f\u0010O^\u0011s\u0016S_\u001cG\u0016S\\\u0001=\u0004S^\u0016_\u0007TE&`\u0017TS\u0013f\u000bU^\u00012\t_IH2";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "f\u0010O^\u0011s\u0016S_\u001cG\u0016S\\\u0001=\u0004S^\u0016_\u0007TE&`\u0017TS\u0013f\u000bU^\u00012\u0011STH2";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "f\u0010O^\u0011s\u0016S_\u001cG\u0016S\\\u0001=\u0004S^\u0016_\u0007TE&`\u0017TS\u0013f\u000bU^\u00012&U^UfBNQ\u0019wBIC";
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
    
    a6(final ab c, final View b, final TextView a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public void onGlobalLayout() {
        final boolean l = Log.l;
        final long n = this.b.getHeight() * this.b.getWidth() + (this.b.hashCode() + this.b.getDrawingTime());
        Label_0100: {
            if (b_.m) {
                Log.i(a6.z[4]);
                if (!l) {
                    break Label_0100;
                }
            }
            Log.i(a6.z[2] + n);
            b_.a((View)this.a, n, true, this.c.a.a);
        }
        if (b_.b() == null || !b_.b().containsKey(n)) {
            Log.i(a6.z[1]);
        }
        else {
            final int intValue = b_.b().get(n);
            Log.i(a6.z[3] + intValue);
            final Layout layout = this.a.getLayout();
            final TextPaint paint = this.a.getPaint();
            final CharSequence text = this.a.getText();
            Log.i(a6.z[0] + (Object)text);
            final int lineCount = this.a.getLineCount();
            CharSequence subSequence = null;
            Label_0278: {
                if (lineCount > 0) {
                    subSequence = text.subSequence(layout.getLineStart(lineCount - 1), layout.getLineEnd(lineCount - 1));
                    if (!l) {
                        break Label_0278;
                    }
                }
                subSequence = text;
            }
            final String string = text.toString();
            final float n2 = this.a.getWidth() - this.a.getCompoundPaddingLeft() - this.a.getCompoundPaddingRight();
            final float measureText = paint.measureText(subSequence, 0, subSequence.length());
            if (n2 > 0.0f && b_.b((View)this.a) && !TextUtils.isEmpty((CharSequence)string) && b_.d() != null) {
                final JSONArray jsonArray = new JSONArray();
                String s;
                if (intValue < 10) {
                    s = "0" + intValue;
                }
                else {
                    s = String.valueOf(intValue);
                }
                jsonArray.put((Object)(b_.c() + "-" + s));
                jsonArray.put((Object)string);
                jsonArray.put((Object)(double)n2);
                jsonArray.put((Object)(double)measureText);
                Label_0489: {
                    if (measureText > n2) {
                        jsonArray.put(true);
                        if (!l) {
                            break Label_0489;
                        }
                    }
                    jsonArray.put(false);
                }
                b_.a().put((Object)jsonArray);
            }
        }
    }
}
