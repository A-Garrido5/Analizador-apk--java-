// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.appwidget;

import com.whatsapp.a_9;
import java.util.Iterator;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.notification.w;
import com.whatsapp.App;
import com.whatsapp.z8;
import com.whatsapp.notification.ao;

class g implements Runnable
{
    private final ao a;
    
    private g(final ao a) {
        this.a = a;
    }
    
    g(final ao ao, final c c) {
        this(ao);
    }
    
    @Override
    public void run() {
        final int d = WidgetProvider.d;
        final Iterator<String> iterator = z8.j().iterator();
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                final a_9 e = App.S.e(iterator.next());
                int n2;
                if (e.l > 0) {
                    n2 = n + e.l;
                }
                else {
                    n2 = n;
                }
                if (d != 0) {
                    this.a.a(n2 + w.b().d().size());
                    if (DialogToastActivity.h) {
                        WidgetProvider.d = d + 1;
                    }
                    return;
                }
                n = n2;
            }
            int n2 = n;
            continue;
        }
    }
}
