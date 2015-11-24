// 
// Decompiled by Procyon v0.5.30
// 

package com.viewpagerindicator;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.Typeface;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.support.v4.view.ViewConfigurationCompat;
import android.view.ViewConfiguration;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Paint;
import android.support.v4.view.ViewPager;
import android.graphics.Rect;
import android.view.View;

public class TitlePageIndicator extends View implements PageIndicator
{
    private static final float BOLD_FADE_PERCENTAGE = 0.05f;
    private static final String EMPTY_TITLE = "";
    private static final int INVALID_POINTER = -1;
    private static final float SELECTION_FADE_PERCENTAGE = 0.25f;
    private int mActivePointerId;
    private boolean mBoldText;
    private final Rect mBounds;
    private OnCenterItemClickListener mCenterItemClickListener;
    private float mClipPadding;
    private int mColorSelected;
    private int mColorText;
    private int mCurrentPage;
    private float mFooterIndicatorHeight;
    private IndicatorStyle mFooterIndicatorStyle;
    private float mFooterIndicatorUnderlinePadding;
    private float mFooterLineHeight;
    private float mFooterPadding;
    private boolean mIsDragging;
    private float mLastMotionX;
    private LinePosition mLinePosition;
    private OnPageChangeListener mListener;
    private float mPageOffset;
    private final Paint mPaintFooterIndicator;
    private final Paint mPaintFooterLine;
    private final Paint mPaintText;
    private Path mPath;
    private int mScrollState;
    private float mTitlePadding;
    private float mTopPadding;
    private int mTouchSlop;
    private ViewPager mViewPager;
    
    public TitlePageIndicator(final Context context) {
        this(context, null);
    }
    
    public TitlePageIndicator(final Context context, final AttributeSet set) {
        this(context, set, R.attr.vpiTitlePageIndicatorStyle);
    }
    
    public TitlePageIndicator(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.mCurrentPage = -1;
        this.mPaintText = new Paint();
        this.mPath = new Path();
        this.mBounds = new Rect();
        this.mPaintFooterLine = new Paint();
        this.mPaintFooterIndicator = new Paint();
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (this.isInEditMode()) {
            return;
        }
        final Resources resources = this.getResources();
        final int color = resources.getColor(R.color.default_title_indicator_footer_color);
        final float dimension = resources.getDimension(R.dimen.default_title_indicator_footer_line_height);
        final int integer = resources.getInteger(R.integer.default_title_indicator_footer_indicator_style);
        final float dimension2 = resources.getDimension(R.dimen.default_title_indicator_footer_indicator_height);
        final float dimension3 = resources.getDimension(R.dimen.default_title_indicator_footer_indicator_underline_padding);
        final float dimension4 = resources.getDimension(R.dimen.default_title_indicator_footer_padding);
        final int integer2 = resources.getInteger(R.integer.default_title_indicator_line_position);
        final int color2 = resources.getColor(R.color.default_title_indicator_selected_color);
        final boolean boolean1 = resources.getBoolean(R.bool.default_title_indicator_selected_bold);
        final int color3 = resources.getColor(R.color.default_title_indicator_text_color);
        final float dimension5 = resources.getDimension(R.dimen.default_title_indicator_text_size);
        final float dimension6 = resources.getDimension(R.dimen.default_title_indicator_title_padding);
        final float dimension7 = resources.getDimension(R.dimen.default_title_indicator_clip_padding);
        final float dimension8 = resources.getDimension(R.dimen.default_title_indicator_top_padding);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, R.styleable.TitlePageIndicator, n, 0);
        this.mFooterLineHeight = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerLineHeight, dimension);
        this.mFooterIndicatorStyle = IndicatorStyle.fromValue(obtainStyledAttributes.getInteger(R.styleable.TitlePageIndicator_footerIndicatorStyle, integer));
        this.mFooterIndicatorHeight = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerIndicatorHeight, dimension2);
        this.mFooterIndicatorUnderlinePadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerIndicatorUnderlinePadding, dimension3);
        this.mFooterPadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerPadding, dimension4);
        this.mLinePosition = LinePosition.fromValue(obtainStyledAttributes.getInteger(R.styleable.TitlePageIndicator_linePosition, integer2));
        this.mTopPadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_topPadding, dimension8);
        this.mTitlePadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_titlePadding, dimension6);
        this.mClipPadding = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_clipPadding, dimension7);
        this.mColorSelected = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_selectedColor, color2);
        this.mColorText = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_android_textColor, color3);
        this.mBoldText = obtainStyledAttributes.getBoolean(R.styleable.TitlePageIndicator_selectedBold, boolean1);
        final float dimension9 = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_android_textSize, dimension5);
        final int color4 = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_footerColor, color);
        this.mPaintText.setTextSize(dimension9);
        this.mPaintText.setAntiAlias(true);
        this.mPaintFooterLine.setStyle(Paint$Style.FILL_AND_STROKE);
        this.mPaintFooterLine.setStrokeWidth(this.mFooterLineHeight);
        this.mPaintFooterLine.setColor(color4);
        this.mPaintFooterIndicator.setStyle(Paint$Style.FILL_AND_STROKE);
        this.mPaintFooterIndicator.setColor(color4);
        final Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.TitlePageIndicator_android_background);
        if (drawable != null) {
            this.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }
    
    private Rect calcBounds(final int n, final Paint paint) {
        final Rect rect = new Rect();
        final CharSequence title = this.getTitle(n);
        rect.right = (int)paint.measureText(title, 0, title.length());
        rect.bottom = (int)(paint.descent() - paint.ascent());
        return rect;
    }
    
    private ArrayList<Rect> calculateAllBounds(final Paint paint) {
        final ArrayList<Rect> list = new ArrayList<Rect>();
        final int count = this.mViewPager.getAdapter().getCount();
        final int width = this.getWidth();
        final int n = width / 2;
        for (int i = 0; i < count; ++i) {
            final Rect calcBounds = this.calcBounds(i, paint);
            final int n2 = calcBounds.right - calcBounds.left;
            final int bottom = calcBounds.bottom - calcBounds.top;
            calcBounds.left = (int)(n - n2 / 2.0f + (i - this.mCurrentPage - this.mPageOffset) * width);
            calcBounds.right = n2 + calcBounds.left;
            calcBounds.top = 0;
            calcBounds.bottom = bottom;
            list.add(calcBounds);
        }
        return list;
    }
    
    private void clipViewOnTheLeft(final Rect rect, final float n, final int n2) {
        rect.left = (int)(n2 + this.mClipPadding);
        rect.right = (int)(n + this.mClipPadding);
    }
    
    private void clipViewOnTheRight(final Rect rect, final float n, final int n2) {
        rect.right = (int)(n2 - this.mClipPadding);
        rect.left = (int)(rect.right - n);
    }
    
    private CharSequence getTitle(final int n) {
        CharSequence pageTitle = this.mViewPager.getAdapter().getPageTitle(n);
        if (pageTitle == null) {
            pageTitle = "";
        }
        return pageTitle;
    }
    
    public float getClipPadding() {
        return this.mClipPadding;
    }
    
    public int getFooterColor() {
        return this.mPaintFooterLine.getColor();
    }
    
    public float getFooterIndicatorHeight() {
        return this.mFooterIndicatorHeight;
    }
    
    public float getFooterIndicatorPadding() {
        return this.mFooterPadding;
    }
    
    public IndicatorStyle getFooterIndicatorStyle() {
        return this.mFooterIndicatorStyle;
    }
    
    public float getFooterLineHeight() {
        return this.mFooterLineHeight;
    }
    
    public LinePosition getLinePosition() {
        return this.mLinePosition;
    }
    
    public int getSelectedColor() {
        return this.mColorSelected;
    }
    
    public int getTextColor() {
        return this.mColorText;
    }
    
    public float getTextSize() {
        return this.mPaintText.getTextSize();
    }
    
    public float getTitlePadding() {
        return this.mTitlePadding;
    }
    
    public float getTopPadding() {
        return this.mTopPadding;
    }
    
    public Typeface getTypeface() {
        return this.mPaintText.getTypeface();
    }
    
    public boolean isSelectedBold() {
        return this.mBoldText;
    }
    
    public void notifyDataSetChanged() {
        this.invalidate();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.mViewPager != null) {
            final int count = this.mViewPager.getAdapter().getCount();
            if (count != 0) {
                if (this.mCurrentPage == -1 && this.mViewPager != null) {
                    this.mCurrentPage = this.mViewPager.getCurrentItem();
                }
                final ArrayList<Rect> calculateAllBounds = this.calculateAllBounds(this.mPaintText);
                final int size = calculateAllBounds.size();
                if (this.mCurrentPage >= size) {
                    this.setCurrentItem(size - 1);
                    return;
                }
                final int n = count - 1;
                final float n2 = this.getWidth() / 2.0f;
                final int left = this.getLeft();
                final float n3 = left + this.mClipPadding;
                final int width = this.getWidth();
                int height = this.getHeight();
                final int n4 = left + width;
                final float n5 = n4 - this.mClipPadding;
                int mCurrentPage = this.mCurrentPage;
                float mPageOffset;
                if (this.mPageOffset <= 0.5) {
                    mPageOffset = this.mPageOffset;
                }
                else {
                    ++mCurrentPage;
                    mPageOffset = 1.0f - this.mPageOffset;
                }
                final boolean b = mPageOffset <= 0.25f;
                final boolean b2 = mPageOffset <= 0.05f;
                final float n6 = (0.25f - mPageOffset) / 0.25f;
                final Rect rect = calculateAllBounds.get(this.mCurrentPage);
                final float n7 = rect.right - rect.left;
                if (rect.left < n3) {
                    this.clipViewOnTheLeft(rect, n7, left);
                }
                if (rect.right > n5) {
                    this.clipViewOnTheRight(rect, n7, n4);
                }
                if (this.mCurrentPage > 0) {
                    for (int i = -1 + this.mCurrentPage; i >= 0; --i) {
                        final Rect rect2 = calculateAllBounds.get(i);
                        if (rect2.left < n3) {
                            final int n8 = rect2.right - rect2.left;
                            this.clipViewOnTheLeft(rect2, n8, left);
                            final Rect rect3 = calculateAllBounds.get(i + 1);
                            if (rect2.right + this.mTitlePadding > rect3.left) {
                                rect2.left = (int)(rect3.left - n8 - this.mTitlePadding);
                                rect2.right = n8 + rect2.left;
                            }
                        }
                    }
                }
                if (this.mCurrentPage < n) {
                    for (int j = 1 + this.mCurrentPage; j < count; ++j) {
                        final Rect rect4 = calculateAllBounds.get(j);
                        if (rect4.right > n5) {
                            final int n9 = rect4.right - rect4.left;
                            this.clipViewOnTheRight(rect4, n9, n4);
                            final Rect rect5 = calculateAllBounds.get(j - 1);
                            if (rect4.left - this.mTitlePadding < rect5.right) {
                                rect4.left = (int)(rect5.right + this.mTitlePadding);
                                rect4.right = n9 + rect4.left;
                            }
                        }
                    }
                }
                final int n10 = this.mColorText >>> 24;
                for (int k = 0; k < count; ++k) {
                    final Rect rect6 = calculateAllBounds.get(k);
                    if ((rect6.left > left && rect6.left < n4) || (rect6.right > left && rect6.right < n4)) {
                        boolean b3;
                        if (k == mCurrentPage) {
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        final CharSequence title = this.getTitle(k);
                        this.mPaintText.setFakeBoldText(b3 && b2 && this.mBoldText);
                        this.mPaintText.setColor(this.mColorText);
                        if (b3 && b) {
                            this.mPaintText.setAlpha(n10 - (int)(n6 * n10));
                        }
                        if (k < size - 1) {
                            final Rect rect7 = calculateAllBounds.get(k + 1);
                            if (rect6.right + this.mTitlePadding > rect7.left) {
                                final int n11 = rect6.right - rect6.left;
                                rect6.left = (int)(rect7.left - n11 - this.mTitlePadding);
                                rect6.right = n11 + rect6.left;
                            }
                        }
                        canvas.drawText(title, 0, title.length(), (float)rect6.left, rect6.bottom + this.mTopPadding, this.mPaintText);
                        if (b3 && b) {
                            this.mPaintText.setColor(this.mColorSelected);
                            this.mPaintText.setAlpha((int)(n6 * (this.mColorSelected >>> 24)));
                            canvas.drawText(title, 0, title.length(), (float)rect6.left, rect6.bottom + this.mTopPadding, this.mPaintText);
                        }
                    }
                }
                float mFooterLineHeight = this.mFooterLineHeight;
                float mFooterIndicatorHeight = this.mFooterIndicatorHeight;
                if (this.mLinePosition == LinePosition.Top) {
                    height = 0;
                    mFooterLineHeight = -mFooterLineHeight;
                    mFooterIndicatorHeight = -mFooterIndicatorHeight;
                }
                this.mPath.reset();
                this.mPath.moveTo(0.0f, height - mFooterLineHeight / 2.0f);
                this.mPath.lineTo((float)width, height - mFooterLineHeight / 2.0f);
                this.mPath.close();
                canvas.drawPath(this.mPath, this.mPaintFooterLine);
                final float n12 = height - mFooterLineHeight;
                switch (this.mFooterIndicatorStyle) {
                    default: {}
                    case Triangle: {
                        this.mPath.reset();
                        this.mPath.moveTo(n2, n12 - mFooterIndicatorHeight);
                        this.mPath.lineTo(n2 + mFooterIndicatorHeight, n12);
                        this.mPath.lineTo(n2 - mFooterIndicatorHeight, n12);
                        this.mPath.close();
                        canvas.drawPath(this.mPath, this.mPaintFooterIndicator);
                    }
                    case Underline: {
                        if (b && mCurrentPage < size) {
                            final Rect rect8 = calculateAllBounds.get(mCurrentPage);
                            final float n13 = rect8.right + this.mFooterIndicatorUnderlinePadding;
                            final float n14 = rect8.left - this.mFooterIndicatorUnderlinePadding;
                            final float n15 = n12 - mFooterIndicatorHeight;
                            this.mPath.reset();
                            this.mPath.moveTo(n14, n12);
                            this.mPath.lineTo(n13, n12);
                            this.mPath.lineTo(n13, n15);
                            this.mPath.lineTo(n14, n15);
                            this.mPath.close();
                            this.mPaintFooterIndicator.setAlpha((int)(255.0f * n6));
                            canvas.drawPath(this.mPath, this.mPaintFooterIndicator);
                            this.mPaintFooterIndicator.setAlpha(255);
                            return;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        float n3;
        if (View$MeasureSpec.getMode(n2) == 1073741824) {
            n3 = View$MeasureSpec.getSize(n2);
        }
        else {
            this.mBounds.setEmpty();
            this.mBounds.bottom = (int)(this.mPaintText.descent() - this.mPaintText.ascent());
            n3 = this.mBounds.bottom - this.mBounds.top + this.mFooterLineHeight + this.mFooterPadding + this.mTopPadding;
            if (this.mFooterIndicatorStyle != IndicatorStyle.None) {
                n3 += this.mFooterIndicatorHeight;
            }
        }
        this.setMeasuredDimension(size, (int)n3);
    }
    
    public void onPageScrollStateChanged(final int mScrollState) {
        this.mScrollState = mScrollState;
        if (this.mListener != null) {
            this.mListener.onPageScrollStateChanged(mScrollState);
        }
    }
    
    public void onPageScrolled(final int mCurrentPage, final float mPageOffset, final int n) {
        this.mCurrentPage = mCurrentPage;
        this.mPageOffset = mPageOffset;
        this.invalidate();
        if (this.mListener != null) {
            this.mListener.onPageScrolled(mCurrentPage, mPageOffset, n);
        }
    }
    
    public void onPageSelected(final int mCurrentPage) {
        if (this.mScrollState == 0) {
            this.mCurrentPage = mCurrentPage;
            this.invalidate();
        }
        if (this.mListener != null) {
            this.mListener.onPageSelected(mCurrentPage);
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mCurrentPage = savedState.currentPage;
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.mCurrentPage;
        return (Parcelable)savedState;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.mViewPager == null || this.mViewPager.getAdapter().getCount() == 0) {
            return false;
        }
        final int n = 0xFF & motionEvent.getAction();
        switch (n) {
            case 0: {
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                this.mLastMotionX = motionEvent.getX();
                break;
            }
            case 2: {
                final float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                final float n2 = x - this.mLastMotionX;
                if (!this.mIsDragging && Math.abs(n2) > this.mTouchSlop) {
                    this.mIsDragging = true;
                }
                if (!this.mIsDragging) {
                    break;
                }
                this.mLastMotionX = x;
                if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                    this.mViewPager.fakeDragBy(n2);
                    break;
                }
                break;
            }
            case 1:
            case 3: {
                if (!this.mIsDragging) {
                    final int count = this.mViewPager.getAdapter().getCount();
                    final int width = this.getWidth();
                    final float n3 = width / 2.0f;
                    final float n4 = width / 6.0f;
                    final float n5 = n3 - n4;
                    final float n6 = n3 + n4;
                    final float x2 = motionEvent.getX();
                    if (x2 < n5) {
                        if (this.mCurrentPage > 0) {
                            if (n != 3) {
                                this.mViewPager.setCurrentItem(-1 + this.mCurrentPage);
                            }
                            return true;
                        }
                    }
                    else if (x2 > n6) {
                        if (this.mCurrentPage < count - 1) {
                            if (n != 3) {
                                this.mViewPager.setCurrentItem(1 + this.mCurrentPage);
                            }
                            return true;
                        }
                    }
                    else if (this.mCenterItemClickListener != null && n != 3) {
                        this.mCenterItemClickListener.onCenterItemClick(this.mCurrentPage);
                    }
                }
                this.mIsDragging = false;
                this.mActivePointerId = -1;
                if (this.mViewPager.isFakeDragging()) {
                    this.mViewPager.endFakeDrag();
                    break;
                }
                break;
            }
            case 5: {
                final int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                break;
            }
            case 6: {
                final int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.mActivePointerId) {
                    int n7;
                    if (actionIndex2 == 0) {
                        n7 = 1;
                    }
                    else {
                        n7 = 0;
                    }
                    this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, n7);
                }
                this.mLastMotionX = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                break;
            }
        }
        return true;
    }
    
    public void setClipPadding(final float mClipPadding) {
        this.mClipPadding = mClipPadding;
        this.invalidate();
    }
    
    public void setCurrentItem(final int n) {
        if (this.mViewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.mViewPager.setCurrentItem(n);
        this.mCurrentPage = n;
        this.invalidate();
    }
    
    public void setFooterColor(final int n) {
        this.mPaintFooterLine.setColor(n);
        this.mPaintFooterIndicator.setColor(n);
        this.invalidate();
    }
    
    public void setFooterIndicatorHeight(final float mFooterIndicatorHeight) {
        this.mFooterIndicatorHeight = mFooterIndicatorHeight;
        this.invalidate();
    }
    
    public void setFooterIndicatorPadding(final float mFooterPadding) {
        this.mFooterPadding = mFooterPadding;
        this.invalidate();
    }
    
    public void setFooterIndicatorStyle(final IndicatorStyle mFooterIndicatorStyle) {
        this.mFooterIndicatorStyle = mFooterIndicatorStyle;
        this.invalidate();
    }
    
    public void setFooterLineHeight(final float mFooterLineHeight) {
        this.mFooterLineHeight = mFooterLineHeight;
        this.mPaintFooterLine.setStrokeWidth(this.mFooterLineHeight);
        this.invalidate();
    }
    
    public void setLinePosition(final LinePosition mLinePosition) {
        this.mLinePosition = mLinePosition;
        this.invalidate();
    }
    
    public void setOnCenterItemClickListener(final OnCenterItemClickListener mCenterItemClickListener) {
        this.mCenterItemClickListener = mCenterItemClickListener;
    }
    
    public void setOnPageChangeListener(final OnPageChangeListener mListener) {
        this.mListener = mListener;
    }
    
    public void setSelectedBold(final boolean mBoldText) {
        this.mBoldText = mBoldText;
        this.invalidate();
    }
    
    public void setSelectedColor(final int mColorSelected) {
        this.mColorSelected = mColorSelected;
        this.invalidate();
    }
    
    public void setTextColor(final int n) {
        this.mPaintText.setColor(n);
        this.mColorText = n;
        this.invalidate();
    }
    
    public void setTextSize(final float textSize) {
        this.mPaintText.setTextSize(textSize);
        this.invalidate();
    }
    
    public void setTitlePadding(final float mTitlePadding) {
        this.mTitlePadding = mTitlePadding;
        this.invalidate();
    }
    
    public void setTopPadding(final float mTopPadding) {
        this.mTopPadding = mTopPadding;
        this.invalidate();
    }
    
    public void setTypeface(final Typeface typeface) {
        this.mPaintText.setTypeface(typeface);
        this.invalidate();
    }
    
    public void setViewPager(final ViewPager mViewPager) {
        if (this.mViewPager == mViewPager) {
            return;
        }
        if (this.mViewPager != null) {
            this.mViewPager.setOnPageChangeListener(null);
        }
        if (mViewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        (this.mViewPager = mViewPager).setOnPageChangeListener((ViewPager.OnPageChangeListener)this);
        this.invalidate();
    }
    
    public void setViewPager(final ViewPager viewPager, final int currentItem) {
        this.setViewPager(viewPager);
        this.setCurrentItem(currentItem);
    }
    
    public enum IndicatorStyle
    {
        None(0), 
        Triangle(1), 
        Underline(2);
        
        public final int value;
        
        private IndicatorStyle(final int value) {
            this.value = value;
        }
        
        public static IndicatorStyle fromValue(final int n) {
            for (final IndicatorStyle indicatorStyle : values()) {
                if (indicatorStyle.value == n) {
                    return indicatorStyle;
                }
            }
            return null;
        }
    }
    
    public enum LinePosition
    {
        Bottom(0), 
        Top(1);
        
        public final int value;
        
        private LinePosition(final int value) {
            this.value = value;
        }
        
        public static LinePosition fromValue(final int n) {
            for (final LinePosition linePosition : values()) {
                if (linePosition.value == n) {
                    return linePosition;
                }
            }
            return null;
        }
    }
    
    public interface OnCenterItemClickListener
    {
        void onCenterItemClick(final int p0);
    }
    
    static class SavedState extends View$BaseSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        int currentPage;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {
                public SavedState createFromParcel(final Parcel parcel) {
                    return new SavedState(parcel);
                }
                
                public SavedState[] newArray(final int n) {
                    return new SavedState[n];
                }
            };
        }
        
        private SavedState(final Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.currentPage);
        }
    }
}
