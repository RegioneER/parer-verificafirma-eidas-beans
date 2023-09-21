/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package it.eng.parer.eidas.model;

import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.europa.esig.dss.enumerations.DigestAlgorithm;
import eu.europa.esig.dss.ws.dto.RemoteDocument;

public class EidasRemoteDocument extends RemoteDocument {

    private static final long serialVersionUID = 3168503794989315974L;

    private String absolutePath;

    private URI uri;

    public EidasRemoteDocument() {

    }

    /**
     * Costruttore di comodo per utilizzare un percorso su fileSystem.
     *
     * @param absolutePath
     *            percorso assoluto del file
     */
    public EidasRemoteDocument(final String absolutePath) {
        this.absolutePath = absolutePath;
    }

    /**
     * Costruttore di comodo per utilizzare un URI per il recupero del file.
     *
     * @param uri
     *            risorsa da recuperare
     */
    public EidasRemoteDocument(final URI uri) {
        this.uri = uri;
    }

    @JsonIgnore
    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    @JsonIgnore
    @Override
    public byte[] getBytes() {
        return super.getBytes();
    }

    @JsonIgnore
    @Override
    public DigestAlgorithm getDigestAlgorithm() {
        return super.getDigestAlgorithm();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(absolutePath, uri);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof EidasRemoteDocument)) {
            return false;
        }
        EidasRemoteDocument other = (EidasRemoteDocument) obj;
        return Objects.equals(absolutePath, other.absolutePath) && Objects.equals(uri, other.uri);
    }

    @Override
    public String toString() {
        return "EidasRemoteDocument [" + (absolutePath != null ? "absolutePath - " + absolutePath + ", " : "")
                + (uri != null ? "uri - " + uri : "") + "]";
    }

}
