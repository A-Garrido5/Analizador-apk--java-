// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.refresh.widget;

import java.util.ArrayList;
import android.database.DataSetObserver;

class f extends DataSetObserver
{
    final /* synthetic */ RefreshableListView a;
    private final ArrayList b;
    
    public f(final RefreshableListView a) {
        this.a = a;
        this.b = new ArrayList();
    }
    
    public void a(final DataSetObserver dataSetObserver) {
        this.b.add(dataSetObserver);
    }
    
    public void b(final DataSetObserver dataSetObserver) {
        this.b.remove(dataSetObserver);
    }
    
    public void onChanged() {
        this.a.f();
        synchronized (this.b) {
            for (int i = -1 + this.b.size(); i >= 0; --i) {
                ((DataSetObserver)this.b.get(i)).onChanged();
            }
            // monitorexit(this.b)
            this.a.requestLayout();
        }
    }
    
    public void onInvalidated() {
        this.a.c = 0;
        synchronized (this.b) {
            for (int i = -1 + this.b.size(); i >= 0; --i) {
                ((DataSetObserver)this.b.get(i)).onInvalidated();
            }
            // monitorexit(this.b)
            this.a.requestLayout();
        }
    }
}
