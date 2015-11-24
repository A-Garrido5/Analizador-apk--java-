// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

class h implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ g b;
    
    h(final g b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a <= 3) {
            this.b.a.f.setText(2131296340);
            this.b.a.g.setText(2131296337);
            this.b.a.e.setVisibility(8);
            this.b.a.d.setVisibility(0);
            this.b.a.c.setVisibility(8);
            return;
        }
        this.b.a.f.setText(2131296341);
        this.b.a.g.setText(2131296338);
        this.b.a.e.setVisibility(0);
        this.b.a.d.setVisibility(8);
        this.b.a.c.setVisibility(8);
    }
}
