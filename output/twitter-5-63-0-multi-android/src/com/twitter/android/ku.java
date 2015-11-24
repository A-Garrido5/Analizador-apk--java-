// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Arrays;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import com.twitter.library.api.account.a;
import com.twitter.library.api.account.v;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.widget.UserView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.api.account.h;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.account.p;
import android.widget.ListAdapter;
import com.twitter.library.api.account.LoginVerificationRequest;
import android.widget.Toast;
import com.twitter.android.client.c;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.service.y;
import android.widget.ArrayAdapter;
import android.app.ProgressDialog;
import android.text.style.StyleSpan;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.client.aa;

class ku extends aa
{
    final /* synthetic */ LoginVerificationFragment a;
    
    private ku(final LoginVerificationFragment a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final String s) {
        this.a.r();
        return true;
    }
}
