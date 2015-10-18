// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.internal.android.widget.ToolBar;
import android.annotation.TargetApi;

@TargetApi(17)
class j extends g
{
    final /* synthetic */ AbsPreferenceActivity c;
    
    public j(final AbsPreferenceActivity c, final jv jv, final ToolBar toolBar) {
        this.c = c;
        super(c, jv, toolBar);
    }
    
    @Override
    protected void b(final boolean checked) {
        this.a.setChecked(checked);
    }
}
