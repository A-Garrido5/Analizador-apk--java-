// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import android.os.Parcel;

public class h extends f
{
    public static HashMap a(final Class clazz, final Class clazz2, final Parcel parcel) {
        final int int1 = parcel.readInt();
        HashMap<Object, Object> hashMap;
        if (int1 < 0) {
            hashMap = null;
        }
        else {
            hashMap = new HashMap<Object, Object>(int1);
            for (int i = 0; i < int1; ++i) {
                hashMap.put(clazz.cast(parcel.readValue(clazz.getClassLoader())), clazz2.cast(parcel.readValue(clazz2.getClassLoader())));
            }
        }
        return hashMap;
    }
    
    public static void a(final HashMap hashMap, final Parcel parcel) {
        if (hashMap == null) {
            parcel.writeInt(-1);
        }
        else {
            parcel.writeInt(hashMap.size());
            for (final Map.Entry<Object, V> entry : hashMap.entrySet()) {
                parcel.writeValue(entry.getKey());
                parcel.writeValue((Object)entry.getValue());
            }
        }
    }
}
