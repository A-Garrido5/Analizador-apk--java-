// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android;

import com.crashlytics.android.internal.at;
import com.crashlytics.android.internal.cj;
import java.util.Collections;
import java.util.Map;
import com.crashlytics.android.internal.bg;
import com.crashlytics.android.internal.bh;
import com.crashlytics.android.internal.af;
import com.crashlytics.android.internal.c;
import com.crashlytics.android.internal.ci;
import com.crashlytics.android.internal.a;
import com.crashlytics.android.internal.cl;
import com.crashlytics.android.internal.ai;
import com.crashlytics.android.internal.bd;
import com.crashlytics.android.internal.bo;
import java.util.concurrent.ConcurrentHashMap;
import com.crashlytics.android.internal.bu;
import android.content.ContextWrapper;
import com.crashlytics.android.internal.ck;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.content.Context;
import android.app.AlertDialog$Builder;
import com.crashlytics.android.internal.ar;
import android.app.Activity;

final class aw implements Runnable
{
    final /* synthetic */ bb a;
    final /* synthetic */ d b;
    private /* synthetic */ Activity c;
    private /* synthetic */ ab d;
    private /* synthetic */ ar e;
    
    aw(final d b, final Activity c, final bb a, final ab d, final ar e) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.c);
        final ax ax = new ax(this);
        final float density = this.c.getResources().getDisplayMetrics().density;
        final int a = com.crashlytics.android.d.a(this.b, density, 5);
        final TextView textView = new TextView((Context)this.c);
        textView.setAutoLinkMask(15);
        textView.setText((CharSequence)this.d.b());
        textView.setTextAppearance((Context)this.c, 16973892);
        textView.setPadding(a, a, a, a);
        textView.setFocusable(false);
        final ScrollView view = new ScrollView((Context)this.c);
        view.setPadding(com.crashlytics.android.d.a(this.b, density, 14), com.crashlytics.android.d.a(this.b, density, 2), com.crashlytics.android.d.a(this.b, density, 10), com.crashlytics.android.d.a(this.b, density, 12));
        view.addView((View)textView);
        alertDialog$Builder.setView((View)view).setTitle((CharSequence)this.d.a()).setCancelable(false).setNeutralButton((CharSequence)this.d.c(), (DialogInterface$OnClickListener)ax);
        if (this.e.d) {
            alertDialog$Builder.setNegativeButton((CharSequence)this.d.e(), (DialogInterface$OnClickListener)new ay(this));
        }
        if (this.e.f) {
            alertDialog$Builder.setPositiveButton((CharSequence)this.d.d(), (DialogInterface$OnClickListener)new az(this));
        }
        alertDialog$Builder.show();
    }
}
