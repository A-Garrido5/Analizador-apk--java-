// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.whatsapp.PhotoView;
import com.whatsapp.util.Log;
import com.whatsapp.vc;
import android.graphics.Rect;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class bg implements ViewTreeObserver$OnGlobalLayoutListener
{
    private static final String z;
    final ImagePreview a;
    
    static {
        final char[] charArray = "\"E\r\u0013U;Z\t\u0002Y._C\u001fR/w\u001f\u001c_<FL".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '0';
                    break;
                }
                case 0: {
                    c2 = 'K';
                    break;
                }
                case 1: {
                    c2 = '(';
                    break;
                }
                case 2: {
                    c2 = 'l';
                    break;
                }
                case 3: {
                    c2 = 't';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bg(final ImagePreview a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        final int v = MediaGalleryBase.v;
        if (ImagePreview.r(this.a) != null) {
            final Rect rect = new Rect();
            ImagePreview.r(this.a).getWindowVisibleDisplayFrame(rect);
            final boolean b = ImagePreview.r(this.a).getRootView().getHeight() - (rect.bottom - rect.top) > 128.0f * vc.b().b;
            if (b != ImagePreview.o(this.a)) {
                ImagePreview.a(this.a, b);
                Log.i(bg.z + b);
                int n;
                for (int childCount = ImagePreview.b(this.a).getChildCount(), i = 0; i < childCount; i = n) {
                    final View child = ImagePreview.b(this.a).getChildAt(i);
                    final View viewById = child.findViewById(2131755647);
                    if (viewById != null) {
                        int visibility;
                        if (b) {
                            visibility = 0;
                        }
                        else {
                            visibility = 8;
                        }
                        viewById.setVisibility(visibility);
                    }
                    final PhotoView photoView = (PhotoView)child.findViewById(2131755327);
                    if (photoView != null) {
                        int c;
                        if (b) {
                            c = ImagePreview.c(this.a);
                        }
                        else {
                            c = 0;
                        }
                        photoView.setHeightForInitialScaleCalculation(c);
                    }
                    n = i + 1;
                    if (v != 0) {
                        break;
                    }
                }
                final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                ((Animation)alphaAnimation).setInterpolator((Interpolator)new DecelerateInterpolator());
                ((Animation)alphaAnimation).setDuration((long)this.a.getResources().getInteger(17694721));
                Label_0376: {
                    if (b) {
                        this.a.findViewById(2131755624).setVisibility(8);
                        this.a.findViewById(2131755443).setVisibility(8);
                        if (v == 0) {
                            break Label_0376;
                        }
                    }
                    this.a.findViewById(2131755624).setVisibility(0);
                    this.a.findViewById(2131755443).setVisibility(0);
                    ImagePreview.v(this.a).dismiss();
                    this.a.findViewById(2131755624).startAnimation((Animation)alphaAnimation);
                    this.a.findViewById(2131755443).startAnimation((Animation)alphaAnimation);
                }
                ImagePreview.b(this.a).startAnimation((Animation)alphaAnimation);
            }
            if (!b) {
                ImagePreview.b(this.a, ImagePreview.b(this.a).getHeight());
            }
        }
    }
}
