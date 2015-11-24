// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.MotionEvent;
import com.whatsapp.App;
import com.whatsapp.awc;

class h implements awc
{
    boolean a;
    final PopupNotification b;
    
    h(final PopupNotification b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        App.av();
        if (PopupNotification.p(this.b) != null) {
            PopupNotification.l(this.b).add(PopupNotification.p(this.b).a);
        }
        if (PopupNotification.d(this.b) != null) {
            PopupNotification.n(this.b).add(PopupNotification.d(this.b).u);
        }
    }
    
    @Override
    public void a(final int n) {
        final boolean a = PopupNotification.A;
        if (this.a) {
            return;
        }
        this.a = true;
        Label_0172: {
            if (PopupNotification.r(this.b).size() == 1) {
                this.b.a(0);
                if (!a) {
                    break Label_0172;
                }
            }
            if (n == 0) {
                PopupNotification.t(this.b).setCurrentScreen(1 + PopupNotification.r(this.b).size());
                PopupNotification.t(this.b).a(PopupNotification.r(this.b).size());
                this.b.a(-1 + PopupNotification.r(this.b).size());
                if (!a) {
                    break Label_0172;
                }
            }
            if (n == 1 + PopupNotification.r(this.b).size()) {
                PopupNotification.t(this.b).setCurrentScreen(0);
                PopupNotification.t(this.b).a(1);
                this.b.a(0);
                if (!a) {
                    break Label_0172;
                }
            }
            this.b.a(n - 1);
        }
        this.a = false;
    }
    
    @Override
    public void a(final MotionEvent motionEvent) {
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public void b(final int n) {
    }
    
    @Override
    public void c() {
    }
}
