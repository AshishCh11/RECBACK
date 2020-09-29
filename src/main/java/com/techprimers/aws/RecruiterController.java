package com.techprimers.aws;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.aws.dto.CompanyRequest;
import com.techprimers.aws.entity.Company1;
import com.techprimers.aws.entity.Company2;
import com.techprimers.aws.entity.Position;
import com.techprimers.aws.repository.CandidateRepository;
import com.techprimers.aws.repository.CompanyRepository;
import com.techprimers.aws.repository.CompanyRepository1;
import com.techprimers.aws.repository.CompanyRepository2;
import com.techprimers.aws.repository.PositionRepository;
import com.techprimers.aws.repository.PositionRepository1;
import com.techprimers.aws.service.CompanyService;
import com.techprimers.aws.service.CompanyService1;
import com.techprimers.aws.service.CompanyService2;
import com.techprimers.aws.service.PositionService;

@EnableAutoConfiguration
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RequestMapping(value = "/rest/api")
public class RecruiterController {

	// private final static Logger log =
	// LogManager.getLogger(RecruiterController.class);

	@Autowired
	CompanyRepository companyRepository;

	@Autowired
	PositionRepository positionRepository;

	@Autowired
	CandidateRepository candidateRepository;

	@Autowired
	CompanyRepository1 companyRepository1;

	@Autowired
	CompanyRepository2 companyRepository2;

	@Autowired
	CompanyService2 companyService2;

	@Autowired
	PositionRepository1 positionRepository1;

	@Autowired
	CompanyService companyService;

	@Autowired
	PositionService positionService;

	@Autowired
	CompanyService1 companyService1;

//	@Autowired
//    private FileStorageService fileStorageService;

	@GetMapping
	public String hello() {
		return "hello";
	}

//	 @GetMapping("/downloadFile/{fileName:.+}")
//	    public ResponseEntity < Resource > downloadFile(@PathVariable String fileName, HttpServletRequest request) throws Exception {
//	        // Load file as Resource
//	        Resource resource = fileStorageService.loadFileAsResource(fileName);
//
//	        // Try to determine file's content type
//	        String contentType = null;
//	        try {
//	            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
//	        } catch (IOException ex) {
//	           // logger.info("Could not determine file type.");
//	        }
//
//	        // Fallback to the default content type if type could not be determined
//	        if (contentType == null) {
//	            contentType = "application/octet-stream";
//	        }
//
//	        return ResponseEntity.ok()
//	            .contentType(MediaType.parseMediaType(contentType))
//	            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
//	            .body(resource);
//	    }

//	@PostMapping("/addCompany")
//	@CrossOrigin("*")
//	public Company2 addNewCompany(@RequestBody CompanyRequest request) {
//		//log.info("**** Get All Details*****");
//		return companyRepository2.save(request.getCompany2());
//	}

	@RequestMapping(value = "/addCompany")
	public Company2 saveEmployee(@RequestBody Company2 company2) {

		companyService2.saveCompany(company2);
		return company2;

	}

//	@PostMapping("/addAllDetails")
//	@CrossOrigin("*")
//	public Company addCompany(@RequestBody CompanyRequest request) {
//		log.info("**** Get All Details*****");
//		return companyRepository.save(request.getCompany());
//	}

//	@PostMapping("/addNewCompanyWithPositions")
//	@CrossOrigin("*")
//	public Company1 addPositions(@RequestBody CompanyRequest request) {
//		return companyRepository1.save(request.getCompany1());
//	}

	@PostMapping("/addNewCandidatesInPositions")
	@CrossOrigin("*")
	public Position addCandidates(@RequestBody CompanyRequest request) {
		return positionRepository.save(request.getPosition());
	}

	// update with company name and positions
	@PutMapping("/updateCompany")
	@CrossOrigin("*")
	public ResponseEntity<?> updateCompany1(@RequestBody Company1 company1) throws Exception {
		return companyService1.updateCompany1(company1);
	}

	// update with position name and candidates
	@PutMapping("/updatePosition")
	@CrossOrigin("*")
	public ResponseEntity<?> updateposition1(@RequestBody Position position) throws Exception {
		return positionService.updatePosition(position);
	}

//	@GetMapping("/getAllComanyDetails/{id}")
	// @CrossOrigin("*")
//	public Optional<Company> getPositionsWithCandidates(@PathVariable(value = "id") Integer id)
//	{
//		return companyRepository.findById(id);
//	}

//	@GetMapping("/findAllCompanyDetails")
//	 @CrossOrigin("*")
//	public List<Company> findCompanyDetails()
//	{
//		return companyRepository.findAll();
//	}

//	@GetMapping("/getCompanyList")
//	 @CrossOrigin("*")
//	public List<Company1> findCompanyDetails()
//	{
//		return companyRepository1.findAll();
//	}

	@GetMapping("/getCompanyList")
	@CrossOrigin("*")
	public List<Company2> findCompanyDetails() {
		return companyRepository2.getAllCompany();
	}

//	@GetMapping("/getAllPositionsOfCompany/{id}")
//	@CrossOrigin("*")
//	public Optional<Company1> getPositionsWithCandidates(@PathVariable(value = "id") Integer id) {
//		return companyRepository1.findById(id);
//	}

//	@GetMapping("/getAllPositionsOfCompany")
//	@CrossOrigin("*")
//	public List<Position1> getPositionsWithCandidates() {
//		return positionRepository1.findAll();
//	}

	@GetMapping("/getAllPositionsOfCompany/{id}")
	@CrossOrigin("*")
	public Optional<Company1> getPositionsWithCandidates(@PathVariable(value = "id") Integer id) {
		return companyRepository1.findById(id);
	}

	@GetMapping("/getAllCandidatesOfPosition/{positionId}")
	@CrossOrigin("*")
	public Optional<Position> findCandidates(@PathVariable(value = "positionId") Integer positionId) {
		return positionRepository.findById(positionId);
	}

}
