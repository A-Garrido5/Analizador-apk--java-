// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.widget.CompoundButton$OnCheckedChangeListener;
import android.os.Looper;
import com.twitter.internal.android.widget.ToolBar;
import android.os.Handler;
import android.widget.Switch;

class g implements f
{
    protected Switch a;
    final /* synthetic */ AbsPreferenceActivity b;
    private final Handler c;
    
    public g(final AbsPreferenceActivity b, final jv jv, final ToolBar toolBar) {
        this.b = b;
        this.c = new Handler(Looper.getMainLooper());
        jv.a(ld.pref_toolbar, toolBar);
        (this.a = (Switch)toolBar.a(la.pref_switch).e()).setChecked(b.n());
        this.a.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new h(this, b));
    }
    
    @Override
    public void a(final boolean b) {
        this.b.getPreferenceScreen().setEnabled(b);
        this.a.setChecked(b);
    }
    
    @Override
    public boolean a() {
        return this.a.isChecked();
    }
    
    @Override
    public void b() {
    }
    
    protected void b(final boolean b) {
        this.c.post((Runnable)new i(this, b));
    }
}
