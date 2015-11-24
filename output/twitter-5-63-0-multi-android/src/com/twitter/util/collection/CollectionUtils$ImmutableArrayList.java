// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Collection;
import java.util.ArrayList;

public class CollectionUtils$ImmutableArrayList extends ArrayList
{
    private static final long serialVersionUID = -8961046675981248099L;
    
    public CollectionUtils$ImmutableArrayList() {
        super(0);
    }
    
    @Override
    public void add(final int n, final Object o) {
        throw new IllegalStateException("Cannot add to immutable list");
    }
    
    @Override
    public boolean add(final Object o) {
        throw new IllegalStateException("Cannot add to immutable list");
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        throw new IllegalStateException("Cannot add to immutable list");
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        throw new IllegalStateException("Cannot add to immutable list");
    }
}
