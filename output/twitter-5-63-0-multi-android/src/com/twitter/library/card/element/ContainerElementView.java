// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.util.Iterator;
import android.content.Context;

public class ContainerElementView extends ElementViewGroup
{
    public ContainerElementView(final Context context, final Container container) {
        super(context, container);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        for (final Element element : ((Container)this.b).children) {
            if (element.F()) {
                element.z().layout((int)element.mLayoutPosition.x, (int)element.mLayoutPosition.y, (int)(element.mLayoutPosition.x + element.mLayoutSize.x), (int)(element.mLayoutPosition.y + element.mLayoutSize.y));
            }
        }
    }
}
