@Repository
public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {

    Optional<CommissionEntity> findByCommissionId(Long commissionId);

    void updateCommissionStatus(Long commissionId, String status);

    void addCommissionNotes(Long commissionId, String notes);

    void addCommissionQuestionDetails(Long commissionId, String details);

    void handleConstraintViolation(Long commissionId);

    void handlePersistenceException(Long commissionId);

}