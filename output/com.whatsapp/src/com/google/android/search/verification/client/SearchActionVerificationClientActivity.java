// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.search.verification.client;

import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public abstract class SearchActionVerificationClientActivity extends Activity
{
    public static boolean a;
    
    public abstract Class getServiceClass();
    
    protected final void onCreate(final Bundle bundle) {
        final boolean a = SearchActionVerificationClientActivity.a;
        super.onCreate(bundle);
        final Intent intent = new Intent((Context)this, this.getServiceClass());
        intent.putExtra("SearchActionVerificationClientExtraIntent", (Parcelable)this.getIntent());
        this.startService(intent);
        this.finish();
        if (SearchActionVerificationClientService.a) {
            SearchActionVerificationClientActivity.a = !a;
        }
    }
}
