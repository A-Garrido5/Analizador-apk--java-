// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.app.ActionBar;
import com.whatsapp.fieldstats.aq;
import com.whatsapp.util.Log;
import android.os.Bundle;
import java.util.Iterator;
import java.util.HashSet;
import com.whatsapp.protocol.bi;
import java.util.Vector;
import android.view.View;
import android.content.Context;
import android.widget.TextView;
import android.widget.ListView;

public class ListMembersSelector extends MultipleContactsSelector
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\fL2f\u0004\u0005H#w\u001b\u0013V$~\f\u0003Q.`F\u0003W$s\u001d\u0005";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = '`';
                        break;
                    }
                    case 1: {
                        c2 = '%';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\fL2f\u0004\u0005H#w\u001b\u0013V$~\f\u0003Q.`F\u0004@2f\u001b\u000f\\";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = " Voe\u0001\u0001Q2s\u0019\u0010\u000b/w\u001d";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    protected String a() {
        return this.getString(2131231409);
    }
    
    @Override
    protected void a(final ListView listView) {
        final TextView textView = new TextView((Context)this);
        textView.setTextSize(ConversationRow.b(this.getResources()));
        textView.setPadding(0, this.getResources().getDimensionPixelSize(2131361901), 0, this.getResources().getDimensionPixelSize(2131361901));
        textView.setText((CharSequence)this.getString(2131230849, new Object[] { "\u202a" + VerifyNumber.b(App.aX.cc, App.aX.jabber_id.substring(App.aX.cc.length())) + "\u202c" }));
        alm.a(textView);
        listView.addFooterView((View)textView);
    }
    
    @Override
    protected String b() {
        return this.getString(2131231273).toUpperCase();
    }
    
    @Override
    protected int c() {
        return 2;
    }
    
    @Override
    protected int e() {
        return 2131230846;
    }
    
    @Override
    protected int f() {
        if (ym.b == 0) {
            return -1;
        }
        return ym.b;
    }
    
    @Override
    protected int g() {
        return 2131230985;
    }
    
    @Override
    protected void i() {
        super.i();
    }
    
    @Override
    protected void j() {
        final boolean i = App.I;
        final String g = z8.g();
        final Vector<String> n = new Vector<String>(this.l.size());
        final Iterator<a_9> iterator = (Iterator<a_9>)this.l.iterator();
        while (iterator.hasNext()) {
            n.add(iterator.next().u);
            if (i) {
                break;
            }
        }
        adc.a(g, n);
        final bi bi = new bi(g, "", null);
        bi.u = App.m();
        bi.c = 6;
        bi.L = 9L;
        bi.N = n;
        bi.t = App.au() + ListMembersSelector.z[2];
        App.ak.g(bi);
        final HashSet<String> set = new HashSet<String>();
        final Iterator<a_9> iterator2 = (Iterator<a_9>)this.l.iterator();
        while (iterator2.hasNext()) {
            set.add(iterator2.next().u);
            if (i) {
                break;
            }
        }
        App.t(g);
        this.startActivity(Conversation.a(z8.a(g, "", System.currentTimeMillis())));
        this.finish();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        Log.i(ListMembersSelector.z[0]);
        super.onCreate(bundle);
        aam.a(aq.NEW_BROADCAST_LIST);
        final ActionBar supportActionBar = this.getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setTitle(2131231409);
    }
    
    @Override
    public void onDestroy() {
        Log.i(ListMembersSelector.z[1]);
        super.onDestroy();
    }
}
