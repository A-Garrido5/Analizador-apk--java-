// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.util;

import com.twitter.library.commerce.model.CreditCard$Type;
import android.util.TypedValue;
import android.content.Context;
import java.util.Collections;
import java.util.Map;

public class ImageHelper
{
    private static final Map a;
    
    static {
        a = Collections.unmodifiableMap((Map<?, ?>)new ImageHelper$1());
    }
    
    public static int a(final int n, final Context context) {
        return (int)TypedValue.applyDimension(1, (float)n, context.getResources().getDisplayMetrics());
    }
    
    public static ImageHelper$Image a(final CreditCard$Type creditCard$Type) {
        return ImageHelper.a.get(creditCard$Type);
    }
}
