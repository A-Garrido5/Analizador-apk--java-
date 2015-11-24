// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import java.util.Collection;
import java.util.ArrayList;

class WidgetControl$WidgetList extends ArrayList
{
    private static final long serialVersionUID = 3793705417118140755L;
    int mCurrentListIndex;
    
    public WidgetControl$WidgetList() {
    }
    
    public WidgetControl$WidgetList(final WidgetControl$WidgetList list) {
        super(list);
        this.mCurrentListIndex = list.mCurrentListIndex;
    }
    
    void a() {
        ++this.mCurrentListIndex;
    }
    
    void b() {
        --this.mCurrentListIndex;
    }
    
    @Override
    public void clear() {
        super.clear();
        this.mCurrentListIndex = 0;
    }
}
