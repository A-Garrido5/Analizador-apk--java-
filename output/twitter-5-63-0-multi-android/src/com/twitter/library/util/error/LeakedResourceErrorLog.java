// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util.error;

import java.util.Iterator;
import com.twitter.errorreporter.a;

public class LeakedResourceErrorLog extends a
{
    public LeakedResourceErrorLog(final Iterable iterable) {
        final Iterator<Object> iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            final Object[] array = { null };
            ++n;
            array[0] = n;
            this.a(String.format("LeakedResourceErrorLog.leaked_obj_name_%d", array), next.getClass().getSimpleName());
        }
        this.a("LeakedResourceErrorLog.leaked_obj_count", n);
        this.a(new LeakedResourceErrorLog$LeakedResourceException());
    }
}
