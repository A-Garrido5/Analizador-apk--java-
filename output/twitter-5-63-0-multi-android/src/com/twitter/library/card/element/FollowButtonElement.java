// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.graphics.Canvas;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.api.TwitterUser;

public class FollowButtonElement extends Element
{
    private static final long serialVersionUID = -3292000542595214071L;
    public FollowButtonElement$Kind kind;
    protected e mDelegate;
    protected TwitterUser mUser;
    
    public void J() {
        this.mDelegate.d();
    }
    
    public float a(final int n, final Vector2F vector2F) {
        return this.mDelegate.a(n, vector2F);
    }
    
    @Override
    public void a(final Context context) {
        this.mView = this.mDelegate.a();
    }
    
    public void a(final TwitterUser mUser) {
        this.mUser = mUser;
        if (mUser != null && az.a(this.B()).b().g() == mUser.userId) {
            this.f(false);
        }
    }
    
    @Override
    public void a(final h h, final ao ao) {
        super.a(h, ao);
        this.mDelegate.a(h, ao);
    }
    
    @Override
    public void b(final Canvas canvas) {
        super.b(canvas);
        this.mDelegate.a(canvas, FollowButtonElement.a, this.mLayoutRect);
    }
    
    @Override
    public void c(final Context context) {
        if (FollowButtonElement.b != null) {
            this.mDelegate = FollowButtonElement.b.a(context, this);
        }
        if (this.mDelegate == null) {
            this.mDelegate = new e(context, this);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof FollowButtonElement)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            if (this.kind != ((FollowButtonElement)o).kind) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int hashCode;
        if (this.kind != null) {
            hashCode = this.kind.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode + n;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.kind = (FollowButtonElement$Kind)objectInput.readObject();
    }
    
    @Override
    public void w() {
        super.w();
        this.mDelegate.f();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.kind);
    }
}
