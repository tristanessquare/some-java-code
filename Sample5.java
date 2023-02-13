
@Component
class UserService {
	
	@Autowired
	private UserRepository userRepo;

	List<User> userCache;

	public UserService(){
		init();
	}

	void loadUser(String userId){
	    ...
	}

	void init() {
		List<User> allUsers = userRepo.findAllUsers();
		userCache.addAll(allUsers);
	}

}