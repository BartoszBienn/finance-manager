package outcome;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Outcome {

    @Id
    @GeneratedValue
    @Column(name = "outcome_id")
    private int outcomeId;

    @Column(name = "amount")
    private float amount;

    @Id
    @GeneratedValue
    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "date_added")
    private LocalDate dateAdded;

    @Column(name = "commentary")
    private String commentary;

    public Outcome(int outcomeId, float amount, int categoryId, LocalDate dateAdded, String commentary) {
        this.outcomeId = outcomeId;
        this.amount = amount;
        this.categoryId = categoryId;
        this.dateAdded = dateAdded;
        this.commentary = commentary;
    }

    public int getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(int outcomeId) {
        this.outcomeId = outcomeId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "Outcome{" +
                "outcomeId=" + outcomeId +
                ", amount=" + amount +
                ", categoryId=" + categoryId +
                ", dateAdded=" + dateAdded +
                ", commentary='" + commentary + '\'' +
                '}';
    }
}
