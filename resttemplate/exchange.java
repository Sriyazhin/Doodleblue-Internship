public Collegeresponse getCollegeById(int id) {
		/*
		 * HttpHeaders headers = new HttpHeaders();
		 * headers.setContentType(MediaType.APPLICATION_JSON); HttpEntity<String>
		 * requestentity = new HttpEntity<>(headers);
		 */
		College col = crepo.findById(id).orElse(null);
		Collegeresponse colresponse = modelMapper.map(col, Collegeresponse.class);
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/finddeptbyId/{id}",
				HttpMethod.GET, null, String.class, id);
		colresponse.setDepartmentResponse(response);
		/*
		 * HttpStatusCode statusCode = response.getStatusCode();
		 * System.out.println(statusCode); HttpHeaders responseHeaders =
		 * response.getHeaders(); System.out.println(responseHeaders); String
		 * responseBody = response.getBody(); System.out.println(responseBody);
		 */
		return colresponse;
	}


CONTROLLER
@GetMapping("/findbyId/{id}")
	public Collegeresponse getCollegeById(@PathVariable("id") int id) {
		Collegeresponse collegeResponse = collservice.getCollegeById(id);
		return collegeResponse;
	}
