import java.util.Date;
import java.util.List;

public class Delivrable {
    private String code;
    private String name ;
    private String description ;
    private Date startDate ;
    private Date endDate ;
    private double amount ;
    private Phase phase;
    private List<Document> documents;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    Delivrable addDelivrable(Delivrable delivrable)
    {
        return null ;
    }
    Delivrable updateDelivrable(Delivrable delivrable)
    {
        return null ;
    }
    boolean deleteDelivrable(int id)
    {
        return false ;
    }
}
