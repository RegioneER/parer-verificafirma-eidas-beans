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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.europa.esig.dss.enumerations.TokenExtractionStrategy;
import eu.europa.esig.dss.ws.dto.RemoteDocument;
import eu.europa.esig.dss.ws.validation.dto.DataToValidateDTO;

public class EidasDataToValidateMetadata extends DataToValidateDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    // DSS
    private EidasRemoteDocument remoteSignedDocument;
    //
    private List<EidasRemoteDocument> remoteOriginalDocuments;
    //
    private EidasRemoteDocument policyExt;
    //
    private String documentId;
    //
    private String uuid;
    //
    private Date dataDiRiferimento;
    //
    private boolean controlloCrittograficoIgnorato;
    private boolean controlloCatenaTrustIgnorato;
    private boolean controlloCertificatoIgnorato;
    private boolean controlloRevocaIgnorato;
    //
    private boolean includeCertificateRevocationValues = true; // default
    private boolean includeCertificateTokenValues = true; // default
    private boolean includeTimestampTokenValues = true; // default
    private boolean includeSemanticTokenValues = true; // default

    public EidasDataToValidateMetadata() {
        super();
        // default values
        uuid = UUID.randomUUID().toString();
        documentId = "documentId";
        remoteSignedDocument = new EidasRemoteDocument();
        remoteOriginalDocuments = new ArrayList<>();
    }

    public EidasRemoteDocument getRemoteSignedDocument() {
        return remoteSignedDocument;
    }

    public void setRemoteSignedDocument(EidasRemoteDocument remoteSignedDocument) {
        this.remoteSignedDocument = remoteSignedDocument;
    }

    public List<EidasRemoteDocument> getRemoteOriginalDocuments() {
        return remoteOriginalDocuments;
    }

    public void setRemoteOriginalDocuments(List<EidasRemoteDocument> remoteOriginalDocuments) {
        this.remoteOriginalDocuments = remoteOriginalDocuments;
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

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
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

    public EidasRemoteDocument getPolicyExt() {
        return policyExt;
    }

    public void setPolicyExt(EidasRemoteDocument policyExt) {
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

    @JsonIgnore
    @Override
    public RemoteDocument getSignedDocument() {
        return super.getSignedDocument();
    }

    @JsonIgnore
    @Override
    public List<RemoteDocument> getOriginalDocuments() {
        return super.getOriginalDocuments();
    }

    @JsonIgnore
    @Override
    public RemoteDocument getPolicy() {
        return super.getPolicy();
    }

    @JsonIgnore
    @Override
    public TokenExtractionStrategy getTokenExtractionStrategy() {
        return super.getTokenExtractionStrategy();
    }

    @JsonIgnore
    @Override
    public String getSignatureId() {
        return super.getSignatureId();
    }

    @Override
    public String toString() {
        return (remoteSignedDocument != null ? "remoteSignedDocument=" + remoteSignedDocument + ", " : "")
                + (remoteOriginalDocuments != null ? "remoteOriginalDocuments=" + remoteOriginalDocuments + ", " : "")
                + (policyExt != null ? "policyExt=" + policyExt + ", " : "")
                + (documentId != null ? "documentId=" + documentId + ", " : "")
                + (uuid != null ? "uuid=" + uuid + ", " : "")
                + (dataDiRiferimento != null ? "dataDiRiferimento=" + dataDiRiferimento + ", " : "")
                + "controlloCrittograficoIgnorato=" + controlloCrittograficoIgnorato + ", controlloCatenaTrustIgnorato="
                + controlloCatenaTrustIgnorato + ", controlloCertificatoIgnorato=" + controlloCertificatoIgnorato
                + ", controlloRevocaIgnorato=" + controlloRevocaIgnorato + ", includeCertificateRevocationValues="
                + includeCertificateRevocationValues + ", includeCertificateTokenValues="
                + includeCertificateTokenValues + ", includeTimestampTokenValues=" + includeTimestampTokenValues
                + ", includeSemanticTokenValues=" + includeSemanticTokenValues;
    }
}
