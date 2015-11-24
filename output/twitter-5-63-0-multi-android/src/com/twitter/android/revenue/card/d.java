// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.view.MotionEvent;
import android.view.View;
import com.twitter.library.util.ao;

class d extends ao
{
    final /* synthetic */ long a;
    final /* synthetic */ a b;
    
    d(final a b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final View view, final MotionEvent motionEvent) {
        this.b.a(this.a, view, motionEvent);
    }
}
