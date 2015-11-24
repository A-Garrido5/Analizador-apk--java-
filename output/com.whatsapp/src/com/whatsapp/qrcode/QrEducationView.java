// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import com.whatsapp.DialogToastActivity;
import android.graphics.Canvas;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

public class QrEducationView extends View
{
    private final float a;
    private Drawable b;
    private Drawable c;
    private int d;
    private c e;
    private final float f;
    private final float g;
    private final float h;
    private float i;
    private final float j;
    private Drawable k;
    private Paint l;
    private long m;
    private Drawable n;
    private Drawable o;
    private final float p;
    private final float q;
    private Drawable r;
    private final float s;
    
    public QrEducationView(final Context context) {
        super(context);
        this.s = 0.14f;
        this.g = 0.2f;
        this.f = 0.3f;
        this.p = 0.35f;
        this.h = 0.5f;
        this.j = 0.55f;
        this.a = 0.6f;
        this.q = 0.9f;
        this.l = new Paint();
        this.a(context);
    }
    
    public QrEducationView(final Context context, final AttributeSet set) {
        super(context, set);
        this.s = 0.14f;
        this.g = 0.2f;
        this.f = 0.3f;
        this.p = 0.35f;
        this.h = 0.5f;
        this.j = 0.55f;
        this.a = 0.6f;
        this.q = 0.9f;
        this.l = new Paint();
        this.a(context);
    }
    
    public QrEducationView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.s = 0.14f;
        this.g = 0.2f;
        this.f = 0.3f;
        this.p = 0.35f;
        this.h = 0.5f;
        this.j = 0.55f;
        this.a = 0.6f;
        this.q = 0.9f;
        this.l = new Paint();
        this.a(context);
    }
    
    private static float a(final float n, final float n2, final float n3) {
        if (n3 <= n) {
            return 0.0f;
        }
        if (n3 >= n2) {
            return 1.0f;
        }
        return (n3 - n) / (n2 - n);
    }
    
    private static float a(final float n, final float n2, final float n3, final float n4, final float n5) {
        return n4 + (n5 - n4) * a(n, n2, n3);
    }
    
    static float a(final QrEducationView qrEducationView, final float i) {
        return qrEducationView.i = i;
    }
    
    private void a(final Context context) {
        final Resources resources = context.getResources();
        this.o = resources.getDrawable(2130837579);
        this.k = resources.getDrawable(2130837578);
        this.n = resources.getDrawable(2130837576);
        this.r = resources.getDrawable(2130837577);
        this.c = resources.getDrawable(2130837575);
        this.b = resources.getDrawable(2130837574);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        (this.e = new c(this, null)).setDuration(8000L);
        this.e.setRepeatCount(-1);
        this.e.setInterpolator((Interpolator)new LinearInterpolator());
        this.startAnimation((Animation)this.e);
        this.d = 0;
        this.m = 0L;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.clearAnimation();
    }
    
    public void onDraw(final Canvas canvas) {
        final int r = QrCodeActivity.r;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int min = Math.min(width, height);
        final int n = (width - min) / 2;
        final int n2 = (height - min) / 2;
        canvas.clipRect(n, n2, n + min, min + n2);
        canvas.translate((float)(width / 2), (float)(height / 2));
        if (this.r.getIntrinsicHeight() + this.r.getIntrinsicWidth() / 3 > height) {
            final float n3 = height / (this.r.getIntrinsicHeight() + this.r.getIntrinsicWidth() / 3);
            canvas.scale(n3, n3);
        }
        float i = this.i;
        while (true) {
            Label_1302: {
                if (i < 0.14f) {
                    i = i * i / 0.14f;
                    if (r == 0) {
                        break Label_1302;
                    }
                }
                if (i < 0.2f || i >= 0.3f) {
                    break Label_1302;
                }
                final float n4 = 0.2f + (float)(Math.sqrt(i - 0.2f) * Math.sqrt(0.10000000894069672));
                int n5 = 255;
                float n6 = 1.0f;
                while (true) {
                    Label_1287: {
                        if (n4 < 0.14f) {
                            n5 = (int)(255.0f * n4 / 0.14f);
                            n6 = 0.86f + n4;
                            if (r == 0) {
                                break Label_1287;
                            }
                        }
                        if (n4 < 0.2f) {
                            break Label_1287;
                        }
                        final int n7 = (int)a(0.2f, 0.3f, n4, 255.0f, 150.0f);
                        final float n8 = n6;
                        int alpha = n7;
                        final float n9 = n8;
                        if (n4 > 0.9f) {
                            alpha = (int)a(0.9f, 1.0f, n4, alpha, 0.0f);
                        }
                        final float a = a(0.2f, 0.3f, n4, 0.0f, this.n.getIntrinsicWidth() / 8);
                        this.n.setAlpha(alpha);
                        final float n10 = n9 * this.n.getIntrinsicWidth() / 2.0f;
                        final float n11 = n9 * this.n.getIntrinsicHeight() / 2.0f;
                        this.n.setBounds(-(int)(n10 + a), -(int)n11, (int)(n10 - a), (int)n11);
                        this.n.draw(canvas);
                        if (n4 >= 0.2f) {
                            final float n12 = this.r.getIntrinsicWidth() / 2;
                            final float n13 = this.r.getIntrinsicHeight() / 2;
                            final float n14 = -n12 - a(0.2f, 0.3f, n4, width / 2, -n12 / 4.0f);
                            final float n15 = fcmpl(n4, 0.35f);
                            float n16 = 0.0f;
                            if (n15 > 0) {
                                final float n17 = fcmpg(n4, 0.5f);
                                n16 = 0.0f;
                                if (n17 < 0) {
                                    n16 = (float)(0.0f + Math.sin(a(0.35f, 0.5f, n4, 0.0f, 3.1415927f)) * n12 / 3.0);
                                }
                            }
                            this.r.setBounds(-(int)n12 - (int)n14, -(int)n13 + (int)n16, (int)n12 - (int)n14, (int)n13 + (int)n16);
                            int alpha2 = (int)a(0.9f, 1.0f, n4, 255.0f, 0.0f);
                            this.r.setAlpha(alpha2);
                            this.r.draw(canvas);
                            final int left = this.r.getBounds().left;
                            final int right = this.r.getBounds().right;
                            final int n18 = (right - left) / 7;
                            canvas.clipRect(left + n18, this.r.getBounds().top, right - n18, this.r.getBounds().bottom);
                            if (n4 > 0.2f) {
                                final float n19 = this.o.getIntrinsicWidth() / 2;
                                final float n20 = this.o.getIntrinsicHeight() / 2;
                                final float n21 = -n12 + n12 / 4.0f - a(0.2f, 0.3f, this.i, n12 / 8.0f, 0.0f);
                                float n22 = -n12 / 3.0f;
                                Label_0771: {
                                    if (n4 > 0.35f && n4 < 0.5f) {
                                        n22 = n12 * (float)Math.sin(-a(0.35f, 0.5f, n4, 1.5707964f, 3.1415927f)) / 3.0f;
                                        if (r == 0) {
                                            break Label_0771;
                                        }
                                    }
                                    if (n4 >= 0.5f) {
                                        n22 = 0.0f;
                                    }
                                }
                                this.o.setBounds(-(int)n19 - (int)n21, -(int)n20 + (int)n22, (int)n19 - (int)n21, (int)n20 + (int)n22);
                                this.k.setBounds(-(int)n19 - (int)n21, -(int)n20 + (int)n22, (int)n19 - (int)n21, (int)n20 + (int)n22);
                                int min2 = 0;
                                int alpha3 = 0;
                                Label_0979: {
                                    if (n4 > 0.9f) {
                                        min2 = Math.min(150, alpha2);
                                        alpha3 = 0;
                                        if (r == 0) {
                                            break Label_0979;
                                        }
                                    }
                                    if (n4 > 0.55f) {
                                        min2 = (int)a(0.55f, 0.6f, n4, 255.0f, 150.0f);
                                        alpha3 = 0;
                                        if (r == 0) {
                                            break Label_0979;
                                        }
                                    }
                                    if (n4 > 0.2f) {
                                        Label_0969: {
                                            if (n4 < 0.35f) {
                                                alpha3 = (int)a(0.2f, 0.35f, n4, 0.0f, 255.0f);
                                                min2 = 0;
                                                if (r == 0) {
                                                    break Label_0969;
                                                }
                                            }
                                            min2 = (int)a(0.35f, 0.5f, n4, 0.0f, 255.0f);
                                            alpha3 = (int)a(0.35f, 0.5f, n4, 255.0f, 0.0f);
                                        }
                                        if (r == 0) {
                                            break Label_0979;
                                        }
                                    }
                                    alpha3 = 0;
                                    min2 = 0;
                                }
                                this.o.setAlpha(min2);
                                this.k.setAlpha(alpha3);
                                this.o.draw(canvas);
                                this.k.draw(canvas);
                            }
                            final float n23 = this.c.getIntrinsicWidth() / 2;
                            final float n24 = this.c.getIntrinsicHeight() / 2;
                            this.c.setBounds(-(int)n23 - (int)n14, -(int)n24 + (int)n16, (int)n23 - (int)n14, (int)n24 + (int)n16);
                            this.c.setAlpha(alpha2);
                            this.c.draw(canvas);
                            if (n4 > 0.55f) {
                                final float n25 = this.b.getIntrinsicWidth() / 2;
                                final float n26 = this.b.getIntrinsicHeight() / 2;
                                final float n27 = -n12 + n12 / 4.0f;
                                int n28 = 255;
                                float n29 = 0.0f;
                                Label_1189: {
                                    if (n4 > 0.9f) {
                                        if (r == 0) {
                                            n29 = 1.0f;
                                            break Label_1189;
                                        }
                                        n28 = alpha2;
                                    }
                                    final float a2 = a(0.55f, 0.6f, n4, 0.0f, 1.0f);
                                    final float n30 = 1.0f - (1.0f - a2) * (1.0f - a2);
                                    alpha2 = n28;
                                    n29 = n30;
                                }
                                this.b.setAlpha(alpha2);
                                this.b.setBounds(-(int)(n25 * n29) - (int)n27, -(int)(n26 * n29) + (int)0.0f, (int)(n25 * n29) - (int)n27, (int)(n29 * n26) + (int)0.0f);
                                this.b.draw(canvas);
                            }
                        }
                        canvas.translate((float)(-width / 2), (float)(-height / 2));
                        if (DialogToastActivity.h) {
                            QrCodeActivity.r = r + 1;
                        }
                        return;
                    }
                    final float n31 = n6;
                    int alpha = n5;
                    final float n9 = n31;
                    continue;
                }
            }
            final float n4 = i;
            continue;
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int min = Math.min(getDefaultSize(this.getSuggestedMinimumWidth(), n), getDefaultSize(this.getSuggestedMinimumHeight(), n2));
        this.setMeasuredDimension(min, min);
    }
    
    protected void onVisibilityChanged(final View view, final int n) {
        if (this.getVisibility() == 0) {
            if (this.getAnimation() != null || this.e == null) {
                return;
            }
            this.startAnimation((Animation)this.e);
            if (QrCodeActivity.r == 0) {
                return;
            }
        }
        this.clearAnimation();
    }
}
