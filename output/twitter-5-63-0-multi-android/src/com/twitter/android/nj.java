// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import com.twitter.android.util.ap;
import com.twitter.library.client.az;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Intent;
import android.net.Uri;
import com.twitter.library.api.aj;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import android.text.TextWatcher;
import com.twitter.library.service.y;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat;
import java.util.HashMap;
import android.text.TextUtils;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.util.Locale;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import android.content.Context;
import android.widget.Button;
import android.widget.Spinner;
import java.util.Map;
import com.twitter.android.util.al;
import android.widget.AdapterView$OnItemSelectedListener;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;
import android.widget.EditText;
import android.view.View;
import com.twitter.util.t;

class nj implements Runnable
{
    final /* synthetic */ PhoneMTEntryFragment a;
    
    nj(final PhoneMTEntryFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final EditText a = this.a.e;
        if (a != null) {
            a.requestFocus();
            t.a(this.a.g, (View)a, true);
        }
    }
}
