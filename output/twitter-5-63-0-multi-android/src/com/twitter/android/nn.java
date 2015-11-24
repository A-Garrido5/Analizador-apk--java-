// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextWatcher;
import com.twitter.library.client.az;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.ab;
import com.twitter.library.api.aj;
import com.twitter.library.util.ar;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import android.content.Context;
import android.widget.TextView;
import android.widget.Button;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;
import android.widget.EditText;
import android.view.View;
import com.twitter.util.t;

class nn implements Runnable
{
    final /* synthetic */ PhoneMTVerifyFragment a;
    
    nn(final PhoneMTVerifyFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final EditText a = this.a.a;
        if (a != null) {
            if (this.a.e) {
                a.setInputType(1);
            }
            else {
                a.setInputType(2);
            }
            a.requestFocus();
            t.a(this.a.f, (View)a, true);
        }
    }
}
