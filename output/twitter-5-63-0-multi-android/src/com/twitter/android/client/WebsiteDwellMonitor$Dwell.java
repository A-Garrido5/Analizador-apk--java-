// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.featureswitch.d;
import com.twitter.library.api.PromotedEvent;

public enum WebsiteDwellMonitor$Dwell
{
    a("SHORT", 0, 1, PromotedEvent.az) {
        WebsiteDwellMonitor$Dwell$1(final String s, final int n, final int n2, final PromotedEvent promotedEvent) {
        }
        
        @Override
        public WebsiteDwellMonitor$Dwell c() {
            return WebsiteDwellMonitor$Dwell$1.b;
        }
        
        @Override
        public int d() {
            return com.twitter.library.featureswitch.d.a("ad_formats_web_view_dwell_short_interval", 2);
        }
        
        @Override
        public int e() {
            return this.d();
        }
    }, 
    b("MEDIUM", 1, 2, PromotedEvent.aA) {
        WebsiteDwellMonitor$Dwell$2(final String s, final int n, final int n2, final PromotedEvent promotedEvent) {
        }
        
        @Override
        public WebsiteDwellMonitor$Dwell c() {
            return WebsiteDwellMonitor$Dwell$2.c;
        }
        
        @Override
        public int d() {
            return com.twitter.library.featureswitch.d.a("ad_formats_web_view_dwell_medium_interval", 5);
        }
        
        @Override
        public int e() {
            return Math.max(WebsiteDwellMonitor$Dwell$2.b.d() - WebsiteDwellMonitor$Dwell$2.a.d(), 0);
        }
    }, 
    c("LONG", 2, 3, PromotedEvent.aB) {
        WebsiteDwellMonitor$Dwell$3(final String s, final int n, final int n2, final PromotedEvent promotedEvent) {
        }
        
        @Override
        public WebsiteDwellMonitor$Dwell c() {
            return null;
        }
        
        @Override
        public int d() {
            return com.twitter.library.featureswitch.d.a("ad_formats_web_view_dwell_long_interval", 10);
        }
        
        @Override
        public int e() {
            return Math.max(WebsiteDwellMonitor$Dwell$3.c.d() - WebsiteDwellMonitor$Dwell$3.b.d(), 0);
        }
    };
    
    private final PromotedEvent mPromotedEvent;
    private final int mValue;
    
    private WebsiteDwellMonitor$Dwell(final String s, final int n, final int mValue, final PromotedEvent mPromotedEvent) {
        this.mValue = mValue;
        this.mPromotedEvent = mPromotedEvent;
    }
    
    static WebsiteDwellMonitor$Dwell a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                return WebsiteDwellMonitor$Dwell.a;
            }
            case 2: {
                return WebsiteDwellMonitor$Dwell.b;
            }
            case 3: {
                return WebsiteDwellMonitor$Dwell.c;
            }
        }
    }
    
    int a() {
        return this.mValue;
    }
    
    public PromotedEvent b() {
        return this.mPromotedEvent;
    }
    
    public abstract WebsiteDwellMonitor$Dwell c();
    
    public abstract int d();
    
    public abstract int e();
}
