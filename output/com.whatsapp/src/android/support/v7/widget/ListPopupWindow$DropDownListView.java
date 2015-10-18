// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.widget.ListView;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.util.AttributeSet;
import android.support.v7.appcompat.R$attr;
import android.content.Context;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.internal.widget.ListViewCompat;

class ListPopupWindow$DropDownListView extends ListViewCompat
{
    private ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private ListViewAutoScrollHelper mScrollHelper;
    
    public ListPopupWindow$DropDownListView(final Context context, final boolean mHijackFocus) {
        super(context, null, R$attr.dropDownListViewStyle);
        this.mHijackFocus = mHijackFocus;
        this.setCacheColorHint(0);
    }
    
    static boolean access$502(final ListPopupWindow$DropDownListView listPopupWindow$DropDownListView, final boolean mListSelectionHidden) {
        return listPopupWindow$DropDownListView.mListSelectionHidden = mListSelectionHidden;
    }
    
    private void clearPressedItem() {
        this.setPressed(this.mDrawsInPressedState = false);
        this.drawableStateChanged();
        if (this.mClickAnimation != null) {
            this.mClickAnimation.cancel();
            this.mClickAnimation = null;
        }
    }
    
    private void clickPressedItem(final View view, final int n) {
        this.performItemClick(view, n, this.getItemIdAtPosition(n));
    }
    
    private void setPressedItem(final View view, final int selection, final float n, final float n2) {
        this.setPressed(this.mDrawsInPressedState = true);
        this.layoutChildren();
        this.setSelection(selection);
        this.positionSelectorLikeTouchCompat(selection, view, n, n2);
        this.setSelectorEnabled(false);
        this.refreshDrawableState();
    }
    
    public boolean hasFocus() {
        return this.mHijackFocus || super.hasFocus();
    }
    
    public boolean hasWindowFocus() {
        return this.mHijackFocus || super.hasWindowFocus();
    }
    
    public boolean isFocused() {
        return this.mHijackFocus || super.isFocused();
    }
    
    public boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }
    
    public boolean onForwardedEvent(final MotionEvent motionEvent, final int n) {
        final boolean a = LinearLayoutCompat.a;
        final int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        while (true) {
            Label_0256: {
                boolean b2 = false;
                Label_0133: {
                    final int n2;
                    final boolean b;
                    Label_0130: {
                        switch (actionMasked) {
                            default: {
                                n2 = 0;
                                b = true;
                                break;
                            }
                            case 3: {
                                if (a) {
                                    break Label_0130;
                                }
                                break Label_0256;
                            }
                            case 1: {
                                b2 = false;
                                break Label_0133;
                            }
                            case 2: {
                                b2 = true;
                                break Label_0133;
                            }
                        }
                    }
                    if (!b || n2 != 0) {
                        this.clearPressedItem();
                    }
                    if (b) {
                        if (this.mScrollHelper == null) {
                            this.mScrollHelper = new ListViewAutoScrollHelper(this);
                        }
                        this.mScrollHelper.setEnabled(true);
                        this.mScrollHelper.onTouch((View)this, motionEvent);
                        if (!a) {
                            return b;
                        }
                    }
                    if (this.mScrollHelper != null) {
                        this.mScrollHelper.setEnabled(false);
                    }
                    return b;
                }
                final int pointerIndex = motionEvent.findPointerIndex(n);
                if (pointerIndex < 0) {
                    if (!a) {
                        break Label_0256;
                    }
                    b2 = false;
                }
                final int n3 = (int)motionEvent.getX(pointerIndex);
                final int n4 = (int)motionEvent.getY(pointerIndex);
                final int pointToPosition = this.pointToPosition(n3, n4);
                if (pointToPosition == -1) {
                    if (!a) {
                        final boolean b = b2;
                        final int n2 = 1;
                        continue;
                    }
                    final int n2 = 1;
                }
                else {
                    final int n2 = 0;
                }
                final View child = this.getChildAt(pointToPosition - this.getFirstVisiblePosition());
                this.setPressedItem(child, pointToPosition, n3, n4);
                if (actionMasked == 1) {
                    this.clickPressedItem(child, pointToPosition);
                }
                boolean b = true;
                continue;
            }
            int n2 = 0;
            boolean b = false;
            continue;
        }
    }
    
    @Override
    protected boolean touchModeDrawsInPressedStateCompat() {
        return this.mDrawsInPressedState || super.touchModeDrawsInPressedStateCompat();
    }
}
