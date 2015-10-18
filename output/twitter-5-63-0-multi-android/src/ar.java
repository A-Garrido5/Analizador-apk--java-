import java.util.concurrent.TimeUnit;
import java.io.IOException;
import android.os.Parcelable;
import android.content.Intent;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import android.os.Messenger;
import android.os.Handler;
import android.app.PendingIntent;
import android.content.Context;
import java.util.concurrent.BlockingQueue;

// 
// Decompiled by Procyon v0.5.30
// 

public class ar
{
    static ar a;
    final BlockingQueue b;
    private Context c;
    private PendingIntent d;
    private Handler e;
    private Messenger f;
    
    public ar() {
        this.b = new LinkedBlockingQueue();
        this.e = new as(this, Looper.getMainLooper());
        this.f = new Messenger(this.e);
    }
    
    public static ar a(final Context context) {
        synchronized (ar.class) {
            if (ar.a == null) {
                ar.a = new ar();
                ar.a.c = context.getApplicationContext();
            }
            return ar.a;
        }
    }
    
    private void b() {
        final Intent intent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent.setPackage("com.google.android.gms");
        this.b.clear();
        intent.putExtra("google.messenger", (Parcelable)this.f);
        this.a(intent);
        this.c.startService(intent);
    }
    
    private void c(final String... array) {
        final String b = this.b(array);
        final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("google.messenger", (Parcelable)this.f);
        this.a(intent);
        intent.putExtra("sender", b);
        this.c.startService(intent);
    }
    
    public String a(final String... array) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        this.b.clear();
        this.c(array);
        Intent intent;
        try {
            intent = this.b.poll(5000L, TimeUnit.MILLISECONDS);
            if (intent == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        }
        catch (InterruptedException ex) {
            throw new IOException(ex.getMessage());
        }
        final String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra != null) {
            return stringExtra;
        }
        intent.getStringExtra("error");
        final String stringExtra2 = intent.getStringExtra("error");
        if (stringExtra2 != null) {
            throw new IOException(stringExtra2);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    
    public void a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        this.b();
        Intent intent;
        try {
            intent = this.b.poll(5000L, TimeUnit.MILLISECONDS);
            if (intent == null) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        }
        catch (InterruptedException ex) {
            throw new IOException(ex.getMessage());
        }
        if (intent.getStringExtra("unregistered") != null) {
            return;
        }
        final String stringExtra = intent.getStringExtra("error");
        if (stringExtra != null) {
            throw new IOException(stringExtra);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    
    void a(final Intent intent) {
        synchronized (this) {
            if (this.d == null) {
                final Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                this.d = PendingIntent.getBroadcast(this.c, 0, intent2, 0);
            }
            intent.putExtra("app", (Parcelable)this.d);
        }
    }
    
    String b(final String... array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        final StringBuilder sb = new StringBuilder(array[0]);
        for (int i = 1; i < array.length; ++i) {
            sb.append(',').append(array[i]);
        }
        return sb.toString();
    }
}
