// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Point;
import android.util.Pair;
import java.util.Comparator;

class le implements Comparator
{
    final GroupChatLiveLocationsActivity2 a;
    
    le(final GroupChatLiveLocationsActivity2 a) {
        this.a = a;
    }
    
    public int a(final Pair pair, final Pair pair2) {
        return ((Point)pair.second).y - ((Point)pair2.second).y;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((Pair)o, (Pair)o2);
    }
}
