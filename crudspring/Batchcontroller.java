package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Batch;
import service.Batchservice;

@RestController
public class Batchcontroller {

	@Autowired
	private Batchservice ts;
	
	@PostMapping("/addTeam")
	public Batch addTeam(@RequestBody Batch t) {
		return ts.saveTeam(t);
	}
		
	@PostMapping("/addTeams")
	public List<Batch> addTeams(@RequestBody List<Batch> t) {
			return ts.saveTeams(t);
	}
	
	@GetMapping("/getTeamsbyid")
	public List<Batch> findAllProducts(List<Batch> t){
		return ts.getTeams(t);
	}
	
	@GetMapping("/getTeamsbyid/{teamno}")
	public Batch getTeamsbyid(@PathVariable int teamno){
		return ts.getTeamsbyid(teamno);
	}
	
	@GetMapping("/getTeamsbyname/{name}")
	public Batch getTeamsbyname(@PathVariable String name){
		return ts.getTeamsbyname(name);
	}
	
	@PutMapping("/updateTeam")
	public Batch updateTeam(@RequestBody Batch t) {
		return ts.saveTeam(t);
	}
	
	@DeleteMapping("/delete/{teamno}")
	public String deleteTeams(@PathVariable int teamno){
		return ts.deleteTeamsbyid(teamno);
	}
}
