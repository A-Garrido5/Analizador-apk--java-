// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.view.MotionEvent;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.content.Context;
import com.twitter.library.card.property.Vector2;
import com.twitter.library.card.property.Vector2F;
import java.io.Externalizable;

public class Player extends BasePlayer implements Externalizable
{
    private static final long serialVersionUID = -2200235836929170068L;
    protected j mDelegate;
    public Vector2F streamSize;
    
    public Player() {
        this.streamSize = new Vector2F();
        this.preserveAspectRatio = true;
        this.fillAvailableSpace = true;
        this.alignmentMode = new Vector2(2, 1);
    }
    
    @Override
    public void a(final Context context) {
        this.mView = this.mDelegate.a();
    }
    
    @Override
    protected void a(final Canvas canvas, final Paint paint, final RectF rectF) {
        this.mDelegate.a(canvas, paint, rectF);
    }
    
    @Override
    public void a(final h h, final ao ao) {
        if (this.mDelegate.a(h, ao)) {
            super.a(h, ao);
        }
    }
    
    @Override
    protected boolean a() {
        return this.mDelegate.e();
    }
    
    public Vector2F b() {
        return this.streamSize;
    }
    
    @Override
    protected void b(final boolean b) {
        super.b(b);
        this.mDelegate.b(b);
    }
    
    @Override
    public void c(final Context context) {
        if (Player.b != null) {
            this.mDelegate = Player.b.a(context, this);
        }
        if (this.mDelegate == null) {
            this.mDelegate = new j(context, this);
        }
    }
    
    @Override
    protected void d() {
        super.d();
        this.mDelegate.d();
    }
    
    @Override
    public void d(final Canvas canvas) {
    }
    
    @Override
    public void d(final boolean b) {
        super.d(b);
        this.mDelegate.a(b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Player)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final Player player = (Player)o;
            Label_0061: {
                if (this.htmlUrl != null) {
                    if (this.htmlUrl.equals(player.htmlUrl)) {
                        break Label_0061;
                    }
                }
                else if (player.htmlUrl == null) {
                    break Label_0061;
                }
                return false;
            }
            Label_0091: {
                if (this.streamContentType != null) {
                    if (this.streamContentType.equals(player.streamContentType)) {
                        break Label_0091;
                    }
                }
                else if (player.streamContentType == null) {
                    break Label_0091;
                }
                return false;
            }
            Label_0121: {
                if (this.streamSize != null) {
                    if (this.streamSize.equals(player.streamSize)) {
                        break Label_0121;
                    }
                }
                else if (player.streamSize == null) {
                    break Label_0121;
                }
                return false;
            }
            if (this.streamUrl != null) {
                if (this.streamUrl.equals(player.streamUrl)) {
                    return true;
                }
            }
            else if (player.streamUrl == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void f() {
        super.f();
        this.mDelegate.g();
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int hashCode;
        if (this.htmlUrl != null) {
            hashCode = this.htmlUrl.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.streamUrl != null) {
            hashCode2 = this.streamUrl.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.streamContentType != null) {
            hashCode3 = this.streamContentType.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        final Vector2F streamSize = this.streamSize;
        int hashCode4 = 0;
        if (streamSize != null) {
            hashCode4 = this.streamSize.hashCode();
        }
        return n4 + hashCode4;
    }
    
    @Override
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        return this.mDelegate.b();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.streamSize = (Vector2F)objectInput.readObject();
    }
    
    @Override
    public void v() {
        super.v();
        if (this.mDelegate != null) {
            this.mDelegate.f();
        }
    }
    
    @Override
    public void w() {
        super.w();
        this.mDelegate.c();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.streamSize);
    }
}
