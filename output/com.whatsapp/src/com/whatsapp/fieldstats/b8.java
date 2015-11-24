// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import com.whatsapp.DialogToastActivity;
import android.content.Context;

public final class b8 extends b9
{
    public Double a;
    public String b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public Double i;
    public Double j;
    public Double k;
    public Double l;
    public Double m;
    public Double n;
    public Double o;
    
    @Override
    void updateFields(final Context context) {
        final int a = aj.a;
        a5.a(context, com.whatsapp.fieldstats.o.EVENT, Integer.valueOf(a3.CONTACT_US_SESSION.getCode()));
        a5.a(context, com.whatsapp.fieldstats.o.CONTACT_US_AUTOMATIC_EMAIL, this.c);
        a5.a(context, com.whatsapp.fieldstats.o.CONTACT_US_EXIT_STATE, this.j);
        a5.a(context, com.whatsapp.fieldstats.o.CONTACT_US_FAQ, this.n);
        a5.a(context, com.whatsapp.fieldstats.o.CONTACT_US_LOGS, this.i);
        a5.a(context, com.whatsapp.fieldstats.o.CONTACT_US_OUTAGE, this.d);
        a5.a(context, com.whatsapp.fieldstats.o.CONTACT_US_OUTAGE_EMAIL, this.h);
        a5.a(context, com.whatsapp.fieldstats.o.CONTACT_US_PROBLEM_DESCRIPTION, this.b);
        a5.a(context, com.whatsapp.fieldstats.o.SEARCH_FAQ_RESULTS_BEST_ID, this.l);
        if (this.k != null) {
            a5.a(context, a1.CONTACT_US_MENU_FAQ_T, this.k);
        }
        if (this.f != null) {
            a5.a(context, a1.CONTACT_US_SCREENSHOT_C, this.f);
        }
        if (this.e != null) {
            a5.a(context, a1.CONTACT_US_T, this.e);
        }
        if (this.g != null) {
            a5.a(context, a1.SEARCH_FAQ_RESULTS_BEST_READ_T, this.g);
        }
        if (this.o != null) {
            a5.a(context, a1.SEARCH_FAQ_RESULTS_GENERATED_C, this.o);
        }
        if (this.m != null) {
            a5.a(context, a1.SEARCH_FAQ_RESULTS_READ_C, this.m);
        }
        if (this.a != null) {
            a5.a(context, a1.SEARCH_FAQ_RESULTS_READ_T, this.a);
        }
        a5.a(context, com.whatsapp.fieldstats.o.EVENT);
        if (DialogToastActivity.h) {
            aj.a = a + 1;
        }
    }
}
