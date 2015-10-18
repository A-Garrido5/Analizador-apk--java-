// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.ArrayList;
import android.net.Uri;
import android.widget.AdapterView;
import android.text.Editable;
import android.app.AlertDialog$Builder;
import com.twitter.library.util.bq;
import android.widget.SpinnerAdapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.App;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.internal.android.widget.ToolBar;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.EditText;
import android.view.View;
import android.widget.AdapterView$OnItemSelectedListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class bf implements DialogInterface$OnClickListener
{
    final /* synthetic */ BugReporterActivity a;
    
    bf(final BugReporterActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.h();
    }
}
