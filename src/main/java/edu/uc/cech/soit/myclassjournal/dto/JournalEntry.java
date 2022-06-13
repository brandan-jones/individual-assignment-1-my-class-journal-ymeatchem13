package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

public @Data class JournalEntry {

    private String notes = "";
    private String date = "";

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }
}
