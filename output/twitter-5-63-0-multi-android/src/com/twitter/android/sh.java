// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.Color;
import android.content.res.Resources;
import com.twitter.android.widget.eu;

public class sh extends eu
{
    private SelectionFragment$SelectedItem a;
    
    public sh(final SelectionFragment$SelectedItem a, final Resources resources) {
        super(resources.getColor(2131689519), Color.argb(102, Color.red(resources.getColor(2131689556)), Color.green(resources.getColor(2131689556)), Color.blue(resources.getColor(2131689556))), 0.0f, resources.getDimensionPixelSize(2131558775), resources.getDimensionPixelSize(2131558777), resources.getDimensionPixelSize(2131558774), 0.0f, resources.getDimensionPixelSize(2131558983));
        this.a = a;
    }
    
    public SelectionFragment$SelectedItem a() {
        return this.a;
    }
}
