// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.util.l;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.model.ImageFile;
import android.graphics.RectF;

public class x extends y
{
    public final RectF a;
    public final boolean b;
    public final int c;
    public final float d;
    public final ImageFile e;
    public final int f;
    
    public x(final EditableImage editableImage) {
        super(((ImageFile)editableImage.mediaFile).file);
        this.a = editableImage.cropRect;
        this.b = editableImage.enhanced;
        this.c = editableImage.filterId;
        this.d = editableImage.intensity;
        this.e = (ImageFile)editableImage.mediaFile;
        this.f = editableImage.rotation;
    }
    
    @Override
    protected String a() {
        return Integer.toString(this.hashCode(), 36);
    }
    
    public boolean a(final x x) {
        return this == x || (super.a(x) && com.twitter.util.l.a(this.a, x.a) && this.b == x.b && this.c == x.c && this.d == x.d && this.f == x.f);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof x && this.a((x)o));
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int n3;
        if (this.b) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final int n4 = 31 * (31 * (n3 + n2) + this.c);
        final float n5 = fcmpl(this.d, 0.0f);
        int floatToIntBits = 0;
        if (n5 != 0) {
            floatToIntBits = Float.floatToIntBits(this.d);
        }
        return 31 * (n4 + floatToIntBits) + this.f;
    }
}
