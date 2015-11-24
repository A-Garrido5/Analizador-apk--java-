// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup;
import android.widget.TabHost;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class TabIndicator extends RelativeLayout
{
    private ImageView a;
    private ImageView b;
    private TextView c;
    private boolean d;
    private int e;
    
    public TabIndicator(final Context context) {
        super(context);
        this.e = 0;
    }
    
    public TabIndicator(final Context context, final AttributeSet set) {
        super(context, set);
        this.e = 0;
    }
    
    public TabIndicator(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e = 0;
    }
    
    public static TabIndicator a(final LayoutInflater layoutInflater, final int n, final TabHost tabHost, final int iconResource, final int title) {
        final TabIndicator tabIndicator = (TabIndicator)layoutInflater.inflate(n, (ViewGroup)tabHost.getTabWidget(), false);
        tabIndicator.setIconResource(iconResource);
        if (title > 0) {
            tabIndicator.setTitle(title);
        }
        return tabIndicator;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.setImageState(this.getDrawableState(), true);
        }
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ImageView)this.findViewById(2131886198);
        this.a = (ImageView)this.findViewById(2131886133);
        this.c = (TextView)this.findViewById(2131886291);
        if (this.c != null && this.c.getTypeface() != null) {
            this.e = this.c.getTypeface().getStyle();
        }
    }
    
    public void setIconResource(final int imageResource) {
        if (this.b != null) {
            this.b.setImageResource(imageResource);
        }
    }
    
    public void setNew(final boolean d) {
        if (d == this.d) {
            return;
        }
        if (d) {
            this.a.setVisibility(0);
        }
        else {
            this.a.setVisibility(8);
        }
        this.d = d;
    }
    
    public void setTitle(final int text) {
        if (this.b != null) {
            this.b.setContentDescription((CharSequence)this.getResources().getString(text));
        }
        if (this.c != null) {
            this.c.setText(text);
        }
    }
    
    public void setTitleBold(final boolean b) {
        if (this.c != null) {
            int e;
            if (b) {
                e = 1;
            }
            else {
                e = this.e;
            }
            this.c.setTypeface(this.c.getTypeface(), e);
        }
    }
}
