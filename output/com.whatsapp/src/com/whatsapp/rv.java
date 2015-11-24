// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;

final class rv implements Runnable
{
    final a_9 a;
    
    rv(final a_9 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final ArrayList<a_9> list = new ArrayList<a_9>();
        list.add(this.a);
        App.S.a(list);
    }
}
