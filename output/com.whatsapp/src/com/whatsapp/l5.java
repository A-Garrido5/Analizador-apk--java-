// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

final class l5 implements Runnable
{
    final boolean a;
    final String b;
    
    l5(final String b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        App.S.c(list2);
        final ArrayList b = App.S.b();
        b.removeAll(list2);
        list2.addAll(b);
        App.S.d(list2);
        final List b2 = App.b(list2, list, true);
        final String string = Integer.toString(App.S.h());
        final String b3 = this.b;
        int n;
        if (this.a) {
            n = 8;
        }
        else {
            n = 2;
        }
        App.a(b3, b2, n, this.a, string);
    }
}
