// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.MenuBuilder$Callback;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.appcompat.R$id;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;
import android.support.v7.widget.Toolbar$LayoutParams;
import android.util.Log;
import android.view.Menu;
import android.content.Context;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewCompat;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.support.v7.appcompat.R$attr;
import android.support.v7.appcompat.R$styleable;
import android.support.v7.appcompat.R$drawable;
import android.support.v7.appcompat.R$string;
import android.view.Window$Callback;
import android.support.v7.widget.Toolbar;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.support.v7.widget.ActionMenuPresenter;

public class ToolbarWidgetWrapper implements DecorToolbar
{
    private static final String[] z;
    private ActionMenuPresenter mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    private boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private CharSequence mSubtitle;
    private View mTabView;
    private final TintManager mTintManager;
    private CharSequence mTitle;
    private boolean mTitleSet;
    private Toolbar mToolbar;
    private Window$Callback mWindowCallback;
    
    static {
        final String[] z2 = new String[4];
        String s = "i\u0014$vD\\\t\u001csBZ\u001e?MT\\\u000b;\u007fT";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = '=';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = '\u001a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "m\t$}TX\b8:BT\b;vGD[>tUH\u000b;uTI\u001e/";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "m\t$}TX\b8:BT\b;vGD[>tUH\u000b;uTI\u001e/";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "i\u0014$vD\\\t\u001csBZ\u001e?MT\\\u000b;\u007fT";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ToolbarWidgetWrapper(final Toolbar toolbar, final boolean b) {
        this(toolbar, b, R$string.abc_action_bar_up_description, R$drawable.abc_ic_ab_back_mtrl_am_alpha);
    }
    
    public ToolbarWidgetWrapper(final Toolbar mToolbar, final boolean b, final int defaultNavigationContentDescription, final int n) {
        this.mNavigationMode = 0;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = mToolbar;
        this.mTitle = mToolbar.getTitle();
        this.mSubtitle = mToolbar.getSubtitle();
        this.mTitleSet = (this.mTitle != null);
        this.mNavIcon = mToolbar.getNavigationIcon();
        Label_0482: {
            if (b) {
                final TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(mToolbar.getContext(), null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
                final CharSequence text = obtainStyledAttributes.getText(R$styleable.ActionBar_title);
                if (!TextUtils.isEmpty(text)) {
                    this.setTitle(text);
                }
                final CharSequence text2 = obtainStyledAttributes.getText(R$styleable.ActionBar_subtitle);
                if (!TextUtils.isEmpty(text2)) {
                    this.setSubtitle(text2);
                }
                final Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_logo);
                if (drawable != null) {
                    this.setLogo(drawable);
                }
                final Drawable drawable2 = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_icon);
                if (this.mNavIcon == null && drawable2 != null) {
                    this.setIcon(drawable2);
                }
                final Drawable drawable3 = obtainStyledAttributes.getDrawable(R$styleable.ActionBar_homeAsUpIndicator);
                if (drawable3 != null) {
                    this.setNavigationIcon(drawable3);
                }
                this.setDisplayOptions(obtainStyledAttributes.getInt(R$styleable.ActionBar_displayOptions, 0));
                final int resourceId = obtainStyledAttributes.getResourceId(R$styleable.ActionBar_customNavigationLayout, 0);
                if (resourceId != 0) {
                    this.setCustomView(LayoutInflater.from(this.mToolbar.getContext()).inflate(resourceId, (ViewGroup)this.mToolbar, false));
                    this.setDisplayOptions(0x10 | this.mDisplayOpts);
                }
                final int layoutDimension = obtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0);
                if (layoutDimension > 0) {
                    final ViewGroup$LayoutParams layoutParams = this.mToolbar.getLayoutParams();
                    layoutParams.height = layoutDimension;
                    this.mToolbar.setLayoutParams(layoutParams);
                }
                final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ActionBar_contentInsetStart, -1);
                final int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.ActionBar_contentInsetEnd, -1);
                if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                    this.mToolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
                }
                final int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.ActionBar_titleTextStyle, 0);
                if (resourceId2 != 0) {
                    this.mToolbar.setTitleTextAppearance(this.mToolbar.getContext(), resourceId2);
                }
                final int resourceId3 = obtainStyledAttributes.getResourceId(R$styleable.ActionBar_subtitleTextStyle, 0);
                if (resourceId3 != 0) {
                    this.mToolbar.setSubtitleTextAppearance(this.mToolbar.getContext(), resourceId3);
                }
                final int resourceId4 = obtainStyledAttributes.getResourceId(R$styleable.ActionBar_popupTheme, 0);
                if (resourceId4 != 0) {
                    this.mToolbar.setPopupTheme(resourceId4);
                }
                obtainStyledAttributes.recycle();
                this.mTintManager = obtainStyledAttributes.getTintManager();
                if (AdapterViewCompat.a == 0) {
                    break Label_0482;
                }
            }
            this.mDisplayOpts = this.detectDisplayOptions();
            this.mTintManager = TintManager.get(mToolbar.getContext());
        }
        this.setDefaultNavigationContentDescription(defaultNavigationContentDescription);
        this.mHomeDescription = this.mToolbar.getNavigationContentDescription();
        this.setDefaultNavigationIcon(this.mTintManager.getDrawable(n));
        this.mToolbar.setNavigationOnClickListener((View$OnClickListener)new ToolbarWidgetWrapper$1(this));
    }
    
    static Toolbar access$000(final ToolbarWidgetWrapper toolbarWidgetWrapper) {
        return toolbarWidgetWrapper.mToolbar;
    }
    
    static CharSequence access$100(final ToolbarWidgetWrapper toolbarWidgetWrapper) {
        return toolbarWidgetWrapper.mTitle;
    }
    
    static Window$Callback access$200(final ToolbarWidgetWrapper toolbarWidgetWrapper) {
        return toolbarWidgetWrapper.mWindowCallback;
    }
    
    static boolean access$300(final ToolbarWidgetWrapper toolbarWidgetWrapper) {
        return toolbarWidgetWrapper.mMenuPrepared;
    }
    
    private int detectDisplayOptions() {
        int n = 11;
        if (this.mToolbar.getNavigationIcon() != null) {
            n = 15;
        }
        return n;
    }
    
    private void setTitleInt(final CharSequence charSequence) {
        this.mTitle = charSequence;
        if ((0x8 & this.mDisplayOpts) != 0x0) {
            this.mToolbar.setTitle(charSequence);
        }
    }
    
    private void updateHomeAccessibility() {
        if ((0x4 & this.mDisplayOpts) != 0x0) {
            if (TextUtils.isEmpty(this.mHomeDescription)) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
                if (AdapterViewCompat.a == 0) {
                    return;
                }
            }
            this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
        }
    }
    
    private void updateNavigationIcon() {
        if ((0x4 & this.mDisplayOpts) != 0x0) {
            final Toolbar mToolbar = this.mToolbar;
            Drawable navigationIcon;
            if (this.mNavIcon != null) {
                navigationIcon = this.mNavIcon;
            }
            else {
                navigationIcon = this.mDefaultNavigationIcon;
            }
            mToolbar.setNavigationIcon(navigationIcon);
        }
    }
    
    private void updateToolbarLogo() {
        final int n = 0x2 & this.mDisplayOpts;
        Drawable logo = null;
        if (n != 0) {
            if ((0x1 & this.mDisplayOpts) != 0x0) {
                if (this.mLogo != null) {
                    logo = this.mLogo;
                }
                else {
                    logo = this.mIcon;
                }
            }
            else {
                logo = this.mIcon;
            }
        }
        this.mToolbar.setLogo(logo);
    }
    
    @Override
    public void animateToVisibility(final int n) {
        if (n == 8) {
            ViewCompat.animate((View)this.mToolbar).alpha(0.0f).setListener(new ToolbarWidgetWrapper$2(this));
            if (AdapterViewCompat.a == 0) {
                return;
            }
        }
        if (n == 0) {
            ViewCompat.animate((View)this.mToolbar).alpha(1.0f).setListener(new ToolbarWidgetWrapper$3(this));
        }
    }
    
    @Override
    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }
    
    @Override
    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }
    
    @Override
    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }
    
    @Override
    public Context getContext() {
        return this.mToolbar.getContext();
    }
    
    @Override
    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }
    
    @Override
    public Menu getMenu() {
        return this.mToolbar.getMenu();
    }
    
    @Override
    public int getNavigationMode() {
        return this.mNavigationMode;
    }
    
    @Override
    public ViewGroup getViewGroup() {
        return this.mToolbar;
    }
    
    @Override
    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }
    
    @Override
    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }
    
    @Override
    public void initIndeterminateProgress() {
        Log.i(ToolbarWidgetWrapper.z[3], ToolbarWidgetWrapper.z[2]);
    }
    
    @Override
    public void initProgress() {
        Log.i(ToolbarWidgetWrapper.z[0], ToolbarWidgetWrapper.z[1]);
    }
    
    @Override
    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }
    
    @Override
    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }
    
    @Override
    public boolean isSplit() {
        return false;
    }
    
    @Override
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        this.mToolbar.setBackgroundDrawable(backgroundDrawable);
    }
    
    @Override
    public void setCollapsible(final boolean collapsible) {
        this.mToolbar.setCollapsible(collapsible);
    }
    
    @Override
    public void setCustomView(final View mCustomView) {
        if (this.mCustomView != null && (0x10 & this.mDisplayOpts) != 0x0) {
            this.mToolbar.removeView(this.mCustomView);
        }
        if ((this.mCustomView = mCustomView) != null && (0x10 & this.mDisplayOpts) != 0x0) {
            this.mToolbar.addView(this.mCustomView);
        }
    }
    
    public void setDefaultNavigationContentDescription(final int mDefaultNavigationContentDescription) {
        if (mDefaultNavigationContentDescription != this.mDefaultNavigationContentDescription) {
            this.mDefaultNavigationContentDescription = mDefaultNavigationContentDescription;
            if (TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
                this.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            }
        }
    }
    
    public void setDefaultNavigationIcon(final Drawable mDefaultNavigationIcon) {
        if (this.mDefaultNavigationIcon != mDefaultNavigationIcon) {
            this.mDefaultNavigationIcon = mDefaultNavigationIcon;
            this.updateNavigationIcon();
        }
    }
    
    @Override
    public void setDisplayOptions(final int mDisplayOpts) {
        final int a = AdapterViewCompat.a;
        final int n = mDisplayOpts ^ this.mDisplayOpts;
        this.mDisplayOpts = mDisplayOpts;
        if (n != 0) {
            Label_0052: {
                if ((n & 0x4) != 0x0) {
                    if ((mDisplayOpts & 0x4) != 0x0) {
                        this.updateNavigationIcon();
                        this.updateHomeAccessibility();
                        if (a == 0) {
                            break Label_0052;
                        }
                    }
                    this.mToolbar.setNavigationIcon(null);
                }
            }
            if ((n & 0x3) != 0x0) {
                this.updateToolbarLogo();
            }
            Label_0118: {
                if ((n & 0x8) != 0x0) {
                    if ((mDisplayOpts & 0x8) != 0x0) {
                        this.mToolbar.setTitle(this.mTitle);
                        this.mToolbar.setSubtitle(this.mSubtitle);
                        if (a == 0) {
                            break Label_0118;
                        }
                    }
                    this.mToolbar.setTitle(null);
                    this.mToolbar.setSubtitle(null);
                }
            }
            if ((n & 0x10) != 0x0 && this.mCustomView != null) {
                if ((mDisplayOpts & 0x10) != 0x0) {
                    this.mToolbar.addView(this.mCustomView);
                    if (a == 0) {
                        return;
                    }
                }
                this.mToolbar.removeView(this.mCustomView);
            }
        }
    }
    
    @Override
    public void setEmbeddedTabView(final ScrollingTabContainerView mTabView) {
        if (this.mTabView != null && this.mTabView.getParent() == this.mToolbar) {
            this.mToolbar.removeView(this.mTabView);
        }
        if ((this.mTabView = (View)mTabView) != null && this.mNavigationMode == 2) {
            this.mToolbar.addView(this.mTabView, 0);
            final Toolbar$LayoutParams toolbar$LayoutParams = (Toolbar$LayoutParams)this.mTabView.getLayoutParams();
            toolbar$LayoutParams.width = -2;
            toolbar$LayoutParams.height = -2;
            toolbar$LayoutParams.gravity = 8388691;
            mTabView.setAllowCollapse(true);
        }
    }
    
    @Override
    public void setHomeButtonEnabled(final boolean b) {
    }
    
    @Override
    public void setIcon(final Drawable mIcon) {
        this.mIcon = mIcon;
        this.updateToolbarLogo();
    }
    
    public void setLogo(final Drawable mLogo) {
        this.mLogo = mLogo;
        this.updateToolbarLogo();
    }
    
    @Override
    public void setMenu(final Menu menu, final MenuPresenter$Callback callback) {
        if (this.mActionMenuPresenter == null) {
            (this.mActionMenuPresenter = new ActionMenuPresenter(this.mToolbar.getContext())).setId(R$id.action_menu_presenter);
        }
        this.mActionMenuPresenter.setCallback(callback);
        this.mToolbar.setMenu((MenuBuilder)menu, this.mActionMenuPresenter);
    }
    
    @Override
    public void setMenuCallbacks(final MenuPresenter$Callback menuPresenter$Callback, final MenuBuilder$Callback menuBuilder$Callback) {
        this.mToolbar.setMenuCallbacks(menuPresenter$Callback, menuBuilder$Callback);
    }
    
    @Override
    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }
    
    public void setNavigationContentDescription(final int n) {
        CharSequence string;
        if (n == 0) {
            string = null;
        }
        else {
            string = this.getContext().getString(n);
        }
        this.setNavigationContentDescription(string);
    }
    
    public void setNavigationContentDescription(final CharSequence mHomeDescription) {
        this.mHomeDescription = mHomeDescription;
        this.updateHomeAccessibility();
    }
    
    @Override
    public void setNavigationIcon(final Drawable mNavIcon) {
        this.mNavIcon = mNavIcon;
        this.updateNavigationIcon();
    }
    
    @Override
    public void setSubtitle(final CharSequence charSequence) {
        this.mSubtitle = charSequence;
        if ((0x8 & this.mDisplayOpts) != 0x0) {
            this.mToolbar.setSubtitle(charSequence);
        }
    }
    
    @Override
    public void setTitle(final CharSequence titleInt) {
        this.mTitleSet = true;
        this.setTitleInt(titleInt);
    }
    
    @Override
    public void setVisibility(final int visibility) {
        this.mToolbar.setVisibility(visibility);
    }
    
    @Override
    public void setWindowCallback(final Window$Callback mWindowCallback) {
        this.mWindowCallback = mWindowCallback;
    }
    
    @Override
    public void setWindowTitle(final CharSequence titleInt) {
        if (!this.mTitleSet) {
            this.setTitleInt(titleInt);
        }
    }
    
    @Override
    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }
}
