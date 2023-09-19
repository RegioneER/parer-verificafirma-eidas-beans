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

package it.eng.parer.eidas.model.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import it.eng.parer.eidas.model.EidasDataToValidateMetadata;

public class EidasParerException extends RuntimeException implements ParerError {

    private static final long serialVersionUID = 9134429204910412621L;

    private String message;

    private List<String> details = new ArrayList<>();

    private ErrorCode code;

    private String moreInfo;

    private EidasDataToValidateMetadata metadata;

    public EidasParerException() {
        super();
    }

    public EidasParerException(EidasDataToValidateMetadata metadata) {
        super();
        this.metadata = metadata;
    }

    public EidasParerException(EidasDataToValidateMetadata metadata, Throwable cause) {
        super(cause);
        this.metadata = metadata;
    }

    @Override
    public String getMessage() {
        return stdMsgPrefix() + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public List<String> getDetails() {
        return details;
    }

    public void addDetail(String detail) {
        if (details == null) {
            details = new ArrayList<>();
        }
        details.add(detail);
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    @Override
    public ErrorCode getCode() {
        return code;
    }

    public void setCode(ErrorCode code) {
        this.code = code;
    }

    @Override
    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    @Override
    public EidasDataToValidateMetadata getMetadata() {
        return metadata;
    }

    public EidasParerException withMoreInfo(String moreInfo) {
        setMoreInfo(moreInfo);
        return this;
    }

    public EidasParerException withCode(ErrorCode code) {
        setCode(code);
        return this;
    }

    public EidasParerException withMessage(String message) {
        setMessage(message);
        return this;
    }

    public EidasParerException withDetail(String message) {
        addDetail(message);
        return this;
    }

    public EidasParerException withDetails(List<String> messages) {
        if (messages != null) {
            messages.forEach(this::addDetail);
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "message=" + message + " - details="
                + details.stream().filter(Objects::nonNull).map(Object::toString).collect(Collectors.joining(","))
                + " - code=" + code + " - moreInfo=" + moreInfo + (metadata != null ? " - metadata=" + metadata : "");
    }

}
