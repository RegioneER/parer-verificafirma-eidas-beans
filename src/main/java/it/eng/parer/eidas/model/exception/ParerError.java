package it.eng.parer.eidas.model.exception;

import java.util.List;

/**
 *
 * @author sinatti_s
 */
public interface ParerError {

    /**
     * Ambito dell'eccezione, sostanzialmente uno per <i>service</i> implementato.
     */
    public enum ExceptionType {
        GENERIC, EIDAS_DSS, IO, REQ, NE, VALIDATION
    }

    public enum ErrorCode {

        GENERIC_ERROR("unhandled-exception", ExceptionType.GENERIC), //
        VALIDATION_ERROR("validation-error", ExceptionType.VALIDATION), //
        IO_ERROR("io-exception", ExceptionType.IO), //
        BAD_FILENAME_MULTIPARTFILE_AND_METADATA("bad-name-on-multipartfile-and-metadata", ExceptionType.REQ), //
        EIDAS_ERROR("eidas-exception", ExceptionType.EIDAS_DSS), //
        METADATA_ERROR("metadata-exception", ExceptionType.EIDAS_DSS), //
        NOT_FOUND("not-found", ExceptionType.NE);

        ErrorCode(String urlFriendly, ExceptionType type) {
            this.urlFriendly = urlFriendly;
            this.type = type;
        }

        private String urlFriendly;
        private ExceptionType type;

        /**
         * Restituisce la versione "web friendly" per il codice di errore.
         *
         * @return la string "web friendly" del codice.
         */
        public String urlFriendly() {
            return urlFriendly;
        }

        public ExceptionType exceptionType() {
            return type;
        }

        /**
         * Restituisce l'{@link ErrorCode} corrispondente alla stringa in input.
         *
         * @param urlFriendly
         *            stringa in input del codice "web friendly".
         * 
         * @return transcodifica di {@link ErrorCode} a partire dalla stringa in input
         * 
         * @throws IllegalArgumentException
         *             nel caso in cui la stringa non sia riconosciuta
         */
        public static ErrorCode fromUrlFriendly(String urlFriendly) {
            for (ErrorCode errorCode : values()) {
                if (errorCode.urlFriendly().equals(urlFriendly)) {
                    return errorCode;
                }
            }
            return ErrorCode.NOT_FOUND;
        }
    }

    public String getMessage();

    public List<String> getDetails();

    public ErrorCode getCode();

    public String getMoreInfo();
}
