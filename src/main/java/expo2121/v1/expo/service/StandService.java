package expo2121.v1.expo.service;

import expo2121.v1.expo.dao.StandRepository;
import expo2121.v1.expo.models.Stand;
import expo2121.v1.expo.models.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StandService {

    private final StandRepository standRepository;

    @Autowired
    public StandService(@Qualifier("postgres") StandRepository standRepository) {
        this.standRepository = standRepository;
    }

    public void addStand(Stand stand){

        standRepository.save(stand);
    }

    public List<Stand> getAll(){

        var listOfStands = new ArrayList<Stand>();

        standRepository.findAll().forEach(listOfStands::add);

        return listOfStands;
    }

    public List<Vote> getAllVotesById(int id){

        return standRepository.findById(id).get().getListOfVotes();

    }

    public Stand getStandByID(int id){
        return standRepository.findById(id).get();
    }

    public void addVoteToStandById(int id, Vote vote){

        var stand = standRepository.findById(id).get();

        stand.addVote(vote);

        standRepository.save(stand);
    }

}
