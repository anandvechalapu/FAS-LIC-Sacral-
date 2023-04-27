@Repository
public interface CommissionNotesRepository extends JpaRepository<CommissionNotes, Integer> {
 
    List<CommissionNotes> findByCommissionId(int commissionId);
    List<CommissionNotes> findAllByCommissionId(int commissionId);
    boolean existsByCommissionId(int commissionId);
    Optional<CommissionNotes> findByIdAndCommissionId(int id, int commissionId);
    void deleteByIdAndCommissionId(int id, int commissionId);
    void deleteAllByCommissionId(int commissionId);
}