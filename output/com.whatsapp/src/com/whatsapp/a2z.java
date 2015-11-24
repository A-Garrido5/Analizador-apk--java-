// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.text.BreakIterator;
import com.whatsapp.util.by;
import android.content.Context;
import com.amazon.device.home.HomeManager;
import android.os.AsyncTask;
import com.amazon.device.home.GroupedListHeroWidget;

public class a2z
{
    public static int a;
    private GroupedListHeroWidget b;
    private AsyncTask c;
    private HomeManager d;
    private Context e;
    
    public a2z(final Context e) {
        this.e = e;
        this.d = HomeManager.getInstance(e);
    }
    
    static Context a(final a2z a2z) {
        return a2z.e;
    }
    
    static GroupedListHeroWidget a(final a2z a2z, final GroupedListHeroWidget b) {
        return a2z.b = b;
    }
    
    static String[] a(final String s, final int n) {
        return b(s, n);
    }
    
    static GroupedListHeroWidget b(final a2z a2z) {
        return a2z.b;
    }
    
    private static String[] b(final String text, int n) {
        final String[] array = new String[2];
        if (text.length() <= n) {
            array[0] = text;
            array[1] = "";
            if (a2z.a == 0) {
                return array;
            }
        }
        final BreakIterator a = by.a();
        a.setText(text);
        final int preceding = a.preceding(n);
        if (preceding != 0) {
            n = preceding;
        }
        array[0] = text.substring(0, n);
        array[1] = text.substring(n);
        return array;
    }
    
    static HomeManager c(final a2z a2z) {
        return a2z.d;
    }
    
    public void a() {
        final int a = a2z.a;
        if (this.c != null) {
            this.c.cancel(true);
        }
        a8s.a(this.c = new n6(this), new Void[0]);
        if (DialogToastActivity.h) {
            a2z.a = a + 1;
        }
    }
}
