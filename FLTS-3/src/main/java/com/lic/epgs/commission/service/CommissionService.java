@Service
public class CommissionService {

    private CommissionTempRepository commissionTempRepository;
    private CommissionQuestionDetailsTempRepository commissionQuestionDetailsTempRepository;
    private CommissionNotesTempRepository commissionNotesTempRepository;
    private CommissionRepository commissionRepository;
    private CommissionQuestionDetailsRepository commissionQuestionDetailsRepository;
    private CommissionNotesRepository commissionNotesRepository;

    public CommissionService(CommissionTempRepository commissionTempRepository,
                             CommissionQuestionDetailsTempRepository commissionQuestionDetailsTempRepository,
                             CommissionNotesTempRepository commissionNotesTempRepository,
                             CommissionRepository commissionRepository,
                             CommissionQuestionDetailsRepository commissionQuestionDetailsRepository,
                             CommissionNotesRepository commissionNotesRepository) {
        this.commissionTempRepository = commissionTempRepository;
        this.commissionQuestionDetailsTempRepository = commissionQuestionDetailsTempRepository;
        this.commissionNotesTempRepository = commissionNotesTempRepository;
        this.commissionRepository = commissionRepository;
        this.commissionQuestionDetailsRepository = commissionQuestionDetailsRepository;
        this.commissionNotesRepository = commissionNotesRepository;
    }

    public CommissionEntity saveCommission(CommissionEntity commissionEntity) {
        return commissionRepository.save(commissionEntity);
    }

    public CommissionEntity findByCommissionId(Long commissionId) {
        return commissionRepository.findByCommissionId(commissionId);
    }

    public List<CommissionQuestionDetailsEntity> saveAllQuestionDetails(List<CommissionQuestionDetailsEntity> commissionQuestionDetailsEntities) {
        return commissionQuestionDetailsRepository.saveAll(commissionQuestionDetailsEntities);
    }

    public List<CommissionQuestionDetailsEntity> findAllQuestionDetailsByCommissionIdAndIsActive(Long commissionId, boolean isActive) {
        return commissionQuestionDetailsRepository.findAllByCommissionIdAndIsActive(commissionId, isActive);
    }

    public List<CommissionNotesEntity> saveAllNotes(List<CommissionNotesEntity> commissionNotesEntities) {
        return commissionNotesRepository.saveAll(commissionNotesEntities);
    }

    public List<CommissionNotesEntity> findAllNotesByCommissionIdAndIsActive(Long commissionId, boolean isActive) {
        return commissionNotesRepository.findAllByCommissionIdAndIsActive(commissionId, isActive);
    }

    public CommissionTempEntity findTempCommissionByCommissionIdAndIsActive(Long commissionId, boolean isActive) {
        return commissionTempRepository.findByCommissionIdAndIsActive(commissionId, isActive);
    }

    public List<CommissionTempEntity> findAllTempCommissionsByCommissionIdAndIsActive(Long commissionId, boolean isActive) {
        return commissionTempRepository.findAllByCommissionIdAndIsActive(commissionId, isActive);
    }

    public int updateCommissionTempEntity(Long commissionId, String status, String modifiedBy, LocalDateTime modifiedOn, String remarks, boolean isActive) {
        return commissionTempRepository.updateCommissionTempEntity(commissionId, status, modifiedBy, modifiedOn, remarks, isActive);
    }

    public List<CommissionQuestionDetailsTempEntity> findTempQuestionDetailsByCommissionIdAndIsActive(Long commissionId, boolean isActive) {
        return commissionQuestionDetailsTempRepository.findAllByCommissionIdAndIsActive(commissionId, isActive);
    }

    public int updateQuestionDetailsTempEntity(Long commissionId, boolean isActive, Long tempCommissionId) {
        return commissionQuestionDetailsTempRepository.updateCommissionQuestionDetailsTempEntity(commissionId, isActive, tempCommissionId);
    }

    public List<CommissionNotesTempEntity> findTempNotesByCommissionIdAndIsActive(Long commissionId, boolean isActive) {
        return commissionNotesTempRepository.findAllByCommissionIdAndIsActive(commissionId, isActive);
    }

    public int updateNotesTempEntity(Long commissionId, boolean isActive, Long tempCommissionId) {
        return commissionNotesTempRepository.updateCommissionNotesTempEntity(commissionId, isActive, tempCommissionId);
    }

}