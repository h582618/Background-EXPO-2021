package expo2121.v1.expo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Stand {

    @Id
    int id;
    private String name;

    @OneToMany
    List<Vote> listOfVotes;
    double averageVote;

    public Stand(){

    }

    public void addVote(Vote vote){
        listOfVotes.add(vote);
        averageVote =  listOfVotes.stream().mapToDouble(a -> a.getValue()).average().orElseThrow();
    }

    public Stand(int id, String name, List<Vote> listOfVotes, double averageVote) {
        this.id = id;
        this.name = name;
        this.listOfVotes = listOfVotes;
        this.averageVote = averageVote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vote> getListOfVotes() {
        return listOfVotes;
    }

    public void setListOfVotes(List<Vote> listOfVotes) {
        this.listOfVotes = listOfVotes;
    }

    public double getAverageVote() {
        return averageVote;
    }

    public void setAverageVote(double averageVote) {
        this.averageVote = averageVote;
    }


}
