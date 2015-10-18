// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.view.View$OnClickListener;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import android.widget.EditText;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode$Callback;

class fa implements ActionMode$Callback
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "\u0014\u001dU\u0012,\f#E\u0013?\u0014\u001dX\u0018+".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Y';
                    break;
                }
                case 0: {
                    c2 = 'x';
                    break;
                }
                case 1: {
                    c2 = '|';
                    break;
                }
                case 2: {
                    c2 = ',';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    fa(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public boolean onActionItemClicked(final ActionMode actionMode, final MenuItem menuItem) {
        return false;
    }
    
    @Override
    public boolean onCreateActionMode(final ActionMode actionMode, final Menu menu) {
        final ViewGroup customView = (ViewGroup)alm.a((LayoutInflater)this.a.getSupportActionBar().getThemedContext().getSystemService(fa.z), 2130903133, null, false);
        actionMode.setCustomView((View)customView);
        final EditText editText = (EditText)customView.findViewById(2131755115);
        editText.addTextChangedListener((TextWatcher)new on(this, editText));
        editText.setOnEditorActionListener((TextView$OnEditorActionListener)new adp(this));
        customView.findViewById(2131755499).setOnClickListener((View$OnClickListener)new kh(this));
        this.a.findViewById(2131755500).setOnClickListener((View$OnClickListener)new pw(this));
        editText.setText((CharSequence)Conversation.ai(this.a));
        editText.selectAll();
        editText.requestFocus();
        editText.setSelected(true);
        return true;
    }
    
    @Override
    public void onDestroyActionMode(final ActionMode actionMode) {
        Conversation.b(this.a, (ActionMode)null);
        Conversation.b(this.a, (String)null);
        Conversation.a(this.a, (ArrayList)null);
        if (!Conversation.p(this.a) || adc.f(this.a.s.u)) {
            Conversation.ad(this.a).setVisibility(0);
        }
        Conversation.l(this.a);
        this.a.u.notifyDataSetChanged();
        Conversation.m(this.a).requestFocus();
    }
    
    @Override
    public boolean onPrepareActionMode(final ActionMode actionMode, final Menu menu) {
        return false;
    }
}
