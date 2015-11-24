// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.platform;

import android.accounts.Account;
import java.util.Iterator;
import java.util.Collection;
import com.twitter.library.util.a;
import com.twitter.library.client.Session;
import java.util.HashMap;
import com.twitter.library.client.az;
import java.util.ArrayList;
import android.content.Context;
import android.os.AsyncTask;

class b extends AsyncTask
{
    private final Context a;
    
    public b(final Context a) {
        this.a = a;
    }
    
    protected ArrayList a(final Void... array) {
        final ArrayList a = az.a(this.a).a();
        if (a.size() == 0) {
            return null;
        }
        final HashMap<String, Session> hashMap = new HashMap<String, Session>();
        for (final Session session : a) {
            hashMap.put(session.e(), session);
        }
        final Account[] a2 = com.twitter.library.util.a.a(this.a);
        for (int length = a2.length, i = 0; i < length; ++i) {
            hashMap.remove(a2[i].name);
        }
        return new ArrayList(hashMap.values());
    }
    
    protected void a(final ArrayList list) {
        if (list != null) {
            for (final Session session : list) {
                switch (com.twitter.android.platform.a.a[session.b().ordinal()]) {
                    case 2: {
                        az.a(this.a).a(session);
                    }
                    case 1: {}
                    default: {
                        continue;
                    }
                }
            }
        }
    }
}
