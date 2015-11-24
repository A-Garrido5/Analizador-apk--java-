// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.widget.PromptDialogFragment;
import android.widget.Button;
import com.twitter.errorreporter.ErrorReporter;
import android.view.View;
import com.twitter.library.client.ap;
import com.twitter.library.api.TwitterUser;
import com.twitter.ui.widget.TwitterButton;
import android.text.TextWatcher;
import com.twitter.ui.widget.PromptView;
import com.twitter.android.client.ca;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.ScrollView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View$OnClickListener;

class gw implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ gv b;
    
    gw(final gv b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.a.s.smoothScrollTo(0, this.a);
    }
}
