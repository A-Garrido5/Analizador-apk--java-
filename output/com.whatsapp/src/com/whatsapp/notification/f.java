// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.gu;

class f implements gu
{
    final PopupNotification a;
    
    f(final PopupNotification a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        App.a(App.aq.getApplicationContext(), n, 0);
    }
    
    @Override
    public void a(final int n, final int n2) {
    }
    
    @Override
    public void a(final int n, final int n2, final String[] array) {
        App.a(App.aq.getApplicationContext(), this.a.getString(n2, (Object[])array), 0);
    }
    
    @Override
    public boolean a() {
        return false;
    }
    
    @Override
    public boolean a(final String s, final String s2) {
        return false;
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void f(final String s) {
        App.a(App.aq.getApplicationContext(), s, 0);
    }
}
