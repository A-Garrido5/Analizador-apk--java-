// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import java.util.ArrayList;
import java.util.Comparator;

class vh implements Comparator
{
    final GroupChatRecentLocationsActivity a;
    
    vh(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    public int a(final ArrayList list, final ArrayList list2) {
        return (int)(1000000.0 * list2.get(0).p - 1000000.0 * list.get(0).p);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((ArrayList)o, (ArrayList)o2);
    }
}
