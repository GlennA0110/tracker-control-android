/*
 * This file is from NetGuard.
 *
 * NetGuard is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NetGuard is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NetGuard.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright © 2015–2020 by Marcel Bokhorst (M66B), Konrad
 * Kollnig (University of Oxford)
 */

package eu.faircode.netguard;

public class Allowed {
    public String raddr;
    public int rport;
    public boolean isAllowed;
    public boolean sendReject;

    public Allowed() {
        this.raddr = null;
        this.rport = 0;
        this.isAllowed = true;
        this.sendReject = false;
    }

    public Allowed(boolean isAllowed, boolean sendReject) {
        this.raddr = null;
        this.rport = 0;
        this.isAllowed = isAllowed;
        this.sendReject = sendReject;
    }

    public Allowed(String raddr, int rport) {
        this.raddr = raddr;
        this.rport = rport;
        this.isAllowed = true;
        this.sendReject = false;
    }
}
