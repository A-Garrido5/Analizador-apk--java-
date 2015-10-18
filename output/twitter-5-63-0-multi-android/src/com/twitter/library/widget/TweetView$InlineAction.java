// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.Canvas;
import android.text.StaticLayout;
import com.twitter.library.view.TweetActionType;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class TweetView$InlineAction
{
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final int[] n;
    private static final int[] o;
    private static final int[] p;
    public Drawable a;
    public final Rect b;
    public final Rect c;
    public ValueAnimator d;
    public TweetView$InlineAction$State e;
    public TweetActionType f;
    public StaticLayout g;
    public final Rect h;
    
    static {
        i = new int[] { kv.state_inline_action_fav_pressed };
        j = new int[] { kv.state_inline_action_retweet_pressed };
        k = new int[] { kv.state_inline_action_follow_pressed };
        l = new int[] { kv.state_inline_action_goodfeedback_pressed };
        m = new int[] { kv.state_inline_action_badfeedback_pressed };
        n = new int[] { kv.state_inline_action_reply_pressed };
        o = new int[] { kv.state_inline_action_gotorelated_pressed };
        p = new int[] { kv.state_inline_action_pressed };
    }
    
    public TweetView$InlineAction() {
        this.b = new Rect();
        this.c = new Rect();
        this.h = new Rect();
    }
    
    private void b(final Canvas canvas) {
        final int n = this.a.getIntrinsicWidth() / 2;
        final int n2 = this.a.getIntrinsicHeight() / 2;
        canvas.translate((float)n, (float)n2);
        final float floatValue = (float)this.d.getAnimatedValue();
        canvas.scale(floatValue, floatValue);
        canvas.translate((float)(-n), (float)(-n2));
    }
    
    public void a(final Canvas canvas) {
        canvas.save();
        canvas.translate((float)this.c.left, (float)this.c.top);
        if (this.d != null) {
            this.b(canvas);
        }
        this.a.draw(canvas);
        canvas.restore();
        canvas.save();
        if (this.g != null) {
            canvas.translate((float)this.h.left, (float)this.h.top);
            this.g.draw(canvas);
        }
        canvas.restore();
    }
}
