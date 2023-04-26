@Entity
@Table(name="commissions")
public class CommissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commissionId;

    private String status;

    private String notes;

    private String details;

    //Getters and setters

}