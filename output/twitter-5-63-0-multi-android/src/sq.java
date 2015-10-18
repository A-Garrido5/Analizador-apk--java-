import com.twitter.library.featureswitch.d;

// 
// Decompiled by Procyon v0.5.30
// 

class sq implements Runnable
{
    final /* synthetic */ sp a;
    
    sq(final sp a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a(d.f("geo_data_provider_enabled"), d.f("geo_data_provider_google_play_services_enabled"), d.a("geo_data_provider_update_duration", -1), d.a("geo_data_provider_update_interval", -1));
    }
}
