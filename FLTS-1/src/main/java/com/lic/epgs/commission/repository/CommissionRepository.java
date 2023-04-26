@Repository
public class CommissionRepository {

    private static final Logger logger = LoggerFactory.getLogger(CommissionRepository.class);

    @Autowired
    private EntityManager entityManager;

    public CommonCommissionDto loadCommissionDetails() {
        CommonCommissionDto commonCommissionDto = new CommonCommissionDto();
        try {
            List<CommissionDetailsDto> commissionDetailsList = new ArrayList<>();
            Query query = entityManager.createQuery("SELECT c FROM CommissionDetailsDto c WHERE c.isActive = false");
            commissionDetailsList = query.getResultList();
            if (commissionDetailsList.size() > 0) {
                commonCommissionDto.setTransactionStatus("SUCCESS");
                commonCommissionDto.setTransactionMessage("ACCEPTED");
            } else {
                commonCommissionDto.setTransactionStatus("WARN");
                commonCommissionDto.setTransactionMessage("DENY");
            }
            commonCommissionDto.setCommissions(commissionDetailsList);
        } catch (ConstraintViolationException e) {
            logger.error("ConstraintViolationException while loading commission details");
            e.printStackTrace();
            commonCommissionDto.setTransactionStatus("ERROR");
            commonCommissionDto.setTransactionMessage("FAIL");
        } catch (PersistenceException e) {
            logger.error("PersistenceException while loading commission details");
            e.printStackTrace();
            commonCommissionDto.setTransactionStatus("ERROR");
            commonCommissionDto.setTransactionMessage("INVALIDREQUEST");
        }
        return commonCommissionDto;
    }

}