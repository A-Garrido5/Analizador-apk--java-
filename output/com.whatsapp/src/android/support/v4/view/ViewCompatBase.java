// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View;

class ViewCompatBase
{
    static boolean isLaidOut(final View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }
}
