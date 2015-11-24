import java.util.Collection;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import com.twitter.errorreporter.ErrorReporter;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.commerce.model.ServerErrorType;
import com.twitter.library.commerce.model.ServerError;
import java.util.ArrayList;
import android.os.Bundle;
import com.twitter.library.service.aa;

// 
// Decompiled by Procyon v0.5.30
// 

public class rd
{
    public static Bundle a(final aa aa, final String s) {
        if (aa != null) {
            try {
                final Bundle bundle = new Bundle();
                ArrayList<ServerError> a;
                if (aa.b() != null) {
                    a = new ArrayList<ServerError>();
                    a.add(new ServerError("Network Error", "", ServerErrorType.b));
                }
                else {
                    a = (ArrayList<ServerError>)a(aa.c(), null);
                }
                bundle.putParcelableArrayList(s, (ArrayList)a);
                return bundle;
            }
            catch (IOException ex) {
                ErrorReporter.a(ex);
            }
        }
        return null;
    }
    
    public static ArrayList a(final int n, final JsonParser jsonParser) {
        final ArrayList<ServerError> list = new ArrayList<ServerError>();
        int n2 = 0;
        if (jsonParser != null) {
            while (true) {
                while (true) {
                    Label_0188: {
                        try {
                            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                                final String e = jsonParser.e();
                                switch (re.a[jsonToken.ordinal()]) {
                                    default: {
                                        jsonParser.c();
                                        break;
                                    }
                                    case 1: {
                                        if ("errors".equals(e)) {
                                            list.addAll(a(jsonParser));
                                            break;
                                        }
                                        break Label_0188;
                                    }
                                }
                            }
                        }
                        catch (IOException ex) {}
                        break;
                    }
                    jsonParser.c();
                    continue;
                }
            }
            final int size = list.size();
            n2 = 0;
            if (size > 0) {
                n2 = 1;
            }
        }
        if (n2 == 0) {
            switch (n) {
                default: {
                    list.add(new ServerError("Unknown error", "", ServerErrorType.a));
                    break;
                }
                case 401: {
                    list.add(new ServerError("Auth error", "", ServerErrorType.c));
                    return list;
                }
                case 400: {
                    list.add(new ServerError("Bad request", "", ServerErrorType.d));
                    return list;
                }
                case 503: {
                    list.add(new ServerError("Service Unavailable", "", ServerErrorType.e));
                    return list;
                }
                case 500: {
                    list.add(new ServerError("Internal server error", "", ServerErrorType.f));
                    return list;
                }
            }
        }
        return list;
    }
    
    private static ArrayList a(final JsonParser jsonParser) {
        final ArrayList<ServerError> list = new ArrayList<ServerError>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (re.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 2: {
                    list.add(b(jsonParser));
                    break;
                }
            }
        }
        return list;
    }
    
    private static ServerError b(final JsonParser jsonParser) {
        String r = null;
        JsonToken jsonToken = jsonParser.a();
        String r2 = null;
        String r3 = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            final String e = jsonParser.e();
            switch (re.a[jsonToken.ordinal()]) {
                default: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("message".equals(e)) {
                        r2 = jsonParser.r();
                        break;
                    }
                    if ("refId".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    if ("type".equals(e)) {
                        r3 = jsonParser.r();
                        break;
                    }
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new ServerError(r2, r, ServerErrorType.a(r3));
    }
}
