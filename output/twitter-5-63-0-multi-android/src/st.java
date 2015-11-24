import java.util.Collections;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import android.os.Message;
import android.content.SharedPreferences;
import java.util.ArrayList;
import android.os.Looper;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class st extends sn
{
    private static st c;
    private sp d;
    private List e;
    private int f;
    private Handler g;
    private Location h;
    private boolean i;
    
    private st(final Context context) {
        super(context, null);
        this.f = -1;
        this.g = new su(Looper.getMainLooper(), this);
        final SharedPreferences sharedPreferences = context.getSharedPreferences("geo_mock_locations_file", 0);
        if (sharedPreferences.contains("geo_mock_locations")) {
            this.e = this.c(sharedPreferences.getString("geo_mock_locations", ""));
        }
        else {
            this.e = new ArrayList();
        }
        this.i = sharedPreferences.getBoolean("geo_mock_null_location", false);
    }
    
    public static st a(final Context context) {
        synchronized (st.class) {
            if (st.c == null) {
                st.c = new st(context);
            }
            return st.c;
        }
    }
    
    private List c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/util/ArrayList;
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_2       
        //     8: new             Lorg/json/JSONArray;
        //    11: dup            
        //    12: aload_1        
        //    13: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //    16: astore_3       
        //    17: iconst_0       
        //    18: istore          4
        //    20: aload_3        
        //    21: invokevirtual   org/json/JSONArray.length:()I
        //    24: istore          6
        //    26: iload           4
        //    28: iload           6
        //    30: if_icmpge       201
        //    33: aload_3        
        //    34: iload           4
        //    36: invokevirtual   org/json/JSONArray.getJSONObject:(I)Lorg/json/JSONObject;
        //    39: astore          8
        //    41: new             Landroid/location/Location;
        //    44: dup            
        //    45: aload           8
        //    47: ldc             "Source"
        //    49: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //    52: invokespecial   android/location/Location.<init>:(Ljava/lang/String;)V
        //    55: astore          9
        //    57: aload           9
        //    59: aload           8
        //    61: ldc             "Latitude"
        //    63: invokevirtual   org/json/JSONObject.getDouble:(Ljava/lang/String;)D
        //    66: invokevirtual   android/location/Location.setLatitude:(D)V
        //    69: aload           9
        //    71: aload           8
        //    73: ldc             "Longitude"
        //    75: invokevirtual   org/json/JSONObject.getDouble:(Ljava/lang/String;)D
        //    78: invokevirtual   android/location/Location.setLongitude:(D)V
        //    81: aload           9
        //    83: aload           8
        //    85: ldc             "Timestamp"
        //    87: invokevirtual   org/json/JSONObject.getLong:(Ljava/lang/String;)J
        //    90: invokevirtual   android/location/Location.setTime:(J)V
        //    93: aload           8
        //    95: ldc             "H-Accuracy"
        //    97: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //   100: ifeq            116
        //   103: aload           9
        //   105: aload           8
        //   107: ldc             "H-Accuracy"
        //   109: invokevirtual   org/json/JSONObject.getDouble:(Ljava/lang/String;)D
        //   112: d2f            
        //   113: invokevirtual   android/location/Location.setAccuracy:(F)V
        //   116: aload           8
        //   118: ldc             "Altitude"
        //   120: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //   123: ifeq            138
        //   126: aload           9
        //   128: aload           8
        //   130: ldc             "Altitude"
        //   132: invokevirtual   org/json/JSONObject.getDouble:(Ljava/lang/String;)D
        //   135: invokevirtual   android/location/Location.setAltitude:(D)V
        //   138: aload           8
        //   140: ldc             "Bearing"
        //   142: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //   145: ifeq            161
        //   148: aload           9
        //   150: aload           8
        //   152: ldc             "Bearing"
        //   154: invokevirtual   org/json/JSONObject.getDouble:(Ljava/lang/String;)D
        //   157: d2f            
        //   158: invokevirtual   android/location/Location.setBearing:(F)V
        //   161: aload           8
        //   163: ldc             "Speed"
        //   165: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //   168: ifeq            184
        //   171: aload           9
        //   173: aload           8
        //   175: ldc             "Speed"
        //   177: invokevirtual   org/json/JSONObject.getDouble:(Ljava/lang/String;)D
        //   180: d2f            
        //   181: invokevirtual   android/location/Location.setSpeed:(F)V
        //   184: aload_2        
        //   185: aload           9
        //   187: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   192: pop            
        //   193: iinc            4, 1
        //   196: goto            20
        //   199: astore          5
        //   201: aload_2        
        //   202: areturn        
        //   203: astore          7
        //   205: goto            193
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  8      17     199    201    Lorg/json/JSONException;
        //  20     26     199    201    Lorg/json/JSONException;
        //  33     116    203    208    Lorg/json/JSONException;
        //  116    138    203    208    Lorg/json/JSONException;
        //  138    161    203    208    Lorg/json/JSONException;
        //  161    184    203    208    Lorg/json/JSONException;
        //  184    193    203    208    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0116:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private sp i() {
        if (this.d == null) {
            this.d = sp.a(this.a);
        }
        return this.d;
    }
    
    @Override
    public Location a() {
        synchronized (this) {
            Location h;
            if (this.i) {
                h = null;
            }
            else {
                h = this.h;
            }
            return h;
        }
    }
    
    public void a(final Location h) {
        // monitorenter(this)
        if (h != null) {
            try {
                this.e.add(h);
                this.i().a(true);
                if (this.h == null) {
                    this.h = h;
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    // monitorexit(this)
    
    public void a(final Location location, final Location location2) {
        synchronized (this) {
            final int index = this.e.indexOf(location);
            if (index != -1) {
                this.e.set(index, location2);
            }
        }
    }
    
    protected void a(final Message message) {
        synchronized (this) {
            if (message.what == 0 && !this.e.isEmpty()) {
                if (!this.i) {
                    this.f = (1 + this.f) % this.e.size();
                    final Location h = this.e.get(this.f);
                    h.setTime(System.currentTimeMillis());
                    this.i().a(h);
                    this.h = h;
                }
                this.g.sendEmptyMessageDelayed(0, 2000L);
            }
        }
    }
    
    public void a(final boolean i) {
        synchronized (this) {
            if (this.i != i) {
                final sp j = this.i();
                if (i) {
                    j.a(true);
                    j.g();
                }
                else if (!this.g()) {
                    j.a(false);
                }
                this.a.getSharedPreferences("geo_mock_locations_file", 0).edit().putBoolean("geo_mock_null_location", i).apply();
                this.i = i;
            }
        }
    }
    
    @Override
    public void b() {
        this.f = -1;
        this.g.sendEmptyMessageDelayed(0, 2000L);
    }
    
    @Override
    public void c() {
        this.g.removeMessages(0);
    }
    
    public void c(final Location location) {
        synchronized (this) {
            this.e.remove(location);
            if (this.e.isEmpty() && !this.i) {
                this.i().a(false);
            }
        }
    }
    
    public void d() {
        final JSONArray jsonArray = new JSONArray();
        final Iterator<Location> iterator = (Iterator<Location>)this.e.iterator();
    Label_0173_Outer:
        while (true) {
            Label_0183: {
                if (!iterator.hasNext()) {
                    break Label_0183;
                }
                final Location location = iterator.next();
                final JSONObject jsonObject = new JSONObject();
                while (true) {
                    try {
                        jsonObject.put("Latitude", location.getLatitude());
                        jsonObject.put("Longitude", location.getLongitude());
                        jsonObject.put("Timestamp", location.getTime());
                        jsonObject.put("Source", (Object)location.getProvider());
                        if (location.hasAccuracy()) {
                            jsonObject.put("H-Accuracy", (double)location.getAccuracy());
                        }
                        if (location.hasAltitude()) {
                            jsonObject.put("Altitude", location.getAltitude());
                        }
                        if (location.hasBearing()) {
                            jsonObject.put("Bearing", (double)location.getBearing());
                        }
                        if (location.hasSpeed()) {
                            jsonObject.put("Speed", (double)location.getSpeed());
                        }
                        jsonArray.put((Object)jsonObject);
                        continue Label_0173_Outer;
                        this.a.getSharedPreferences("geo_mock_locations_file", 0).edit().putString("geo_mock_locations", jsonArray.toString()).apply();
                    }
                    catch (JSONException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public void e() {
        synchronized (this) {
            this.e.clear();
            this.i().a(false);
            this.d();
        }
    }
    
    public boolean f() {
        synchronized (this) {
            return this.i;
        }
    }
    
    public boolean g() {
        synchronized (this) {
            return !this.e.isEmpty();
        }
    }
    
    public List h() {
        return Collections.unmodifiableList((List<?>)this.e);
    }
}
