// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import java.util.Iterator;
import com.twitter.library.client.r;
import java.util.concurrent.CopyOnWriteArraySet;
import com.twitter.library.client.s;

public class a implements s
{
    private final CopyOnWriteArraySet a;
    
    public a() {
        this.a = new CopyOnWriteArraySet();
    }
    
    public void a() {
        final Iterator<r> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().j();
        }
    }
    
    public void a(final int n, final int n2, final Intent intent) {
        final Iterator<r> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(n, n2, intent);
        }
    }
    
    public void a(final Configuration configuration) {
        final Iterator<r> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(configuration);
        }
    }
    
    public void a(final Bundle bundle) {
        final Iterator<r> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(bundle);
        }
    }
    
    @Override
    public void a(final r r) {
        if (r != null) {
            this.a.add(r);
        }
    }
    
    public void a(final boolean b) {
        final Iterator<r> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(b);
        }
    }
    
    public void b() {
        final Iterator<r> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().k();
        }
    }
    
    @Override
    public void b(final r r) {
        if (r != null) {
            this.a.remove(r);
        }
    }
    
    public void b(final boolean b) {
        final Iterator<r> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(b);
        }
    }
}
