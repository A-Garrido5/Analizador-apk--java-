// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class adg
{
    private a_9 a;
    final ContactInfo b;
    private String c;
    private String d;
    private String e;
    
    adg(final ContactInfo b, final a_9 a) {
        this.b = b;
        this.d = a.f();
        this.e = (String)a.a(b.getResources());
        if (a.b) {
            this.c = a.u;
        }
        this.a = a;
    }
    
    adg(final ContactInfo b, final String d, final String e) {
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    static a_9 a(final adg adg, final a_9 a) {
        return adg.a = a;
    }
    
    static String a(final adg adg) {
        return adg.e;
    }
    
    static String a(final adg adg, final String c) {
        return adg.c = c;
    }
    
    static a_9 b(final adg adg) {
        return adg.a;
    }
    
    static String b(final adg adg, final String d) {
        return adg.d = d;
    }
    
    static String c(final adg adg) {
        return adg.d;
    }
    
    static String d(final adg adg) {
        return adg.c;
    }
}
