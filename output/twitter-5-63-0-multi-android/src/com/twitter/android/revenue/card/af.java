// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.view.View;
import com.twitter.library.util.ao;

class af extends ao
{
    final /* synthetic */ long a;
    final /* synthetic */ ac b;
    
    af(final ac b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final View view, final MotionEvent motionEvent) {
        this.b.a(this.a, NativeCardUserAction.a(this.b.d(), view, motionEvent, 0));
    }
}
