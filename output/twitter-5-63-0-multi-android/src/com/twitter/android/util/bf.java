// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.util.bj;
import com.twitter.library.util.bo;
import android.widget.TextView;

public class bf
{
    public static void a(final TextView textView, final int n) {
        float a = bo.a;
        final float a2 = bj.a;
        final float n2 = a / a2;
        switch (n) {
            case 1: {
                a = a2 * (n2 + 2.0f);
                break;
            }
            case 3: {
                a = a2 * (n2 - 4.0f);
                break;
            }
            case 2: {
                a = a2 * (n2 - 2.0f);
                break;
            }
        }
        textView.setTextSize(0, a);
    }
}
