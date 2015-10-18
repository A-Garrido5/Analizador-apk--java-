// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.View$OnLongClickListener;

class an implements View$OnLongClickListener
{
    final /* synthetic */ jx a;
    final /* synthetic */ ToolBar b;
    
    an(final ToolBar b, final jx a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        if (!TextUtils.isEmpty(this.a.k())) {
            this.a.l();
            return true;
        }
        return false;
    }
}
