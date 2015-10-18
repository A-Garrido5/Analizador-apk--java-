// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ContextMenu;
import android.view.View$OnCreateContextMenuListener;

class y implements View$OnCreateContextMenuListener
{
    final GalleryPickerFragment a;
    
    y(final GalleryPickerFragment a) {
        this.a = a;
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        GalleryPickerFragment.a(this.a, contextMenu, contextMenu$ContextMenuInfo);
    }
}
