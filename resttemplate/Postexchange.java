SERVICE -

public void adddCollege(College coll, Departments dept) {
		String collegeUrl = "http://localhost:8080/addcollege";
		String departmentUrl = "http://localhost:8080/addDept";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<College> request = new HttpEntity<>(coll, header);
		ResponseEntity<College> response = restTemplate.exchange(collegeUrl, HttpMethod.POST, request, College.class);
		HttpEntity<Departments> requesttt = new HttpEntity<>(dept, header);
		ResponseEntity<Departments> responseee = restTemplate.exchange(departmentUrl, HttpMethod.POST, requesttt,
				Departments.class);

	}
  
  FINAL CONTROLLER - 
  
  @PostMapping("/create")
	public void addCollege(@RequestBody CollegeAndDepartmentRequest request) {
		College college = request.getCollege();
		Departments department = request.getDepartment();
		collservice.adddCollege(college, department);
	}
