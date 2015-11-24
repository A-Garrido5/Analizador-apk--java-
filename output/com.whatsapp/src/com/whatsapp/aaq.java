// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aaq implements Runnable
{
    final atp a;
    
    aaq(final atp a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        WebSessionsActivity.c(this.a.a).a(l7.z());
        if (WebSessionsActivity.c(this.a.a).getCount() > 0) {
            WebSessionsActivity.d(this.a.a).setVisibility(0);
            WebSessionsActivity.a(this.a.a).setVisibility(0);
            if (!App.I) {
                return;
            }
        }
        WebSessionsActivity.d(this.a.a).setVisibility(8);
        WebSessionsActivity.a(this.a.a).setVisibility(8);
    }
}
