// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import java.util.Iterator;
import android.database.DataSetObserver;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public abstract class a
{
    private final List a;
    
    public a() {
        this.a = new ArrayList();
    }
    
    public abstract int a();
    
    public abstract int a(final int p0);
    
    public abstract j a(final ViewGroup p0, final int p1);
    
    public void a(final DataSetObserver dataSetObserver) {
        this.a.add(dataSetObserver);
    }
    
    public abstract void a(final j p0, final int p1);
    
    protected void b() {
        final Iterator<DataSetObserver> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().onInvalidated();
        }
    }
    
    public void b(final DataSetObserver dataSetObserver) {
        this.a.remove(dataSetObserver);
    }
}
