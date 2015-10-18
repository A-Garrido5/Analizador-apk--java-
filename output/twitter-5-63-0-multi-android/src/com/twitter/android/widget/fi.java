// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Message;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class fi implements DialogInterface$OnClickListener
{
    final /* synthetic */ TurnOffReadabilityFragment a;
    
    fi(final TurnOffReadabilityFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(TurnOffReadabilityFragment.a)));
        TurnOffReadabilityFragment.b.finish();
    }
}
