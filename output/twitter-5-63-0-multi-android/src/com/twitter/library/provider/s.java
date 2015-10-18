// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.database.DataSetObserver;
import android.database.ContentObservable;
import android.database.Cursor;
import java.util.List;
import android.database.CursorWrapper;
import android.os.Handler;
import android.database.ContentObserver;

class s extends ContentObserver
{
    final /* synthetic */ r a;
    
    public s(final r a) {
        this.a = a;
        super((Handler)null);
    }
    
    public void onChange(final boolean h) {
        this.a.h = h;
        if (this.a.f) {
            this.a.g = true;
            return;
        }
        this.a.i.dispatchChange(h);
    }
}
