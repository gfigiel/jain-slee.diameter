/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.slee.resource.diameter.sh.events.avp.userdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import net.java.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension;
import net.java.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension2;


/**
 * <p>Java class for tShIMSDataExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tShIMSDataExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PSIActivation" type="{}tPSIActivation" minOccurs="0"/>
 *         &lt;element name="Extension" type="{}tShIMSDataExtension2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tShIMSDataExtension", propOrder = {
    "psiActivation",
    "extension"
})
public class TShIMSDataExtension implements ShIMSDataExtension {

    @XmlElement(name = "PSIActivation")
    protected Short psiActivation;
    @XmlElement(name = "Extension")
    protected TShIMSDataExtension2 extension;

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension#getPSIActivation()
     */
    public Short getPSIActivation() {
        return psiActivation;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension#setPSIActivation(java.lang.Short)
     */
    public void setPSIActivation(Short value) {
        this.psiActivation = value;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension#getExtension()
     */
    public ShIMSDataExtension2 getExtension() {
        return extension;
    }

    /* (non-Javadoc)
     * @see org.mobicents.slee.resource.diameter.sh.events.avp.userdata.ShIMSDataExtension#setExtension(org.mobicents.slee.resource.diameter.sh.events.avp.userdata.TShIMSDataExtension2)
     */
    public void setExtension(ShIMSDataExtension2 value) {
        this.extension = (TShIMSDataExtension2) value;
    }

}
