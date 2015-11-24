// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.internal.android.service.a;
import com.twitter.library.service.y;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Set;
import java.util.Queue;
import com.twitter.library.client.as;
import com.twitter.library.service.z;

public class j extends z
{
    final as a;
    final Queue b;
    final Set c;
    final HashMap d;
    private int e;
    
    public j(final as a) {
        this.b = new ArrayDeque();
        this.c = new HashSet();
        this.d = new HashMap();
        this.e = 2;
        this.a = a;
    }
    
    public List a() {
        final LinkedList list;
        synchronized (this) {
            list = new LinkedList();
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                list.addAll(iterator.next().e());
                iterator.remove();
            }
        }
        // monitorexit(this)
        return list;
    }
    
    @Override
    public void a(final y y) {
        synchronized (this) {
            this.d.remove(y).a(y);
            this.c.remove(y);
            if (!this.b.isEmpty()) {
                final md md = this.b.remove();
                this.c.add(md);
                this.a.a(md, this);
            }
        }
    }
    
    public void a(final md md, final z z) {
        synchronized (this) {
            this.d.put(md, z);
            if (this.c.size() < this.e) {
                this.c.add(md);
                this.a.a(md, this);
            }
            else {
                this.b.add(md);
            }
        }
    }
}
