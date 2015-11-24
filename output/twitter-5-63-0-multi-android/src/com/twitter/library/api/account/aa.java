// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.platform.PushService;
import java.util.Iterator;
import com.twitter.library.provider.NotificationSetting;
import java.util.HashMap;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.provider.k;
import java.util.Map;
import android.accounts.Account;
import com.twitter.library.service.p;

public class aa extends p
{
    private static final int[] j;
    public String a;
    public Account e;
    public int f;
    public boolean g;
    public boolean h;
    private final Map k;
    private k l;
    
    static {
        j = new int[] { 1, 2, 3, 4 };
    }
    
    public aa(final Context context, final Session session) {
        super(context, aa.class.getName(), session, aa.j);
        this.k = new HashMap();
        this.l = com.twitter.library.provider.k.a(this.i);
    }
    
    private void w() {
        final HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        for (final NotificationSetting notificationSetting : this.k.keySet()) {
            hashMap.put(notificationSetting.settingColumn, this.l.a(this.e.name, notificationSetting.settingColumn));
        }
        for (final NotificationSetting notificationSetting2 : this.k.keySet()) {
            hashMap.put(notificationSetting2.settingColumn, notificationSetting2.b(hashMap.get(notificationSetting2.settingColumn), (int)this.k.get(notificationSetting2)));
        }
        for (final String s : hashMap.keySet()) {
            this.l.a(this.e.name, s, hashMap.get(s));
        }
    }
    
    public aa a(final NotificationSetting notificationSetting, final int n) {
        this.k.put(notificationSetting, n);
        return this;
    }
    
    @Override
    protected void a() {
        switch (this.v()) {
            default: {
                throw new IllegalArgumentException("Invalid action " + this.v());
            }
            case 1: {
                this.a(this.a);
                break;
            }
            case 2: {
                this.a(this.e, this.f, this.g);
            }
            case 3: {
                this.a(this.e);
            }
            case 4: {
                if (!this.e()) {
                    this.w();
                    return;
                }
                if (this.b(this.e.name)) {
                    final int b = this.b(this.e);
                    final Iterator<NotificationSetting> iterator = this.k.keySet().iterator();
                    int a = b;
                    while (iterator.hasNext()) {
                        final NotificationSetting notificationSetting = iterator.next();
                        a = notificationSetting.a(a, (int)this.k.get(notificationSetting));
                    }
                    if (b != a) {
                        this.a(this.e, a, this.g);
                        return;
                    }
                    break;
                }
                else {
                    this.w();
                    if (this.h) {
                        this.b();
                        return;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    protected void a(final Account account) {
        PushService.e(this.i, account);
    }
    
    protected void a(final Account account, final int n, final boolean b) {
        PushService.a(this.i, account, n, b);
    }
    
    protected void a(final String s) {
        PushService.e(this.i, s);
    }
    
    protected int b(final Account account) {
        return PushService.b(this.i, account);
    }
    
    protected void b() {
        PushService.e(this.i);
    }
    
    protected boolean b(final String s) {
        return PushService.g(this.i, s);
    }
    
    protected boolean e() {
        return PushService.c(this.i);
    }
}
