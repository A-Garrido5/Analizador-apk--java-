// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.widget.Toast;
import android.support.v4.view.ViewCompat;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.view.View;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.support.v7.appcompat.R$styleable;
import android.support.v7.appcompat.R$bool;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ListPopupWindow$ForwardingListener;
import android.support.v7.widget.ActionMenuView$ActionMenuChildView;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.support.v7.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements MenuView$ItemView, View$OnClickListener, View$OnLongClickListener, ActionMenuView$ActionMenuChildView
{
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private ListPopupWindow$ForwardingListener mForwardingListener;
    private Drawable mIcon;
    private MenuItemImpl mItemData;
    private MenuBuilder$ItemInvoker mItemInvoker;
    private int mMaxIconSize;
    private int mMinWidth;
    private ActionMenuItemView$PopupCallback mPopupCallback;
    private int mSavedPaddingLeft;
    private CharSequence mTitle;
    
    public ActionMenuItemView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final Resources resources = context.getResources();
        this.mAllowTextWithIcon = resources.getBoolean(R$bool.abc_config_allowActionMenuItemTextWithIcon);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, R$styleable.ActionMenuItemView, n, 0);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.mMaxIconSize = (int)(0.5f + 32.0f * resources.getDisplayMetrics().density);
        this.setOnClickListener((View$OnClickListener)this);
        this.setOnLongClickListener((View$OnLongClickListener)this);
        this.mSavedPaddingLeft = -1;
    }
    
    static ActionMenuItemView$PopupCallback access$000(final ActionMenuItemView actionMenuItemView) {
        return actionMenuItemView.mPopupCallback;
    }
    
    static MenuBuilder$ItemInvoker access$100(final ActionMenuItemView actionMenuItemView) {
        return actionMenuItemView.mItemInvoker;
    }
    
    static MenuItemImpl access$200(final ActionMenuItemView actionMenuItemView) {
        return actionMenuItemView.mItemData;
    }
    
    private void updateTextButtonVisibility() {
        final boolean b = !TextUtils.isEmpty(this.mTitle) && true;
        boolean b2 = false;
        Label_0057: {
            if (this.mIcon != null) {
                final boolean showsTextAsAction = this.mItemData.showsTextAsAction();
                b2 = false;
                if (!showsTextAsAction) {
                    break Label_0057;
                }
                if (!this.mAllowTextWithIcon) {
                    final boolean mExpandedFormat = this.mExpandedFormat;
                    b2 = false;
                    if (!mExpandedFormat) {
                        break Label_0057;
                    }
                }
            }
            b2 = true;
        }
        CharSequence mTitle;
        if (b & b2) {
            mTitle = this.mTitle;
        }
        else {
            mTitle = null;
        }
        this.setText(mTitle);
    }
    
    @Override
    public MenuItemImpl getItemData() {
        return this.mItemData;
    }
    
    public boolean hasText() {
        return !TextUtils.isEmpty(this.getText());
    }
    
    @Override
    public void initialize(final MenuItemImpl mItemData, final int n) {
        this.mItemData = mItemData;
        this.setIcon(mItemData.getIcon());
        this.setTitle(mItemData.getTitleForItemView(this));
        this.setId(mItemData.getItemId());
        int visibility;
        if (mItemData.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
        this.setEnabled(mItemData.isEnabled());
        if (mItemData.hasSubMenu() && this.mForwardingListener == null) {
            this.mForwardingListener = new ActionMenuItemView$ActionMenuItemForwardingListener(this);
        }
    }
    
    public boolean needsDividerAfter() {
        return this.hasText();
    }
    
    public boolean needsDividerBefore() {
        return this.hasText() && this.mItemData.getIcon() == null;
    }
    
    public void onClick(final View view) {
        if (this.mItemInvoker != null) {
            this.mItemInvoker.invokeItem(this.mItemData);
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.mAllowTextWithIcon = this.getContext().getResources().getBoolean(R$bool.abc_config_allowActionMenuItemTextWithIcon);
        this.updateTextButtonVisibility();
    }
    
    public boolean onLongClick(final View view) {
        if (this.hasText()) {
            return false;
        }
        final int[] array = new int[2];
        final Rect rect = new Rect();
        this.getLocationOnScreen(array);
        this.getWindowVisibleDisplayFrame(rect);
        final Context context = this.getContext();
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int n = array[1] + height / 2;
        int n2 = array[0] + width / 2;
        if (ViewCompat.getLayoutDirection(view) == 0) {
            n2 = context.getResources().getDisplayMetrics().widthPixels - n2;
        }
        final Toast text = Toast.makeText(context, this.mItemData.getTitle(), 0);
        Label_0144: {
            if (n < rect.height()) {
                text.setGravity(8388661, n2, height);
                if (MenuBuilder.a == 0) {
                    break Label_0144;
                }
            }
            text.setGravity(81, 0, height);
        }
        text.show();
        return true;
    }
    
    protected void onMeasure(final int n, final int n2) {
        final boolean hasText = this.hasText();
        if (hasText && this.mSavedPaddingLeft >= 0) {
            super.setPadding(this.mSavedPaddingLeft, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        super.onMeasure(n, n2);
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int measuredWidth = this.getMeasuredWidth();
        int n3;
        if (mode == Integer.MIN_VALUE) {
            n3 = Math.min(size, this.mMinWidth);
        }
        else {
            n3 = this.mMinWidth;
        }
        if (mode != 1073741824 && this.mMinWidth > 0 && measuredWidth < n3) {
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(n3, 1073741824), n2);
        }
        if (!hasText && this.mIcon != null) {
            super.setPadding((this.getMeasuredWidth() - this.mIcon.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return (this.mItemData.hasSubMenu() && this.mForwardingListener != null && this.mForwardingListener.onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    @Override
    public boolean prefersCondensedTitle() {
        return true;
    }
    
    public void setIcon(final Drawable mIcon) {
        this.mIcon = mIcon;
        if (mIcon != null) {
            int n = mIcon.getIntrinsicWidth();
            int n2 = mIcon.getIntrinsicHeight();
            if (n > this.mMaxIconSize) {
                final float n3 = this.mMaxIconSize / n;
                n = this.mMaxIconSize;
                n2 *= (int)n3;
            }
            if (n2 > this.mMaxIconSize) {
                final float n4 = this.mMaxIconSize / n2;
                n2 = this.mMaxIconSize;
                n *= (int)n4;
            }
            mIcon.setBounds(0, 0, n, n2);
        }
        this.setCompoundDrawables(mIcon, (Drawable)null, (Drawable)null, (Drawable)null);
        this.updateTextButtonVisibility();
    }
    
    public void setItemInvoker(final MenuBuilder$ItemInvoker mItemInvoker) {
        this.mItemInvoker = mItemInvoker;
    }
    
    public void setPadding(final int mSavedPaddingLeft, final int n, final int n2, final int n3) {
        super.setPadding(this.mSavedPaddingLeft = mSavedPaddingLeft, n, n2, n3);
    }
    
    public void setPopupCallback(final ActionMenuItemView$PopupCallback mPopupCallback) {
        this.mPopupCallback = mPopupCallback;
    }
    
    public void setTitle(final CharSequence mTitle) {
        this.setContentDescription(this.mTitle = mTitle);
        this.updateTextButtonVisibility();
    }
}
