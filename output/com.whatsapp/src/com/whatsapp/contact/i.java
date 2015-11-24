// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import java.util.Iterator;
import android.text.TextUtils;
import com.whatsapp.a_9;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

class i
{
    private final List a;
    private final List b;
    private final List c;
    private final List d;
    
    private i() {
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.a = new ArrayList();
        this.d = new ArrayList();
    }
    
    i(final e e) {
        this();
    }
    
    private void a(final Collection collection, final Collection collection2) {
        final boolean f = com.whatsapp.contact.f.f;
        for (final a_9 a_9 : collection2) {
            if (a_9.b && !TextUtils.isEmpty((CharSequence)a_9.u)) {
                collection.add(a_9);
            }
            if (f) {
                break;
            }
        }
    }
    
    private void b(final Collection collection, final Collection collection2) {
        final boolean f = com.whatsapp.contact.f.f;
        for (final a_9 a_9 : collection2) {
            if (a_9.e != null && !TextUtils.isEmpty((CharSequence)a_9.e.a())) {
                collection.add(a_9.e.a());
            }
            if (f) {
                break;
            }
        }
    }
    
    public ArrayList a() {
        final ArrayList list = new ArrayList();
        this.b(list, this.c);
        this.b(list, this.b);
        this.b(list, this.d);
        return list;
    }
    
    public void a(final a_9 a_9) {
        this.c.add(a_9);
    }
    
    public void b(final a_9 a_9) {
        this.b.add(a_9);
    }
    
    public a_9[] b() {
        final ArrayList list = new ArrayList();
        this.a(list, this.c);
        return list.toArray(new a_9[list.size()]);
    }
    
    public ArrayList c() {
        final boolean f = com.whatsapp.contact.f.f;
        final ArrayList<String> list = new ArrayList<String>();
        for (final a_9 a_9 : this.a) {
            if (!TextUtils.isEmpty((CharSequence)a_9.u)) {
                list.add(a_9.u);
            }
            if (f) {
                break;
            }
        }
        return list;
    }
    
    public void c(final a_9 a_9) {
        this.a.add(a_9);
    }
    
    public void d(final a_9 a_9) {
        this.d.add(a_9);
    }
    
    public boolean d() {
        return this.c.isEmpty() && this.b.isEmpty() && this.a.isEmpty();
    }
    
    public List e() {
        return this.a;
    }
    
    public List f() {
        return this.b;
    }
    
    public List g() {
        return this.c;
    }
    
    public ArrayList h() {
        final ArrayList list = new ArrayList();
        this.b(list, this.c);
        return list;
    }
    
    public List i() {
        return this.d;
    }
    
    public a_9[] j() {
        final ArrayList list = new ArrayList();
        this.a(list, this.c);
        this.a(list, this.b);
        this.a(list, this.d);
        return list.toArray(new a_9[list.size()]);
    }
}
