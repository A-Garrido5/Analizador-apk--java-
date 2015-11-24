// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.content.Context;
import com.twitter.library.client.aa;

public class kz extends aa
{
    private Context a;
    
    public kz(final Context a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final String s) {
        this.a.startActivity(new Intent(this.a, (Class)LoginVerificationActivity.class).putExtra("AbsFragmentActivity_account_name", s).setFlags(268435456));
        return true;
    }
}
