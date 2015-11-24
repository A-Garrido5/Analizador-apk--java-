// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Comparator;

final class s implements Comparator
{
    public int a(final Entity entity, final Entity entity2) {
        if (entity.start < entity2.start) {
            return -1;
        }
        if (entity.start == entity2.start) {
            return 0;
        }
        return 1;
    }
}
