@Entity
@Table(name = "commission_notes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommissionNotes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "commission_id")
    private int commissionId;

    @Column(name = "note")
    private String note;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

}