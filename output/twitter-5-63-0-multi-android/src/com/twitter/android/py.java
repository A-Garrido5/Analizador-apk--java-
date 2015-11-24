// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import com.twitter.ui.dialog.BaseDialogFragment;
import android.app.Activity;
import com.twitter.library.api.conversations.ba;
import com.twitter.library.client.as;
import com.twitter.library.client.Session;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.internal.android.service.a;
import android.widget.Toast;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

class py extends z
{
    final /* synthetic */ int a;
    final /* synthetic */ Context b;
    final /* synthetic */ ReportConversationDialog c;
    
    py(final ReportConversationDialog c, final int a, final Context b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        if (y.X()) {
            int a;
            if (ak.f()) {
                if (this.c.c) {
                    a = 2131297559;
                }
                else {
                    a = 2131297560;
                }
            }
            else {
                a = this.a;
            }
            Toast.makeText(this.b, a, 0).show();
        }
    }
}
