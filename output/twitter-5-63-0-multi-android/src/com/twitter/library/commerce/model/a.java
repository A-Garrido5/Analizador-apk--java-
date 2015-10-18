// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import java.util.ArrayList;

public class a
{
    public static void a(final ArrayList list, final int n) {
        if (n > list.size()) {
            list.ensureCapacity(n);
            for (int i = n - list.size(); i > 0; --i) {
                list.add(null);
            }
        }
    }
}
