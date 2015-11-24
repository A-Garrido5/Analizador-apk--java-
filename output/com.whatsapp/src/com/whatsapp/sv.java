// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class sv extends sj
{
    final GroupChatRecentLocationsActivity a;
    
    sv(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final bi bi, final int n) {
        if (bi != null && bi.a.a.equals(GroupChatRecentLocationsActivity.g(this.a)) && !bi.a.b && bi.I == 5) {
            final bi a = GroupChatRecentLocationsActivity.a(this.a, bi.t);
            if (a != null) {
                GroupChatRecentLocationsActivity.d(this.a).remove(a);
            }
            GroupChatRecentLocationsActivity.d(this.a).add(bi);
            GroupChatRecentLocationsActivity.l(this.a);
            GroupChatRecentLocationsActivity.j(this.a).a();
        }
    }
}
