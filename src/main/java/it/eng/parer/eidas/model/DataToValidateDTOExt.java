package it.eng.parer.eidas.model;

import java.util.Date;
import java.util.List;
import com.fasterxml.uuid.Generators;
import eu.europa.esig.dss.ws.validation.dto.DataToValidateDTO;

/**
 * @author sinatti_s
 *
 */
public class DataToValidateDTOExt extends DataToValidateDTO {

    // DSS
    private RemoteDocumentExt signedDocumentExt;
    private List<RemoteDocumentExt> originalDocumentsExt;
    private RemoteDocumentExt policyExt;

    //
    private String idComponente;
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

    public DataToValidateDTOExt() {
        super();
        // default values
        uuid = Generators.randomBasedGenerator().generate().toString();
        idComponente = "IdComponente";
    }

    public DataToValidateDTOExt(EidasMetadataToValidate metadata) {
        this.uuid = metadata.getUuid();
        this.idComponente = metadata.getIdDocuments();
        this.dataDiRiferimento = metadata.getDataDiRiferimento();
        this.verificaAllaDataDiFirma = metadata.isVerificaAllaDataDiFirma();
        this.controlloCrittograficoIgnorato = metadata.isControlloCrittograficoIgnorato();
        this.controlloCatenaTrustIgnorato = metadata.isControlloCatenaTrustIgnorato();
        this.controlloCertificatoIgnorato = metadata.isControlloCertificatoIgnorato();
        this.controlloRevocaIgnorato = metadata.isControlloRevocaIgnorato();
        this.includeCertificateRevocationValues = metadata.isIncludeCertificateRevocationValues();
        this.includeCertificateTokenValues = metadata.isIncludeCertificateTokenValues();
        this.includeTimestampTokenValues = metadata.isIncludeTimestampTokenValues();
        this.includeSemanticTokenValues = metadata.isIncludeSemanticTokenValues();
    }

    public RemoteDocumentExt getSignedDocumentExt() {
        return signedDocumentExt;
    }

    public void setSignedDocumentExt(RemoteDocumentExt signedDocumentExt) {
        this.signedDocumentExt = signedDocumentExt;
    }

    public List<RemoteDocumentExt> getOriginalDocumentsExt() {
        return originalDocumentsExt;
    }

    public void setOriginalDocumentsExt(List<RemoteDocumentExt> originalDocumentsExt) {
        this.originalDocumentsExt = originalDocumentsExt;
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

    public String getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(String idComponente) {
        this.idComponente = idComponente;
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

    public RemoteDocumentExt getPolicyExt() {
        return policyExt;
    }

    public void setPolicyExt(RemoteDocumentExt policyExt) {
        this.policyExt = policyExt;
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

    public boolean isIncludeSemanticTokenValues() {
        return includeSemanticTokenValues;
    }

    public void setIncludeSemanticTokenValues(boolean includeSemanticTokenValues) {
        this.includeSemanticTokenValues = includeSemanticTokenValues;
    }

    public boolean isControlloRevocaIgnorato() {
        return controlloRevocaIgnorato;
    }

    public void setControlloRevocaIgnorato(boolean controlloRevocaIgnorato) {
        this.controlloRevocaIgnorato = controlloRevocaIgnorato;
    }
}
