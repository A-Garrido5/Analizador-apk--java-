// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import android.view.TouchDelegate;
import android.graphics.Rect;
import android.view.View;

final class a implements Runnable
{
    final /* synthetic */ View a;
    final /* synthetic */ Rect b;
    final /* synthetic */ View c;
    
    a(final View a, final Rect b, final View c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        this.a.setTouchDelegate(new TouchDelegate(this.b, this.c));
    }
}
