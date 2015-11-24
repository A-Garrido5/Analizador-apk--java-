// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;
import java.util.ArrayList;
import java.util.Comparator;

class dk implements Comparator
{
    final GroupChatLiveLocationsActivity a;
    
    dk(final GroupChatLiveLocationsActivity a) {
        this.a = a;
    }
    
    public int a(final ArrayList list, final ArrayList list2) {
        return (int)(1000000.0 * list2.get(0).f - 1000000.0 * list.get(0).f);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((ArrayList)o, (ArrayList)o2);
    }
}
