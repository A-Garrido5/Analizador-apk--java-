// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.widget;

import android.graphics.drawable.Drawable$Callback;
import java.util.Arrays;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.content.res.Resources;
import com.twitter.util.b;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.text.TextPaint;
import android.text.Layout;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.widget.EditText;

public class TwitterEditText extends EditText
{
    private static final int[] a;
    private static final int[] b;
    private static final int[] c;
    private static final ColorStateList d;
    private int[] A;
    private Drawable B;
    private boolean C;
    private xw D;
    private int e;
    private ad f;
    private boolean g;
    private boolean h;
    private Layout i;
    private CharSequence j;
    private int k;
    private ColorStateList l;
    private final TextPaint m;
    private int n;
    private Layout o;
    private final TextPaint p;
    private ColorStateList q;
    private CharSequence r;
    private CharSequence s;
    private int t;
    private int u;
    private ColorStateList v;
    private boolean w;
    private int x;
    private String y;
    private String z;
    
    static {
        a = new int[] { jk.state_error, jk.state_fault };
        b = new int[] { jk.state_fault };
        c = new int[] { jk.state_error };
        d = ColorStateList.valueOf(0);
    }
    
    public TwitterEditText(final Context context) {
        this(context, null);
    }
    
    public TwitterEditText(final Context context, final AttributeSet set) {
        this(context, set, 16842862);
    }
    
    public TwitterEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.l = TwitterEditText.d;
        this.m = new TextPaint();
        this.p = new TextPaint();
        this.q = TwitterEditText.d;
        this.v = TwitterEditText.d;
        this.y = "";
        this.z = "";
        this.a(context, set, n, 0);
    }
    
    public TwitterEditText(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.l = TwitterEditText.d;
        this.m = new TextPaint();
        this.p = new TextPaint();
        this.q = TwitterEditText.d;
        this.v = TwitterEditText.d;
        this.y = "";
        this.z = "";
        this.a(context, set, n, n2);
    }
    
    private void a() {
        if (!this.g) {
            return;
        }
        this.n = this.l.getColorForState(this.getDrawableState(), 0);
        this.x = this.v.getColorForState(this.getDrawableState(), 0);
        this.t = this.q.getColorForState(this.getDrawableState(), 0);
        this.invalidate();
    }
    
    private void a(final int n) {
        final int n2 = n - this.getPaddingLeft() - this.getPaddingRight();
        if (!TextUtils.isEmpty(this.j) && (this.i == null || this.i.getWidth() != n)) {
            this.i = (Layout)new StaticLayout(this.j, this.m, n2, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        final CharSequence messageToDisplay = this.getMessageToDisplay();
        if (!TextUtils.isEmpty(messageToDisplay)) {
            int n3;
            if (this.k != 0) {
                n3 = (int)(n2 - Math.ceil(this.p.measureText(Integer.toString(this.u)) * 3.0f));
            }
            else {
                n3 = n2;
            }
            if (this.o == null || this.o.getWidth() != n2) {
                this.o = (Layout)new StaticLayout(messageToDisplay, this.p, n3, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        }
    }
    
    private void a(final Context context, final TypedArray typedArray) {
        final ag a = ag.a(context);
        final int int1 = typedArray.getInt(jt.TwitterEditText_labelStyle, 0);
        final int dimensionPixelSize = typedArray.getDimensionPixelSize(jt.TwitterEditText_labelSize, 0);
        this.m.setAntiAlias(true);
        this.m.setTypeface(a.b(int1));
        this.m.setTextSize((float)dimensionPixelSize);
        final int int2 = typedArray.getInt(jt.TwitterEditText_messageStyle, 0);
        final int dimensionPixelSize2 = typedArray.getDimensionPixelSize(jt.TwitterEditText_messageSize, 0);
        this.p.setAntiAlias(true);
        this.p.setTypeface(a.b(int2));
        this.p.setTextSize((float)dimensionPixelSize2);
    }
    
    private boolean a(final MotionEvent motionEvent) {
        if (this.B != null && this.f != null) {
            if (this.h) {
                if (motionEvent.getX() > this.getPaddingLeft() + this.B.getBounds().width()) {
                    return false;
                }
            }
            else if (motionEvent.getX() < this.getWidth() - this.getPaddingRight() - this.B.getBounds().width()) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    private void b() {
        final boolean w = this.k != 0 && this.u > 0 && this.getText().length() > this.u;
        if (w != this.w) {
            this.w = w;
            this.refreshDrawableState();
        }
    }
    
    private String getCharacterCounterText() {
        if (this.k == 0) {
            return "";
        }
        final int u = this.u;
        final int length = this.getText().length();
        switch (this.k) {
            default: {
                return "";
            }
            case 1: {
                return String.format(this.y, length, u);
            }
            case 2: {
                return String.format(this.z, u - length);
            }
        }
    }
    
    private int getLabelHeight() {
        if (this.i != null) {
            return this.i.getLineTop(this.i.getLineCount());
        }
        return 0;
    }
    
    private int getMessageHeight() {
        if (this.o != null) {
            return this.o.getLineTop(this.o.getLineCount());
        }
        if (this.k != 0) {
            return (int)(this.p.descent() - this.p.ascent());
        }
        return 0;
    }
    
    private CharSequence getMessageToDisplay() {
        if (this.s != null) {
            return this.s;
        }
        return this.r;
    }
    
    private int getUnderLineHeight() {
        if (this.D != null) {
            return this.D.getBounds().height();
        }
        return 0;
    }
    
    protected void a(final Context context, final AttributeSet set, final int n, final int n2) {
        this.h = com.twitter.util.b.a(context);
        final Resources resources = this.getResources();
        this.e = (int)resources.getDimension(jm.twitter_edit_text_divider_padding);
        this.y = resources.getString(jr.twitter_edit_text_counter_format_normal);
        this.z = resources.getString(jr.twitter_edit_text_counter_format_countdown);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, jt.TwitterEditText, n, n2);
        this.a(context, obtainStyledAttributes);
        this.j = obtainStyledAttributes.getText(jt.TwitterEditText_labelText);
        ColorStateList labelColor = obtainStyledAttributes.getColorStateList(jt.TwitterEditText_labelColor);
        if (labelColor == null) {
            labelColor = TwitterEditText.d;
        }
        this.setLabelColor(labelColor);
        this.setStatusIcon(obtainStyledAttributes.getDrawable(jt.TwitterEditText_statusIcon));
        this.setUnderlineColor(obtainStyledAttributes.getColorStateList(jt.TwitterEditText_underlineColor));
        this.r = obtainStyledAttributes.getText(jt.TwitterEditText_helperMessage);
        ColorStateList messageColor = obtainStyledAttributes.getColorStateList(jt.TwitterEditText_messageColor);
        if (messageColor == null) {
            messageColor = TwitterEditText.d;
        }
        this.setMessageColor(messageColor);
        this.u = obtainStyledAttributes.getInteger(jt.TwitterEditText_maxCharacterCount, 0);
        this.k = obtainStyledAttributes.getInt(jt.TwitterEditText_characterCounterMode, 0);
        ColorStateList counterColor = obtainStyledAttributes.getColorStateList(jt.TwitterEditText_characterCounterColor);
        if (counterColor == null) {
            counterColor = TwitterEditText.d;
        }
        this.setCounterColor(counterColor);
        obtainStyledAttributes.recycle();
        this.b();
        this.g = true;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a();
        if (this.D != null) {
            this.D.setState(this.getDrawableState());
        }
    }
    
    public void e() {
        this.setError(null);
    }
    
    public int getCharacterCounterMode() {
        return this.k;
    }
    
    public int getCompoundPaddingBottom() {
        return super.getCompoundPaddingBottom() + this.getMessageHeight() + this.getUnderLineHeight();
    }
    
    public int getCompoundPaddingTop() {
        return super.getCompoundPaddingTop() + this.getLabelHeight();
    }
    
    public CharSequence getError() {
        return this.s;
    }
    
    public CharSequence getHelperMessage() {
        return this.r;
    }
    
    public CharSequence getLabelText() {
        return this.j;
    }
    
    public int getMaxCharacterCouter() {
        return this.u;
    }
    
    public void invalidateDrawable(final Drawable drawable) {
        if (drawable != this.D) {
            super.invalidateDrawable(drawable);
            return;
        }
        final Rect bounds = drawable.getBounds();
        final int n = this.getScrollX() + this.getPaddingLeft();
        final int n2 = this.getScrollY() + this.getHeight() - this.getCompoundPaddingBottom();
        this.invalidate(n + bounds.left, n2 + bounds.top, n + bounds.right, n2 + bounds.bottom);
    }
    
    protected int[] onCreateDrawableState(final int n) {
        int n2;
        int[] array;
        if (this.w) {
            n2 = 1;
            array = TwitterEditText.b;
        }
        else {
            array = null;
            n2 = 0;
        }
        if (!TextUtils.isEmpty(this.s)) {
            ++n2;
            if (array == null) {
                array = TwitterEditText.c;
            }
            else {
                array = TwitterEditText.a;
            }
        }
        final int[] a = this.A;
        int length = 0;
        if (a != null) {
            length = this.A.length;
        }
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + (n2 + length));
        if (array != null) {
            mergeDrawableStates(onCreateDrawableState, array);
        }
        if (this.A != null) {
            mergeDrawableStates(onCreateDrawableState, this.A);
        }
        return onCreateDrawableState;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate((float)this.getScrollX(), (float)this.getScrollY());
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        if (this.i != null) {
            this.m.setColor(this.n);
            canvas.save();
            canvas.translate((float)paddingLeft, (float)this.getPaddingTop());
            this.i.draw(canvas);
            canvas.restore();
        }
        if (this.D != null) {
            canvas.save();
            canvas.translate((float)paddingLeft, (float)(height - this.getCompoundPaddingBottom()));
            this.D.draw(canvas);
            canvas.restore();
        }
        final float n = height - this.getPaddingBottom() - this.getMessageHeight();
        if (this.o != null) {
            canvas.save();
            canvas.translate((float)paddingLeft, n);
            this.p.setColor(this.t);
            if (this.h) {
                canvas.translate((float)(width - paddingLeft - paddingRight - this.o.getWidth()), 0.0f);
            }
            this.o.draw(canvas);
            canvas.restore();
        }
        final String characterCounterText = this.getCharacterCounterText();
        if (!TextUtils.isEmpty((CharSequence)characterCounterText)) {
            final int n2 = width - this.getPaddingRight();
            this.p.setColor(this.x);
            float n3;
            if (this.h) {
                n3 = paddingLeft;
            }
            else {
                n3 = n2 - this.p.measureText(characterCounterText);
            }
            canvas.drawText(characterCounterText, n3, n - this.p.ascent(), (Paint)this.p);
        }
        canvas.restore();
    }
    
    protected void onMeasure(int measureSpec, final int n) {
        final int mode = View$MeasureSpec.getMode(measureSpec);
        final int size = View$MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            measureSpec = View$MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        this.a(size);
        super.onMeasure(measureSpec, n);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof TwitterEditText$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final TwitterEditText$SavedState twitterEditText$SavedState = (TwitterEditText$SavedState)parcelable;
        super.onRestoreInstanceState(twitterEditText$SavedState.getSuperState());
        this.setError(twitterEditText$SavedState.a);
    }
    
    public Parcelable onSaveInstanceState() {
        final Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (TextUtils.isEmpty(this.s)) {
            return onSaveInstanceState;
        }
        final TwitterEditText$SavedState twitterEditText$SavedState = new TwitterEditText$SavedState(onSaveInstanceState);
        twitterEditText$SavedState.a = this.s;
        return (Parcelable)twitterEditText$SavedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (this.D != null && (n != n3 || n2 != n4)) {
            this.D.setBounds(0, 0, n - this.getPaddingLeft() - this.getPaddingRight(), 2 * this.e);
        }
    }
    
    protected void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        this.b();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        int n = 0;
        Label_0038: {
            switch (motionEvent.getActionMasked()) {
                case 0: {
                    this.C = this.a(motionEvent);
                    if (this.D != null) {
                        this.D.a((int)motionEvent.getX());
                        n = 0;
                        break Label_0038;
                    }
                    break;
                }
                case 1: {
                    if (this.C && this.f != null) {
                        if (this.a(motionEvent) && this.f.a(this)) {
                            n = 1;
                        }
                        else {
                            n = 0;
                        }
                    }
                    else {
                        n = 0;
                    }
                    this.C = false;
                    break Label_0038;
                }
                case 3: {
                    this.C = false;
                    n = 0;
                    break Label_0038;
                }
            }
            n = 0;
        }
        if (n == 0) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            final boolean b = false;
            if (!onTouchEvent) {
                return b;
            }
        }
        return true;
    }
    
    public void setCharacterCounterMode(final int k) {
        if (this.k != k) {
            this.k = k;
            this.b();
            this.refreshDrawableState();
        }
    }
    
    public void setCounterColor(final ColorStateList v) {
        this.v = v;
        this.a();
    }
    
    public void setError(final int n) {
        this.setError(this.getContext().getResources().getText(n), null);
    }
    
    public void setError(final CharSequence charSequence) {
        this.setError(charSequence, null);
    }
    
    public void setError(final CharSequence s, final Drawable statusIcon) {
        if (!TextUtils.equals(this.s, s)) {
            this.s = s;
            this.o = null;
            this.refreshDrawableState();
            if (statusIcon != null) {
                this.setStatusIcon(statusIcon);
            }
            this.requestLayout();
        }
    }
    
    public void setExtraState(final int[] a) {
        if (!Arrays.equals(this.A, a)) {
            this.A = a;
            this.refreshDrawableState();
        }
    }
    
    public void setHelperMessage(final int n) {
        this.setHelperMessage(this.getContext().getResources().getText(n));
    }
    
    public void setHelperMessage(final CharSequence r) {
        if (!TextUtils.equals(this.r, r)) {
            this.r = r;
            this.o = null;
            this.requestLayout();
        }
    }
    
    public void setLabelColor(final ColorStateList l) {
        this.l = l;
        this.a();
    }
    
    public void setLabelText(final int n) {
        this.setLabelText(this.getContext().getResources().getText(n));
    }
    
    public void setLabelText(final CharSequence j) {
        if (!TextUtils.equals(this.j, j)) {
            this.j = j;
            this.i = null;
            this.requestLayout();
        }
    }
    
    public void setMaxCharacterCount(final int u) {
        if (this.u != u) {
            this.u = u;
            final boolean w = this.w;
            this.b();
            if (w != this.w) {
                this.refreshDrawableState();
            }
        }
    }
    
    public final void setMessageColor(final ColorStateList q) {
        this.q = q;
        this.a();
    }
    
    public void setOnStatusIconClickListener(final ad f) {
        this.f = f;
    }
    
    public void setStatusIcon(final Drawable b) {
        if (this.B != b) {
            this.B = b;
            if (!this.h) {
                super.setCompoundDrawablesWithIntrinsicBounds((Drawable)null, (Drawable)null, this.B, (Drawable)null);
                return;
            }
            super.setCompoundDrawablesWithIntrinsicBounds(this.B, (Drawable)null, (Drawable)null, (Drawable)null);
        }
    }
    
    public void setUnderlineColor(final ColorStateList list) {
        xw d;
        if (list != null) {
            d = new xw(this.getContext(), list);
            d.setBounds(0, 0, this.getWidth() - this.getPaddingLeft() - this.getPaddingRight(), 2 * this.e);
        }
        else {
            d = null;
        }
        if (this.D != null) {
            this.D.setCallback((Drawable$Callback)null);
            this.unscheduleDrawable((Drawable)this.D);
        }
        if (d != null) {
            d.setCallback((Drawable$Callback)this);
        }
        this.D = d;
        this.requestLayout();
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return drawable == this.D || super.verifyDrawable(drawable);
    }
}
