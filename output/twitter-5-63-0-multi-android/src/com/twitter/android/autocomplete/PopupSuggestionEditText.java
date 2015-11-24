// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.autocomplete;

import android.view.KeyEvent;
import android.widget.AdapterView;
import android.graphics.Rect;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.ListView;
import com.twitter.internal.android.widget.DropDownListView;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

public class PopupSuggestionEditText extends ListViewSuggestionEditText
{
    private final PopupWindow c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;
    private boolean h;
    
    public PopupSuggestionEditText(final Context context) {
        this(context, null);
    }
    
    public PopupSuggestionEditText(final Context context, final AttributeSet set) {
        this(context, set, 2130772057);
    }
    
    public PopupSuggestionEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.PopupSuggestionEditText, n, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.e = obtainStyledAttributes.getBoolean(3, false);
        this.d = obtainStyledAttributes.getBoolean(2, true);
        final DropDownListView dropDownListView = new DropDownListView(context, null, 2130772056);
        this.setListView(dropDownListView);
        final PopupWindow c = new PopupWindow(context, set, 16843519);
        c.setSoftInputMode(16);
        c.setOutsideTouchable(true);
        c.setContentView((View)dropDownListView);
        this.c = c;
        obtainStyledAttributes.recycle();
    }
    
    private void d() {
        if (this.getWindowVisibility() != 0 || this.getVisibility() != 0) {
            this.h = true;
            return;
        }
        int width;
        if (this.e) {
            width = this.getRootView().getWidth();
        }
        else {
            width = this.getWidth();
        }
        final PopupWindow c = this.c;
        if (c.isShowing()) {
            if (this.d) {
                c.update((View)this, this.f, this.g, width, 0);
            }
        }
        else {
            c.setWidth(width);
            c.setWindowLayoutMode(0, -2);
            c.setInputMethodMode(1);
            if (this.d) {
                c.showAsDropDown((View)this, this.f, this.g);
            }
            else {
                c.setWindowLayoutMode(0, 0);
                final Rect rect = new Rect();
                this.getWindowVisibleDisplayFrame(rect);
                final int[] array = new int[2];
                this.getLocationInWindow(array);
                c.setHeight(array[1] - rect.top);
                c.showAsDropDown((View)this, this.f, this.g);
            }
        }
        this.a.setSelectionAfterHeaderView();
        this.h = false;
    }
    
    @Override
    protected boolean a(final Object o, final ln ln) {
        final boolean a = super.a(o, ln);
        boolean b = false;
        if (a) {
            if (ln.a() > 0) {
                this.d();
            }
            else {
                this.c.dismiss();
                this.h = false;
            }
            b = true;
        }
        return b;
    }
    
    @Override
    protected boolean a(final boolean b, final int n) {
        boolean b2 = true;
        if (b) {
            this.c.setInputMethodMode(2);
        }
        else {
            final boolean b3 = !this.c.isAboveAnchor() && b2;
            final int selectedItemPosition = this.a.getSelectedItemPosition();
            if (b3 && n == 20 && selectedItemPosition == this.b.getCount()) {
                return b2;
            }
            if (!b3 && n == 19 && selectedItemPosition == 0) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h) {
            this.d();
        }
    }
    
    protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        if (!b) {
            this.c();
        }
    }
    
    @Override
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        super.onItemClick(adapterView, view, n, n2);
        this.c();
    }
    
    @Override
    public boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.a()) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                this.getKeyDispatcherState().startTracking(keyEvent, (Object)this);
                return true;
            }
            if (keyEvent.getAction() == 1) {
                this.getKeyDispatcherState().handleUpEvent(keyEvent);
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.c();
                    return true;
                }
            }
        }
        return super.onKeyPreIme(n, keyEvent);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (!b) {
            this.c();
        }
    }
    
    protected boolean setFrame(final int n, final int n2, final int n3, final int n4) {
        final boolean setFrame = super.setFrame(n, n2, n3, n4);
        if (this.a()) {
            this.d();
        }
        return setFrame;
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        if (this.h && visibility == 0) {
            this.d();
        }
    }
}
