package org.example.error.ex;

public enum ErrorCode {

    INVALID_ID("올바르지 않은 ID 입니다."),
    FILE_SAVE_FAILED("파일을 저장하지 못했습니다."),
    FILE_LOAD_FAILED("파일을 불러오지 못했습니다."),
    FILE_DELETE_FAILED("파일을 삭제하지 못했습니다.");
    private final String message;

    ErrorCode(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
