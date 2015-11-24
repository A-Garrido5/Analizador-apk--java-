// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.StandaloneActionMode;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.app.ToolbarActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.app.Activity;
import android.support.v4.app.NavUtils;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.support.v7.internal.widget.FitWindowsViewGroup;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.view.LayoutInflater;
import android.support.v7.internal.widget.TintCheckedTextView;
import android.support.v7.internal.widget.TintRadioButton;
import android.support.v7.internal.widget.TintCheckBox;
import android.support.v7.internal.widget.TintSpinner;
import android.support.v7.internal.widget.TintEditText;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.support.annotation.NonNull;
import android.support.v7.internal.app.WindowDecorActionBar;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.internal.widget.ViewUtils;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.AndroidRuntimeException;
import android.view.KeyCharacterMap;
import android.support.v4.view.ViewConfigurationCompat;
import android.view.ViewConfiguration;
import android.support.v4.view.ViewCompat;
import android.content.res.Resources$Theme;
import android.support.v7.internal.view.menu.MenuPresenter;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.os.Bundle;
import android.support.v7.internal.app.WindowCallback;
import android.util.DisplayMetrics;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.support.v7.appcompat.R;
import android.view.Menu;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.View;
import android.support.v7.internal.widget.DecorContentParent;
import android.support.v7.internal.widget.ActionBarContextView;
import android.widget.PopupWindow;
import android.support.v7.view.ActionMode;
import android.support.v7.internal.view.menu.MenuBuilder;

class ActionBarActivityDelegateBase extends ActionBarActivityDelegate implements Callback
{
    private static final String TAG = "ActionBarActivityDelegateBase";
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private int mInvalidatePanelMenuFeatures;
    private boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    private ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private CharSequence mTitleToSet;
    private ListMenuPresenter mToolbarListMenuPresenter;
    private ViewGroup mWindowDecor;
    
    ActionBarActivityDelegateBase(final ActionBarActivity actionBarActivity) {
        super(actionBarActivity);
        this.mInvalidatePanelMenuRunnable = new Runnable() {
            @Override
            public void run() {
                if ((0x1 & ActionBarActivityDelegateBase.this.mInvalidatePanelMenuFeatures) != 0x0) {
                    ActionBarActivityDelegateBase.this.doInvalidatePanelMenu(0);
                }
                if ((0x100 & ActionBarActivityDelegateBase.this.mInvalidatePanelMenuFeatures) != 0x0) {
                    ActionBarActivityDelegateBase.this.doInvalidatePanelMenu(8);
                }
                ActionBarActivityDelegateBase.this.mInvalidatePanelMenuPosted = false;
                ActionBarActivityDelegateBase.this.mInvalidatePanelMenuFeatures = 0;
            }
        };
    }
    
    private void applyFixedSizeWindow() {
        final TypedArray obtainStyledAttributes = this.mActivity.obtainStyledAttributes(R.styleable.Theme);
        final boolean hasValue = obtainStyledAttributes.hasValue(R.styleable.Theme_windowFixedWidthMajor);
        TypedValue typedValue = null;
        if (hasValue) {
            typedValue = null;
            if (!false) {
                typedValue = new TypedValue();
            }
            obtainStyledAttributes.getValue(R.styleable.Theme_windowFixedWidthMajor, typedValue);
        }
        final boolean hasValue2 = obtainStyledAttributes.hasValue(R.styleable.Theme_windowFixedWidthMinor);
        TypedValue typedValue2 = null;
        if (hasValue2) {
            typedValue2 = null;
            if (!false) {
                typedValue2 = new TypedValue();
            }
            obtainStyledAttributes.getValue(R.styleable.Theme_windowFixedWidthMinor, typedValue2);
        }
        final boolean hasValue3 = obtainStyledAttributes.hasValue(R.styleable.Theme_windowFixedHeightMajor);
        TypedValue typedValue3 = null;
        if (hasValue3) {
            typedValue3 = null;
            if (!false) {
                typedValue3 = new TypedValue();
            }
            obtainStyledAttributes.getValue(R.styleable.Theme_windowFixedHeightMajor, typedValue3);
        }
        final boolean hasValue4 = obtainStyledAttributes.hasValue(R.styleable.Theme_windowFixedHeightMinor);
        TypedValue typedValue4 = null;
        if (hasValue4) {
            typedValue4 = null;
            if (!false) {
                typedValue4 = new TypedValue();
            }
            obtainStyledAttributes.getValue(R.styleable.Theme_windowFixedHeightMinor, typedValue4);
        }
        final DisplayMetrics displayMetrics = this.mActivity.getResources().getDisplayMetrics();
        boolean b;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            b = true;
        }
        else {
            b = false;
        }
        int n = -1;
        int n2 = -1;
        TypedValue typedValue5;
        if (b) {
            typedValue5 = typedValue2;
        }
        else {
            typedValue5 = typedValue;
        }
        if (typedValue5 != null && typedValue5.type != 0) {
            if (typedValue5.type == 5) {
                n = (int)typedValue5.getDimension(displayMetrics);
            }
            else if (typedValue5.type == 6) {
                n = (int)typedValue5.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
            }
        }
        TypedValue typedValue6;
        if (b) {
            typedValue6 = typedValue3;
        }
        else {
            typedValue6 = typedValue4;
        }
        if (typedValue6 != null && typedValue6.type != 0) {
            if (typedValue6.type == 5) {
                n2 = (int)typedValue6.getDimension(displayMetrics);
            }
            else if (typedValue6.type == 6) {
                n2 = (int)typedValue6.getFraction((float)displayMetrics.heightPixels, (float)displayMetrics.heightPixels);
            }
        }
        if (n != -1 || n2 != -1) {
            this.mActivity.getWindow().setLayout(n, n2);
        }
        obtainStyledAttributes.recycle();
    }
    
    private void callOnPanelClosed(final int n, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && n >= 0 && n < this.mPanels.length) {
                panelFeatureState = this.mPanels[n];
            }
            if (panelFeatureState != null) {
                menu = (Menu)panelFeatureState.menu;
            }
        }
        if (panelFeatureState != null && !panelFeatureState.isOpen) {
            return;
        }
        this.getWindowCallback().onPanelClosed(n, menu);
    }
    
    private void checkCloseActionMenu(final MenuBuilder menuBuilder) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        final WindowCallback windowCallback = this.getWindowCallback();
        if (windowCallback != null && !this.isDestroyed()) {
            windowCallback.onPanelClosed(8, (Menu)menuBuilder);
        }
        this.mClosingActionMenu = false;
    }
    
    private void closePanel(final PanelFeatureState panelFeatureState, final boolean b) {
        if (b && panelFeatureState.featureId == 0 && this.mDecorContentParent != null && this.mDecorContentParent.isOverflowMenuShowing()) {
            this.checkCloseActionMenu(panelFeatureState.menu);
        }
        else {
            if (panelFeatureState.isOpen && b) {
                this.callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
            }
            panelFeatureState.isPrepared = false;
            panelFeatureState.isHandled = false;
            panelFeatureState.isOpen = false;
            panelFeatureState.shownPanelView = null;
            panelFeatureState.refreshDecorView = true;
            if (this.mPreparedPanel == panelFeatureState) {
                this.mPreparedPanel = null;
            }
        }
    }
    
    private void doInvalidatePanelMenu(final int n) {
        final PanelFeatureState panelState = this.getPanelState(n, true);
        if (panelState.menu != null) {
            final Bundle frozenActionViewState = new Bundle();
            panelState.menu.saveActionViewStates(frozenActionViewState);
            if (frozenActionViewState.size() > 0) {
                panelState.frozenActionViewState = frozenActionViewState;
            }
            panelState.menu.stopDispatchingItemsChanged();
            panelState.menu.clear();
        }
        panelState.refreshMenuContent = true;
        panelState.refreshDecorView = true;
        if ((n == 8 || n == 0) && this.mDecorContentParent != null) {
            final PanelFeatureState panelState2 = this.getPanelState(0, false);
            if (panelState2 != null) {
                panelState2.isPrepared = false;
                this.preparePanel(panelState2, null);
            }
        }
    }
    
    private void ensureToolbarListMenuPresenter() {
        if (this.mToolbarListMenuPresenter == null) {
            final TypedValue typedValue = new TypedValue();
            this.mActivity.getTheme().resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            final ActionBarActivity mActivity = this.mActivity;
            int n;
            if (typedValue.resourceId != 0) {
                n = typedValue.resourceId;
            }
            else {
                n = R.style.Theme_AppCompat_CompactMenu;
            }
            this.mToolbarListMenuPresenter = new ListMenuPresenter((Context)new ContextThemeWrapper((Context)mActivity, n), R.layout.abc_list_menu_item_layout);
        }
    }
    
    private PanelFeatureState findMenuPanel(final Menu menu) {
        final PanelFeatureState[] mPanels = this.mPanels;
        if (mPanels != null) {
            final int length = mPanels.length;
        }
        else {
            final int length = 0;
        }
        for (final PanelFeatureState panelFeatureState : mPanels) {
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }
    
    private PanelFeatureState getPanelState(final int n, final boolean b) {
        PanelFeatureState[] mPanels = this.mPanels;
        if (mPanels == null || mPanels.length <= n) {
            final PanelFeatureState[] mPanels2 = new PanelFeatureState[n + 1];
            if (mPanels != null) {
                System.arraycopy(mPanels, 0, mPanels2, 0, mPanels.length);
            }
            mPanels = mPanels2;
            this.mPanels = mPanels2;
        }
        PanelFeatureState panelFeatureState = mPanels[n];
        if (panelFeatureState == null) {
            panelFeatureState = new PanelFeatureState(n);
            mPanels[n] = panelFeatureState;
        }
        return panelFeatureState;
    }
    
    private boolean initializePanelContent(final PanelFeatureState panelFeatureState) {
        if (panelFeatureState.menu != null) {
            if (this.mPanelMenuPresenterCallback == null) {
                this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
            }
            panelFeatureState.shownPanelView = (View)panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
            if (panelFeatureState.shownPanelView != null) {
                return true;
            }
        }
        return false;
    }
    
    private void initializePanelDecor(final PanelFeatureState panelFeatureState) {
        panelFeatureState.decorView = this.mWindowDecor;
        panelFeatureState.setStyle(this.getActionBarThemedContext());
    }
    
    private boolean initializePanelMenu(final PanelFeatureState panelFeatureState) {
        Object mActivity = this.mActivity;
        if ((panelFeatureState.featureId == 0 || panelFeatureState.featureId == 8) && this.mDecorContentParent != null) {
            final TypedValue typedValue = new TypedValue();
            final Resources$Theme theme = ((Context)mActivity).getTheme();
            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            Resources$Theme to;
            if (typedValue.resourceId != 0) {
                to = ((Context)mActivity).getResources().newTheme();
                to.setTo(theme);
                to.applyStyle(typedValue.resourceId, true);
                to.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            }
            else {
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                to = null;
            }
            if (typedValue.resourceId != 0) {
                if (to == null) {
                    to = ((Context)mActivity).getResources().newTheme();
                    to.setTo(theme);
                }
                to.applyStyle(typedValue.resourceId, true);
            }
            if (to != null) {
                final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper((Context)mActivity, 0);
                ((Context)contextThemeWrapper).getTheme().setTo(to);
                mActivity = contextThemeWrapper;
            }
        }
        final MenuBuilder menu = new MenuBuilder((Context)mActivity);
        menu.setCallback((MenuBuilder.Callback)this);
        panelFeatureState.setMenu(menu);
        return true;
    }
    
    private void invalidatePanelMenu(final int n) {
        this.mInvalidatePanelMenuFeatures |= 1 << n;
        if (!this.mInvalidatePanelMenuPosted && this.mWindowDecor != null) {
            ViewCompat.postOnAnimation((View)this.mWindowDecor, this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuPosted = true;
        }
    }
    
    private void openPanel(final int n, final KeyEvent keyEvent) {
        if (n == 0 && this.mDecorContentParent != null && this.mDecorContentParent.canShowOverflowMenu() && !ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get((Context)this.mActivity))) {
            this.mDecorContentParent.showOverflowMenu();
            return;
        }
        this.openPanel(this.getPanelState(n, true), keyEvent);
    }
    
    private void openPanel(final PanelFeatureState panelFeatureState, final KeyEvent keyEvent) {
        if (!panelFeatureState.isOpen && !this.isDestroyed()) {
            if (panelFeatureState.featureId == 0) {
                final ActionBarActivity mActivity = this.mActivity;
                boolean b;
                if ((0xF & ((Context)mActivity).getResources().getConfiguration().screenLayout) == 0x4) {
                    b = true;
                }
                else {
                    b = false;
                }
                boolean b2;
                if (((Context)mActivity).getApplicationInfo().targetSdkVersion >= 11) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (b && b2) {
                    return;
                }
            }
            final WindowCallback windowCallback = this.getWindowCallback();
            if (windowCallback != null && !windowCallback.onMenuOpened(panelFeatureState.featureId, (Menu)panelFeatureState.menu)) {
                this.closePanel(panelFeatureState, true);
                return;
            }
            if (this.preparePanel(panelFeatureState, keyEvent)) {
                if (panelFeatureState.decorView == null || panelFeatureState.refreshDecorView) {
                    this.initializePanelDecor(panelFeatureState);
                }
                if (this.initializePanelContent(panelFeatureState) && panelFeatureState.hasPanelItems()) {
                    panelFeatureState.isHandled = false;
                    panelFeatureState.isOpen = true;
                }
            }
        }
    }
    
    private boolean preparePanel(final PanelFeatureState mPreparedPanel, final KeyEvent keyEvent) {
        if (!this.isDestroyed()) {
            if (mPreparedPanel.isPrepared) {
                return true;
            }
            if (this.mPreparedPanel != null && this.mPreparedPanel != mPreparedPanel) {
                this.closePanel(this.mPreparedPanel, false);
            }
            boolean b;
            if (mPreparedPanel.featureId == 0 || mPreparedPanel.featureId == 8) {
                b = true;
            }
            else {
                b = false;
            }
            if (b && this.mDecorContentParent != null) {
                this.mDecorContentParent.setMenuPrepared();
            }
            if (mPreparedPanel.menu == null || mPreparedPanel.refreshMenuContent) {
                if (mPreparedPanel.menu == null && (!this.initializePanelMenu(mPreparedPanel) || mPreparedPanel.menu == null)) {
                    return false;
                }
                if (b && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu((Menu)mPreparedPanel.menu, this.mActionMenuPresenterCallback);
                }
                mPreparedPanel.menu.stopDispatchingItemsChanged();
                if (!this.getWindowCallback().onCreatePanelMenu(mPreparedPanel.featureId, (Menu)mPreparedPanel.menu)) {
                    mPreparedPanel.setMenu(null);
                    if (b && this.mDecorContentParent != null) {
                        this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                        return false;
                    }
                    return false;
                }
                else {
                    mPreparedPanel.refreshMenuContent = false;
                }
            }
            mPreparedPanel.menu.stopDispatchingItemsChanged();
            if (mPreparedPanel.frozenActionViewState != null) {
                mPreparedPanel.menu.restoreActionViewStates(mPreparedPanel.frozenActionViewState);
                mPreparedPanel.frozenActionViewState = null;
            }
            if (!this.getWindowCallback().onPreparePanel(0, null, (Menu)mPreparedPanel.menu)) {
                if (b && this.mDecorContentParent != null) {
                    this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                }
                mPreparedPanel.menu.startDispatchingItemsChanged();
                return false;
            }
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            mPreparedPanel.qwertyMode = (KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
            mPreparedPanel.menu.setQwertyMode(mPreparedPanel.qwertyMode);
            mPreparedPanel.menu.startDispatchingItemsChanged();
            mPreparedPanel.isPrepared = true;
            mPreparedPanel.isHandled = false;
            this.mPreparedPanel = mPreparedPanel;
            return true;
        }
        return false;
    }
    
    private void reopenMenu(final MenuBuilder menuBuilder, final boolean b) {
        if (this.mDecorContentParent != null && this.mDecorContentParent.canShowOverflowMenu() && (!ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get((Context)this.mActivity)) || this.mDecorContentParent.isOverflowMenuShowPending())) {
            final WindowCallback windowCallback = this.getWindowCallback();
            if (!this.mDecorContentParent.isOverflowMenuShowing() || !b) {
                if (windowCallback != null && !this.isDestroyed()) {
                    if (this.mInvalidatePanelMenuPosted && (0x1 & this.mInvalidatePanelMenuFeatures) != 0x0) {
                        this.mWindowDecor.removeCallbacks(this.mInvalidatePanelMenuRunnable);
                        this.mInvalidatePanelMenuRunnable.run();
                    }
                    final PanelFeatureState panelState = this.getPanelState(0, true);
                    if (panelState.menu != null && !panelState.refreshMenuContent && windowCallback.onPreparePanel(0, null, (Menu)panelState.menu)) {
                        windowCallback.onMenuOpened(8, (Menu)panelState.menu);
                        this.mDecorContentParent.showOverflowMenu();
                    }
                }
            }
            else {
                this.mDecorContentParent.hideOverflowMenu();
                if (!this.isDestroyed()) {
                    this.mActivity.onPanelClosed(8, (Menu)this.getPanelState(0, true).menu);
                }
            }
            return;
        }
        final PanelFeatureState panelState2 = this.getPanelState(0, true);
        panelState2.refreshDecorView = true;
        this.closePanel(panelState2, false);
        this.openPanel(panelState2, null);
    }
    
    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("supportRequestWindowFeature() must be called before adding content");
        }
    }
    
    private int updateStatusGuard(int n) {
        final ActionBarContextView mActionModeView = this.mActionModeView;
        int n2 = 0;
        if (mActionModeView != null) {
            final boolean b = this.mActionModeView.getLayoutParams() instanceof ViewGroup$MarginLayoutParams;
            n2 = 0;
            if (b) {
                final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)this.mActionModeView.getLayoutParams();
                int n4;
                if (this.mActionModeView.isShown()) {
                    if (this.mTempRect1 == null) {
                        this.mTempRect1 = new Rect();
                        this.mTempRect2 = new Rect();
                    }
                    final Rect mTempRect1 = this.mTempRect1;
                    final Rect mTempRect2 = this.mTempRect2;
                    mTempRect1.set(0, n, 0, 0);
                    ViewUtils.computeFitSystemWindows((View)this.mSubDecor, mTempRect1, mTempRect2);
                    int n3;
                    if (mTempRect2.top == 0) {
                        n3 = n;
                    }
                    else {
                        n3 = 0;
                    }
                    final int topMargin = layoutParams.topMargin;
                    n4 = 0;
                    if (topMargin != n3) {
                        n4 = 1;
                        layoutParams.topMargin = n;
                        if (this.mStatusGuard == null) {
                            (this.mStatusGuard = new View((Context)this.mActivity)).setBackgroundColor(this.mActivity.getResources().getColor(R.color.abc_input_method_navigation_guard));
                            this.mSubDecor.addView(this.mStatusGuard, -1, new ViewGroup$LayoutParams(-1, n));
                        }
                        else {
                            final ViewGroup$LayoutParams layoutParams2 = this.mStatusGuard.getLayoutParams();
                            if (layoutParams2.height != n) {
                                layoutParams2.height = n;
                                this.mStatusGuard.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                    if (this.mStatusGuard != null) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    if (!this.mOverlayActionMode && n2 != 0) {
                        n = 0;
                    }
                }
                else {
                    final int topMargin2 = layoutParams.topMargin;
                    n4 = 0;
                    n2 = 0;
                    if (topMargin2 != 0) {
                        n4 = 1;
                        layoutParams.topMargin = 0;
                        n2 = 0;
                    }
                }
                if (n4 != 0) {
                    this.mActionModeView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                }
            }
        }
        if (this.mStatusGuard != null) {
            final View mStatusGuard = this.mStatusGuard;
            int visibility = 0;
            if (n2 == 0) {
                visibility = 8;
            }
            mStatusGuard.setVisibility(visibility);
        }
        return n;
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.ensureSubDecor();
        ((ViewGroup)this.mActivity.findViewById(16908290)).addView(view, viewGroup$LayoutParams);
        this.mActivity.onSupportContentChanged();
    }
    
    public ActionBar createSupportActionBar() {
        this.ensureSubDecor();
        final WindowDecorActionBar windowDecorActionBar = new WindowDecorActionBar(this.mActivity, this.mOverlayActionBar);
        windowDecorActionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
        return windowDecorActionBar;
    }
    
    @Override
    View createView(final String s, @NonNull final Context context, @NonNull final AttributeSet set) {
        if (Build$VERSION.SDK_INT < 21) {
            switch (s) {
                case "EditText": {
                    return (View)new TintEditText(context, set);
                }
                case "Spinner": {
                    return (View)new TintSpinner(context, set);
                }
                case "CheckBox": {
                    return (View)new TintCheckBox(context, set);
                }
                case "RadioButton": {
                    return (View)new TintRadioButton(context, set);
                }
                case "CheckedTextView": {
                    return (View)new TintCheckedTextView(context, set);
                }
            }
        }
        return null;
    }
    
    final void ensureSubDecor() {
        if (!this.mSubDecorInstalled) {
            if (this.mHasActionBar) {
                final TypedValue typedValue = new TypedValue();
                this.mActivity.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                Object mActivity;
                if (typedValue.resourceId != 0) {
                    mActivity = new ContextThemeWrapper((Context)this.mActivity, typedValue.resourceId);
                }
                else {
                    mActivity = this.mActivity;
                }
                this.mSubDecor = (ViewGroup)LayoutInflater.from((Context)mActivity).inflate(R.layout.abc_screen_toolbar, (ViewGroup)null);
                (this.mDecorContentParent = (DecorContentParent)this.mSubDecor.findViewById(R.id.decor_content_parent)).setWindowCallback(this.getWindowCallback());
                if (this.mOverlayActionBar) {
                    this.mDecorContentParent.initFeature(9);
                }
                if (this.mFeatureProgress) {
                    this.mDecorContentParent.initFeature(2);
                }
                if (this.mFeatureIndeterminateProgress) {
                    this.mDecorContentParent.initFeature(5);
                }
            }
            else {
                if (this.mOverlayActionMode) {
                    this.mSubDecor = (ViewGroup)LayoutInflater.from((Context)this.mActivity).inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup)null);
                }
                else {
                    this.mSubDecor = (ViewGroup)LayoutInflater.from((Context)this.mActivity).inflate(R.layout.abc_screen_simple, (ViewGroup)null);
                }
                if (Build$VERSION.SDK_INT >= 21) {
                    ViewCompat.setOnApplyWindowInsetsListener((View)this.mSubDecor, new OnApplyWindowInsetsListener() {
                        @Override
                        public WindowInsetsCompat onApplyWindowInsets(final View view, WindowInsetsCompat replaceSystemWindowInsets) {
                            final int systemWindowInsetTop = replaceSystemWindowInsets.getSystemWindowInsetTop();
                            final int access$300 = ActionBarActivityDelegateBase.this.updateStatusGuard(systemWindowInsetTop);
                            if (systemWindowInsetTop != access$300) {
                                replaceSystemWindowInsets = replaceSystemWindowInsets.replaceSystemWindowInsets(replaceSystemWindowInsets.getSystemWindowInsetLeft(), access$300, replaceSystemWindowInsets.getSystemWindowInsetRight(), replaceSystemWindowInsets.getSystemWindowInsetBottom());
                            }
                            return replaceSystemWindowInsets;
                        }
                    });
                }
                else {
                    ((FitWindowsViewGroup)this.mSubDecor).setOnFitSystemWindowsListener((FitWindowsViewGroup.OnFitSystemWindowsListener)new FitWindowsViewGroup.OnFitSystemWindowsListener() {
                        @Override
                        public void onFitSystemWindows(final Rect rect) {
                            rect.top = ActionBarActivityDelegateBase.this.updateStatusGuard(rect.top);
                        }
                    });
                }
            }
            ViewUtils.makeOptionalFitsSystemWindows((View)this.mSubDecor);
            this.mActivity.superSetContentView((View)this.mSubDecor);
            final View viewById = this.mActivity.findViewById(16908290);
            viewById.setId(-1);
            this.mActivity.findViewById(R.id.action_bar_activity_content).setId(16908290);
            if (viewById instanceof FrameLayout) {
                ((FrameLayout)viewById).setForeground((Drawable)null);
            }
            if (this.mTitleToSet != null && this.mDecorContentParent != null) {
                this.mDecorContentParent.setWindowTitle(this.mTitleToSet);
                this.mTitleToSet = null;
            }
            this.applyFixedSizeWindow();
            this.onSubDecorInstalled();
            this.mSubDecorInstalled = true;
            final PanelFeatureState panelState = this.getPanelState(0, false);
            if (!this.isDestroyed() && (panelState == null || panelState.menu == null)) {
                this.invalidatePanelMenu(8);
            }
        }
    }
    
    @Override
    int getHomeAsUpIndicatorAttrId() {
        return R.attr.homeAsUpIndicator;
    }
    
    public boolean onBackPressed() {
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        else {
            final ActionBar supportActionBar = this.getSupportActionBar();
            if (supportActionBar == null || !supportActionBar.collapseActionView()) {
                return false;
            }
        }
        return true;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        if (this.mHasActionBar && this.mSubDecorInstalled) {
            final ActionBar supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.onConfigurationChanged(configuration);
            }
        }
    }
    
    public void onContentChanged() {
    }
    
    @Override
    void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.mWindowDecor = (ViewGroup)this.mActivity.getWindow().getDecorView();
        if (NavUtils.getParentActivityName(this.mActivity) != null) {
            final ActionBar peekSupportActionBar = this.peekSupportActionBar();
            if (peekSupportActionBar != null) {
                peekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
                return;
            }
            this.mEnableDefaultActionBarUp = true;
        }
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return n != 0 && this.getWindowCallback().onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        final ActionMode mActionMode = this.mActionMode;
        View view = null;
        if (mActionMode == null) {
            final WindowCallback windowCallback = this.getWindowCallback();
            view = null;
            if (windowCallback != null) {
                view = windowCallback.onCreatePanelView(n);
            }
            if (view == null && this.mToolbarListMenuPresenter == null) {
                final PanelFeatureState panelState = this.getPanelState(n, true);
                this.openPanel(panelState, null);
                if (panelState.isOpen) {
                    view = panelState.shownPanelView;
                }
            }
        }
        return view;
    }
    
    @Override
    boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.onKeyShortcut(n, keyEvent);
    }
    
    @Override
    boolean onKeyShortcut(final int n, final KeyEvent keyEvent) {
        if (this.mPreparedPanel == null || !this.performPanelShortcut(this.mPreparedPanel, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.mPreparedPanel == null) {
                final PanelFeatureState panelState = this.getPanelState(0, true);
                this.preparePanel(panelState, keyEvent);
                final boolean performPanelShortcut = this.performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
                panelState.isPrepared = false;
                if (performPanelShortcut) {
                    return true;
                }
            }
            return false;
        }
        if (this.mPreparedPanel != null) {
            this.mPreparedPanel.isHandled = true;
        }
        return true;
    }
    
    @Override
    public boolean onMenuItemSelected(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        final WindowCallback windowCallback = this.getWindowCallback();
        if (windowCallback != null && !this.isDestroyed()) {
            final PanelFeatureState menuPanel = this.findMenuPanel((Menu)menuBuilder.getRootMenu());
            if (menuPanel != null) {
                return windowCallback.onMenuItemSelected(menuPanel.featureId, menuItem);
            }
        }
        return false;
    }
    
    @Override
    public void onMenuModeChange(final MenuBuilder menuBuilder) {
        this.reopenMenu(menuBuilder, true);
    }
    
    @Override
    boolean onMenuOpened(final int n, final Menu menu) {
        if (n == 8) {
            final ActionBar supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(true);
            }
            return true;
        }
        return this.mActivity.superOnMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        final PanelFeatureState panelState = this.getPanelState(n, false);
        if (panelState != null) {
            this.closePanel(panelState, false);
        }
        if (n == 8) {
            final ActionBar supportActionBar = this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
            }
        }
        else if (!this.isDestroyed()) {
            this.mActivity.superOnPanelClosed(n, menu);
        }
    }
    
    public void onPostResume() {
        final ActionBar supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return n != 0 && this.getWindowCallback().onPreparePanel(n, view, menu);
    }
    
    public void onStop() {
        final ActionBar supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }
    
    void onSubDecorInstalled() {
    }
    
    public void onTitleChanged(final CharSequence mTitleToSet) {
        if (this.mDecorContentParent != null) {
            this.mDecorContentParent.setWindowTitle(mTitleToSet);
            return;
        }
        if (this.getSupportActionBar() != null) {
            this.getSupportActionBar().setWindowTitle(mTitleToSet);
            return;
        }
        this.mTitleToSet = mTitleToSet;
    }
    
    final boolean performPanelShortcut(final PanelFeatureState panelFeatureState, final int n, final KeyEvent keyEvent, final int n2) {
        boolean performShortcut = false;
        if (keyEvent.isSystem()) {
            performShortcut = false;
        }
        else {
            Label_0063: {
                if (!panelFeatureState.isPrepared) {
                    final boolean preparePanel = this.preparePanel(panelFeatureState, keyEvent);
                    performShortcut = false;
                    if (!preparePanel) {
                        break Label_0063;
                    }
                }
                final MenuBuilder menu = panelFeatureState.menu;
                performShortcut = false;
                if (menu != null) {
                    performShortcut = panelFeatureState.menu.performShortcut(n, keyEvent, n2);
                }
            }
            if (performShortcut && (n2 & 0x1) == 0x0 && this.mDecorContentParent == null) {
                this.closePanel(panelFeatureState, true);
                return performShortcut;
            }
        }
        return performShortcut;
    }
    
    public void setContentView(final int n) {
        this.ensureSubDecor();
        final ViewGroup viewGroup = (ViewGroup)this.mActivity.findViewById(16908290);
        viewGroup.removeAllViews();
        this.mActivity.getLayoutInflater().inflate(n, viewGroup);
        this.mActivity.onSupportContentChanged();
    }
    
    public void setContentView(final View view) {
        this.ensureSubDecor();
        final ViewGroup viewGroup = (ViewGroup)this.mActivity.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mActivity.onSupportContentChanged();
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.ensureSubDecor();
        final ViewGroup viewGroup = (ViewGroup)this.mActivity.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, viewGroup$LayoutParams);
        this.mActivity.onSupportContentChanged();
    }
    
    @Override
    void setSupportActionBar(final Toolbar toolbar) {
        final ActionBar supportActionBar = this.getSupportActionBar();
        if (supportActionBar instanceof WindowDecorActionBar) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        if (supportActionBar instanceof ToolbarActionBar) {
            ((ToolbarActionBar)supportActionBar).setListMenuPresenter(null);
        }
        final ToolbarActionBar supportActionBar2 = new ToolbarActionBar(toolbar, this.mActivity.getTitle(), this.mActivity.getWindow(), this.mDefaultWindowCallback);
        this.ensureToolbarListMenuPresenter();
        supportActionBar2.setListMenuPresenter(this.mToolbarListMenuPresenter);
        this.setSupportActionBar(supportActionBar2);
        this.setWindowCallback(supportActionBar2.getWrappedWindowCallback());
        supportActionBar2.invalidateOptionsMenu();
    }
    
    @Override
    void setSupportProgress(final int n) {
    }
    
    @Override
    void setSupportProgressBarIndeterminate(final boolean b) {
    }
    
    @Override
    void setSupportProgressBarIndeterminateVisibility(final boolean b) {
    }
    
    @Override
    void setSupportProgressBarVisibility(final boolean b) {
    }
    
    public ActionMode startSupportActionMode(final ActionMode.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        final ActionModeCallbackWrapper actionModeCallbackWrapper = new ActionModeCallbackWrapper(callback);
        final ActionBar supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null) {
            this.mActionMode = supportActionBar.startActionMode(actionModeCallbackWrapper);
            if (this.mActionMode != null) {
                this.mActivity.onSupportActionModeStarted(this.mActionMode);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = this.startSupportActionModeFromWindow(actionModeCallbackWrapper);
        }
        return this.mActionMode;
    }
    
    @Override
    ActionMode startSupportActionModeFromWindow(final ActionMode.Callback callback) {
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        final ActionModeCallbackWrapper actionModeCallbackWrapper = new ActionModeCallbackWrapper(callback);
        final Context actionBarThemedContext = this.getActionBarThemedContext();
        if (this.mActionModeView == null) {
            if (this.mIsFloating) {
                this.mActionModeView = new ActionBarContextView(actionBarThemedContext);
                (this.mActionModePopup = new PopupWindow(actionBarThemedContext, (AttributeSet)null, R.attr.actionModePopupWindowStyle)).setContentView((View)this.mActionModeView);
                this.mActionModePopup.setWidth(-1);
                final TypedValue typedValue = new TypedValue();
                this.mActivity.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                this.mActionModeView.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, this.mActivity.getResources().getDisplayMetrics()));
                this.mActionModePopup.setHeight(-2);
                this.mShowActionModePopup = new Runnable() {
                    @Override
                    public void run() {
                        ActionBarActivityDelegateBase.this.mActionModePopup.showAtLocation((View)ActionBarActivityDelegateBase.this.mActionModeView, 55, 0, 0);
                    }
                };
            }
            else {
                final ViewStubCompat viewStubCompat = (ViewStubCompat)this.mActivity.findViewById(R.id.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.setLayoutInflater(LayoutInflater.from(actionBarThemedContext));
                    this.mActionModeView = (ActionBarContextView)viewStubCompat.inflate();
                }
            }
        }
        if (this.mActionModeView != null) {
            this.mActionModeView.killMode();
            final StandaloneActionMode mActionMode = new StandaloneActionMode(actionBarThemedContext, this.mActionModeView, actionModeCallbackWrapper, this.mActionModePopup == null);
            if (callback.onCreateActionMode(mActionMode, mActionMode.getMenu())) {
                mActionMode.invalidate();
                this.mActionModeView.initForMode(mActionMode);
                this.mActionModeView.setVisibility(0);
                this.mActionMode = mActionMode;
                if (this.mActionModePopup != null) {
                    this.mActivity.getWindow().getDecorView().post(this.mShowActionModePopup);
                }
                this.mActionModeView.sendAccessibilityEvent(32);
                if (this.mActionModeView.getParent() != null) {
                    ViewCompat.requestApplyInsets((View)this.mActionModeView.getParent());
                }
            }
            else {
                this.mActionMode = null;
            }
        }
        if (this.mActionMode != null && this.mActivity != null) {
            this.mActivity.onSupportActionModeStarted(this.mActionMode);
        }
        return this.mActionMode;
    }
    
    public void supportInvalidateOptionsMenu() {
        final ActionBar supportActionBar = this.getSupportActionBar();
        if (supportActionBar != null && supportActionBar.invalidateOptionsMenu()) {
            return;
        }
        this.invalidatePanelMenu(0);
    }
    
    public boolean supportRequestWindowFeature(final int n) {
        switch (n) {
            default: {
                return this.mActivity.requestWindowFeature(n);
            }
            case 8: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mHasActionBar = true;
            }
            case 9: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mOverlayActionBar = true;
            }
            case 10: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mOverlayActionMode = true;
            }
            case 2: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mFeatureProgress = true;
            }
            case 5: {
                this.throwFeatureRequestIfSubDecorInstalled();
                return this.mFeatureIndeterminateProgress = true;
            }
        }
    }
    
    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback
    {
        @Override
        public void onCloseMenu(final MenuBuilder menuBuilder, final boolean b) {
            ActionBarActivityDelegateBase.this.checkCloseActionMenu(menuBuilder);
        }
        
        @Override
        public boolean onOpenSubMenu(final MenuBuilder menuBuilder) {
            final WindowCallback windowCallback = ActionBarActivityDelegateBase.this.getWindowCallback();
            if (windowCallback != null) {
                windowCallback.onMenuOpened(8, (Menu)menuBuilder);
            }
            return true;
        }
    }
    
    private class ActionModeCallbackWrapper implements ActionMode.Callback
    {
        private ActionMode.Callback mWrapped;
        
        public ActionModeCallbackWrapper(final ActionMode.Callback mWrapped) {
            this.mWrapped = mWrapped;
        }
        
        @Override
        public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }
        
        @Override
        public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }
        
        @Override
        public void onDestroyActionMode(final ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            Label_0110: {
                if (ActionBarActivityDelegateBase.this.mActionModePopup == null) {
                    break Label_0110;
                }
                ActionBarActivityDelegateBase.this.mActivity.getWindow().getDecorView().removeCallbacks(ActionBarActivityDelegateBase.this.mShowActionModePopup);
                ActionBarActivityDelegateBase.this.mActionModePopup.dismiss();
            Label_0101_Outer:
                while (true) {
                    if (ActionBarActivityDelegateBase.this.mActionModeView != null) {
                        ActionBarActivityDelegateBase.this.mActionModeView.removeAllViews();
                    }
                    while (true) {
                        if (ActionBarActivityDelegateBase.this.mActivity == null) {
                            break Label_0101;
                        }
                        try {
                            ActionBarActivityDelegateBase.this.mActivity.onSupportActionModeFinished(ActionBarActivityDelegateBase.this.mActionMode);
                            ActionBarActivityDelegateBase.this.mActionMode = null;
                            return;
                            while (true) {
                                ActionBarActivityDelegateBase.this.mActionModeView.setVisibility(8);
                                ViewCompat.requestApplyInsets((View)ActionBarActivityDelegateBase.this.mActionModeView.getParent());
                                continue Label_0101_Outer;
                                continue;
                            }
                        }
                        // iftrue(Label_0054:, this.this$0.mActionModeView.getParent() == null)
                        // iftrue(Label_0054:, this.this$0.mActionModeView == null)
                        catch (AbstractMethodError abstractMethodError) {
                            continue;
                        }
                        break;
                    }
                    break;
                }
            }
        }
        
        @Override
        public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }
    }
    
    private static final class PanelFeatureState
    {
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        
        PanelFeatureState(final int featureId) {
            this.featureId = featureId;
            this.refreshDecorView = false;
        }
        
        void applyFrozenState() {
            if (this.menu != null && this.frozenMenuState != null) {
                this.menu.restorePresenterStates(this.frozenMenuState);
                this.frozenMenuState = null;
            }
        }
        
        public void clearMenuPresenters() {
            if (this.menu != null) {
                this.menu.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }
        
        MenuView getListMenuView(final MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                (this.listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, R.layout.abc_list_menu_item_layout)).setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }
        
        public boolean hasPanelItems() {
            return this.shownPanelView != null && this.listMenuPresenter.getAdapter().getCount() > 0;
        }
        
        void onRestoreInstanceState(final Parcelable parcelable) {
            final SavedState savedState = (SavedState)parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }
        
        Parcelable onSaveInstanceState() {
            final SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new Bundle();
                this.menu.savePresenterStates(savedState.menuState);
            }
            return (Parcelable)savedState;
        }
        
        void setMenu(final MenuBuilder menu) {
            if (menu != this.menu) {
                if (this.menu != null) {
                    this.menu.removeMenuPresenter(this.listMenuPresenter);
                }
                this.menu = menu;
                if (menu != null && this.listMenuPresenter != null) {
                    menu.addMenuPresenter(this.listMenuPresenter);
                }
            }
        }
        
        void setStyle(final Context context) {
            final TypedValue typedValue = new TypedValue();
            final Resources$Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            theme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme.applyStyle(typedValue.resourceId, true);
            }
            theme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme.applyStyle(typedValue.resourceId, true);
            }
            else {
                theme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
            }
            final ContextThemeWrapper listPresenterContext = new ContextThemeWrapper(context, 0);
            ((Context)listPresenterContext).getTheme().setTo(theme);
            this.listPresenterContext = (Context)listPresenterContext;
        }
        
        private static class SavedState implements Parcelable
        {
            public static final Parcelable$Creator<SavedState> CREATOR;
            int featureId;
            boolean isOpen;
            Bundle menuState;
            
            static {
                CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {
                    public SavedState createFromParcel(final Parcel parcel) {
                        return readFromParcel(parcel);
                    }
                    
                    public SavedState[] newArray(final int n) {
                        return new SavedState[n];
                    }
                };
            }
            
            private static SavedState readFromParcel(final Parcel parcel) {
                boolean isOpen = true;
                final SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                if (parcel.readInt() != (isOpen ? 1 : 0)) {
                    isOpen = false;
                }
                savedState.isOpen = isOpen;
                if (savedState.isOpen) {
                    savedState.menuState = parcel.readBundle();
                }
                return savedState;
            }
            
            public int describeContents() {
                return 0;
            }
            
            public void writeToParcel(final Parcel parcel, final int n) {
                parcel.writeInt(this.featureId);
                int n2;
                if (this.isOpen) {
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                parcel.writeInt(n2);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }
        }
    }
    
    private final class PanelMenuPresenterCallback implements MenuPresenter.Callback
    {
        @Override
        public void onCloseMenu(MenuBuilder menuBuilder, final boolean b) {
            final Object rootMenu = menuBuilder.getRootMenu();
            boolean b2;
            if (rootMenu != menuBuilder) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            final ActionBarActivityDelegateBase this$0 = ActionBarActivityDelegateBase.this;
            if (b2) {
                menuBuilder = (MenuBuilder)rootMenu;
            }
            final PanelFeatureState access$600 = this$0.findMenuPanel((Menu)menuBuilder);
            if (access$600 != null) {
                if (!b2) {
                    ActionBarActivityDelegateBase.this.mActivity.closeOptionsMenu();
                    ActionBarActivityDelegateBase.this.closePanel(access$600, b);
                    return;
                }
                ActionBarActivityDelegateBase.this.callOnPanelClosed(access$600.featureId, access$600, (Menu)rootMenu);
                ActionBarActivityDelegateBase.this.closePanel(access$600, true);
            }
        }
        
        @Override
        public boolean onOpenSubMenu(final MenuBuilder menuBuilder) {
            if (menuBuilder == null && ActionBarActivityDelegateBase.this.mHasActionBar) {
                final WindowCallback windowCallback = ActionBarActivityDelegateBase.this.getWindowCallback();
                if (windowCallback != null && !ActionBarActivityDelegateBase.this.isDestroyed()) {
                    windowCallback.onMenuOpened(8, (Menu)menuBuilder);
                }
            }
            return true;
        }
    }
}
