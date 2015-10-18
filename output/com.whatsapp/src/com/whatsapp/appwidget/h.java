// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.appwidget;

import android.os.Bundle;
import android.os.Build$VERSION;
import java.util.ArrayList;

class h implements Runnable
{
    private static final String[] z;
    final a a;
    final ArrayList b;
    
    static {
        final String[] z2 = new String[2];
        String s = "f@?%qcW*\u0006Un^\u0007\u0017q`X;";
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
                        c2 = '\u0018';
                        break;
                    }
                    case 0: {
                        c2 = '\u0007';
                        break;
                    }
                    case 1: {
                        c2 = '0';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
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
                    s = "f@?%qcW*\u0006Un^\u0018\u001b|sX";
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
    
    h(final a a, final ArrayList b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final int d = WidgetProvider.d;
        WidgetProvider.a(this.b);
        final int[] b = com.whatsapp.appwidget.a.b(this.a);
        final int length = b.length;
        int i = 0;
    Label_0109_Outer:
        while (i < length) {
            final int n = b[i];
            while (true) {
                Label_0183: {
                    if (Build$VERSION.SDK_INT < 16) {
                        break Label_0183;
                    }
                    final Bundle appWidgetOptions = com.whatsapp.appwidget.a.c(this.a).getAppWidgetOptions(n);
                    if (appWidgetOptions == null) {
                        break Label_0183;
                    }
                    int int1 = appWidgetOptions.getInt(h.z[1]);
                    int int2 = appWidgetOptions.getInt(h.z[0]);
                    if (int1 == 0 || int2 == 0) {
                        int2 = Integer.MAX_VALUE;
                        int1 = Integer.MAX_VALUE;
                    }
                    com.whatsapp.appwidget.a.c(this.a).updateAppWidget(n, WidgetProvider.a(com.whatsapp.appwidget.a.a(this.a), n, int1, int2));
                    if (WidgetProvider.b(int1, int2)) {
                        com.whatsapp.appwidget.a.c(this.a).notifyAppWidgetViewDataChanged(n, 2131755838);
                    }
                    final int n2 = i + 1;
                    if (d != 0) {
                        break;
                    }
                    i = n2;
                    continue Label_0109_Outer;
                }
                int int2 = Integer.MAX_VALUE;
                int int1 = Integer.MAX_VALUE;
                continue;
            }
        }
    }
}
