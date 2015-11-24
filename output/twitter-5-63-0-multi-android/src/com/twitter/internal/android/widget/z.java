// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.widget.Filter;
import android.widget.Filterable;

final class z implements Filterable
{
    public Filter getFilter() {
        return new aa(this);
    }
}
