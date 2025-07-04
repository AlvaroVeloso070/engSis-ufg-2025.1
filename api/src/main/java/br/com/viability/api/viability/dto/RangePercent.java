package br.com.viability.api.viability.dto;

public record RangePercent(
        Double lowerLimit,
        Double upperLimit,
        Double percentage
) {
    public boolean isApplicable(Double value) {
        return (this.lowerLimit() == null || value >= this.lowerLimit()) && (this.upperLimit() == null || value <= this.upperLimit());
    }
}
