// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.IBinder;
import com.google.android.gms.dynamic.g$a;
import com.google.android.gms.dynamic.n;
import android.view.View;
import android.content.Context;
import com.google.android.gms.dynamic.g;

public final class aq extends g
{
    private static final aq a;
    
    static {
        a = new aq();
    }
    
    private aq() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }
    
    public static View a(final Context context, final int n, final int n2) {
        return aq.a.b(context, n, n2);
    }
    
    private View b(final Context context, final int n, final int n2) {
        try {
            return (View)n.a(((ai)this.a(context)).a(n.a(context), n, n2));
        }
        catch (Exception ex) {
            throw new g$a("Could not get button with size " + n + " and color " + n2, ex);
        }
    }
    
    public ai b(final IBinder binder) {
        return aj.a(binder);
    }
}
