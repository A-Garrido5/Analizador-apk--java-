// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v4.widget.PopupWindowCompat;
import android.view.View$OnTouchListener;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.ListView;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.AbsListView$OnScrollListener;
import android.content.res.TypedArray;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.internal.widget.AppCompatPopupWindow;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.support.v7.appcompat.R$attr;
import android.util.Log;
import android.graphics.Rect;
import android.widget.PopupWindow;
import android.database.DataSetObserver;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.os.Handler;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.Context;
import android.widget.ListAdapter;
import java.lang.reflect.Method;

public class ListPopupWindow
{
    private static Method sClipToWindowEnabledMethod;
    private static final String[] z;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    private ListPopupWindow$DropDownListView mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private boolean mForceIgnoreOutsideTouch;
    private Handler mHandler;
    private final ListPopupWindow$ListSelectorHider mHideSelector;
    private AdapterView$OnItemClickListener mItemClickListener;
    private AdapterView$OnItemSelectedListener mItemSelectedListener;
    private int mLayoutDirection;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    private final ListPopupWindow$ResizePopupRunnable mResizePopupRunnable;
    private final ListPopupWindow$PopupScrollListener mScrollListener;
    private Runnable mShowDropDownRunnable;
    private Rect mTempRect;
    private final ListPopupWindow$PopupTouchInterceptor mTouchInterceptor;
    
    static {
        final String[] z2 = new String[4];
        String s = "n^d\u0012PNT2\u001bUID2\u0003STYf\u001aSI\u0010";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String z3 = null;
    Label_0109:
        while (true) {
            z3 = z(z(s));
            switch (n) {
                default: {
                    array[n2] = z3;
                    s = "kYa\u0007lH@g\u0003kN^v\u001cK";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = z3;
                    s = "kYa\u0007lH@g\u0003kN^v\u001cK";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = z3;
                    n2 = 3;
                    array = z2;
                    s = "d_g\u001fX\u0007^}\u0007\u001cDQ~\u001f\u001cTUf0PN@F\u001coDBw\u0016Rb^s\u0011PBT:Z\u001cH^2#SWEb$UIT}\u0004\u0012\u0007\u007fzSKB\\~]";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0109;
                }
            }
        }
        array[n2] = z3;
        z = z2;
        final String z4 = z(z("TUf0PN@F\u001coDBw\u0016Rb^s\u0011PBT"));
        try {
            ListPopupWindow.sClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod(z4, Boolean.TYPE);
        }
        catch (NoSuchMethodException ex) {
            Log.i(z(z("kYa\u0007lH@g\u0003kN^v\u001cK")), z(z("d_g\u001fX\u0007^}\u0007\u001cAY|\u0017\u001cJUf\u001bSC\u0010a\u0016Hd\\{\u0003hHcq\u0001YB^W\u001d]E\\w\u0017\u0014\u000e\u0010}\u001d\u001cw_b\u0006LpY|\u0017SP\u001e2<T\u0007Gw\u001fP\t")));
        }
    }
    
    public ListPopupWindow(final Context context) {
        this(context, null, R$attr.listPopupWindowStyle);
    }
    
    public ListPopupWindow(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public ListPopupWindow(final Context mContext, final AttributeSet set, final int n, final int n2) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownGravity = 0;
        this.mDropDownAlwaysVisible = false;
        this.mForceIgnoreOutsideTouch = false;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mPromptPosition = 0;
        this.mResizePopupRunnable = new ListPopupWindow$ResizePopupRunnable(this, null);
        this.mTouchInterceptor = new ListPopupWindow$PopupTouchInterceptor(this, null);
        this.mScrollListener = new ListPopupWindow$PopupScrollListener(this, null);
        this.mHideSelector = new ListPopupWindow$ListSelectorHider(this, null);
        this.mHandler = new Handler();
        this.mTempRect = new Rect();
        this.mContext = mContext;
        final TypedArray obtainStyledAttributes = mContext.obtainStyledAttributes(set, R$styleable.ListPopupWindow, n, n2);
        this.mDropDownHorizontalOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.mDropDownVerticalOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.mDropDownVerticalOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        obtainStyledAttributes.recycle();
        (this.mPopup = new AppCompatPopupWindow(mContext, set, n)).setInputMethodMode(1);
        this.mLayoutDirection = TextUtilsCompat.getLayoutDirectionFromLocale(this.mContext.getResources().getConfiguration().locale);
    }
    
    static PopupWindow access$1100(final ListPopupWindow listPopupWindow) {
        return listPopupWindow.mPopup;
    }
    
    static ListPopupWindow$ResizePopupRunnable access$1200(final ListPopupWindow listPopupWindow) {
        return listPopupWindow.mResizePopupRunnable;
    }
    
    static Handler access$1300(final ListPopupWindow listPopupWindow) {
        return listPopupWindow.mHandler;
    }
    
    static ListPopupWindow$DropDownListView access$600(final ListPopupWindow listPopupWindow) {
        return listPopupWindow.mDropDownList;
    }
    
    private int buildDropDown() {
        final boolean a = LinearLayoutCompat.a;
        int n2 = 0;
        Label_0378: {
            int n3;
            if (this.mDropDownList == null) {
                final Context mContext = this.mContext;
                this.mShowDropDownRunnable = new ListPopupWindow$2(this);
                this.mDropDownList = new ListPopupWindow$DropDownListView(mContext, !this.mModal);
                if (this.mDropDownListHighlight != null) {
                    this.mDropDownList.setSelector(this.mDropDownListHighlight);
                }
                this.mDropDownList.setAdapter(this.mAdapter);
                this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
                this.mDropDownList.setFocusable(true);
                this.mDropDownList.setFocusableInTouchMode(true);
                this.mDropDownList.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new ListPopupWindow$3(this));
                this.mDropDownList.setOnScrollListener((AbsListView$OnScrollListener)this.mScrollListener);
                if (this.mItemSelectedListener != null) {
                    this.mDropDownList.setOnItemSelectedListener(this.mItemSelectedListener);
                }
                final ListPopupWindow$DropDownListView mDropDownList = this.mDropDownList;
                final View mPromptView = this.mPromptView;
                int n;
                View contentView;
                if (mPromptView != null) {
                    final LinearLayout linearLayout = new LinearLayout(mContext);
                    linearLayout.setOrientation(1);
                    final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, 0, 1.0f);
                    Label_0262: {
                        Label_0528: {
                            switch (this.mPromptPosition) {
                                case 1: {
                                    linearLayout.addView((View)mDropDownList, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                                    linearLayout.addView(mPromptView);
                                    if (a) {
                                        break Label_0528;
                                    }
                                    break Label_0262;
                                }
                                case 0: {
                                    linearLayout.addView(mPromptView);
                                    linearLayout.addView((View)mDropDownList, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                                    if (a) {
                                        break;
                                    }
                                    break Label_0262;
                                }
                            }
                        }
                        Log.e(ListPopupWindow.z[1], ListPopupWindow.z[0] + this.mPromptPosition);
                    }
                    mPromptView.measure(View$MeasureSpec.makeMeasureSpec(this.mDropDownWidth, Integer.MIN_VALUE), 0);
                    final LinearLayout$LayoutParams linearLayout$LayoutParams2 = (LinearLayout$LayoutParams)mPromptView.getLayoutParams();
                    n = mPromptView.getMeasuredHeight() + linearLayout$LayoutParams2.topMargin + linearLayout$LayoutParams2.bottomMargin;
                    contentView = (View)linearLayout;
                }
                else {
                    contentView = (View)mDropDownList;
                    n = 0;
                }
                this.mPopup.setContentView(contentView);
                if (!a) {
                    n2 = n;
                    break Label_0378;
                }
                n3 = n;
            }
            else {
                n3 = 0;
            }
            final ViewGroup viewGroup = (ViewGroup)this.mPopup.getContentView();
            final View mPromptView2 = this.mPromptView;
            if (mPromptView2 != null) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams3 = (LinearLayout$LayoutParams)mPromptView2.getLayoutParams();
                n2 = mPromptView2.getMeasuredHeight() + linearLayout$LayoutParams3.topMargin + linearLayout$LayoutParams3.bottomMargin;
            }
            else {
                n2 = n3;
            }
        }
        final Drawable background = this.mPopup.getBackground();
        int n4 = 0;
        Label_0449: {
            if (background != null) {
                background.getPadding(this.mTempRect);
                n4 = this.mTempRect.top + this.mTempRect.bottom;
                if (this.mDropDownVerticalOffsetSet) {
                    break Label_0449;
                }
                this.mDropDownVerticalOffset = -this.mTempRect.top;
                if (!a) {
                    break Label_0449;
                }
            }
            else {
                n4 = 0;
            }
            this.mTempRect.setEmpty();
        }
        final int n5 = n4;
        if (this.mPopup.getInputMethodMode() == 2) {}
        final int maxAvailableHeight = this.mPopup.getMaxAvailableHeight(this.getAnchorView(), this.mDropDownVerticalOffset);
        if (this.mDropDownAlwaysVisible || this.mDropDownHeight == -1) {
            return maxAvailableHeight + n5;
        }
        int n6 = 0;
        Label_0588: {
            Label_0666: {
                switch (this.mDropDownWidth) {
                    case -2: {
                        n6 = View$MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), Integer.MIN_VALUE);
                        if (a) {
                            break Label_0666;
                        }
                        break Label_0588;
                    }
                    case -1: {
                        n6 = View$MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), 1073741824);
                        if (a) {
                            break;
                        }
                        break Label_0588;
                    }
                }
            }
            n6 = View$MeasureSpec.makeMeasureSpec(this.mDropDownWidth, 1073741824);
        }
        final int measureHeightOfChildrenCompat = this.mDropDownList.measureHeightOfChildrenCompat(n6, 0, -1, maxAvailableHeight - n2, -1);
        if (measureHeightOfChildrenCompat > 0) {
            n2 += n5;
        }
        return measureHeightOfChildrenCompat + n2;
    }
    
    private void removePromptView() {
        if (this.mPromptView != null) {
            final ViewParent parent = this.mPromptView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(this.mPromptView);
            }
        }
    }
    
    private void setPopupClipToScreenEnabled(final boolean b) {
        if (ListPopupWindow.sClipToWindowEnabledMethod == null) {
            return;
        }
        try {
            ListPopupWindow.sClipToWindowEnabledMethod.invoke(this.mPopup, b);
        }
        catch (Exception ex) {
            Log.i(ListPopupWindow.z[2], ListPopupWindow.z[3]);
        }
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = '\'';
                    break;
                }
                case 1: {
                    c2 = '0';
                    break;
                }
                case 2: {
                    c2 = '\u0012';
                    break;
                }
                case 3: {
                    c2 = 's';
                    break;
                }
            }
            array[n] = (char)(c2 ^ c);
        }
        return new String(array).intern();
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length < 2) {
            charArray[0] ^= '<';
        }
        return charArray;
    }
    
    public void clearListSelection() {
        final ListPopupWindow$DropDownListView mDropDownList = this.mDropDownList;
        if (mDropDownList != null) {
            ListPopupWindow$DropDownListView.access$502(mDropDownList, true);
            mDropDownList.requestLayout();
        }
    }
    
    public void dismiss() {
        this.mPopup.dismiss();
        this.removePromptView();
        this.mPopup.setContentView((View)null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks((Runnable)this.mResizePopupRunnable);
    }
    
    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }
    
    public ListView getListView() {
        return this.mDropDownList;
    }
    
    public boolean isInputMethodNotNeeded() {
        return this.mPopup.getInputMethodMode() == 2;
    }
    
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }
    
    public void setAdapter(final ListAdapter mAdapter) {
        Label_0046: {
            if (this.mObserver == null) {
                this.mObserver = new ListPopupWindow$PopupDataSetObserver(this, null);
                if (!LinearLayoutCompat.a) {
                    break Label_0046;
                }
            }
            if (this.mAdapter != null) {
                this.mAdapter.unregisterDataSetObserver(this.mObserver);
            }
        }
        this.mAdapter = mAdapter;
        if (this.mAdapter != null) {
            mAdapter.registerDataSetObserver(this.mObserver);
        }
        if (this.mDropDownList != null) {
            this.mDropDownList.setAdapter(this.mAdapter);
        }
    }
    
    public void setAnchorView(final View mDropDownAnchorView) {
        this.mDropDownAnchorView = mDropDownAnchorView;
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        this.mPopup.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setContentWidth(final int width) {
        final Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            this.mDropDownWidth = width + (this.mTempRect.left + this.mTempRect.right);
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        this.setWidth(width);
    }
    
    public void setDropDownGravity(final int mDropDownGravity) {
        this.mDropDownGravity = mDropDownGravity;
    }
    
    public void setInputMethodMode(final int inputMethodMode) {
        this.mPopup.setInputMethodMode(inputMethodMode);
    }
    
    public void setModal(final boolean b) {
        this.mModal = b;
        this.mPopup.setFocusable(b);
    }
    
    public void setOnDismissListener(final PopupWindow$OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }
    
    public void setOnItemClickListener(final AdapterView$OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }
    
    public void setPromptPosition(final int mPromptPosition) {
        this.mPromptPosition = mPromptPosition;
    }
    
    public void setWidth(final int mDropDownWidth) {
        this.mDropDownWidth = mDropDownWidth;
    }
    
    public void show() {
        boolean b = true;
        final boolean a = LinearLayoutCompat.a;
        final int buildDropDown = this.buildDropDown();
        final boolean inputMethodNotNeeded = this.isInputMethodNotNeeded();
        int n = 0;
        int mDropDownHeight = 0;
        if (this.mPopup.isShowing()) {
            Label_0067: {
                if (this.mDropDownWidth != -1 || a) {
                    if (this.mDropDownWidth == -2) {
                        n = this.getAnchorView().getWidth();
                        if (!a) {
                            break Label_0067;
                        }
                    }
                    n = this.mDropDownWidth;
                }
                else {
                    n = -1;
                }
            }
            Label_0165: {
                if (this.mDropDownHeight == -1) {
                    if (inputMethodNotNeeded) {
                        mDropDownHeight = buildDropDown;
                    }
                    else {
                        mDropDownHeight = -1;
                    }
                    if (inputMethodNotNeeded) {
                        final PopupWindow mPopup = this.mPopup;
                        int n2;
                        if (this.mDropDownWidth == -1) {
                            n2 = -1;
                        }
                        else {
                            n2 = 0;
                        }
                        mPopup.setWindowLayoutMode(n2, 0);
                        if (!a) {
                            break Label_0165;
                        }
                    }
                    final PopupWindow mPopup2 = this.mPopup;
                    int n3;
                    if (this.mDropDownWidth == -1) {
                        n3 = -1;
                    }
                    else {
                        n3 = 0;
                    }
                    mPopup2.setWindowLayoutMode(n3, -1);
                    if (!a) {
                        break Label_0165;
                    }
                }
                if (this.mDropDownHeight != -2 || a) {
                    mDropDownHeight = this.mDropDownHeight;
                }
                else {
                    mDropDownHeight = buildDropDown;
                }
            }
            this.mPopup.setOutsideTouchable(!this.mForceIgnoreOutsideTouch && !this.mDropDownAlwaysVisible && b);
            this.mPopup.update(this.getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, n, mDropDownHeight);
            if (!a) {
                return;
            }
        }
        else {
            n = 0;
            mDropDownHeight = 0;
        }
        Label_0275: {
            if (this.mDropDownWidth == -1) {
                if (!a) {
                    n = -1;
                    break Label_0275;
                }
                n = -1;
            }
            if (this.mDropDownWidth == -2) {
                this.mPopup.setWidth(this.getAnchorView().getWidth());
                if (!a) {
                    break Label_0275;
                }
            }
            this.mPopup.setWidth(this.mDropDownWidth);
        }
        Label_0322: {
            if (this.mDropDownHeight == -1) {
                if (!a) {
                    mDropDownHeight = -1;
                    break Label_0322;
                }
                mDropDownHeight = -1;
            }
            if (this.mDropDownHeight == -2) {
                this.mPopup.setHeight(buildDropDown);
                if (!a) {
                    break Label_0322;
                }
            }
            this.mPopup.setHeight(this.mDropDownHeight);
        }
        this.mPopup.setWindowLayoutMode(n, mDropDownHeight);
        this.setPopupClipToScreenEnabled(b);
        final PopupWindow mPopup3 = this.mPopup;
        if (this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) {
            b = false;
        }
        mPopup3.setOutsideTouchable(b);
        this.mPopup.setTouchInterceptor((View$OnTouchListener)this.mTouchInterceptor);
        PopupWindowCompat.showAsDropDown(this.mPopup, this.getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
        this.mDropDownList.setSelection(-1);
        if (!this.mModal || this.mDropDownList.isInTouchMode()) {
            this.clearListSelection();
        }
        if (!this.mModal) {
            this.mHandler.post((Runnable)this.mHideSelector);
        }
    }
}
