// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Iterator;
import android.view.WindowManager;
import android.graphics.PointF;
import android.view.WindowManager$LayoutParams;
import android.util.Log;
import android.app.Activity;
import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import android.graphics.Rect;

class as implements Runnable
{
    final /* synthetic */ ap a;
    
    as(final ap a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.f.b(this.a.h);
    }
}
