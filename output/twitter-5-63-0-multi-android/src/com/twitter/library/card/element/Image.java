// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.media.util.m;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import com.twitter.library.util.bj;
import android.net.Uri;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.card.property.Vector2F;
import android.graphics.Canvas;
import com.twitter.library.card.property.ImageSpec;
import android.graphics.Rect;
import java.util.concurrent.Future;
import android.graphics.RectF;
import android.graphics.Bitmap;
import com.twitter.library.card.property.Vector2;

public class Image extends Element
{
    private static final long serialVersionUID = 2248428492164602013L;
    public Vector2 alignmentMode;
    public float cornerRadius;
    public boolean fillAvailableSpace;
    public int loadingIndicator;
    protected Bitmap mDrawBitmap;
    private RectF mDstImageRect;
    protected Future mImageFuture;
    protected Bitmap mLoadedBitmap;
    private Rect mSrcImageRect;
    public boolean preserveAspectRatio;
    public ImageSpec spec;
    public ImageSpec specFullSize;
    
    public Image() {
        this.mSrcImageRect = new Rect();
        this.mDstImageRect = new RectF();
    }
    
    private void a() {
        float n = 0.0f;
        if (this.spec == null) {
            return;
        }
        final float i = this.i();
        if (this.preserveAspectRatio && this.mLoadedBitmap != null && i > 0.0f) {
            final float x = this.mLayoutSize.x;
            final float y = this.mLayoutSize.y;
            float n2;
            float n3;
            float n4 = 0.0f;
            if (i > x / y ^ this.fillAvailableSpace) {
                n2 = (float)Math.floor(x);
                n3 = (float)Math.floor(x / i);
                switch (this.alignmentMode.y) {
                    default: {
                        n4 = 0.0f;
                        break;
                    }
                    case 2: {
                        n4 = (float)Math.floor(0.5f * (y - n3));
                        n = 0.0f;
                        break;
                    }
                    case 3: {
                        n4 = y - (float)Math.floor(n3);
                        n = 0.0f;
                        break;
                    }
                }
            }
            else {
                n2 = (float)Math.floor(y * i);
                n3 = (float)Math.floor(y);
                switch (this.alignmentMode.x) {
                    default: {
                        n4 = 0.0f;
                        n = 0.0f;
                        break;
                    }
                    case 2: {
                        n = (float)Math.floor(0.5f * (x - n2));
                        n4 = 0.0f;
                        break;
                    }
                    case 3: {
                        n = x - (float)Math.floor(n2);
                        n4 = 0.0f;
                        break;
                    }
                }
            }
            this.mDstImageRect.set(n, n4, n2 + n, n3 + n4);
            return;
        }
        this.mDstImageRect.set(this.mLayoutRect);
    }
    
    private void a(final Canvas canvas, final int color) {
        final int color2 = Image.a.getColor();
        Image.a.setColor(color);
        final float floatValue = this.mComputedStyle.cornerRadius;
        if (floatValue == 0.0f) {
            canvas.drawRect(this.mLayoutRect, Image.a);
        }
        else {
            canvas.drawRoundRect(this.mLayoutRect, floatValue, floatValue, Image.a);
        }
        Image.a.setColor(color2);
    }
    
    public void J() {
        this.mDrawBitmap = null;
    }
    
    @Override
    protected float a(final int n, final Vector2F vector2F) {
        if (this.spec == null) {
            return 0.0f;
        }
        final Vector2F c = this.c();
        final float x = c.x;
        final float y = c.y;
        if (n == 0) {
            if (y <= 0.0f) {
                return this.mComputedStyle.sizeX;
            }
            if (this.t() == 2) {
                return this.a(n, vector2F, x, y);
            }
            return x;
        }
        else {
            if (x <= 0.0f) {
                return this.mComputedStyle.sizeY;
            }
            if (this.t() == 3) {
                return this.a(n, vector2F, x, y);
            }
            return y;
        }
    }
    
    protected float a(final int n, final Vector2F vector2F, final float n2, final float n3) {
        if (n == 1) {
            return (float)Math.floor(n3 * vector2F.x / n2);
        }
        return (float)Math.floor(n2 * vector2F.y / n3);
    }
    
    public void a(final Bitmap mLoadedBitmap) {
        synchronized (this) {
            this.mLoadedBitmap = mLoadedBitmap;
            this.K();
        }
    }
    
    @Override
    public void a(final h h, final ao ao) {
        while (true) {
            while (true) {
                Label_0149: {
                    final Uri parse;
                    Label_0126: {
                        synchronized (this) {
                            if (this.spec != null) {
                                parse = Uri.parse(this.spec.url);
                                if (!parse.getEncodedPath().equals("/2/proxy.jpg")) {
                                    break Label_0149;
                                }
                                if (bj.a < 2.0f) {
                                    break Label_0126;
                                }
                                final String s = parse.buildUpon().appendQueryParameter("m", "2").build().toString();
                                final Vector2F c = this.c();
                                this.mImageFuture = h.a(((k)j.a(s, (int)c.x, (int)c.y).a(new i(this, null))).a());
                            }
                            return;
                        }
                    }
                    final String s = parse.buildUpon().appendQueryParameter("m", "1").build().toString();
                    continue;
                }
                final String s = this.spec.url;
                continue;
            }
        }
    }
    
    @Override
    public void b(final Canvas canvas) {
        super.b(canvas);
        canvas.clipRect(this.mLayoutRect);
        if (this.mDrawBitmap != null) {
            canvas.drawBitmap(this.mDrawBitmap, this.mSrcImageRect, this.mDstImageRect, Image.a);
        }
        else if (this.loadingIndicator == 2) {
            this.a(canvas, this.mCardView.a.c);
        }
    }
    
    protected Vector2F c() {
        return this.spec.size;
    }
    
    @Override
    public void d(final Canvas canvas) {
        this.a(canvas, this.mCardView.a.b);
    }
    
    @Override
    public void e() {
        this.a();
        if (this.mLoadedBitmap != null && this.mDrawBitmap == null) {
            final float floatValue = this.mComputedStyle.cornerRadius;
            if (floatValue > 0.0f) {
                this.mDrawBitmap = m.a(this.mLoadedBitmap, Size.a(this.mDstImageRect), floatValue);
            }
            else {
                this.mDrawBitmap = this.mLoadedBitmap;
            }
            if (this.mDrawBitmap != null) {
                this.mSrcImageRect.set(0, 0, this.mDrawBitmap.getWidth(), this.mDrawBitmap.getHeight());
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Image)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final Image image = (Image)o;
            if (Float.compare(image.cornerRadius, this.cornerRadius) != 0) {
                return false;
            }
            if (this.fillAvailableSpace != image.fillAvailableSpace) {
                return false;
            }
            if (this.loadingIndicator != image.loadingIndicator) {
                return false;
            }
            if (this.preserveAspectRatio != image.preserveAspectRatio) {
                return false;
            }
            Label_0116: {
                if (this.alignmentMode != null) {
                    if (this.alignmentMode.equals(image.alignmentMode)) {
                        break Label_0116;
                    }
                }
                else if (image.alignmentMode == null) {
                    break Label_0116;
                }
                return false;
            }
            if (this.spec != null) {
                if (this.spec.equals(image.spec)) {
                    return true;
                }
            }
            else if (image.spec == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public void h() {
        this.mLoadedBitmap = null;
        if (this.mImageFuture != null) {
            this.mImageFuture.cancel(true);
            this.mImageFuture = null;
        }
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * super.hashCode();
        int hashCode;
        if (this.spec != null) {
            hashCode = this.spec.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n3 = 31 * (hashCode + n2);
        int n4;
        if (this.preserveAspectRatio) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        final int n5 = 31 * (n4 + n3);
        if (!this.fillAvailableSpace) {
            n = 0;
        }
        final int n6 = 31 * (n5 + n);
        int hashCode2;
        if (this.alignmentMode != null) {
            hashCode2 = this.alignmentMode.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n7 = 31 * (hashCode2 + n6);
        final float n8 = fcmpl(this.cornerRadius, 0.0f);
        int floatToIntBits = 0;
        if (n8 != 0) {
            floatToIntBits = Float.floatToIntBits(this.cornerRadius);
        }
        return 31 * (n7 + floatToIntBits) + this.loadingIndicator;
    }
    
    protected float i() {
        final Vector2F c = this.c();
        return c.x / c.y;
    }
    
    @Override
    protected void q() {
        super.q();
        this.mComputedStyle.cornerRadius = this.cornerRadius;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.spec = (ImageSpec)objectInput.readObject();
        this.specFullSize = (ImageSpec)objectInput.readObject();
        this.preserveAspectRatio = objectInput.readBoolean();
        this.fillAvailableSpace = objectInput.readBoolean();
        this.alignmentMode = (Vector2)objectInput.readObject();
        this.cornerRadius = objectInput.readFloat();
        this.loadingIndicator = objectInput.readInt();
    }
    
    @Override
    protected int t() {
        int n = 3;
        if (this.sizeMode.y == n) {
            if (this.sizeMode.x == n) {
                if (this.maxSizeMode.x != 5 && this.maxSizeMode.y != 5) {
                    n = 4;
                }
                else if (this.maxSizeMode.x == 5) {
                    if (this.maxSizeMode.y != 5) {
                        return 2;
                    }
                    return 1;
                }
            }
            return n;
        }
        if (this.sizeMode.x == n) {
            return 2;
        }
        return super.t();
    }
    
    @Override
    public void w() {
        synchronized (this) {
            this.h();
            this.mDrawBitmap = null;
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeObject(this.spec);
        objectOutput.writeObject(this.specFullSize);
        objectOutput.writeBoolean(this.preserveAspectRatio);
        objectOutput.writeBoolean(this.fillAvailableSpace);
        objectOutput.writeObject(this.alignmentMode);
        objectOutput.writeFloat(this.cornerRadius);
        objectOutput.writeInt(this.loadingIndicator);
    }
}
