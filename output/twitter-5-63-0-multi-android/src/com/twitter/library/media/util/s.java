// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.util.Iterator;
import com.twitter.library.util.ReferenceList;

public class s implements r
{
    private final ReferenceList a;
    
    public s() {
        this.a = ReferenceList.a();
    }
    
    public void a(final r r) {
        this.a(r, false);
    }
    
    public boolean a(final r r, final boolean b) {
        if (b) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(r)) {
                    return false;
                }
            }
        }
        this.a.b(r);
        return true;
    }
    
    @Override
    public void e() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().e();
        }
    }
    
    @Override
    public void f() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
}
