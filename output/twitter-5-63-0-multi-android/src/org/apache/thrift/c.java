// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Comparator;

class c implements Comparator
{
    @Override
    public int compare(final Object o, final Object o2) {
        if (o == null && o2 == null) {
            return 0;
        }
        if (o == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        if (o instanceof List) {
            return a.a((List)o, (List)o2);
        }
        if (o instanceof Set) {
            return a.a((Set)o, (Set)o2);
        }
        if (o instanceof Map) {
            return a.a((Map)o, (Map)o2);
        }
        if (o instanceof byte[]) {
            return a.a((byte[])o, (byte[])o2);
        }
        return a.a((Comparable)o, (Comparable)o2);
    }
}
