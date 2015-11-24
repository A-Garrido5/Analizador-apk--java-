// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.util.Iterator;
import android.database.Observable;

final class aq extends Observable
{
    private aq() {
    }
    
    aq(final c5 c5) {
        this();
    }
    
    public void a() {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().d();
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void a(@ct final int n) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().c(n);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void a(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().h(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void a(final long n, final long n2, final long n3) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(n, n2, n3);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void a(final boolean b) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().c(b);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void a(final boolean b, final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(b, n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void b() {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void b(@ct final int n) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(n);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void b(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void b(final boolean b) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(b);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void c() {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().b();
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void c(@ct final int n) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(n);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void c(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().i(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void c(final boolean b) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(b);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void d() {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().c();
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void d(final int n) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().d(n);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void d(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().f(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void e() {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().e();
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void e(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().n(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void f() {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().f();
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void f(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().m(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void g(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().k(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void h(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().e(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void i(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().l(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void j(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().g(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void k(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().c(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void l(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().j(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void m(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().b(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
    
    public void n(final long n, final long n2) {
        final int f = GoogleDriveService.F;
        synchronized (this.mObservers) {
            final Iterator<cs> iterator = (Iterator<cs>)this.mObservers.iterator();
            while (iterator.hasNext()) {
                iterator.next().d(n, n2);
                if (f != 0) {
                    break;
                }
            }
        }
    }
}
