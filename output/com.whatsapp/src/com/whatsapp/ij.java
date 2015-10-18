// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;

class ij implements zt
{
    final ListChatInfo a;
    
    ij(final ListChatInfo a) {
        this.a = a;
    }
    
    @Override
    public void a(final String t) {
        if (!ListChatInfo.e(this.a).a((Context)this.a).equals(t)) {
            ListChatInfo.e(this.a).t = t;
            App.S.d(ListChatInfo.e(this.a));
            App.ak.b(ListChatInfo.e(this.a).u, t);
            ListChatInfo.g(this.a);
            App.d(ListChatInfo.e(this.a).u);
            App.a(ListChatInfo.e(this.a));
        }
    }
}
