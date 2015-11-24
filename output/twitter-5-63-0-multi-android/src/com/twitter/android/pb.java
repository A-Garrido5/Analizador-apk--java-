// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.twitter.library.api.Recap$Metadata;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import android.content.Context;
import android.view.View$OnClickListener;

class pb implements View$OnClickListener
{
    private final Context a;
    private final c b;
    private final TwitterScribeAssociation c;
    
    pb(final Context a, final c b, final TwitterScribeAssociation c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private void a(final Recap$Metadata recap$Metadata) {
        this.a(recap$Metadata.scribeComponent, "feedback", "impression");
        new AlertDialog$Builder(this.a).setMessage((CharSequence)recap$Metadata.feedback).setPositiveButton((CharSequence)recap$Metadata.confirm, (DialogInterface$OnClickListener)new pf(this, recap$Metadata)).setNegativeButton((CharSequence)recap$Metadata.cancel, (DialogInterface$OnClickListener)new pe(this, recap$Metadata)).create().show();
    }
    
    private void a(final String s, final String s2, final String s3) {
        this.b.a(new TwitterScribeLog(az.a(this.a).b().g()).b(this.c.a(), this.c.b(), s, s2, s3));
    }
    
    public void onClick(final View view) {
        final tq tq = (tq)view.getTag();
        if (view.getId() != 2131886108 || tq.m == null) {
            return;
        }
        final Recap$Metadata m = tq.m;
        this.a(m.scribeComponent, "menu", "impression");
        new AlertDialog$Builder(this.a).setMessage((CharSequence)m.dismiss).setPositiveButton((CharSequence)m.confirm, (DialogInterface$OnClickListener)new pd(this, m)).setNegativeButton((CharSequence)this.a.getString(2131296445), (DialogInterface$OnClickListener)new pc(this, m)).create().show();
    }
}
