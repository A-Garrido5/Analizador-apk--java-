// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.autocomplete;

import android.widget.ListAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ListView;
import android.widget.AdapterView$OnItemClickListener;

public class ListViewSuggestionEditText extends SuggestionEditText implements AdapterView$OnItemClickListener
{
    protected ListView a;
    protected cp b;
    private boolean c;
    
    public ListViewSuggestionEditText(final Context context) {
        this(context, null);
    }
    
    public ListViewSuggestionEditText(final Context context, final AttributeSet set) {
        this(context, set, 2130772104);
    }
    
    public ListViewSuggestionEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public boolean a() {
        return this.c;
    }
    
    @Override
    protected boolean a(final Object o, final ln ln) {
        if (this.a == null || this.b == null || this.b.c() == ln) {
            return false;
        }
        final ln a = this.b.a(o, ln);
        if (a != null) {
            a.b();
        }
        final int a2 = ln.a();
        boolean c = false;
        if (a2 > 0) {
            c = true;
        }
        this.c = c;
        return true;
    }
    
    protected boolean a(final boolean b, final int n) {
        return false;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.clearComposingText();
        final Object itemAtPosition = adapterView.getItemAtPosition(n);
        if (itemAtPosition != null) {
            this.a(adapterView.getItemIdAtPosition(n), itemAtPosition);
        }
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (this.a()) {
            final ListView a = this.a;
            if (n != 62 && (a.getSelectedItemPosition() >= 0 || (n != 66 && n != 23))) {
                final boolean onKeyDown = a.onKeyDown(n, keyEvent);
                final boolean a2 = this.a(onKeyDown, n);
                if (onKeyDown) {
                    a.requestFocusFromTouch();
                    switch (n) {
                        case 19:
                        case 20:
                        case 23:
                        case 66: {
                            return true;
                        }
                    }
                }
                if (!a2) {
                    return super.onKeyDown(n, keyEvent);
                }
                return true;
            }
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (this.a()) {
            final int selectedItemPosition = this.a.getSelectedItemPosition();
            if (this.a() && selectedItemPosition >= 0) {
                return this.a.onKeyUp(n, keyEvent);
            }
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    public void setAdapter(final cp cp) {
        if (this.b != cp) {
            if (this.b != null) {
                this.a(null, ln.a);
            }
            this.b = cp;
            if (this.a != null) {
                this.a.setAdapter((ListAdapter)cp);
            }
        }
    }
    
    public void setListView(final ListView a) {
        if (this.a != a) {
            if (this.a != null) {
                this.a.setOnItemClickListener((AdapterView$OnItemClickListener)null);
            }
            this.c();
            if ((this.a = a) != null) {
                a.setAdapter((ListAdapter)this.b);
                a.setOnItemClickListener((AdapterView$OnItemClickListener)this);
            }
        }
    }
}
