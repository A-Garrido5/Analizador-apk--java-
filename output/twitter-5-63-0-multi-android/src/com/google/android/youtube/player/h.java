// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.view.MotionEvent;
import android.content.res.Configuration;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import java.util.ArrayList;
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
import android.view.View;
import com.google.android.youtube.player.internal.ax;
import java.util.Set;
import android.view.ViewGroup;
import com.google.android.youtube.player.internal.ba;

final class h implements ba
{
    final /* synthetic */ YouTubePlayerView a;
    
    h(final YouTubePlayerView a) {
        this.a = a;
    }
    
    @Override
    public final void a(final YouTubeInitializationResult youTubeInitializationResult) {
        this.a.a(youTubeInitializationResult);
        this.a.d = null;
    }
}
