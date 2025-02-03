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

import eu.europa.esig.dss.ws.validation.dto.WSReportsDTO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "EidasWSReportsDTO", namespace = "http://parer.regione.emilia-romagna.it/validation/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EidasWSReports", propOrder = { "report", "children", "parent", "mimeType", "unsigned", "vservice",
        "vlibrary", "selfLink", "startValidation", "endValidation", "idComponente" })
public class EidasWSReportsDTOTree implements Serializable {

    private static final long serialVersionUID = -7644179209377579819L;

    @XmlElement(name = "report", namespace = "http://parer.regione.emilia-romagna.it/validation/children")
    private WSReportsDTO report = null;

    @XmlElement(name = "children", namespace = "http://parer.regione.emilia-romagna.it/validation/children")
    private List<EidasWSReportsDTOTree> children = new ArrayList<>();

    @XmlElement(name = "parent", namespace = "http://parer.regione.emilia-romagna.it/validation/parent")
    private boolean parent = false;

    @XmlElement(name = "mimetype", namespace = "http://parer.regione.emilia-romagna.it/validation/mimetype")
    private String mimeType;

    @XmlElement(name = "unsigned", namespace = "http://parer.regione.emilia-romagna.it/validation/unsigned")
    private boolean unsigned = false;

    @XmlElement(name = "version", namespace = "http://parer.regione.emilia-romagna.it/validation/vservice")
    private String vservice = null;

    @XmlElement(name = "vfirma", namespace = "http://parer.regione.emilia-romagna.it/validation/vlibrary")
    private String vlibrary = null;

    @XmlElement(name = "selflink", namespace = "http://parer.regione.emilia-romagna.it/validation/selflink")
    private String selfLink = null;

    @XmlElement(name = "startvalidation", namespace = "http://parer.regione.emilia-romagna.it/validation/startvalidation")
    private Date startValidation;

    @XmlElement(name = "endvalidation", namespace = "http://parer.regione.emilia-romagna.it/validation/endvalidation")
    private Date endValidation;

    @XmlElement(name = "idcomponente", namespace = "http://parer.regione.emilia-romagna.it/validation/idcomponente")
    private String idComponente = null;

    public EidasWSReportsDTOTree() {
        super();
    }

    public EidasWSReportsDTOTree(WSReportsDTO data) {
        this.report = data;
    }

    // copy constructor
    public EidasWSReportsDTOTree(EidasWSReportsDTOTree tree) {
        report = tree.report;
        parent = tree.parent;
        mimeType = tree.mimeType;
        unsigned = tree.unsigned;
        vservice = tree.vservice;
        vlibrary = tree.vservice;
        idComponente = tree.idComponente;
        // copy children
        addChildren(tree.children);
    }

    public EidasWSReportsDTOTree(String mimeType) {
        this.unsigned = true; // default
        this.mimeType = mimeType;
    }

    public EidasWSReportsDTOTree addChild(EidasWSReportsDTOTree child) {
        child.setParent(true);
        this.children.add(child);
        return child;
    }

    public void addChildren(List<EidasWSReportsDTOTree> children) {
        children.forEach(each -> each.setParent(true));
        this.children.addAll(children);
    }

    public List<EidasWSReportsDTOTree> getChildren() {
        return children;
    }

    public void setChildren(List<EidasWSReportsDTOTree> children) {
        this.children = children;
    }

    public WSReportsDTO getReport() {
        return report;
    }

    public void setReport(WSReportsDTO report) {
        this.report = report;
    }

    public boolean isParent() {
        return parent;
    }

    public void setParent(boolean parent) {
        this.parent = parent;
    }

    /*
     * <em>Nota</em>: ogni oggetto di tipo signature del report dettagliato contiene un content/type: {@link
     * eu.europa.esig.dss.jaxb.diagnostic.XmlSignature#contentType}. Questo content type è calcolato utilizzato la
     * classe interna {@link MimeType}. Il "nostro" mimetype utilizza tika e vale <u>a livello di documento (o "strato"
     * di documento) verfifcato</u>.
     *
     * @return mime/type del {@link EidasRemoteDocument} verificato.
     */
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public boolean isUnsigned() {
        return unsigned;
    }

    public void setUnsigned(boolean unsigned) {
        this.unsigned = unsigned;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public Date getStartValidation() {
        return startValidation;
    }

    public void setEndValidation(Date endValidation) {
        this.endValidation = endValidation;
    }

    public Date getEndValidation() {
        return endValidation;
    }

    public void setStartValidation(Date startValidation) {
        this.startValidation = startValidation;
    }

    public String getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(String idComponente) {
        this.idComponente = idComponente;
    }

    public String getVservice() {
        return vservice;
    }

    public void setVservice(String vservice) {
        this.vservice = vservice;
    }

    public String getVlibrary() {
        return vlibrary;
    }

    public void setVlibrary(String vlibrary) {
        this.vlibrary = vlibrary;
    }

}
