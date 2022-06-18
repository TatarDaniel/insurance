package com.insurance.app.insurance.claim;

public enum ClaimStatus {
    TO_BE_REVIEWED("To be reviewed"),
    IN_REVIEW("In review"),
    DOCUMENTS_NEEDED("Documents needed"),
    PAID("Paid"),
    DENIED("Denied");


    private final String text;

    ClaimStatus(String text) {
        this.text = text;
    }
}
