// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.app.AlertDialog;
import com.twitter.android.BaseActivity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class a implements DialogInterface$OnClickListener
{
    final /* synthetic */ DataChargesActivity a;
    
    a(final DataChargesActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.a(this.a.b);
        dialogInterface.dismiss();
    }
}
