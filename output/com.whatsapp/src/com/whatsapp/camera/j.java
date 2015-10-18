// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.whatsapp.util.Log;
import com.whatsapp.vc;
import android.graphics.Rect;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class j implements ViewTreeObserver$OnGlobalLayoutListener
{
    private static final String z;
    final CameraActivity a;
    boolean b;
    
    static {
        final char[] charArray = "\u001b\u0001F7b\u0019\u0001H&y\u000e\t_+?\u0013\u0002O\rc\u0010\u000f\\<0".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0010';
                    break;
                }
                case 0: {
                    c2 = 'x';
                    break;
                }
                case 1: {
                    c2 = '`';
                    break;
                }
                case 2: {
                    c2 = '+';
                    break;
                }
                case 3: {
                    c2 = 'R';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    j(final CameraActivity a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        final boolean m = CameraActivity.m;
        if (CameraActivity.h(this.a) != null) {
            int n = 0;
            Label_0117: {
                if ((0x100 & this.a.getWindow().getAttributes().flags) != 0x0) {
                    final Rect rect = new Rect();
                    CameraActivity.h(this.a).getRootView().getWindowVisibleDisplayFrame(rect);
                    n = CameraActivity.h(this.a).getRootView().getRootView().getHeight() - (rect.bottom - rect.top);
                    if (!m) {
                        break Label_0117;
                    }
                }
                n = this.a.getWindowManager().getDefaultDisplay().getHeight() - CameraActivity.h(this.a).getRootView().getHeight();
            }
            final boolean b = n > 128.0f * vc.b().b;
            Label_0463: {
                if (this.b != b) {
                    Log.i(j.z + b);
                    this.b = b;
                    final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    ((Animation)alphaAnimation).setDuration((long)this.a.getResources().getInteger(17694721));
                    if (b) {
                        ((Animation)alphaAnimation).setInterpolator((Interpolator)new DecelerateInterpolator());
                        this.a.findViewById(2131755647).setVisibility(0);
                        this.a.findViewById(2131755337).setVisibility(8);
                        this.a.findViewById(2131755303).setVisibility(8);
                        this.a.findViewById(2131755336).setVisibility(8);
                        this.a.findViewById(2131755331).setVisibility(8);
                        this.a.findViewById(2131755327).startAnimation((Animation)alphaAnimation);
                        this.a.findViewById(2131755335).startAnimation((Animation)alphaAnimation);
                        if (!m) {
                            break Label_0463;
                        }
                    }
                    this.a.findViewById(2131755327).startAnimation((Animation)alphaAnimation);
                    this.a.findViewById(2131755647).setVisibility(8);
                    this.a.findViewById(2131755337).setVisibility(0);
                    this.a.findViewById(2131755303).setVisibility(0);
                    this.a.findViewById(2131755337).startAnimation((Animation)alphaAnimation);
                    this.a.findViewById(2131755303).startAnimation((Animation)alphaAnimation);
                    this.a.findViewById(2131755336).setVisibility(0);
                    this.a.findViewById(2131755331).setVisibility(0);
                    this.a.findViewById(2131755331).startAnimation((Animation)alphaAnimation);
                    CameraActivity.k(this.a).dismiss();
                    CameraActivity.i(this.a).clearFocus();
                }
            }
            if (!b && CameraActivity.d(this.a) != null) {
                CameraActivity.d(this.a).setHeightForInitialScaleCalculation(CameraActivity.h(this.a).getHeight());
            }
        }
    }
}
