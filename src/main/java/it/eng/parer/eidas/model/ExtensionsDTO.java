package it.eng.parer.eidas.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ExtensionsDTO", namespace = "http://validation.parer.regione.emilia-romagna.it/extension")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionsDTO", propOrder = { "authorityKeyIdentifier", "subjectKeyIdentifier", "marcaBase64",
        "crlNumber" })
public class ExtensionsDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7712071162932692398L;

    @XmlElement(name = "authorityKeyIdentifier", namespace = "http://parer.regione.emilia-romagna.it/extension/authorityKeyIdentifier", nillable = true)
    private String authorityKeyIdentifier = null;

    @XmlElement(name = "subjectKeyIdentifier", namespace = "http://parer.regione.emilia-romagna.it/extension/subjectKeyIdentifier", nillable = true)
    private String subjectKeyIdentifier = null;

    @XmlElement(name = "marcaBase64", namespace = "http://parer.regione.emilia-romagna.it/extension/marcaBase64", nillable = true)
    private String marcaBase64 = null;

    @XmlElement(name = "crlNumber", namespace = "http://parer.regione.emilia-romagna.it/extension/crlNumber", nillable = true)
    private Long crlNumber;

    public ExtensionsDTO() {
        super();
    }

    /**
     * @return the authorityKeyIdentifier
     */
    public String getAuthorityKeyIdentifier() {
        return authorityKeyIdentifier;
    }

    /**
     * @param authorityKeyIdentifier
     *            the authorityKeyIdentifier to set
     */
    public void setAuthorityKeyIdentifier(String authorityKeyIdentifier) {
        this.authorityKeyIdentifier = authorityKeyIdentifier;
    }

    /**
     * @return the subjectKeyIdentifier
     */
    public String getSubjectKeyIdentifier() {
        return subjectKeyIdentifier;
    }

    /**
     * @param subjectKeyIdentifier
     *            the subjectKeyIdentifier to set
     */
    public void setSubjectKeyIdentifier(String subjectKeyIdentifier) {
        this.subjectKeyIdentifier = subjectKeyIdentifier;
    }

    /**
     * @return the marcaBase64
     */
    public String getMarcaBase64() {
        return marcaBase64;
    }

    /**
     * @param marcaBase64
     *            the marcaBase64 to set
     */
    public void setMarcaBase64(String marcaBase64) {
        this.marcaBase64 = marcaBase64;
    }

    /**
     * @return the crlNumber
     */
    public Long getCrlNumber() {
        return crlNumber;
    }

    /**
     * @param crlNumber
     *            the crlNumber to set
     */
    public void setCrlNumber(Long crlNumber) {
        this.crlNumber = crlNumber;
    }

}
