@Repository
public interface CommissionTempRepository extends JpaRepository<CommissionTempEntity, Long> {

    CommissionTempEntity findByCommissionIdAndIsActive(Long commissionId, boolean isActive);

    List<CommissionTempEntity> findAllByCommissionIdAndIsActive(Long commissionId, boolean isActive);

    @Modifying
    @Query("update CommissionTempEntity c set c.status = :status, c.modifiedBy = :modifiedBy, c.modifiedOn = :modifiedOn, c.remarks = :remarks where c.commissionId = :commissionId and c.isActive = :isActive")
    int updateCommissionTempEntity(Long commissionId, String status, String modifiedBy, LocalDateTime modifiedOn, String remarks, boolean isActive);

}

@Repository
public interface CommissionQuestionDetailsTempRepository extends JpaRepository<CommissionQuestionDetailsTempEntity, Long> {

    List<CommissionQuestionDetailsTempEntity> findAllByCommissionIdAndIsActive(Long commissionId, boolean isActive);

    @Modifying
    @Query("update CommissionQuestionDetailsTempEntity c set c.commissionId = :commissionId, c.isActive = :isActive where c.commissionId = :tempCommissionId")
    int updateCommissionQuestionDetailsTempEntity(Long commissionId, boolean isActive, Long tempCommissionId);

}

@Repository
public interface CommissionNotesTempRepository extends JpaRepository<CommissionNotesTempEntity, Long> {

    List<CommissionNotesTempEntity> findAllByCommissionIdAndIsActive(Long commissionId, boolean isActive);

    @Modifying
    @Query("update CommissionNotesTempEntity c set c.commissionId = :commissionId, c.isActive = :isActive where c.commissionId = :tempCommissionId")
    int updateCommissionNotesTempEntity(Long commissionId, boolean isActive, Long tempCommissionId);

}

@Repository
public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {

    CommissionEntity save(CommissionEntity commissionEntity);

    CommissionEntity findByCommissionId(Long commissionId);

}

@Repository
public interface CommissionQuestionDetailsRepository extends JpaRepository<CommissionQuestionDetailsEntity, Long> {

    List<CommissionQuestionDetailsEntity> saveAll(List<CommissionQuestionDetailsEntity> commissionQuestionDetailsEntities);

    List<CommissionQuestionDetailsEntity> findAllByCommissionIdAndIsActive(Long commissionId, boolean isActive);

}

@Repository
public interface CommissionNotesRepository extends JpaRepository<CommissionNotesEntity, Long> {

    List<CommissionNotesEntity> saveAll(List<CommissionNotesEntity> commissionNotesEntities);

    List<CommissionNotesEntity> findAllByCommissionIdAndIsActive(Long commissionId, boolean isActive);

}