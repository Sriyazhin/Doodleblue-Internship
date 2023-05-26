SERVICE - 

public void deletingCollege(int id) {
		String collegeUrl = "http://localhost:8080/Deletecollege/" + id;
		String departmentUrl = "http://localhost:8080/DeleteDepartment/" + id;
		ResponseEntity<String> response = restTemplate.exchange(collegeUrl, HttpMethod.DELETE, null, String.class);
		ResponseEntity<String> responseee = restTemplate.exchange(departmentUrl, HttpMethod.DELETE, null, String.class);

	}
  
  CONTROLLER - 
  @DeleteMapping("/delete/{id}")
	public void deletedetails(@PathVariable("id") int id) {
		collservice.deletingCollege(id);
	}
