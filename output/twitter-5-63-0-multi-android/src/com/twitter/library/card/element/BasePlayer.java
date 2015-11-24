// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.card.Card;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public abstract class BasePlayer extends Image
{
    public String htmlUrl;
    protected Drawable mOverlay;
    public String streamContentType;
    public String streamUrl;
    
    public BasePlayer() {
        this.loadingIndicator = 2;
    }
    
    protected abstract void a(final Canvas p0, final Paint p1, final RectF p2);
    
    @Override
    public void a(final h h, final ao ao) {
        synchronized (this) {
            super.a(h, ao);
        }
    }
    
    @Override
    public void a(final int[] state) {
        super.a(state);
        if (this.a()) {
            final Drawable mOverlay = this.mOverlay;
            if (mOverlay != null && mOverlay.isStateful()) {
                mOverlay.setState(state);
            }
        }
    }
    
    protected abstract boolean a();
    
    @Override
    protected void a_(final Card card) {
        if (this.a()) {
            final int a = this.mCardView.a.a;
            if (a != 0) {
                this.mOverlay = this.B().getResources().getDrawable(a);
            }
        }
    }
    
    protected abstract Vector2F b();
    
    @Override
    public void b(final Canvas canvas) {
        super.b(canvas);
        this.a(canvas, BasePlayer.a, this.mLayoutRect);
        if (this.a()) {
            final Drawable mOverlay = this.mOverlay;
            if (mOverlay != null) {
                mOverlay.draw(canvas);
            }
        }
    }
    
    @Override
    protected Vector2F c() {
        if (this.a()) {
            return this.spec.size;
        }
        return this.b();
    }
    
    @Override
    protected void d() {
        super.d();
        this.E();
    }
    
    @Override
    public void e() {
        super.e();
        if (this.a()) {
            final Drawable mOverlay = this.mOverlay;
            if (mOverlay != null) {
                float min;
                float n;
                if (this.mLayoutSize.x > 0.0f) {
                    min = Math.min(mOverlay.getMinimumWidth(), this.mLayoutSize.x);
                    n = (this.mLayoutSize.x - min) / 2.0f;
                }
                else {
                    n = 0.0f;
                    min = 0.0f;
                }
                float min2;
                float n2;
                if (this.mLayoutSize.y > 0.0f) {
                    min2 = Math.min(mOverlay.getMinimumHeight(), this.mLayoutSize.y);
                    n2 = (this.mLayoutSize.y - min2) / 2.0f;
                }
                else {
                    n2 = 0.0f;
                    min2 = 0.0f;
                }
                mOverlay.setBounds((int)n, (int)n2, (int)(n + min), (int)(n2 + min2));
            }
        }
    }
    
    @Override
    public void f() {
        super.f();
    }
    
    @Override
    public void g() {
        super.g();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.htmlUrl = (String)objectInput.readObject();
        this.streamUrl = (String)objectInput.readObject();
        this.streamContentType = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.htmlUrl);
        objectOutput.writeObject(this.streamUrl);
        objectOutput.writeObject(this.streamContentType);
    }
}
