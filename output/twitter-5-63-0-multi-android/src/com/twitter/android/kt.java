// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import java.util.ArrayList;
import android.content.Context;
import android.widget.ArrayAdapter;

class kt extends ArrayAdapter
{
    final /* synthetic */ LoginVerificationFragment a;
    
    public kt(final LoginVerificationFragment a, final Context context, final int n, final int n2, final ArrayList list) {
        this.a = a;
        super(context, n, n2, (List)list);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (n == 0) {
            return this.a.a(viewGroup);
        }
        return super.getView(n, (View)null, viewGroup);
    }
}
