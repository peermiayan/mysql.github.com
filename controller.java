@RestController
public class ContactController {

    @Autowired
    private ContactRepository repo;

    @PostMapping("/submit")
    public Contact saveContact(@RequestBody Contact contact) {
        return repo.save(contact);
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return repo.findAll();
    }
}