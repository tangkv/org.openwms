/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.tms.service.exception;

/**
 * A TransportOrderServiceException.
 * 
 * @author <a href="mailto:russelltina@users.sourceforge.net">Tina Russell</a>
 * @version $Revision$
 * @since 0.1
 */
public class TransportOrderServiceException extends RuntimeException {

    private static final long serialVersionUID = 7532336077611264311L;

    /**
     * Create a new TransportOrderServiceException.
     */
    public TransportOrderServiceException() {
        super();
    }

    /**
     * Create a new TransportOrderServiceException.
     * 
     * @param message
     *            Message text as String
     */
    public TransportOrderServiceException(String message) {
        super(message);
    }

    /**
     * Create a new TransportOrderServiceException.
     * 
     * @param cause
     *            The cause exception
     */
    public TransportOrderServiceException(Throwable cause) {
        super(cause);
    }

    /**
     * Create a new TransportOrderServiceException.
     * 
     * @param message
     *            Message text as String
     * @param cause
     *            The cause exception
     */
    public TransportOrderServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}
