package br.com.tinnova.core;

public class Exercise1 {

    private static final Long TOTAL_VOTERS = 1000L;

    public static void main(String[] args) {

        System.out.println("Exercise one ");

        System.out.println("percentage votes valid: " +  getPercentageVotesValid() + "%");
        System.out.println("percentage white votes: " +  getPercentageWhiteVotes() + "%");
        System.out.println("percentage null votes: " +  getPercentageNullVotes() + "%");
    }

    public static Long getPercentageVotesValid() {
        final long validaVotes = 800L;
        return (validaVotes * 100) / TOTAL_VOTERS;
    }

    public static Long getPercentageWhiteVotes(){
        final long whiteVotes = 150L;
        return (whiteVotes * 100) / TOTAL_VOTERS;
    }

    public static Long getPercentageNullVotes(){
        final long nullVote = 50L;
        return (nullVote * 100) / TOTAL_VOTERS;
    }
}
