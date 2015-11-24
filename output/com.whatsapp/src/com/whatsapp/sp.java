// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.bi;
import java.util.Map;
import java.util.Collection;

class sp extends sj
{
    final ListChatInfo a;
    
    sp(final ListChatInfo a) {
        this.a = a;
    }
    
    @Override
    public void a(final Collection collection, final Map map) {
        final boolean i = App.I;
        for (final bi bi : collection) {
            if (bi.a.a.equals(ListChatInfo.e(this.a).u) && (bi.I == 1 || bi.I == 3 || bi.I == 2)) {
                ListChatInfo.c(this.a);
                if (!i) {
                    break;
                }
            }
            if (i) {
                break;
            }
        }
    }
}
