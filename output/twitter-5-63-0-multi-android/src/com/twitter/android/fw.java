// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.util.concurrent.d;
import java.util.concurrent.Executor;
import com.twitter.util.concurrent.e;
import com.twitter.android.widget.RevealClipFrameLayout;
import android.view.View;
import com.twitter.util.concurrent.i;

final class fw implements gj
{
    final /* synthetic */ i a;
    final /* synthetic */ EditImageFragment b;
    final /* synthetic */ View c;
    final /* synthetic */ RevealClipFrameLayout d;
    
    fw(final i a, final EditImageFragment b, final View c, final RevealClipFrameLayout d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void a() {
        this.a.a(new e().a(EditImageFragment.a).a(new fx(this)));
        this.b.a((gj)null);
    }
}
