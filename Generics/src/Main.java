public class Main {

    public static void main(String[] args) {
        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Philies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        Team<BaseballPlayer> phillies = new Team<>("Philadelphia Philies");
        Team<BaseballPlayer> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        var guthrie = new BaseballPlayer("D.Guthrie", "Center Fielder");
        phillies.addTeamMembers(guthrie);
        phillies.listTeamMembers();

        phillies.addTeamMembers(harper);
        phillies.addTeamMembers(marsh);
        phillies.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelaide crows");
        Team<FootballPlayer> afc = new Team<FootballPlayer>("Adelaide crows");
        var tex = new FootballPlayer("Tex Walker", "Center Half Forward");
        afc.addTeamMembers(tex);
        var rory = new FootballPlayer("Rory Laird", "MidField");
        afc.addTeamMembers(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMembers(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();


        var canberra = new Team<VolleyballPlayer>("Canberra Heat");
        canberra.addTeamMembers(new VolleyballPlayer("B Black", "opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }


    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}