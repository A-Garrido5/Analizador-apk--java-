// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.protocol.VoipOptions$RateControl;
import com.whatsapp.protocol.VoipOptions$ABTest;
import com.whatsapp.protocol.VoipOptions$NoiseSuppression;
import com.whatsapp.protocol.VoipOptions$AudioRestrict;
import com.whatsapp.protocol.VoipOptions$Agc;
import com.whatsapp.protocol.VoipOptions$Miscellaneous;
import com.whatsapp.protocol.VoipOptions$Decode;
import com.whatsapp.protocol.VoipOptions$Encode;
import com.whatsapp.protocol.VoipOptions$Aec;
import android.os.Parcel;
import com.whatsapp.protocol.VoipOptions;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class bd implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final VoipOptions a;
    private final u b;
    private final bj c;
    private final b9 d;
    private final bw e;
    private final b8 f;
    private final a1 g;
    private final bs h;
    private final am i;
    private final ai j;
    
    static {
        CREATOR = (Parcelable$Creator)new bu();
    }
    
    private bd(final Parcel parcel) {
        this.h = (bs)parcel.readValue(bs.class.getClassLoader());
        this.g = (a1)parcel.readValue(a1.class.getClassLoader());
        this.j = (ai)parcel.readValue(ai.class.getClassLoader());
        this.e = (bw)parcel.readValue(bw.class.getClassLoader());
        this.c = (bj)parcel.readValue(bj.class.getClassLoader());
        this.i = (am)parcel.readValue(am.class.getClassLoader());
        this.d = (b9)parcel.readValue(b9.class.getClassLoader());
        this.f = (b8)parcel.readValue(b8.class.getClassLoader());
        this.b = (u)parcel.readValue(u.class.getClassLoader());
        VoipOptions$Aec a;
        if (this.h != null) {
            a = this.h.a();
        }
        else {
            a = null;
        }
        VoipOptions$Encode a2;
        if (this.c != null) {
            a2 = this.c.a();
        }
        else {
            a2 = null;
        }
        VoipOptions$Decode a3;
        if (this.e != null) {
            a3 = this.e.a();
        }
        else {
            a3 = null;
        }
        VoipOptions$Miscellaneous a4;
        if (this.i != null) {
            a4 = this.i.a();
        }
        else {
            a4 = null;
        }
        VoipOptions$Agc a5;
        if (this.g != null) {
            a5 = this.g.a();
        }
        else {
            a5 = null;
        }
        VoipOptions$AudioRestrict a6;
        if (this.j != null) {
            a6 = this.j.a();
        }
        else {
            a6 = null;
        }
        VoipOptions$NoiseSuppression a7;
        if (this.d != null) {
            a7 = this.d.a();
        }
        else {
            a7 = null;
        }
        VoipOptions$ABTest a8;
        if (this.f != null) {
            a8 = this.f.a();
        }
        else {
            a8 = null;
        }
        final u b = this.b;
        VoipOptions$RateControl a9 = null;
        if (b != null) {
            a9 = this.b.a();
        }
        this.a = new VoipOptions(a, a2, a3, a4, a5, a6, a7, a8, a9);
    }
    
    bd(final Parcel parcel, final bu bu) {
        this(parcel);
    }
    
    bd(final VoipOptions a) {
        this.a = a;
        bs h;
        if (a.aec != null) {
            h = new bs(a.aec, null);
        }
        else {
            h = null;
        }
        this.h = h;
        a1 g;
        if (a.agc != null) {
            g = new a1(a.agc, null);
        }
        else {
            g = null;
        }
        this.g = g;
        ai j;
        if (a.audioRestrict != null) {
            j = new ai(a.audioRestrict, null);
        }
        else {
            j = null;
        }
        this.j = j;
        bw e;
        if (a.decode != null) {
            e = new bw(a.decode, null);
        }
        else {
            e = null;
        }
        this.e = e;
        bj c;
        if (a.encode != null) {
            c = new bj(a.encode, null);
        }
        else {
            c = null;
        }
        this.c = c;
        am i;
        if (a.miscellaneous != null) {
            i = new am(a.miscellaneous, null);
        }
        else {
            i = null;
        }
        this.i = i;
        b9 d;
        if (a.noiseSuppression != null) {
            d = new b9(a.noiseSuppression, null);
        }
        else {
            d = null;
        }
        this.d = d;
        b8 f;
        if (a.abTest != null) {
            f = new b8(a.abTest, null);
        }
        else {
            f = null;
        }
        this.f = f;
        final VoipOptions$RateControl rateControl = a.rateControl;
        u b = null;
        if (rateControl != null) {
            b = new u(a.rateControl, null);
        }
        this.b = b;
    }
    
    public VoipOptions a() {
        return this.a;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.h);
        parcel.writeValue((Object)this.g);
        parcel.writeValue((Object)this.j);
        parcel.writeValue((Object)this.e);
        parcel.writeValue((Object)this.c);
        parcel.writeValue((Object)this.i);
        parcel.writeValue((Object)this.d);
        parcel.writeValue((Object)this.f);
        parcel.writeValue((Object)this.b);
    }
}
