package it.eng.parer.eidas.model.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author sinatti_s
 */
public class EidasParerException extends RuntimeException implements ParerError {

    private static final long serialVersionUID = 9134429204910412621L;

    private String message;

    private List<String> details = new ArrayList<>();

    private ErrorCode code;

    private String moreInfo;

    public EidasParerException() {
        // Do nothing
    }

    @Override
    public String getMessage() {
        return message;
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
            messages.forEach(e -> addDetail(e));
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
                + details.stream().map(Object::toString).collect(Collectors.joining(",")) + " - code=" + code
                + " - moreInfo=" + moreInfo;
    }

}
