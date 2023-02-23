package income;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity
public class Income {

@Id
@GeneratedValue
@Column(name = "icome_id")
    private int incomeId;

@Column(name = "amount")
private float amount;

@Column(name = "date_added")
private LocalDate dateAdded;

@Column(name = "commentary")
private String commentary;

    public Income(int incomeId, float amount, LocalDate dateAdded, String commentary) {
        this.incomeId = incomeId;
        this.amount = amount;
        this.dateAdded = dateAdded;
        this.commentary = commentary;
    }

    public int getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(int incomeId) {
        this.incomeId = incomeId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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
        return "Income{" +
                "incomeId=" + incomeId +
                ", amount=" + amount +
                ", dateAdded=" + dateAdded +
                ", commentary='" + commentary + '\'' +
                '}';
    }
}
