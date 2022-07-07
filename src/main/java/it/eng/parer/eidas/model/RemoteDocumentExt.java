package it.eng.parer.eidas.model;

import eu.europa.esig.dss.ws.dto.RemoteDocument;

public class RemoteDocumentExt extends RemoteDocument {

    private static final long serialVersionUID = 3168503794989315974L;

    private String absolutePath;

    public RemoteDocumentExt() {

    }

    /**
     * Costruttore di comodo per utilizzare un percorso su fileSystem.
     *
     * @param absolutePath
     *            percorso assoluto del file
     */
    public RemoteDocumentExt(final String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((absolutePath == null) ? 0 : absolutePath.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        RemoteDocumentExt other = (RemoteDocumentExt) obj;
        if (absolutePath == null) {
            if (other.absolutePath != null)
                return false;
        } else if (!absolutePath.equals(other.absolutePath))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RemoteDocumentExt [absolutePath=" + absolutePath + "]" + super.toString();
    }

}
