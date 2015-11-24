// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import android.support.v4.app.FragmentManager;
import java.util.Iterator;
import com.twitter.android.DraftsActivity;
import com.twitter.library.provider.b;
import com.twitter.library.provider.f;
import java.util.List;
import com.twitter.library.client.Session;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ak implements DialogInterface$OnClickListener
{
    final /* synthetic */ ConfirmRetryExpiredDraftsDialog a;
    
    ak(final ConfirmRetryExpiredDraftsDialog a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.b();
        this.a.dismiss();
    }
}
