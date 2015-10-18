// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Comparator;

class j6 implements Comparator
{
    final k_ a;
    
    j6(final k_ a) {
        this.a = a;
    }
    
    public int a(final PlaceInfo placeInfo, final PlaceInfo placeInfo2) {
        if (placeInfo.dist < placeInfo2.dist) {
            return -1;
        }
        return 1;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((PlaceInfo)o, (PlaceInfo)o2);
    }
}
