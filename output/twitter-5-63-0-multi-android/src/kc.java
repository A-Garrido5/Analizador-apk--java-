import org.json.JSONException;
import org.json.JSONObject;
import java.util.Iterator;
import org.json.JSONArray;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class kc
{
    protected String a(final Date date) {
        final TimeZone timeZone = TimeZone.getTimeZone("UTC");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }
    
    protected JSONArray a(final List list) {
        final JSONArray jsonArray = new JSONArray();
        final Iterator<kg> iterator = list.iterator();
        while (iterator.hasNext()) {
            jsonArray.put((Object)iterator.next().a());
        }
        return jsonArray;
    }
    
    protected abstract JSONObject a();
    
    @Override
    public String toString() {
        try {
            return this.a().toString(3);
        }
        catch (JSONException ex) {
            throw new AssertionError(ex);
        }
    }
}
