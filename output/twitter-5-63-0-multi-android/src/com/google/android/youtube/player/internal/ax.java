// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Bundle;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.os.RemoteException;
import android.view.View;
import com.google.android.youtube.player.c;

public final class ax implements c
{
    private e a;
    private i b;
    
    public ax(final e e, final i i) {
        this.a = (e)com.google.android.youtube.player.internal.c.a(e, "connectionClient cannot be null");
        this.b = (i)com.google.android.youtube.player.internal.c.a(i, "embeddedPlayer cannot be null");
    }
    
    public final View a() {
        try {
            return (View)be.a(this.b.s());
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void a(final Configuration configuration) {
        try {
            this.b.a(configuration);
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    @Override
    public final void a(final String s) {
        this.a(s, 0);
    }
    
    public final void a(final String s, final int n) {
        try {
            this.b.b(s, n);
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void a(final boolean b) {
        try {
            this.b.a(b);
            this.a.a(b);
            this.a.d();
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final boolean a(final int n, final KeyEvent keyEvent) {
        try {
            return this.b.a(n, keyEvent);
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final boolean a(final Bundle bundle) {
        try {
            return this.b.a(bundle);
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void b() {
        try {
            this.b.m();
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void b(final boolean b) {
        try {
            this.b.e(b);
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final boolean b(final int n, final KeyEvent keyEvent) {
        try {
            return this.b.b(n, keyEvent);
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void c() {
        try {
            this.b.n();
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void d() {
        try {
            this.b.o();
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void e() {
        try {
            this.b.p();
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void f() {
        try {
            this.b.q();
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final void g() {
        try {
            this.b.l();
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
    
    public final Bundle h() {
        try {
            return this.b.r();
        }
        catch (RemoteException ex) {
            throw new q(ex);
        }
    }
}
