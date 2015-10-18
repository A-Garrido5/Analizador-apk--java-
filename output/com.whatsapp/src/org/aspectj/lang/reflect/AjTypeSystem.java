// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.lang.reflect;

import org.aspectj.internal.lang.reflect.AjTypeImpl;
import java.util.Collections;
import java.util.WeakHashMap;
import java.lang.ref.WeakReference;
import java.util.Map;

public class AjTypeSystem
{
    private static Map<Class, WeakReference<AjType>> ajTypes;
    
    static {
        AjTypeSystem.ajTypes = (Map<Class, WeakReference<AjType>>)Collections.synchronizedMap(new WeakHashMap<Class, WeakReference<AjType>>());
    }
    
    public static <T> AjType<T> getAjType(final Class<T> clazz) {
        final WeakReference<AjType> weakReference = AjTypeSystem.ajTypes.get(clazz);
        if (weakReference == null) {
            final AjTypeImpl<T> ajTypeImpl = new AjTypeImpl<T>(clazz);
            AjTypeSystem.ajTypes.put(clazz, new WeakReference<AjType>(ajTypeImpl));
            return ajTypeImpl;
        }
        final AjType<T> ajType = weakReference.get();
        if (ajType != null) {
            return ajType;
        }
        final AjTypeImpl<T> ajTypeImpl2 = new AjTypeImpl<T>(clazz);
        AjTypeSystem.ajTypes.put(clazz, new WeakReference<AjType>(ajTypeImpl2));
        return ajTypeImpl2;
    }
}
