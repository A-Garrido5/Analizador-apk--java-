// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class hm implements yk
{
    final bi a;
    final MediaView b;
    final boolean c;
    
    hm(final MediaView b, final bi a, final boolean c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void a() {
        final boolean i = App.I;
        MediaView.n(this.b);
        MediaView.d(this.b).remove(this.a);
        MediaView.g(this.b).notifyDataSetChanged();
        if (MediaView.d(this.b).isEmpty()) {
            this.b.finish();
            if (!i) {
                return;
            }
        }
        if (MediaView.c(this.b).getCurrentItem() == 0) {
            MediaView.g(this.b, MediaView.c(this.b).getCurrentItem());
            if (!i) {
                return;
            }
        }
        if (!this.c) {
            MediaView.f(this.b, 1);
        }
    }
}
