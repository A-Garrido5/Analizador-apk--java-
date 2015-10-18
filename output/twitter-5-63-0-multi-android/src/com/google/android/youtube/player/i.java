// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.view.MotionEvent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.youtube.player.internal.ba;
import com.google.android.youtube.player.internal.az;
import com.google.android.youtube.player.internal.w$a;
import com.google.android.youtube.player.internal.b;
import android.app.Activity;
import java.util.HashSet;
import com.google.android.youtube.player.internal.c;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Bundle;
import com.google.android.youtube.player.internal.n;
import com.google.android.youtube.player.internal.ax;
import java.util.Set;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;

final class i implements ViewTreeObserver$OnGlobalFocusChangeListener
{
    final /* synthetic */ YouTubePlayerView a;
    
    private i(final YouTubePlayerView a) {
        this.a = a;
    }
    
    public final void onGlobalFocusChanged(final View view, final View view2) {
        if (this.a.e != null && this.a.b.contains(view2) && !this.a.b.contains(view)) {
            this.a.e.g();
        }
    }
}
