// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.util;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.io.Serializable;
import android.os.Parcelable;

public class Size implements Parcelable, Serializable
{
    public static final Parcelable$Creator CREATOR;
    public static final Size a;
    private final int mHeight;
    private final int mWidth;
    
    static {
        CREATOR = (Parcelable$Creator)new a();
        a = new Size();
    }
    
    private Size() {
        this(0, 0);
    }
    
    private Size(final int mWidth, final int mHeight) {
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }
    
    public Size(final Parcel parcel) {
        this.mWidth = parcel.readInt();
        this.mHeight = parcel.readInt();
    }
    
    public static Size a(final float n, final float n2) {
        return a((int)n, (int)n2);
    }
    
    public static Size a(final int n) {
        return a(n, n);
    }
    
    public static Size a(final int n, final int n2) {
        final int max = Math.max(n, 0);
        final int max2 = Math.max(n2, 0);
        if (max != 0 || max2 != 0) {
            return new Size(max, max2);
        }
        return Size.a;
    }
    
    public static Size a(final Bitmap bitmap) {
        return a(bitmap.getWidth(), bitmap.getHeight());
    }
    
    public static Size a(final BitmapFactory$Options bitmapFactory$Options) {
        return a(bitmapFactory$Options.outWidth, bitmapFactory$Options.outHeight);
    }
    
    public static Size a(final Rect rect) {
        return a(rect.width(), rect.height());
    }
    
    public static Size a(final RectF rectF) {
        return a((int)rectF.width(), (int)rectF.height());
    }
    
    public static Size a(final Drawable drawable) {
        return a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
    
    public static Size a(final View view) {
        return a(view.getWidth(), view.getHeight());
    }
    
    private Object writeReplace() {
        return new Size$SerializationProxy(this);
    }
    
    public int a() {
        return this.mWidth;
    }
    
    public Size a(final float n) {
        return this.b(n, n);
    }
    
    public Size a(final Size size, final boolean b) {
        if (!size.b(this)) {
            if (!b) {
                return a(Math.min(size.a(), this.mWidth), Math.min(size.b(), this.mHeight));
            }
            this = this.c(size);
        }
        return this;
    }
    
    public boolean a(final Size size) {
        return this.mWidth * size.mHeight > this.mHeight * size.mWidth;
    }
    
    public int b() {
        return this.mHeight;
    }
    
    public Size b(final float n) {
        final float e = this.e();
        if (n == 0.0f || e == 0.0f || n == e) {
            return this;
        }
        if (n < e) {
            return a((int)(n * this.mHeight), this.mHeight);
        }
        return a(this.mWidth, (int)(this.mWidth / n));
    }
    
    public Size b(final float n, final float n2) {
        if (n == 0.0f && n2 == 0.0f) {
            this = Size.a;
        }
        else if (n != 1.0f || n2 != 1.0f) {
            return a(n * this.mWidth, n2 * this.mHeight);
        }
        return this;
    }
    
    public boolean b(final Size size) {
        return this.mWidth >= size.mWidth && this.mHeight >= size.mHeight;
    }
    
    public Size c(final Size size) {
        return size.b(this.e());
    }
    
    public boolean c() {
        return this.mWidth * this.mHeight <= 0;
    }
    
    public boolean d() {
        return this.mWidth > this.mHeight;
    }
    
    public boolean d(final Size size) {
        return this == size || (size != null && this.mWidth == size.mWidth && this.mHeight == size.mHeight);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public float e() {
        if (this.c()) {
            return 0.0f;
        }
        return this.mWidth / this.mHeight;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.d((Size)o));
    }
    
    public Rect f() {
        return new Rect(0, 0, this.mWidth, this.mHeight);
    }
    
    public RectF g() {
        return new RectF(0.0f, 0.0f, (float)this.mWidth, (float)this.mHeight);
    }
    
    @Override
    public int hashCode() {
        return (this.mWidth << 16) + this.mHeight;
    }
    
    @Override
    public String toString() {
        return String.format("[w: %d, h: %d]", this.mWidth, this.mHeight);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mHeight);
    }
}
