// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import java.util.Comparator;

class wl implements Comparator
{
    final GroupChatRecentLocationsActivity a;
    
    wl(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    public int a(final bi bi, final bi bi2) {
        return (int)(1000000.0 * bi2.p - 1000000.0 * bi.p);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((bi)o, (bi)o2);
    }
}
