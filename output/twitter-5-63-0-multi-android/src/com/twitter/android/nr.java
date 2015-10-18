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
import android.view.View;
import android.app.Activity;
import android.text.Editable;
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
import android.widget.EditText;
import android.widget.Spinner;
import java.util.Map;
import com.twitter.android.util.al;
import android.widget.AdapterView$OnItemSelectedListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.support.v4.app.Fragment;

class nr implements Runnable
{
    final /* synthetic */ PhoneOwnershipBeginFragment a;
    
    nr(final PhoneOwnershipBeginFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.l = true;
        this.a.k = true;
    }
}
