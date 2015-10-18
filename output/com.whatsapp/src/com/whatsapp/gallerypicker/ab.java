// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.os.Build$VERSION;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.support.v7.view.ActionMode;
import android.view.MenuItem;
import android.support.v7.view.ActionMode$Callback;

class ab implements ActionMode$Callback
{
    final MediaPicker a;
    private MenuItem b;
    
    ab(final MediaPicker a) {
        this.a = a;
    }
    
    @Override
    public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 0: {
                MediaPicker.a(this.a, MediaPicker.a(this.a));
                break;
            }
        }
        return false;
    }
    
    @Override
    public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        MenuItemCompat.setShowAsAction(this.b = menu.add(0, 0, 0, 2131231435), 2);
        if (Build$VERSION.SDK_INT >= 21) {
            this.a.getWindow().setStatusBarColor(this.a.getResources().getColor(2131624026));
        }
        return true;
    }
    
    @Override
    public void onDestroyActionMode(final ActionMode actionMode) {
        MediaPicker.a(this.a).clear();
        MediaPicker.a(this.a, (ActionMode)null);
        this.a.s.notifyDataSetChanged();
        if (Build$VERSION.SDK_INT >= 21) {
            this.a.getWindow().setStatusBarColor(this.a.getResources().getColor(17170444));
        }
    }
    
    @Override
    public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        Label_0081: {
            if (MediaPicker.a(this.a).isEmpty()) {
                actionMode.setTitle(2131231629);
                if (MediaGalleryBase.v == 0) {
                    break Label_0081;
                }
            }
            actionMode.setTitle(String.format(this.a.getResources().getQuantityString(2131296287, MediaPicker.a(this.a).size()), MediaPicker.a(this.a).size()));
        }
        final MenuItem b = this.b;
        final boolean empty = MediaPicker.a(this.a).isEmpty();
        boolean visible = false;
        if (!empty) {
            visible = true;
        }
        b.setVisible(visible);
        return true;
    }
}
