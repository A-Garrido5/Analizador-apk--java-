// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.database.ContentObserver;

class CursorAdapter$ChangeObserver extends ContentObserver
{
    final CursorAdapter this$0;
    
    public boolean deliverSelfNotifications() {
        return true;
    }
    
    public void onChange(final boolean b) {
        this.this$0.onContentChanged();
    }
}
