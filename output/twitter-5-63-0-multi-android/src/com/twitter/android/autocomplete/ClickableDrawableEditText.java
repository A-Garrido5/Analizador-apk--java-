// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.autocomplete;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;

public class ClickableDrawableEditText extends EditText
{
    private int a;
    
    public ClickableDrawableEditText(final Context context) {
        this(context, null);
    }
    
    public ClickableDrawableEditText(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ClickableDrawableEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = -1;
    }
    
    protected boolean a(final int n) {
        return false;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        int n2 = 0;
        Label_0042: {
            switch (0xFF & motionEvent.getAction()) {
                case 0: {
                    final Drawable[] compoundDrawables = this.getCompoundDrawables();
                    final int n = (int)motionEvent.getX();
                    final int paddingLeft = this.getPaddingLeft();
                    final int paddingRight = this.getPaddingRight();
                    final int compoundPaddingLeft = this.getCompoundPaddingLeft();
                    final int compoundPaddingRight = this.getCompoundPaddingRight();
                    final int width = this.getWidth();
                    for (int i = 0; i < compoundDrawables.length; ++i) {
                        final Drawable drawable = compoundDrawables[i];
                        if (drawable != null) {
                            if (i == 0) {
                                if (n <= compoundPaddingLeft + (paddingLeft + drawable.getBounds().width())) {
                                    this.a = 0;
                                    break;
                                }
                            }
                            else if (i == 2 && n >= width - paddingRight - drawable.getBounds().width() - compoundPaddingRight) {
                                this.a = 2;
                                break;
                            }
                        }
                    }
                    n2 = 0;
                    break Label_0042;
                }
                case 1: {
                    if (this.a != -1) {
                        final int n3 = (int)motionEvent.getX();
                        final int n4 = (int)motionEvent.getY();
                        final Drawable drawable2 = this.getCompoundDrawables()[this.a];
                        boolean b;
                        if (n4 < this.getHeight() && n4 > 0) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        boolean b2 = false;
                        switch (this.a) {
                            default: {
                                b2 = false;
                                break;
                            }
                            case 0: {
                                if (n3 <= this.getPaddingLeft() + drawable2.getBounds().width() + this.getCompoundPaddingLeft()) {
                                    b2 = true;
                                    break;
                                }
                                b2 = false;
                                break;
                            }
                            case 2: {
                                if (n3 >= this.getWidth() - this.getPaddingRight() - drawable2.getBounds().width() - this.getCompoundPaddingRight()) {
                                    b2 = true;
                                    break;
                                }
                                b2 = false;
                                break;
                            }
                        }
                        if (b && b2 && this.a(this.a)) {
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                        this.a = -1;
                        break Label_0042;
                    }
                    break;
                }
                case 3: {
                    this.a = -1;
                    n2 = 0;
                    break Label_0042;
                }
            }
            n2 = 0;
        }
        if (n2 == 0) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            final boolean b3 = false;
            if (!onTouchEvent) {
                return b3;
            }
        }
        return true;
    }
}
