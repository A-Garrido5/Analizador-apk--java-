// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.content.Context;

public class cj
{
    private String a;
    private Context b;
    
    private cj(final String a, final Context b) {
        this.a = a;
        this.b = b;
    }
    
    public static cj a(final String s, final Context context) {
        return new cj(s, context);
    }
    
    public void a() {
        this.b.startService(new Intent(this.b, (Class)ContactsUploadService.class).putExtra("scribe_page_term", this.a));
    }
}
