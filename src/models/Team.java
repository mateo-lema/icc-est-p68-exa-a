package models;

import java.util.Arrays;

public class Team {
  private String nameTeam;
  private Player[] players;

  
  public Team(String nameTeam, Player[] players) {
    this.nameTeam = nameTeam;
    this.players = players;
  }
  public String getNameTeam() {
    return nameTeam;
  }
  public void setNameTeam(String nameTeam) {
    this.nameTeam = nameTeam;
  }
  public Player[] getPlayers() {
    return players;
  }
  public void setPlayers(Player[] players) {
    this.players = players;
  }
  @Override
  public String toString() {
    return "Team [nameTeam=" + nameTeam + ", players=" + Arrays.toString(players) + "]";
  }
  




}
