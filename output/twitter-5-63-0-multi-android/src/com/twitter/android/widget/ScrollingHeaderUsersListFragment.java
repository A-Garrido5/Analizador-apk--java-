// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.android.UsersFragment;

public class ScrollingHeaderUsersListFragment extends UsersFragment
{
    private ey B;
    
    public void a(final ey b) {
        this.B = b;
    }
    
    @Override
    protected boolean aA() {
        return true;
    }
    
    @Override
    public void c(final boolean b) {
        if (this.B != null) {
            this.B.a();
        }
        super.c(b);
    }
    
    protected void k() {
    }
    
    @Override
    protected boolean z_() {
        return true;
    }
}
