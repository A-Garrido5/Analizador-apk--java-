// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import com.whatsapp.protocol.bi;

class sn extends sj
{
    final GroupChatInfo a;
    
    sn(final GroupChatInfo a) {
        this.a = a;
    }
    
    @Override
    public void a(final bi bi, final int n) {
        if (bi != null && bi.a.a.equals(GroupChatInfo.l(this.a)) && !bi.a.b && bi.I == 5) {
            GroupChatInfo.f(this.a);
        }
    }
    
    @Override
    public void a(final Collection collection, final Map map) {
        final boolean i = App.I;
        for (final bi bi : collection) {
            if (bi.a.a.equals(GroupChatInfo.l(this.a)) && (bi.I == 1 || bi.I == 3 || bi.I == 2)) {
                GroupChatInfo.f(this.a);
                if (!i) {
                    break;
                }
            }
            if (i) {
                break;
            }
        }
    }
    
    @Override
    public void b(final bi bi, final int n) {
        if (bi != null && bi.a.a.equals(GroupChatInfo.l(this.a)) && !bi.a.b && (bi.I == 1 || bi.I == 3 || bi.I == 2) && n == 3) {
            GroupChatInfo.f(this.a);
        }
    }
}
