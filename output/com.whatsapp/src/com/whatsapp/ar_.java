// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Point;
import android.util.Pair;
import java.util.Comparator;

class ar_ implements Comparator
{
    final GroupChatLiveLocationsActivity2 a;
    
    ar_(final GroupChatLiveLocationsActivity2 a) {
        this.a = a;
    }
    
    public int a(final Pair pair, final Pair pair2) {
        return ((Point)pair.second).x - ((Point)pair2.second).x;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((Pair)o, (Pair)o2);
    }
}
