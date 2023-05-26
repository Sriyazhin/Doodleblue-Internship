SERVICES -

public College modifyCollege(College college) {
		College collegee = crepo.findById(college.getCid()).orElse(null);
		collegee.setCity(college.getCity());
		collegee.setName(college.getName());
		return crepo.save(collegee);
	}
  
public Departments updateDepartment(Departments id) {
		Departments departments = deptrepo.findById(id.getCid()).orElse(id);
		departments.setDept1(id.getDept1());
		departments.setDept2(id.getDept2());
		departments.setDept3(id.getDept3());
		return deptrepo.save(departments);
	}

public void editingCollege(College coll, Departments dept) {
		String collegeUrl = "http://localhost:8080/modifycollege";
		String departmentUrl = "http://localhost:8080/updateDepartment";
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<College> request = new HttpEntity<>(coll, header);
		ResponseEntity<College> response = restTemplate.exchange(collegeUrl, HttpMethod.PUT, request, College.class);
		HttpEntity<Departments> requesttt = new HttpEntity<>(dept, header);
		ResponseEntity<Departments> responseee = restTemplate.exchange(departmentUrl, HttpMethod.PUT, requesttt,
				Departments.class);

	}

FINAL CONTROLLER - 
  
  @PutMapping("/update")
	public void updatedetails(@RequestBody CollegeAndDepartmentRequest request) {
		College colleges = request.getCollege();
		Departments departments = request.getDepartment();
		collservice.editingCollege(colleges, departments);
	}
