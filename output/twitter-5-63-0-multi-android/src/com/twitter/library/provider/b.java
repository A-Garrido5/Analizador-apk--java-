// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.HashSet;
import android.content.ContentResolver;
import java.util.Set;

public class b
{
    private final Set a;
    private final ContentResolver b;
    
    public b(final ContentResolver b) {
        this.a = new HashSet();
        this.b = b;
    }
    
    public void a() {
        final Iterator<Uri> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            this.b.notifyChange((Uri)iterator.next(), (ContentObserver)null);
        }
        this.a.clear();
    }
    
    public void a(final Uri... array) {
        Collections.addAll(this.a, array);
    }
}
