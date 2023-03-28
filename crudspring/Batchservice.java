package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Batch;
import repository.Batchrepository;

@Service

public class Batchservice {
	
	@Autowired
	private Batchrepository tr;
	
	public List<Batch> saveTeams(List<Batch> t){
		return tr.saveAll(t);
	}

	public Batch saveTeam(Batch t){
		return tr.save(t);
	}
	
	public List<Batch> getTeams(List<Batch> t){
		return tr.findAll();
	}
	
	public Batch getTeamsbyid(int teamno){
		return tr.findById(teamno).orElse(null);
	}
	
	public Batch getTeamsbyname(String name){
		return tr.findByName(name).orElse(null);
	}
	
	public String deleteTeamsbyid(int teamno){
		 tr.deleteById(teamno);
		 return "Team " +teamno+ " removed!!";
	}
	
	public Batch updateTeams(Batch t){
		Batch currentTeam = tr.findById(t.getTeamno()).orElse(null);
		 currentTeam.setName(t.getName());
		 currentTeam.setTropies(t.getTropies());
		 currentTeam.setCaptain(t.getCaptain());
		 return tr.save(currentTeam);
	}
	
}
