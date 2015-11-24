// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo;

import android.location.LocationManager;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.as;
import com.twitter.library.api.UserSettings;
import android.preference.PreferenceManager;
import com.twitter.library.client.k;
import com.twitter.library.client.Session;
import android.content.Context;

public final class a implements sl
{
    private final Context a;
    
    public a(final Context a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session, final boolean b) {
        final String e = session.e();
        if (e == null) {
            return;
        }
        new k(this.a, e).a().a("location_enabled", b).apply();
    }
    
    @Override
    public void a(final boolean b) {
        PreferenceManager.getDefaultSharedPreferences(this.a).edit().putBoolean("location", b).apply();
    }
    
    @Override
    public boolean a() {
        return this.d() && this.e();
    }
    
    @Override
    public boolean a(final Session session) {
        return this.d() && this.b(session) && this.e();
    }
    
    @Override
    public boolean b() {
        return this.d() && this.e();
    }
    
    @Override
    public boolean b(final Session session) {
        if (session != null) {
            final UserSettings j = session.j();
            if (j != null && j.c()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean b(final Session session, final boolean c) {
        if (session != null) {
            final UserSettings j = session.j();
            if (j != null) {
                if (j.c() != c) {
                    j.c = c;
                    as.a(this.a).a(ab.a(this.a, session, j, false, null));
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean c() {
        return this.d() && this.e();
    }
    
    @Override
    public boolean c(final Session session) {
        final String e = session.e();
        return e != null && new k(this.a, e).getBoolean("location_enabled", false);
    }
    
    @Override
    public boolean d() {
        return PreferenceManager.getDefaultSharedPreferences(this.a).getBoolean("location", false);
    }
    
    @Override
    public boolean e() {
        final LocationManager locationManager = (LocationManager)this.a.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }
}
