// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Map;
import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.HashMap;

final class CollectionUtils$EmptyHashMap extends HashMap
{
    private Object readResolve() {
        return CollectionUtils.b;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return false;
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return false;
    }
    
    @Override
    public Set entrySet() {
        return Collections.EMPTY_SET;
    }
    
    @Override
    public Object get(final Object o) {
        return null;
    }
    
    @Override
    public Set keySet() {
        return Collections.EMPTY_SET;
    }
    
    @Override
    public Collection values() {
        return Collections.EMPTY_LIST;
    }
}
