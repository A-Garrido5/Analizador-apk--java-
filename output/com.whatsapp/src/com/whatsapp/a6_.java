// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.bm;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a6_ implements DialogInterface$OnClickListener
{
    final CallsFragment$ClearCallLogDialogFragment a;
    
    a6_(final CallsFragment$ClearCallLogDialogFragment a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final DialogToastActivity$ProgressDialogFragment dialogToastActivity$ProgressDialogFragment = new DialogToastActivity$ProgressDialogFragment();
        dialogToastActivity$ProgressDialogFragment.show(this.a.getFragmentManager(), null);
        bm.a(new v3(this, dialogToastActivity$ProgressDialogFragment));
    }
}
