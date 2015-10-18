// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import android.content.Context;
import android.util.TypedValue;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
    private final Rect mDecorPadding;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;
    
    public ContentFrameLayout(final Context context) {
        this(context, null);
    }
    
    public ContentFrameLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ContentFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mDecorPadding = new Rect();
    }
    
    public void dispatchFitSystemWindows(final Rect rect) {
        this.fitSystemWindows(rect);
    }
    
    public TypedValue getFixedHeightMajor() {
        if (this.mFixedHeightMajor == null) {
            this.mFixedHeightMajor = new TypedValue();
        }
        return this.mFixedHeightMajor;
    }
    
    public TypedValue getFixedHeightMinor() {
        if (this.mFixedHeightMinor == null) {
            this.mFixedHeightMinor = new TypedValue();
        }
        return this.mFixedHeightMinor;
    }
    
    public TypedValue getFixedWidthMajor() {
        if (this.mFixedWidthMajor == null) {
            this.mFixedWidthMajor = new TypedValue();
        }
        return this.mFixedWidthMajor;
    }
    
    public TypedValue getFixedWidthMinor() {
        if (this.mFixedWidthMinor == null) {
            this.mFixedWidthMinor = new TypedValue();
        }
        return this.mFixedWidthMinor;
    }
    
    public TypedValue getMinWidthMajor() {
        if (this.mMinWidthMajor == null) {
            this.mMinWidthMajor = new TypedValue();
        }
        return this.mMinWidthMajor;
    }
    
    public TypedValue getMinWidthMinor() {
        if (this.mMinWidthMinor == null) {
            this.mMinWidthMinor = new TypedValue();
        }
        return this.mMinWidthMinor;
    }
    
    protected void onMeasure(int measureSpec, int measureSpec2) {
        final int a = AdapterViewCompat.a;
        final DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
        boolean b;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            b = true;
        }
        else {
            b = false;
        }
        final int mode = View$MeasureSpec.getMode(measureSpec);
        final int mode2 = View$MeasureSpec.getMode(measureSpec2);
        while (true) {
            Label_0518: {
                if (mode != Integer.MIN_VALUE) {
                    break Label_0518;
                }
                TypedValue typedValue;
                if (b) {
                    typedValue = this.mFixedWidthMinor;
                }
                else {
                    typedValue = this.mFixedWidthMajor;
                }
                if (typedValue == null || typedValue.type == 0) {
                    break Label_0518;
                }
                final int type = typedValue.type;
                int n = 0;
                Label_0135: {
                    if (type == 5) {
                        n = (int)typedValue.getDimension(displayMetrics);
                        if (a == 0) {
                            break Label_0135;
                        }
                    }
                    if (typedValue.type == 6) {
                        n = (int)typedValue.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
                    }
                }
                if (n <= 0) {
                    break Label_0518;
                }
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(n - (this.mDecorPadding.left + this.mDecorPadding.right), View$MeasureSpec.getSize(measureSpec)), 1073741824);
                final int n2 = 1;
                if (mode2 == Integer.MIN_VALUE) {
                    TypedValue typedValue2;
                    if (b) {
                        typedValue2 = this.mFixedHeightMajor;
                    }
                    else {
                        typedValue2 = this.mFixedHeightMinor;
                    }
                    if (typedValue2 != null && typedValue2.type != 0) {
                        final int type2 = typedValue2.type;
                        int n3 = 0;
                        Label_0265: {
                            if (type2 == 5) {
                                n3 = (int)typedValue2.getDimension(displayMetrics);
                                if (a == 0) {
                                    break Label_0265;
                                }
                            }
                            if (typedValue2.type == 6) {
                                n3 = (int)typedValue2.getFraction((float)displayMetrics.heightPixels, (float)displayMetrics.heightPixels);
                            }
                        }
                        if (n3 > 0) {
                            measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.min(n3 - (this.mDecorPadding.top + this.mDecorPadding.bottom), View$MeasureSpec.getSize(measureSpec2)), 1073741824);
                        }
                    }
                }
                super.onMeasure(measureSpec, measureSpec2);
                final int measuredWidth = this.getMeasuredWidth();
                final int measureSpec3 = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                while (true) {
                    Label_0508: {
                        if (n2 != 0 || mode != Integer.MIN_VALUE) {
                            break Label_0508;
                        }
                        TypedValue typedValue3;
                        if (b) {
                            typedValue3 = this.mMinWidthMinor;
                        }
                        else {
                            typedValue3 = this.mMinWidthMajor;
                        }
                        if (typedValue3 == null || typedValue3.type == 0) {
                            break Label_0508;
                        }
                        final int type3 = typedValue3.type;
                        int n4 = 0;
                        Label_0418: {
                            if (type3 == 5) {
                                n4 = (int)typedValue3.getDimension(displayMetrics);
                                if (a == 0) {
                                    break Label_0418;
                                }
                            }
                            if (typedValue3.type == 6) {
                                n4 = (int)typedValue3.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
                            }
                        }
                        if (n4 > 0) {
                            n4 -= this.mDecorPadding.left + this.mDecorPadding.right;
                        }
                        if (measuredWidth >= n4) {
                            break Label_0508;
                        }
                        final int measureSpec4 = View$MeasureSpec.makeMeasureSpec(n4, 1073741824);
                        final int n5 = 1;
                        if (n5 != 0) {
                            super.onMeasure(measureSpec4, measureSpec2);
                        }
                        return;
                    }
                    final int measureSpec4 = measureSpec3;
                    final int n5 = 0;
                    continue;
                }
            }
            final int n2 = 0;
            continue;
        }
    }
    
    public void setDecorPadding(final int n, final int n2, final int n3, final int n4) {
        this.mDecorPadding.set(n, n2, n3, n4);
        if (ViewCompat.isLaidOut((View)this)) {
            this.requestLayout();
        }
    }
}
