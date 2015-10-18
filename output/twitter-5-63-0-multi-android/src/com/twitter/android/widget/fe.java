// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnTouchListener;

public class fe implements View$OnTouchListener
{
    private TextView a;
    private ff b;
    private int c;
    
    public fe(final TextView a, final ff b) {
        this.c = -1;
        this.a = a;
        this.b = b;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        int n = 1;
        if (this.a != null && this.b != null) {
            final int n2 = 0xFF & motionEvent.getAction();
            final Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            final int paddingLeft = this.a.getPaddingLeft();
            final int paddingRight = this.a.getPaddingRight();
            final int compoundPaddingLeft = this.a.getCompoundPaddingLeft();
            final int compoundPaddingRight = this.a.getCompoundPaddingRight();
            final int width = this.a.getWidth();
            final int height = this.a.getHeight();
            switch (n2) {
                default: {
                    return false;
                }
                case 0: {
                    final int n3 = (int)motionEvent.getX();
                    for (int i = 0; i < compoundDrawables.length; ++i) {
                        final Drawable drawable = compoundDrawables[i];
                        if (drawable != null) {
                            if (i == 0) {
                                if (n3 <= compoundPaddingLeft + (paddingLeft + drawable.getBounds().width())) {
                                    this.c = 0;
                                    return false;
                                }
                            }
                            else if (i == 2 && n3 >= width - paddingRight - drawable.getBounds().width() - compoundPaddingRight) {
                                this.c = 2;
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 1: {
                    if (this.c != -1) {
                        final int n4 = (int)motionEvent.getX();
                        final int n5 = (int)motionEvent.getY();
                        final Drawable drawable2 = compoundDrawables[this.c];
                        int n6;
                        if (n5 < height && n5 > 0) {
                            n6 = n;
                        }
                        else {
                            n6 = 0;
                        }
                        switch (this.c) {
                            default: {
                                n = 0;
                                break;
                            }
                            case 0: {
                                if (n4 > compoundPaddingLeft + (paddingLeft + drawable2.getBounds().width())) {
                                    n = 0;
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                if (n4 < width - paddingRight - drawable2.getBounds().width() - compoundPaddingRight) {
                                    n = 0;
                                    break;
                                }
                                break;
                            }
                        }
                        boolean a = false;
                        if (n6 != 0) {
                            a = false;
                            if (n != 0) {
                                a = this.b.a(this.c);
                            }
                        }
                        this.c = -1;
                        return a;
                    }
                    break;
                }
                case 3: {
                    this.c = -1;
                    return false;
                }
            }
        }
        return false;
    }
}
