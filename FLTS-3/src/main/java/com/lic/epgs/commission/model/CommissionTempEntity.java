//Spring Boot Entity/Model

@Entity
@Table(name = "commission_temp")
public class CommissionTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "commission_id")
    private Long commissionId;

    @Column(name = "status")
    private String status;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_on")
    private LocalDateTime modifiedOn;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_active")
    private boolean isActive;

}

@Entity
@Table(name = "commission_question_details_temp")
public class CommissionQuestionDetailsTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "commission_id")
    private Long commissionId;

    @Column(name = "question")
    private String question;

    @Column(name = "answer")
    private String answer;

    @Column(name = "is_active")
    private boolean isActive;

}

@Entity
@Table(name = "commission_notes_temp")
public class CommissionNotesTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "commission_id")
    private Long commissionId;

    @Column(name = "notes")
    private String notes;

    @Column(name = "is_active")
    private boolean isActive;

}

@Entity
@Table(name = "commission")
public class CommissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "commission_id")
    private Long commissionId;

    @Column(name = "status")
    private String status;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_on")
    private LocalDateTime modifiedOn;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_active")
    private boolean isActive;

}

@Entity
@Table(name = "commission_question_details")
public class CommissionQuestionDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "commission_id")
    private Long commissionId;

    @Column(name = "question")
    private String question;

    @Column(name = "answer")
    private String answer;

    @Column(name = "is_active")
    private boolean isActive;

}

@Entity
@Table(name = "commission_notes")
public class CommissionNotesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "commission_id")
    private Long commissionId;

    @Column(name = "notes")
    private String notes;

    @Column(name = "is_active")
    private boolean isActive;

}