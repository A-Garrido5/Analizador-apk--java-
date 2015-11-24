import java.io.Reader;
import java.io.BufferedReader;

// 
// Decompiled by Procyon v0.5.30
// 

class e extends BufferedReader
{
    private long a;
    
    public e(final Reader reader) {
        super(reader);
    }
    
    @Override
    public String readLine() {
        final long currentTimeMillis = System.currentTimeMillis();
        final String line = super.readLine();
        this.a += System.currentTimeMillis() - currentTimeMillis;
        return line;
    }
}
