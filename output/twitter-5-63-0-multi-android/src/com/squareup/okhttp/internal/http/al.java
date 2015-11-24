// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Set;
import java.util.Date;

class al
{
    Date a;
    private Set b;
    
    private al(final f f) {
        this.b = Collections.emptySet();
        for (int i = 0; i < f.a(); ++i) {
            final String a = f.a(i);
            final String b = f.b(i);
            if ("Last-Modified".equalsIgnoreCase(a)) {
                this.a = s.a(b);
            }
            else if ("Vary".equalsIgnoreCase(a)) {
                if (this.b.isEmpty()) {
                    this.b = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                final String[] split = b.split(",");
                for (int length = split.length, j = 0; j < length; ++j) {
                    this.b.add(split[j].trim());
                }
            }
        }
    }
}
