// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Button;
import android.widget.SpinnerAdapter;
import android.widget.ArrayAdapter;
import android.widget.AdapterView$OnItemSelectedListener;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.regex.Pattern;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import android.widget.Spinner;
import android.widget.TextView;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Context;
import android.widget.Toast;
import android.text.ClipboardManager;
import android.view.View;
import android.view.View$OnClickListener;

class ke implements View$OnClickListener
{
    final /* synthetic */ LogViewerActivity a;
    
    ke(final LogViewerActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ((ClipboardManager)this.a.getSystemService("clipboard")).setText(this.a.a.getText());
        Toast.makeText((Context)this.a, (CharSequence)"Log copied to clipboard", 0).show();
    }
}
