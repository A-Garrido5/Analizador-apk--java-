// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextPaint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

public class iw extends iq
{
    private static final String[] z;
    private final String a;
    private boolean b;
    private long c;
    private final int d;
    
    static {
        final String[] z2 = new String[2];
        String s = ">ffLC6l,WB+mlJ\u0002>kvWC1&Twi\b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = '_';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "<go\u0010M1lpQE;&`LC({gL\u0002>xrRE<ivWC1WkZ";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public iw(final String a, final int d) {
        this.a = a;
        this.d = d;
    }
    
    @Override
    public boolean a(final View view, final MotionEvent motionEvent) {
        this.b = (motionEvent.getAction() == 0);
        view.invalidate();
        if (motionEvent.getAction() == 1) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.c > 1000L) {
                this.c = elapsedRealtime;
                final Uri parse = Uri.parse(this.a);
                final Context context = view.getContext();
                final Intent intent = new Intent(iw.z[0], parse);
                intent.putExtra(iw.z[1], context.getPackageName());
                App.a(context, intent);
            }
        }
        return false;
    }
    
    @Override
    public void updateDrawState(final TextPaint textPaint) {
        final boolean i = App.I;
        if (this.b) {
            textPaint.setColor(-65536);
            textPaint.bgColor = 1711315404;
            if (!i) {
                return;
            }
        }
        Label_0054: {
            if (this.d == 0) {
                textPaint.setColor(textPaint.linkColor);
                if (!i) {
                    break Label_0054;
                }
            }
            textPaint.setColor(this.d);
        }
        textPaint.bgColor = 0;
    }
}
