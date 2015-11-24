// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.widget.creditcard;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnKeyListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.widget.EditText;

public abstract class CardEntryBase extends EditText implements TextWatcher, View$OnClickListener, View$OnKeyListener
{
    protected f a;
    protected String b;
    protected Context c;
    private int d;
    private boolean e;
    
    public CardEntryBase(final Context c) {
        super(c);
        this.e = false;
        this.c = c;
        this.b();
        this.a();
    }
    
    public CardEntryBase(final Context c, final AttributeSet set) {
        super(c, set);
        this.e = false;
        this.c = c;
        this.b();
        this.a();
    }
    
    public CardEntryBase(final Context c, final AttributeSet set, final int n) {
        super(c, set, n);
        this.e = false;
        this.c = c;
        this.b();
        this.a();
    }
    
    public void a() {
        this.setGravity(17);
        this.setImeOptions(268435456);
        this.setBackgroundColor(17170445);
        this.setFocusableInTouchMode(false);
        this.setInputType(2);
        this.addTextChangedListener((TextWatcher)this);
        this.setOnKeyListener((View$OnKeyListener)this);
        this.setOnClickListener((View$OnClickListener)this);
    }
    
    public void b() {
        if (this.getHintResource() != 0) {
            this.setHint(this.getHintResource());
        }
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        this.b = charSequence.toString();
    }
    
    public void c() {
        if (this.getText().toString().length() == 0 && this.a != null) {
            this.a.setFocusToPrevious(this);
        }
    }
    
    public boolean d() {
        return this.e;
    }
    
    public Object getData() {
        if (this.d()) {
            return this.getDataImpl();
        }
        return null;
    }
    
    protected abstract Object getDataImpl();
    
    public f getDelegate() {
        return this.a;
    }
    
    public abstract String getHelperText();
    
    protected abstract int getHintResource();
    
    public int getLastError() {
        return this.d;
    }
    
    public void onClick(final View view) {
        this.setFocusableInTouchMode(true);
        this.requestFocus();
        ((InputMethodManager)this.c.getSystemService("input_method")).showSoftInput((View)this, 1);
        this.setSelection(this.getText().toString().length());
        if (this.getDelegate() != null) {
            this.getDelegate().setFocus(this);
        }
        this.setFocusableInTouchMode(false);
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        editorInfo.actionLabel = null;
        editorInfo.inputType = 0;
        editorInfo.imeOptions = 1;
        return (InputConnection)new a(this, super.onCreateInputConnection(editorInfo), false);
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 && n != 57 && n != 58 && n != 59 && n != 60 && n == 67 && this.getText().toString().length() == 0 && this.a != null) {
            this.a.setFocusToPrevious(this);
            return false;
        }
        return false;
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (n == 0 && n2 == 1 && charSequence.length() == 0 && this.a != null) {
            this.a.setFocusToPrevious(this);
        }
    }
    
    public boolean requestRectangleOnScreen(final Rect rect) {
        return false;
    }
    
    public void setDelegate(final f a) {
        this.a = a;
    }
    
    protected void setLastError(final int d) {
        this.d = d;
    }
    
    public void setValid(final boolean e) {
        this.e = e;
    }
}
