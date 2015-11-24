// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.os.Bundle;
import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Collection;

public class ax
{
    public static boolean a(final Object[] array, final Object o) {
        final int length = array.length;
        int n = 0;
        boolean b;
        while (true) {
            b = false;
            if (n >= length) {
                break;
            }
            final Object o2 = array[n];
            if (o2 == o || (o != null && o2 != null && o.equals(o2))) {
                b = true;
                break;
            }
            ++n;
        }
        return b;
    }
    
    public static Object[] a(final Collection collection, Object[] array) {
        int n = 0;
        final boolean l = Log.l;
        if (collection instanceof List) {
            array = ((List<Object>)collection).toArray(array);
        }
        else {
            if (array.length < collection.size()) {
                final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), collection.size());
                for (final Object next : collection) {
                    final int n2 = n + 1;
                    array2[n] = next;
                    if (l) {
                        break;
                    }
                    n = n2;
                }
                return array2;
            }
            final Iterator<Object> iterator2 = collection.iterator();
            int n3 = 0;
            while (iterator2.hasNext()) {
                final Object next2 = iterator2.next();
                final int n4 = n3 + 1;
                array[n3] = next2;
                if (l) {
                    break;
                }
                n3 = n4;
            }
        }
        return array;
    }
    
    public static byte[][] a(final Bundle bundle, final String s) {
        if (bundle == null || s == null) {
            return null;
        }
        return a((Object[])(Object)bundle.getSerializable(s));
    }
    
    public static byte[][] a(final Object[] array) {
        final boolean l = Log.l;
        if (array == null) {
            return null;
        }
        final byte[][] array2 = new byte[array.length][];
        int n;
        for (int i = 0; i < array.length; i = n) {
            array2[i] = (byte[])array[i];
            n = i + 1;
            if (l) {
                break;
            }
        }
        return array2;
    }
}
