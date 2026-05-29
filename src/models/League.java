package models;

import java.util.Arrays;

public class League {
  private String name;
  private Team[] teams;

  public League(String nameLeague, Team[] teams) {
    this.name = nameLeague;
    this.teams = teams;
  }

  public String getName() {
    return name;
  }

  public void setName(String nameLeague) {
    this.name = nameLeague;
  }

  public Team[] getTeams() {
    return teams;
  }

  public void setTeams(Team[] teams) {
    this.teams = teams;
  }

  public int getTotalActiveGoals() {
    int totalActiveGoals = 0;
    for (Team team : teams) {
      for (Player player : team.getPlayers()) {
        if (player.isActive() == true) {
          totalActiveGoals = totalActiveGoals + player.getGoals();

        }

      }
    }
    return totalActiveGoals;
  }

  @Override
  public String toString() {
    return "League [nameLeague=" + name + ", teams=" + Arrays.toString(teams) + ", getTotalActiveGoals()="
        + getTotalActiveGoals() + "]";
  }

  

}
