public class VotingMachine {
    private int numberVoteYes;
    private int numberVoteNo;
    String problem;
    public void yesVotes(){
        numberVoteYes++;
    }
    public void noVotes(){
        numberVoteNo++;
    }
    public int returnYesCount(){
        return numberVoteYes;
    }
    public int returnNoVotes(){
        return numberVoteNo;
    }
    public void clearMachine(){
        numberVoteYes = 0;
        numberVoteNo = 0;
    }
    public VotingMachine(String problem, int numberVoteYes, int numberVoteNo){
        this.numberVoteYes = numberVoteYes;
        this.numberVoteNo = numberVoteNo;
        this.problem = problem;
    }
    public String toString(){
        return problem + " " + returnYesCount() + " " + returnNoVotes();
    }

    public static void main(String[] args) {
        VotingMachine Votes = new VotingMachine("dumb",20,15);
        System.out.println(Votes);
    }
}
