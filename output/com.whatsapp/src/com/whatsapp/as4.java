// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import java.util.Map;
import java.util.List;
import android.support.v4.app.SharedElementCallback;

class as4 extends SharedElementCallback
{
    final ViewProfilePhoto a;
    
    as4(final ViewProfilePhoto a) {
        this.a = a;
    }
    
    @Override
    public void onMapSharedElements(final List list, final Map map) {
    }
    
    @Override
    public void onSharedElementEnd(final List list, final List list2, final List list3) {
        if (!ViewProfilePhoto.b(this.a) && !list2.isEmpty()) {
            this.a.getWindow().setReturnTransition(ViewProfilePhoto.a(this.a, list2.get(0)));
        }
    }
    
    @Override
    public void onSharedElementStart(final List list, final List list2, final List list3) {
        if (ViewProfilePhoto.b(this.a) && !list2.isEmpty()) {
            this.a.getWindow().setEnterTransition(ViewProfilePhoto.a(this.a, list2.get(0)));
        }
    }
}
