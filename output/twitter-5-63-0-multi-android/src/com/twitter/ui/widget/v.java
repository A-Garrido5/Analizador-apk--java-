// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.view.MotionEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager$LayoutParams;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.support.v4.app.Fragment;

class v implements Runnable
{
    final /* synthetic */ Tooltip a;
    
    v(final Tooltip a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a();
        if (this.a.k != null) {
            this.a.k.a(this.a, 2);
        }
    }
}
