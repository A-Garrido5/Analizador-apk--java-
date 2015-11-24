// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui;

import com.twitter.util.g;
import com.twitter.util.j;
import android.graphics.RectF;
import android.graphics.Rect;
import com.twitter.internal.android.util.Size;

public final class a
{
    public static Rect a(final Size size, final Size size2) {
        return a(size, size2, true);
    }
    
    public static Rect a(final Size size, final Size size2, final Rect rect) {
        final RectF rectF = new RectF(rect);
        final float a = j.a(rectF, size2.g(), true);
        final Rect rect2 = new Rect();
        j.a(rectF, a, a).round(rect2);
        final Size a2 = size.a(a);
        final int n = size2.a() - rect2.width();
        final int n2 = size2.b() - rect2.height();
        final int n3 = -rect2.left + n / 2;
        final int n4 = -rect2.top + n2 / 2;
        final Rect a3 = j.a(a2.f(), (int)(n3 - g.a(0.0f, 0.0f, size2.a(), n3, n3 + a2.a())), (int)(n4 - g.a(0.0f, 0.0f, size2.b(), n4, n4 + a2.b())));
        if (a3.width() < size2.a() || a3.height() < size2.b()) {
            a3.set(size2.f());
        }
        return a3;
    }
    
    private static Rect a(final Size size, final Size size2, final boolean b) {
        final Size a = size.a(j.a(size, size2, b));
        return j.a(a.f(), (size2.a() - a.a()) / 2, (size2.b() - a.b()) / 2);
    }
    
    public static Rect b(final Size size, final Size size2) {
        return a(size, size2, false);
    }
}
