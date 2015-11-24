// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import com.twitter.library.api.MediaTag;
import com.twitter.android.widget.eu;

class mi extends eu
{
    private MediaTag a;
    
    public mi(final MediaTag a, final Resources resources) {
        super(resources.getColor(2131689637), resources.getColor(2131689634), resources.getDimensionPixelSize(2131558773), resources.getDimensionPixelSize(2131558775), resources.getDimensionPixelSize(2131558777), resources.getDimensionPixelSize(2131558774), 0.0f, resources.getDimensionPixelSize(2131558776));
        this.a = a;
    }
    
    public MediaTag a() {
        return this.a;
    }
}
