// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles.animation;

import android.util.DisplayMetrics;
import java.util.List;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;

public class BalloonSetAnimationView extends FlyThroughSetAnimationView
{
    private static final int[] a;
    
    static {
        a = new int[] { 2130839484, 2130839485, 2130839486, 2130839487, 2130839486, 2130839485, 2130839487, 2130839484, 2130839487, 2130839486 };
    }
    
    public BalloonSetAnimationView(final Context context) {
        this(context, null, 0);
    }
    
    public BalloonSetAnimationView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public BalloonSetAnimationView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public void a() {
        final DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
        final ArrayList<Drawable> list = new ArrayList<Drawable>(BalloonSetAnimationView.a.length);
        final int[] a = BalloonSetAnimationView.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            list.add(this.getContext().getResources().getDrawable(a[i]));
        }
        this.a(new d(displayMetrics, 10, 5, list, new c().a(displayMetrics).d(0).e(2000).f(100).a(0.003).a(1.5f)));
    }
}
