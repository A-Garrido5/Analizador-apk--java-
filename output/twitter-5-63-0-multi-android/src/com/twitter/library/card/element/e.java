// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.View;
import com.twitter.library.card.property.Vector2F;
import android.content.Context;

public class e
{
    protected Context b;
    protected FollowButtonElement c;
    
    public e(final Context b, final FollowButtonElement c) {
        this.b = b;
        this.c = c;
    }
    
    public float a(final int n, final Vector2F vector2F) {
        return 0.0f;
    }
    
    public View a() {
        return null;
    }
    
    public void a(final Canvas canvas, final Paint paint, final RectF rectF) {
    }
    
    public void a(final h h, final ao ao) {
    }
    
    public void d() {
    }
    
    public void f() {
    }
    
    public TwitterUser g() {
        return this.c.mUser;
    }
    
    public long h() {
        final TwitterUser mUser = this.c.mUser;
        if (mUser != null) {
            return mUser.userId;
        }
        return 0L;
    }
}
