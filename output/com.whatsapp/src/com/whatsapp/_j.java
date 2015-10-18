// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.view.View;
import android.view.View$OnLongClickListener;

class _j implements View$OnLongClickListener
{
    final GroupChatRecentLocationsActivity a;
    
    _j(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        GroupChatRecentLocationsActivity.a(this.a, (a_9)null);
        final Object tag = view.getTag();
        if (tag != null) {
            final bi a = GroupChatRecentLocationsActivity.a(this.a, tag.toString());
            if (a != null) {
                GroupChatRecentLocationsActivity.a(this.a, App.S.e(a.t));
                this.a.removeDialog(0);
                this.a.showDialog(0);
            }
        }
        return true;
    }
}
