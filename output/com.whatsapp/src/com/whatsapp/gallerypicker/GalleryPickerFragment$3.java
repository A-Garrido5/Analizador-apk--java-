// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class GalleryPickerFragment$3 extends BroadcastReceiver
{
    final GalleryPickerFragment a;
    
    GalleryPickerFragment$3(final GalleryPickerFragment a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        GalleryPickerFragment.a(this.a, intent);
    }
}
