// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.content.res.TypedArray;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.view.accessibility.AccessibilityNodeInfo;
import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.Region$Op;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.support.v7.internal.widget.DrawableUtils;
import android.view.View;
import android.support.v7.internal.widget.ViewUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.graphics.drawable.Drawable$Callback;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.appcompat.R$styleable;
import android.support.v7.appcompat.R$attr;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.support.v7.internal.widget.TintManager;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.animation.Animation;
import android.text.Layout;
import android.widget.CompoundButton;

public class SwitchCompat extends CompoundButton
{
    private static final int[] CHECKED_STATE_SET;
    private static final String[] z;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    private Animation mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private CharSequence mTextOff;
    private CharSequence mTextOn;
    private TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    private float mThumbPosition;
    private int mThumbTextPadding;
    private int mThumbWidth;
    private final TintManager mTintManager;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private VelocityTracker mVelocityTracker;
    
    static {
        final String[] z2 = new String[2];
        String s = "u\u000fg\u001c\u0015}\u0005-\u0019\u0013p\u0006f\u001aTG\u0016j\u001a\u0019|";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = 'a';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = 'n';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u\u000fg\u001c\u0015}\u0005-\u0019\u0013p\u0006f\u001aTG\u0016j\u001a\u0019|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CHECKED_STATE_SET = new int[] { 16842912 };
    }
    
    public SwitchCompat(final Context context) {
        this(context, null);
    }
    
    public SwitchCompat(final Context context, final AttributeSet set) {
        this(context, set, R$attr.switchStyle);
    }
    
    public SwitchCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mTempRect = new Rect();
        this.mTextPaint = new TextPaint(1);
        this.mTextPaint.density = this.getResources().getDisplayMetrics().density;
        final TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, set, R$styleable.SwitchCompat, n, 0);
        this.mThumbDrawable = obtainStyledAttributes.getDrawable(R$styleable.SwitchCompat_android_thumb);
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setCallback((Drawable$Callback)this);
        }
        this.mTrackDrawable = obtainStyledAttributes.getDrawable(R$styleable.SwitchCompat_track);
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setCallback((Drawable$Callback)this);
        }
        this.mTextOn = obtainStyledAttributes.getText(R$styleable.SwitchCompat_android_textOn);
        this.mTextOff = obtainStyledAttributes.getText(R$styleable.SwitchCompat_android_textOff);
        this.mShowText = obtainStyledAttributes.getBoolean(R$styleable.SwitchCompat_showText, true);
        this.mThumbTextPadding = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SwitchCompat_thumbTextPadding, 0);
        this.mSwitchMinWidth = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SwitchCompat_switchMinWidth, 0);
        this.mSwitchPadding = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SwitchCompat_switchPadding, 0);
        this.mSplitTrack = obtainStyledAttributes.getBoolean(R$styleable.SwitchCompat_splitTrack, false);
        final int resourceId = obtainStyledAttributes.getResourceId(R$styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            this.setSwitchTextAppearance(context, resourceId);
        }
        this.mTintManager = obtainStyledAttributes.getTintManager();
        obtainStyledAttributes.recycle();
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.mTouchSlop = value.getScaledTouchSlop();
        this.mMinFlingVelocity = value.getScaledMinimumFlingVelocity();
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }
    
    static void access$000(final SwitchCompat switchCompat, final float thumbPosition) {
        switchCompat.setThumbPosition(thumbPosition);
    }
    
    private void animateThumbToCheckedState(final boolean b) {
        final float mThumbPosition = this.mThumbPosition;
        float n;
        if (b) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        (this.mPositionAnimator = new SwitchCompat$1(this, mThumbPosition, n - mThumbPosition)).setDuration(250L);
        this.startAnimation(this.mPositionAnimator);
    }
    
    private void cancelPositionAnimator() {
        if (this.mPositionAnimator != null) {
            this.clearAnimation();
            this.mPositionAnimator = null;
        }
    }
    
    private void cancelSuperTouch(final MotionEvent motionEvent) {
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }
    
    private static float constrain(final float n, final float n2, final float n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }
    
    private int getThumbOffset() {
        if (ViewUtils.isLayoutRtl((View)this)) {
            final float mThumbPosition = 1.0f - this.mThumbPosition;
            if (!LinearLayoutCompat.a) {
                return (int)(0.5f + mThumbPosition * this.getThumbScrollRange());
            }
        }
        final float mThumbPosition = this.mThumbPosition;
        return (int)(0.5f + mThumbPosition * this.getThumbScrollRange());
    }
    
    private int getThumbScrollRange() {
        if (this.mTrackDrawable != null) {
            final Rect mTempRect = this.mTempRect;
            this.mTrackDrawable.getPadding(mTempRect);
            if (this.mThumbDrawable != null) {
                final Rect rect = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
                if (!LinearLayoutCompat.a) {
                    return this.mSwitchWidth - this.mThumbWidth - mTempRect.left - mTempRect.right - rect.left - rect.right;
                }
            }
            final Rect rect = DrawableUtils.INSETS_NONE;
            return this.mSwitchWidth - this.mThumbWidth - mTempRect.left - mTempRect.right - rect.left - rect.right;
        }
        return 0;
    }
    
    private boolean hitThumb(final float n, final float n2) {
        if (this.mThumbDrawable != null) {
            final int thumbOffset = this.getThumbOffset();
            this.mThumbDrawable.getPadding(this.mTempRect);
            final int n3 = this.mSwitchTop - this.mTouchSlop;
            final int n4 = thumbOffset + this.mSwitchLeft - this.mTouchSlop;
            final int n5 = n4 + this.mThumbWidth + this.mTempRect.left + this.mTempRect.right + this.mTouchSlop;
            final int n6 = this.mSwitchBottom + this.mTouchSlop;
            if (n > n4 && n < n5 && n2 > n3 && n2 < n6) {
                return true;
            }
        }
        return false;
    }
    
    private Layout makeLayout(final CharSequence charSequence) {
        CharSequence transformation;
        if (this.mSwitchTransformationMethod != null) {
            transformation = this.mSwitchTransformationMethod.getTransformation(charSequence, (View)this);
        }
        else {
            transformation = charSequence;
        }
        final TextPaint mTextPaint = this.mTextPaint;
        int n;
        if (transformation != null) {
            n = (int)Math.ceil(Layout.getDesiredWidth(transformation, this.mTextPaint));
        }
        else {
            n = 0;
        }
        return (Layout)new StaticLayout(transformation, mTextPaint, n, Layout$Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }
    
    private void setSwitchTypefaceByIndex(final int n, final int n2) {
        Typeface typeface = null;
        switch (n) {
            case 1: {
                typeface = Typeface.SANS_SERIF;
                break;
            }
            case 2: {
                typeface = Typeface.SERIF;
                break;
            }
            case 3: {
                typeface = Typeface.MONOSPACE;
                break;
            }
        }
        this.setSwitchTypeface(typeface, n2);
    }
    
    private void setThumbPosition(final float mThumbPosition) {
        this.mThumbPosition = mThumbPosition;
        this.invalidate();
    }
    
    private void stopDrag(final MotionEvent motionEvent) {
        final boolean a = LinearLayoutCompat.a;
        this.mTouchMode = 0;
        int n;
        if (motionEvent.getAction() == 1 && this.isEnabled()) {
            n = 1;
        }
        else {
            n = 0;
        }
        final boolean checked = this.isChecked();
        boolean targetCheckedState = false;
        Label_0104: {
            if (n != 0) {
                this.mVelocityTracker.computeCurrentVelocity(1000);
                final float xVelocity = this.mVelocityTracker.getXVelocity();
                Label_0096: {
                    if (Math.abs(xVelocity) > this.mMinFlingVelocity) {
                        if (ViewUtils.isLayoutRtl((View)this)) {
                            targetCheckedState = (xVelocity < 0.0f);
                        }
                        else {
                            targetCheckedState = (xVelocity > 0.0f);
                        }
                        if (!a) {
                            break Label_0096;
                        }
                    }
                    targetCheckedState = this.getTargetCheckedState();
                }
                if (!a) {
                    break Label_0104;
                }
            }
            targetCheckedState = checked;
        }
        if (targetCheckedState != checked) {
            this.playSoundEffect(0);
            this.setChecked(targetCheckedState);
        }
        this.cancelSuperTouch(motionEvent);
    }
    
    public void draw(final Canvas canvas) {
        final Rect mTempRect = this.mTempRect;
        int mSwitchLeft = this.mSwitchLeft;
        final int mSwitchTop = this.mSwitchTop;
        int mSwitchRight = this.mSwitchRight;
        final int mSwitchBottom = this.mSwitchBottom;
        final int n = mSwitchLeft + this.getThumbOffset();
        Rect rect = null;
        Label_0063: {
            if (this.mThumbDrawable != null) {
                rect = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
                if (!LinearLayoutCompat.a) {
                    break Label_0063;
                }
            }
            rect = DrawableUtils.INSETS_NONE;
        }
        int n5;
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.getPadding(mTempRect);
            final int n2 = n + mTempRect.left;
            int n3;
            int n4;
            if (rect != null && !rect.isEmpty()) {
                if (rect.left > mTempRect.left) {
                    mSwitchLeft += rect.left - mTempRect.left;
                }
                if (rect.top > mTempRect.top) {
                    n3 = mSwitchTop + (rect.top - mTempRect.top);
                }
                else {
                    n3 = mSwitchTop;
                }
                if (rect.right > mTempRect.right) {
                    mSwitchRight -= rect.right - mTempRect.right;
                }
                if (rect.bottom > mTempRect.bottom) {
                    n4 = mSwitchBottom - (rect.bottom - mTempRect.bottom);
                }
                else {
                    n4 = mSwitchBottom;
                }
            }
            else {
                n4 = mSwitchBottom;
                n3 = mSwitchTop;
            }
            this.mTrackDrawable.setBounds(mSwitchLeft, n3, mSwitchRight, n4);
            n5 = n2;
        }
        else {
            n5 = n;
        }
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.getPadding(mTempRect);
            final int n6 = n5 - mTempRect.left;
            final int n7 = n5 + this.mThumbWidth + mTempRect.right;
            this.mThumbDrawable.setBounds(n6, mSwitchTop, n7, mSwitchBottom);
            final Drawable background = this.getBackground();
            if (background != null) {
                DrawableCompat.setHotspotBounds(background, n6, mSwitchTop, n7, mSwitchBottom);
            }
        }
        super.draw(canvas);
    }
    
    public void drawableHotspotChanged(final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(n, n2);
        }
        if (this.mThumbDrawable != null) {
            DrawableCompat.setHotspot(this.mThumbDrawable, n, n2);
        }
        if (this.mTrackDrawable != null) {
            DrawableCompat.setHotspot(this.mTrackDrawable, n, n2);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setState(drawableState);
        }
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setState(drawableState);
        }
        this.invalidate();
    }
    
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft;
        if (!ViewUtils.isLayoutRtl((View)this)) {
            compoundPaddingLeft = super.getCompoundPaddingLeft();
        }
        else {
            compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
            if (!TextUtils.isEmpty(this.getText())) {
                return compoundPaddingLeft + this.mSwitchPadding;
            }
        }
        return compoundPaddingLeft;
    }
    
    public int getCompoundPaddingRight() {
        int compoundPaddingRight;
        if (ViewUtils.isLayoutRtl((View)this)) {
            compoundPaddingRight = super.getCompoundPaddingRight();
        }
        else {
            compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
            if (!TextUtils.isEmpty(this.getText())) {
                return compoundPaddingRight + this.mSwitchPadding;
            }
        }
        return compoundPaddingRight;
    }
    
    public void jumpDrawablesToCurrentState() {
        if (Build$VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.mThumbDrawable != null) {
                this.mThumbDrawable.jumpToCurrentState();
            }
            if (this.mTrackDrawable != null) {
                this.mTrackDrawable.jumpToCurrentState();
            }
            if (this.mPositionAnimator != null && !this.mPositionAnimator.hasEnded()) {
                this.clearAnimation();
                this.mPositionAnimator = null;
            }
        }
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, SwitchCompat.CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }
    
    protected void onDraw(final Canvas canvas) {
        final boolean a = LinearLayoutCompat.a;
        super.onDraw(canvas);
        final Rect mTempRect = this.mTempRect;
        final Drawable mTrackDrawable = this.mTrackDrawable;
        Label_0040: {
            if (mTrackDrawable != null) {
                mTrackDrawable.getPadding(mTempRect);
                if (!a) {
                    break Label_0040;
                }
            }
            mTempRect.setEmpty();
        }
        final int mSwitchTop = this.mSwitchTop;
        final int mSwitchBottom = this.mSwitchBottom;
        final int n = mSwitchTop + mTempRect.top;
        final int n2 = mSwitchBottom - mTempRect.bottom;
        final Drawable mThumbDrawable = this.mThumbDrawable;
        Label_0171: {
            if (mTrackDrawable != null) {
                if (this.mSplitTrack && mThumbDrawable != null) {
                    final Rect opticalBounds = DrawableUtils.getOpticalBounds(mThumbDrawable);
                    mThumbDrawable.copyBounds(mTempRect);
                    mTempRect.left += opticalBounds.left;
                    mTempRect.right -= opticalBounds.right;
                    final int save = canvas.save();
                    canvas.clipRect(mTempRect, Region$Op.DIFFERENCE);
                    mTrackDrawable.draw(canvas);
                    canvas.restoreToCount(save);
                    if (!a) {
                        break Label_0171;
                    }
                }
                mTrackDrawable.draw(canvas);
            }
        }
        final int save2 = canvas.save();
        if (mThumbDrawable != null) {
            mThumbDrawable.draw(canvas);
        }
        Layout layout;
        if (this.getTargetCheckedState()) {
            layout = this.mOnLayout;
        }
        else {
            layout = this.mOffLayout;
        }
        if (layout != null) {
            final int[] drawableState = this.getDrawableState();
            if (this.mTextColors != null) {
                this.mTextPaint.setColor(this.mTextColors.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            int width = 0;
            Label_0280: {
                if (mThumbDrawable != null) {
                    final Rect bounds = mThumbDrawable.getBounds();
                    width = bounds.left + bounds.right;
                    if (!a) {
                        break Label_0280;
                    }
                }
                width = this.getWidth();
            }
            canvas.translate((float)(width / 2 - layout.getWidth() / 2), (float)((n + n2) / 2 - layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }
    
    @TargetApi(14)
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)SwitchCompat.z[0]);
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build$VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName((CharSequence)SwitchCompat.z[1]);
            CharSequence text;
            if (this.isChecked()) {
                text = this.mTextOn;
            }
            else {
                text = this.mTextOff;
            }
            if (!TextUtils.isEmpty(text)) {
                final CharSequence text2 = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text2)) {
                    accessibilityNodeInfo.setText(text);
                    if (!LinearLayoutCompat.a) {
                        return;
                    }
                }
                final StringBuilder text3 = new StringBuilder();
                text3.append(text2).append(' ').append(text);
                accessibilityNodeInfo.setText((CharSequence)text3);
            }
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean a = LinearLayoutCompat.a;
        super.onLayout(b, n, n2, n3, n4);
        int max;
        int max2;
        if (this.mThumbDrawable != null) {
            final Rect mTempRect = this.mTempRect;
            Label_0056: {
                if (this.mTrackDrawable != null) {
                    this.mTrackDrawable.getPadding(mTempRect);
                    if (!a) {
                        break Label_0056;
                    }
                }
                mTempRect.setEmpty();
            }
            final Rect opticalBounds = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            max = Math.max(0, opticalBounds.left - mTempRect.left);
            max2 = Math.max(0, opticalBounds.right - mTempRect.right);
        }
        else {
            max2 = 0;
            max = 0;
        }
        int mSwitchLeft = 0;
        int mSwitchRight = 0;
        Label_0168: {
            if (ViewUtils.isLayoutRtl((View)this)) {
                final int n5 = max + this.getPaddingLeft();
                final int n6 = n5 + this.mSwitchWidth - max - max2;
                if (!a) {
                    mSwitchLeft = n5;
                    mSwitchRight = n6;
                    break Label_0168;
                }
            }
            final int n7 = this.getWidth() - this.getPaddingRight() - max2;
            mSwitchLeft = max2 + (max + (n7 - this.mSwitchWidth));
            mSwitchRight = n7;
        }
        int paddingTop = 0;
        int mSwitchBottom = 0;
        Label_0259: {
            switch (0x70 & this.getGravity()) {
                default: {
                    paddingTop = this.getPaddingTop();
                    mSwitchBottom = paddingTop + this.mSwitchHeight;
                    if (a) {
                        break Label_0259;
                    }
                    break;
                }
                case 16: {
                    paddingTop = (this.getPaddingTop() + this.getHeight() - this.getPaddingBottom()) / 2 - this.mSwitchHeight / 2;
                    mSwitchBottom = paddingTop + this.mSwitchHeight;
                    if (a) {
                        break Label_0259;
                    }
                    break;
                }
                case 80: {
                    mSwitchBottom = this.getHeight() - this.getPaddingBottom();
                    paddingTop = mSwitchBottom - this.mSwitchHeight;
                    break;
                }
            }
        }
        this.mSwitchLeft = mSwitchLeft;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = mSwitchBottom;
        this.mSwitchRight = mSwitchRight;
    }
    
    public void onMeasure(final int n, final int n2) {
        int n3 = 0;
        final boolean a = LinearLayoutCompat.a;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = this.makeLayout(this.mTextOn);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = this.makeLayout(this.mTextOff);
            }
        }
        final Rect mTempRect = this.mTempRect;
        int n4 = 0;
        int intrinsicHeight = 0;
        Label_0116: {
            if (this.mThumbDrawable != null) {
                this.mThumbDrawable.getPadding(mTempRect);
                n4 = this.mThumbDrawable.getIntrinsicWidth() - mTempRect.left - mTempRect.right;
                intrinsicHeight = this.mThumbDrawable.getIntrinsicHeight();
                if (!a) {
                    break Label_0116;
                }
            }
            intrinsicHeight = 0;
            n4 = 0;
        }
        int n5 = 0;
        Label_0157: {
            if (this.mShowText) {
                n5 = Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + 2 * this.mThumbTextPadding;
                if (!a) {
                    break Label_0157;
                }
            }
            n5 = 0;
        }
        this.mThumbWidth = Math.max(n5, n4);
        Label_0204: {
            if (this.mTrackDrawable != null) {
                this.mTrackDrawable.getPadding(mTempRect);
                final int intrinsicHeight2 = this.mTrackDrawable.getIntrinsicHeight();
                if (!a) {
                    n3 = intrinsicHeight2;
                    break Label_0204;
                }
            }
            mTempRect.setEmpty();
        }
        int n6 = mTempRect.left;
        int n7 = mTempRect.right;
        if (this.mThumbDrawable != null) {
            final Rect opticalBounds = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            n6 = Math.max(n6, opticalBounds.left);
            n7 = Math.max(n7, opticalBounds.right);
        }
        final int max = Math.max(this.mSwitchMinWidth, n7 + (n6 + 2 * this.mThumbWidth));
        final int max2 = Math.max(n3, intrinsicHeight);
        this.mSwitchWidth = max;
        this.mSwitchHeight = max2;
        super.onMeasure(n, n2);
        if (this.getMeasuredHeight() < max2) {
            this.setMeasuredDimension(ViewCompat.getMeasuredWidthAndState((View)this), max2);
        }
    }
    
    @TargetApi(14)
    public void onPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence;
        if (this.isChecked()) {
            charSequence = this.mTextOn;
        }
        else {
            charSequence = this.mTextOff;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean a = LinearLayoutCompat.a;
        this.mVelocityTracker.addMovement(motionEvent);
        Label_0140: {
            switch (MotionEventCompat.getActionMasked(motionEvent)) {
                case 0: {
                    final float x = motionEvent.getX();
                    final float y = motionEvent.getY();
                    if (!this.isEnabled() || !this.hitThumb(x, y)) {
                        break;
                    }
                    this.mTouchMode = 1;
                    this.mTouchX = x;
                    this.mTouchY = y;
                    if (a) {
                        break Label_0140;
                    }
                    break;
                }
                case 2: {
                    Label_0165: {
                        switch (this.mTouchMode) {
                            case 0: {
                                if (a) {
                                    break Label_0165;
                                }
                                break;
                            }
                            case 1: {
                                final float x2 = motionEvent.getX();
                                final float y2 = motionEvent.getY();
                                if (Math.abs(x2 - this.mTouchX) > this.mTouchSlop || Math.abs(y2 - this.mTouchY) > this.mTouchSlop) {
                                    this.mTouchMode = 2;
                                    this.getParent().requestDisallowInterceptTouchEvent(true);
                                    this.mTouchX = x2;
                                    this.mTouchY = y2;
                                    return true;
                                }
                                break;
                            }
                            case 2: {
                                final float x3 = motionEvent.getX();
                                final int thumbScrollRange = this.getThumbScrollRange();
                                final float n = x3 - this.mTouchX;
                                float n2 = 0.0f;
                                Label_0292: {
                                    if (thumbScrollRange != 0) {
                                        n2 = n / thumbScrollRange;
                                        if (!a) {
                                            break Label_0292;
                                        }
                                    }
                                    if (n > 0.0f) {
                                        n2 = 1.0f;
                                    }
                                    else {
                                        n2 = -1.0f;
                                    }
                                }
                                if (ViewUtils.isLayoutRtl((View)this)) {
                                    n2 = -n2;
                                }
                                final float constrain = constrain(n2 + this.mThumbPosition, 0.0f, 1.0f);
                                if (constrain != this.mThumbPosition) {
                                    this.mTouchX = x3;
                                    this.setThumbPosition(constrain);
                                }
                                return true;
                            }
                        }
                    }
                    if (a) {
                        break Label_0140;
                    }
                    break;
                }
                case 1:
                case 3: {
                    if (this.mTouchMode == 2) {
                        this.stopDrag(motionEvent);
                        super.onTouchEvent(motionEvent);
                        return true;
                    }
                    this.mTouchMode = 0;
                    this.mVelocityTracker.clear();
                    break;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public void setChecked(final boolean checked) {
        super.setChecked(checked);
        final boolean checked2 = this.isChecked();
        if (this.getWindowToken() != null && ViewCompat.isLaidOut((View)this)) {
            this.animateThumbToCheckedState(checked2);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        this.cancelPositionAnimator();
        float thumbPosition;
        if (checked2) {
            thumbPosition = 1.0f;
        }
        else {
            thumbPosition = 0.0f;
        }
        this.setThumbPosition(thumbPosition);
    }
    
    public void setSwitchTextAppearance(final Context context, final int n) {
        final boolean a = LinearLayoutCompat.a;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, R$styleable.TextAppearance);
        final ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R$styleable.TextAppearance_android_textColor);
        Label_0047: {
            if (colorStateList != null) {
                this.mTextColors = colorStateList;
                if (!a) {
                    break Label_0047;
                }
            }
            this.mTextColors = this.getTextColors();
        }
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0 && dimensionPixelSize != this.mTextPaint.getTextSize()) {
            this.mTextPaint.setTextSize((float)dimensionPixelSize);
            this.requestLayout();
        }
        this.setSwitchTypefaceByIndex(obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, -1), obtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, -1));
        Label_0149: {
            if (obtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false)) {
                this.mSwitchTransformationMethod = (TransformationMethod)new AllCapsTransformationMethod(this.getContext());
                if (!a) {
                    break Label_0149;
                }
            }
            this.mSwitchTransformationMethod = null;
        }
        obtainStyledAttributes.recycle();
    }
    
    public void setSwitchTypeface(final Typeface typeface) {
        if (this.mTextPaint.getTypeface() != typeface) {
            this.mTextPaint.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public void setSwitchTypeface(Typeface typeface, final int n) {
        final boolean a = LinearLayoutCompat.a;
        if (n > 0) {
            Label_0027: {
                if (typeface == null) {
                    typeface = Typeface.defaultFromStyle(n);
                    if (!a) {
                        break Label_0027;
                    }
                }
                typeface = Typeface.create(typeface, n);
            }
            this.setSwitchTypeface(typeface);
            int style;
            if (typeface != null) {
                style = typeface.getStyle();
            }
            else {
                style = 0;
            }
            final int n2 = n & ~style;
            this.mTextPaint.setFakeBoldText((n2 & 0x1) != 0x0);
            final TextPaint mTextPaint = this.mTextPaint;
            float textSkewX;
            if ((n2 & 0x2) != 0x0) {
                textSkewX = -0.25f;
            }
            else {
                textSkewX = 0.0f;
            }
            mTextPaint.setTextSkewX(textSkewX);
            if (!a) {
                return;
            }
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        this.setSwitchTypeface(typeface);
    }
    
    public void toggle() {
        this.setChecked(!this.isChecked());
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }
}
