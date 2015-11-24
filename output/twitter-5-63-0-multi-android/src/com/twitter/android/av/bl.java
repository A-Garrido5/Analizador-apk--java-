// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import java.util.Iterator;
import android.view.View;
import com.twitter.library.util.b;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Handler;
import com.twitter.android.widget.gi;
import java.util.TreeMap;
import com.twitter.android.widget.gj;
import android.widget.ImageView;

class bl implements Runnable
{
    final /* synthetic */ ViewMoreVideosButtonView a;
    
    bl(final ViewMoreVideosButtonView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b.a(2);
    }
}
