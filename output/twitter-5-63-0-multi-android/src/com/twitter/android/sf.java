// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.autocomplete.ListViewSuggestionEditText;
import android.os.Build$VERSION;
import android.view.ViewGroup$MarginLayoutParams;

class sf implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ ViewGroup$MarginLayoutParams b;
    final /* synthetic */ SelectionFragment c;
    
    sf(final SelectionFragment c, final int a, final ViewGroup$MarginLayoutParams b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final ListViewSuggestionEditText d = this.c.d;
        if (d.getLayout() != null) {
            int a;
            if (d.getLineCount() > 1) {
                a = this.a;
            }
            else {
                a = 0;
            }
            d.setLineSpacing((float)a, 1.0f);
            if (Build$VERSION.SDK_INT < 21) {
                this.b.bottomMargin = -a;
            }
        }
    }
}
