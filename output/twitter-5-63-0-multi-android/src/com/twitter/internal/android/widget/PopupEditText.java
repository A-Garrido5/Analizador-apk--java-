// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.text.Html;
import android.view.KeyEvent;
import android.widget.AdapterView;
import android.widget.Adapter;
import android.text.Editable;
import android.graphics.Rect;
import android.content.res.TypedArray;
import android.os.Looper;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.database.DataSetObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Filterable;
import android.widget.MultiAutoCompleteTextView$Tokenizer;
import android.widget.Filter$FilterListener;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import com.twitter.ui.widget.TwitterEditText;

public class PopupEditText extends TwitterEditText implements View$OnClickListener, AdapterView$OnItemClickListener, Filter$FilterListener
{
    public static final MultiAutoCompleteTextView$Tokenizer a;
    public static final Filterable b;
    boolean c;
    boolean d;
    private final PopupWindow e;
    private final DropDownListView f;
    private final ac g;
    private final int h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int l;
    private final int m;
    private View$OnClickListener n;
    private ad o;
    private ListAdapter p;
    private MultiAutoCompleteTextView$Tokenizer q;
    private Filterable r;
    private DataSetObserver s;
    private long t;
    private int u;
    private final boolean v;
    
    static {
        a = (MultiAutoCompleteTextView$Tokenizer)new y();
        b = (Filterable)new z();
    }
    
    public PopupEditText(final Context context) {
        this(context, null);
    }
    
    public PopupEditText(final Context context, final AttributeSet set) {
        this(context, set, kv.popupEditTextStyle);
    }
    
    public PopupEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = false;
        this.d = false;
        this.u = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.PopupEditText, n, 0);
        this.l = obtainStyledAttributes.getDimensionPixelOffset(li.PopupEditText_popupMenuXOffset, 0);
        this.m = obtainStyledAttributes.getDimensionPixelOffset(li.PopupEditText_popupMenuYOffset, 0);
        this.h = obtainStyledAttributes.getInteger(li.PopupEditText_threshold, 1);
        this.i = obtainStyledAttributes.getBoolean(li.PopupEditText_showPopupOnInitialFocus, false);
        this.k = obtainStyledAttributes.getBoolean(li.PopupEditText_showFullScreen, false);
        this.j = obtainStyledAttributes.getBoolean(li.PopupEditText_showAsDropdown, true);
        this.v = obtainStyledAttributes.getBoolean(li.PopupEditText_stripHtml, false);
        final DropDownListView dropDownListView = new DropDownListView(context, null, kv.popupEditListStyle);
        dropDownListView.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        this.f = dropDownListView;
        final PopupWindow e = new PopupWindow(context, set, 16843519);
        e.setSoftInputMode(16);
        e.setOutsideTouchable(true);
        e.setContentView((View)dropDownListView);
        this.e = e;
        super.setOnClickListener((View$OnClickListener)this);
        this.g = new ac(Looper.getMainLooper(), (Filter$FilterListener)this);
        obtainStyledAttributes.recycle();
    }
    
    public void a() {
        if (this.getWindowVisibility() == 8) {
            return;
        }
        if (this.p.getCount() == 0) {
            this.b();
            this.d = true;
            return;
        }
        int width;
        if (this.k) {
            width = this.getRootView().getWidth();
        }
        else {
            width = this.getWidth();
        }
        final PopupWindow e = this.e;
        if (e.isShowing()) {
            if (this.j) {
                e.update((View)this, this.l, this.m, width, 0);
            }
        }
        else {
            e.setWidth(width);
            e.setWindowLayoutMode(0, -2);
            e.setInputMethodMode(1);
            if (this.j) {
                e.showAsDropDown((View)this, this.l, this.m);
            }
            else {
                e.setWindowLayoutMode(0, 0);
                final Rect rect = new Rect();
                this.getWindowVisibleDisplayFrame(rect);
                final int[] array = new int[2];
                this.getLocationInWindow(array);
                e.setHeight(array[1] - rect.top);
                e.showAsDropDown((View)this, this.l, this.m);
            }
            if (this.o != null) {
                this.o.I_();
            }
        }
        this.f.setSelectionAfterHeaderView();
        this.c = true;
    }
    
    public void a(final MultiAutoCompleteTextView$Tokenizer q, final Filterable r, final long t) {
        if (q == null) {
            throw new IllegalArgumentException("tokenizer cannot be null.");
        }
        if (this.p == null) {
            throw new IllegalStateException("setAdapter must be called first with a non-null adapter");
        }
        this.r = r;
        this.q = q;
        this.t = t;
        this.g.a(r);
    }
    
    public void a(final boolean b) {
        if (this.q != null && this.r != null) {
            final int selectionEnd = this.getSelectionEnd();
            if (selectionEnd != -1) {
                final Editable text = this.getText();
                final int tokenStart = this.q.findTokenStart((CharSequence)text, selectionEnd);
                if (selectionEnd - tokenStart < this.h) {
                    this.b();
                    return;
                }
                final ac g = this.g;
                g.removeMessages(0);
                int n;
                if (b) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                g.sendMessageDelayed(g.obtainMessage(0, n, 0, (Object)((CharSequence)text).subSequence(tokenStart, selectionEnd)), this.t);
            }
        }
    }
    
    protected boolean a(final int n) {
        return false;
    }
    
    public void b() {
        this.e.dismiss();
        this.c = false;
        this.d = false;
        this.g.removeMessages(0);
    }
    
    public boolean c() {
        return this.c;
    }
    
    public boolean d() {
        return this.e.isShowing();
    }
    
    public Adapter getAdapter() {
        return (Adapter)this.p;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i && this.hasFocus() && !this.c) {
            this.a();
        }
    }
    
    public void onClick(final View view) {
        if (this.d()) {
            this.e.setInputMethodMode(1);
            this.a();
        }
        if (this.n != null) {
            this.n.onClick(view);
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }
    
    public void onFilterComplete(final int n) {
        final int selectionEnd = this.getSelectionEnd();
        if (selectionEnd - this.q.findTokenStart((CharSequence)this.getText(), selectionEnd) >= this.h) {
            this.a();
            return;
        }
        this.b();
    }
    
    protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        if (!b) {
            this.b();
        }
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (this.o != null) {
            this.o.a(n);
        }
        this.b();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        boolean onKeyDown = true;
        if (this.d()) {
            final DropDownListView f = this.f;
            if (n != 62 && (f.getSelectedItemPosition() >= 0 || (n != 66 && n != 23))) {
                final int selectedItemPosition = f.getSelectedItemPosition();
                final PopupWindow e = this.e;
                final boolean b = !e.isAboveAnchor() && onKeyDown;
                final ListAdapter p2 = this.p;
                int n2;
                int n3;
                if (p2 != null) {
                    final int count = p2.getCount();
                    n2 = 0;
                    n3 = count;
                }
                else {
                    n3 = Integer.MIN_VALUE;
                    n2 = Integer.MAX_VALUE;
                }
                if (f.onKeyDown(n, keyEvent)) {
                    e.setInputMethodMode(2);
                    f.requestFocusFromTouch();
                    this.a();
                    switch (n) {
                        case 19:
                        case 20:
                        case 23:
                        case 66: {
                            return onKeyDown;
                        }
                    }
                }
                else if (b && n == 20) {
                    if (selectedItemPosition == n3) {
                        return onKeyDown;
                    }
                }
                else if (!b && n == 19 && selectedItemPosition == n2) {
                    return onKeyDown;
                }
            }
        }
        onKeyDown = super.onKeyDown(n, keyEvent);
        return onKeyDown;
    }
    
    public boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.d()) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                this.getKeyDispatcherState().startTracking(keyEvent, (Object)this);
                return true;
            }
            if (keyEvent.getAction() == 1) {
                this.getKeyDispatcherState().handleUpEvent(keyEvent);
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.b();
                    return true;
                }
            }
        }
        return super.onKeyPreIme(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        final DropDownListView f = this.f;
        final int selectedItemPosition = f.getSelectedItemPosition();
        if (this.d() && selectedItemPosition >= 0) {
            return f.onKeyUp(n, keyEvent);
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    protected void onSelectionChanged(final int n, final int n2) {
        if (this.o != null) {
            this.o.a(n, n2);
        }
    }
    
    @Override
    protected void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        this.a(true);
    }
    
    public boolean onTextContextMenuItem(final int n) {
        final boolean onTextContextMenuItem = super.onTextContextMenuItem(n);
        if (this.v) {
            switch (n) {
                case 16908322: {
                    this.setText((CharSequence)Html.fromHtml(this.getText().toString()));
                    return onTextContextMenuItem;
                }
            }
        }
        return onTextContextMenuItem;
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        int n2 = 0;
        Label_0042: {
            switch (0xFF & motionEvent.getAction()) {
                case 0: {
                    final Drawable[] compoundDrawables = this.getCompoundDrawables();
                    final int n = (int)motionEvent.getX();
                    final int paddingLeft = this.getPaddingLeft();
                    final int paddingRight = this.getPaddingRight();
                    final int compoundPaddingLeft = this.getCompoundPaddingLeft();
                    final int compoundPaddingRight = this.getCompoundPaddingRight();
                    final int width = this.getWidth();
                    for (int i = 0; i < compoundDrawables.length; ++i) {
                        final Drawable drawable = compoundDrawables[i];
                        if (drawable != null) {
                            if (i == 0) {
                                if (n <= compoundPaddingLeft + (paddingLeft + drawable.getBounds().width())) {
                                    this.u = 0;
                                    break;
                                }
                            }
                            else if (i == 2 && n >= width - paddingRight - drawable.getBounds().width() - compoundPaddingRight) {
                                this.u = 2;
                                break;
                            }
                        }
                    }
                    n2 = 0;
                    break Label_0042;
                }
                case 1: {
                    if (this.u != -1) {
                        final int n3 = (int)motionEvent.getX();
                        final int n4 = (int)motionEvent.getY();
                        final Drawable drawable2 = this.getCompoundDrawables()[this.u];
                        boolean b;
                        if (n4 < this.getHeight() && n4 > 0) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        boolean b2 = false;
                        switch (this.u) {
                            default: {
                                b2 = false;
                                break;
                            }
                            case 0: {
                                if (n3 <= this.getPaddingLeft() + drawable2.getBounds().width() + this.getCompoundPaddingLeft()) {
                                    b2 = true;
                                    break;
                                }
                                b2 = false;
                                break;
                            }
                            case 2: {
                                if (n3 >= this.getWidth() - this.getPaddingRight() - drawable2.getBounds().width() - this.getCompoundPaddingRight()) {
                                    b2 = true;
                                    break;
                                }
                                b2 = false;
                                break;
                            }
                        }
                        if (b && b2 && this.a(this.u)) {
                            n2 = 1;
                        }
                        else {
                            n2 = 0;
                        }
                        this.u = -1;
                        break Label_0042;
                    }
                    break;
                }
                case 3: {
                    this.u = -1;
                    n2 = 0;
                    break Label_0042;
                }
            }
            n2 = 0;
        }
        if (n2 == 0) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            final boolean b3 = false;
            if (!onTouchEvent) {
                return b3;
            }
        }
        return true;
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (!b) {
            this.b();
        }
    }
    
    public void setAdapter(final ListAdapter listAdapter) {
        if (this.p != null) {
            this.p.unregisterDataSetObserver(this.s);
        }
        else {
            this.s = new ab(this);
        }
        this.f.setAdapter(listAdapter);
        listAdapter.registerDataSetObserver(this.s);
        this.p = listAdapter;
    }
    
    protected boolean setFrame(final int n, final int n2, final int n3, final int n4) {
        final boolean setFrame = super.setFrame(n, n2, n3, n4);
        if (this.d()) {
            this.a();
        }
        return setFrame;
    }
    
    public void setOnClickListener(final View$OnClickListener n) {
        this.n = n;
    }
    
    public void setPopupEditTextListener(final ad o) {
        this.o = o;
        this.g.a(o);
    }
}
