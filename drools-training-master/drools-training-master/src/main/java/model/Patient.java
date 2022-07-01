package model;

import java.time.LocalDate;
import java.util.Set;

public class Patient {
    private Set<String> ICD10;
    private String status;
    private LocalDate timeframe;
    private String preFill;
    private String redFlag;

    public Patient(Set<String> ICD10, String status, LocalDate timeframe) {
        this.ICD10 = ICD10;
        this.status = status;
        this.timeframe = timeframe;
    }


    public Set<String> getICD10() {
        return ICD10;
    }

    public void setICD10(Set<String> ICD10) {
        this.ICD10 = ICD10;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(LocalDate timeframe) {
        this.timeframe = timeframe;
    }

    public String getPreFill() {
        return preFill;
    }

    public void setPreFill(String preFill) {
        this.preFill = preFill;
    }

    public String getRedFlag() {
        return redFlag;
    }

    public void setRedFlag(String redFlag) {
        this.redFlag = redFlag;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ICD10=" + ICD10 +
                ", status='" + status + '\'' +
                ", timeframe=" + timeframe +
                ", preFill='" + preFill + '\'' +
                ", redFlag='" + redFlag + '\'' +
                '}';
    }
}
