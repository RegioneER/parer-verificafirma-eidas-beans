package it.eng.parer.eidas.model;

import java.util.Date;

import com.fasterxml.uuid.Generators;

/**
 * @author sinatti_s
 *
 */
public class EidasMetadataToValidate {

    //
    private String idDocuments;
    //
    private String signedDocumentName;
    //
    private String[] originalDocumentNames;
    //
    private String uuid;
    //
    private Date dataDiRiferimento;
    //
    private boolean verificaAllaDataDiFirma;
    private boolean controlloCrittograficoIgnorato;
    private boolean controlloCatenaTrustIgnorato;
    private boolean controlloCertificatoIgnorato;
    private boolean controlloRevocaIgnorato;

    //
    private boolean includeCertificateRevocationValues = true; // default
    private boolean includeCertificateTokenValues = true; // default
    private boolean includeTimestampTokenValues = true; // default
    private boolean includeSemanticTokenValues = true; // default

    public EidasMetadataToValidate() {
        super();
        // default values
        uuid = Generators.randomBasedGenerator().generate().toString();
        idDocuments = "idDocuments";
        signedDocumentName = "signedDocumentName";
    }

    public boolean isControlloCrittograficoIgnorato() {
        return controlloCrittograficoIgnorato;
    }

    public void setControlloCrittograficoIgnorato(boolean controlloCrittograficoIgnorato) {
        this.controlloCrittograficoIgnorato = controlloCrittograficoIgnorato;
    }

    public boolean isControlloCatenaTrustIgnorato() {
        return controlloCatenaTrustIgnorato;
    }

    public void setControlloCatenaTrustIgnorato(boolean controlloCatenaTrustIgnorato) {
        this.controlloCatenaTrustIgnorato = controlloCatenaTrustIgnorato;
    }

    public void setControlloCertificatoIgnorato(boolean controlloCertificatoIgnorato) {
        this.controlloCertificatoIgnorato = controlloCertificatoIgnorato;
    }

    public boolean isControlloCertificatoIgnorato() {
        return controlloCertificatoIgnorato;
    }

    public boolean isVerificaAllaDataDiFirma() {
        return verificaAllaDataDiFirma;
    }

    public void setVerificaAllaDataDiFirma(boolean verificaAllaDataDiFirma) {
        this.verificaAllaDataDiFirma = verificaAllaDataDiFirma;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getDataDiRiferimento() {
        return dataDiRiferimento;
    }

    public void setDataDiRiferimento(Date dataDiRiferimento) {
        this.dataDiRiferimento = dataDiRiferimento;
    }

    public String getIdDocuments() {
        return idDocuments;
    }

    public void setIdDocuments(String idDocuments) {
        this.idDocuments = idDocuments;
    }

    public String getSignedDocumentName() {
        return signedDocumentName;
    }

    public void setSignedDocumentName(String signedDocumentName) {
        this.signedDocumentName = signedDocumentName;
    }

    public String[] getOriginalDocumentNames() {
        return originalDocumentNames;
    }

    public void setOriginalDocumentNames(String[] originalDocumentNames) {
        this.originalDocumentNames = originalDocumentNames;
    }

    public boolean isIncludeCertificateRevocationValues() {
        return includeCertificateRevocationValues;
    }

    public void setIncludeCertificateRevocationValues(boolean includeCertificateRevocationValues) {
        this.includeCertificateRevocationValues = includeCertificateRevocationValues;
    }

    public boolean isIncludeCertificateTokenValues() {
        return includeCertificateTokenValues;
    }

    public void setIncludeCertificateTokenValues(boolean includeCertificateTokenValues) {
        this.includeCertificateTokenValues = includeCertificateTokenValues;
    }

    public boolean isIncludeTimestampTokenValues() {
        return includeTimestampTokenValues;
    }

    public void setIncludeTimestampTokenValues(boolean includeTimestampTokenValues) {
        this.includeTimestampTokenValues = includeTimestampTokenValues;
    }

    public boolean isControlloRevocaIgnorato() {
        return controlloRevocaIgnorato;
    }

    public void setControlloRevocaIgnorato(boolean controlloRevocaIgnorato) {
        this.controlloRevocaIgnorato = controlloRevocaIgnorato;
    }

    public boolean isIncludeSemanticTokenValues() {
        return includeSemanticTokenValues;
    }

    public void setIncludeSemanticTokenValues(boolean includeSemanticTokenValues) {
        this.includeSemanticTokenValues = includeSemanticTokenValues;
    }

}
