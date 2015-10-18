// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.g;
import java.util.Collection;
import android.content.res.TypedArray;
import java.util.HashSet;
import com.twitter.android.pa;
import java.util.Collections;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Set;
import android.widget.ImageButton;

public class MultiToggleButton extends ImageButton
{
    private dq a;
    private int b;
    private boolean c;
    private final CharSequence[] d;
    private final int[] e;
    private final int f;
    private final Set g;
    
    public MultiToggleButton(final Context context) {
        this(context, null);
    }
    
    public MultiToggleButton(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MultiToggleButton(final Context context, final AttributeSet set, final int n) {
        int i = 0;
        super(context, set, n);
        this.b = -1;
        this.c = true;
        if (this.isInEditMode()) {
            this.d = new String[] { "0" };
            this.e = new int[] { 0 };
            this.f = 1;
            this.g = Collections.singleton(this.d[0]);
            return;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.MultiToggleButton, n, 0);
        final CharSequence[] textArray = obtainStyledAttributes.getTextArray(0);
        final int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        int[] e;
        if (resourceId != 0) {
            final TypedArray obtainTypedArray = context.getResources().obtainTypedArray(resourceId);
            final int[] array = new int[obtainTypedArray.length()];
            for (int j = 0; j < array.length; ++j) {
                array[j] = obtainTypedArray.getResourceId(j, 0);
            }
            obtainTypedArray.recycle();
            e = array;
        }
        else {
            e = null;
        }
        if (textArray != null && e != null && textArray.length == e.length && textArray.length > 0) {
            this.d = textArray;
            this.e = e;
            this.f = textArray.length;
            this.a(0);
            this.g = new HashSet(this.f);
            while (i < this.f) {
                this.g.add(this.d[i]);
                ++i;
            }
            obtainStyledAttributes.recycle();
            this.setClickable(true);
            return;
        }
        throw new IllegalArgumentException("Invalid configuration for MultiToggleButton!");
    }
    
    private boolean a(final int b) {
        if (b != this.b && b >= 0 && b < this.f) {
            this.setImageResource(this.e[b]);
            this.b = b;
            return true;
        }
        return false;
    }
    
    private void setAllowed(final boolean b) {
        super.setEnabled(b);
        float alpha;
        if (b) {
            alpha = 1.0f;
        }
        else {
            alpha = 0.5f;
        }
        this.setAlpha(alpha);
        if (!b) {
            this.b = -1;
        }
        this.c = b;
    }
    
    public void a() {
        if (!this.g.contains(this.getCurrentMode()) || this.g.size() != 1) {
            int b = this.b;
            do {
                b = (b + 1) % this.f;
            } while (!this.g.contains(this.d[b]));
            if (this.a(b) && this.a != null) {
                this.a.a(this, this.d[b]);
            }
        }
    }
    
    public void a(final Collection collection, final CharSequence mode) {
        this.g.clear();
        for (int i = 0; i < this.f; ++i) {
            final CharSequence charSequence = this.d[i];
            if (collection.contains(charSequence)) {
                this.g.add(charSequence);
            }
        }
        final boolean empty = this.g.isEmpty();
        boolean allowed = false;
        if (!empty) {
            allowed = true;
        }
        this.setAllowed(allowed);
        if (allowed) {
            if (mode == null || !this.g.contains(mode)) {
                throw new IllegalArgumentException("New mode is not allowed!");
            }
            this.setMode(mode);
        }
    }
    
    public void b() {
        this.a(com.twitter.util.g.a(-1 + this.b, this.f));
    }
    
    public CharSequence getCurrentMode() {
        if (this.b >= 0) {
            return this.d[this.b];
        }
        return "";
    }
    
    public boolean performClick() {
        this.a();
        return super.performClick();
    }
    
    public void setEnabled(final boolean enabled) {
        if (this.c) {
            super.setEnabled(enabled);
        }
    }
    
    public void setMode(final CharSequence charSequence) {
        if (!this.getCurrentMode().equals(charSequence) && this.g.contains(charSequence)) {
            for (int i = 0; i < this.f; ++i) {
                if (this.d[i].equals(charSequence)) {
                    this.a(i);
                    return;
                }
            }
        }
    }
    
    public void setOnToggleListener(final dq a) {
        this.a = a;
    }
}
