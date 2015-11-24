// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.widget.ImageView$ScaleType;
import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class FixedSizeImageView extends ImageView
{
    private boolean a;
    private boolean b;
    
    public FixedSizeImageView(final Context context) {
        super(context);
        this.a(context, null);
    }
    
    public FixedSizeImageView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context, set);
    }
    
    public FixedSizeImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context, set);
    }
    
    private void a(final Context context, final AttributeSet set) {
        if (set == null) {
            this.a = true;
            return;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.FixedSizeImageView);
        try {
            this.a = obtainStyledAttributes.getBoolean(li.FixedSizeImageView_fixedSize, true);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    protected boolean getIgnoreLayoutRequest() {
        return this.b;
    }
    
    public void requestLayout() {
        if (!this.a || !this.b) {
            super.requestLayout();
            return;
        }
        this.invalidate();
    }
    
    protected void setIgnoreLayoutRequest(final boolean b) {
        this.b = b;
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        this.b = this.a;
        try {
            super.setImageDrawable(imageDrawable);
        }
        finally {
            this.b = false;
        }
    }
    
    public void setImageResource(final int imageResource) {
        this.b = this.a;
        try {
            super.setImageResource(imageResource);
        }
        finally {
            this.b = false;
        }
    }
    
    public void setImageURI(final Uri imageURI) {
        this.b = this.a;
        try {
            super.setImageURI(imageURI);
        }
        finally {
            this.b = false;
        }
    }
    
    public void setIsFixedSize(final boolean a) {
        this.a = a;
    }
    
    public void setScaleType(final ImageView$ScaleType scaleType) {
        this.b = this.a;
        try {
            super.setScaleType(scaleType);
        }
        finally {
            this.b = false;
        }
    }
}
