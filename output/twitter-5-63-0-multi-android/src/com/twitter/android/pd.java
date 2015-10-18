// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import android.app.AlertDialog$Builder;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import android.content.Context;
import android.view.View$OnClickListener;
import android.content.DialogInterface;
import com.twitter.library.api.Recap$Metadata;
import android.content.DialogInterface$OnClickListener;

class pd implements DialogInterface$OnClickListener
{
    final /* synthetic */ Recap$Metadata a;
    final /* synthetic */ pb b;
    
    pd(final pb b, final Recap$Metadata a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.b.b.c(this.a.entityId);
        this.b.a(this.a);
    }
}
