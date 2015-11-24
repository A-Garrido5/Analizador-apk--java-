// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import android.app.AlertDialog;
import com.twitter.android.BaseActivity;
import android.content.Intent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class b implements DialogInterface$OnClickListener
{
    final /* synthetic */ DataChargesActivity a;
    
    b(final DataChargesActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        i.b((Context)this.a);
        final Intent intent = new Intent((Context)this.a, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.b);
        intent.putExtra("appWidgetId", this.a.b);
        this.a.setResult(-1, intent);
        this.a.finish();
    }
}
