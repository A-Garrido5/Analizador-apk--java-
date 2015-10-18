// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.View;
import android.view.KeyEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnKeyListener;
import android.widget.ListView;

public final class DropDownListView extends ListView
{
    private View$OnKeyListener a;
    
    public DropDownListView(final Context context) {
        super(context);
    }
    
    public DropDownListView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public DropDownListView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        boolean b = super.dispatchKeyEvent(keyEvent);
        if (!b && this.a != null) {
            b = this.a.onKey((View)this, keyEvent.getKeyCode(), keyEvent);
        }
        return b;
    }
    
    public boolean hasFocus() {
        return true;
    }
    
    public boolean hasWindowFocus() {
        return true;
    }
    
    public boolean isFocused() {
        return true;
    }
    
    public boolean isInTouchMode() {
        return true;
    }
    
    public void setOnKeyListener(final View$OnKeyListener a) {
        this.a = a;
    }
}
