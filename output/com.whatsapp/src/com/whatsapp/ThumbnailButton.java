// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build;
import android.os.Build$VERSION;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.ImageView;

public class ThumbnailButton extends ImageView
{
    private static int b;
    float a;
    int c;
    final RectF d;
    final Rect e;
    int f;
    Paint g;
    float h;
    boolean i;
    float j;
    
    static {
        int b = 0;
        Label_0055: {
            Label_0052: {
                if (Build$VERSION.SDK_INT >= 19) {
                    if (Build$VERSION.SDK_INT < 21) {
                        final char[] charArray = "Q\u0002Z6ML\u0004".toCharArray();
                        for (int i = charArray.length, n = 0; i > n; ++n) {
                            final char c = charArray[n];
                            char c2 = '\0';
                            switch (n % 5) {
                                default: {
                                    c2 = '8';
                                    break;
                                }
                                case 0: {
                                    c2 = '\"';
                                    break;
                                }
                                case 1: {
                                    c2 = 'c';
                                    break;
                                }
                                case 2: {
                                    c2 = '7';
                                    break;
                                }
                                case 3: {
                                    c2 = 'E';
                                    break;
                                }
                            }
                            charArray[n] = (char)(c2 ^ c);
                        }
                        if (new String(charArray).intern().equalsIgnoreCase(Build.MANUFACTURER)) {
                            break Label_0052;
                        }
                    }
                    b = 419430400;
                    break Label_0055;
                }
            }
            b = 1711315455;
        }
        ThumbnailButton.b = b;
    }
    
    public ThumbnailButton(final Context context) {
        super(context);
        this.a = 0.0f;
        this.f = ThumbnailButton.b;
        this.d = new RectF();
        this.e = new Rect();
        this.a(context, null);
    }
    
    public ThumbnailButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0.0f;
        this.f = ThumbnailButton.b;
        this.d = new RectF();
        this.e = new Rect();
        this.a(context, set);
    }
    
    public ThumbnailButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = 0.0f;
        this.f = ThumbnailButton.b;
        this.d = new RectF();
        this.e = new Rect();
        this.a(context, set);
    }
    
    private void a(final Context context, final AttributeSet set) {
        this.setBackgroundDrawable((Drawable)new al6(null));
        if (set != null) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aqy.ThumbnailButton);
            this.a = obtainStyledAttributes.getDimension(1, this.a);
            this.h = obtainStyledAttributes.getFloat(4, this.h);
            this.f = obtainStyledAttributes.getInteger(0, this.f);
            this.j = obtainStyledAttributes.getDimension(2, this.j);
            this.c = obtainStyledAttributes.getInteger(3, this.c);
            this.i = obtainStyledAttributes.getBoolean(5, this.i);
            obtainStyledAttributes.recycle();
        }
        (this.g = new Paint()).setAntiAlias(true);
        this.g.setDither(true);
        this.g.setFilterBitmap(true);
        this.g.setColor(-1);
    }
    
    protected void a(final Canvas canvas) {
        final boolean i = App.I;
        if (this.getDrawable() != null) {
            final Bitmap bitmap = ((BitmapDrawable)this.getDrawable()).getBitmap();
            final int width = bitmap.getWidth();
            final int height = bitmap.getHeight();
            Label_0277: {
                if (this.getScaleType() == ImageView$ScaleType.FIT_CENTER) {
                    this.e.set(0, 0, width, height);
                    if (width / height > this.d.width() / this.d.height()) {
                        final float n = this.d.width() * height / width;
                        this.d.top = (this.d.top + this.d.bottom) / 2.0f - n / 2.0f;
                        this.d.bottom = n + this.d.top;
                        if (!i) {
                            break Label_0277;
                        }
                    }
                    final float n2 = this.d.height() * width / height;
                    this.d.left = (this.d.left + this.d.right) / 2.0f - n2 / 2.0f;
                    this.d.right = n2 + this.d.left;
                    if (!i) {
                        break Label_0277;
                    }
                }
                final int n3 = (width - height) / 2;
                if (n3 > 0) {
                    this.e.set(n3, 0, width - n3, height);
                    if (!i) {
                        break Label_0277;
                    }
                }
                this.e.set(0, -n3, width, height + n3);
            }
            int n4;
            if (this.a != 0.0f) {
                final int saveLayer = canvas.saveLayer(this.d, (Paint)null, 31);
                this.g.setColor(-1);
                this.g.setStyle(Paint$Style.FILL);
                canvas.drawARGB(0, 0, 0, 0);
                Label_0374: {
                    if (this.a >= 0.0f) {
                        canvas.drawRoundRect(this.d, this.a, this.a, this.g);
                        if (!i) {
                            break Label_0374;
                        }
                    }
                    canvas.drawArc(this.d, 0.0f, 360.0f, true, this.g);
                }
                this.g.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
                n4 = saveLayer;
            }
            else {
                n4 = 0;
            }
            canvas.drawBitmap(bitmap, this.e, this.d, this.g);
            if (this.a != 0.0f) {
                this.g.setXfermode((Xfermode)null);
                canvas.restoreToCount(n4);
            }
        }
    }
    
    protected void b(final Canvas canvas) {
        if (this.j > 0.0f && this.c != 0) {
            this.g.setColor(this.c);
            this.g.setStrokeWidth(this.j);
            this.g.setStyle(Paint$Style.STROKE);
            if (this.a >= 0.0f) {
                canvas.drawRoundRect(this.d, this.a, this.a, this.g);
                if (!App.I) {
                    return;
                }
            }
            canvas.drawArc(this.d, 0.0f, 360.0f, true, this.g);
        }
    }
    
    protected void c(final Canvas canvas) {
        if (this.isEnabled() && (this.isSelected() || this.isPressed())) {
            this.g.setStyle(Paint$Style.FILL);
            this.g.setColor(this.f);
            if (this.a >= 0.0f) {
                canvas.drawRoundRect(this.d, this.a, this.a, this.g);
                if (!App.I) {
                    return;
                }
            }
            canvas.drawArc(this.d, 0.0f, 360.0f, true, this.g);
        }
    }
    
    public void onDraw(final Canvas canvas) {
        this.d.left = this.getPaddingLeft();
        this.d.right = this.getWidth() - this.getPaddingLeft();
        this.d.top = this.getPaddingTop();
        this.d.bottom = this.getHeight() - this.getPaddingBottom();
        Label_0091: {
            if (this.i || !(this.getDrawable() instanceof BitmapDrawable)) {
                super.onDraw(canvas);
                if (!App.I) {
                    break Label_0091;
                }
            }
            this.a(canvas);
        }
        this.b(canvas);
        this.c(canvas);
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.h == 1.0f) {
            final int defaultSize = getDefaultSize(this.getSuggestedMinimumWidth(), n);
            this.setMeasuredDimension(defaultSize, defaultSize);
            if (!App.I) {
                return;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public void setBorderColor(final int c) {
        this.c = c;
    }
    
    public void setBorderSize(final float j) {
        this.j = j;
    }
    
    public void setRadius(final float a) {
        this.a = a;
    }
}
