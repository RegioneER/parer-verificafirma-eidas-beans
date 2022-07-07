package it.eng.parer.eidas.model;

import java.io.Serializable;

import java.util.Date;

import eu.europa.esig.dss.detailedreport.DetailedReport;
import eu.europa.esig.dss.diagnostic.DiagnosticData;
import eu.europa.esig.dss.simplereport.SimpleReport;
import eu.europa.esig.dss.ws.validation.dto.WSReportsDTO;
import eu.europa.esig.dss.validation.reports.Reports;

/**
 * Esito della Chiamata al servizio di validazione EIDAS.
 *
 * @author Snidero_L
 */
public class EsitoValidazioneEidas implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6465483827257847419L;

    private EidasWSReportsDTOTree eidasWSReportsDTOTree;
    private transient Reports reports = null;

    public EsitoValidazioneEidas(EidasWSReportsDTOTree eidasWSReportsDTOTree) {
        this.eidasWSReportsDTOTree = eidasWSReportsDTOTree;
        init();
    }

    private void init() {
        reports = new Reports(eidasWSReportsDTOTree.getReport().getDiagnosticData(),
                eidasWSReportsDTOTree.getReport().getDetailedReport(),
                eidasWSReportsDTOTree.getReport().getSimpleReport(),
                eidasWSReportsDTOTree.getReport().getValidationReport());
    }

    public SimpleReport getSimpleReport() {
        return reports.getSimpleReport();
    }

    public DetailedReport getDetailedReport() {
        return reports.getDetailedReport();
    }

    public DiagnosticData getDiagnosticData() {
        return reports.getDiagnosticData();
    }

    public int getNumeroFirme() {
        return reports.getSimpleReport().getSignaturesCount();
    }

    public int getNumeroFirmeValide() {
        return reports.getSimpleReport().getValidSignaturesCount();
    }

    public String getXmlSimpleReport() {
        return reports.getXmlSimpleReport();
    }

    public String getXmlDetailedReport() {
        return reports.getXmlDetailedReport();
    }

    public String getXmlDiagnosticData() {
        return reports.getXmlDiagnosticData();
    }

    public WSReportsDTO getWsReports() {
        return eidasWSReportsDTOTree.getReport();
    }

    public EidasWSReportsDTOTree getEidasWSReportsDTOTree() {
        return eidasWSReportsDTOTree;
    }

    public void setEidasWSReportsDTOTree(EidasWSReportsDTOTree eidasWSReportsDTOTree) {
        this.eidasWSReportsDTOTree = eidasWSReportsDTOTree;
    }

    public String getVService() {
        return eidasWSReportsDTOTree.getVservice();
    }

    public String getVLibrary() {
        return eidasWSReportsDTOTree.getVlibrary();
    }

    public String getSelfLink() {
        return eidasWSReportsDTOTree.getSelfLink();
    }

    public Date getStartValidation() {
        return eidasWSReportsDTOTree.getStartValidation();
    }

    public Date getEndValidation() {
        return eidasWSReportsDTOTree.getEndValidation();
    }

    public String getMimeType() {
        return eidasWSReportsDTOTree.getMimeType();
    }
}
