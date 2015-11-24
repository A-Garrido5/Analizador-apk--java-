// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.az;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import android.content.Context;
import android.widget.TextView;
import android.widget.Button;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.support.v4.app.Fragment;
import android.widget.EditText;
import android.view.View;
import com.twitter.util.t;

class nt implements Runnable
{
    final /* synthetic */ PhoneOwnershipCompleteFragment a;
    
    nt(final PhoneOwnershipCompleteFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final EditText a = this.a.a;
        if (a != null) {
            if (this.a.e) {
                a.setInputType(2);
            }
            else {
                a.setInputType(1);
            }
            a.requestFocus();
            t.a(this.a.f, (View)a, true);
        }
    }
}
