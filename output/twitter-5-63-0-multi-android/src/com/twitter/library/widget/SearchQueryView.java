// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.internal.android.widget.PopupEditText;

public class SearchQueryView extends PopupEditText
{
    private af e;
    private final int f;
    
    public SearchQueryView(final Context context) {
        this(context, null, kv.searchQueryViewStyle);
    }
    
    public SearchQueryView(final Context context, final AttributeSet set) {
        this(context, set, kv.searchQueryViewStyle);
    }
    
    public SearchQueryView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.SearchQueryView, n, 0);
        this.f = obtainStyledAttributes.getInt(li.SearchQueryView_clearDrawablePosition, -1);
        obtainStyledAttributes.recycle();
    }
    
    @Override
    protected boolean a(final int n) {
        return this.e != null && n == this.f && this.e.a(this);
    }
    
    public void setOnClearClickListener(final af e) {
        this.e = e;
    }
}
