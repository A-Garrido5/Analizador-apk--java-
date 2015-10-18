import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.5.30
// 

public class wv
{
    public static final Map a(final Parcel parcel) {
        byte b = 1;
        if (parcel.readByte() != b) {
            b = 0;
        }
        if (b != 0) {
            final HashMap hashMap = new HashMap();
            parcel.readMap((Map)hashMap, ArrayList.class.getClassLoader());
            return hashMap;
        }
        return null;
    }
    
    public static void a(final Parcel parcel, final Object o) {
        if (o == null) {
            parcel.writeByte((byte)0);
            return;
        }
        parcel.writeByte((byte)1);
    }
    
    public static void a(final Parcel parcel, final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
    }
    
    public static final void a(final Map map, final Parcel parcel) {
        byte b = 1;
        byte b2;
        if (map != null) {
            b2 = b;
        }
        else {
            b2 = 0;
        }
        if (b2 == 0) {
            b = 0;
        }
        parcel.writeByte(b);
        if (b2 != 0) {
            parcel.writeMap(map);
        }
    }
    
    public static final Map b(final Parcel parcel) {
        byte b = 1;
        int i = 0;
        if (parcel.readByte() != b) {
            b = 0;
        }
        HashMap<String, ArrayList> hashMap;
        if (b != 0) {
            hashMap = new HashMap<String, ArrayList>();
            while (i < parcel.readInt()) {
                final String string = parcel.readString();
                final ArrayList list = new ArrayList();
                parcel.readStringList((List)list);
                hashMap.put(string, list);
                ++i;
            }
        }
        else {
            hashMap = null;
        }
        return hashMap;
    }
    
    public static final void b(final Map map, final Parcel parcel) {
        byte b = 1;
        byte b2;
        if (map != null) {
            b2 = b;
        }
        else {
            b2 = 0;
        }
        if (b2 == 0) {
            b = 0;
        }
        parcel.writeByte(b);
        if (b2 != 0) {
            parcel.writeInt(map.size());
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                parcel.writeString((String)entry.getKey());
                parcel.writeStringList((List)entry.getValue());
            }
        }
    }
    
    public static Boolean c(final Parcel parcel) {
        return parcel.readInt() > 0;
    }
}
