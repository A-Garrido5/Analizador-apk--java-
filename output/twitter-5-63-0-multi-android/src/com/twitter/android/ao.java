// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListAdapter;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import com.twitter.library.client.Session;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import com.twitter.android.widget.ct;
import android.content.DialogInterface;
import android.widget.Toast;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;
import android.graphics.Bitmap;
import com.twitter.library.media.util.m;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.util.bq;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.b;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.api.account.p;
import android.content.Context;
import android.os.AsyncTask;

public class ao extends AsyncTask
{
    final /* synthetic */ BackupCodeFragment a;
    private final Context b;
    private final String c;
    private final boolean d;
    
    ao(final BackupCodeFragment a, final Context context, final String c, final boolean d) {
        this.a = a;
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
    }
    
    public String a(final Void... array) {
        return p.c(this.b, this.c);
    }
    
    public void a(final String s) {
        this.a.c_(3);
        this.a.a(s, this.d);
    }
    
    public void onPreExecute() {
        this.a.a_(3);
    }
}
