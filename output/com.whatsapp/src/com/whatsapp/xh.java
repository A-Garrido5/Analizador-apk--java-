// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.whatsapp.util.ClippingLayout;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnTouchListener;

class xh implements View$OnTouchListener
{
    final TextView a;
    final View b;
    final View c;
    private final Rect d;
    final ClippingLayout e;
    final TextView f;
    private float g;
    final ps h;
    
    xh(final ps h, final TextView a, final TextView f, final View c, final View b, final ClippingLayout e) {
        this.h = h;
        this.a = a;
        this.f = f;
        this.c = c;
        this.b = b;
        this.e = e;
        this.g = 0.0f;
        this.d = new Rect();
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean i = App.I;
        switch (motionEvent.getAction()) {
            default: {
                return false;
            }
            case 0: {
                if (!TextUtils.isEmpty((CharSequence)this.a.getText().toString().trim())) {
                    return false;
                }
                this.h.a();
                this.g = motionEvent.getX();
                final TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 0, 0.0f);
                ((Animation)translateAnimation).setDuration(0L);
                ((Animation)translateAnimation).setFillBefore(true);
                ((Animation)translateAnimation).setFillAfter(true);
                this.f.startAnimation((Animation)translateAnimation);
                ps.b(this.h, 0.0f);
                return false;
            }
            case 1:
            case 3: {
                if (!TextUtils.isEmpty((CharSequence)this.a.getText().toString().trim())) {
                    this.h.b(false);
                    this.c.playSoundEffect(0);
                    this.h.h();
                    if (!i) {
                        return false;
                    }
                }
                this.h.b(true);
                return false;
            }
            case 2: {
                final float abs = Math.abs(motionEvent.getX() / this.a.getWidth());
                Label_0271: {
                    if (abs > 0.5f) {
                        this.h.b(false);
                        if (!i) {
                            break Label_0271;
                        }
                    }
                    if (abs > 0.1f) {
                        ps.a(this.h, Math.max(0.0f, 1.1f - abs * 2.0f));
                        if (!i) {
                            break Label_0271;
                        }
                    }
                    ps.a(this.h, 1.0f);
                }
                if (this.h.i() && 160L + ps.k(this.h) < System.currentTimeMillis()) {
                    Label_0437: {
                        if (App.ak()) {
                            ps.b(this.h, -Math.max(0.0f, this.g - motionEvent.getX()));
                            this.d.set(0, 0, this.b.getWidth() + (int)ps.b(this.h), this.e.getHeight());
                            this.e.setClipBounds(this.d);
                            if (!i) {
                                break Label_0437;
                            }
                        }
                        ps.b(this.h, -Math.min(0.0f, this.g - motionEvent.getX()));
                        this.d.set((int)ps.b(this.h), 0, this.e.getWidth(), this.e.getHeight());
                        this.e.setClipBounds(this.d);
                    }
                    final int n = ps.a(this.h).getWidth() / 4;
                    int n2;
                    if (App.W) {
                        n2 = -n;
                    }
                    else {
                        n2 = n;
                    }
                    Label_0574: {
                        if (Build$VERSION.SDK_INT < 11) {
                            final TranslateAnimation translateAnimation2 = new TranslateAnimation(0, ps.b(this.h) + n2, 0, ps.b(this.h) + n2, 1, 0.25f, 1, 0.25f);
                            ((Animation)translateAnimation2).setDuration(0L);
                            ((Animation)translateAnimation2).setFillBefore(true);
                            ((Animation)translateAnimation2).setFillAfter(true);
                            ps.a(this.h).clearAnimation();
                            ps.a(this.h).startAnimation((Animation)translateAnimation2);
                            if (!i) {
                                break Label_0574;
                            }
                        }
                        ps.a(this.h).setTranslationX(ps.b(this.h) + n2);
                    }
                    final TranslateAnimation translateAnimation3 = new TranslateAnimation(0, ps.b(this.h), 0, ps.b(this.h), 0, 0.0f, 0, 0.0f);
                    ((Animation)translateAnimation3).setDuration(0L);
                    ((Animation)translateAnimation3).setFillBefore(true);
                    ((Animation)translateAnimation3).setFillAfter(true);
                    this.f.clearAnimation();
                    this.f.startAnimation((Animation)translateAnimation3);
                }
                return false;
            }
        }
    }
}
