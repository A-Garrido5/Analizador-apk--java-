// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.view.View$OnClickListener;

class qa implements View$OnClickListener
{
    final /* synthetic */ ReportFlowWebViewActivity a;
    
    qa(final ReportFlowWebViewActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.finish();
    }
}
