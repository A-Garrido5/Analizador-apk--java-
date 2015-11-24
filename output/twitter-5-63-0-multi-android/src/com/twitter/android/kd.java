// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.SpinnerAdapter;
import android.content.Context;
import android.widget.ArrayAdapter;
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
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

class kd implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ LogViewerActivity a;
    
    kd(final LogViewerActivity a) {
        this.a = a;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.h();
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
